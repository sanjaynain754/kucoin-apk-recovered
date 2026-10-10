.class public Lcom/ishumei/smantifraud/l111l11111lIl/l1111l111111Il/l111l11111Il;
.super Ljava/lang/Object;


# static fields
.field private static l1111l111111Il:Ljava/lang/String; = "sm"

.field private static l111l11111lIl:Lcom/ishumei/smantifraud/l111l11111lIl/l1111l111111Il/l111l11111Il;


# instance fields
.field private l111l11111I1l:Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111lI1l$l1111l111111Il;

.field private l111l11111Il:Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111lI1l$l1111l111111Il;

.field private l111l1111l1Il:Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111lI1l$l1111l111111Il;

.field private l111l1111lI1l:Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111lI1l$l1111l111111Il;

.field private l111l1111lIl:Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111lI1l$l1111l111111Il;

.field private l111l1111llIl:Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111lI1l$l1111l111111Il;

.field private l11l1111lIIl:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
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
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method private constructor <init>()V
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
.end method

.method public static l1111l111111Il()Lcom/ishumei/smantifraud/l111l11111lIl/l1111l111111Il/l111l11111Il;
    .locals 2

    .line 1
    sget-object v0, Lcom/ishumei/smantifraud/l111l11111lIl/l1111l111111Il/l111l11111Il;->l111l11111lIl:Lcom/ishumei/smantifraud/l111l11111lIl/l1111l111111Il/l111l11111Il;

    if-nez v0, :cond_1

    const-class v0, Lcom/ishumei/smantifraud/l111l11111lIl/l1111l111111Il/l111l11111Il;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/ishumei/smantifraud/l111l11111lIl/l1111l111111Il/l111l11111Il;->l111l11111lIl:Lcom/ishumei/smantifraud/l111l11111lIl/l1111l111111Il/l111l11111Il;

    if-nez v1, :cond_0

    new-instance v1, Lcom/ishumei/smantifraud/l111l11111lIl/l1111l111111Il/l111l11111Il;

    invoke-direct {v1}, Lcom/ishumei/smantifraud/l111l11111lIl/l1111l111111Il/l111l11111Il;-><init>()V

    sput-object v1, Lcom/ishumei/smantifraud/l111l11111lIl/l1111l111111Il/l111l11111Il;->l111l11111lIl:Lcom/ishumei/smantifraud/l111l11111lIl/l1111l111111Il/l111l11111Il;

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit v0

    goto :goto_2

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    :cond_1
    :goto_2
    sget-object v0, Lcom/ishumei/smantifraud/l111l11111lIl/l1111l111111Il/l111l11111Il;->l111l11111lIl:Lcom/ishumei/smantifraud/l111l11111lIl/l1111l111111Il/l111l11111Il;

    return-object v0
.end method

