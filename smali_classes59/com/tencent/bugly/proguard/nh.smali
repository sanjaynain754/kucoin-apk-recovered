.class public Lcom/tencent/bugly/proguard/nh;
.super Lcom/tencent/bugly/proguard/mh;
.source "BUGLY"


# static fields
.field public static final k:I = 0x4

.field public static l:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "[B>;"
        }
    .end annotation
.end field

.field public static m:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "[B>;>;"
        }
    .end annotation
.end field


# instance fields
.field public i:Lcom/tencent/bugly/proguard/sf;

.field public j:I


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
    .line 2
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
    .line 17
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/tencent/bugly/proguard/mh;-><init>()V

    .line 2
    new-instance v0, Lcom/tencent/bugly/proguard/sf;

    invoke-direct {v0}, Lcom/tencent/bugly/proguard/sf;-><init>()V

    iput-object v0, p0, Lcom/tencent/bugly/proguard/nh;->i:Lcom/tencent/bugly/proguard/sf;

    const/4 v1, 0x0

    .line 3
    iput v1, p0, Lcom/tencent/bugly/proguard/nh;->j:I

    const/4 v1, 0x2

    .line 4
    iput-short v1, v0, Lcom/tencent/bugly/proguard/sf;->q:S

    return-void
.end method

.method public constructor <init>(Z)V
    .locals 2

    .line 5
    invoke-direct {p0}, Lcom/tencent/bugly/proguard/mh;-><init>()V

    .line 6
    new-instance v0, Lcom/tencent/bugly/proguard/sf;

    invoke-direct {v0}, Lcom/tencent/bugly/proguard/sf;-><init>()V

    iput-object v0, p0, Lcom/tencent/bugly/proguard/nh;->i:Lcom/tencent/bugly/proguard/sf;

    const/4 v1, 0x0

    .line 7
    iput v1, p0, Lcom/tencent/bugly/proguard/nh;->j:I

    if-eqz p1, :cond_0

    .line 8
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/nh;->g()V

    return-void

    :cond_0
    const/4 p1, 0x2

    .line 9
    iput-short p1, v0, Lcom/tencent/bugly/proguard/sf;->q:S

    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 0

    .line 29
    iput p1, p0, Lcom/tencent/bugly/proguard/nh;->j:I

    return-void
.end method

.method public a(Lcom/tencent/bugly/proguard/ka;)V
    .locals 1

    .line 27
    iget-object v0, p0, Lcom/tencent/bugly/proguard/nh;->i:Lcom/tencent/bugly/proguard/sf;

    invoke-virtual {v0, p1}, Lcom/tencent/bugly/proguard/sf;->a(Lcom/tencent/bugly/proguard/ka;)V

    return-void
.end method

.method public a(Lcom/tencent/bugly/proguard/la;)V
    .locals 1

    .line 26
    iget-object v0, p0, Lcom/tencent/bugly/proguard/nh;->i:Lcom/tencent/bugly/proguard/sf;

    invoke-virtual {v0, p1}, Lcom/tencent/bugly/proguard/sf;->a(Lcom/tencent/bugly/proguard/la;)V

    return-void
.end method

.method public a(Ljava/lang/StringBuilder;I)V
    .locals 1

    .line 28
    iget-object v0, p0, Lcom/tencent/bugly/proguard/nh;->i:Lcom/tencent/bugly/proguard/sf;

    invoke-virtual {v0, p1, p2}, Lcom/tencent/bugly/proguard/sf;->a(Ljava/lang/StringBuilder;I)V

    return-void
.end method

