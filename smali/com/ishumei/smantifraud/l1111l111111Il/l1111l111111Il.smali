.class public Lcom/ishumei/smantifraud/l1111l111111Il/l1111l111111Il;
.super Ljava/lang/Object;


# static fields
.field private static l1111l111111Il:I = 0x1

.field private static final l111l11111I1l:Ljava/lang/String; = "Smlog"

.field private static final l111l11111Il:Ljava/lang/String; = "network"

.field private static l111l11111lIl:I = 0x2

.field private static final l111l1111l1Il:Ljava/lang/String; = "ssid"

.field private static final l111l1111lI1l:Ljava/lang/String; = "wifiip"

.field private static final l111l1111lIl:Ljava/lang/String; = "adid"

.field private static final l111l1111llIl:Ljava/lang/String; = "bssid"

.field private static l111l11IlIlIl:J = 0x0L

.field private static final l11l1111I11l:Ljava/lang/String; = "ainfo"

.field private static final l11l1111I1l:Ljava/lang/String; = "props_sn"

.field private static final l11l1111I1ll:Ljava/lang/String; = "simCountryISO"

.field private static final l11l1111Il:Ljava/lang/String; = "networkCountryIso"

.field private static final l11l1111Il1l:Ljava/lang/String; = "sensorsData"

.field private static final l11l1111Ill:Ljava/lang/String; = "oaid"

.field private static final l11l1111lIIl:Ljava/lang/String; = "sensor"

.field private static final l11l111l11Il:Ljava/lang/String; = "locationCls"

.field private static l11l111l1I1l:Ljava/lang/StringBuilder; = null

.field private static l11l111l1lll:Lcom/ishumei/smantifraud/l1111l111111Il/l1111l111111Il; = null

.field private static final l11l11IlIIll:Ljava/lang/String; = "launcherInfo"


# instance fields
.field private l11l111l1Il:Ljava/lang/String;

.field private l11l111ll11l:Z

.field private l11l111ll1Il:J


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
.end method

.method public static l1111l111111Il()Lcom/ishumei/smantifraud/l1111l111111Il/l1111l111111Il;
    .locals 2

    .line 1
    sget-object v0, Lcom/ishumei/smantifraud/l1111l111111Il/l1111l111111Il;->l11l111l1lll:Lcom/ishumei/smantifraud/l1111l111111Il/l1111l111111Il;

    if-nez v0, :cond_1

    const-class v0, Lcom/ishumei/smantifraud/l1111l111111Il/l1111l111111Il;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/ishumei/smantifraud/l1111l111111Il/l1111l111111Il;->l11l111l1lll:Lcom/ishumei/smantifraud/l1111l111111Il/l1111l111111Il;

    if-nez v1, :cond_0

    new-instance v1, Lcom/ishumei/smantifraud/l1111l111111Il/l1111l111111Il;

    invoke-direct {v1}, Lcom/ishumei/smantifraud/l1111l111111Il/l1111l111111Il;-><init>()V

    sput-object v1, Lcom/ishumei/smantifraud/l1111l111111Il/l1111l111111Il;->l11l111l1lll:Lcom/ishumei/smantifraud/l1111l111111Il/l1111l111111Il;

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
    sget-object v0, Lcom/ishumei/smantifraud/l1111l111111Il/l1111l111111Il;->l11l111l1lll:Lcom/ishumei/smantifraud/l1111l111111Il/l1111l111111Il;

    return-object v0
.end method

.method private static l111l11111Il()V
    .locals 2

    .line 1
    .line 2
    const-class v0, Lcom/ishumei/smantifraud/l1111l111111Il/l111l11111I1l;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 6
    move-result-object v0

    .line 7
    array-length v0, v0

    .line 8
    .line 9
    const/16 v1, 0x5e

    .line 10
    .line 11
    if-ge v0, v1, :cond_0

    .line 12
    .line 13
    const-string v0, "Smlog"

    .line 14
    .line 15
    const-string v1, "missing core fields, check proguard file"

    .line 16
    .line 17
    .line 18
    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 19
    :cond_0
    return-void
    .line 20
    .line 21
    .line 22
.end method

.method private static l111l11111lIl(I)Ljava/lang/String;
    .locals 4

    .line 1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    sget-wide v2, Lcom/ishumei/smantifraud/l1111l111111Il/l1111l111111Il;->l111l11IlIlIl:J

    sub-long/2addr v0, v2

    const-wide/16 v2, 0x14

    cmp-long v2, v0, v2

    if-lez v2, :cond_0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p0, ":"

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p0, ";"

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    :cond_0
    const-string p0, ""

    :goto_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    sput-wide v0, Lcom/ishumei/smantifraud/l1111l111111Il/l1111l111111Il;->l111l11IlIlIl:J

    return-object p0
.end method