.method public static l111l11111lIl()Ljava/lang/String;
    .locals 5

    .line 1
    sget-object v0, Lcom/ishumei/smantifraud/l111l11111lIl/l111l1111l1Il;->l111l11111Il:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    const-string v1, "B"

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget-object v1, Lcom/ishumei/smantifraud/l111l11111lIl/l111l1111l1Il;->l111l11111Il:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    invoke-static {}, Lcom/ishumei/smantifraud/l111l11111lIl/l1111l111111Il/l111l11111Il;->l1111l111111Il()Lcom/ishumei/smantifraud/l111l11111lIl/l1111l111111Il/l111l11111Il;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ishumei/smantifraud/l111l11111lIl/l1111l111111Il/l111l11111Il;->l111l11111Il()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_1

    sput-object v0, Lcom/ishumei/smantifraud/l111l11111lIl/l111l1111l1Il;->l111l11111Il:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_1
    invoke-static {}, Lcom/ishumei/smantifraud/l1111l111111Il/l1111l111111Il;->l1111l111111Il()Lcom/ishumei/smantifraud/l1111l111111Il/l1111l111111Il;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ishumei/smantifraud/l1111l111111Il/l1111l111111Il;->l111l11111I1l()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    const-string v2, "D"

    if-nez v1, :cond_2

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_2
    sget-object v0, Lcom/ishumei/smantifraud/SmAntiFraud;->option:Lcom/ishumei/smantifraud/SmAntiFraud$SmOption;

    invoke-virtual {v0}, Lcom/ishumei/smantifraud/SmAntiFraud$SmOption;->l111l1111lI1l()Z

    move-result v0

    invoke-static {}, Lcom/ishumei/smantifraud/l1111l111111Il/l1111l111111Il;->l1111l111111Il()Lcom/ishumei/smantifraud/l1111l111111Il/l1111l111111Il;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ishumei/smantifraud/l1111l111111Il/l1111l111111Il;->l111l11111lIl()Z

    move-result v1

    if-eqz v1, :cond_3

    const-string v0, "DZ2V0RGV2aWNlSWQgZW1wdHk="

    return-object v0

    :cond_3
    :try_start_0
    invoke-static {}, Lcom/ishumei/smantifraud/l1111l111111Il/l1111l111111Il;->l1111l111111Il()Lcom/ishumei/smantifraud/l1111l111111Il/l1111l111111Il;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/ishumei/smantifraud/l1111l111111Il/l1111l111111Il;->l1111l111111Il(I)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_4

    sget-boolean v1, Lcom/ishumei/smantifraud/l111l11111lIl/l111l1111l1Il;->l111l1111l1Il:Z

    if-eqz v1, :cond_4

    const-string v0, "Dc21zZGsgaGFzIGJlZW4gZGVzdHJveWVk"
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object v0

    :catchall_0
    move-exception v0

    invoke-static {}, Lcom/ishumei/smantifraud/l1111l111111Il/l11l1111I1l;->l1111l111111Il()Lcom/ishumei/smantifraud/l1111l111111Il/l11l1111I1l;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/ishumei/smantifraud/l1111l111111Il/l11l1111I1l;->l1111l111111Il(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v0

    :cond_4
    const/4 v1, 0x0

    if-eqz v0, :cond_5

    :try_start_1
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B

    move-result-object v0

    invoke-static {v0}, Lcom/ishumei/smantifraud/l111l1111llIl/l111l1111l1Il;->l1111l111111Il([B)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    return-object v0

    :catchall_1
    move-exception v0

    :try_start_2
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {}, Lcom/ishumei/smantifraud/l1111l111111Il/l11l1111I1l;->l1111l111111Il()Lcom/ishumei/smantifraud/l1111l111111Il/l11l1111I1l;

    move-result-object v4

    invoke-virtual {v4, v0}, Lcom/ishumei/smantifraud/l1111l111111Il/l11l1111I1l;->l1111l111111Il(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B

    move-result-object v0

    invoke-static {v0}, Lcom/ishumei/smantifraud/l111l1111llIl/l111l1111l1Il;->l1111l111111Il([B)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    return-object v0

    :catchall_2
    move-exception v0

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B

    move-result-object v0

    invoke-static {v0, v1}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_5
    :try_start_3
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {}, Lcom/ishumei/smantifraud/l1111l111111Il/l11l1111I1l;->l1111l111111Il()Lcom/ishumei/smantifraud/l1111l111111Il/l11l1111I1l;

    move-result-object v3

    new-instance v4, Ljava/lang/IllegalStateException;

    invoke-direct {v4}, Ljava/lang/IllegalStateException;-><init>()V

    invoke-virtual {v3, v4}, Lcom/ishumei/smantifraud/l1111l111111Il/l11l1111I1l;->l1111l111111Il(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->getBytes()[B

    move-result-object v3

    invoke-static {v3}, Lcom/ishumei/smantifraud/l111l1111llIl/l111l1111l1Il;->l1111l111111Il([B)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    return-object v0

    :catchall_3
    move-exception v0

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B

    move-result-object v0

    invoke-static {v0, v1}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private l111l11111lIl(Ljava/lang/String;)V
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/ishumei/smantifraud/l111l11111lIl/l1111l111111Il/l111l11111Il;->l111l11111I1l:Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111lI1l$l1111l111111Il;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111lI1l$l1111l111111Il;->l111l11111lIl(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method private l11l1111I11l()Ljava/lang/String;
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/ishumei/smantifraud/l111l11111lIl/l1111l111111Il/l111l11111Il;->l11l1111lIIl:Ljava/lang/String;

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 6
    move-result v0

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, Lcom/ishumei/smantifraud/l111l11111lIl/l1111l111111Il/l111l11111Il;->l11l1111lIIl:Ljava/lang/String;

    .line 11
    return-object v0

    .line 12
    .line 13
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    .line 14
    .line 15
    .line 16
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 17
    .line 18
    iget-object v1, p0, Lcom/ishumei/smantifraud/l111l11111lIl/l1111l111111Il/l111l11111Il;->l111l11111I1l:Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111lI1l$l1111l111111Il;

    .line 19
    .line 20
    if-eqz v1, :cond_1

    .line 21
    .line 22
    .line 23
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 24
    .line 25
    :cond_1
    iget-object v1, p0, Lcom/ishumei/smantifraud/l111l11111lIl/l1111l111111Il/l111l11111Il;->l111l1111lI1l:Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111lI1l$l1111l111111Il;

    .line 26
    .line 27
    if-eqz v1, :cond_2

    .line 28
    .line 29
    .line 30
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 31
    .line 32
    :cond_2
    iget-object v1, p0, Lcom/ishumei/smantifraud/l111l11111lIl/l1111l111111Il/l111l11111Il;->l111l1111l1Il:Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111lI1l$l1111l111111Il;

    .line 33
    .line 34
    if-eqz v1, :cond_3

    .line 35
    .line 36
    .line 37
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    :cond_3
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 41
    move-result-object v0

    .line 42
    .line 43
    .line 44
    :cond_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 45
    move-result v1

    .line 46
    .line 47
    if-eqz v1, :cond_5

    .line 48
    .line 49
    .line 50
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 51
    move-result-object v1

    .line 52
    .line 53
    check-cast v1, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111lI1l$l1111l111111Il;

    .line 54
    .line 55
    if-eqz v1, :cond_4

    .line 56
    .line 57
    .line 58
    invoke-interface {v1}, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111lI1l$l1111l111111Il;->l111l11111lIl()Ljava/lang/String;

    .line 59
    move-result-object v1

    .line 60
    .line 61
    .line 62
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 63
    move-result v2

    .line 64
    .line 65
    if-nez v2, :cond_4

    .line 66
    .line 67
    iput-object v1, p0, Lcom/ishumei/smantifraud/l111l11111lIl/l1111l111111Il/l111l11111Il;->l11l1111lIIl:Ljava/lang/String;

    .line 68
    return-object v1

    .line 69
    .line 70
    :cond_5
    const-string v0, ""

    .line 71
    return-object v0
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
.end method


# virtual methods
.method public final l1111l111111Il(Lcom/ishumei/smantifraud/SmAntiFraud$IDeviceIdCallback;Z)V
    .locals 2

    .line 2
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lcom/ishumei/smantifraud/l111l11111lIl/l1111l111111Il/l111l11111Il$1;

    invoke-direct {v1, p0, p2, p1}, Lcom/ishumei/smantifraud/l111l11111lIl/l1111l111111Il/l111l11111Il$1;-><init>(Lcom/ishumei/smantifraud/l111l11111lIl/l1111l111111Il/l111l11111Il;ZLcom/ishumei/smantifraud/SmAntiFraud$IDeviceIdCallback;)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    return-void
.end method

.method public final l1111l111111Il(Ljava/lang/String;)V
    .locals 1

    .line 3
    :try_start_0
    new-instance v0, Lcom/ishumei/smantifraud/l111l11111lIl/l1111l111111Il/l111l1111l1Il;

    invoke-direct {v0, p1}, Lcom/ishumei/smantifraud/l111l11111lIl/l1111l111111Il/l111l1111l1Il;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/ishumei/smantifraud/l111l11111lIl/l1111l111111Il/l111l11111Il;->l111l11111I1l:Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111lI1l$l1111l111111Il;

    new-instance p1, Lcom/ishumei/smantifraud/l111l11111lIl/l1111l111111Il/l111l1111llIl;

    invoke-direct {p1}, Lcom/ishumei/smantifraud/l111l11111lIl/l1111l111111Il/l111l1111llIl;-><init>()V

    iput-object p1, p0, Lcom/ishumei/smantifraud/l111l11111lIl/l1111l111111Il/l111l11111Il;->l111l1111l1Il:Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111lI1l$l1111l111111Il;

    new-instance p1, Lcom/ishumei/smantifraud/l111l11111lIl/l1111l111111Il/l111l1111lI1l;

    invoke-direct {p1}, Lcom/ishumei/smantifraud/l111l11111lIl/l1111l111111Il/l111l1111lI1l;-><init>()V

    iput-object p1, p0, Lcom/ishumei/smantifraud/l111l11111lIl/l1111l111111Il/l111l11111Il;->l111l1111lI1l:Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111lI1l$l1111l111111Il;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    return-void
.end method

.method public final declared-synchronized l1111l111111Il(Ljava/lang/String;Z)V
    .locals 2

    .line 4
    monitor-enter p0

    :try_start_0
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p2, :cond_0

    monitor-exit p0

    return-void

    :cond_0
    :try_start_1
    sput-object p1, Lcom/ishumei/smantifraud/l111l11111lIl/l111l1111l1Il;->l111l11111Il:Ljava/lang/String;

    invoke-static {}, Lcom/ishumei/smantifraud/l111l11111lIl/l1111l111111Il/l111l11111Il;->l1111l111111Il()Lcom/ishumei/smantifraud/l111l11111lIl/l1111l111111Il/l111l11111Il;

    move-result-object p2

    iget-object p2, p2, Lcom/ishumei/smantifraud/l111l11111lIl/l1111l111111Il/l111l11111Il;->l111l11111I1l:Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111lI1l$l1111l111111Il;

    if-eqz p2, :cond_1

    invoke-interface {p2, p1}, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111lI1l$l1111l111111Il;->l111l11111lIl(Ljava/lang/String;)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_1
    :goto_0
    invoke-static {}, Lcom/ishumei/smantifraud/SmAntiFraud;->getServerIdCallback()Lcom/ishumei/smantifraud/SmAntiFraud$IServerSmidCallback;

    move-result-object p2

    if-eqz p2, :cond_2

    invoke-static {}, Lcom/ishumei/smantifraud/SmAntiFraud;->getServerIdCallback()Lcom/ishumei/smantifraud/SmAntiFraud$IServerSmidCallback;

    move-result-object p2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "B"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p2, p1}, Lcom/ishumei/smantifraud/SmAntiFraud$IServerSmidCallback;->onSuccess(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_2
    monitor-exit p0

    return-void

    :goto_1
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method public final l111l11111I1l()Ljava/lang/String;
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/ishumei/smantifraud/l111l11111lIl/l1111l111111Il/l111l11111Il;->l11l1111lIIl:Ljava/lang/String;

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 6
    move-result v0

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, Lcom/ishumei/smantifraud/l111l11111lIl/l1111l111111Il/l111l11111Il;->l11l1111lIIl:Ljava/lang/String;

    .line 11
    return-object v0

    .line 12
    .line 13
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    .line 14
    .line 15
    .line 16
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 17
    .line 18
    iget-object v1, p0, Lcom/ishumei/smantifraud/l111l11111lIl/l1111l111111Il/l111l11111Il;->l111l11111I1l:Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111lI1l$l1111l111111Il;

    .line 19
    .line 20
    if-eqz v1, :cond_1

    .line 21
    .line 22
    .line 23
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 24
    .line 25
    :cond_1
    iget-object v1, p0, Lcom/ishumei/smantifraud/l111l11111lIl/l1111l111111Il/l111l11111Il;->l111l1111lI1l:Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111lI1l$l1111l111111Il;

    .line 26
    .line 27
    if-eqz v1, :cond_2

    .line 28
    .line 29
    .line 30
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 31
    .line 32
    :cond_2
    iget-object v1, p0, Lcom/ishumei/smantifraud/l111l11111lIl/l1111l111111Il/l111l11111Il;->l111l1111l1Il:Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111lI1l$l1111l111111Il;

    .line 33
    .line 34
    if-eqz v1, :cond_3

    .line 35
    .line 36
    .line 37
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    :cond_3
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 41
    move-result-object v0

    .line 42
    .line 43
    .line 44
    :cond_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 45
    move-result v1

    .line 46
    .line 47
    if-eqz v1, :cond_5

    .line 48
    .line 49
    .line 50
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 51
    move-result-object v1

    .line 52
    .line 53
    check-cast v1, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111lI1l$l1111l111111Il;

    .line 54
    .line 55
    if-eqz v1, :cond_4

    .line 56
    .line 57
    .line 58
    invoke-interface {v1}, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111lI1l$l1111l111111Il;->l111l11111lIl()Ljava/lang/String;

    .line 59
    move-result-object v1

    .line 60
    .line 61
    .line 62
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 63
    move-result v2

    .line 64
    .line 65
    if-nez v2, :cond_4

    .line 66
    .line 67
    iput-object v1, p0, Lcom/ishumei/smantifraud/l111l11111lIl/l1111l111111Il/l111l11111Il;->l11l1111lIIl:Ljava/lang/String;

    .line 68
    return-object v1

    .line 69
    .line 70
    :cond_5
    const-string v0, ""

    .line 71
    return-object v0
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
.end method

.method public final declared-synchronized l111l11111Il()Ljava/lang/String;
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    .line 3
    :try_start_0
    iget-object v0, p0, Lcom/ishumei/smantifraud/l111l11111lIl/l1111l111111Il/l111l11111Il;->l111l11111I1l:Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111lI1l$l1111l111111Il;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const-string v0, ""
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 8
    monitor-exit p0

    .line 9
    return-object v0

    .line 10
    :catchall_0
    move-exception v0

    .line 11
    goto :goto_0

    .line 12
    .line 13
    .line 14
    :cond_0
    :try_start_1
    invoke-interface {v0}, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111lI1l$l1111l111111Il;->l111l11111lIl()Ljava/lang/String;

    .line 15
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 16
    monitor-exit p0

    .line 17
    return-object v0

    .line 18
    :goto_0
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 19
    throw v0
    .line 20
    .line 21
    .line 22
.end method

.method public final l111l1111l1Il()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    const-string v0, ""

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
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public final l111l1111lI1l()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    const-string v0, ""

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
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public final l111l1111lIl()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/ishumei/smantifraud/l111l11111lIl/l1111l111111Il/l111l11111Il;->l111l1111lI1l:Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111lI1l$l1111l111111Il;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    const-string v0, ""

    .line 7
    return-object v0

    .line 8
    .line 9
    .line 10
    :cond_0
    invoke-interface {v0}, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111lI1l$l1111l111111Il;->l111l11111lIl()Ljava/lang/String;

    .line 11
    move-result-object v0

    .line 12
    return-object v0
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

.method public final l111l1111llIl()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/ishumei/smantifraud/l111l11111lIl/l1111l111111Il/l111l11111Il;->l111l1111l1Il:Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111lI1l$l1111l111111Il;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    const-string v0, ""

    .line 7
    return-object v0

    .line 8
    .line 9
    .line 10
    :cond_0
    invoke-interface {v0}, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111lI1l$l1111l111111Il;->l111l11111lIl()Ljava/lang/String;

    .line 11
    move-result-object v0

    .line 12
    return-object v0
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

.method public final l11l1111lIIl()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    const-string v0, ""

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
    .line 19
    .line 20
    .line 21
    .line 22
.end method