.method public a([B)V
    .locals 4

    .line 1
    array-length v0, p1

    const/4 v1, 0x4

    if-lt v0, v1, :cond_3

    .line 2
    :try_start_0
    new-instance v0, Lcom/tencent/bugly/proguard/ka;

    invoke-direct {v0, p1, v1}, Lcom/tencent/bugly/proguard/ka;-><init>([BI)V

    .line 3
    iget-object p1, p0, Lcom/tencent/bugly/proguard/sd;->d:Ljava/lang/String;

    .line 4
    iput-object p1, v0, Lcom/tencent/bugly/proguard/ka;->b:Ljava/lang/String;

    .line 5
    invoke-virtual {p0, v0}, Lcom/tencent/bugly/proguard/nh;->a(Lcom/tencent/bugly/proguard/ka;)V

    .line 6
    iget-object p1, p0, Lcom/tencent/bugly/proguard/nh;->i:Lcom/tencent/bugly/proguard/sf;

    iget-short v0, p1, Lcom/tencent/bugly/proguard/sf;->q:S
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v1, 0x3

    const-string v2, ""

    const/4 v3, 0x0

    if-ne v0, v1, :cond_1

    .line 7
    :try_start_1
    new-instance v0, Lcom/tencent/bugly/proguard/ka;

    iget-object p1, p1, Lcom/tencent/bugly/proguard/sf;->w:[B

    invoke-direct {v0, p1}, Lcom/tencent/bugly/proguard/ka;-><init>([B)V

    .line 8
    iget-object p1, p0, Lcom/tencent/bugly/proguard/sd;->d:Ljava/lang/String;

    .line 9
    iput-object p1, v0, Lcom/tencent/bugly/proguard/ka;->b:Ljava/lang/String;

    .line 10
    sget-object p1, Lcom/tencent/bugly/proguard/nh;->l:Ljava/util/HashMap;

    if-nez p1, :cond_0

    .line 11
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    sput-object p1, Lcom/tencent/bugly/proguard/nh;->l:Ljava/util/HashMap;

    .line 12
    new-array v1, v3, [B

    invoke-virtual {p1, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :catch_0
    move-exception p1

    goto :goto_1

    .line 13
    :cond_0
    :goto_0
    sget-object p1, Lcom/tencent/bugly/proguard/nh;->l:Ljava/util/HashMap;

    invoke-virtual {v0, p1, v3, v3}, Lcom/tencent/bugly/proguard/ka;->a(Ljava/util/Map;IZ)Ljava/util/HashMap;

    move-result-object p1

    iput-object p1, p0, Lcom/tencent/bugly/proguard/mh;->f:Ljava/util/HashMap;

    return-void

    .line 14
    :cond_1
    new-instance v0, Lcom/tencent/bugly/proguard/ka;

    iget-object p1, p1, Lcom/tencent/bugly/proguard/sf;->w:[B

    invoke-direct {v0, p1}, Lcom/tencent/bugly/proguard/ka;-><init>([B)V

    .line 15
    iget-object p1, p0, Lcom/tencent/bugly/proguard/sd;->d:Ljava/lang/String;

    .line 16
    iput-object p1, v0, Lcom/tencent/bugly/proguard/ka;->b:Ljava/lang/String;

    .line 17
    sget-object p1, Lcom/tencent/bugly/proguard/nh;->m:Ljava/util/HashMap;

    if-nez p1, :cond_2

    .line 18
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    sput-object p1, Lcom/tencent/bugly/proguard/nh;->m:Ljava/util/HashMap;

    .line 19
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 20
    new-array v1, v3, [B

    invoke-virtual {p1, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    sget-object v1, Lcom/tencent/bugly/proguard/nh;->m:Ljava/util/HashMap;

    invoke-virtual {v1, v2, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    :cond_2
    sget-object p1, Lcom/tencent/bugly/proguard/nh;->m:Ljava/util/HashMap;

    invoke-virtual {v0, p1, v3, v3}, Lcom/tencent/bugly/proguard/ka;->a(Ljava/util/Map;IZ)Ljava/util/HashMap;

    move-result-object p1

    iput-object p1, p0, Lcom/tencent/bugly/proguard/sd;->a:Ljava/util/HashMap;

    .line 23
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lcom/tencent/bugly/proguard/sd;->b:Ljava/util/HashMap;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    return-void

    .line 24
    :goto_1
    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v0

    .line 25
    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "decode package must include size head"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public b(I)V
    .locals 1

    .line 49
    iget-object v0, p0, Lcom/tencent/bugly/proguard/nh;->i:Lcom/tencent/bugly/proguard/sf;

    iput p1, v0, Lcom/tencent/bugly/proguard/sf;->t:I

    return-void
.end method

.method public b(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            "TT;)V"
        }
    .end annotation

    .line 1
    const-string v0, "."

    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    invoke-super {p0, p1, p2}, Lcom/tencent/bugly/proguard/mh;->b(Ljava/lang/String;Ljava/lang/Object;)V

    return-void

    .line 3
    :cond_0
    new-instance p2, Ljava/lang/IllegalArgumentException;

    const-string/jumbo v0, "put name can not startwith . , now is "

    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public b([B)V
    .locals 4

    .line 32
    const-string v0, ""

    array-length v1, p1

    const/4 v2, 0x4

    if-lt v1, v2, :cond_1

    .line 33
    :try_start_0
    new-instance v1, Lcom/tencent/bugly/proguard/ka;

    invoke-direct {v1, p1, v2}, Lcom/tencent/bugly/proguard/ka;-><init>([BI)V

    .line 34
    iget-object p1, p0, Lcom/tencent/bugly/proguard/sd;->d:Ljava/lang/String;

    .line 35
    iput-object p1, v1, Lcom/tencent/bugly/proguard/ka;->b:Ljava/lang/String;

    .line 36
    invoke-virtual {p0, v1}, Lcom/tencent/bugly/proguard/nh;->a(Lcom/tencent/bugly/proguard/ka;)V

    .line 37
    new-instance p1, Lcom/tencent/bugly/proguard/ka;

    iget-object v1, p0, Lcom/tencent/bugly/proguard/nh;->i:Lcom/tencent/bugly/proguard/sf;

    iget-object v1, v1, Lcom/tencent/bugly/proguard/sf;->w:[B

    invoke-direct {p1, v1}, Lcom/tencent/bugly/proguard/ka;-><init>([B)V

    .line 38
    iget-object v1, p0, Lcom/tencent/bugly/proguard/sd;->d:Ljava/lang/String;

    .line 39
    iput-object v1, p1, Lcom/tencent/bugly/proguard/ka;->b:Ljava/lang/String;

    .line 40
    sget-object v1, Lcom/tencent/bugly/proguard/nh;->m:Ljava/util/HashMap;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    .line 41
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    sput-object v1, Lcom/tencent/bugly/proguard/nh;->m:Ljava/util/HashMap;

    .line 42
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 43
    new-array v3, v2, [B

    invoke-virtual {v1, v0, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    sget-object v3, Lcom/tencent/bugly/proguard/nh;->m:Ljava/util/HashMap;

    invoke-virtual {v3, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :catch_0
    move-exception p1

    goto :goto_1

    .line 45
    :cond_0
    :goto_0
    sget-object v0, Lcom/tencent/bugly/proguard/nh;->m:Ljava/util/HashMap;

    invoke-virtual {p1, v0, v2, v2}, Lcom/tencent/bugly/proguard/ka;->a(Ljava/util/Map;IZ)Ljava/util/HashMap;

    move-result-object p1

    iput-object p1, p0, Lcom/tencent/bugly/proguard/sd;->a:Ljava/util/HashMap;

    .line 46
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lcom/tencent/bugly/proguard/sd;->b:Ljava/util/HashMap;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    .line 47
    :goto_1
    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v0

    .line 48
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "decode package must include size head"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public b()[B
    .locals 4

    .line 4
    iget-object v0, p0, Lcom/tencent/bugly/proguard/nh;->i:Lcom/tencent/bugly/proguard/sf;

    iget-short v1, v0, Lcom/tencent/bugly/proguard/sf;->q:S

    const-string v2, ""

    const/4 v3, 0x2

    if-ne v1, v3, :cond_2

    .line 5
    iget-object v0, v0, Lcom/tencent/bugly/proguard/sf;->u:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 6
    iget-object v0, p0, Lcom/tencent/bugly/proguard/nh;->i:Lcom/tencent/bugly/proguard/sf;

    iget-object v0, v0, Lcom/tencent/bugly/proguard/sf;->v:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 7
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "funcName can not is null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 8
    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string/jumbo v1, "servantName can not is null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 9
    :cond_2
    iget-object v1, v0, Lcom/tencent/bugly/proguard/sf;->u:Ljava/lang/String;

    if-nez v1, :cond_3

    .line 10
    iput-object v2, v0, Lcom/tencent/bugly/proguard/sf;->u:Ljava/lang/String;

    .line 11
    :cond_3
    iget-object v1, v0, Lcom/tencent/bugly/proguard/sf;->v:Ljava/lang/String;

    if-nez v1, :cond_4

    .line 12
    iput-object v2, v0, Lcom/tencent/bugly/proguard/sf;->v:Ljava/lang/String;

    .line 13
    :cond_4
    :goto_0
    new-instance v0, Lcom/tencent/bugly/proguard/la;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/tencent/bugly/proguard/la;-><init>(I)V

    .line 14
    iget-object v2, p0, Lcom/tencent/bugly/proguard/sd;->d:Ljava/lang/String;

    .line 15
    iput-object v2, v0, Lcom/tencent/bugly/proguard/la;->b:Ljava/lang/String;

    .line 16
    iget-object v2, p0, Lcom/tencent/bugly/proguard/nh;->i:Lcom/tencent/bugly/proguard/sf;

    iget-short v2, v2, Lcom/tencent/bugly/proguard/sf;->q:S

    if-ne v2, v3, :cond_5

    .line 17
    iget-object v2, p0, Lcom/tencent/bugly/proguard/sd;->a:Ljava/util/HashMap;

    invoke-virtual {v0, v2, v1}, Lcom/tencent/bugly/proguard/la;->a(Ljava/util/Map;I)V

    goto :goto_1

    .line 18
    :cond_5
    iget-object v2, p0, Lcom/tencent/bugly/proguard/mh;->f:Ljava/util/HashMap;

    invoke-virtual {v0, v2, v1}, Lcom/tencent/bugly/proguard/la;->a(Ljava/util/Map;I)V

    .line 19
    :goto_1
    iget-object v2, p0, Lcom/tencent/bugly/proguard/nh;->i:Lcom/tencent/bugly/proguard/sf;

    .line 20
    iget-object v0, v0, Lcom/tencent/bugly/proguard/la;->a:Ljava/nio/ByteBuffer;

    .line 21
    invoke-static {v0}, Lcom/tencent/bugly/proguard/ma;->b(Ljava/nio/ByteBuffer;)[B

    move-result-object v0

    iput-object v0, v2, Lcom/tencent/bugly/proguard/sf;->w:[B

    .line 22
    new-instance v0, Lcom/tencent/bugly/proguard/la;

    invoke-direct {v0, v1}, Lcom/tencent/bugly/proguard/la;-><init>(I)V

    .line 23
    iget-object v1, p0, Lcom/tencent/bugly/proguard/sd;->d:Ljava/lang/String;

    .line 24
    iput-object v1, v0, Lcom/tencent/bugly/proguard/la;->b:Ljava/lang/String;

    .line 25
    invoke-virtual {p0, v0}, Lcom/tencent/bugly/proguard/nh;->a(Lcom/tencent/bugly/proguard/la;)V

    .line 26
    iget-object v0, v0, Lcom/tencent/bugly/proguard/la;->a:Ljava/nio/ByteBuffer;

    .line 27
    invoke-static {v0}, Lcom/tencent/bugly/proguard/ma;->b(Ljava/nio/ByteBuffer;)[B

    move-result-object v0

    .line 28
    array-length v1, v0

    add-int/lit8 v1, v1, 0x4

    .line 29
    invoke-static {v1}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v2

    .line 30
    invoke-virtual {v2, v1}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    .line 31
    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v0

    return-object v0
.end method

.method public c([B)V
    .locals 4

    .line 1
    array-length v0, p1

    .line 2
    const/4 v1, 0x4

    .line 3
    .line 4
    if-lt v0, v1, :cond_1

    .line 5
    .line 6
    :try_start_0
    new-instance v0, Lcom/tencent/bugly/proguard/ka;

    .line 7
    .line 8
    .line 9
    invoke-direct {v0, p1, v1}, Lcom/tencent/bugly/proguard/ka;-><init>([BI)V

    .line 10
    .line 11
    iget-object p1, p0, Lcom/tencent/bugly/proguard/sd;->d:Ljava/lang/String;

    .line 12
    .line 13
    iput-object p1, v0, Lcom/tencent/bugly/proguard/ka;->b:Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, v0}, Lcom/tencent/bugly/proguard/nh;->a(Lcom/tencent/bugly/proguard/ka;)V

    .line 17
    .line 18
    new-instance p1, Lcom/tencent/bugly/proguard/ka;

    .line 19
    .line 20
    iget-object v0, p0, Lcom/tencent/bugly/proguard/nh;->i:Lcom/tencent/bugly/proguard/sf;

    .line 21
    .line 22
    iget-object v0, v0, Lcom/tencent/bugly/proguard/sf;->w:[B

    .line 23
    .line 24
    .line 25
    invoke-direct {p1, v0}, Lcom/tencent/bugly/proguard/ka;-><init>([B)V

    .line 26
    .line 27
    iget-object v0, p0, Lcom/tencent/bugly/proguard/sd;->d:Ljava/lang/String;

    .line 28
    .line 29
    iput-object v0, p1, Lcom/tencent/bugly/proguard/ka;->b:Ljava/lang/String;

    .line 30
    .line 31
    sget-object v0, Lcom/tencent/bugly/proguard/nh;->l:Ljava/util/HashMap;

    .line 32
    const/4 v1, 0x0

    .line 33
    .line 34
    if-nez v0, :cond_0

    .line 35
    .line 36
    new-instance v0, Ljava/util/HashMap;

    .line 37
    .line 38
    .line 39
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 40
    .line 41
    sput-object v0, Lcom/tencent/bugly/proguard/nh;->l:Ljava/util/HashMap;

    .line 42
    .line 43
    const-string v2, ""

    .line 44
    .line 45
    new-array v3, v1, [B

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    goto :goto_0

    .line 50
    :catch_0
    move-exception p1

    .line 51
    goto :goto_1

    .line 52
    .line 53
    :cond_0
    :goto_0
    sget-object v0, Lcom/tencent/bugly/proguard/nh;->l:Ljava/util/HashMap;

    .line 54
    .line 55
    .line 56
    invoke-virtual {p1, v0, v1, v1}, Lcom/tencent/bugly/proguard/ka;->a(Ljava/util/Map;IZ)Ljava/util/HashMap;

    .line 57
    move-result-object p1

    .line 58
    .line 59
    iput-object p1, p0, Lcom/tencent/bugly/proguard/mh;->f:Ljava/util/HashMap;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 60
    return-void

    .line 61
    .line 62
    :goto_1
    new-instance v0, Ljava/lang/RuntimeException;

    .line 63
    .line 64
    .line 65
    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 66
    throw v0

    .line 67
    .line 68
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 69
    .line 70
    const-string v0, "decode package must include size head"

    .line 71
    .line 72
    .line 73
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 74
    throw p1
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
.end method

.method public g()V
    .locals 2

    .line 1
    invoke-super {p0}, Lcom/tencent/bugly/proguard/mh;->g()V

    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/proguard/nh;->i:Lcom/tencent/bugly/proguard/sf;

    const/4 v1, 0x3

    iput-short v1, v0, Lcom/tencent/bugly/proguard/sf;->q:S

    return-void
.end method

.method public g(Ljava/lang/String;)V
    .locals 1

    .line 3
    iget-object v0, p0, Lcom/tencent/bugly/proguard/nh;->i:Lcom/tencent/bugly/proguard/sf;

    iput-object p1, v0, Lcom/tencent/bugly/proguard/sf;->v:Ljava/lang/String;

    return-void
.end method

.method public h(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tencent/bugly/proguard/nh;->i:Lcom/tencent/bugly/proguard/sf;

    iput-object p1, v0, Lcom/tencent/bugly/proguard/sf;->u:Ljava/lang/String;

    return-void
.end method

.method public h()[B
    .locals 4

    .line 2
    new-instance v0, Lcom/tencent/bugly/proguard/la;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/tencent/bugly/proguard/la;-><init>(I)V

    .line 3
    iget-object v2, p0, Lcom/tencent/bugly/proguard/sd;->d:Ljava/lang/String;

    .line 4
    iput-object v2, v0, Lcom/tencent/bugly/proguard/la;->b:Ljava/lang/String;

    .line 5
    iget-object v2, p0, Lcom/tencent/bugly/proguard/sd;->a:Ljava/util/HashMap;

    invoke-virtual {v0, v2, v1}, Lcom/tencent/bugly/proguard/la;->a(Ljava/util/Map;I)V

    .line 6
    iget-object v0, v0, Lcom/tencent/bugly/proguard/la;->a:Ljava/nio/ByteBuffer;

    .line 7
    invoke-static {v0}, Lcom/tencent/bugly/proguard/ma;->b(Ljava/nio/ByteBuffer;)[B

    move-result-object v0

    .line 8
    new-instance v2, Lcom/tencent/bugly/proguard/la;

    invoke-direct {v2, v1}, Lcom/tencent/bugly/proguard/la;-><init>(I)V

    .line 9
    iget-object v1, p0, Lcom/tencent/bugly/proguard/sd;->d:Ljava/lang/String;

    .line 10
    iput-object v1, v2, Lcom/tencent/bugly/proguard/la;->b:Ljava/lang/String;

    .line 11
    iget-object v1, p0, Lcom/tencent/bugly/proguard/nh;->i:Lcom/tencent/bugly/proguard/sf;

    iget-short v1, v1, Lcom/tencent/bugly/proguard/sf;->q:S

    const/4 v3, 0x1

    invoke-virtual {v2, v1, v3}, Lcom/tencent/bugly/proguard/la;->a(SI)V

    .line 12
    iget-object v1, p0, Lcom/tencent/bugly/proguard/nh;->i:Lcom/tencent/bugly/proguard/sf;

    iget-byte v1, v1, Lcom/tencent/bugly/proguard/sf;->r:B

    const/4 v3, 0x2

    invoke-virtual {v2, v1, v3}, Lcom/tencent/bugly/proguard/la;->a(BI)V

    .line 13
    iget-object v1, p0, Lcom/tencent/bugly/proguard/nh;->i:Lcom/tencent/bugly/proguard/sf;

    iget v1, v1, Lcom/tencent/bugly/proguard/sf;->t:I

    const/4 v3, 0x3

    invoke-virtual {v2, v1, v3}, Lcom/tencent/bugly/proguard/la;->a(II)V

    .line 14
    iget-object v1, p0, Lcom/tencent/bugly/proguard/nh;->i:Lcom/tencent/bugly/proguard/sf;

    iget v1, v1, Lcom/tencent/bugly/proguard/sf;->s:I

    const/4 v3, 0x4

    invoke-virtual {v2, v1, v3}, Lcom/tencent/bugly/proguard/la;->a(II)V

    .line 15
    iget v1, p0, Lcom/tencent/bugly/proguard/nh;->j:I

    const/4 v3, 0x5

    invoke-virtual {v2, v1, v3}, Lcom/tencent/bugly/proguard/la;->a(II)V

    const/4 v1, 0x6

    .line 16
    invoke-virtual {v2, v0, v1}, Lcom/tencent/bugly/proguard/la;->a([BI)V

    .line 17
    iget-object v0, p0, Lcom/tencent/bugly/proguard/nh;->i:Lcom/tencent/bugly/proguard/sf;

    iget-object v0, v0, Lcom/tencent/bugly/proguard/sf;->z:Ljava/util/Map;

    const/4 v1, 0x7

    invoke-virtual {v2, v0, v1}, Lcom/tencent/bugly/proguard/la;->a(Ljava/util/Map;I)V

    .line 18
    iget-object v0, v2, Lcom/tencent/bugly/proguard/la;->a:Ljava/nio/ByteBuffer;

    .line 19
    invoke-static {v0}, Lcom/tencent/bugly/proguard/ma;->b(Ljava/nio/ByteBuffer;)[B

    move-result-object v0

    return-object v0
.end method

.method public i()Lcom/tencent/bugly/proguard/nh;
    .locals 3

    .line 1
    .line 2
    new-instance v0, Lcom/tencent/bugly/proguard/nh;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/tencent/bugly/proguard/nh;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/nh;->l()I

    .line 9
    move-result v1

    .line 10
    .line 11
    iget-object v2, v0, Lcom/tencent/bugly/proguard/nh;->i:Lcom/tencent/bugly/proguard/sf;

    .line 12
    .line 13
    iput v1, v2, Lcom/tencent/bugly/proguard/sf;->t:I

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/nh;->m()Ljava/lang/String;

    .line 17
    move-result-object v1

    .line 18
    .line 19
    iget-object v2, v0, Lcom/tencent/bugly/proguard/nh;->i:Lcom/tencent/bugly/proguard/sf;

    .line 20
    .line 21
    iput-object v1, v2, Lcom/tencent/bugly/proguard/sf;->u:Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/nh;->j()Ljava/lang/String;

    .line 25
    move-result-object v1

    .line 26
    .line 27
    iget-object v2, v0, Lcom/tencent/bugly/proguard/nh;->i:Lcom/tencent/bugly/proguard/sf;

    .line 28
    .line 29
    iput-object v1, v2, Lcom/tencent/bugly/proguard/sf;->v:Ljava/lang/String;

    .line 30
    .line 31
    iget-object v1, p0, Lcom/tencent/bugly/proguard/sd;->d:Ljava/lang/String;

    .line 32
    .line 33
    iput-object v1, v0, Lcom/tencent/bugly/proguard/sd;->d:Ljava/lang/String;

    .line 34
    return-object v0
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
.end method

.method public j()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/proguard/nh;->i:Lcom/tencent/bugly/proguard/sf;

    .line 3
    .line 4
    iget-object v0, v0, Lcom/tencent/bugly/proguard/sf;->v:Ljava/lang/String;

    .line 5
    return-object v0
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
.end method

.method public k()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/tencent/bugly/proguard/nh;->j:I

    .line 3
    return v0
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
.end method

.method public l()I
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/proguard/nh;->i:Lcom/tencent/bugly/proguard/sf;

    .line 3
    .line 4
    iget v0, v0, Lcom/tencent/bugly/proguard/sf;->t:I

    .line 5
    return v0
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
.end method

.method public m()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/proguard/nh;->i:Lcom/tencent/bugly/proguard/sf;

    .line 3
    .line 4
    iget-object v0, v0, Lcom/tencent/bugly/proguard/sf;->u:Ljava/lang/String;

    .line 5
    return-object v0
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
.end method
