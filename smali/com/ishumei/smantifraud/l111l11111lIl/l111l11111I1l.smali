.class public final Lcom/ishumei/smantifraud/l111l11111lIl/l111l11111I1l;
.super Ljava/lang/Object;


# static fields
.field private static final l1111l111111Il:Ljava/lang/String; = "seq"

.field private static l111l11111lIl:Lcom/ishumei/smantifraud/l111l11111lIl/l111l11111I1l;


# instance fields
.field private l111l11111I1l:I

.field private l111l11111Il:Landroid/content/SharedPreferences;


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
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    const/4 v0, 0x0

    .line 5
    .line 6
    iput v0, p0, Lcom/ishumei/smantifraud/l111l11111lIl/l111l11111I1l;->l111l11111I1l:I

    .line 7
    .line 8
    .line 9
    invoke-static {}, Lcom/ishumei/smantifraud/l111l11111lIl/l111l1111l1Il;->l1111l111111Il()Landroid/content/Context;

    .line 10
    move-result-object v1

    .line 11
    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    .line 15
    const-string/jumbo v2, "seq"

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1, v2, v0}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 19
    move-result-object v0

    .line 20
    .line 21
    iput-object v0, p0, Lcom/ishumei/smantifraud/l111l11111lIl/l111l11111I1l;->l111l11111Il:Landroid/content/SharedPreferences;

    .line 22
    :cond_0
    return-void
.end method

.method public static declared-synchronized l1111l111111Il()Lcom/ishumei/smantifraud/l111l11111lIl/l111l11111I1l;
    .locals 2

    .line 2
    const-class v0, Lcom/ishumei/smantifraud/l111l11111lIl/l111l11111I1l;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/ishumei/smantifraud/l111l11111lIl/l111l11111I1l;->l111l11111lIl:Lcom/ishumei/smantifraud/l111l11111lIl/l111l11111I1l;

    if-nez v1, :cond_0

    new-instance v1, Lcom/ishumei/smantifraud/l111l11111lIl/l111l11111I1l;

    invoke-direct {v1}, Lcom/ishumei/smantifraud/l111l11111lIl/l111l11111I1l;-><init>()V

    sput-object v1, Lcom/ishumei/smantifraud/l111l11111lIl/l111l11111I1l;->l111l11111lIl:Lcom/ishumei/smantifraud/l111l11111lIl/l111l11111I1l;

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    :goto_0
    sget-object v1, Lcom/ishumei/smantifraud/l111l11111lIl/l111l11111I1l;->l111l11111lIl:Lcom/ishumei/smantifraud/l111l11111lIl/l111l11111I1l;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object v1

    :goto_1
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method private l111l11111I1l()Ljava/lang/String;
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    :try_start_0
    iget-object v1, p0, Lcom/ishumei/smantifraud/l111l11111lIl/l111l11111I1l;->l111l11111Il:Landroid/content/SharedPreferences;

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    return-object v0

    .line 7
    .line 8
    .line 9
    :cond_0
    const-string/jumbo v2, "seq"

    .line 10
    .line 11
    .line 12
    invoke-interface {v1, v2, v0}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 13
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 14
    :catch_0
    return-object v0
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method private l111l11111lIl(Ljava/lang/String;)V
    .locals 2

    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/ishumei/smantifraud/l111l11111lIl/l111l11111I1l;->l111l11111Il:Landroid/content/SharedPreferences;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string/jumbo v1, "seq"

    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :goto_0
    return-void
.end method


# virtual methods
.method public final l1111l111111Il(Ljava/lang/String;)I
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/ishumei/smantifraud/l111l11111lIl/l111l11111I1l;->l111l11111Il:Landroid/content/SharedPreferences;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    invoke-interface {v0, p1, v1}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result p1

    return p1
.end method

.method public final l1111l111111Il(Ljava/lang/String;I)V
    .locals 1

    .line 3
    iget-object v0, p0, Lcom/ishumei/smantifraud/l111l11111lIl/l111l11111I1l;->l111l11111Il:Landroid/content/SharedPreferences;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    :try_start_0
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    :goto_0
    return-void
.end method

.method public final declared-synchronized l111l11111lIl()Ljava/lang/String;
    .locals 3

    .line 1
    monitor-enter p0

    :try_start_0
    iget v0, p0, Lcom/ishumei/smantifraud/l111l11111lIl/l111l11111I1l;->l111l11111I1l:I

    if-nez v0, :cond_0

    invoke-direct {p0}, Lcom/ishumei/smantifraud/l111l11111lIl/l111l11111I1l;->l111l11111I1l()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/ishumei/smantifraud/l111l1111llIl/l111l11111I1l;->l1111l111111Il(Ljava/lang/String;)Z

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v1, :cond_0

    :try_start_1
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/ishumei/smantifraud/l111l11111lIl/l111l11111I1l;->l111l11111I1l:I
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_2

    :catch_0
    :cond_0
    :goto_0
    :try_start_2
    iget v0, p0, Lcom/ishumei/smantifraud/l111l11111lIl/l111l11111I1l;->l111l11111I1l:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/ishumei/smantifraud/l111l11111lIl/l111l11111I1l;->l111l11111I1l:I

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget v1, p0, Lcom/ishumei/smantifraud/l111l11111lIl/l111l11111I1l;->l111l11111I1l:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    iget-object v1, p0, Lcom/ishumei/smantifraud/l111l11111lIl/l111l11111I1l;->l111l11111Il:Landroid/content/SharedPreferences;

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    const-string/jumbo v2, "seq"

    invoke-interface {v1, v2, v0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->apply()V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :catch_1
    :goto_1
    :try_start_4
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget v1, p0, Lcom/ishumei/smantifraud/l111l11111lIl/l111l11111I1l;->l111l11111I1l:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    monitor-exit p0

    return-object v0

    :goto_2
    :try_start_5
    monitor-exit p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    throw v0
.end method