# virtual methods
.method public final declared-synchronized l1111l111111Il(I)Ljava/lang/String;
    .locals 20

    .line 2
    move-object/from16 v1, p0

    monitor-enter p0

    :try_start_0
    sget-boolean v0, Lcom/ishumei/smantifraud/l111l11111lIl/l111l1111l1Il;->l111l1111l1Il:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    monitor-exit p0

    return-object v2

    :cond_0
    :try_start_1
    iget-object v0, v1, Lcom/ishumei/smantifraud/l1111l111111Il/l1111l111111Il;->l11l111l1Il:Ljava/lang/String;

    if-eqz v0, :cond_1

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    iget-wide v5, v1, Lcom/ishumei/smantifraud/l1111l111111Il/l1111l111111Il;->l11l111ll1Il:J
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    sub-long/2addr v3, v5

    const-wide/16 v5, 0x3e8

    cmp-long v0, v3, v5

    if-gez v0, :cond_1

    :try_start_2
    new-instance v0, Ljava/lang/String;

    iget-object v3, v1, Lcom/ishumei/smantifraud/l1111l111111Il/l1111l111111Il;->l11l111l1Il:Ljava/lang/String;

    invoke-static {v3}, Lcom/ishumei/smantifraud/l111l1111llIl/l111l1111l1Il;->l111l11111Il(Ljava/lang/String;)[B

    move-result-object v3

    invoke-direct {v0, v3}, Ljava/lang/String;-><init>([B)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    goto/16 :goto_f

    :catch_0
    :cond_1
    :try_start_3
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    sput-wide v3, Lcom/ishumei/smantifraud/l1111l111111Il/l1111l111111Il;->l111l11IlIlIl:J

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sput-object v0, Lcom/ishumei/smantifraud/l1111l111111Il/l1111l111111Il;->l11l111l1I1l:Ljava/lang/StringBuilder;

    new-instance v3, Lcom/ishumei/smantifraud/l1111l111111Il/l111l11111I1l;

    invoke-direct {v3}, Lcom/ishumei/smantifraud/l1111l111111Il/l111l11111I1l;-><init>()V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    sget-object v0, Lcom/ishumei/smantifraud/l111l11111lIl/l111l1111l1Il;->l111l11111lIl:Ljava/lang/String;

    invoke-virtual {v3, v0}, Lcom/ishumei/smantifraud/l1111l111111Il/l111l11111I1l;->l11l1111I1l(Ljava/lang/String;)V

    invoke-static {}, Lcom/ishumei/smantifraud/l1111l111111Il/l111l1111l1Il;->l1111l111111Il()Lcom/ishumei/smantifraud/l1111l111111Il/l111l1111l1Il;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ishumei/smantifraud/l1111l111111Il/l111l1111l1Il;->l111l11111lIl()Lcom/ishumei/smantifraud/l1111l111111Il/l111l11111Il;

    move-result-object v6

    sget-object v7, Lcom/ishumei/smantifraud/SmAntiFraud;->option:Lcom/ishumei/smantifraud/SmAntiFraud$SmOption;

    invoke-virtual {v7}, Lcom/ishumei/smantifraud/SmAntiFraud$SmOption;->l11l1111Il1l()Ljava/util/Set;

    move-result-object v0

    if-nez v0, :cond_2

    sget-object v0, Ljava/util/Collections;->EMPTY_SET:Ljava/util/Set;

    :cond_2
    sget-object v8, Lcom/ishumei/smantifraud/l1111l111111Il/l1111l111111Il;->l11l111l1I1l:Ljava/lang/StringBuilder;

    const/4 v9, 0x1

    invoke-static {v9}, Lcom/ishumei/smantifraud/l1111l111111Il/l1111l111111Il;->l111l11111lIl(I)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v8, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    const/4 v8, 0x0

    :try_start_4
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v10

    sget-object v12, Lcom/ishumei/smantifraud/l111l11111lIl/l111l1111l1Il;->l1111l111111Il:Landroid/content/Context;

    invoke-static {v12}, Lcom/ishumei/smantifraud/l111l11111I1l/l111l1111lI1l;->l1111l111111Il(Landroid/content/Context;)V

    sget-object v12, Lcom/ishumei/smantifraud/l1111l111111Il/l1111l111111Il;->l11l111l1I1l:Ljava/lang/StringBuilder;

    const/4 v13, 0x2

    invoke-static {v13}, Lcom/ishumei/smantifraud/l1111l111111Il/l1111l111111Il;->l111l11111lIl(I)Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v12, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-class v12, Lcom/ishumei/smantifraud/l1111l111111Il/l111l11111I1l;

    invoke-virtual {v12}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    move-result-object v12

    array-length v12, v12

    const/16 v14, 0x5e

    if-ge v12, v14, :cond_3

    const-string v12, "Smlog"

    const-string v14, "missing core fields, check proguard file"

    invoke-static {v12, v14}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    :catchall_1
    move-exception v0

    goto/16 :goto_a

    :cond_3
    :goto_0
    sget-object v12, Lcom/ishumei/smantifraud/l1111l111111Il/l1111l111111Il;->l11l111l1I1l:Ljava/lang/StringBuilder;

    const/4 v14, 0x3

    invoke-static {v14}, Lcom/ishumei/smantifraud/l1111l111111Il/l1111l111111Il;->l111l11111lIl(I)Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v12, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Lcom/ishumei/smantifraud/l1111l111111Il/l111l11111I1l;->l1111l111111Il(Ljava/util/Set;)V

    sget-object v12, Lcom/ishumei/smantifraud/l1111l111111Il/l1111l111111Il;->l11l111l1I1l:Ljava/lang/StringBuilder;

    const/4 v14, 0x4

    invoke-static {v14}, Lcom/ishumei/smantifraud/l1111l111111Il/l1111l111111Il;->l111l11111lIl(I)Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v12, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Lcom/ishumei/smantifraud/SmAntiFraud$SmOption;->l1111l111111Il()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v3, v12}, Lcom/ishumei/smantifraud/l1111l111111Il/l111l11111I1l;->l11l1111lIIl(Ljava/lang/String;)V

    sget-object v12, Lcom/ishumei/smantifraud/l1111l111111Il/l1111l111111Il;->l11l111l1I1l:Ljava/lang/StringBuilder;

    const/4 v14, 0x5

    invoke-static {v14}, Lcom/ishumei/smantifraud/l1111l111111Il/l1111l111111Il;->l111l11111lIl(I)Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v12, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Lcom/ishumei/smantifraud/l111l11111I1l/l1111l111111Il;->l11l1111Il1l()Ljava/util/List;

    move-result-object v12

    invoke-interface {v12}, Ljava/util/List;->isEmpty()Z

    move-result v15

    if-nez v15, :cond_4

    invoke-virtual {v3, v12}, Lcom/ishumei/smantifraud/l1111l111111Il/l111l11111I1l;->l111l11111I1l(Ljava/util/List;)V

    :cond_4
    sget-object v12, Lcom/ishumei/smantifraud/l1111l111111Il/l1111l111111Il;->l11l111l1I1l:Ljava/lang/StringBuilder;

    const/4 v15, 0x6

    invoke-static {v15}, Lcom/ishumei/smantifraud/l1111l111111Il/l1111l111111Il;->l111l11111lIl(I)Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v12, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-nez v6, :cond_5

    move-object v12, v2

    goto :goto_1

    :cond_5
    invoke-virtual {v6}, Lcom/ishumei/smantifraud/l1111l111111Il/l111l11111Il;->l111l11111lIl()Ljava/util/Set;

    move-result-object v12

    :goto_1
    const-string v15, "all"

    invoke-virtual {v3, v15}, Lcom/ishumei/smantifraud/l1111l111111Il/l111l11111I1l;->l11l1111I1ll(Ljava/lang/String;)V

    invoke-virtual {v7}, Lcom/ishumei/smantifraud/SmAntiFraud$SmOption;->l11l1111I11l()Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v3, v15}, Lcom/ishumei/smantifraud/l1111l111111Il/l111l11111I1l;->l111l11111Il(Ljava/lang/String;)V

    sget-object v15, Lcom/ishumei/smantifraud/l1111l111111Il/l1111l111111Il;->l11l111l1I1l:Ljava/lang/StringBuilder;

    const/16 v16, 0x7

    move/from16 v17, v13

    invoke-static/range {v16 .. v16}, Lcom/ishumei/smantifraud/l1111l111111Il/l1111l111111Il;->l111l11111lIl(I)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v15, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Lcom/ishumei/smantifraud/l111l11111lIl/l1111l111111Il/l111l11111Il;->l1111l111111Il()Lcom/ishumei/smantifraud/l111l11111lIl/l1111l111111Il/l111l11111Il;

    move-result-object v13

    invoke-virtual {v13}, Lcom/ishumei/smantifraud/l111l11111lIl/l1111l111111Il/l111l11111Il;->l111l11111Il()Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v3, v15}, Lcom/ishumei/smantifraud/l1111l111111Il/l111l11111I1l;->l111l1111l1Il(Ljava/lang/String;)V

    const-string v15, ""

    invoke-virtual {v3, v15}, Lcom/ishumei/smantifraud/l1111l111111Il/l111l11111I1l;->l111l1111llIl(Ljava/lang/String;)V

    invoke-virtual {v13}, Lcom/ishumei/smantifraud/l111l11111lIl/l1111l111111Il/l111l11111Il;->l111l1111llIl()Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v3, v15}, Lcom/ishumei/smantifraud/l1111l111111Il/l111l11111I1l;->l11l11l11lIl(Ljava/lang/String;)V

    const-string v15, ""

    invoke-virtual {v3, v15}, Lcom/ishumei/smantifraud/l1111l111111Il/l111l11111I1l;->l11l11l11I1l(Ljava/lang/String;)V

    sget-object v15, Lcom/ishumei/smantifraud/l1111l111111Il/l1111l111111Il;->l11l111l1I1l:Ljava/lang/StringBuilder;

    const/16 v16, 0x8

    invoke-static/range {v16 .. v16}, Lcom/ishumei/smantifraud/l1111l111111Il/l1111l111111Il;->l111l11111lIl(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v15, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13}, Lcom/ishumei/smantifraud/l111l11111lIl/l1111l111111Il/l111l11111Il;->l111l1111lIl()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Lcom/ishumei/smantifraud/l1111l111111Il/l111l11111I1l;->l11IIIlIll(Ljava/lang/String;)V

    const-string v2, ""

    invoke-virtual {v3, v2}, Lcom/ishumei/smantifraud/l1111l111111Il/l111l11111I1l;->l11l11l111Il(Ljava/lang/String;)V

    sget-object v2, Lcom/ishumei/smantifraud/l1111l111111Il/l1111l111111Il;->l11l111l1I1l:Ljava/lang/StringBuilder;

    const/16 v15, 0x9

    invoke-static {v15}, Lcom/ishumei/smantifraud/l1111l111111Il/l1111l111111Il;->l111l11111lIl(I)Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v2, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13}, Lcom/ishumei/smantifraud/l111l11111lIl/l1111l111111Il/l111l11111Il;->l111l11111I1l()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Lcom/ishumei/smantifraud/l1111l111111Il/l111l11111I1l;->l11l1111Il(Ljava/lang/String;)V

    sget-object v2, Lcom/ishumei/smantifraud/l1111l111111Il/l1111l111111Il;->l11l111l1I1l:Ljava/lang/StringBuilder;

    const/16 v13, 0xa

    invoke-static {v13}, Lcom/ishumei/smantifraud/l1111l111111Il/l1111l111111Il;->l111l11111lIl(I)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v2, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Lcom/ishumei/smantifraud/l111l11111I1l/l1111l111111Il;->l11l1111I1l()Ljava/util/List;

    move-result-object v2

    invoke-virtual {v3, v2}, Lcom/ishumei/smantifraud/l1111l111111Il/l111l11111I1l;->l1111l111111Il(Ljava/util/List;)V

    sget-object v2, Lcom/ishumei/smantifraud/l1111l111111Il/l1111l111111Il;->l11l111l1I1l:Ljava/lang/StringBuilder;

    const/16 v13, 0xb

    invoke-static {v13}, Lcom/ishumei/smantifraud/l1111l111111Il/l1111l111111Il;->l111l11111lIl(I)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v2, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Lcom/ishumei/smantifraud/l111l11111lIl/l111l11111I1l;->l1111l111111Il()Lcom/ishumei/smantifraud/l111l11111lIl/l111l11111I1l;

    move-result-object v2

    invoke-virtual {v2}, Lcom/ishumei/smantifraud/l111l11111lIl/l111l11111I1l;->l111l11111lIl()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Lcom/ishumei/smantifraud/l1111l111111Il/l111l11111I1l;->l11l1111Il1l(Ljava/lang/String;)V

    sget-object v2, Lcom/ishumei/smantifraud/l1111l111111Il/l1111l111111Il;->l11l111l1I1l:Ljava/lang/StringBuilder;

    const/16 v13, 0xc

    invoke-static {v13}, Lcom/ishumei/smantifraud/l1111l111111Il/l1111l111111Il;->l111l11111lIl(I)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v2, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Lcom/ishumei/smantifraud/SmAntiFraud$SmOption;->l11l1111I1l()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Lcom/ishumei/smantifraud/l1111l111111Il/l111l11111I1l;->l11l1111Ill(Ljava/lang/String;)V

    sget-object v2, Lcom/ishumei/smantifraud/l1111l111111Il/l1111l111111Il;->l11l111l1I1l:Ljava/lang/StringBuilder;

    const/16 v13, 0xd

    invoke-static {v13}, Lcom/ishumei/smantifraud/l1111l111111Il/l1111l111111Il;->l111l11111lIl(I)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v2, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "android"

    invoke-virtual {v3, v2}, Lcom/ishumei/smantifraud/l1111l111111Il/l111l11111I1l;->l11l11IlIIll(Ljava/lang/String;)V

    sget-object v2, Lcom/ishumei/smantifraud/l1111l111111Il/l1111l111111Il;->l11l111l1I1l:Ljava/lang/StringBuilder;

    const/16 v13, 0xe

    invoke-static {v13}, Lcom/ishumei/smantifraud/l1111l111111Il/l1111l111111Il;->l111l11111lIl(I)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v2, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "3.7.3"

    invoke-virtual {v3, v2}, Lcom/ishumei/smantifraud/l1111l111111Il/l111l11111I1l;->l11l111l11Il(Ljava/lang/String;)V

    sget-object v2, Lcom/ishumei/smantifraud/l1111l111111Il/l1111l111111Il;->l11l111l1I1l:Ljava/lang/StringBuilder;

    const/16 v13, 0xf

    invoke-static {v13}, Lcom/ishumei/smantifraud/l1111l111111Il/l1111l111111Il;->l111l11111lIl(I)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v2, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "hy_timeh"

    invoke-virtual {v3, v2}, Lcom/ishumei/smantifraud/l1111l111111Il/l111l11111I1l;->l11l11l1lI1l(Ljava/lang/String;)V

    sget-object v2, Lcom/ishumei/smantifraud/l1111l111111Il/l1111l111111Il;->l11l111l1I1l:Ljava/lang/StringBuilder;

    const/16 v13, 0x10

    invoke-static {v13}, Lcom/ishumei/smantifraud/l1111l111111Il/l1111l111111Il;->l111l11111lIl(I)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v2, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v15

    invoke-static/range {v15 .. v16}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v3, v2}, Lcom/ishumei/smantifraud/l1111l111111Il/l111l11111I1l;->l1111l111111Il(Ljava/lang/Long;)V

    sget-object v2, Lcom/ishumei/smantifraud/l1111l111111Il/l1111l111111Il;->l11l111l1I1l:Ljava/lang/StringBuilder;

    const/16 v13, 0x11

    invoke-static {v13}, Lcom/ishumei/smantifraud/l1111l111111Il/l1111l111111Il;->l111l11111lIl(I)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v2, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v2, Lcom/ishumei/smantifraud/l111l11111lIl/l111l1111l1Il;->l1111l111111Il:Landroid/content/Context;

    if-nez v2, :cond_6

    move v2, v8

    goto :goto_2

    :cond_6
    invoke-virtual {v2}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v2

    iget v2, v2, Landroid/content/pm/ApplicationInfo;->targetSdkVersion:I

    :goto_2
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v3, v2}, Lcom/ishumei/smantifraud/l1111l111111Il/l111l11111I1l;->l1111l111111Il(Ljava/lang/Integer;)V

    sget-object v2, Lcom/ishumei/smantifraud/l1111l111111Il/l1111l111111Il;->l11l111l1I1l:Ljava/lang/StringBuilder;

    const/16 v13, 0x12

    invoke-static {v13}, Lcom/ishumei/smantifraud/l1111l111111Il/l1111l111111Il;->l111l11111lIl(I)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v2, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v2, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    invoke-virtual {v3, v2}, Lcom/ishumei/smantifraud/l1111l111111Il/l111l11111I1l;->l11l111l1lll(Ljava/lang/String;)V

    invoke-virtual {v7}, Lcom/ishumei/smantifraud/SmAntiFraud$SmOption;->l11l1111Ill()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Lcom/ishumei/smantifraud/l1111l111111Il/l111l11111I1l;->l111l11IlIlIl(Ljava/lang/String;)V

    new-instance v2, Lcom/ishumei/smantifraud/l111l11111I1l/l11l1111lIIl;

    invoke-direct {v2}, Lcom/ishumei/smantifraud/l111l11111I1l/l11l1111lIIl;-><init>()V

    sget-object v13, Lcom/ishumei/smantifraud/l111l11111lIl/l111l1111l1Il;->l1111l111111Il:Landroid/content/Context;

    invoke-virtual {v2, v13, v8}, Lcom/ishumei/smantifraud/l111l11111I1l/l11l1111lIIl;->l1111l111111Il(Landroid/content/Context;Z)Z

    move-result v13

    if-eqz v13, :cond_7

    invoke-virtual {v2}, Lcom/ishumei/smantifraud/l111l11111I1l/l11l1111lIIl;->l1111l111111Il()I

    move-result v13

    invoke-virtual {v3, v13}, Lcom/ishumei/smantifraud/l1111l111111Il/l111l11111I1l;->l11l1111I1l(I)V

    invoke-virtual {v2}, Lcom/ishumei/smantifraud/l111l11111I1l/l11l1111lIIl;->l111l11111lIl()Ljava/util/List;

    move-result-object v2

    invoke-virtual {v3, v2}, Lcom/ishumei/smantifraud/l1111l111111Il/l111l11111I1l;->l111l1111llIl(Ljava/util/List;)V

    :cond_7
    if-eqz v12, :cond_8

    const-string v2, "ainfo"

    invoke-interface {v12, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_8

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lcom/ishumei/smantifraud/l111l11111I1l/l1111l111111Il;->l111l11111lIl()Z

    move-result v13

    invoke-virtual {v2, v13}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Lcom/ishumei/smantifraud/l1111l111111Il/l111l11111I1l;->l11l111l1I1l(Ljava/lang/String;)V

    :cond_8
    sget-object v2, Lcom/ishumei/smantifraud/l1111l111111Il/l1111l111111Il;->l11l111l1I1l:Ljava/lang/StringBuilder;

    const/16 v13, 0x13

    invoke-static {v13}, Lcom/ishumei/smantifraud/l1111l111111Il/l1111l111111Il;->l111l11111lIl(I)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v2, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-instance v2, Lcom/ishumei/smantifraud/l111l11111I1l/l11l1111Il;

    invoke-direct {v2}, Lcom/ishumei/smantifraud/l111l11111I1l/l11l1111Il;-><init>()V

    sget-object v13, Lcom/ishumei/smantifraud/l1111l111111Il/l1111l111111Il;->l11l111l1I1l:Ljava/lang/StringBuilder;

    const/16 v15, 0x14

    invoke-static {v15}, Lcom/ishumei/smantifraud/l1111l111111Il/l1111l111111Il;->l111l11111lIl(I)Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v13, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v13, Lcom/ishumei/smantifraud/l1111l111111Il/l1111l111111Il;->l11l111l1I1l:Ljava/lang/StringBuilder;

    const/16 v15, 0x15

    invoke-static {v15}, Lcom/ishumei/smantifraud/l1111l111111Il/l1111l111111Il;->l111l11111lIl(I)Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v13, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-instance v13, Lcom/ishumei/smantifraud/l111l11111I1l/l111l1111lIl;

    invoke-direct {v13}, Lcom/ishumei/smantifraud/l111l11111I1l/l111l1111lIl;-><init>()V

    if-eqz v12, :cond_a

    const-string v15, "bssid"

    invoke-interface {v12, v15}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_a

    const-string v15, "bssid"

    invoke-interface {v0, v15}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v15

    if-nez v15, :cond_a

    and-int/lit8 v15, p1, 0x1

    if-ne v15, v9, :cond_9

    invoke-virtual {v13}, Lcom/ishumei/smantifraud/l111l11111I1l/l111l1111lIl;->l111l11111Il()Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Lcom/ishumei/smantifraud/l111l1111llIl/l111l1111l1Il;->l111l11111I1l(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v15

    :goto_3
    invoke-virtual {v3, v15}, Lcom/ishumei/smantifraud/l1111l111111Il/l111l11111I1l;->l11l111l1Il(Ljava/lang/String;)V

    goto :goto_4

    :cond_9
    invoke-virtual {v13}, Lcom/ishumei/smantifraud/l111l11111I1l/l111l1111lIl;->l111l11111Il()Ljava/lang/String;

    move-result-object v15

    goto :goto_3

    :cond_a
    :goto_4
    sget-object v15, Lcom/ishumei/smantifraud/l1111l111111Il/l1111l111111Il;->l11l111l1I1l:Ljava/lang/StringBuilder;

    const/16 v16, 0x16

    invoke-static/range {v16 .. v16}, Lcom/ishumei/smantifraud/l1111l111111Il/l1111l111111Il;->l111l11111lIl(I)Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v15, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-eqz v12, :cond_b

    const-string/jumbo v14, "ssid"

    invoke-interface {v12, v14}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_b

    const-string/jumbo v12, "ssid"

    invoke-interface {v0, v12}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_b

    invoke-virtual {v13}, Lcom/ishumei/smantifraud/l111l11111I1l/l111l1111lIl;->l111l11111I1l()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v3, v12}, Lcom/ishumei/smantifraud/l1111l111111Il/l111l11111I1l;->l11l111lll(Ljava/lang/String;)V

    :cond_b
    sget-object v12, Lcom/ishumei/smantifraud/l1111l111111Il/l1111l111111Il;->l11l111l1I1l:Ljava/lang/StringBuilder;

    const/16 v14, 0x17

    invoke-static {v14}, Lcom/ishumei/smantifraud/l1111l111111Il/l1111l111111Il;->l111l11111lIl(I)Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v12, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string/jumbo v12, "wifiip"

    invoke-interface {v0, v12}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_c

    invoke-virtual {v13}, Lcom/ishumei/smantifraud/l111l11111I1l/l111l1111lIl;->l111l1111l1Il()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v3, v12}, Lcom/ishumei/smantifraud/l1111l111111Il/l111l11111I1l;->l11l111lllIl(Ljava/lang/String;)V

    :cond_c
    sget-object v12, Lcom/ishumei/smantifraud/l1111l111111Il/l1111l111111Il;->l11l111l1I1l:Ljava/lang/StringBuilder;

    const/16 v14, 0x18

    invoke-static {v14}, Lcom/ishumei/smantifraud/l1111l111111Il/l1111l111111Il;->l111l11111lIl(I)Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v12, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v12, "network"

    invoke-interface {v0, v12}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_d

    invoke-virtual {v13}, Lcom/ishumei/smantifraud/l111l11111I1l/l111l1111lIl;->l111l1111llIl()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v3, v12}, Lcom/ishumei/smantifraud/l1111l111111Il/l111l11111I1l;->l111l111lIlll(Ljava/lang/String;)V

    :cond_d
    sget-object v12, Lcom/ishumei/smantifraud/l1111l111111Il/l1111l111111Il;->l11l111l1I1l:Ljava/lang/StringBuilder;

    const/16 v13, 0x19

    invoke-static {v13}, Lcom/ishumei/smantifraud/l1111l111111Il/l1111l111111Il;->l111l11111lIl(I)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v12, "props_sn"

    invoke-interface {v0, v12}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    invoke-static {}, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111lIl;->l111l11111I1l()Ljava/util/HashMap;

    move-result-object v12

    invoke-virtual {v3, v12}, Lcom/ishumei/smantifraud/l1111l111111Il/l111l11111I1l;->l1111l111111Il(Ljava/util/Map;)V

    sget-object v12, Lcom/ishumei/smantifraud/l1111l111111Il/l1111l111111Il;->l11l111l1I1l:Ljava/lang/StringBuilder;

    const/16 v13, 0x1a

    invoke-static {v13}, Lcom/ishumei/smantifraud/l1111l111111Il/l1111l111111Il;->l111l11111lIl(I)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v12, "adid"

    invoke-interface {v0, v12}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_f

    and-int/lit8 v12, p1, 0x1

    if-ne v12, v9, :cond_e

    invoke-static {}, Lcom/ishumei/smantifraud/l111l11111I1l/l11l1111I1l;->l1111l111111Il()Ljava/lang/String;

    move-result-object v12

    invoke-static {v12}, Lcom/ishumei/smantifraud/l111l1111llIl/l111l1111l1Il;->l111l11111I1l(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    :goto_5
    invoke-virtual {v3, v12}, Lcom/ishumei/smantifraud/l1111l111111Il/l111l11111I1l;->l11l111ll11l(Ljava/lang/String;)V

    goto :goto_6

    :cond_e
    invoke-static {}, Lcom/ishumei/smantifraud/l111l11111I1l/l11l1111I1l;->l1111l111111Il()Ljava/lang/String;

    move-result-object v12

    goto :goto_5

    :cond_f
    :goto_6
    sget-object v12, Lcom/ishumei/smantifraud/l1111l111111Il/l1111l111111Il;->l11l111l1I1l:Ljava/lang/StringBuilder;

    const/16 v13, 0x1b

    invoke-static {v13}, Lcom/ishumei/smantifraud/l1111l111111Il/l1111l111111Il;->l111l11111lIl(I)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Landroid/os/Build;->getRadioVersion()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v3, v12}, Lcom/ishumei/smantifraud/l1111l111111Il/l111l11111I1l;->l11l111ll1Il(Ljava/lang/String;)V

    sget-object v12, Lcom/ishumei/smantifraud/l1111l111111Il/l1111l111111Il;->l11l111l1I1l:Ljava/lang/StringBuilder;

    const/16 v13, 0x1c

    invoke-static {v13}, Lcom/ishumei/smantifraud/l1111l111111Il/l1111l111111Il;->l111l11111lIl(I)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Lcom/ishumei/smantifraud/l111l11111I1l/l1111l111111Il;->l111l1111lI1l()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v3, v12}, Lcom/ishumei/smantifraud/l1111l111111Il/l111l11111I1l;->l111l1111lIl(Ljava/lang/String;)V

    sget-object v12, Lcom/ishumei/smantifraud/l1111l111111Il/l1111l111111Il;->l11l111l1I1l:Ljava/lang/StringBuilder;

    const/16 v13, 0x1d

    invoke-static {v13}, Lcom/ishumei/smantifraud/l1111l111111Il/l1111l111111Il;->l111l11111lIl(I)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Lcom/ishumei/smantifraud/l111l11111I1l/l111l1111l1Il;->l1111l111111Il()Lcom/ishumei/smantifraud/l111l11111I1l/l111l1111l1Il$l1111l111111Il;

    move-result-object v12

    iget-object v13, v12, Lcom/ishumei/smantifraud/l111l11111I1l/l111l1111l1Il$l1111l111111Il;->l1111l111111Il:Ljava/lang/String;

    invoke-virtual {v3, v13}, Lcom/ishumei/smantifraud/l1111l111111Il/l111l11111I1l;->l11l111llI1l(Ljava/lang/String;)V

    iget-object v12, v12, Lcom/ishumei/smantifraud/l111l11111I1l/l111l1111l1Il$l1111l111111Il;->l111l11111lIl:Ljava/lang/String;

    invoke-virtual {v3, v12}, Lcom/ishumei/smantifraud/l1111l111111Il/l111l11111I1l;->l111l111llIl(Ljava/lang/String;)V

    sget-object v12, Lcom/ishumei/smantifraud/l1111l111111Il/l1111l111111Il;->l11l111l1I1l:Ljava/lang/StringBuilder;

    const/16 v13, 0x1e

    invoke-static {v13}, Lcom/ishumei/smantifraud/l1111l111111Il/l1111l111111Il;->l111l11111lIl(I)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Lcom/ishumei/smantifraud/l111l11111I1l/l111l1111l1Il;->l111l11111lIl()I

    move-result v12

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-virtual {v3, v12}, Lcom/ishumei/smantifraud/l1111l111111Il/l111l11111I1l;->l111l11111I1l(Ljava/lang/Integer;)V

    sget-object v12, Lcom/ishumei/smantifraud/l1111l111111Il/l1111l111111Il;->l11l111l1I1l:Ljava/lang/StringBuilder;

    const/16 v13, 0x1f

    invoke-static {v13}, Lcom/ishumei/smantifraud/l1111l111111Il/l1111l111111Il;->l111l11111lIl(I)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Lcom/ishumei/smantifraud/l111l11111I1l/l111l1111l1Il;->l111l11111I1l()I

    move-result v12

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-virtual {v3, v12}, Lcom/ishumei/smantifraud/l1111l111111Il/l111l11111I1l;->l111l11111Il(Ljava/lang/Integer;)V

    sget-object v12, Lcom/ishumei/smantifraud/l1111l111111Il/l1111l111111Il;->l11l111l1I1l:Ljava/lang/StringBuilder;

    const/16 v13, 0x20

    invoke-static {v13}, Lcom/ishumei/smantifraud/l1111l111111Il/l1111l111111Il;->l111l11111lIl(I)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Lcom/ishumei/smantifraud/l111l11111I1l/l111l1111l1Il;->l111l11111Il()J

    move-result-wide v12

    invoke-static {v12, v13}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v12

    invoke-virtual {v3, v12}, Lcom/ishumei/smantifraud/l1111l111111Il/l111l11111I1l;->l111l11111I1l(Ljava/lang/Long;)V

    sget-object v12, Lcom/ishumei/smantifraud/l1111l111111Il/l1111l111111Il;->l11l111l1I1l:Ljava/lang/StringBuilder;

    const/16 v13, 0x21

    invoke-static {v13}, Lcom/ishumei/smantifraud/l1111l111111Il/l1111l111111Il;->l111l11111lIl(I)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Lcom/ishumei/smantifraud/l111l11111I1l/l111l1111llIl;->l1111l111111Il()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v3, v12}, Lcom/ishumei/smantifraud/l1111l111111Il/l111l11111I1l;->l11l111lI1l(Ljava/lang/String;)V

    sget-object v12, Lcom/ishumei/smantifraud/l1111l111111Il/l1111l111111Il;->l11l111l1I1l:Ljava/lang/StringBuilder;

    const/16 v13, 0x22

    invoke-static {v13}, Lcom/ishumei/smantifraud/l1111l111111Il/l1111l111111Il;->l111l11111lIl(I)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Lcom/ishumei/smantifraud/l111l11111I1l/l111l1111llIl;->l111l11111I1l()I

    move-result v12

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-virtual {v3, v12}, Lcom/ishumei/smantifraud/l1111l111111Il/l111l11111I1l;->l111l11111lIl(Ljava/lang/Integer;)V

    sget-object v12, Lcom/ishumei/smantifraud/l1111l111111Il/l1111l111111Il;->l11l111l1I1l:Ljava/lang/StringBuilder;

    const/16 v13, 0x23

    invoke-static {v13}, Lcom/ishumei/smantifraud/l1111l111111Il/l1111l111111Il;->l111l11111lIl(I)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Lcom/ishumei/smantifraud/l111l11111I1l/l111l1111llIl;->l111l11111lIl()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v3, v12}, Lcom/ishumei/smantifraud/l1111l111111Il/l111l11111I1l;->l111l1111lI1l(Ljava/lang/String;)V

    sget-object v12, Lcom/ishumei/smantifraud/l1111l111111Il/l1111l111111Il;->l11l111l1I1l:Ljava/lang/StringBuilder;

    const/16 v13, 0x24

    invoke-static {v13}, Lcom/ishumei/smantifraud/l1111l111111Il/l1111l111111Il;->l111l11111lIl(I)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Lcom/ishumei/smantifraud/l111l11111I1l/l11l1111I1l;->l111l11111I1l()I

    move-result v12

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-virtual {v3, v12}, Lcom/ishumei/smantifraud/l1111l111111Il/l111l11111I1l;->l111l1111l1Il(Ljava/lang/Integer;)V

    sget-object v12, Lcom/ishumei/smantifraud/l1111l111111Il/l1111l111111Il;->l11l111l1I1l:Ljava/lang/StringBuilder;

    const/16 v13, 0x25

    invoke-static {v13}, Lcom/ishumei/smantifraud/l1111l111111Il/l1111l111111Il;->l111l11111lIl(I)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Lcom/ishumei/smantifraud/l111l11111I1l/l111l11111lIl;->l111l11111lIl()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v3, v12}, Lcom/ishumei/smantifraud/l1111l111111Il/l111l11111I1l;->l11l11l1lIl(Ljava/lang/String;)V

    sget-object v12, Lcom/ishumei/smantifraud/l1111l111111Il/l1111l111111Il;->l11l111l1I1l:Ljava/lang/StringBuilder;

    const/16 v13, 0x26

    invoke-static {v13}, Lcom/ishumei/smantifraud/l1111l111111Il/l1111l111111Il;->l111l11111lIl(I)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Lcom/ishumei/smantifraud/l111l11111I1l/l111l11111lIl;->l111l11111I1l()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v3, v12}, Lcom/ishumei/smantifraud/l1111l111111Il/l111l11111I1l;->l11l111lIll(Ljava/lang/String;)V

    sget-object v12, Lcom/ishumei/smantifraud/l1111l111111Il/l1111l111111Il;->l11l111l1I1l:Ljava/lang/StringBuilder;

    const/16 v13, 0x27

    invoke-static {v13}, Lcom/ishumei/smantifraud/l1111l111111Il/l1111l111111Il;->l111l11111lIl(I)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Lcom/ishumei/smantifraud/l111l11111I1l/l11l1111I1l;->l111l11111lIl()J

    move-result-wide v12

    invoke-static {v12, v13}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v12

    invoke-virtual {v3, v12}, Lcom/ishumei/smantifraud/l1111l111111Il/l111l11111I1l;->l111l11111lIl(Ljava/lang/Long;)V

    sget-object v12, Lcom/ishumei/smantifraud/l1111l111111Il/l1111l111111Il;->l11l111l1I1l:Ljava/lang/StringBuilder;

    const/16 v13, 0x28

    invoke-static {v13}, Lcom/ishumei/smantifraud/l1111l111111Il/l1111l111111Il;->l111l11111lIl(I)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Lcom/ishumei/smantifraud/l111l11111I1l/l11l1111I1l;->l111l1111l1Il()I

    move-result v12

    invoke-virtual {v3, v12}, Lcom/ishumei/smantifraud/l1111l111111Il/l111l11111I1l;->l111l11111I1l(I)V

    sget-object v12, Lcom/ishumei/smantifraud/l1111l111111Il/l1111l111111Il;->l11l111l1I1l:Ljava/lang/StringBuilder;

    const/16 v13, 0x29

    invoke-static {v13}, Lcom/ishumei/smantifraud/l1111l111111Il/l1111l111111Il;->l111l11111lIl(I)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il;->l111l11111lIl()Ljava/util/HashMap;

    move-result-object v12

    invoke-virtual {v3, v12}, Lcom/ishumei/smantifraud/l1111l111111Il/l111l11111I1l;->l111l11111lIl(Ljava/util/Map;)V

    sget-object v12, Lcom/ishumei/smantifraud/l1111l111111Il/l1111l111111Il;->l11l111l1I1l:Ljava/lang/StringBuilder;

    const/16 v13, 0x2a

    invoke-static {v13}, Lcom/ishumei/smantifraud/l1111l111111Il/l1111l111111Il;->l111l11111lIl(I)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v12, Lcom/ishumei/smantifraud/l1111l111111Il/l1111l111111Il;->l11l111l1I1l:Ljava/lang/StringBuilder;

    const/16 v13, 0x2b

    invoke-static {v13}, Lcom/ishumei/smantifraud/l1111l111111Il/l1111l111111Il;->l111l11111lIl(I)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Lcom/ishumei/smantifraud/l111l11111I1l/l111l11111lIl;->l111l11111Il()Ljava/lang/Object;

    move-result-object v12

    if-eqz v12, :cond_10

    invoke-static {v12}, Lcom/ishumei/smantifraud/l111l11111I1l/l111l11111lIl;->l1111l111111Il(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v3, v13}, Lcom/ishumei/smantifraud/l1111l111111Il/l111l11111I1l;->l11l111I111l(Ljava/lang/String;)V

    invoke-virtual {v12}, Ljava/lang/Object;->hashCode()I

    move-result v12

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-virtual {v3, v12}, Lcom/ishumei/smantifraud/l1111l111111Il/l111l11111I1l;->l111l1111llIl(Ljava/lang/Integer;)V

    :cond_10
    sget-object v12, Lcom/ishumei/smantifraud/l1111l111111Il/l1111l111111Il;->l11l111l1I1l:Ljava/lang/StringBuilder;

    const/16 v13, 0x2c

    invoke-static {v13}, Lcom/ishumei/smantifraud/l1111l111111Il/l1111l111111Il;->l111l11111lIl(I)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v3}, Lcom/ishumei/smantifraud/l111l11111I1l/l11l1111Il1l;->l1111l111111Il(Lcom/ishumei/smantifraud/l1111l111111Il/l111l11111I1l;)V

    sget-object v12, Lcom/ishumei/smantifraud/l111l11111lIl/l111l1111l1Il;->l1111l111111Il:Landroid/content/Context;

    if-eqz v12, :cond_11

    invoke-virtual {v12}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v12

    invoke-virtual {v12}, Ljava/io/File;->toString()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v3, v12}, Lcom/ishumei/smantifraud/l1111l111111Il/l111l11111I1l;->l111l111I1l(Ljava/lang/String;)V

    :cond_11
    sget-object v12, Lcom/ishumei/smantifraud/l1111l111111Il/l1111l111111Il;->l11l111l1I1l:Ljava/lang/StringBuilder;

    const/16 v13, 0x2d

    invoke-static {v13}, Lcom/ishumei/smantifraud/l1111l111111Il/l1111l111111Il;->l111l11111lIl(I)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v12, Lcom/ishumei/smantifraud/l1111l111111Il/l1111l111111Il;->l11l111l1I1l:Ljava/lang/StringBuilder;

    const/16 v13, 0x2e

    invoke-static {v13}, Lcom/ishumei/smantifraud/l1111l111111Il/l1111l111111Il;->l111l11111lIl(I)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Lcom/ishumei/smantifraud/l111l11111I1l/l1111l111111Il;->l111l1111l1Il()Ljava/util/Map;

    move-result-object v12

    invoke-virtual {v3, v12}, Lcom/ishumei/smantifraud/l1111l111111Il/l111l11111I1l;->l111l11111I1l(Ljava/util/Map;)V

    sget-object v12, Lcom/ishumei/smantifraud/l1111l111111Il/l1111l111111Il;->l11l111l1I1l:Ljava/lang/StringBuilder;

    const/16 v13, 0x2f

    invoke-static {v13}, Lcom/ishumei/smantifraud/l1111l111111Il/l1111l111111Il;->l111l11111lIl(I)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Lcom/ishumei/smantifraud/l111l11111lIl/l111l11111Il;->l1111l111111Il()Lcom/ishumei/smantifraud/l111l11111lIl/l111l11111Il;

    move-result-object v12

    invoke-virtual {v12}, Lcom/ishumei/smantifraud/l111l11111lIl/l111l11111Il;->l111l11111I1l()Ljava/util/List;

    move-result-object v12

    invoke-virtual {v3, v12}, Lcom/ishumei/smantifraud/l1111l111111Il/l111l11111I1l;->l111l11111lIl(Ljava/util/List;)V

    sget-object v12, Lcom/ishumei/smantifraud/l1111l111111Il/l1111l111111Il;->l11l111l1I1l:Ljava/lang/StringBuilder;

    const/16 v13, 0x30

    invoke-static {v13}, Lcom/ishumei/smantifraud/l1111l111111Il/l1111l111111Il;->l111l11111lIl(I)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Lcom/ishumei/smantifraud/l111l11111I1l/l111l1111llIl;->l111l11111Il()Landroid/os/StatFs;

    move-result-object v12

    if-eqz v12, :cond_12

    invoke-virtual {v12}, Landroid/os/StatFs;->getAvailableBytes()J

    move-result-wide v13

    invoke-static {v13, v14}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v13

    invoke-virtual {v3, v13}, Lcom/ishumei/smantifraud/l1111l111111Il/l111l11111I1l;->l111l11111Il(Ljava/lang/Long;)V

    invoke-virtual {v12}, Landroid/os/StatFs;->getFreeBytes()J

    move-result-wide v13

    invoke-static {v13, v14}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v13

    invoke-virtual {v3, v13}, Lcom/ishumei/smantifraud/l1111l111111Il/l111l11111I1l;->l111l1111l1Il(Ljava/lang/Long;)V

    invoke-virtual {v12}, Landroid/os/StatFs;->getTotalBytes()J

    move-result-wide v12

    invoke-static {v12, v13}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v12

    invoke-virtual {v3, v12}, Lcom/ishumei/smantifraud/l1111l111111Il/l111l11111I1l;->l111l1111llIl(Ljava/lang/Long;)V

    :cond_12
    sget-object v12, Lcom/ishumei/smantifraud/l1111l111111Il/l1111l111111Il;->l11l111l1I1l:Ljava/lang/StringBuilder;

    const/16 v13, 0x31

    invoke-static {v13}, Lcom/ishumei/smantifraud/l1111l111111Il/l1111l111111Il;->l111l11111lIl(I)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Lcom/ishumei/smantifraud/l111l11111I1l/l1111l111111Il$1;->l1111l111111Il()Ljava/util/Map;

    move-result-object v12

    invoke-virtual {v3, v12}, Lcom/ishumei/smantifraud/l1111l111111Il/l111l11111I1l;->l111l11111Il(Ljava/util/Map;)V

    sget-object v12, Lcom/ishumei/smantifraud/l1111l111111Il/l1111l111111Il;->l11l111l1I1l:Ljava/lang/StringBuilder;

    const/16 v13, 0x32

    invoke-static {v13}, Lcom/ishumei/smantifraud/l1111l111111Il/l1111l111111Il;->l111l11111lIl(I)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v12, Lcom/ishumei/smantifraud/l111l11111lIl/l111l1111l1Il;->l1111l111111Il:Landroid/content/Context;

    if-eqz v12, :cond_13

    invoke-virtual {v12}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v12

    const-string v13, "mock_location"

    invoke-static {v12, v13, v8}, Landroid/provider/Settings$Secure;->getInt(Landroid/content/ContentResolver;Ljava/lang/String;I)I

    move-result v12

    if-eqz v12, :cond_13

    move v12, v9

    goto :goto_7

    :cond_13
    move v12, v8

    :goto_7
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-virtual {v3, v12}, Lcom/ishumei/smantifraud/l1111l111111Il/l111l11111I1l;->l111l1111lI1l(Ljava/lang/Integer;)V

    sget-object v12, Lcom/ishumei/smantifraud/l1111l111111Il/l1111l111111Il;->l11l111l1I1l:Ljava/lang/StringBuilder;

    const/16 v13, 0x33

    invoke-static {v13}, Lcom/ishumei/smantifraud/l1111l111111Il/l1111l111111Il;->l111l11111lIl(I)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Landroid/os/Debug;->isDebuggerConnected()Z

    move-result v12

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-virtual {v3, v12}, Lcom/ishumei/smantifraud/l1111l111111Il/l111l11111I1l;->l111l1111lIl(Ljava/lang/Integer;)V

    sget-object v12, Lcom/ishumei/smantifraud/l1111l111111Il/l1111l111111Il;->l11l111l1I1l:Ljava/lang/StringBuilder;

    const/16 v13, 0x34

    invoke-static {v13}, Lcom/ishumei/smantifraud/l1111l111111Il/l1111l111111Il;->l111l11111lIl(I)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v12, Lcom/ishumei/smantifraud/l111l11111lIl/l111l1111l1Il;->l1111l111111Il:Landroid/content/Context;

    invoke-virtual {v12}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v12

    iget v12, v12, Landroid/content/pm/ApplicationInfo;->flags:I

    and-int/lit8 v12, v12, 0x2

    if-lez v12, :cond_14

    move v12, v9

    goto :goto_8

    :cond_14
    move v12, v8

    :goto_8
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-virtual {v3, v12}, Lcom/ishumei/smantifraud/l1111l111111Il/l111l11111I1l;->l11l1111lIIl(Ljava/lang/Integer;)V

    sget-object v12, Lcom/ishumei/smantifraud/l1111l111111Il/l1111l111111Il;->l11l111l1I1l:Ljava/lang/StringBuilder;

    const/16 v13, 0x35

    invoke-static {v13}, Lcom/ishumei/smantifraud/l1111l111111Il/l1111l111111Il;->l111l11111lIl(I)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Lcom/ishumei/smantifraud/l111l11111I1l/l111l1111lIl;->l1111l111111Il()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v3, v12}, Lcom/ishumei/smantifraud/l1111l111111Il/l111l11111I1l;->l11l111Il(Ljava/lang/String;)V

    sget-object v12, Lcom/ishumei/smantifraud/l1111l111111Il/l1111l111111Il;->l11l111l1I1l:Ljava/lang/StringBuilder;

    const/16 v13, 0x36

    invoke-static {v13}, Lcom/ishumei/smantifraud/l1111l111111Il/l1111l111111Il;->l111l11111lIl(I)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Lcom/ishumei/smantifraud/l111l11111I1l/l1111l111111Il;->l111l11111Il()Ljava/util/Map;

    move-result-object v12

    invoke-virtual {v3, v12}, Lcom/ishumei/smantifraud/l1111l111111Il/l111l11111I1l;->l111l1111l1Il(Ljava/util/Map;)V

    sget-object v12, Lcom/ishumei/smantifraud/l1111l111111Il/l1111l111111Il;->l11l111l1I1l:Ljava/lang/StringBuilder;

    const/16 v13, 0x37

    invoke-static {v13}, Lcom/ishumei/smantifraud/l1111l111111Il/l1111l111111Il;->l111l11111lIl(I)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Lcom/ishumei/smantifraud/l111l11111I1l/l1111l111111Il;->l111l11111I1l()Ljava/util/Set;

    move-result-object v12

    invoke-virtual {v3, v12}, Lcom/ishumei/smantifraud/l1111l111111Il/l111l11111I1l;->l111l11111lIl(Ljava/util/Set;)V

    sget-object v12, Lcom/ishumei/smantifraud/l1111l111111Il/l1111l111111Il;->l11l111l1I1l:Ljava/lang/StringBuilder;

    const/16 v13, 0x38

    invoke-static {v13}, Lcom/ishumei/smantifraud/l1111l111111Il/l1111l111111Il;->l111l11111lIl(I)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Lcom/ishumei/smantifraud/l111l11111I1l/l1111l111111Il;->l111l1111llIl()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v3, v12}, Lcom/ishumei/smantifraud/l1111l111111Il/l111l11111I1l;->l11l1111I11l(Ljava/lang/String;)V

    sget-object v12, Lcom/ishumei/smantifraud/l1111l111111Il/l1111l111111Il;->l11l111l1I1l:Ljava/lang/StringBuilder;

    const/16 v13, 0x39

    invoke-static {v13}, Lcom/ishumei/smantifraud/l1111l111111Il/l1111l111111Il;->l111l11111lIl(I)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Lcom/ishumei/smantifraud/l111l11111I1l/l1111l111111Il;->l111l1111lIl()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v3, v12}, Lcom/ishumei/smantifraud/l1111l111111Il/l111l11111I1l;->l1111l111111Il(Ljava/lang/String;)V

    sget-object v12, Lcom/ishumei/smantifraud/l1111l111111Il/l1111l111111Il;->l11l111l1I1l:Ljava/lang/StringBuilder;

    const/16 v13, 0x3a

    invoke-static {v13}, Lcom/ishumei/smantifraud/l1111l111111Il/l1111l111111Il;->l111l11111lIl(I)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Lcom/ishumei/smantifraud/l111l11111I1l/l1111l111111Il;->l11l1111lIIl()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v3, v12}, Lcom/ishumei/smantifraud/l1111l111111Il/l111l11111I1l;->l111l11111lIl(Ljava/lang/String;)V

    sget-object v12, Lcom/ishumei/smantifraud/l1111l111111Il/l1111l111111Il;->l11l111l1I1l:Ljava/lang/StringBuilder;

    const/16 v13, 0x3b

    invoke-static {v13}, Lcom/ishumei/smantifraud/l1111l111111Il/l1111l111111Il;->l111l11111lIl(I)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Lcom/ishumei/smantifraud/l111l11111I1l/l1111l111111Il;->l11l1111I11l()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v3, v12}, Lcom/ishumei/smantifraud/l1111l111111Il/l111l11111I1l;->l111l11111I1l(Ljava/lang/String;)V

    sget-object v12, Lcom/ishumei/smantifraud/l1111l111111Il/l1111l111111Il;->l11l111l1I1l:Ljava/lang/StringBuilder;

    const/16 v13, 0x3c

    invoke-static {v13}, Lcom/ishumei/smantifraud/l1111l111111Il/l1111l111111Il;->l111l11111lIl(I)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v12, "oaid"

    invoke-interface {v0, v12}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_15

    new-instance v12, Lcom/ishumei/smantifraud/l111l11111I1l/l1111l111111Il/l111l1111llIl;

    sget-object v13, Lcom/ishumei/smantifraud/l111l11111lIl/l111l1111l1Il;->l1111l111111Il:Landroid/content/Context;

    invoke-direct {v12, v13}, Lcom/ishumei/smantifraud/l111l11111I1l/l1111l111111Il/l111l1111llIl;-><init>(Landroid/content/Context;)V

    invoke-virtual {v12}, Lcom/ishumei/smantifraud/l111l11111I1l/l1111l111111Il/l111l1111llIl;->l1111l111111Il()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v3, v12}, Lcom/ishumei/smantifraud/l1111l111111Il/l111l11111I1l;->l111l111III1l(Ljava/lang/String;)V

    :cond_15
    sget-object v12, Lcom/ishumei/smantifraud/l1111l111111Il/l1111l111111Il;->l11l111l1I1l:Ljava/lang/StringBuilder;

    const/16 v13, 0x3d

    invoke-static {v13}, Lcom/ishumei/smantifraud/l1111l111111Il/l1111l111111Il;->l111l11111lIl(I)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Lcom/ishumei/smantifraud/l111l11111I1l/l1111l111111Il;->l11l1111I1ll()Ljava/util/Map;

    move-result-object v12

    invoke-virtual {v3, v12}, Lcom/ishumei/smantifraud/l1111l111111Il/l111l11111I1l;->l111l1111llIl(Ljava/util/Map;)V

    sget-object v12, Lcom/ishumei/smantifraud/l1111l111111Il/l1111l111111Il;->l11l111l1I1l:Ljava/lang/StringBuilder;

    const/16 v13, 0x3e

    invoke-static {v13}, Lcom/ishumei/smantifraud/l1111l111111Il/l1111l111111Il;->l111l11111lIl(I)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Lcom/ishumei/smantifraud/l111l11111I1l/l1111l111111Il;->l11l1111Il()I

    move-result v12

    if-ne v12, v9, :cond_16

    invoke-virtual {v3, v9}, Lcom/ishumei/smantifraud/l1111l111111Il/l111l11111I1l;->l1111l111111Il(I)V

    :cond_16
    sget-object v12, Lcom/ishumei/smantifraud/l1111l111111Il/l1111l111111Il;->l11l111l1I1l:Ljava/lang/StringBuilder;

    const/16 v13, 0x3f

    invoke-static {v13}, Lcom/ishumei/smantifraud/l1111l111111Il/l1111l111111Il;->l111l11111lIl(I)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-eqz v6, :cond_17

    invoke-virtual {v6}, Lcom/ishumei/smantifraud/l1111l111111Il/l111l11111Il;->l111l1111llIl()Z

    move-result v12

    if-eqz v12, :cond_17

    invoke-static {}, Lcom/ishumei/smantifraud/l111l11111I1l/l1111l111111Il;->l1111l111111Il()Ljava/util/Map;

    move-result-object v12

    invoke-virtual {v3, v12}, Lcom/ishumei/smantifraud/l1111l111111Il/l111l11111I1l;->l111l1111lI1l(Ljava/util/Map;)V

    :cond_17
    sget-object v12, Lcom/ishumei/smantifraud/l1111l111111Il/l1111l111111Il;->l11l111l1I1l:Ljava/lang/StringBuilder;

    const/16 v13, 0x40

    invoke-static {v13}, Lcom/ishumei/smantifraud/l1111l111111Il/l1111l111111Il;->l111l11111lIl(I)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Lcom/ishumei/smantifraud/l111l11111I1l/l111l1111llIl;->l111l1111l1Il()I

    move-result v12

    invoke-virtual {v3, v12}, Lcom/ishumei/smantifraud/l1111l111111Il/l111l11111I1l;->l111l11111Il(I)V

    sget-object v12, Lcom/ishumei/smantifraud/l1111l111111Il/l1111l111111Il;->l11l111l1I1l:Ljava/lang/StringBuilder;

    const/16 v13, 0x41

    invoke-static {v13}, Lcom/ishumei/smantifraud/l1111l111111Il/l1111l111111Il;->l111l11111lIl(I)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v12, Lcom/ishumei/smantifraud/l111l11111lIl/l111l1111l1Il;->l1111l111111Il:Landroid/content/Context;

    invoke-static {v12}, Lcom/ishumei/smantifraud/l111l11111lIl/l1111l111111Il;->l1111l111111Il(Landroid/content/Context;)I

    move-result v12

    invoke-virtual {v3, v12}, Lcom/ishumei/smantifraud/l1111l111111Il/l111l11111I1l;->l111l1111l1Il(I)V

    const-string/jumbo v12, "simCountryISO"

    invoke-interface {v0, v12}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_18

    invoke-virtual {v2}, Lcom/ishumei/smantifraud/l111l11111I1l/l11l1111Il;->l111l11111lIl()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v3, v12}, Lcom/ishumei/smantifraud/l1111l111111Il/l111l11111I1l;->l11l11l1l1Il(Ljava/lang/String;)V

    :cond_18
    sget-object v12, Lcom/ishumei/smantifraud/l1111l111111Il/l1111l111111Il;->l11l111l1I1l:Ljava/lang/StringBuilder;

    const/16 v13, 0x42

    invoke-static {v13}, Lcom/ishumei/smantifraud/l1111l111111Il/l1111l111111Il;->l111l11111lIl(I)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v12, "networkCountryIso"

    invoke-interface {v0, v12}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_19

    invoke-virtual {v2}, Lcom/ishumei/smantifraud/l111l11111I1l/l11l1111Il;->l111l11111I1l()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Lcom/ishumei/smantifraud/l1111l111111Il/l111l11111I1l;->l11l11l1llIl(Ljava/lang/String;)V

    :cond_19
    sget-object v2, Lcom/ishumei/smantifraud/l1111l111111Il/l1111l111111Il;->l11l111l1I1l:Ljava/lang/StringBuilder;

    const/16 v12, 0x43

    invoke-static {v12}, Lcom/ishumei/smantifraud/l1111l111111Il/l1111l111111Il;->l111l11111lIl(I)Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v2, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Lcom/ishumei/smantifraud/l111l11111I1l/l1111l111111Il;->l11l1111Ill()Ljava/util/List;

    move-result-object v2

    if-eqz v2, :cond_1a

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v12

    if-nez v12, :cond_1a

    invoke-virtual {v3, v2}, Lcom/ishumei/smantifraud/l1111l111111Il/l111l11111I1l;->l111l11111Il(Ljava/util/List;)V

    :cond_1a
    sget-object v2, Lcom/ishumei/smantifraud/l1111l111111Il/l1111l111111Il;->l11l111l1I1l:Ljava/lang/StringBuilder;

    const/16 v12, 0x44

    invoke-static {v12}, Lcom/ishumei/smantifraud/l1111l111111Il/l1111l111111Il;->l111l11111lIl(I)Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v2, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "locationCls"

    invoke-interface {v0, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1b

    invoke-static {}, Lcom/ishumei/smantifraud/l111l11111I1l/l1111l111111Il;->l11l11IlIIll()Ljava/util/Map;

    move-result-object v2

    if-eqz v2, :cond_1b

    invoke-virtual {v3, v2}, Lcom/ishumei/smantifraud/l1111l111111Il/l111l11111I1l;->l111l1111lIl(Ljava/util/Map;)V

    :cond_1b
    sget-object v2, Lcom/ishumei/smantifraud/l1111l111111Il/l1111l111111Il;->l11l111l1I1l:Ljava/lang/StringBuilder;

    const/16 v12, 0x45

    invoke-static {v12}, Lcom/ishumei/smantifraud/l1111l111111Il/l1111l111111Il;->l111l11111lIl(I)Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v2, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Lcom/ishumei/smantifraud/l111l11111I1l/l1111l111111Il;->l11l111l11Il()Z

    move-result v2

    if-eqz v2, :cond_1c

    invoke-virtual {v3, v9}, Lcom/ishumei/smantifraud/l1111l111111Il/l111l11111I1l;->l1111l111111Il(Z)V

    :cond_1c
    sget-object v2, Lcom/ishumei/smantifraud/l1111l111111Il/l1111l111111Il;->l11l111l1I1l:Ljava/lang/StringBuilder;

    const/16 v12, 0x46

    invoke-static {v12}, Lcom/ishumei/smantifraud/l1111l111111Il/l1111l111111Il;->l111l11111lIl(I)Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v2, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-instance v2, Ljava/util/HashMap;

    const/4 v12, 0x5

    invoke-direct {v2, v12}, Ljava/util/HashMap;-><init>(I)V

    const-string v12, "mr"

    invoke-static {}, Landroid/net/TrafficStats;->getMobileRxBytes()J

    move-result-wide v13

    invoke-static {v13, v14}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v13

    invoke-interface {v2, v12, v13}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v12, "mt"

    invoke-static {}, Landroid/net/TrafficStats;->getMobileTxBytes()J

    move-result-wide v13

    invoke-static {v13, v14}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v13

    invoke-interface {v2, v12, v13}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string/jumbo v12, "tr"

    invoke-static {}, Landroid/net/TrafficStats;->getTotalRxBytes()J

    move-result-wide v13

    invoke-static {v13, v14}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v13

    invoke-interface {v2, v12, v13}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string/jumbo v12, "tt"

    invoke-static {}, Landroid/net/TrafficStats;->getTotalTxBytes()J

    move-result-wide v13

    invoke-static {v13, v14}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v13

    invoke-interface {v2, v12, v13}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v3, v2}, Lcom/ishumei/smantifraud/l1111l111111Il/l111l11111I1l;->l11l1111lIIl(Ljava/util/Map;)V

    sget-object v2, Lcom/ishumei/smantifraud/l1111l111111Il/l1111l111111Il;->l11l111l1I1l:Ljava/lang/StringBuilder;

    const/16 v12, 0x47

    invoke-static {v12}, Lcom/ishumei/smantifraud/l1111l111111Il/l1111l111111Il;->l111l11111lIl(I)Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v2, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v2, Lcom/ishumei/smantifraud/l111l11111lIl/l111l1111l1Il;->l1111l111111Il:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v2

    const-string v12, "adb_enabled"

    invoke-static {v2, v12, v8}, Landroid/provider/Settings$Secure;->getInt(Landroid/content/ContentResolver;Ljava/lang/String;I)I

    move-result v2

    invoke-virtual {v3, v2}, Lcom/ishumei/smantifraud/l1111l111111Il/l111l11111I1l;->l111l11111lIl(I)V

    sget-object v2, Lcom/ishumei/smantifraud/l1111l111111Il/l1111l111111Il;->l11l111l1I1l:Ljava/lang/StringBuilder;

    const/16 v12, 0x48

    invoke-static {v12}, Lcom/ishumei/smantifraud/l1111l111111Il/l1111l111111Il;->l111l11111lIl(I)Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v2, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Lcom/ishumei/smantifraud/l111l11111I1l/l11l1111Il;->l1111l111111Il()Ljava/util/Map;

    move-result-object v2

    sget-object v12, Lcom/ishumei/smantifraud/l1111l111111Il/l1111l111111Il;->l11l111l1I1l:Ljava/lang/StringBuilder;

    const/16 v13, 0x49

    invoke-static {v13}, Lcom/ishumei/smantifraud/l1111l111111Il/l1111l111111Il;->l111l11111lIl(I)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-eqz v2, :cond_1d

    invoke-virtual {v3, v2}, Lcom/ishumei/smantifraud/l1111l111111Il/l111l11111I1l;->l11l1111I11l(Ljava/util/Map;)V

    :cond_1d
    sget-object v2, Lcom/ishumei/smantifraud/l1111l111111Il/l1111l111111Il;->l11l111l1I1l:Ljava/lang/StringBuilder;

    const/16 v12, 0x4a

    invoke-static {v12}, Lcom/ishumei/smantifraud/l1111l111111Il/l1111l111111Il;->l111l11111lIl(I)Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v2, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v2, Lcom/ishumei/smantifraud/l1111l111111Il/l1111l111111Il;->l11l111l1I1l:Ljava/lang/StringBuilder;

    const/16 v12, 0x4b

    invoke-static {v12}, Lcom/ishumei/smantifraud/l1111l111111Il/l1111l111111Il;->l111l11111lIl(I)Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v2, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Lcom/ishumei/smantifraud/SmAntiFraud$SmOption;->l11l11IlIIll()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Lcom/ishumei/smantifraud/l1111l111111Il/l111l11111I1l;->l11l11l11Il(Ljava/lang/String;)V

    sget-object v2, Lcom/ishumei/smantifraud/l1111l111111Il/l1111l111111Il;->l11l111l1I1l:Ljava/lang/StringBuilder;

    const/16 v12, 0x4c

    invoke-static {v12}, Lcom/ishumei/smantifraud/l1111l111111Il/l1111l111111Il;->l111l11111lIl(I)Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v2, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Lcom/ishumei/smantifraud/l111l11111I1l/l111l11111lIl;->l111l1111llIl()Ljava/util/Map;

    move-result-object v2

    if-eqz v2, :cond_1e

    invoke-interface {v2}, Ljava/util/Map;->isEmpty()Z

    move-result v12

    if-nez v12, :cond_1e

    invoke-virtual {v3, v2}, Lcom/ishumei/smantifraud/l1111l111111Il/l111l11111I1l;->l11l1111I1l(Ljava/util/Map;)V

    :cond_1e
    sget-object v2, Lcom/ishumei/smantifraud/l1111l111111Il/l1111l111111Il;->l11l111l1I1l:Ljava/lang/StringBuilder;

    const/16 v12, 0x4d

    invoke-static {v12}, Lcom/ishumei/smantifraud/l1111l111111Il/l1111l111111Il;->l111l11111lIl(I)Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v2, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Lcom/ishumei/smantifraud/l111l11111I1l/l1111l111111Il;->l11l111l1lll()Ljava/util/List;

    move-result-object v2

    if-eqz v2, :cond_1f

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v12

    if-nez v12, :cond_1f

    invoke-virtual {v3, v2}, Lcom/ishumei/smantifraud/l1111l111111Il/l111l11111I1l;->l111l1111l1Il(Ljava/util/List;)V

    :cond_1f
    sget-object v2, Lcom/ishumei/smantifraud/l1111l111111Il/l1111l111111Il;->l11l111l1I1l:Ljava/lang/StringBuilder;

    const/16 v12, 0x4e

    invoke-static {v12}, Lcom/ishumei/smantifraud/l1111l111111Il/l1111l111111Il;->l111l11111lIl(I)Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v2, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iput-boolean v9, v1, Lcom/ishumei/smantifraud/l1111l111111Il/l1111l111111Il;->l11l111ll11l:Z

    invoke-static {}, Lcom/ishumei/smantifraud/SmAntiFraud;->getDeviceId()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_20

    const-string v12, "D"

    invoke-virtual {v2, v12}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v12

    if-nez v12, :cond_20

    invoke-virtual {v3, v2}, Lcom/ishumei/smantifraud/l1111l111111Il/l111l11111I1l;->l111l11l11Ill(Ljava/lang/String;)V

    :cond_20
    iput-boolean v8, v1, Lcom/ishumei/smantifraud/l1111l111111Il/l1111l111111Il;->l11l111ll11l:Z

    sget-object v2, Lcom/ishumei/smantifraud/l1111l111111Il/l1111l111111Il;->l11l111l1I1l:Ljava/lang/StringBuilder;

    const/16 v12, 0x4f

    invoke-static {v12}, Lcom/ishumei/smantifraud/l1111l111111Il/l1111l111111Il;->l111l11111lIl(I)Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v2, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Lcom/ishumei/smantifraud/l111l11111I1l/l111l1111lI1l;->l111l11111Il()Z

    move-result v2

    if-eqz v2, :cond_24

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v12

    sub-long/2addr v12, v10

    const-wide/16 v10, 0x12c

    cmp-long v2, v12, v10

    if-gez v2, :cond_21

    invoke-static {v12, v13}, Ljava/lang/Thread;->sleep(J)V

    :cond_21
    invoke-static {}, Lcom/ishumei/smantifraud/l111l11111I1l/l111l1111lI1l;->l1111l111111Il()Z

    move-result v2

    if-eqz v2, :cond_22

    invoke-virtual {v3, v9}, Lcom/ishumei/smantifraud/l1111l111111Il/l111l11111I1l;->l111l1111lI1l(I)V

    :cond_22
    invoke-static {}, Lcom/ishumei/smantifraud/l111l11111I1l/l111l1111lI1l;->l111l11111lIl()Z

    move-result v2

    if-nez v2, :cond_23

    invoke-static {}, Lcom/ishumei/smantifraud/l111l11111I1l/l111l1111lI1l;->l111l11111I1l()Z

    move-result v2

    if-eqz v2, :cond_24

    :cond_23
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    const-string v10, "f"

    invoke-static {}, Lcom/ishumei/smantifraud/l111l11111I1l/l111l1111lI1l;->l111l11111lIl()Z

    move-result v11

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-interface {v2, v10, v11}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v10, "bi"

    invoke-static {}, Lcom/ishumei/smantifraud/l111l11111I1l/l111l1111lI1l;->l111l11111I1l()Z

    move-result v11

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-interface {v2, v10, v11}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v3, v2}, Lcom/ishumei/smantifraud/l1111l111111Il/l111l11111I1l;->l11l1111I1ll(Ljava/util/Map;)V

    :cond_24
    sget-object v2, Lcom/ishumei/smantifraud/l1111l111111Il/l1111l111111Il;->l11l111l1I1l:Ljava/lang/StringBuilder;

    const/16 v10, 0x50

    invoke-static {v10}, Lcom/ishumei/smantifraud/l1111l111111Il/l1111l111111Il;->l111l11111lIl(I)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-instance v2, Ljava/io/File;

    sget-object v10, Lcom/ishumei/smantifraud/l111l11111lIl/l111l1111l1Il;->l1111l111111Il:Landroid/content/Context;

    invoke-virtual {v10}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v10

    iget-object v10, v10, Landroid/content/pm/ApplicationInfo;->dataDir:Ljava/lang/String;

    invoke-direct {v2, v10}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v2

    if-eqz v2, :cond_25

    invoke-virtual {v2}, Ljava/io/File;->canRead()Z

    move-result v2

    if-eqz v2, :cond_25

    invoke-virtual {v3, v9}, Lcom/ishumei/smantifraud/l1111l111111Il/l111l11111I1l;->l111l1111lIl(I)V

    :cond_25
    sget-object v2, Lcom/ishumei/smantifraud/l1111l111111Il/l1111l111111Il;->l11l111l1I1l:Ljava/lang/StringBuilder;

    const/16 v10, 0x51

    invoke-static {v10}, Lcom/ishumei/smantifraud/l1111l111111Il/l1111l111111Il;->l111l11111lIl(I)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Lcom/ishumei/smantifraud/l111l11111I1l/l1111l111111Il;->l111l11IlIlIl()I

    move-result v2

    if-eqz v2, :cond_26

    invoke-virtual {v3, v2}, Lcom/ishumei/smantifraud/l1111l111111Il/l111l11111I1l;->l11l1111lIIl(I)V

    :cond_26
    sget-object v2, Lcom/ishumei/smantifraud/l1111l111111Il/l1111l111111Il;->l11l111l1I1l:Ljava/lang/StringBuilder;

    const/16 v10, 0x52

    invoke-static {v10}, Lcom/ishumei/smantifraud/l1111l111111Il/l1111l111111Il;->l111l11111lIl(I)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v2, Lcom/ishumei/smantifraud/l111l11111lIl/l111l1111l1Il;->l1111l111111Il:Landroid/content/Context;

    invoke-static {v2}, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111lIl;->l1111l111111Il(Landroid/content/Context;)I

    move-result v2

    invoke-virtual {v3, v2}, Lcom/ishumei/smantifraud/l1111l111111Il/l111l11111I1l;->l11l1111I11l(I)V

    sget-object v2, Lcom/ishumei/smantifraud/l1111l111111Il/l1111l111111Il;->l11l111l1I1l:Ljava/lang/StringBuilder;

    const/16 v10, 0x53

    invoke-static {v10}, Lcom/ishumei/smantifraud/l1111l111111Il/l1111l111111Il;->l111l11111lIl(I)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Lcom/ishumei/smantifraud/l111l11111I1l/l111l11111lIl;->l111l1111lI1l()Ljava/util/Map;

    move-result-object v2

    if-eqz v2, :cond_27

    invoke-virtual {v3, v2}, Lcom/ishumei/smantifraud/l1111l111111Il/l111l11111I1l;->l11l1111Il(Ljava/util/Map;)V

    :cond_27
    sget-object v2, Lcom/ishumei/smantifraud/l1111l111111Il/l1111l111111Il;->l11l111l1I1l:Ljava/lang/StringBuilder;

    const/16 v10, 0x54

    invoke-static {v10}, Lcom/ishumei/smantifraud/l1111l111111Il/l1111l111111Il;->l111l11111lIl(I)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "launcherInfo"

    invoke-interface {v0, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_28

    sget-object v0, Lcom/ishumei/smantifraud/l111l11111lIl/l111l1111l1Il;->l1111l111111Il:Landroid/content/Context;

    invoke-static {v0}, Lcom/ishumei/smantifraud/l111l11111I1l/l111l11111lIl;->l1111l111111Il(Landroid/content/Context;)Ljava/util/Map;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/ishumei/smantifraud/l1111l111111Il/l111l11111I1l;->l11l1111Il1l(Ljava/util/Map;)V

    :cond_28
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v10

    sub-long/2addr v10, v4

    long-to-int v0, v10

    invoke-virtual {v3, v0}, Lcom/ishumei/smantifraud/l1111l111111Il/l111l11111I1l;->l111l1111llIl(I)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :try_start_5
    sget-object v0, Lcom/ishumei/smantifraud/l1111l111111Il/l1111l111111Il;->l11l111l1I1l:Ljava/lang/StringBuilder;

    if-eqz v0, :cond_29

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_9
    invoke-virtual {v3, v0}, Lcom/ishumei/smantifraud/l1111l111111Il/l111l11111I1l;->l11l11l1I11l(Ljava/lang/String;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    :cond_29
    const/4 v2, 0x0

    goto :goto_b

    :goto_a
    :try_start_6
    invoke-static {v0}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/ishumei/smantifraud/l1111l111111Il/l111l11111I1l;->l111l111Il1l(Ljava/lang/String;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    :try_start_7
    sget-object v0, Lcom/ishumei/smantifraud/l1111l111111Il/l1111l111111Il;->l11l111l1I1l:Ljava/lang/StringBuilder;

    if-eqz v0, :cond_29

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_9

    :goto_b
    invoke-static {v3, v2}, Lcom/ishumei/smantifraud/l111l1111llIl/l111l1111l1Il;->l1111l111111Il(Ljava/lang/Object;Ljava/util/Set;)Lorg/json/JSONObject;

    move-result-object v0

    invoke-virtual {v7}, Lcom/ishumei/smantifraud/SmAntiFraud$SmOption;->l111l1111lIl()Z

    move-result v4

    if-eqz v4, :cond_2a

    sget-object v4, Lcom/ishumei/smantifraud/l111l11111lIl/l111l1111l1Il;->l111l11111Il:Ljava/lang/String;

    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_2a

    sget-object v4, Lcom/ishumei/smantifraud/l1111l111111Il/l111l11111lIl;->l1111l111111Il:Ljava/util/Set;

    invoke-static {v3, v4}, Lcom/ishumei/smantifraud/l111l1111llIl/l111l1111l1Il;->l1111l111111Il(Ljava/lang/Object;Ljava/util/Set;)Lorg/json/JSONObject;

    move-result-object v3

    invoke-static {v3}, Lcom/ishumei/smantifraud/l1111l111111Il/l111l11111lIl;->l1111l111111Il(Lorg/json/JSONObject;)V

    goto :goto_c

    :cond_2a
    move-object v3, v2

    :goto_c
    sget-object v10, Lcom/ishumei/smantifraud/l111l11111lIl/l111l1111l1Il;->l1111l111111Il:Landroid/content/Context;

    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v11

    if-nez v3, :cond_2b

    move-object v12, v2

    goto :goto_d

    :cond_2b
    invoke-virtual {v3}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    move-object v12, v0

    :goto_d
    if-eqz v6, :cond_2c

    invoke-virtual {v6}, Lcom/ishumei/smantifraud/l1111l111111Il/l111l11111Il;->l111l11111Il()Z

    move-result v0

    if-eqz v0, :cond_2c

    invoke-virtual {v6}, Lcom/ishumei/smantifraud/l1111l111111Il/l111l11111Il;->l11l1111lIIl()Ljava/lang/String;

    move-result-object v2

    :cond_2c
    move-object v13, v2

    invoke-virtual {v7}, Lcom/ishumei/smantifraud/SmAntiFraud$SmOption;->l111l11111Il()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v7}, Lcom/ishumei/smantifraud/SmAntiFraud$SmOption;->l11l1111I11l()Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v7}, Lcom/ishumei/smantifraud/SmAntiFraud$SmOption;->l11l1111Ill()Ljava/lang/String;

    move-result-object v16

    invoke-virtual {v7}, Lcom/ishumei/smantifraud/SmAntiFraud$SmOption;->l11l1111I1l()Ljava/lang/String;

    move-result-object v17

    sget-wide v18, Lcom/ishumei/smantifraud/l111l11111lIl/l111l1111l1Il;->l111l11111I1l:J

    invoke-static/range {v10 .. v19}, Lcom/ishumei/smantifraud/dfp/SMSDK;->v1(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_2e

    const-string/jumbo v2, "{"

    invoke-virtual {v0, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_2e

    const-string/jumbo v2, "}{"

    invoke-virtual {v0, v2}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v2

    add-int/2addr v2, v9

    if-lez v2, :cond_2d

    invoke-virtual {v0, v8, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B

    move-result-object v0

    invoke-static {v0}, Lcom/ishumei/smantifraud/l111l1111llIl/l111l1111l1Il;->l1111l111111Il([B)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v1, Lcom/ishumei/smantifraud/l1111l111111Il/l1111l111111Il;->l11l111l1Il:Ljava/lang/String;

    move-object v0, v3

    goto :goto_e

    :cond_2d
    invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B

    move-result-object v2

    invoke-static {v2}, Lcom/ishumei/smantifraud/l111l1111llIl/l111l1111l1Il;->l1111l111111Il([B)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v1, Lcom/ishumei/smantifraud/l1111l111111Il/l1111l111111Il;->l11l111l1Il:Ljava/lang/String;

    :goto_e
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    iput-wide v2, v1, Lcom/ishumei/smantifraud/l1111l111111Il/l1111l111111Il;->l11l111ll1Il:J
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    monitor-exit p0

    return-object v0

    :cond_2e
    :try_start_8
    new-instance v2, Ljava/lang/Exception;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "error ret: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v2

    :catchall_2
    move-exception v0

    sget-object v2, Lcom/ishumei/smantifraud/l1111l111111Il/l1111l111111Il;->l11l111l1I1l:Ljava/lang/StringBuilder;

    if-eqz v2, :cond_2f

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Lcom/ishumei/smantifraud/l1111l111111Il/l111l11111I1l;->l11l11l1I11l(Ljava/lang/String;)V

    :cond_2f
    throw v0

    :goto_f
    monitor-exit p0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    throw v0
.end method

.method public final declared-synchronized l111l11111I1l()Ljava/lang/String;
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    .line 3
    :try_start_0
    iget-object v0, p0, Lcom/ishumei/smantifraud/l1111l111111Il/l1111l111111Il;->l11l111l1Il:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 4
    monitor-exit p0

    .line 5
    return-object v0

    .line 6
    :catchall_0
    move-exception v0

    .line 7
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 8
    throw v0
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

.method public final l111l11111lIl()Z
    .locals 1

    .line 2
    iget-boolean v0, p0, Lcom/ishumei/smantifraud/l1111l111111Il/l1111l111111Il;->l11l111ll11l:Z

    return v0
.end method
