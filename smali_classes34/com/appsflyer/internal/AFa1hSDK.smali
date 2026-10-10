.class public Lcom/appsflyer/internal/AFa1hSDK;
.super Ljava/lang/Object;


# static fields
.field private static final $$a:[B = null

.field private static final $$b:I = 0x0

.field private static $10:I = 0x0

.field private static $11:I = 0x1

.field private static $12:I = 0x0

.field private static $13:I = 0x1

.field public static final AFLogger:Ljava/util/Map;

.field private static afDebugLog:J

.field private static afErrorLog:I

.field private static afErrorLogForExcManagerOnly:[B

.field private static afInfoLog:J

.field private static afLogForce:I

.field private static afWarnLog:I

.field private static d:Ljava/lang/Object;

.field public static final e:Ljava/util/Map;

.field private static force:I

.field private static i:[B

.field private static unregisterClient:[B

.field private static v:J

.field private static w:Ljava/lang/Object;


# direct methods
.method private static $$c(BSI)Ljava/lang/String;
    .locals 7

    .line 1
    .line 2
    sget v0, Lcom/appsflyer/internal/AFa1hSDK;->$12:I

    .line 3
    .line 4
    add-int/lit8 v0, v0, 0x7b

    .line 5
    .line 6
    rem-int/lit16 v1, v0, 0x80

    .line 7
    .line 8
    sput v1, Lcom/appsflyer/internal/AFa1hSDK;->$13:I

    .line 9
    .line 10
    rem-int/lit8 v0, v0, 0x2

    .line 11
    const/4 v2, 0x0

    .line 12
    const/4 v3, 0x1

    .line 13
    .line 14
    if-nez v0, :cond_1

    .line 15
    .line 16
    add-int/lit8 p2, p2, 0x3f

    .line 17
    .line 18
    const/16 v0, 0x25

    .line 19
    rem-int/2addr v0, p0

    .line 20
    .line 21
    sget-object p0, Lcom/appsflyer/internal/AFa1hSDK;->$$a:[B

    .line 22
    .line 23
    add-int/lit8 v4, p1, 0x19

    .line 24
    .line 25
    new-array v4, v4, [B

    .line 26
    .line 27
    add-int/lit8 p1, p1, 0x6e

    .line 28
    .line 29
    if-nez p0, :cond_0

    .line 30
    move v0, v3

    .line 31
    goto :goto_0

    .line 32
    :cond_0
    move v1, v3

    .line 33
    goto :goto_1

    .line 34
    .line 35
    :cond_1
    add-int/lit8 p2, p2, 0x4

    .line 36
    .line 37
    rsub-int/lit8 v0, p0, 0x77

    .line 38
    .line 39
    sget-object p0, Lcom/appsflyer/internal/AFa1hSDK;->$$a:[B

    .line 40
    .line 41
    add-int/lit8 v4, p1, 0x1

    .line 42
    .line 43
    new-array v4, v4, [B

    .line 44
    .line 45
    if-nez p0, :cond_2

    .line 46
    move v0, v2

    .line 47
    .line 48
    :goto_0
    add-int/lit8 v1, v1, 0x13

    .line 49
    .line 50
    rem-int/lit16 v1, v1, 0x80

    .line 51
    .line 52
    sput v1, Lcom/appsflyer/internal/AFa1hSDK;->$12:I

    .line 53
    move v1, p2

    .line 54
    move-object v5, v4

    .line 55
    move p2, p1

    .line 56
    move v4, v0

    .line 57
    move v0, v1

    .line 58
    goto :goto_2

    .line 59
    :cond_2
    move v1, v2

    .line 60
    :goto_1
    add-int/2addr p2, v3

    .line 61
    int-to-byte v5, v0

    .line 62
    .line 63
    aput-byte v5, v4, v1

    .line 64
    .line 65
    if-ne v1, p1, :cond_3

    .line 66
    .line 67
    new-instance p0, Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    invoke-direct {p0, v4, v2}, Ljava/lang/String;-><init>([BI)V

    .line 71
    return-object p0

    .line 72
    .line 73
    :cond_3
    add-int/lit8 v1, v1, 0x1

    .line 74
    .line 75
    aget-byte v5, p0, p2

    .line 76
    move v6, p2

    .line 77
    move p2, p1

    .line 78
    move p1, v5

    .line 79
    move-object v5, v4

    .line 80
    move v4, v1

    .line 81
    move v1, v6

    .line 82
    :goto_2
    neg-int p1, p1

    .line 83
    add-int/2addr v0, p1

    .line 84
    .line 85
    add-int/lit8 v0, v0, -0x1

    .line 86
    move p1, p2

    .line 87
    move p2, v1

    .line 88
    move v1, v4

    .line 89
    move-object v4, v5

    .line 90
    goto :goto_1
    .line 91
    .line 92
    .line 93
.end method

.method static constructor <clinit>()V
    .locals 72

    const-class v1, Lcom/appsflyer/internal/AFa1hSDK;

    const-class v2, Ljava/lang/Throwable;

    const/16 v0, 0xc1

    const-class v7, Ljava/lang/Class;

    const/16 v10, 0x11a

    const/4 v13, 0x0

    const/4 v14, 0x7

    const/16 v16, 0x463

    const/4 v4, 0x1

    const/16 v17, 0x9f

    const-class v5, [B

    invoke-static {}, Lcom/appsflyer/internal/AFa1hSDK;->init$0()V

    const/16 v18, 0x93

    .line 1
    :try_start_0
    invoke-static/range {v18 .. v18}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v18

    const/16 v19, 0x30

    filled-new-array/range {v18 .. v18}, [Ljava/lang/Object;

    move-result-object v6

    sget-object v18, Lcom/appsflyer/internal/AFa1hSDK;->$$a:[B

    const/16 v20, 0x11f

    const/16 v21, 0x66

    aget-byte v8, v18, v20

    int-to-byte v8, v8

    const/16 v22, 0x144

    aget-byte v9, v18, v10

    int-to-byte v9, v9

    const/16 v23, 0x20

    move/from16 v24, v10

    aget-byte v10, v18, v23

    int-to-short v10, v10

    invoke-static {v8, v9, v10}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(BSI)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v8

    const/16 v9, 0x8

    aget-byte v10, v18, v9

    int-to-byte v10, v10

    move/from16 v23, v9

    aget-byte v9, v18, v14

    int-to-byte v9, v9

    const/16 v25, 0xc8

    const/16 v26, 0x4

    aget-byte v12, v18, v25

    int-to-short v12, v12

    invoke-static {v10, v9, v12}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(BSI)Ljava/lang/String;

    move-result-object v9

    sget-object v10, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    filled-new-array {v10}, [Ljava/lang/Class;

    move-result-object v10

    invoke-virtual {v8, v9, v10}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v8

    const/4 v9, 0x0

    invoke-virtual {v8, v9, v6}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Integer;

    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    move-result v6
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_62

    const/4 v8, 0x6

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v11

    long-to-int v10, v11

    const v11, -0x18520835

    xor-int v12, v11, v10

    and-int/2addr v11, v10

    or-int/2addr v11, v12

    not-int v11, v11

    const v12, 0x20846109

    or-int/2addr v11, v12

    mul-int/lit16 v11, v11, -0x2f4

    neg-int v11, v11

    neg-int v11, v11

    const v12, -0x1e9edc14

    or-int v27, v12, v11

    shl-int/lit8 v27, v27, 0x1

    xor-int/2addr v11, v12

    sub-int v27, v27, v11

    not-int v10, v10

    const v11, -0x18520835

    xor-int v12, v11, v10

    and-int/2addr v10, v11

    or-int/2addr v10, v12

    mul-int/lit16 v10, v10, 0x2f4

    xor-int v11, v27, v10

    and-int v10, v27, v10

    shl-int/2addr v10, v4

    add-int/2addr v11, v10

    const v10, -0x5fffa3ac

    xor-int v12, v6, v10

    and-int/2addr v10, v6

    or-int/2addr v10, v12

    const v12, 0x50588082

    xor-int v27, v10, v12

    and-int/2addr v10, v12

    or-int v10, v27, v10

    mul-int/lit16 v10, v10, 0x266

    neg-int v10, v10

    neg-int v10, v10

    or-int v12, v11, v10

    shl-int/2addr v12, v4

    xor-int/2addr v10, v11

    sub-int/2addr v12, v10

    not-int v10, v6

    const v11, 0x5a5f8282

    xor-int v27, v11, v10

    and-int/2addr v11, v10

    or-int v11, v27, v11

    not-int v11, v11

    const v27, -0x5fffa3ac

    xor-int v28, v11, v27

    and-int v11, v11, v27

    or-int v11, v28, v11

    not-int v6, v6

    const v27, 0x55f8a1ab

    move/from16 v28, v8

    or-int v8, v6, v27

    not-int v8, v8

    xor-int v29, v11, v8

    and-int/2addr v8, v11

    or-int v8, v29, v8

    mul-int/lit16 v8, v8, -0x4cc

    neg-int v8, v8

    neg-int v8, v8

    or-int v11, v12, v8

    shl-int/2addr v11, v4

    xor-int/2addr v8, v12

    sub-int/2addr v11, v8

    const v8, -0x5a0212a

    xor-int v12, v8, v10

    and-int/2addr v8, v10

    or-int/2addr v8, v12

    not-int v8, v8

    const v10, -0x5a5f8283

    xor-int v12, v6, v10

    and-int/2addr v6, v10

    or-int/2addr v6, v12

    xor-int v10, v6, v27

    and-int v6, v6, v27

    or-int/2addr v6, v10

    not-int v6, v6

    xor-int v10, v8, v6

    and-int/2addr v6, v8

    or-int/2addr v6, v10

    mul-int/lit16 v8, v6, 0x266

    move v12, v4

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    long-to-int v3, v3

    const v4, 0x5e238

    mul-int/2addr v6, v4

    mul-int/lit16 v4, v11, 0x274

    not-int v4, v4

    sub-int/2addr v6, v4

    sub-int/2addr v6, v12

    or-int v4, v11, v3

    not-int v10, v8

    xor-int v29, v4, v10

    and-int/2addr v4, v10

    or-int v4, v29, v4

    mul-int/lit16 v4, v4, -0x273

    or-int v10, v6, v4

    shl-int/2addr v10, v12

    xor-int/2addr v4, v6

    sub-int/2addr v10, v4

    not-int v4, v11

    or-int/2addr v4, v3

    not-int v4, v4

    xor-int v6, v8, v4

    and-int/2addr v4, v8

    or-int/2addr v4, v6

    mul-int/lit16 v4, v4, -0x273

    or-int v6, v10, v4

    shl-int/2addr v6, v12

    xor-int/2addr v4, v10

    sub-int/2addr v6, v4

    not-int v4, v3

    xor-int v10, v4, v11

    and-int/2addr v4, v11

    or-int/2addr v4, v10

    not-int v4, v4

    or-int/2addr v3, v8

    not-int v3, v3

    or-int/2addr v3, v4

    mul-int/lit16 v3, v3, 0x273

    neg-int v3, v3

    neg-int v3, v3

    xor-int v4, v6, v3

    and-int/2addr v3, v6

    shl-int/2addr v3, v12

    add-int/2addr v4, v3

    if-nez v4, :cond_0

    goto/16 :goto_6d

    :cond_0
    const-wide v3, -0x11c92c2483905982L    # -8.251567389252479E222

    sput-wide v3, Lcom/appsflyer/internal/AFa1hSDK;->afInfoLog:J

    sput v13, Lcom/appsflyer/internal/AFa1hSDK;->afLogForce:I

    const/4 v3, 0x2

    sput v3, Lcom/appsflyer/internal/AFa1hSDK;->afWarnLog:I

    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    sput-object v4, Lcom/appsflyer/internal/AFa1hSDK;->AFLogger:Ljava/util/Map;

    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    sput-object v4, Lcom/appsflyer/internal/AFa1hSDK;->e:Ljava/util/Map;

    :try_start_1
    aget-byte v4, v18, v25

    int-to-byte v4, v4

    const/16 v6, 0xaf

    aget-byte v6, v18, v6

    int-to-byte v6, v6

    aget-byte v8, v18, v20

    int-to-short v8, v8

    invoke-static {v4, v6, v8}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(BSI)Ljava/lang/String;

    move-result-object v4

    sget-object v6, Lcom/appsflyer/internal/AFa1hSDK;->d:Ljava/lang/Object;

    if-nez v6, :cond_1

    aget-byte v6, v18, v25

    int-to-byte v6, v6

    const/16 v8, 0x19

    aget-byte v8, v18, v8

    int-to-byte v8, v8

    const/16 v10, 0xbc

    aget-byte v10, v18, v10

    neg-int v10, v10

    int-to-short v10, v10

    invoke-static {v6, v8, v10}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(BSI)Ljava/lang/String;

    move-result-object v6
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_16

    goto :goto_0

    :cond_1
    move-object v6, v9

    .line 2
    :goto_0
    :try_start_2
    aget-byte v10, v18, v20

    int-to-byte v10, v10

    const/16 v11, 0xcd

    aget-byte v11, v18, v11
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    neg-int v11, v11

    int-to-byte v11, v11

    const/16 v29, 0x27

    const/16 v30, 0xd

    :try_start_3
    aget-byte v8, v18, v29

    int-to-short v8, v8

    invoke-static {v10, v11, v8}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(BSI)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v8

    aget-byte v10, v18, v25

    int-to-byte v10, v10

    const/16 v11, 0x488

    aget-byte v11, v18, v11
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    int-to-byte v11, v11

    move/from16 v18, v12

    or-int/lit8 v12, v11, 0x4a

    int-to-short v12, v12

    :try_start_4
    invoke-static {v10, v11, v12}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(BSI)Ljava/lang/String;

    move-result-object v10

    new-array v11, v13, [Ljava/lang/Class;

    invoke-virtual {v8, v10, v11}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v8

    invoke-virtual {v8, v9, v9}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_2

    if-eqz v8, :cond_2

    .line 3
    sget v10, Lcom/appsflyer/internal/AFa1hSDK;->$11:I

    and-int/lit8 v11, v10, 0x21

    or-int/lit8 v10, v10, 0x21

    add-int/2addr v11, v10

    rem-int/lit16 v11, v11, 0x80

    sput v11, Lcom/appsflyer/internal/AFa1hSDK;->$10:I

    goto :goto_2

    :catch_0
    move/from16 v18, v12

    goto :goto_1

    :catch_1
    move/from16 v18, v12

    const/16 v30, 0xd

    :catch_2
    :goto_1
    move-object v8, v9

    .line 4
    :cond_2
    :try_start_5
    sget-object v10, Lcom/appsflyer/internal/AFa1hSDK;->$$a:[B

    aget-byte v11, v10, v20

    int-to-byte v11, v11

    aget-byte v12, v10, v24

    int-to-byte v12, v12

    const/16 v15, 0x6c

    int-to-short v15, v15

    invoke-static {v11, v12, v15}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(BSI)Ljava/lang/String;

    move-result-object v11

    invoke-static {v11}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v11

    aget-byte v12, v10, v30

    int-to-byte v12, v12

    aget-byte v10, v10, v25

    int-to-byte v10, v10

    const/16 v15, 0x81

    int-to-short v15, v15

    invoke-static {v12, v10, v15}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(BSI)Ljava/lang/String;

    move-result-object v10

    new-array v12, v13, [Ljava/lang/Class;

    invoke-virtual {v11, v10, v12}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v10

    invoke-virtual {v10, v9, v9}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_3

    :catch_3
    :goto_2
    const/16 v11, 0x55

    if-eqz v8, :cond_3

    .line 5
    sget v10, Lcom/appsflyer/internal/AFa1hSDK;->$11:I

    or-int/lit8 v12, v10, 0x5f

    shl-int/lit8 v12, v12, 0x1

    xor-int/lit8 v10, v10, 0x5f

    sub-int/2addr v12, v10

    rem-int/lit16 v12, v12, 0x80

    sput v12, Lcom/appsflyer/internal/AFa1hSDK;->$10:I

    :try_start_6
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v10

    sget-object v12, Lcom/appsflyer/internal/AFa1hSDK;->$$a:[B

    aget-byte v15, v12, v30

    int-to-byte v15, v15

    aget-byte v12, v12, v11
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_5

    int-to-byte v12, v12

    move/from16 v31, v11

    const/16 v11, 0x95

    int-to-short v11, v11

    :try_start_7
    invoke-static {v15, v12, v11}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(BSI)Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v10, v11, v9}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v10

    invoke-virtual {v10, v8, v9}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_4

    goto :goto_4

    :catch_4
    :goto_3
    move-object v10, v9

    goto :goto_4

    :catch_5
    :cond_3
    move/from16 v31, v11

    goto :goto_3

    :goto_4
    if-eqz v8, :cond_5

    sget v11, Lcom/appsflyer/internal/AFa1hSDK;->$10:I

    add-int/lit8 v11, v11, 0x11

    rem-int/lit16 v12, v11, 0x80

    sput v12, Lcom/appsflyer/internal/AFa1hSDK;->$11:I

    rem-int/2addr v11, v3

    if-nez v11, :cond_4

    :try_start_8
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v11

    sget-object v12, Lcom/appsflyer/internal/AFa1hSDK;->$$a:[B

    const/16 v15, 0x7f

    aget-byte v15, v12, v15

    int-to-byte v15, v15

    const/16 v32, 0x13

    aget-byte v12, v12, v32
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_6

    int-to-byte v12, v12

    move/from16 v32, v13

    xor-int/lit16 v13, v12, 0x2ef5

    and-int/lit16 v14, v12, 0x2ef5

    or-int/2addr v13, v14

    int-to-short v13, v13

    :try_start_9
    invoke-static {v15, v12, v13}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(BSI)Ljava/lang/String;

    move-result-object v12

    :goto_5
    invoke-virtual {v11, v12, v9}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v11

    invoke-virtual {v11, v8, v9}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    goto :goto_7

    :catch_6
    move/from16 v32, v13

    goto :goto_6

    :cond_4
    move/from16 v32, v13

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v11

    sget-object v12, Lcom/appsflyer/internal/AFa1hSDK;->$$a:[B

    aget-byte v13, v12, v30

    int-to-byte v13, v13

    const/16 v14, 0x2b

    aget-byte v12, v12, v14

    int-to-byte v12, v12

    xor-int/lit16 v14, v12, 0x91

    and-int/lit16 v15, v12, 0x91

    or-int/2addr v14, v15

    int-to-short v14, v14

    invoke-static {v13, v12, v14}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(BSI)Ljava/lang/String;

    move-result-object v12
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_7

    goto :goto_5

    :catch_7
    :goto_6
    move-object v11, v9

    goto :goto_8

    :cond_5
    move/from16 v32, v13

    move-object v11, v9

    :goto_7
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    :goto_8
    if-eqz v8, :cond_6

    :try_start_a
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v12

    sget-object v14, Lcom/appsflyer/internal/AFa1hSDK;->$$a:[B

    aget-byte v15, v14, v30

    int-to-byte v15, v15

    aget-byte v14, v14, v31
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_a

    int-to-byte v14, v14

    const/16 v34, 0x2d

    :try_start_b
    sget v13, Lcom/appsflyer/internal/AFa1hSDK;->$$b:I
    :try_end_b
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_8

    move/from16 v35, v3

    move-object/from16 v36, v4

    :try_start_c
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    long-to-int v3, v3

    mul-int/lit8 v4, v13, 0x2e

    not-int v9, v13

    add-int/lit8 v4, v4, 0x2c

    move/from16 v38, v4

    not-int v4, v13

    xor-int v39, v4, v3

    and-int/2addr v4, v3

    or-int v4, v39, v4

    not-int v4, v4

    const/16 v39, -0x1

    xor-int v39, v39, v13

    or-int v13, v39, v13

    not-int v13, v13

    xor-int v39, v4, v13

    and-int/2addr v4, v13

    or-int v4, v39, v4

    mul-int/lit8 v4, v4, -0x2d

    not-int v4, v4

    sub-int v4, v38, v4

    add-int/lit8 v4, v4, -0x1

    not-int v3, v3

    or-int/2addr v3, v9

    mul-int/lit8 v3, v3, 0x2d

    neg-int v3, v3

    neg-int v3, v3

    or-int v9, v4, v3

    shl-int/lit8 v9, v9, 0x1

    xor-int/2addr v3, v4

    sub-int/2addr v9, v3

    int-to-short v3, v9

    invoke-static {v15, v14, v3}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(BSI)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    invoke-virtual {v12, v3, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v3

    invoke-virtual {v3, v8, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3
    :try_end_c
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_c} :catch_9

    goto :goto_a

    :catch_8
    move/from16 v35, v3

    move-object/from16 v36, v4

    :catch_9
    :goto_9
    const/4 v3, 0x0

    goto :goto_a

    :catch_a
    :cond_6
    move/from16 v35, v3

    move-object/from16 v36, v4

    const/16 v34, 0x2d

    goto :goto_9

    :goto_a
    const-class v4, Ljava/lang/String;

    const/16 v8, 0xdb

    const/16 v9, 0x164

    if-eqz v10, :cond_7

    goto :goto_b

    :cond_7
    if-nez v6, :cond_9

    sget v6, Lcom/appsflyer/internal/AFa1hSDK;->$10:I

    add-int/lit8 v6, v6, 0x47

    rem-int/lit16 v10, v6, 0x80

    sput v10, Lcom/appsflyer/internal/AFa1hSDK;->$11:I

    rem-int/lit8 v6, v6, 0x2

    if-eqz v6, :cond_8

    const/4 v10, 0x0

    goto :goto_b

    :cond_8
    const/16 v37, 0x0

    :try_start_d
    throw v37
    :try_end_d
    .catch Ljava/lang/Exception; {:try_start_d .. :try_end_d} :catch_16
    .catchall {:try_start_d .. :try_end_d} :catchall_0

    :catchall_0
    move-exception v0

    throw v0

    :cond_9
    :try_start_e
    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v12, Lcom/appsflyer/internal/AFa1hSDK;->$$a:[B

    const/16 v13, 0x2de

    aget-byte v13, v12, v13

    neg-int v13, v13

    int-to-byte v13, v13

    aget-byte v14, v12, v31

    int-to-byte v14, v14

    const/16 v15, 0xb7

    int-to-short v15, v15

    invoke-static {v13, v14, v15}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(BSI)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v10, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6
    :try_end_e
    .catch Ljava/lang/Exception; {:try_start_e .. :try_end_e} :catch_16

    :try_start_f
    filled-new-array {v6}, [Ljava/lang/Object;

    move-result-object v6

    aget-byte v10, v12, v9

    int-to-byte v10, v10

    aget-byte v12, v12, v8

    int-to-byte v12, v12

    int-to-short v13, v0

    invoke-static {v10, v12, v13}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(BSI)Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v10

    filled-new-array {v4}, [Ljava/lang/Class;

    move-result-object v12

    invoke-virtual {v10, v12}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v10

    invoke-virtual {v10, v6}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_61

    :goto_b
    if-eqz v3, :cond_a

    goto :goto_c

    :cond_a
    :try_start_10
    sget-object v3, Lcom/appsflyer/internal/AFa1hSDK;->$$a:[B

    aget-byte v6, v3, v9

    int-to-byte v6, v6

    int-to-byte v12, v6

    const/16 v13, 0xcc

    int-to-short v13, v13

    invoke-static {v6, v12, v13}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(BSI)Ljava/lang/String;

    move-result-object v6
    :try_end_10
    .catch Ljava/lang/Exception; {:try_start_10 .. :try_end_10} :catch_16

    sget v12, Lcom/appsflyer/internal/AFa1hSDK;->$11:I

    xor-int/lit8 v13, v12, 0x77

    and-int/lit8 v12, v12, 0x77

    shl-int/lit8 v12, v12, 0x1

    add-int/2addr v13, v12

    rem-int/lit16 v13, v13, 0x80

    sput v13, Lcom/appsflyer/internal/AFa1hSDK;->$10:I

    :try_start_11
    filled-new-array {v6}, [Ljava/lang/Object;

    move-result-object v6

    aget-byte v12, v3, v9

    int-to-byte v12, v12

    const/16 v13, 0x296

    aget-byte v13, v3, v13

    int-to-byte v13, v13

    const/16 v14, 0xd9

    int-to-short v14, v14

    invoke-static {v12, v13, v14}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(BSI)Ljava/lang/String;

    move-result-object v12

    invoke-static {v12}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v12

    aget-byte v13, v3, v30

    int-to-byte v13, v13

    aget-byte v14, v3, v31

    int-to-byte v14, v14

    const/16 v15, 0xe8

    int-to-short v15, v15

    invoke-static {v13, v14, v15}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(BSI)Ljava/lang/String;

    move-result-object v13

    filled-new-array {v4}, [Ljava/lang/Class;

    move-result-object v14

    invoke-virtual {v12, v13, v14}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v12

    const/4 v13, 0x0

    invoke-virtual {v12, v13, v6}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_60

    :try_start_12
    filled-new-array {v6}, [Ljava/lang/Object;

    move-result-object v6

    aget-byte v12, v3, v9

    int-to-byte v12, v12

    aget-byte v3, v3, v8

    int-to-byte v3, v3

    int-to-short v13, v0

    invoke-static {v12, v3, v13}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(BSI)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v3

    filled-new-array {v4}, [Ljava/lang/Class;

    move-result-object v12

    invoke-virtual {v3, v12}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v3

    invoke-virtual {v3, v6}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_5f

    :goto_c
    const/4 v6, 0x5

    if-nez v11, :cond_c

    if-eqz v10, :cond_c

    :try_start_13
    sget-object v11, Lcom/appsflyer/internal/AFa1hSDK;->$$a:[B

    aget-byte v12, v11, v25

    int-to-byte v12, v12

    aget-byte v13, v11, v6

    int-to-byte v13, v13

    const/16 v14, 0xf2

    int-to-short v14, v14

    invoke-static {v12, v13, v14}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(BSI)Ljava/lang/String;

    move-result-object v12
    :try_end_13
    .catch Ljava/lang/Exception; {:try_start_13 .. :try_end_13} :catch_16

    move/from16 v13, v35

    :try_start_14
    new-array v14, v13, [Ljava/lang/Object;

    aput-object v12, v14, v18

    aput-object v10, v14, v32

    aget-byte v12, v11, v9

    int-to-byte v12, v12

    aget-byte v13, v11, v8

    int-to-byte v13, v13

    int-to-short v15, v0

    invoke-static {v12, v13, v15}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(BSI)Ljava/lang/String;

    move-result-object v12

    invoke-static {v12}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v12

    aget-byte v13, v11, v9

    int-to-byte v13, v13

    aget-byte v11, v11, v8

    int-to-byte v11, v11

    invoke-static {v13, v11, v15}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(BSI)Ljava/lang/String;

    move-result-object v11

    invoke-static {v11}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v11

    filled-new-array {v11, v4}, [Ljava/lang/Class;

    move-result-object v11

    invoke-virtual {v12, v11}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v11

    invoke-virtual {v11, v14}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_1

    goto :goto_d

    :catchall_1
    move-exception v0

    :try_start_15
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_b

    throw v1

    :cond_b
    throw v0

    :cond_c
    :goto_d
    sget-object v12, Lcom/appsflyer/internal/AFa1hSDK;->$$a:[B

    aget-byte v13, v12, v9

    int-to-byte v13, v13

    aget-byte v14, v12, v8

    int-to-byte v14, v14

    int-to-short v15, v0

    invoke-static {v13, v14, v15}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(BSI)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    const/4 v13, 0x7

    invoke-static {v0, v13}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;I)Ljava/lang/Object;

    move-result-object v0

    move-object v13, v0

    check-cast v13, [Ljava/lang/Object;

    const/16 v37, 0x0

    aput-object v37, v13, v32

    aput-object v11, v13, v18

    const/16 v35, 0x2

    aput-object v10, v13, v35

    const/4 v14, 0x3

    aput-object v3, v13, v14

    aput-object v11, v13, v26

    aput-object v10, v13, v6

    aput-object v3, v13, v28

    const/4 v3, 0x7

    new-array v11, v3, [Z

    fill-array-data v11, :array_0

    new-array v10, v3, [Z

    fill-array-data v10, :array_1

    move/from16 v38, v8

    new-array v8, v3, [Z

    aput-boolean v32, v8, v32

    aput-boolean v32, v8, v18

    const/16 v35, 0x2

    aput-boolean v18, v8, v35

    aput-boolean v18, v8, v14

    aput-boolean v32, v8, v26

    aput-boolean v18, v8, v6

    aput-boolean v18, v8, v28
    :try_end_15
    .catch Ljava/lang/Exception; {:try_start_15 .. :try_end_15} :catch_16

    const/16 v3, 0x1a

    :try_start_16
    aget-byte v0, v12, v20

    int-to-byte v0, v0

    aget-byte v14, v12, v22

    int-to-byte v14, v14

    const/16 v6, 0xfb

    int-to-short v6, v6

    invoke-static {v0, v14, v6}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(BSI)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    const/16 v6, 0x5a

    aget-byte v6, v12, v6

    int-to-byte v6, v6

    aget-byte v12, v12, v17

    int-to-byte v12, v12

    const/16 v14, 0x112

    int-to-short v14, v14

    invoke-static {v6, v12, v14}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(BSI)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v0, v6}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v6

    invoke-virtual {v6, v0}, Ljava/lang/reflect/Field;->getInt(Ljava/lang/Object;)I

    move-result v0
    :try_end_16
    .catch Ljava/lang/ClassNotFoundException; {:try_start_16 .. :try_end_16} :catch_c
    .catch Ljava/lang/Exception; {:try_start_16 .. :try_end_16} :catch_16

    const/16 v6, 0x22

    if-lt v0, v6, :cond_d

    move/from16 v12, v18

    goto :goto_e

    :cond_d
    move/from16 v12, v32

    :goto_e
    const/16 v6, 0x1d

    if-ne v0, v6, :cond_e

    goto :goto_f

    :cond_e
    if-lt v0, v3, :cond_f

    move/from16 v6, v18

    goto :goto_10

    :cond_f
    :goto_f
    move/from16 v6, v32

    :goto_10
    :try_start_17
    aput-boolean v6, v8, v32
    :try_end_17
    .catch Ljava/lang/ClassNotFoundException; {:try_start_17 .. :try_end_17} :catch_b
    .catch Ljava/lang/Exception; {:try_start_17 .. :try_end_17} :catch_16

    const/16 v6, 0x15

    if-lt v0, v6, :cond_10

    sget v6, Lcom/appsflyer/internal/AFa1hSDK;->$11:I

    add-int/lit8 v6, v6, 0x59

    rem-int/lit16 v14, v6, 0x80

    sput v14, Lcom/appsflyer/internal/AFa1hSDK;->$10:I

    const/16 v35, 0x2

    rem-int/lit8 v6, v6, 0x2

    if-eqz v6, :cond_11

    :cond_10
    move/from16 v6, v32

    goto :goto_11

    :cond_11
    move/from16 v6, v18

    :goto_11
    :try_start_18
    aput-boolean v6, v8, v18

    const/16 v6, 0x15

    if-lt v0, v6, :cond_12

    move/from16 v0, v18

    goto :goto_12

    :cond_12
    move/from16 v0, v32

    :goto_12
    aput-boolean v0, v8, v26
    :try_end_18
    .catch Ljava/lang/ClassNotFoundException; {:try_start_18 .. :try_end_18} :catch_b
    .catch Ljava/lang/Exception; {:try_start_18 .. :try_end_18} :catch_16

    :catch_b
    :goto_13
    move v6, v12

    goto :goto_14

    :catch_c
    move/from16 v12, v32

    goto :goto_13

    :goto_14
    move/from16 v12, v32

    move v14, v12

    :goto_15
    if-nez v14, :cond_62

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move/from16 v41, v9

    const/16 v9, 0x9

    if-ge v12, v9, :cond_62

    :try_start_19
    aget-boolean v0, v8, v12
    :try_end_19
    .catch Ljava/lang/Exception; {:try_start_19 .. :try_end_19} :catch_16

    move/from16 v42, v9

    move/from16 v9, v18

    if-eq v0, v9, :cond_13

    move v9, v12

    move-object/from16 v37, v2

    move-object v2, v1

    move-object/from16 v1, v37

    move/from16 v46, v3

    move-object/from16 v64, v5

    move/from16 v45, v6

    move-object/from16 v49, v8

    move/from16 v47, v9

    move-object/from16 v48, v10

    move-object/from16 v55, v11

    move-object/from16 v44, v13

    move/from16 v54, v14

    move/from16 v62, v15

    const/4 v13, 0x7

    const/16 v37, 0x0

    const/16 v39, 0x3

    const/16 v40, 0x5

    const/16 v56, 0x10

    goto/16 :goto_6b

    :cond_13
    move v9, v12

    const/16 v18, 0xbf

    :try_start_1a
    aget-boolean v12, v11, v9

    aget-object v0, v13, v9

    aget-boolean v44, v10, v9
    :try_end_1a
    .catchall {:try_start_1a .. :try_end_1a} :catchall_5d

    if-eqz v12, :cond_19

    if-eqz v0, :cond_16

    sget v45, Lcom/appsflyer/internal/AFa1hSDK;->$11:I

    move/from16 v46, v3

    add-int/lit8 v3, v45, 0x4d

    move/from16 v45, v6

    rem-int/lit16 v6, v3, 0x80

    sput v6, Lcom/appsflyer/internal/AFa1hSDK;->$10:I

    const/16 v35, 0x2

    rem-int/lit8 v3, v3, 0x2

    if-eqz v3, :cond_14

    const/16 v3, 0x24

    :try_start_1b
    div-int/lit8 v3, v3, 0x0
    :try_end_1b
    .catchall {:try_start_1b .. :try_end_1b} :catchall_2

    goto :goto_19

    :catchall_2
    move-exception v0

    move-object/from16 v39, v2

    move-object v2, v1

    move-object/from16 v1, v39

    move-object/from16 v64, v5

    move-object/from16 v49, v8

    move/from16 v47, v9

    :goto_16
    move-object/from16 v48, v10

    :goto_17
    move-object/from16 v55, v11

    move-object/from16 v44, v13

    move/from16 v54, v14

    move/from16 v62, v15

    const/16 v39, 0x3

    const/16 v40, 0x5

    const/16 v43, 0x1

    :goto_18
    const/16 v56, 0x10

    goto/16 :goto_69

    .line 6
    :cond_14
    :goto_19
    :try_start_1c
    sget-object v3, Lcom/appsflyer/internal/AFa1hSDK;->$$a:[B

    aget-byte v6, v3, v41

    int-to-byte v6, v6

    move-object/from16 v47, v3

    aget-byte v3, v47, v38

    int-to-byte v3, v3

    invoke-static {v6, v3, v15}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(BSI)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v3

    aget-byte v6, v47, v25
    :try_end_1c
    .catchall {:try_start_1c .. :try_end_1c} :catchall_5

    int-to-byte v6, v6

    const/16 v48, 0xf

    move-object/from16 v49, v8

    :try_start_1d
    aget-byte v8, v47, v48
    :try_end_1d
    .catchall {:try_start_1d .. :try_end_1d} :catchall_4

    int-to-byte v8, v8

    move/from16 v47, v9

    const/16 v9, 0x118

    int-to-short v9, v9

    :try_start_1e
    invoke-static {v6, v8, v9}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(BSI)Ljava/lang/String;

    move-result-object v6

    const/4 v8, 0x0

    invoke-virtual {v3, v6, v8}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v3

    invoke-virtual {v3, v0, v8}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3
    :try_end_1e
    .catchall {:try_start_1e .. :try_end_1e} :catchall_3

    if-eqz v3, :cond_17

    goto/16 :goto_1c

    :catchall_3
    move-exception v0

    goto :goto_1b

    :catchall_4
    move-exception v0

    :goto_1a
    move/from16 v47, v9

    goto :goto_1b

    :catchall_5
    move-exception v0

    move-object/from16 v49, v8

    goto :goto_1a

    :goto_1b
    :try_start_1f
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v3

    if-eqz v3, :cond_15

    throw v3

    :catchall_6
    move-exception v0

    move-object/from16 v39, v2

    move-object v2, v1

    move-object/from16 v1, v39

    move-object/from16 v64, v5

    goto :goto_16

    :cond_15
    throw v0

    :cond_16
    move/from16 v46, v3

    move/from16 v45, v6

    move-object/from16 v49, v8

    move/from16 v47, v9

    :cond_17
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v6, Lcom/appsflyer/internal/AFa1hSDK;->$$a:[B

    aget-byte v8, v6, v21

    int-to-byte v8, v8

    aget-byte v9, v6, v42

    int-to-byte v9, v9

    xor-int/lit16 v12, v9, 0x11b

    move-object/from16 v44, v6

    and-int/lit16 v6, v9, 0x11b

    or-int/2addr v6, v12

    int-to-short v6, v6

    invoke-static {v8, v9, v6}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(BSI)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    aget-byte v0, v44, v16

    int-to-byte v0, v0

    aget-byte v6, v44, v46

    int-to-byte v6, v6

    const/16 v8, 0x123

    xor-int/lit16 v9, v6, 0x123

    and-int/lit16 v12, v6, 0x123

    or-int v8, v9, v12

    int-to-short v8, v8

    invoke-static {v0, v6, v8}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(BSI)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0
    :try_end_1f
    .catchall {:try_start_1f .. :try_end_1f} :catchall_6

    :try_start_20
    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    aget-byte v3, v44, v41

    int-to-byte v3, v3

    aget-byte v6, v44, v18

    int-to-byte v6, v6

    const/16 v8, 0x123

    int-to-short v9, v8

    invoke-static {v3, v6, v9}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(BSI)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v3

    filled-new-array {v4}, [Ljava/lang/Class;

    move-result-object v6

    invoke-virtual {v3, v6}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v3

    invoke-virtual {v3, v0}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Throwable;

    throw v0
    :try_end_20
    .catchall {:try_start_20 .. :try_end_20} :catchall_7

    :catchall_7
    move-exception v0

    :try_start_21
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v3

    if-eqz v3, :cond_18

    throw v3

    :cond_18
    throw v0
    :try_end_21
    .catchall {:try_start_21 .. :try_end_21} :catchall_6

    :cond_19
    move/from16 v46, v3

    move/from16 v45, v6

    move-object/from16 v49, v8

    move/from16 v47, v9

    :goto_1c
    if-eqz v12, :cond_30

    :try_start_22
    new-instance v3, Ljava/util/Random;

    invoke-direct {v3}, Ljava/util/Random;-><init>()V
    :try_end_22
    .catchall {:try_start_22 .. :try_end_22} :catchall_14

    :try_start_23
    sget-object v6, Lcom/appsflyer/internal/AFa1hSDK;->$$a:[B

    aget-byte v8, v6, v41

    int-to-byte v8, v8

    const/16 v9, 0x296

    aget-byte v9, v6, v9

    int-to-byte v9, v9

    move-object/from16 v48, v6

    const/16 v6, 0xd9

    int-to-short v6, v6

    invoke-static {v8, v9, v6}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(BSI)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v6

    aget-byte v8, v48, v25

    int-to-byte v8, v8

    aget-byte v9, v48, v30
    :try_end_23
    .catchall {:try_start_23 .. :try_end_23} :catchall_13

    int-to-byte v9, v9

    move-object/from16 v48, v10

    xor-int/lit16 v10, v9, 0x125

    move/from16 v50, v10

    and-int/lit16 v10, v9, 0x125

    or-int v10, v50, v10

    int-to-short v10, v10

    :try_start_24
    invoke-static {v8, v9, v10}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(BSI)Ljava/lang/String;

    move-result-object v8

    const/4 v9, 0x0

    invoke-virtual {v6, v8, v9}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v6

    invoke-virtual {v6, v9, v9}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Long;

    invoke-virtual {v6}, Ljava/lang/Long;->longValue()J

    move-result-wide v8
    :try_end_24
    .catchall {:try_start_24 .. :try_end_24} :catchall_12

    const-wide/32 v50, -0x6069e416

    xor-long v8, v8, v50

    :try_start_25
    invoke-virtual {v3, v8, v9}, Ljava/util/Random;->setSeed(J)V
    :try_end_25
    .catchall {:try_start_25 .. :try_end_25} :catchall_a

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/16 v50, 0x0

    :goto_1d
    if-nez v6, :cond_2e

    .line 7
    sget v10, Lcom/appsflyer/internal/AFa1hSDK;->$11:I

    xor-int/lit8 v51, v10, 0x31

    and-int/lit8 v10, v10, 0x31

    const/16 v43, 0x1

    shl-int/lit8 v10, v10, 0x1

    add-int v10, v51, v10

    move-object/from16 v51, v6

    rem-int/lit16 v6, v10, 0x80

    sput v6, Lcom/appsflyer/internal/AFa1hSDK;->$10:I

    const/16 v35, 0x2

    rem-int/lit8 v10, v10, 0x2

    if-nez v10, :cond_2d

    if-nez v8, :cond_1a

    move/from16 v6, v28

    goto :goto_1e

    :cond_1a
    if-nez v9, :cond_1b

    const/4 v6, 0x5

    goto :goto_1e

    :cond_1b
    if-nez v50, :cond_1c

    move/from16 v6, v26

    goto :goto_1e

    :cond_1c
    const/4 v6, 0x3

    .line 8
    :goto_1e
    :try_start_26
    new-instance v10, Ljava/lang/StringBuilder;

    move-object/from16 v52, v8

    move-object/from16 v53, v9

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v8

    long-to-int v8, v8

    mul-int/lit16 v9, v6, 0x197

    neg-int v9, v9

    neg-int v9, v9

    const/16 v54, -0x195

    or-int v55, v54, v9

    const/16 v43, 0x1

    shl-int/lit8 v55, v55, 0x1

    xor-int v9, v54, v9

    sub-int v55, v55, v9

    not-int v9, v6

    xor-int v54, v9, v8

    and-int/2addr v9, v8

    or-int v9, v54, v9

    not-int v9, v9

    move/from16 v54, v9

    not-int v9, v8

    xor-int/lit8 v56, v9, 0x1

    and-int/lit8 v57, v9, 0x1

    or-int v56, v56, v57

    move/from16 v57, v9

    or-int v9, v56, v6

    not-int v9, v9

    xor-int v56, v54, v9

    and-int v9, v54, v9

    or-int v9, v56, v9

    mul-int/lit16 v9, v9, -0x196

    neg-int v9, v9

    neg-int v9, v9

    and-int v54, v55, v9

    or-int v9, v55, v9

    add-int v54, v54, v9

    not-int v9, v6

    move/from16 v55, v9

    not-int v9, v8

    or-int v9, v55, v9

    const/16 v43, 0x1

    xor-int/lit8 v55, v9, 0x1

    and-int/lit8 v9, v9, 0x1

    or-int v9, v55, v9

    not-int v9, v9

    mul-int/lit16 v9, v9, -0x196

    and-int v55, v54, v9

    or-int v9, v54, v9

    add-int v55, v55, v9

    const/4 v9, -0x2

    or-int/2addr v8, v9

    not-int v8, v8

    xor-int v9, v57, v6

    and-int v54, v57, v6

    or-int v9, v9, v54

    not-int v9, v9

    or-int/2addr v8, v9

    mul-int/lit16 v8, v8, 0x196

    neg-int v8, v8

    neg-int v8, v8

    and-int v9, v55, v8

    or-int v8, v55, v8

    add-int/2addr v9, v8

    invoke-direct {v10, v9}, Ljava/lang/StringBuilder;-><init>(I)V

    const/16 v8, 0x2e

    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
    :try_end_26
    .catchall {:try_start_26 .. :try_end_26} :catchall_a

    move/from16 v8, v32

    :goto_1f
    if-ge v8, v6, :cond_21

    if-eqz v44, :cond_20

    .line 9
    sget v9, Lcom/appsflyer/internal/AFa1hSDK;->$10:I

    add-int/lit8 v9, v9, 0x3d

    move/from16 v54, v6

    rem-int/lit16 v6, v9, 0x80

    sput v6, Lcom/appsflyer/internal/AFa1hSDK;->$11:I

    const/16 v35, 0x2

    rem-int/lit8 v9, v9, 0x2

    if-nez v9, :cond_1e

    const/16 v6, 0x10

    :try_start_27
    invoke-virtual {v3, v6}, Ljava/util/Random;->nextInt(I)I

    move-result v9

    move-object v6, v10

    invoke-virtual {v3}, Ljava/util/Random;->nextBoolean()Z

    move-result v27
    :try_end_27
    .catchall {:try_start_27 .. :try_end_27} :catchall_8

    if-eqz v27, :cond_1d

    :goto_20
    move-object/from16 v55, v11

    goto :goto_22

    :cond_1d
    :goto_21
    move/from16 v58, v8

    move-object/from16 v55, v11

    goto/16 :goto_24

    :catchall_8
    move-exception v0

    move-object/from16 v39, v2

    move-object v2, v1

    move-object/from16 v1, v39

    move-object/from16 v64, v5

    goto/16 :goto_17

    :cond_1e
    move-object v6, v10

    move/from16 v9, v46

    .line 10
    :try_start_28
    invoke-virtual {v3, v9}, Ljava/util/Random;->nextInt(I)I

    move-result v27

    invoke-virtual {v3}, Ljava/util/Random;->nextBoolean()Z

    move-result v9
    :try_end_28
    .catchall {:try_start_28 .. :try_end_28} :catchall_a

    if-eqz v9, :cond_1f

    move/from16 v9, v27

    goto :goto_20

    :goto_22
    :try_start_29
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v10

    long-to-int v10, v10

    mul-int/lit16 v11, v9, 0x8d

    add-int/lit16 v11, v11, -0x46d7

    xor-int/lit8 v27, v10, 0x41

    and-int/lit8 v57, v10, 0x41

    move/from16 v58, v8

    or-int v8, v27, v57

    mul-int/lit16 v8, v8, 0x8c

    neg-int v8, v8

    neg-int v8, v8

    or-int v27, v11, v8

    const/16 v43, 0x1

    shl-int/lit8 v27, v27, 0x1

    xor-int/2addr v8, v11

    sub-int v27, v27, v8

    not-int v8, v9

    xor-int/lit8 v11, v8, 0x41

    and-int/lit8 v8, v8, 0x41

    or-int/2addr v8, v11

    not-int v11, v8

    move/from16 v57, v8

    not-int v8, v10

    xor-int/lit8 v59, v8, 0x41

    and-int/lit8 v8, v8, 0x41

    or-int v8, v59, v8

    not-int v8, v8

    xor-int v59, v11, v8

    and-int/2addr v8, v11

    or-int v8, v59, v8

    mul-int/lit16 v8, v8, -0x118

    add-int v27, v27, v8

    const/16 v8, -0x42

    xor-int v11, v8, v9

    and-int/2addr v8, v9

    or-int/2addr v8, v11

    not-int v8, v8

    not-int v11, v10

    or-int/2addr v9, v11

    not-int v9, v9

    xor-int v11, v8, v9

    and-int/2addr v8, v9

    or-int/2addr v8, v11

    or-int v9, v57, v10

    not-int v9, v9

    xor-int v10, v8, v9

    and-int/2addr v8, v9

    or-int/2addr v8, v10

    mul-int/lit16 v8, v8, 0x8c

    and-int v9, v27, v8

    or-int v8, v27, v8

    add-int/2addr v9, v8

    goto :goto_25

    :catchall_9
    move-exception v0

    :goto_23
    move-object/from16 v39, v2

    move-object v2, v1

    move-object/from16 v1, v39

    move-object/from16 v64, v5

    move-object/from16 v44, v13

    move/from16 v54, v14

    move/from16 v62, v15

    const/16 v39, 0x3

    const/16 v40, 0x5

    const/16 v43, 0x1

    const/16 v46, 0x1a

    goto/16 :goto_18

    :cond_1f
    move/from16 v9, v27

    goto/16 :goto_21

    :goto_24
    not-int v8, v9

    rsub-int/lit8 v9, v8, 0x5f

    :goto_25
    int-to-char v8, v9

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :goto_26
    const/16 v43, 0x1

    goto :goto_28

    :catchall_a
    move-exception v0

    :goto_27
    move-object/from16 v55, v11

    goto :goto_23

    :cond_20
    move/from16 v54, v6

    move/from16 v58, v8

    move-object v6, v10

    move-object/from16 v55, v11

    const/16 v8, 0xc

    invoke-virtual {v3, v8}, Ljava/util/Random;->nextInt(I)I

    move-result v8

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v9

    long-to-int v9, v9

    mul-int/lit16 v10, v8, -0x2f3

    const v11, -0x5e6000

    xor-int v27, v10, v11

    and-int/2addr v10, v11

    const/16 v43, 0x1

    shl-int/lit8 v10, v10, 0x1

    add-int v27, v27, v10

    not-int v10, v8

    or-int/lit16 v10, v10, -0x2001

    not-int v10, v10

    mul-int/lit16 v10, v10, 0x5e8

    add-int v27, v27, v10

    not-int v10, v8

    xor-int/lit16 v11, v10, -0x2001

    and-int/lit16 v10, v10, -0x2001

    or-int/2addr v10, v11

    not-int v10, v10

    xor-int/lit16 v11, v8, 0x2000

    and-int/lit16 v8, v8, 0x2000

    or-int/2addr v8, v11

    xor-int v11, v8, v9

    and-int v57, v8, v9

    or-int v11, v11, v57

    not-int v11, v11

    or-int/2addr v10, v11

    mul-int/lit16 v10, v10, -0x2f4

    neg-int v10, v10

    neg-int v10, v10

    xor-int v11, v27, v10

    and-int v10, v27, v10

    const/16 v43, 0x1

    shl-int/lit8 v10, v10, 0x1

    add-int/2addr v11, v10

    not-int v9, v9

    xor-int v10, v8, v9

    and-int/2addr v8, v9

    or-int/2addr v8, v10

    mul-int/lit16 v8, v8, 0x2f4

    add-int/2addr v11, v8

    int-to-char v8, v11

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_26

    :goto_28
    and-int/lit8 v8, v58, 0x1

    or-int/lit8 v9, v58, 0x1

    add-int/2addr v8, v9

    move-object v10, v6

    move/from16 v6, v54

    move-object/from16 v11, v55

    const/16 v46, 0x1a

    goto/16 :goto_1f

    :cond_21
    move-object v6, v10

    move-object/from16 v55, v11

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6
    :try_end_29
    .catchall {:try_start_29 .. :try_end_29} :catchall_9

    if-nez v52, :cond_23

    const/4 v8, 0x2

    :try_start_2a
    new-array v9, v8, [Ljava/lang/Object;

    const/16 v43, 0x1

    aput-object v6, v9, v43

    aput-object v0, v9, v32

    sget-object v6, Lcom/appsflyer/internal/AFa1hSDK;->$$a:[B

    aget-byte v8, v6, v41

    int-to-byte v8, v8

    aget-byte v10, v6, v38

    int-to-byte v10, v10

    invoke-static {v8, v10, v15}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(BSI)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v8

    aget-byte v10, v6, v41

    int-to-byte v10, v10

    aget-byte v6, v6, v38

    int-to-byte v6, v6

    invoke-static {v10, v6, v15}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(BSI)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v6

    filled-new-array {v6, v4}, [Ljava/lang/Class;

    move-result-object v6

    invoke-virtual {v8, v6}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v6

    invoke-virtual {v6, v9}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6
    :try_end_2a
    .catchall {:try_start_2a .. :try_end_2a} :catchall_b

    move-object/from16 v27, v3

    move-object v8, v6

    move-object/from16 v6, v51

    :goto_29
    move-object/from16 v9, v53

    goto/16 :goto_2b

    :catchall_b
    move-exception v0

    :try_start_2b
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v3

    if-eqz v3, :cond_22

    throw v3

    :cond_22
    throw v0
    :try_end_2b
    .catchall {:try_start_2b .. :try_end_2b} :catchall_9

    :cond_23
    if-nez v53, :cond_26

    .line 11
    sget v8, Lcom/appsflyer/internal/AFa1hSDK;->$10:I

    or-int/lit8 v9, v8, 0x4b

    const/16 v43, 0x1

    shl-int/lit8 v9, v9, 0x1

    xor-int/lit8 v10, v8, 0x4b

    sub-int/2addr v9, v10

    rem-int/lit16 v10, v9, 0x80

    sput v10, Lcom/appsflyer/internal/AFa1hSDK;->$11:I

    const/16 v35, 0x2

    rem-int/lit8 v9, v9, 0x2

    if-nez v9, :cond_24

    const/16 v9, 0x44

    :try_start_2c
    div-int/lit8 v9, v9, 0x0
    :try_end_2c
    .catchall {:try_start_2c .. :try_end_2c} :catchall_9

    :cond_24
    add-int/lit8 v8, v8, 0x47

    rem-int/lit16 v8, v8, 0x80

    sput v8, Lcom/appsflyer/internal/AFa1hSDK;->$11:I

    const/4 v8, 0x2

    .line 12
    :try_start_2d
    new-array v9, v8, [Ljava/lang/Object;

    const/16 v43, 0x1

    aput-object v6, v9, v43

    aput-object v0, v9, v32

    sget-object v6, Lcom/appsflyer/internal/AFa1hSDK;->$$a:[B

    aget-byte v8, v6, v41

    int-to-byte v8, v8

    aget-byte v10, v6, v38

    int-to-byte v10, v10

    invoke-static {v8, v10, v15}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(BSI)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v8

    aget-byte v10, v6, v41

    int-to-byte v10, v10

    aget-byte v6, v6, v38

    int-to-byte v6, v6

    invoke-static {v10, v6, v15}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(BSI)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v6

    filled-new-array {v6, v4}, [Ljava/lang/Class;

    move-result-object v6

    invoke-virtual {v8, v6}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v6

    invoke-virtual {v6, v9}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6
    :try_end_2d
    .catchall {:try_start_2d .. :try_end_2d} :catchall_c

    move-object/from16 v27, v3

    move-object v9, v6

    move-object/from16 v6, v51

    move-object/from16 v8, v52

    goto/16 :goto_2b

    :catchall_c
    move-exception v0

    :try_start_2e
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v3

    if-eqz v3, :cond_25

    throw v3

    :cond_25
    throw v0
    :try_end_2e
    .catchall {:try_start_2e .. :try_end_2e} :catchall_9

    :cond_26
    if-nez v50, :cond_28

    const/4 v8, 0x2

    :try_start_2f
    new-array v9, v8, [Ljava/lang/Object;

    const/16 v43, 0x1

    aput-object v6, v9, v43

    aput-object v0, v9, v32

    sget-object v6, Lcom/appsflyer/internal/AFa1hSDK;->$$a:[B

    aget-byte v8, v6, v41

    int-to-byte v8, v8

    aget-byte v10, v6, v38

    int-to-byte v10, v10

    invoke-static {v8, v10, v15}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(BSI)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v8

    aget-byte v10, v6, v41

    int-to-byte v10, v10

    aget-byte v6, v6, v38

    int-to-byte v6, v6

    invoke-static {v10, v6, v15}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(BSI)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v6

    filled-new-array {v6, v4}, [Ljava/lang/Class;

    move-result-object v6

    invoke-virtual {v8, v6}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v6

    invoke-virtual {v6, v9}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6
    :try_end_2f
    .catchall {:try_start_2f .. :try_end_2f} :catchall_d

    move-object/from16 v27, v3

    move-object/from16 v50, v6

    move-object/from16 v6, v51

    :goto_2a
    move-object/from16 v8, v52

    goto/16 :goto_29

    :catchall_d
    move-exception v0

    :try_start_30
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v3

    if-eqz v3, :cond_27

    throw v3

    :cond_27
    throw v0
    :try_end_30
    .catchall {:try_start_30 .. :try_end_30} :catchall_9

    :cond_28
    const/4 v8, 0x2

    :try_start_31
    new-array v9, v8, [Ljava/lang/Object;

    const/16 v43, 0x1

    aput-object v6, v9, v43

    aput-object v0, v9, v32

    sget-object v6, Lcom/appsflyer/internal/AFa1hSDK;->$$a:[B

    aget-byte v8, v6, v41

    int-to-byte v8, v8

    aget-byte v10, v6, v38

    int-to-byte v10, v10

    invoke-static {v8, v10, v15}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(BSI)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v8

    aget-byte v10, v6, v41

    int-to-byte v10, v10

    aget-byte v11, v6, v38

    int-to-byte v11, v11

    invoke-static {v10, v11, v15}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(BSI)Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v10

    filled-new-array {v10, v4}, [Ljava/lang/Class;

    move-result-object v10

    invoke-virtual {v8, v10}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v8

    invoke-virtual {v8, v9}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8
    :try_end_31
    .catchall {:try_start_31 .. :try_end_31} :catchall_11

    :try_start_32
    filled-new-array {v8}, [Ljava/lang/Object;

    move-result-object v9

    aget-byte v10, v6, v41

    int-to-byte v10, v10

    aget-byte v11, v6, v22

    int-to-byte v11, v11

    move-object/from16 v27, v3

    const/16 v3, 0x145

    int-to-short v3, v3

    invoke-static {v10, v11, v3}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(BSI)Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v10

    aget-byte v11, v6, v41

    int-to-byte v11, v11

    move-object/from16 v51, v6

    aget-byte v6, v51, v38

    int-to-byte v6, v6

    invoke-static {v11, v6, v15}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(BSI)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v6

    filled-new-array {v6}, [Ljava/lang/Class;

    move-result-object v6

    invoke-virtual {v10, v6}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v6

    invoke-virtual {v6, v9}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6
    :try_end_32
    .catchall {:try_start_32 .. :try_end_32} :catchall_f

    :try_start_33
    aget-byte v9, v51, v41

    int-to-byte v9, v9

    aget-byte v10, v51, v22

    int-to-byte v10, v10

    invoke-static {v9, v10, v3}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(BSI)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v3

    aget-byte v9, v51, v25

    int-to-byte v9, v9

    aget-byte v10, v51, v42

    int-to-byte v10, v10

    xor-int/lit16 v11, v10, 0x158

    move/from16 v51, v11

    and-int/lit16 v11, v10, 0x158

    or-int v11, v51, v11

    int-to-short v11, v11

    invoke-static {v9, v10, v11}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(BSI)Ljava/lang/String;

    move-result-object v9

    const/4 v10, 0x0

    invoke-virtual {v3, v9, v10}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v3

    invoke-virtual {v3, v6, v10}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_33
    .catchall {:try_start_33 .. :try_end_33} :catchall_e

    move-object v6, v8

    goto/16 :goto_2a

    :goto_2b
    move-object/from16 v3, v27

    move-object/from16 v11, v55

    const/16 v46, 0x1a

    goto/16 :goto_1d

    :catchall_e
    move-exception v0

    :try_start_34
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v3

    if-eqz v3, :cond_29

    throw v3

    :catch_d
    move-exception v0

    goto :goto_2c

    :cond_29
    throw v0

    :catchall_f
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v3

    if-eqz v3, :cond_2a

    throw v3

    :cond_2a
    throw v0
    :try_end_34
    .catch Ljava/lang/Exception; {:try_start_34 .. :try_end_34} :catch_d
    .catchall {:try_start_34 .. :try_end_34} :catchall_9

    :goto_2c
    :try_start_35
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v6, Lcom/appsflyer/internal/AFa1hSDK;->$$a:[B

    aget-byte v9, v6, v21

    int-to-byte v9, v9

    aget-byte v10, v6, v42

    int-to-byte v10, v10

    const/16 v11, 0x160

    int-to-short v11, v11

    invoke-static {v9, v10, v11}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(BSI)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v3, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    aget-byte v8, v6, v16

    int-to-byte v8, v8

    const/16 v46, 0x1a

    aget-byte v9, v6, v46

    int-to-byte v9, v9

    const/16 v10, 0x123

    or-int/lit16 v11, v9, 0x123

    int-to-short v10, v11

    invoke-static {v8, v9, v10}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(BSI)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3
    :try_end_35
    .catchall {:try_start_35 .. :try_end_35} :catchall_9

    const/4 v8, 0x2

    :try_start_36
    new-array v9, v8, [Ljava/lang/Object;

    const/16 v43, 0x1

    aput-object v0, v9, v43

    aput-object v3, v9, v32

    aget-byte v0, v6, v41

    int-to-byte v0, v0

    aget-byte v3, v6, v18

    int-to-byte v3, v3

    const/16 v8, 0x123

    int-to-short v6, v8

    invoke-static {v0, v3, v6}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(BSI)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    filled-new-array {v4, v2}, [Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v0

    invoke-virtual {v0, v9}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Throwable;

    throw v0
    :try_end_36
    .catchall {:try_start_36 .. :try_end_36} :catchall_10

    :catchall_10
    move-exception v0

    :try_start_37
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v3

    if-eqz v3, :cond_2b

    throw v3

    :cond_2b
    throw v0

    :catchall_11
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v3

    if-eqz v3, :cond_2c

    throw v3

    :cond_2c
    throw v0

    :cond_2d
    move-object/from16 v55, v11

    const/16 v37, 0x0

    .line 13
    throw v37

    :cond_2e
    move-object/from16 v51, v6

    move-object/from16 v52, v8

    move-object/from16 v53, v9

    :goto_2d
    move-object/from16 v55, v11

    goto :goto_30

    :catchall_12
    move-exception v0

    :goto_2e
    move-object/from16 v55, v11

    goto :goto_2f

    :catchall_13
    move-exception v0

    move-object/from16 v48, v10

    goto :goto_2e

    .line 14
    :goto_2f
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v3

    if-eqz v3, :cond_2f

    throw v3

    :cond_2f
    throw v0
    :try_end_37
    .catchall {:try_start_37 .. :try_end_37} :catchall_9

    :catchall_14
    move-exception v0

    move-object/from16 v48, v10

    goto/16 :goto_27

    :cond_30
    move-object/from16 v48, v10

    const/16 v50, 0x0

    const/16 v51, 0x0

    const/16 v52, 0x0

    const/16 v53, 0x0

    goto :goto_2d

    :goto_30
    :try_start_38
    sget-object v0, Lcom/appsflyer/internal/AFa1hSDK;->$$a:[B

    const/16 v3, 0x2de

    aget-byte v3, v0, v3

    neg-int v3, v3

    int-to-byte v3, v3

    const/16 v6, 0x34

    aget-byte v6, v0, v6

    int-to-byte v6, v6

    move/from16 v8, v41

    int-to-short v9, v8

    invoke-static {v3, v6, v9}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(BSI)Ljava/lang/String;

    move-result-object v3
    :try_end_38
    .catchall {:try_start_38 .. :try_end_38} :catchall_58

    :try_start_39
    filled-new-array {v3}, [Ljava/lang/Object;

    move-result-object v6

    aget-byte v8, v0, v30

    int-to-byte v8, v8

    aget-byte v9, v0, v31

    int-to-byte v9, v9

    const/16 v10, 0x194

    int-to-short v10, v10

    invoke-static {v8, v9, v10}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(BSI)Ljava/lang/String;

    move-result-object v8

    filled-new-array {v4}, [Ljava/lang/Class;

    move-result-object v9

    invoke-virtual {v7, v8, v9}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v8

    invoke-virtual {v8, v1, v6}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6
    :try_end_39
    .catchall {:try_start_39 .. :try_end_39} :catchall_5c

    const/16 v41, 0x164

    :try_start_3a
    aget-byte v8, v0, v41

    int-to-byte v8, v8

    aget-byte v9, v0, v38

    int-to-byte v9, v9

    const/16 v10, 0x19e

    int-to-short v10, v10

    invoke-static {v8, v9, v10}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(BSI)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v8

    aget-byte v9, v0, v30

    int-to-byte v9, v9

    aget-byte v10, v0, v17

    int-to-byte v10, v10

    const/16 v11, 0x1a9

    int-to-short v11, v11

    invoke-static {v9, v10, v11}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(BSI)Ljava/lang/String;

    move-result-object v9

    const/4 v10, 0x0

    invoke-virtual {v8, v9, v10}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v8

    invoke-virtual {v8, v6, v10}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;
    :try_end_3a
    .catchall {:try_start_3a .. :try_end_3a} :catchall_5b

    :try_start_3b
    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V
    :try_end_3b
    .catchall {:try_start_3b .. :try_end_3b} :catchall_58

    const/16 v9, 0x56

    int-to-byte v9, v9

    const/16 v46, 0x1a

    :try_start_3c
    aget-byte v10, v0, v46
    :try_end_3c
    .catchall {:try_start_3c .. :try_end_3c} :catchall_5a

    int-to-byte v10, v10

    xor-int/lit16 v11, v10, 0x1af

    move/from16 v27, v11

    and-int/lit16 v11, v10, 0x1af

    or-int v11, v27, v11

    int-to-short v11, v11

    :try_start_3d
    invoke-static {v9, v10, v11}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(BSI)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v6, v8}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v8
    :try_end_3d
    .catchall {:try_start_3d .. :try_end_3d} :catchall_58

    const/4 v9, 0x5

    :try_start_3e
    invoke-virtual {v6, v9, v8}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v6
    :try_end_3e
    .catchall {:try_start_3e .. :try_end_3e} :catchall_59

    :try_start_3f
    new-instance v8, Ljava/util/zip/ZipFile;

    invoke-direct {v8, v6}, Ljava/util/zip/ZipFile;-><init>(Ljava/lang/String;)V
    :try_end_3f
    .catchall {:try_start_3f .. :try_end_3f} :catchall_58

    const/16 v6, 0x1f00

    :try_start_40
    new-array v6, v6, [B

    const/4 v9, 0x1

    invoke-virtual {v3, v9}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v8, v3}, Ljava/util/zip/ZipFile;->getEntry(Ljava/lang/String;)Ljava/util/zip/ZipEntry;

    move-result-object v3

    invoke-virtual {v8, v3}, Ljava/util/zip/ZipFile;->getInputStream(Ljava/util/zip/ZipEntry;)Ljava/io/InputStream;

    move-result-object v3
    :try_end_40
    .catchall {:try_start_40 .. :try_end_40} :catchall_55

    :try_start_41
    filled-new-array {v3}, [Ljava/lang/Object;

    move-result-object v3

    const/16 v41, 0x164

    aget-byte v9, v0, v41

    int-to-byte v9, v9

    const/16 v10, 0x1c3

    aget-byte v10, v0, v10

    int-to-byte v10, v10

    sget v11, Lcom/appsflyer/internal/AFa1hSDK;->$$b:I

    move-object/from16 v27, v6

    xor-int/lit16 v6, v11, 0x101

    and-int/lit16 v11, v11, 0x101

    or-int/2addr v6, v11

    int-to-short v6, v6

    invoke-static {v9, v10, v6}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(BSI)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v6

    const/16 v41, 0x164

    aget-byte v9, v0, v41

    int-to-byte v9, v9

    aget-byte v10, v0, v18

    int-to-byte v10, v10

    const/16 v11, 0x1c9

    int-to-short v11, v11

    invoke-static {v9, v10, v11}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(BSI)Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v9

    filled-new-array {v9}, [Ljava/lang/Class;

    move-result-object v9

    invoke-virtual {v6, v9}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v6

    invoke-virtual {v6, v3}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3
    :try_end_41
    .catchall {:try_start_41 .. :try_end_41} :catchall_54

    :try_start_42
    filled-new-array {v3}, [Ljava/lang/Object;

    move-result-object v3

    const/16 v41, 0x164

    aget-byte v6, v0, v41

    int-to-byte v6, v6

    aget-byte v9, v0, v20

    int-to-byte v9, v9

    const/16 v10, 0x1db

    int-to-short v10, v10

    invoke-static {v6, v9, v10}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(BSI)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v6

    const/16 v41, 0x164

    aget-byte v9, v0, v41
    :try_end_42
    .catchall {:try_start_42 .. :try_end_42} :catchall_53

    int-to-byte v9, v9

    move-object/from16 v44, v13

    :try_start_43
    aget-byte v13, v0, v18

    int-to-byte v13, v13

    invoke-static {v9, v13, v11}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(BSI)Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v9

    filled-new-array {v9}, [Ljava/lang/Class;

    move-result-object v9

    invoke-virtual {v6, v9}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v6

    invoke-virtual {v6, v3}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3
    :try_end_43
    .catchall {:try_start_43 .. :try_end_43} :catchall_52

    :try_start_44
    filled-new-array/range {v27 .. v27}, [Ljava/lang/Object;

    move-result-object v6

    const/16 v41, 0x164

    aget-byte v9, v0, v41

    int-to-byte v9, v9

    aget-byte v11, v0, v20

    int-to-byte v11, v11

    invoke-static {v9, v11, v10}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(BSI)Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v9

    aget-byte v11, v0, v23

    int-to-byte v11, v11

    const/16 v13, 0xc6

    aget-byte v13, v0, v13
    :try_end_44
    .catchall {:try_start_44 .. :try_end_44} :catchall_51

    int-to-byte v13, v13

    move/from16 v54, v14

    const/16 v14, 0x1f1

    int-to-short v14, v14

    :try_start_45
    invoke-static {v11, v13, v14}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(BSI)Ljava/lang/String;

    move-result-object v11

    filled-new-array {v5}, [Ljava/lang/Class;

    move-result-object v13

    invoke-virtual {v9, v11, v13}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v9

    invoke-virtual {v9, v3, v6}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_45
    .catchall {:try_start_45 .. :try_end_45} :catchall_50

    const/16 v41, 0x164

    :try_start_46
    aget-byte v6, v0, v41

    int-to-byte v6, v6

    aget-byte v9, v0, v20

    int-to-byte v9, v9

    invoke-static {v6, v9, v10}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(BSI)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v6

    aget-byte v9, v0, v25

    int-to-byte v9, v9

    aget-byte v0, v0, v42

    int-to-byte v0, v0

    xor-int/lit16 v10, v0, 0x158

    and-int/lit16 v11, v0, 0x158

    or-int/2addr v10, v11

    int-to-short v10, v10

    invoke-static {v9, v0, v10}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(BSI)Ljava/lang/String;

    move-result-object v0

    const/4 v10, 0x0

    invoke-virtual {v6, v0, v10}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    invoke-virtual {v0, v3, v10}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_46
    .catchall {:try_start_46 .. :try_end_46} :catchall_4f

    const/16 v0, 0x1ed8

    move-object/from16 v6, v27

    move-object/from16 v11, v36

    const/4 v3, 0x0

    const/16 v9, 0x10

    :goto_31
    const/4 v10, 0x1

    int-to-long v13, v10

    .line 15
    :try_start_47
    array-length v10, v6
    :try_end_47
    .catchall {:try_start_47 .. :try_end_47} :catchall_4c

    move-wide/from16 v57, v13

    move/from16 v13, v32

    :goto_32
    if-ge v13, v10, :cond_31

    :try_start_48
    aget-byte v14, v6, v13
    :try_end_48
    .catchall {:try_start_48 .. :try_end_48} :catchall_15

    move/from16 v27, v13

    int-to-long v13, v14

    shl-long v59, v57, v28

    add-long v13, v13, v59

    const/16 v56, 0x10

    shl-long v59, v57, v56

    move/from16 v56, v10

    add-long v13, v13, v59

    sub-long v57, v13, v57

    const/16 v43, 0x1

    add-int/lit8 v13, v27, 0x1

    goto :goto_32

    :catchall_15
    move-exception v0

    move-object v3, v2

    move-object v2, v1

    move-object v1, v3

    move-object v3, v0

    move-object/from16 v64, v5

    move/from16 v62, v15

    const/16 v39, 0x3

    const/16 v40, 0x5

    const/16 v46, 0x1a

    const/16 v56, 0x10

    goto/16 :goto_63

    .line 16
    :cond_31
    :try_start_49
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v13

    long-to-int v13, v13

    mul-int/lit16 v14, v9, -0x291

    const v27, 0x1a106

    add-int v27, v27, v14

    const/16 v14, -0xa3

    xor-int v56, v14, v9

    and-int/2addr v14, v9

    or-int v14, v56, v14

    not-int v14, v14

    not-int v10, v9

    move/from16 v59, v14

    xor-int/lit16 v14, v10, 0xa2

    move/from16 v60, v14

    and-int/lit16 v14, v10, 0xa2

    or-int v14, v60, v14

    not-int v14, v14

    xor-int v60, v59, v14

    and-int v14, v59, v14

    or-int v14, v60, v14

    move/from16 v59, v14

    xor-int/lit16 v14, v13, 0xa2

    move/from16 v60, v14

    and-int/lit16 v14, v13, 0xa2

    or-int v14, v60, v14

    not-int v14, v14

    xor-int v60, v59, v14

    and-int v14, v59, v14

    or-int v14, v60, v14

    mul-int/lit16 v14, v14, -0x292

    neg-int v14, v14

    neg-int v14, v14

    xor-int v59, v27, v14

    and-int v14, v27, v14

    const/16 v43, 0x1

    shl-int/lit8 v14, v14, 0x1

    add-int v59, v59, v14

    xor-int/lit16 v14, v10, 0xa2

    and-int/lit16 v10, v10, 0xa2

    or-int/2addr v10, v14

    not-int v14, v10

    mul-int/lit16 v14, v14, 0x292

    xor-int v27, v59, v14

    and-int v14, v59, v14

    shl-int/lit8 v14, v14, 0x1

    add-int v27, v27, v14

    not-int v10, v10

    or-int/lit16 v13, v13, 0xa2

    not-int v13, v13

    xor-int v14, v10, v13

    and-int/2addr v10, v13

    or-int/2addr v10, v14

    mul-int/lit16 v10, v10, 0x292

    and-int v13, v27, v10

    or-int v10, v27, v10

    add-int/2addr v13, v10

    add-int/lit16 v10, v9, 0x1eef

    aget-byte v10, v6, v10

    or-int/lit8 v14, v10, -0x9

    const/16 v43, 0x1

    shl-int/lit8 v14, v14, 0x1

    xor-int/lit8 v10, v10, -0x9

    sub-int/2addr v14, v10

    int-to-byte v10, v14

    aput-byte v10, v6, v13

    array-length v10, v6
    :try_end_49
    .catchall {:try_start_49 .. :try_end_49} :catchall_4c

    neg-int v13, v9

    xor-int v14, v10, v13

    and-int/2addr v10, v13

    const/16 v43, 0x1

    shl-int/lit8 v10, v10, 0x1

    add-int/2addr v14, v10

    const/4 v10, 0x3

    :try_start_4a
    new-array v13, v10, [Ljava/lang/Object;
    :try_end_4a
    .catchall {:try_start_4a .. :try_end_4a} :catchall_4e

    :try_start_4b
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    const/16 v35, 0x2

    aput-object v10, v13, v35

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    aput-object v10, v13, v43

    aput-object v6, v13, v32

    sget-object v6, Lcom/appsflyer/internal/AFa1hSDK;->$$a:[B

    const/16 v41, 0x164

    aget-byte v10, v6, v41

    int-to-byte v10, v10

    const/16 v14, 0x3bf

    aget-byte v14, v6, v14

    int-to-byte v14, v14

    move-object/from16 v27, v6

    const/16 v6, 0x1f9

    int-to-short v6, v6

    invoke-static {v10, v14, v6}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(BSI)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v6

    sget-object v10, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    filled-new-array {v5, v10, v10}, [Ljava/lang/Class;

    move-result-object v14

    invoke-virtual {v6, v14}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v6

    invoke-virtual {v6, v13}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6
    :try_end_4b
    .catchall {:try_start_4b .. :try_end_4b} :catchall_4d

    :try_start_4c
    sget-object v13, Lcom/appsflyer/internal/AFa1hSDK;->d:Ljava/lang/Object;
    :try_end_4c
    .catchall {:try_start_4c .. :try_end_4c} :catchall_4c

    if-nez v13, :cond_33

    .line 17
    sget v13, Lcom/appsflyer/internal/AFa1hSDK;->$10:I

    or-int/lit8 v14, v13, 0x4d

    const/16 v43, 0x1

    shl-int/lit8 v14, v14, 0x1

    xor-int/lit8 v13, v13, 0x4d

    sub-int/2addr v14, v13

    rem-int/lit16 v14, v14, 0x80

    sput v14, Lcom/appsflyer/internal/AFa1hSDK;->$11:I

    .line 18
    :try_start_4d
    sput-wide v57, Lcom/appsflyer/internal/AFa1hSDK;->afDebugLog:J

    invoke-static {}, Landroid/os/Process;->getElapsedCpuTime()J

    move-result-wide v13

    shr-long v13, v13, v19

    const-wide v59, 0x3e1ca75f53db88c4L    # 1.6678705772653194E-9

    add-long v13, v13, v59

    xor-long v13, v57, v13

    long-to-int v13, v13

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v57

    const-wide/16 v59, 0x0

    cmp-long v14, v57, v59

    add-int/lit8 v14, v14, 0x6

    int-to-byte v14, v14

    sget-wide v57, Lcom/appsflyer/internal/AFa1hSDK;->afDebugLog:J

    invoke-static {}, Landroid/view/ViewConfiguration;->getGlobalActionKeyTimeout()J

    move-result-wide v59

    const/16 v61, 0x20

    shr-long v59, v59, v61

    const-wide v61, 0x3e1ca75f2658fc91L    # 1.667870419370956E-9

    sub-long v61, v61, v59

    move/from16 v65, v9

    move-object/from16 v59, v10

    xor-long v9, v57, v61

    long-to-int v9, v9

    new-array v9, v9, [I

    invoke-static/range {v32 .. v32}, Landroid/graphics/Color;->blue(I)I

    move-result v10

    sget-wide v57, Lcom/appsflyer/internal/AFa1hSDK;->afInfoLog:J

    sget-wide v60, Lcom/appsflyer/internal/AFa1hSDK;->afDebugLog:J

    invoke-static {}, Landroid/os/Process;->getElapsedCpuTime()J

    move-result-wide v62

    shr-long v62, v62, v19

    const-wide v66, 0x3e1ca75f2658fcb3L    # 1.667870419370963E-9

    sub-long v66, v66, v62

    move-object/from16 v62, v9

    move/from16 v63, v10

    xor-long v9, v60, v66

    long-to-int v9, v9

    int-to-byte v9, v9

    ushr-long v9, v57, v9

    long-to-int v9, v9

    and-int v10, v9, v13

    not-int v10, v10

    or-int/2addr v9, v13

    and-int/2addr v9, v10

    aput v9, v62, v63

    sget-wide v9, Lcom/appsflyer/internal/AFa1hSDK;->afDebugLog:J

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v57

    shr-long v57, v57, v19

    const-wide v60, 0x3e1ca75f2658fc92L    # 1.6678704193709562E-9

    add-long v57, v57, v60

    xor-long v9, v9, v57

    long-to-int v9, v9

    move/from16 v57, v9

    sget-wide v9, Lcom/appsflyer/internal/AFa1hSDK;->afInfoLog:J

    long-to-int v9, v9

    not-int v10, v13

    and-int/2addr v10, v9

    not-int v9, v9

    and-int/2addr v9, v13

    or-int/2addr v9, v10

    aput v9, v62, v57

    sget v9, Lcom/appsflyer/internal/AFa1hSDK;->afLogForce:I

    sget-object v10, Lcom/appsflyer/internal/AFa1hSDK;->afErrorLogForExcManagerOnly:[B

    sget v13, Lcom/appsflyer/internal/AFa1hSDK;->afWarnLog:I
    :try_end_4d
    .catchall {:try_start_4d .. :try_end_4d} :catchall_15

    move-object/from16 v60, v6

    move/from16 v6, v28

    move/from16 v28, v9

    :try_start_4e
    new-array v9, v6, [Ljava/lang/Object;

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    const/16 v40, 0x5

    aput-object v13, v9, v40

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    aput-object v13, v9, v26

    const/16 v39, 0x3

    aput-object v10, v9, v39

    invoke-static/range {v28 .. v28}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    const/16 v35, 0x2

    aput-object v10, v9, v35

    const/16 v43, 0x1

    aput-object v62, v9, v43

    aput-object v60, v9, v32

    aget-byte v10, v27, v25

    int-to-byte v10, v10

    const/16 v13, 0x1e8

    aget-byte v13, v27, v13

    neg-int v13, v13

    int-to-byte v13, v13

    const/16 v14, 0x214

    int-to-short v14, v14

    invoke-static {v10, v13, v14}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(BSI)Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v10

    const/16 v41, 0x164

    aget-byte v13, v27, v41

    int-to-byte v13, v13

    aget-byte v14, v27, v18

    int-to-byte v14, v14

    const/16 v6, 0x1c9

    int-to-short v6, v6

    invoke-static {v13, v14, v6}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(BSI)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v6

    const-class v60, [I

    const-class v62, [B

    move-object/from16 v63, v59

    move-object/from16 v64, v59

    move-object/from16 v61, v59

    move-object/from16 v59, v6

    filled-new-array/range {v59 .. v64}, [Ljava/lang/Class;

    move-result-object v6

    move-object/from16 v14, v61

    invoke-virtual {v10, v6}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v6

    invoke-virtual {v6, v9}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6
    :try_end_4e
    .catchall {:try_start_4e .. :try_end_4e} :catchall_16

    move-object/from16 v26, v3

    move-object/from16 v58, v8

    move/from16 v59, v12

    const/16 v39, 0x3

    :goto_33
    const/16 v41, 0x164

    goto/16 :goto_34

    :catchall_16
    move-exception v0

    :try_start_4f
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v3

    if-eqz v3, :cond_32

    throw v3

    :cond_32
    throw v0
    :try_end_4f
    .catchall {:try_start_4f .. :try_end_4f} :catchall_15

    :cond_33
    move-object/from16 v60, v6

    move/from16 v65, v9

    move-object v14, v10

    :try_start_50
    sput-wide v57, Lcom/appsflyer/internal/AFa1hSDK;->v:J

    invoke-static {}, Landroid/view/ViewConfiguration;->getZoomControlsTimeout()J

    move-result-wide v9

    const/16 v6, 0x20

    shr-long/2addr v9, v6

    const-wide v61, -0xe25f70f403b7373L    # -2.7125194675178367E240

    sub-long v61, v61, v9

    xor-long v9, v57, v61

    long-to-int v6, v9

    sget-wide v9, Lcom/appsflyer/internal/AFa1hSDK;->v:J

    invoke-static {}, Landroid/os/Process;->getElapsedCpuTime()J

    move-result-wide v57

    shr-long v57, v57, v19

    const-wide v61, 0xe25f70f43c50c7eL

    sub-long v61, v61, v57

    xor-long v9, v9, v61

    long-to-int v9, v9

    sget-wide v57, Lcom/appsflyer/internal/AFa1hSDK;->v:J

    invoke-static {}, Landroid/os/Process;->getElapsedCpuTime()J

    move-result-wide v61
    :try_end_50
    .catchall {:try_start_50 .. :try_end_50} :catchall_4c

    shr-long v61, v61, v19

    const-wide v63, -0xe25f70f46396114L    # -2.7125194303076595E240

    add-long v61, v61, v63

    move/from16 v59, v9

    xor-long v9, v57, v61

    long-to-int v9, v9

    .line 19
    sget v10, Lcom/appsflyer/internal/AFa1hSDK;->$10:I

    add-int/lit8 v10, v10, 0x31

    rem-int/lit16 v10, v10, 0x80

    sput v10, Lcom/appsflyer/internal/AFa1hSDK;->$11:I

    move/from16 v10, v26

    move/from16 v26, v6

    .line 20
    :try_start_51
    new-array v6, v10, [Ljava/lang/Object;

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9
    :try_end_51
    .catchall {:try_start_51 .. :try_end_51} :catchall_4b

    const/16 v39, 0x3

    :try_start_52
    aput-object v9, v6, v39

    invoke-static/range {v59 .. v59}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    const/16 v35, 0x2

    aput-object v9, v6, v35

    invoke-static/range {v26 .. v26}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v9

    const/16 v43, 0x1

    aput-object v9, v6, v43

    aput-object v60, v6, v32

    aget-byte v9, v27, v25

    int-to-byte v9, v9

    const/16 v26, 0xaf

    aget-byte v10, v27, v26

    int-to-byte v10, v10

    move-object/from16 v26, v3

    xor-int/lit16 v3, v10, 0x212

    move/from16 v58, v3

    and-int/lit16 v3, v10, 0x212

    or-int v3, v58, v3

    int-to-short v3, v3

    invoke-static {v9, v10, v3}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(BSI)Ljava/lang/String;

    move-result-object v3

    sget-object v9, Lcom/appsflyer/internal/AFa1hSDK;->w:Ljava/lang/Object;

    check-cast v9, Ljava/lang/ClassLoader;

    const/4 v10, 0x1

    invoke-static {v3, v10, v9}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object v3

    aget-byte v9, v27, v30

    int-to-byte v9, v9

    aget-byte v10, v27, v24
    :try_end_52
    .catchall {:try_start_52 .. :try_end_52} :catchall_4a

    int-to-byte v10, v10

    move-object/from16 v58, v8

    const/16 v8, 0x252

    int-to-short v8, v8

    :try_start_53
    invoke-static {v9, v10, v8}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(BSI)Ljava/lang/String;

    move-result-object v8

    const/16 v41, 0x164

    aget-byte v9, v27, v41

    int-to-byte v9, v9

    aget-byte v10, v27, v18

    int-to-byte v10, v10

    move/from16 v59, v12

    const/16 v12, 0x1c9

    int-to-short v12, v12

    invoke-static {v9, v10, v12}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(BSI)Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v9

    sget-object v10, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    filled-new-array {v9, v10, v14, v14}, [Ljava/lang/Class;

    move-result-object v9

    invoke-virtual {v3, v8, v9}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v3

    invoke-virtual {v3, v13, v6}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6
    :try_end_53
    .catchall {:try_start_53 .. :try_end_53} :catchall_49

    goto/16 :goto_33

    :goto_34
    :try_start_54
    aget-byte v3, v27, v41

    int-to-byte v3, v3

    aget-byte v8, v27, v18

    int-to-byte v8, v8

    const/16 v9, 0x1c9

    int-to-short v9, v9

    invoke-static {v3, v8, v9}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(BSI)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v3

    aget-byte v8, v27, v42

    int-to-byte v8, v8

    aget-byte v10, v27, v34

    int-to-byte v10, v10

    xor-int/lit16 v12, v10, 0x264

    and-int/lit16 v13, v10, 0x264

    or-int/2addr v12, v13

    int-to-short v12, v12

    invoke-static {v8, v10, v12}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(BSI)Ljava/lang/String;

    move-result-object v8

    sget-object v10, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    filled-new-array {v10}, [Ljava/lang/Class;

    move-result-object v10

    invoke-virtual {v3, v8, v10}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v3
    :try_end_54
    .catchall {:try_start_54 .. :try_end_54} :catchall_48

    const/16 v56, 0x10

    :try_start_55
    invoke-static/range {v56 .. v56}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    filled-new-array {v8}, [Ljava/lang/Object;

    move-result-object v8

    invoke-virtual {v3, v6, v8}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_55
    .catchall {:try_start_55 .. :try_end_55} :catchall_47

    if-eqz v59, :cond_42

    .line 21
    sget v8, Lcom/appsflyer/internal/AFa1hSDK;->$10:I

    add-int/lit8 v8, v8, 0x23

    rem-int/lit16 v8, v8, 0x80

    sput v8, Lcom/appsflyer/internal/AFa1hSDK;->$11:I

    .line 22
    :try_start_56
    sget-object v8, Lcom/appsflyer/internal/AFa1hSDK;->d:Ljava/lang/Object;

    if-nez v8, :cond_34

    move-object/from16 v10, v52

    goto :goto_35

    :cond_34
    move-object/from16 v10, v53

    :goto_35
    if-nez v8, :cond_35

    move-object/from16 v8, v50

    :goto_36
    const/16 v41, 0x164

    goto :goto_37

    :cond_35
    move-object/from16 v8, v51

    goto :goto_36

    .line 23
    :goto_37
    aget-byte v12, v27, v41

    int-to-byte v12, v12

    aget-byte v13, v27, v18

    int-to-byte v13, v13

    invoke-static {v12, v13, v9}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(BSI)Ljava/lang/String;

    move-result-object v12

    invoke-static {v12}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v12

    aget-byte v13, v27, v23

    int-to-byte v13, v13

    const/16 v60, 0x25

    aget-byte v3, v27, v34

    int-to-byte v3, v3

    move-object/from16 v61, v11

    const/16 v11, 0x26a

    int-to-short v11, v11

    invoke-static {v13, v3, v11}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(BSI)Ljava/lang/String;

    move-result-object v3

    filled-new-array {v5, v14, v14}, [Ljava/lang/Class;

    move-result-object v11

    invoke-virtual {v12, v3, v11}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v3

    const/16 v41, 0x164

    aget-byte v11, v27, v41

    int-to-byte v11, v11

    aget-byte v12, v27, v22

    int-to-byte v12, v12

    const/16 v13, 0x145

    int-to-short v13, v13

    invoke-static {v11, v12, v13}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(BSI)Ljava/lang/String;

    move-result-object v11

    invoke-static {v11}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v11
    :try_end_56
    .catchall {:try_start_56 .. :try_end_56} :catchall_2c

    const/16 v41, 0x164

    :try_start_57
    aget-byte v12, v27, v41

    int-to-byte v12, v12

    aget-byte v13, v27, v38

    int-to-byte v13, v13

    invoke-static {v12, v13, v15}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(BSI)Ljava/lang/String;

    move-result-object v12

    invoke-static {v12}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v12

    filled-new-array {v12}, [Ljava/lang/Class;

    move-result-object v12

    invoke-virtual {v11, v12}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v12

    filled-new-array {v10}, [Ljava/lang/Object;

    move-result-object v13

    invoke-virtual {v12, v13}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12
    :try_end_57
    .catch Ljava/lang/Exception; {:try_start_57 .. :try_end_57} :catch_f
    .catchall {:try_start_57 .. :try_end_57} :catchall_25

    if-eqz v45, :cond_37

    const/16 v41, 0x164

    :try_start_58
    aget-byte v13, v27, v41

    int-to-byte v13, v13

    move/from16 v62, v9

    aget-byte v9, v27, v38

    int-to-byte v9, v9

    invoke-static {v13, v9, v15}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(BSI)Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v9

    aget-byte v13, v27, v42
    :try_end_58
    .catchall {:try_start_58 .. :try_end_58} :catchall_19

    int-to-byte v13, v13

    move-object/from16 v63, v2

    :try_start_59
    aget-byte v2, v27, v31
    :try_end_59
    .catchall {:try_start_59 .. :try_end_59} :catchall_18

    int-to-byte v2, v2

    move-object/from16 v64, v1

    const/16 v1, 0x26d

    int-to-short v1, v1

    :try_start_5a
    invoke-static {v13, v2, v1}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(BSI)Ljava/lang/String;

    move-result-object v1

    const/4 v13, 0x0

    invoke-virtual {v9, v1, v13}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    invoke-virtual {v1, v10, v13}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_5a
    .catchall {:try_start_5a .. :try_end_5a} :catchall_17

    goto :goto_39

    :catchall_17
    move-exception v0

    goto :goto_38

    :catchall_18
    move-exception v0

    move-object/from16 v64, v1

    goto :goto_38

    :catchall_19
    move-exception v0

    move-object/from16 v64, v1

    move-object/from16 v63, v2

    :goto_38
    :try_start_5b
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_36

    throw v1

    :catchall_1a
    move-exception v0

    move-object/from16 v1, v63

    move-object/from16 v2, v64

    goto/16 :goto_44

    :catch_e
    move-exception v0

    move-object/from16 v2, v64

    goto/16 :goto_42

    :cond_36
    throw v0
    :try_end_5b
    .catch Ljava/lang/Exception; {:try_start_5b .. :try_end_5b} :catch_e
    .catchall {:try_start_5b .. :try_end_5b} :catchall_1a

    :cond_37
    move-object/from16 v64, v1

    move-object/from16 v63, v2

    move/from16 v62, v9

    :goto_39
    const/16 v1, 0x400

    :try_start_5c
    new-array v2, v1, [B

    const/16 v46, 0x1a

    aget-byte v9, v27, v46

    int-to-byte v9, v9

    aget-byte v13, v27, v42

    int-to-byte v13, v13

    const/16 v1, 0x27b

    int-to-short v1, v1

    invoke-static {v9, v13, v1}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(BSI)Ljava/lang/String;

    move-result-object v1

    filled-new-array {v5, v14, v14}, [Ljava/lang/Class;

    move-result-object v9

    invoke-virtual {v11, v1, v9}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1
    :try_end_5c
    .catchall {:try_start_5c .. :try_end_5c} :catchall_21

    :goto_3a
    if-lez v0, :cond_38

    :try_start_5d
    invoke-static/range {v32 .. v32}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    const/16 v13, 0x400

    invoke-static {v13, v0}, Ljava/lang/Math;->min(II)I

    move-result v14

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    filled-new-array {v2, v9, v14}, [Ljava/lang/Object;

    move-result-object v9

    invoke-virtual {v3, v6, v9}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/Integer;

    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    move-result v14
    :try_end_5d
    .catchall {:try_start_5d .. :try_end_5d} :catchall_1a

    const/4 v13, -0x1

    if-eq v14, v13, :cond_38

    .line 24
    sget v13, Lcom/appsflyer/internal/AFa1hSDK;->$10:I

    const/16 v33, 0x7

    and-int/lit8 v27, v13, 0x7

    or-int/lit8 v13, v13, 0x7

    add-int v13, v27, v13

    rem-int/lit16 v13, v13, 0x80

    sput v13, Lcom/appsflyer/internal/AFa1hSDK;->$11:I

    .line 25
    :try_start_5e
    invoke-static/range {v32 .. v32}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    filled-new-array {v2, v13, v9}, [Ljava/lang/Object;

    move-result-object v9

    invoke-virtual {v1, v12, v9}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_5e
    .catchall {:try_start_5e .. :try_end_5e} :catchall_1a

    neg-int v9, v14

    and-int v13, v0, v9

    or-int/2addr v0, v9

    add-int/2addr v0, v13

    goto :goto_3a

    :cond_38
    :try_start_5f
    sget-object v0, Lcom/appsflyer/internal/AFa1hSDK;->$$a:[B

    aget-byte v1, v0, v30

    int-to-byte v1, v1

    aget-byte v2, v0, v42

    int-to-byte v2, v2

    xor-int/lit16 v3, v2, 0x27b

    and-int/lit16 v6, v2, 0x27b

    or-int/2addr v3, v6

    int-to-short v3, v3

    invoke-static {v1, v2, v3}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(BSI)Ljava/lang/String;

    move-result-object v1

    move/from16 v2, v32

    new-array v3, v2, [Ljava/lang/Class;

    invoke-virtual {v11, v1, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    new-array v3, v2, [Ljava/lang/Object;

    invoke-virtual {v1, v12, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    const/16 v41, 0x164

    aget-byte v2, v0, v41

    int-to-byte v2, v2

    aget-byte v3, v0, v24

    int-to-byte v3, v3

    const/16 v6, 0x283

    int-to-short v6, v6

    invoke-static {v2, v3, v6}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(BSI)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v2

    aget-byte v3, v0, v42

    int-to-byte v3, v3

    aget-byte v6, v0, v34

    int-to-byte v6, v6

    const/16 v9, 0x298

    int-to-short v9, v9

    invoke-static {v3, v6, v9}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(BSI)Ljava/lang/String;

    move-result-object v3

    const/4 v6, 0x0

    new-array v9, v6, [Ljava/lang/Class;

    invoke-virtual {v2, v3, v9}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v2

    new-array v3, v6, [Ljava/lang/Object;

    invoke-virtual {v2, v1, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    aget-byte v1, v0, v25

    int-to-byte v1, v1

    aget-byte v2, v0, v42

    int-to-byte v2, v2

    xor-int/lit16 v3, v2, 0x158

    and-int/lit16 v6, v2, 0x158

    or-int/2addr v3, v6

    int-to-short v3, v3

    invoke-static {v1, v2, v3}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(BSI)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    new-array v3, v2, [Ljava/lang/Class;

    invoke-virtual {v11, v1, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    new-array v3, v2, [Ljava/lang/Object;

    invoke-virtual {v1, v12, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    aget-byte v1, v0, v60

    int-to-byte v1, v1

    aget-byte v2, v0, v25

    int-to-byte v2, v2

    const/16 v3, 0x29b

    int-to-short v3, v3

    invoke-static {v1, v2, v3}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(BSI)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    aget-byte v2, v0, v38

    int-to-byte v2, v2

    aget-byte v3, v0, v17

    int-to-byte v3, v3

    xor-int/lit16 v6, v3, 0x2a9

    and-int/lit16 v9, v3, 0x2a9

    or-int/2addr v6, v9

    int-to-short v6, v6

    invoke-static {v2, v3, v6}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(BSI)Ljava/lang/String;

    move-result-object v2

    sget-object v3, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    filled-new-array {v4, v4, v3}, [Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1
    :try_end_5f
    .catchall {:try_start_5f .. :try_end_5f} :catchall_21

    const/16 v41, 0x164

    :try_start_60
    aget-byte v2, v0, v41

    int-to-byte v2, v2

    aget-byte v3, v0, v38

    int-to-byte v3, v3

    invoke-static {v2, v3, v15}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(BSI)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v2

    aget-byte v3, v0, v30

    int-to-byte v3, v3

    const/16 v6, 0x2b

    aget-byte v6, v0, v6

    int-to-byte v6, v6

    const/16 v9, 0x2b5

    int-to-short v9, v9

    invoke-static {v3, v6, v9}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(BSI)Ljava/lang/String;

    move-result-object v3

    const/4 v13, 0x0

    invoke-virtual {v2, v3, v13}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v2

    invoke-virtual {v2, v10, v13}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2
    :try_end_60
    .catchall {:try_start_60 .. :try_end_60} :catchall_24

    const/16 v41, 0x164

    :try_start_61
    aget-byte v3, v0, v41

    int-to-byte v3, v3

    aget-byte v6, v0, v38

    int-to-byte v6, v6

    invoke-static {v3, v6, v15}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(BSI)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v3

    aget-byte v6, v0, v30

    int-to-byte v6, v6

    const/16 v11, 0x2b

    aget-byte v11, v0, v11

    int-to-byte v11, v11

    invoke-static {v6, v11, v9}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(BSI)Ljava/lang/String;

    move-result-object v6

    const/4 v13, 0x0

    invoke-virtual {v3, v6, v13}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v3

    invoke-virtual {v3, v8, v13}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3
    :try_end_61
    .catchall {:try_start_61 .. :try_end_61} :catchall_22

    const/16 v32, 0x0

    :try_start_62
    invoke-static/range {v32 .. v32}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    filled-new-array {v2, v3, v6}, [Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v1, v13, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1
    :try_end_62
    .catchall {:try_start_62 .. :try_end_62} :catchall_21

    const/16 v41, 0x164

    :try_start_63
    aget-byte v2, v0, v41

    int-to-byte v2, v2

    aget-byte v3, v0, v38

    int-to-byte v3, v3

    invoke-static {v2, v3, v15}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(BSI)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v2

    aget-byte v3, v0, v60

    int-to-byte v3, v3

    aget-byte v6, v0, v23

    int-to-byte v6, v6

    const/16 v9, 0x2c3

    int-to-short v9, v9

    invoke-static {v3, v6, v9}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(BSI)Ljava/lang/String;

    move-result-object v3

    const/4 v13, 0x0

    invoke-virtual {v2, v3, v13}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v2

    invoke-virtual {v2, v10, v13}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_63
    .catchall {:try_start_63 .. :try_end_63} :catchall_20

    const/16 v41, 0x164

    :try_start_64
    aget-byte v2, v0, v41

    int-to-byte v2, v2

    aget-byte v3, v0, v38

    int-to-byte v3, v3

    invoke-static {v2, v3, v15}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(BSI)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v2

    aget-byte v3, v0, v60

    int-to-byte v3, v3

    aget-byte v6, v0, v23

    int-to-byte v6, v6

    invoke-static {v3, v6, v9}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(BSI)Ljava/lang/String;

    move-result-object v3

    const/4 v13, 0x0

    invoke-virtual {v2, v3, v13}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v2

    invoke-virtual {v2, v8, v13}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_64
    .catchall {:try_start_64 .. :try_end_64} :catchall_1f

    :try_start_65
    sget-object v2, Lcom/appsflyer/internal/AFa1hSDK;->w:Ljava/lang/Object;
    :try_end_65
    .catchall {:try_start_65 .. :try_end_65} :catchall_1e

    if-nez v2, :cond_3a

    :try_start_66
    aget-byte v2, v0, v30

    int-to-byte v2, v2

    const/16 v41, 0x164

    aget-byte v0, v0, v41

    int-to-byte v0, v0

    const/16 v3, 0x2c8

    int-to-short v3, v3

    invoke-static {v2, v0, v3}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(BSI)Ljava/lang/String;

    move-result-object v0

    const/4 v13, 0x0

    invoke-virtual {v7, v0, v13}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0
    :try_end_66
    .catchall {:try_start_66 .. :try_end_66} :catchall_1d

    move-object/from16 v2, v64

    :try_start_67
    invoke-virtual {v0, v2, v13}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_67
    .catchall {:try_start_67 .. :try_end_67} :catchall_1c

    :try_start_68
    sput-object v0, Lcom/appsflyer/internal/AFa1hSDK;->w:Ljava/lang/Object;

    goto :goto_40

    :catchall_1b
    move-exception v0

    :goto_3b
    move-object v3, v0

    move-object/from16 v64, v5

    move/from16 v62, v15

    :goto_3c
    move-object/from16 v8, v58

    move-object/from16 v1, v63

    :goto_3d
    const/16 v40, 0x5

    :goto_3e
    const/16 v46, 0x1a

    goto/16 :goto_63

    :catchall_1c
    move-exception v0

    goto :goto_3f

    :catchall_1d
    move-exception v0

    move-object/from16 v2, v64

    :goto_3f
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_39

    throw v1

    :cond_39
    throw v0

    :cond_3a
    move-object/from16 v2, v64

    :goto_40
    move-object/from16 v64, v5

    move/from16 v68, v62

    const/16 v40, 0x5

    move/from16 v62, v15

    goto/16 :goto_4b

    :catchall_1e
    move-exception v0

    move-object/from16 v2, v64

    goto :goto_3b

    :catchall_1f
    move-exception v0

    move-object/from16 v2, v64

    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_3b

    throw v1

    :cond_3b
    throw v0

    :catchall_20
    move-exception v0

    move-object/from16 v2, v64

    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_3c

    throw v1

    :cond_3c
    throw v0
    :try_end_68
    .catchall {:try_start_68 .. :try_end_68} :catchall_1b

    :catchall_21
    move-exception v0

    move-object/from16 v2, v64

    :goto_41
    move-object/from16 v1, v63

    goto/16 :goto_44

    :catchall_22
    move-exception v0

    move-object/from16 v2, v64

    :try_start_69
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_3d

    throw v1

    :catchall_23
    move-exception v0

    goto :goto_41

    :cond_3d
    throw v0

    :catchall_24
    move-exception v0

    move-object/from16 v2, v64

    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_3e

    throw v1

    :cond_3e
    throw v0

    :catchall_25
    move-exception v0

    move-object/from16 v63, v2

    move-object v2, v1

    goto :goto_41

    :catch_f
    move-exception v0

    move-object/from16 v63, v2

    move-object v2, v1

    :goto_42
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v3, Lcom/appsflyer/internal/AFa1hSDK;->$$a:[B

    aget-byte v6, v3, v21

    int-to-byte v6, v6

    aget-byte v9, v3, v42

    int-to-byte v9, v9

    xor-int/lit16 v11, v9, 0x273

    and-int/lit16 v12, v9, 0x273

    or-int/2addr v11, v12

    int-to-short v11, v11

    invoke-static {v6, v9, v11}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(BSI)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    aget-byte v6, v3, v16

    int-to-byte v6, v6

    const/16 v46, 0x1a

    aget-byte v9, v3, v46

    int-to-byte v9, v9

    const/16 v11, 0x123

    xor-int/lit16 v12, v9, 0x123

    and-int/lit16 v13, v9, 0x123

    or-int v11, v12, v13

    int-to-short v11, v11

    invoke-static {v6, v9, v11}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(BSI)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1
    :try_end_69
    .catchall {:try_start_69 .. :try_end_69} :catchall_23

    const/4 v13, 0x2

    :try_start_6a
    new-array v6, v13, [Ljava/lang/Object;

    const/16 v43, 0x1

    aput-object v0, v6, v43

    const/16 v32, 0x0

    aput-object v1, v6, v32

    const/16 v41, 0x164

    aget-byte v0, v3, v41

    int-to-byte v0, v0

    aget-byte v1, v3, v18

    int-to-byte v1, v1

    const/16 v11, 0x123

    int-to-short v3, v11

    invoke-static {v0, v1, v3}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(BSI)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0
    :try_end_6a
    .catchall {:try_start_6a .. :try_end_6a} :catchall_27

    move-object/from16 v1, v63

    :try_start_6b
    filled-new-array {v4, v1}, [Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Throwable;

    throw v0
    :try_end_6b
    .catchall {:try_start_6b .. :try_end_6b} :catchall_26

    :catchall_26
    move-exception v0

    goto :goto_43

    :catchall_27
    move-exception v0

    move-object/from16 v1, v63

    :goto_43
    :try_start_6c
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v3

    if-eqz v3, :cond_3f

    throw v3

    :catchall_28
    move-exception v0

    goto :goto_44

    :cond_3f
    throw v0
    :try_end_6c
    .catchall {:try_start_6c .. :try_end_6c} :catchall_28

    :goto_44
    :try_start_6d
    sget-object v3, Lcom/appsflyer/internal/AFa1hSDK;->$$a:[B

    const/16 v41, 0x164

    aget-byte v6, v3, v41

    int-to-byte v6, v6

    aget-byte v9, v3, v38

    int-to-byte v9, v9

    invoke-static {v6, v9, v15}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(BSI)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v6

    aget-byte v9, v3, v60

    int-to-byte v9, v9

    aget-byte v11, v3, v23

    int-to-byte v11, v11

    const/16 v12, 0x2c3

    int-to-short v12, v12

    invoke-static {v9, v11, v12}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(BSI)Ljava/lang/String;

    move-result-object v9

    const/4 v13, 0x0

    invoke-virtual {v6, v9, v13}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v6

    invoke-virtual {v6, v10, v13}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Boolean;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_6d
    .catchall {:try_start_6d .. :try_end_6d} :catchall_2b

    const/16 v41, 0x164

    :try_start_6e
    aget-byte v6, v3, v41

    int-to-byte v6, v6

    aget-byte v9, v3, v38

    int-to-byte v9, v9

    invoke-static {v6, v9, v15}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(BSI)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v6

    aget-byte v9, v3, v60

    int-to-byte v9, v9

    aget-byte v3, v3, v23

    int-to-byte v3, v3

    invoke-static {v9, v3, v12}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(BSI)Ljava/lang/String;

    move-result-object v3

    const/4 v13, 0x0

    invoke-virtual {v6, v3, v13}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v3

    invoke-virtual {v3, v8, v13}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_6e
    .catchall {:try_start_6e .. :try_end_6e} :catchall_2a

    :try_start_6f
    throw v0

    :catchall_29
    move-exception v0

    :goto_45
    move-object v3, v0

    move-object/from16 v64, v5

    move/from16 v62, v15

    move-object/from16 v8, v58

    goto/16 :goto_3d

    :catchall_2a
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v3

    if-eqz v3, :cond_40

    throw v3

    :cond_40
    throw v0

    :catchall_2b
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v3

    if-eqz v3, :cond_41

    throw v3

    :cond_41
    throw v0
    :try_end_6f
    .catchall {:try_start_6f .. :try_end_6f} :catchall_29

    :catchall_2c
    move-exception v0

    move-object/from16 v71, v2

    move-object v2, v1

    move-object/from16 v1, v71

    goto :goto_45

    :cond_42
    move-object/from16 v41, v2

    move-object v2, v1

    move-object/from16 v1, v41

    move/from16 v62, v9

    move-object/from16 v61, v11

    const/16 v41, 0x164

    const/16 v60, 0x25

    .line 26
    :try_start_70
    aget-byte v0, v27, v41

    int-to-byte v0, v0

    const/16 v3, 0x3bf

    aget-byte v3, v27, v3

    int-to-byte v3, v3

    const/16 v8, 0x2d5

    int-to-short v8, v8

    invoke-static {v0, v3, v8}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(BSI)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    const/16 v41, 0x164

    aget-byte v3, v27, v41

    int-to-byte v3, v3

    aget-byte v8, v27, v18

    int-to-byte v8, v8

    move/from16 v9, v62

    invoke-static {v3, v8, v9}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(BSI)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v3

    filled-new-array {v3}, [Ljava/lang/Class;

    move-result-object v8

    invoke-virtual {v0, v8}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v8

    filled-new-array {v6}, [Ljava/lang/Object;

    move-result-object v6

    invoke-virtual {v8, v6}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    aget-byte v8, v27, v30

    int-to-byte v8, v8

    aget-byte v10, v27, v38

    int-to-byte v10, v10

    const/16 v11, 0x2f0

    int-to-short v11, v11

    invoke-static {v8, v10, v11}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(BSI)Ljava/lang/String;

    move-result-object v8

    const/4 v10, 0x0

    new-array v11, v10, [Ljava/lang/Class;

    invoke-virtual {v0, v8, v11}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    new-array v8, v10, [Ljava/lang/Object;

    invoke-virtual {v0, v6, v8}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const/16 v41, 0x164

    aget-byte v8, v27, v41

    int-to-byte v8, v8

    aget-byte v10, v27, v24

    int-to-byte v10, v10

    const/16 v11, 0x2fb

    int-to-short v11, v11

    invoke-static {v8, v10, v11}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(BSI)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v8

    aget-byte v10, v27, v30

    int-to-byte v10, v10

    aget-byte v11, v27, v17

    int-to-byte v11, v11

    const/16 v12, 0x310

    int-to-short v12, v12

    invoke-static {v10, v11, v12}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(BSI)Ljava/lang/String;

    move-result-object v10

    const/4 v11, 0x0

    new-array v12, v11, [Ljava/lang/Class;

    invoke-virtual {v8, v10, v12}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v8

    aget-byte v10, v27, v23

    int-to-byte v10, v10

    aget-byte v11, v27, v34

    int-to-byte v11, v11

    const/16 v12, 0x26a

    int-to-short v12, v12

    invoke-static {v10, v11, v12}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(BSI)Ljava/lang/String;

    move-result-object v10

    filled-new-array {v5}, [Ljava/lang/Class;

    move-result-object v11

    invoke-virtual {v3, v10, v11}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v3
    :try_end_70
    .catchall {:try_start_70 .. :try_end_70} :catchall_44

    :try_start_71
    filled-new-array {v6}, [Ljava/lang/Object;

    move-result-object v6

    const/16 v41, 0x164

    aget-byte v10, v27, v41

    int-to-byte v10, v10

    const/16 v11, 0x1c3

    aget-byte v11, v27, v11

    int-to-byte v11, v11

    sget v12, Lcom/appsflyer/internal/AFa1hSDK;->$$b:I

    xor-int/lit16 v13, v12, 0x101

    and-int/lit16 v12, v12, 0x101

    or-int/2addr v12, v13

    int-to-short v12, v12

    invoke-static {v10, v11, v12}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(BSI)Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v10

    const/16 v41, 0x164

    aget-byte v11, v27, v41

    int-to-byte v11, v11

    aget-byte v12, v27, v18

    int-to-byte v12, v12

    invoke-static {v11, v12, v9}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(BSI)Ljava/lang/String;

    move-result-object v11

    invoke-static {v11}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v11

    filled-new-array {v11}, [Ljava/lang/Class;

    move-result-object v11

    invoke-virtual {v10, v11}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v10

    invoke-virtual {v10, v6}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6
    :try_end_71
    .catchall {:try_start_71 .. :try_end_71} :catchall_46

    :try_start_72
    aget-byte v10, v27, v30

    int-to-byte v10, v10

    const/16 v41, 0x164

    aget-byte v11, v27, v41

    int-to-byte v11, v11

    const/16 v12, 0x2c8

    int-to-short v12, v12

    invoke-static {v10, v11, v12}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(BSI)Ljava/lang/String;

    move-result-object v10

    const/4 v13, 0x0

    invoke-virtual {v7, v10, v13}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v10

    invoke-virtual {v10, v2, v13}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10
    :try_end_72
    .catchall {:try_start_72 .. :try_end_72} :catchall_45

    :try_start_73
    aget-byte v11, v27, v41

    int-to-byte v11, v11

    const/16 v12, 0x234

    aget-byte v12, v27, v12

    int-to-byte v12, v12

    const/16 v13, 0x316

    int-to-short v13, v13

    invoke-static {v11, v12, v13}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(BSI)Ljava/lang/String;

    move-result-object v11

    invoke-static {v11}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v11

    const/4 v12, 0x0

    new-array v13, v12, [Ljava/lang/Class;

    invoke-virtual {v11, v13}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v13
    :try_end_73
    .catchall {:try_start_73 .. :try_end_73} :catchall_44

    move/from16 v62, v15

    :try_start_74
    new-array v15, v12, [Ljava/lang/Object;

    invoke-virtual {v13, v15}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12
    :try_end_74
    .catchall {:try_start_74 .. :try_end_74} :catchall_42

    const/16 v46, 0x1a

    :try_start_75
    aget-byte v13, v27, v46
    :try_end_75
    .catchall {:try_start_75 .. :try_end_75} :catchall_43

    int-to-byte v13, v13

    :try_start_76
    aget-byte v15, v27, v42
    :try_end_76
    .catchall {:try_start_76 .. :try_end_76} :catchall_42

    int-to-byte v15, v15

    move-object/from16 v63, v1

    const/16 v1, 0x27b

    int-to-short v1, v1

    :try_start_77
    invoke-static {v13, v15, v1}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(BSI)Ljava/lang/String;

    move-result-object v1

    filled-new-array {v5, v14, v14}, [Ljava/lang/Class;

    move-result-object v13

    invoke-virtual {v11, v1, v13}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    aget-byte v13, v27, v34

    int-to-byte v13, v13

    aget-byte v14, v27, v31

    int-to-byte v14, v14

    const/16 v15, 0x332

    int-to-short v15, v15

    invoke-static {v13, v14, v15}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(BSI)Ljava/lang/String;

    move-result-object v13

    const/4 v14, 0x0

    new-array v15, v14, [Ljava/lang/Class;

    invoke-virtual {v11, v13, v15}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v11

    const/16 v41, 0x164

    aget-byte v13, v27, v41

    int-to-byte v13, v13

    aget-byte v14, v27, v30
    :try_end_77
    .catchall {:try_start_77 .. :try_end_77} :catchall_41

    int-to-byte v14, v14

    xor-int/lit16 v15, v14, 0x32c

    move-object/from16 v64, v5

    and-int/lit16 v5, v14, 0x32c

    or-int/2addr v5, v15

    int-to-short v5, v5

    :try_start_78
    invoke-static {v13, v14, v5}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(BSI)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v5

    aget-byte v13, v27, v25

    int-to-byte v13, v13

    aget-byte v14, v27, v42

    int-to-byte v14, v14

    xor-int/lit16 v15, v14, 0x158

    move/from16 v27, v15

    and-int/lit16 v15, v14, 0x158

    or-int v15, v27, v15

    int-to-short v15, v15

    invoke-static {v13, v14, v15}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(BSI)Ljava/lang/String;

    move-result-object v13

    const/4 v14, 0x0

    new-array v15, v14, [Ljava/lang/Class;

    invoke-virtual {v5, v13, v15}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v5

    const/16 v13, 0x400

    new-array v13, v13, [B

    const/4 v14, 0x0

    :goto_46
    filled-new-array {v13}, [Ljava/lang/Object;

    move-result-object v15

    invoke-virtual {v3, v6, v15}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Ljava/lang/Integer;

    move-object/from16 v27, v3

    invoke-virtual {v15}, Ljava/lang/Integer;->intValue()I

    move-result v3
    :try_end_78
    .catchall {:try_start_78 .. :try_end_78} :catchall_3e

    if-lez v3, :cond_44

    .line 27
    sget v66, Lcom/appsflyer/internal/AFa1hSDK;->$10:I

    and-int/lit8 v67, v66, 0x6f

    or-int/lit8 v66, v66, 0x6f

    move/from16 v68, v9

    add-int v9, v67, v66

    rem-int/lit16 v9, v9, 0x80

    sput v9, Lcom/appsflyer/internal/AFa1hSDK;->$11:I

    move-object/from16 v66, v10

    int-to-long v9, v14

    move-wide/from16 v69, v9

    const/4 v9, 0x0

    .line 28
    :try_start_79
    new-array v10, v9, [Ljava/lang/Object;

    invoke-virtual {v8, v0, v10}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/Long;

    invoke-virtual {v9}, Ljava/lang/Long;->longValue()J

    move-result-wide v9
    :try_end_79
    .catchall {:try_start_79 .. :try_end_79} :catchall_2d

    cmp-long v9, v69, v9

    if-gez v9, :cond_43

    .line 29
    sget v9, Lcom/appsflyer/internal/AFa1hSDK;->$11:I

    add-int/lit8 v9, v9, 0x51

    rem-int/lit16 v9, v9, 0x80

    sput v9, Lcom/appsflyer/internal/AFa1hSDK;->$10:I

    const/16 v32, 0x0

    .line 30
    :try_start_7a
    invoke-static/range {v32 .. v32}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    filled-new-array {v13, v9, v15}, [Ljava/lang/Object;

    move-result-object v9

    invoke-virtual {v1, v12, v9}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v9
    :try_end_7a
    .catchall {:try_start_7a .. :try_end_7a} :catchall_2d

    long-to-int v9, v9

    mul-int/lit16 v10, v3, 0x35c

    mul-int/lit16 v15, v14, -0x35a

    add-int/2addr v10, v15

    xor-int v15, v3, v9

    and-int v67, v3, v9

    or-int v15, v15, v67

    mul-int/lit16 v15, v15, -0x35b

    add-int/2addr v10, v15

    not-int v15, v9

    xor-int v67, v15, v3

    and-int v69, v15, v3

    move-object/from16 v70, v1

    or-int v1, v67, v69

    not-int v1, v1

    move/from16 v67, v1

    not-int v1, v3

    not-int v14, v14

    or-int/2addr v1, v14

    xor-int v69, v1, v9

    and-int/2addr v1, v9

    or-int v1, v69, v1

    not-int v1, v1

    xor-int v9, v67, v1

    and-int v1, v67, v1

    or-int/2addr v1, v9

    mul-int/lit16 v1, v1, 0x35b

    add-int/2addr v10, v1

    xor-int v1, v14, v15

    and-int v9, v14, v15

    or-int/2addr v1, v9

    not-int v1, v1

    xor-int v9, v14, v3

    and-int/2addr v3, v14

    or-int/2addr v3, v9

    not-int v3, v3

    xor-int v9, v1, v3

    and-int/2addr v1, v3

    or-int/2addr v1, v9

    mul-int/lit16 v1, v1, 0x35b

    add-int v14, v10, v1

    move-object/from16 v3, v27

    move-object/from16 v10, v66

    move/from16 v9, v68

    move-object/from16 v1, v70

    goto/16 :goto_46

    :catchall_2d
    move-exception v0

    move-object v3, v0

    goto/16 :goto_3c

    :cond_43
    :goto_47
    const/4 v14, 0x0

    goto :goto_48

    :cond_44
    move/from16 v68, v9

    move-object/from16 v66, v10

    goto :goto_47

    :goto_48
    :try_start_7b
    new-array v0, v14, [Ljava/lang/Object;

    invoke-virtual {v11, v12, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B
    :try_end_7b
    .catchall {:try_start_7b .. :try_end_7b} :catchall_3e

    :try_start_7c
    new-array v1, v14, [Ljava/lang/Object;

    invoke-virtual {v5, v6, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    new-array v1, v14, [Ljava/lang/Object;

    invoke-virtual {v5, v12, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_7c
    .catch Ljava/lang/Exception; {:try_start_7c .. :try_end_7c} :catch_10
    .catchall {:try_start_7c .. :try_end_7c} :catchall_2d

    :catch_10
    :try_start_7d
    sget-object v1, Lcom/appsflyer/internal/AFa1hSDK;->$$a:[B

    aget-byte v3, v1, v60

    int-to-byte v3, v3

    const/16 v5, 0xef

    aget-byte v5, v1, v5

    int-to-byte v5, v5

    const/16 v6, 0x34c

    int-to-short v6, v6

    invoke-static {v3, v5, v6}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(BSI)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v3

    const/16 v41, 0x164

    aget-byte v5, v1, v41

    int-to-byte v5, v5

    aget-byte v6, v1, v18

    int-to-byte v6, v6

    const/16 v8, 0x36f

    int-to-short v8, v8

    invoke-static {v5, v6, v8}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(BSI)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v5

    const/16 v41, 0x164

    aget-byte v6, v1, v41

    int-to-byte v6, v6

    aget-byte v9, v1, v25

    int-to-byte v9, v9

    const/16 v10, 0x381

    int-to-short v10, v10

    invoke-static {v6, v9, v10}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(BSI)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v6

    filled-new-array {v5, v6}, [Ljava/lang/Class;

    move-result-object v5

    invoke-virtual {v3, v5}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v3
    :try_end_7d
    .catchall {:try_start_7d .. :try_end_7d} :catchall_3e

    :try_start_7e
    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    const/16 v41, 0x164

    aget-byte v5, v1, v41

    int-to-byte v5, v5

    aget-byte v6, v1, v18

    int-to-byte v6, v6

    invoke-static {v5, v6, v8}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(BSI)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v5
    :try_end_7e
    .catchall {:try_start_7e .. :try_end_7e} :catchall_3f

    const/16 v46, 0x1a

    :try_start_7f
    aget-byte v6, v1, v46
    :try_end_7f
    .catchall {:try_start_7f .. :try_end_7f} :catchall_40

    int-to-byte v6, v6

    :try_start_80
    aget-byte v8, v1, v34

    int-to-byte v8, v8

    const/16 v9, 0x395

    int-to-short v9, v9

    invoke-static {v6, v8, v9}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(BSI)Ljava/lang/String;

    move-result-object v6

    filled-new-array/range {v64 .. v64}, [Ljava/lang/Class;

    move-result-object v8

    invoke-virtual {v5, v6, v8}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v5

    const/4 v13, 0x0

    invoke-virtual {v5, v13, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_80
    .catchall {:try_start_80 .. :try_end_80} :catchall_3f

    move-object/from16 v5, v66

    :try_start_81
    filled-new-array {v0, v5}, [Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_81
    .catchall {:try_start_81 .. :try_end_81} :catchall_3e

    :try_start_82
    aget-byte v3, v1, v60

    int-to-byte v3, v3

    const/16 v6, 0x140

    aget-byte v6, v1, v6

    int-to-byte v6, v6

    const/16 v8, 0x398

    int-to-short v8, v8

    invoke-static {v3, v6, v8}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(BSI)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v3

    const/16 v6, 0xf

    aget-byte v6, v1, v6

    int-to-byte v6, v6

    int-to-byte v8, v6

    xor-int/lit16 v9, v8, 0x3b0

    and-int/lit16 v10, v8, 0x3b0

    or-int/2addr v9, v10

    int-to-short v9, v9

    invoke-static {v6, v8, v9}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(BSI)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v3, v6}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v3

    const/4 v12, 0x1

    invoke-virtual {v3, v12}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    invoke-virtual {v3, v5}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v8
    :try_end_82
    .catch Ljava/lang/Exception; {:try_start_82 .. :try_end_82} :catch_15
    .catchall {:try_start_82 .. :try_end_82} :catchall_38

    const/16 v40, 0x5

    :try_start_83
    aget-byte v9, v1, v40
    :try_end_83
    .catch Ljava/lang/Exception; {:try_start_83 .. :try_end_83} :catch_11
    .catchall {:try_start_83 .. :try_end_83} :catchall_35

    int-to-byte v9, v9

    :try_start_84
    aget-byte v10, v1, v22

    int-to-byte v10, v10

    sget v11, Lcom/appsflyer/internal/AFa1hSDK;->$$b:I

    or-int/lit16 v11, v11, 0x310

    int-to-short v11, v11

    invoke-static {v9, v10, v11}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(BSI)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v9

    const/4 v12, 0x1

    invoke-virtual {v9, v12}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_84
    .catch Ljava/lang/Exception; {:try_start_84 .. :try_end_84} :catch_15
    .catchall {:try_start_84 .. :try_end_84} :catchall_38

    const/16 v40, 0x5

    :try_start_85
    aget-byte v10, v1, v40

    int-to-byte v10, v10

    const/16 v11, 0x3c8

    aget-byte v11, v1, v11

    int-to-byte v11, v11

    const/16 v12, 0x3d5

    int-to-short v12, v12

    invoke-static {v10, v11, v12}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(BSI)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v8, v10}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v8

    const/4 v12, 0x1

    invoke-virtual {v8, v12}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    invoke-virtual {v9, v6}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    invoke-virtual {v8, v6}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    invoke-virtual {v3, v0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    new-instance v11, Ljava/util/ArrayList;

    check-cast v10, Ljava/util/List;

    invoke-direct {v11, v10}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v10
    :try_end_85
    .catch Ljava/lang/Exception; {:try_start_85 .. :try_end_85} :catch_11
    .catchall {:try_start_85 .. :try_end_85} :catchall_35

    :try_start_86
    aget-byte v12, v1, v30

    int-to-byte v12, v12

    const/16 v13, 0x296

    aget-byte v1, v1, v13

    int-to-byte v1, v1

    const/16 v13, 0x3ed

    int-to-short v13, v13

    invoke-static {v12, v1, v13}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(BSI)Ljava/lang/String;

    move-result-object v1

    const/4 v13, 0x0

    invoke-virtual {v7, v1, v13}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    invoke-virtual {v1, v10, v13}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Class;
    :try_end_86
    .catchall {:try_start_86 .. :try_end_86} :catchall_37

    :try_start_87
    invoke-static {v6}, Ljava/lang/reflect/Array;->getLength(Ljava/lang/Object;)I

    move-result v10

    invoke-static {v1, v10}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;I)Ljava/lang/Object;

    move-result-object v1
    :try_end_87
    .catch Ljava/lang/Exception; {:try_start_87 .. :try_end_87} :catch_11
    .catchall {:try_start_87 .. :try_end_87} :catchall_35

    const/4 v12, 0x0

    :goto_49
    if-ge v12, v10, :cond_45

    :try_start_88
    invoke-static {v6, v12}, Ljava/lang/reflect/Array;->get(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v13

    invoke-static {v1, v12, v13}, Ljava/lang/reflect/Array;->set(Ljava/lang/Object;ILjava/lang/Object;)V
    :try_end_88
    .catch Ljava/lang/Exception; {:try_start_88 .. :try_end_88} :catch_11
    .catchall {:try_start_88 .. :try_end_88} :catchall_2e

    const/16 v43, 0x1

    xor-int/lit8 v13, v12, 0x1

    and-int/lit8 v12, v12, 0x1

    shl-int/lit8 v12, v12, 0x1

    add-int/2addr v12, v13

    goto :goto_49

    :catchall_2e
    move-exception v0

    move-object v3, v0

    move-object/from16 v8, v58

    :goto_4a
    move-object/from16 v1, v63

    goto/16 :goto_3e

    :catch_11
    move-exception v0

    move-object/from16 v8, v58

    goto/16 :goto_50

    :cond_45
    :try_start_89
    invoke-virtual {v9, v3, v11}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v8, v3, v1}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_89
    .catch Ljava/lang/Exception; {:try_start_89 .. :try_end_89} :catch_11
    .catchall {:try_start_89 .. :try_end_89} :catchall_35

    .line 31
    sget v1, Lcom/appsflyer/internal/AFa1hSDK;->$10:I

    xor-int/lit8 v3, v1, 0x73

    and-int/lit8 v1, v1, 0x73

    const/16 v43, 0x1

    shl-int/lit8 v1, v1, 0x1

    add-int/2addr v3, v1

    rem-int/lit16 v3, v3, 0x80

    sput v3, Lcom/appsflyer/internal/AFa1hSDK;->$11:I

    .line 32
    :try_start_8a
    sget-object v1, Lcom/appsflyer/internal/AFa1hSDK;->w:Ljava/lang/Object;
    :try_end_8a
    .catchall {:try_start_8a .. :try_end_8a} :catchall_35

    if-nez v1, :cond_46

    :try_start_8b
    sput-object v0, Lcom/appsflyer/internal/AFa1hSDK;->w:Ljava/lang/Object;

    :cond_46
    move-object v1, v0

    :goto_4b
    if-eqz v59, :cond_49

    .line 33
    sget-object v0, Lcom/appsflyer/internal/AFa1hSDK;->$$a:[B

    aget-byte v3, v0, v60

    int-to-byte v3, v3

    aget-byte v5, v0, v25

    int-to-byte v5, v5

    const/16 v6, 0x29b

    int-to-short v6, v6

    invoke-static {v3, v5, v6}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(BSI)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v3

    aget-byte v5, v0, v38

    int-to-byte v5, v5

    const/16 v6, 0xc6

    aget-byte v6, v0, v6

    int-to-byte v6, v6

    const/16 v8, 0x400

    int-to-short v8, v8

    invoke-static {v5, v6, v8}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(BSI)Ljava/lang/String;

    move-result-object v5

    const/16 v41, 0x164

    aget-byte v6, v0, v41

    int-to-byte v6, v6

    aget-byte v8, v0, v25

    int-to-byte v8, v8

    const/16 v9, 0x381

    int-to-short v9, v9

    invoke-static {v6, v8, v9}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(BSI)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v6

    filled-new-array {v4, v6}, [Ljava/lang/Class;

    move-result-object v6

    invoke-virtual {v3, v5, v6}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v5

    const/4 v12, 0x1

    invoke-virtual {v5, v12}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_8b
    .catchall {:try_start_8b .. :try_end_8b} :catchall_2e

    :try_start_8c
    aget-byte v6, v0, v30

    int-to-byte v6, v6

    const/16 v41, 0x164

    aget-byte v8, v0, v41

    int-to-byte v8, v8

    const/16 v9, 0x2c8

    int-to-short v9, v9

    invoke-static {v6, v8, v9}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(BSI)Ljava/lang/String;

    move-result-object v6

    const/4 v13, 0x0

    invoke-virtual {v7, v6, v13}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v6

    invoke-virtual {v6, v2, v13}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6
    :try_end_8c
    .catchall {:try_start_8c .. :try_end_8c} :catchall_2f

    move-object/from16 v8, v61

    :try_start_8d
    filled-new-array {v8, v6}, [Ljava/lang/Object;

    move-result-object v6

    invoke-virtual {v5, v1, v6}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    if-eqz v5, :cond_47

    aget-byte v6, v0, v25

    int-to-byte v6, v6

    aget-byte v0, v0, v42

    int-to-byte v0, v0

    xor-int/lit16 v8, v0, 0x158

    and-int/lit16 v9, v0, 0x158

    or-int/2addr v8, v9

    int-to-short v8, v8

    invoke-static {v6, v0, v8}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(BSI)Ljava/lang/String;

    move-result-object v0

    const/4 v14, 0x0

    new-array v6, v14, [Ljava/lang/Class;

    invoke-virtual {v3, v0, v6}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    new-array v3, v14, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    :cond_47
    move-object v0, v5

    goto :goto_4c

    :catchall_2f
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_48

    throw v1

    :cond_48
    throw v0
    :try_end_8d
    .catchall {:try_start_8d .. :try_end_8d} :catchall_2e

    :cond_49
    move-object/from16 v8, v61

    :try_start_8e
    sget-object v0, Lcom/appsflyer/internal/AFa1hSDK;->$$a:[B

    const/16 v41, 0x164

    aget-byte v3, v0, v41

    int-to-byte v3, v3

    aget-byte v5, v0, v25

    int-to-byte v5, v5

    const/16 v6, 0x381

    int-to-short v6, v6

    invoke-static {v3, v5, v6}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(BSI)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v3

    aget-byte v5, v0, v38

    int-to-byte v5, v5

    const/16 v6, 0xc6

    aget-byte v0, v0, v6

    int-to-byte v0, v0

    const/16 v6, 0x400

    int-to-short v6, v6

    invoke-static {v5, v0, v6}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(BSI)Ljava/lang/String;

    move-result-object v0

    filled-new-array {v4}, [Ljava/lang/Class;

    move-result-object v5

    invoke-virtual {v3, v0, v5}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0
    :try_end_8e
    .catchall {:try_start_8e .. :try_end_8e} :catchall_35

    const/4 v12, 0x1

    :try_start_8f
    invoke-virtual {v0, v12}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    filled-new-array {v8}, [Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v0, v1, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_8f
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_8f .. :try_end_8f} :catch_12
    .catchall {:try_start_8f .. :try_end_8f} :catchall_2e

    goto :goto_4c

    :catch_12
    move-exception v0

    :try_start_90
    invoke-virtual {v0}, Ljava/lang/reflect/InvocationTargetException;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    check-cast v0, Ljava/lang/Exception;

    throw v0
    :try_end_90
    .catch Ljava/lang/ClassNotFoundException; {:try_start_90 .. :try_end_90} :catch_13
    .catchall {:try_start_90 .. :try_end_90} :catchall_2e

    :catch_13
    const/4 v0, 0x0

    :goto_4c
    if-eqz v0, :cond_4f

    :try_start_91
    move-object v3, v0

    check-cast v3, Ljava/lang/Class;

    sget-object v0, Lcom/appsflyer/internal/AFa1hSDK;->$$a:[B

    aget-byte v5, v0, v25

    int-to-byte v5, v5

    const/16 v6, 0xaf

    aget-byte v6, v0, v6

    int-to-byte v6, v6

    const/16 v8, 0x408

    int-to-short v8, v8

    invoke-static {v5, v6, v8}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(BSI)Ljava/lang/String;

    move-result-object v11

    const-class v5, Ljava/lang/Object;

    sget-object v6, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    filled-new-array {v5, v6}, [Ljava/lang/Class;

    move-result-object v5

    invoke-virtual {v3, v5}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v5

    const/4 v12, 0x1

    invoke-virtual {v5, v12}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_91
    .catchall {:try_start_91 .. :try_end_91} :catchall_35

    move/from16 v6, v59

    if-eq v6, v12, :cond_4a

    .line 34
    sget v8, Lcom/appsflyer/internal/AFa1hSDK;->$11:I

    add-int/lit8 v8, v8, 0xf

    rem-int/lit16 v8, v8, 0x80

    sput v8, Lcom/appsflyer/internal/AFa1hSDK;->$10:I

    const/4 v12, 0x1

    goto :goto_4d

    :cond_4a
    const/4 v12, 0x0

    .line 35
    :goto_4d
    :try_start_92
    invoke-static {v12}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v8

    filled-new-array {v1, v8}, [Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v5, v1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    sput-object v1, Lcom/appsflyer/internal/AFa1hSDK;->d:Ljava/lang/Object;

    const/16 v1, 0x357c

    new-array v1, v1, [B

    const/16 v5, 0x2de

    aget-byte v5, v0, v5

    neg-int v5, v5

    int-to-byte v5, v5

    const/16 v8, 0x34

    aget-byte v8, v0, v8

    int-to-byte v8, v8

    const/16 v9, 0x428

    int-to-short v9, v9

    invoke-static {v5, v8, v9}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(BSI)Ljava/lang/String;

    move-result-object v5

    const/4 v12, 0x1

    invoke-virtual {v5, v12}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v5
    :try_end_92
    .catchall {:try_start_92 .. :try_end_92} :catchall_35

    move-object/from16 v8, v58

    :try_start_93
    invoke-virtual {v8, v5}, Ljava/util/zip/ZipFile;->getEntry(Ljava/lang/String;)Ljava/util/zip/ZipEntry;

    move-result-object v5

    invoke-virtual {v8, v5}, Ljava/util/zip/ZipFile;->getInputStream(Ljava/util/zip/ZipEntry;)Ljava/io/InputStream;

    move-result-object v5
    :try_end_93
    .catchall {:try_start_93 .. :try_end_93} :catchall_30

    :try_start_94
    filled-new-array {v5}, [Ljava/lang/Object;

    move-result-object v5

    const/16 v41, 0x164

    aget-byte v9, v0, v41

    int-to-byte v9, v9

    const/16 v10, 0x1c3

    aget-byte v10, v0, v10

    int-to-byte v10, v10

    sget v12, Lcom/appsflyer/internal/AFa1hSDK;->$$b:I

    xor-int/lit16 v13, v12, 0x101

    and-int/lit16 v12, v12, 0x101

    or-int/2addr v12, v13

    int-to-short v12, v12

    invoke-static {v9, v10, v12}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(BSI)Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v9

    const/16 v41, 0x164

    aget-byte v10, v0, v41

    int-to-byte v10, v10

    aget-byte v12, v0, v18

    int-to-byte v12, v12

    move/from16 v13, v68

    invoke-static {v10, v12, v13}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(BSI)Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v10

    filled-new-array {v10}, [Ljava/lang/Class;

    move-result-object v10

    invoke-virtual {v9, v10}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v9

    invoke-virtual {v9, v5}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5
    :try_end_94
    .catchall {:try_start_94 .. :try_end_94} :catchall_34

    :try_start_95
    filled-new-array {v5}, [Ljava/lang/Object;

    move-result-object v5

    const/16 v41, 0x164

    aget-byte v9, v0, v41

    int-to-byte v9, v9

    aget-byte v10, v0, v20

    int-to-byte v10, v10

    const/16 v12, 0x1db

    int-to-short v12, v12

    invoke-static {v9, v10, v12}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(BSI)Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v9

    const/16 v41, 0x164

    aget-byte v10, v0, v41

    int-to-byte v10, v10

    aget-byte v14, v0, v18

    int-to-byte v14, v14

    invoke-static {v10, v14, v13}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(BSI)Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v10

    filled-new-array {v10}, [Ljava/lang/Class;

    move-result-object v10

    invoke-virtual {v9, v10}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v9

    invoke-virtual {v9, v5}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5
    :try_end_95
    .catchall {:try_start_95 .. :try_end_95} :catchall_33

    :try_start_96
    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v9

    const/16 v41, 0x164

    aget-byte v10, v0, v41

    int-to-byte v10, v10

    aget-byte v13, v0, v20

    int-to-byte v13, v13

    invoke-static {v10, v13, v12}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(BSI)Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v10

    aget-byte v13, v0, v23

    int-to-byte v13, v13

    const/16 v14, 0xc6

    aget-byte v14, v0, v14

    int-to-byte v14, v14

    const/16 v15, 0x1f1

    int-to-short v15, v15

    invoke-static {v13, v14, v15}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(BSI)Ljava/lang/String;

    move-result-object v13

    filled-new-array/range {v64 .. v64}, [Ljava/lang/Class;

    move-result-object v14

    invoke-virtual {v10, v13, v14}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v10

    invoke-virtual {v10, v5, v9}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_96
    .catchall {:try_start_96 .. :try_end_96} :catchall_32

    .line 36
    sget v9, Lcom/appsflyer/internal/AFa1hSDK;->$10:I

    add-int/lit8 v9, v9, 0x33

    rem-int/lit16 v9, v9, 0x80

    sput v9, Lcom/appsflyer/internal/AFa1hSDK;->$11:I

    const/16 v41, 0x164

    .line 37
    :try_start_97
    aget-byte v9, v0, v41

    int-to-byte v9, v9

    aget-byte v10, v0, v20

    int-to-byte v10, v10

    invoke-static {v9, v10, v12}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(BSI)Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v9

    aget-byte v10, v0, v25

    int-to-byte v10, v10

    aget-byte v0, v0, v42

    int-to-byte v0, v0

    or-int/lit16 v12, v0, 0x158

    int-to-short v12, v12

    invoke-static {v10, v0, v12}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(BSI)Ljava/lang/String;

    move-result-object v0

    const/4 v13, 0x0

    invoke-virtual {v9, v0, v13}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    invoke-virtual {v0, v5, v13}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_97
    .catchall {:try_start_97 .. :try_end_97} :catchall_31

    :try_start_98
    invoke-static/range {v65 .. v65}, Ljava/lang/Math;->abs(I)I

    move-result v9

    const/16 v0, 0x3558

    move v12, v6

    move/from16 v15, v62

    move-object/from16 v5, v64

    const/16 v26, 0x4

    const/16 v28, 0x6

    const/16 v32, 0x0

    move-object v6, v1

    move-object v1, v2

    move-object/from16 v2, v63

    goto/16 :goto_31

    :catchall_30
    move-exception v0

    :goto_4e
    move-object v3, v0

    goto/16 :goto_4a

    :catchall_31
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_4b

    throw v1

    :cond_4b
    throw v0

    :catchall_32
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_4c

    throw v1

    :cond_4c
    throw v0

    :catchall_33
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_4d

    throw v1

    :cond_4d
    throw v0

    :catchall_34
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_4e

    throw v1

    :cond_4e
    throw v0

    :catchall_35
    move-exception v0

    move-object/from16 v8, v58

    goto :goto_4e

    :cond_4f
    move-object/from16 v8, v58

    move/from16 v6, v59

    const-class v0, Ljava/lang/Object;

    sget-object v3, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    filled-new-array {v0, v3}, [Ljava/lang/Class;

    move-result-object v0

    move-object/from16 v3, v26

    invoke-virtual {v3, v0}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v0

    const/4 v12, 0x1

    invoke-virtual {v0, v12}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_98
    .catchall {:try_start_98 .. :try_end_98} :catchall_30

    if-nez v6, :cond_50

    .line 38
    sget v3, Lcom/appsflyer/internal/AFa1hSDK;->$11:I

    or-int/lit8 v5, v3, 0x2d

    shl-int/2addr v5, v12

    xor-int/lit8 v3, v3, 0x2d

    sub-int/2addr v5, v3

    rem-int/lit16 v3, v5, 0x80

    sput v3, Lcom/appsflyer/internal/AFa1hSDK;->$10:I

    const/16 v35, 0x2

    rem-int/lit8 v5, v5, 0x2

    if-eqz v5, :cond_51

    :cond_50
    const/4 v3, 0x0

    goto :goto_4f

    :cond_51
    const/4 v3, 0x1

    .line 39
    :goto_4f
    :try_start_99
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    filled-new-array {v1, v3}, [Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    sput-object v0, Lcom/appsflyer/internal/AFa1hSDK;->d:Ljava/lang/Object;
    :try_end_99
    .catchall {:try_start_99 .. :try_end_99} :catchall_30

    :try_start_9a
    invoke-virtual {v8}, Ljava/util/zip/ZipFile;->close()V
    :try_end_9a
    .catchall {:try_start_9a .. :try_end_9a} :catchall_36

    .line 40
    sget v0, Lcom/appsflyer/internal/AFa1hSDK;->$11:I

    add-int/lit8 v0, v0, 0x7

    rem-int/lit16 v0, v0, 0x80

    sput v0, Lcom/appsflyer/internal/AFa1hSDK;->$10:I

    move-object/from16 v1, v63

    const/4 v13, 0x7

    const/4 v14, 0x1

    const/16 v37, 0x0

    const/16 v46, 0x1a

    goto/16 :goto_6c

    :catchall_36
    move-exception v0

    move-object/from16 v1, v63

    const/16 v43, 0x1

    const/16 v46, 0x1a

    goto/16 :goto_69

    :catchall_37
    move-exception v0

    move-object/from16 v8, v58

    .line 41
    :try_start_9b
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_52

    throw v1

    :catch_14
    move-exception v0

    goto :goto_50

    :cond_52
    throw v0
    :try_end_9b
    .catch Ljava/lang/Exception; {:try_start_9b .. :try_end_9b} :catch_14
    .catchall {:try_start_9b .. :try_end_9b} :catchall_30

    :catchall_38
    move-exception v0

    move-object/from16 v8, v58

    const/16 v40, 0x5

    goto/16 :goto_4e

    :catch_15
    move-exception v0

    move-object/from16 v8, v58

    const/16 v40, 0x5

    :goto_50
    :try_start_9c
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v3, Lcom/appsflyer/internal/AFa1hSDK;->$$a:[B

    aget-byte v6, v3, v21

    int-to-byte v6, v6

    aget-byte v9, v3, v42

    int-to-byte v9, v9

    or-int/lit16 v10, v9, 0x3f8

    int-to-short v10, v10

    invoke-static {v6, v9, v10}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(BSI)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    aget-byte v5, v3, v16
    :try_end_9c
    .catchall {:try_start_9c .. :try_end_9c} :catchall_3d

    int-to-byte v5, v5

    const/16 v46, 0x1a

    :try_start_9d
    aget-byte v6, v3, v46

    int-to-byte v6, v6

    const/16 v11, 0x123

    xor-int/lit16 v9, v6, 0x123

    and-int/lit16 v10, v6, 0x123

    or-int/2addr v9, v10

    int-to-short v9, v9

    invoke-static {v5, v6, v9}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(BSI)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1
    :try_end_9d
    .catchall {:try_start_9d .. :try_end_9d} :catchall_3c

    const/4 v13, 0x2

    :try_start_9e
    new-array v5, v13, [Ljava/lang/Object;

    const/16 v43, 0x1

    aput-object v0, v5, v43

    const/16 v32, 0x0

    aput-object v1, v5, v32

    const/16 v41, 0x164

    aget-byte v0, v3, v41

    int-to-byte v0, v0

    aget-byte v1, v3, v18

    int-to-byte v1, v1

    const/16 v11, 0x123

    int-to-short v3, v11

    invoke-static {v0, v1, v3}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(BSI)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0
    :try_end_9e
    .catchall {:try_start_9e .. :try_end_9e} :catchall_3a

    move-object/from16 v1, v63

    :try_start_9f
    filled-new-array {v4, v1}, [Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Throwable;

    throw v0
    :try_end_9f
    .catchall {:try_start_9f .. :try_end_9f} :catchall_39

    :catchall_39
    move-exception v0

    goto :goto_51

    :catchall_3a
    move-exception v0

    move-object/from16 v1, v63

    :goto_51
    :try_start_a0
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v3

    if-eqz v3, :cond_53

    throw v3

    :catchall_3b
    move-exception v0

    :goto_52
    move-object v3, v0

    goto/16 :goto_63

    :cond_53
    throw v0

    :catchall_3c
    move-exception v0

    move-object/from16 v1, v63

    goto :goto_52

    :catchall_3d
    move-exception v0

    move-object/from16 v1, v63

    :goto_53
    const/16 v46, 0x1a

    goto :goto_52

    :catchall_3e
    move-exception v0

    :goto_54
    move-object/from16 v8, v58

    move-object/from16 v1, v63

    :goto_55
    const/16 v40, 0x5

    goto :goto_53

    :catchall_3f
    move-exception v0

    move-object/from16 v8, v58

    move-object/from16 v1, v63

    const/16 v40, 0x5

    const/16 v46, 0x1a

    goto :goto_56

    :catchall_40
    move-exception v0

    move-object/from16 v8, v58

    move-object/from16 v1, v63

    const/16 v40, 0x5

    :goto_56
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v3

    if-eqz v3, :cond_54

    throw v3

    :cond_54
    throw v0

    :catchall_41
    move-exception v0

    move-object/from16 v64, v5

    goto :goto_54

    :catchall_42
    move-exception v0

    move-object/from16 v64, v5

    :goto_57
    move-object/from16 v8, v58

    goto :goto_55

    :catchall_43
    move-exception v0

    move-object/from16 v64, v5

    move-object/from16 v8, v58

    const/16 v40, 0x5

    goto :goto_52

    :catchall_44
    move-exception v0

    :goto_58
    move-object/from16 v64, v5

    move/from16 v62, v15

    goto :goto_57

    :catchall_45
    move-exception v0

    move-object/from16 v64, v5

    move/from16 v62, v15

    move-object/from16 v8, v58

    const/16 v40, 0x5

    const/16 v46, 0x1a

    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v3

    if-eqz v3, :cond_55

    throw v3

    :cond_55
    throw v0

    :catchall_46
    move-exception v0

    move-object/from16 v64, v5

    move/from16 v62, v15

    move-object/from16 v8, v58

    const/16 v40, 0x5

    const/16 v46, 0x1a

    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v3

    if-eqz v3, :cond_56

    throw v3

    :cond_56
    throw v0

    :catchall_47
    move-exception v0

    move-object v8, v2

    move-object v2, v1

    move-object v1, v8

    goto :goto_58

    :catchall_48
    move-exception v0

    move-object v8, v2

    move-object v2, v1

    move-object v1, v8

    move-object/from16 v64, v5

    move/from16 v62, v15

    move-object/from16 v8, v58

    :goto_59
    const/16 v40, 0x5

    const/16 v46, 0x1a

    const/16 v56, 0x10

    goto/16 :goto_52

    :catchall_49
    move-exception v0

    move-object v8, v2

    move-object v2, v1

    move-object v1, v8

    move-object/from16 v64, v5

    move/from16 v62, v15

    move-object/from16 v8, v58

    :goto_5a
    const/16 v40, 0x5

    const/16 v46, 0x1a

    const/16 v56, 0x10

    goto :goto_5b

    :catchall_4a
    move-exception v0

    move-object/from16 v40, v2

    move-object v2, v1

    move-object/from16 v1, v40

    move-object/from16 v64, v5

    move/from16 v62, v15

    goto :goto_5a

    :catchall_4b
    move-exception v0

    move-object/from16 v39, v2

    move-object v2, v1

    move-object/from16 v1, v39

    move-object/from16 v64, v5

    move/from16 v62, v15

    const/16 v39, 0x3

    goto :goto_5a

    .line 42
    :goto_5b
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v3

    if-eqz v3, :cond_57

    throw v3

    :cond_57
    throw v0

    :catchall_4c
    move-exception v0

    move-object/from16 v39, v2

    move-object v2, v1

    move-object/from16 v1, v39

    move-object/from16 v64, v5

    :goto_5c
    move/from16 v62, v15

    const/16 v39, 0x3

    goto :goto_59

    :catchall_4d
    move-exception v0

    move-object/from16 v39, v2

    move-object v2, v1

    move-object/from16 v1, v39

    move-object/from16 v64, v5

    move/from16 v62, v15

    const/16 v39, 0x3

    :goto_5d
    const/16 v40, 0x5

    const/16 v46, 0x1a

    const/16 v56, 0x10

    goto :goto_5e

    :catchall_4e
    move-exception v0

    move-object/from16 v39, v2

    move-object v2, v1

    move-object/from16 v1, v39

    move-object/from16 v64, v5

    move/from16 v39, v10

    move/from16 v62, v15

    goto :goto_5d

    :goto_5e
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v3

    if-eqz v3, :cond_58

    throw v3

    :cond_58
    throw v0

    :catchall_4f
    move-exception v0

    move-object/from16 v39, v2

    move-object v2, v1

    move-object/from16 v1, v39

    move-object/from16 v64, v5

    move/from16 v62, v15

    const/16 v39, 0x3

    const/16 v40, 0x5

    const/16 v46, 0x1a

    const/16 v56, 0x10

    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v3

    if-eqz v3, :cond_59

    throw v3

    :cond_59
    throw v0

    :catchall_50
    move-exception v0

    move-object/from16 v39, v2

    move-object v2, v1

    move-object/from16 v1, v39

    move-object/from16 v64, v5

    :goto_5f
    move/from16 v62, v15

    const/16 v39, 0x3

    const/16 v40, 0x5

    const/16 v46, 0x1a

    const/16 v56, 0x10

    goto :goto_60

    :catchall_51
    move-exception v0

    move-object/from16 v39, v2

    move-object v2, v1

    move-object/from16 v1, v39

    move-object/from16 v64, v5

    move/from16 v54, v14

    goto :goto_5f

    :goto_60
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v3

    if-eqz v3, :cond_5a

    throw v3

    :cond_5a
    throw v0

    :catchall_52
    move-exception v0

    move-object/from16 v39, v2

    move-object v2, v1

    move-object/from16 v1, v39

    move-object/from16 v64, v5

    :goto_61
    move/from16 v54, v14

    move/from16 v62, v15

    const/16 v39, 0x3

    const/16 v40, 0x5

    const/16 v46, 0x1a

    const/16 v56, 0x10

    goto :goto_62

    :catchall_53
    move-exception v0

    move-object/from16 v39, v2

    move-object v2, v1

    move-object/from16 v1, v39

    move-object/from16 v64, v5

    move-object/from16 v44, v13

    goto :goto_61

    :goto_62
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v3

    if-eqz v3, :cond_5b

    throw v3

    :cond_5b
    throw v0

    :catchall_54
    move-exception v0

    move-object/from16 v39, v2

    move-object v2, v1

    move-object/from16 v1, v39

    move-object/from16 v64, v5

    move-object/from16 v44, v13

    move/from16 v54, v14

    move/from16 v62, v15

    const/16 v39, 0x3

    const/16 v40, 0x5

    const/16 v46, 0x1a

    const/16 v56, 0x10

    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v3

    if-eqz v3, :cond_5c

    throw v3

    :cond_5c
    throw v0
    :try_end_a0
    .catchall {:try_start_a0 .. :try_end_a0} :catchall_3b

    :catchall_55
    move-exception v0

    move-object/from16 v39, v2

    move-object v2, v1

    move-object/from16 v1, v39

    move-object/from16 v64, v5

    move-object/from16 v44, v13

    move/from16 v54, v14

    goto/16 :goto_5c

    :goto_63
    :try_start_a1
    invoke-virtual {v8}, Ljava/util/zip/ZipFile;->close()V
    :try_end_a1
    .catchall {:try_start_a1 .. :try_end_a1} :catchall_56

    goto :goto_64

    :catchall_56
    move-exception v0

    :try_start_a2
    invoke-virtual {v3, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_64
    throw v3

    :catchall_57
    move-exception v0

    :goto_65
    const/16 v43, 0x1

    goto/16 :goto_69

    :catchall_58
    move-exception v0

    move-object/from16 v39, v2

    move-object v2, v1

    move-object/from16 v1, v39

    move-object/from16 v64, v5

    move-object/from16 v44, v13

    move/from16 v54, v14

    move/from16 v62, v15

    const/16 v39, 0x3

    const/16 v40, 0x5

    :goto_66
    const/16 v46, 0x1a

    :goto_67
    const/16 v56, 0x10

    goto :goto_65

    :catchall_59
    move-exception v0

    move-object/from16 v39, v2

    move-object v2, v1

    move-object/from16 v1, v39

    move-object/from16 v64, v5

    move/from16 v40, v9

    move-object/from16 v44, v13

    move/from16 v54, v14

    move/from16 v62, v15

    const/16 v39, 0x3

    goto :goto_66

    :catchall_5a
    move-exception v0

    move-object/from16 v39, v2

    move-object v2, v1

    move-object/from16 v1, v39

    move-object/from16 v64, v5

    :goto_68
    move-object/from16 v44, v13

    move/from16 v54, v14

    move/from16 v62, v15

    const/16 v39, 0x3

    const/16 v40, 0x5

    goto :goto_67

    :catchall_5b
    move-exception v0

    move-object/from16 v39, v2

    move-object v2, v1

    move-object/from16 v1, v39

    move-object/from16 v64, v5

    move-object/from16 v44, v13

    move/from16 v54, v14

    move/from16 v62, v15

    const/16 v39, 0x3

    const/16 v40, 0x5

    const/16 v46, 0x1a

    const/16 v56, 0x10

    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v3

    if-eqz v3, :cond_5d

    throw v3

    :cond_5d
    throw v0

    :catchall_5c
    move-exception v0

    move-object/from16 v39, v2

    move-object v2, v1

    move-object/from16 v1, v39

    move-object/from16 v64, v5

    move-object/from16 v44, v13

    move/from16 v54, v14

    move/from16 v62, v15

    const/16 v39, 0x3

    const/16 v40, 0x5

    const/16 v46, 0x1a

    const/16 v56, 0x10

    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v3

    if-eqz v3, :cond_5e

    throw v3

    :cond_5e
    throw v0
    :try_end_a2
    .catchall {:try_start_a2 .. :try_end_a2} :catchall_57

    :catchall_5d
    move-exception v0

    move-object/from16 v39, v2

    move-object v2, v1

    move-object/from16 v1, v39

    move/from16 v46, v3

    move-object/from16 v64, v5

    move/from16 v45, v6

    move-object/from16 v49, v8

    move/from16 v47, v9

    move-object/from16 v48, v10

    move-object/from16 v55, v11

    goto :goto_68

    :goto_69
    and-int/lit8 v3, v47, 0x1

    or-int/lit8 v5, v47, 0x1

    add-int/2addr v3, v5

    const/4 v13, 0x7

    :goto_6a
    if-ge v3, v13, :cond_60

    .line 43
    :try_start_a3
    aget-boolean v5, v49, v3
    :try_end_a3
    .catch Ljava/lang/Exception; {:try_start_a3 .. :try_end_a3} :catch_16

    if-eqz v5, :cond_5f

    sget v3, Lcom/appsflyer/internal/AFa1hSDK;->$10:I

    add-int/lit8 v3, v3, 0x69

    rem-int/lit16 v5, v3, 0x80

    sput v5, Lcom/appsflyer/internal/AFa1hSDK;->$11:I

    const/16 v35, 0x2

    rem-int/lit8 v3, v3, 0x2

    if-eqz v3, :cond_60

    const/16 v37, 0x0

    :try_start_a4
    sput-object v37, Lcom/appsflyer/internal/AFa1hSDK;->d:Ljava/lang/Object;

    sput-object v37, Lcom/appsflyer/internal/AFa1hSDK;->w:Ljava/lang/Object;

    :goto_6b
    move/from16 v14, v54

    :goto_6c
    add-int/lit8 v0, v47, 0x1

    move-object v3, v2

    move-object v2, v1

    move-object v1, v3

    move v12, v0

    move-object/from16 v13, v44

    move/from16 v6, v45

    move/from16 v3, v46

    move-object/from16 v10, v48

    move-object/from16 v8, v49

    move-object/from16 v11, v55

    move/from16 v15, v62

    move-object/from16 v5, v64

    const/16 v9, 0x164

    const/16 v18, 0x1

    const/16 v26, 0x4

    const/16 v28, 0x6

    const/16 v32, 0x0

    goto/16 :goto_15

    :cond_5f
    const/16 v37, 0x0

    const/16 v43, 0x1

    add-int/lit8 v3, v3, 0x1

    goto :goto_6a

    :cond_60
    sget-object v2, Lcom/appsflyer/internal/AFa1hSDK;->$$a:[B

    aget-byte v3, v2, v21

    int-to-byte v3, v3

    aget-byte v5, v2, v20

    int-to-byte v5, v5

    const/16 v6, 0x458

    int-to-short v6, v6

    invoke-static {v3, v5, v6}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(BSI)Ljava/lang/String;

    move-result-object v3
    :try_end_a4
    .catch Ljava/lang/Exception; {:try_start_a4 .. :try_end_a4} :catch_16

    const/4 v8, 0x2

    :try_start_a5
    new-array v5, v8, [Ljava/lang/Object;

    const/16 v43, 0x1

    aput-object v0, v5, v43

    const/16 v32, 0x0

    aput-object v3, v5, v32

    const/16 v41, 0x164

    aget-byte v0, v2, v41

    int-to-byte v0, v0

    aget-byte v2, v2, v18

    int-to-byte v2, v2

    const/16 v11, 0x123

    int-to-short v3, v11

    invoke-static {v0, v2, v3}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(BSI)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    filled-new-array {v4, v1}, [Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Throwable;

    throw v0
    :try_end_a5
    .catchall {:try_start_a5 .. :try_end_a5} :catchall_5e

    :catchall_5e
    move-exception v0

    :try_start_a6
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_61

    throw v1

    :cond_61
    throw v0

    :cond_62
    :goto_6d
    return-void

    :catchall_5f
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_63

    throw v1

    :cond_63
    throw v0

    :catchall_60
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_64

    throw v1

    :cond_64
    throw v0

    :catchall_61
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_65

    throw v1

    :cond_65
    throw v0
    :try_end_a6
    .catch Ljava/lang/Exception; {:try_start_a6 .. :try_end_a6} :catch_16

    :catch_16
    move-exception v0

    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1

    :catchall_62
    move-exception v0

    .line 44
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_66

    throw v1

    :cond_66
    throw v0

    :array_0
    .array-data 1
        0x0t
        0x1t
        0x1t
        0x1t
        0x1t
        0x1t
        0x1t
    .end array-data

    :array_1
    .array-data 1
        0x0t
        0x0t
        0x0t
        0x0t
        0x1t
        0x1t
        0x1t
    .end array-data
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
.end method

.method private static AFAdRevenueData(II)V
    .locals 0

    .line 1
    .line 2
    sget p0, Lcom/appsflyer/internal/AFa1hSDK;->$10:I

    .line 3
    .line 4
    xor-int/lit8 p1, p0, 0x2f

    .line 5
    .line 6
    and-int/lit8 p0, p0, 0x2f

    .line 7
    .line 8
    shl-int/lit8 p0, p0, 0x1

    .line 9
    add-int/2addr p1, p0

    .line 10
    .line 11
    rem-int/lit16 p1, p1, 0x80

    .line 12
    .line 13
    sput p1, Lcom/appsflyer/internal/AFa1hSDK;->$11:I

    .line 14
    return-void
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
.end method

.method public static getCurrencyIso4217Code(I)I
    .locals 6

    .line 1
    sget v0, Lcom/appsflyer/internal/AFa1hSDK;->$10:I

    and-int/lit8 v1, v0, 0x6b

    or-int/lit8 v0, v0, 0x6b

    add-int/2addr v1, v0

    rem-int/lit16 v1, v1, 0x80

    sput v1, Lcom/appsflyer/internal/AFa1hSDK;->$11:I

    sget-object v0, Lcom/appsflyer/internal/AFa1hSDK;->d:Ljava/lang/Object;

    add-int/lit8 v1, v1, 0x25

    rem-int/lit16 v1, v1, 0x80

    sput v1, Lcom/appsflyer/internal/AFa1hSDK;->$10:I

    :try_start_0
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    sget-object v1, Lcom/appsflyer/internal/AFa1hSDK;->$$a:[B

    const/16 v2, 0xc8

    aget-byte v2, v1, v2

    int-to-byte v2, v2

    const/16 v3, 0xaf

    aget-byte v3, v1, v3

    int-to-byte v3, v3

    xor-int/lit16 v4, v3, 0x212

    and-int/lit16 v5, v3, 0x212

    or-int/2addr v4, v5

    int-to-short v4, v4

    invoke-static {v2, v3, v4}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(BSI)Ljava/lang/String;

    move-result-object v2

    sget-object v3, Lcom/appsflyer/internal/AFa1hSDK;->w:Ljava/lang/Object;

    check-cast v3, Ljava/lang/ClassLoader;

    const/4 v4, 0x1

    invoke-static {v2, v4, v3}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object v2

    const/16 v3, 0xd

    aget-byte v3, v1, v3

    int-to-byte v3, v3

    const/16 v4, 0x11a

    aget-byte v1, v1, v4

    int-to-byte v1, v1

    const/16 v4, 0x252

    int-to-short v4, v4

    invoke-static {v3, v1, v4}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(BSI)Ljava/lang/String;

    move-result-object v1

    sget-object v3, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    filled-new-array {v3}, [Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v2, v1, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    invoke-virtual {v1, v0, p0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Integer;

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    sget v0, Lcom/appsflyer/internal/AFa1hSDK;->$11:I

    add-int/lit8 v0, v0, 0x6d

    rem-int/lit16 v0, v0, 0x80

    sput v0, Lcom/appsflyer/internal/AFa1hSDK;->$10:I

    return p0

    :catchall_0
    move-exception p0

    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_0

    throw v0

    :cond_0
    throw p0
.end method

.method public static getCurrencyIso4217Code(Ljava/lang/Object;)I
    .locals 6

    .line 2
    sget v0, Lcom/appsflyer/internal/AFa1hSDK;->$10:I

    and-int/lit8 v1, v0, 0x45

    or-int/lit8 v0, v0, 0x45

    add-int/2addr v1, v0

    rem-int/lit16 v1, v1, 0x80

    sput v1, Lcom/appsflyer/internal/AFa1hSDK;->$11:I

    sget-object v0, Lcom/appsflyer/internal/AFa1hSDK;->d:Ljava/lang/Object;

    add-int/lit8 v1, v1, 0x49

    rem-int/lit16 v1, v1, 0x80

    sput v1, Lcom/appsflyer/internal/AFa1hSDK;->$10:I

    :try_start_0
    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    sget-object v1, Lcom/appsflyer/internal/AFa1hSDK;->$$a:[B

    const/16 v2, 0xc8

    aget-byte v2, v1, v2

    int-to-byte v2, v2

    const/16 v3, 0xaf

    aget-byte v3, v1, v3

    int-to-byte v3, v3

    xor-int/lit16 v4, v3, 0x212

    and-int/lit16 v5, v3, 0x212

    or-int/2addr v4, v5

    int-to-short v4, v4

    invoke-static {v2, v3, v4}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(BSI)Ljava/lang/String;

    move-result-object v2

    sget-object v3, Lcom/appsflyer/internal/AFa1hSDK;->w:Ljava/lang/Object;

    check-cast v3, Ljava/lang/ClassLoader;

    const/4 v4, 0x1

    invoke-static {v2, v4, v3}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object v2

    const/16 v3, 0xbc

    aget-byte v3, v1, v3

    neg-int v3, v3

    int-to-byte v3, v3

    const/16 v5, 0x2b

    aget-byte v1, v1, v5

    int-to-byte v1, v1

    const/16 v5, 0x480

    int-to-short v5, v5

    invoke-static {v3, v1, v5}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(BSI)Ljava/lang/String;

    move-result-object v1

    const-class v3, Ljava/lang/Object;

    filled-new-array {v3}, [Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v2, v1, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    invoke-virtual {v1, v0, p0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Integer;

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    sget v0, Lcom/appsflyer/internal/AFa1hSDK;->$11:I

    xor-int/lit8 v1, v0, 0xf

    and-int/lit8 v0, v0, 0xf

    shl-int/2addr v0, v4

    add-int/2addr v1, v0

    rem-int/lit16 v0, v1, 0x80

    sput v0, Lcom/appsflyer/internal/AFa1hSDK;->$10:I

    rem-int/lit8 v1, v1, 0x2

    if-nez v1, :cond_0

    return p0

    :cond_0
    const/4 p0, 0x0

    throw p0

    :catchall_0
    move-exception p0

    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_1

    throw v0

    :cond_1
    throw p0
.end method

.method public static getMediationNetwork(ICI)Ljava/lang/Object;
    .locals 9

    .line 1
    .line 2
    .line 3
    const v0, 0x8b27991

    .line 4
    .line 5
    xor-int v1, v0, p0

    .line 6
    and-int/2addr v0, p0

    .line 7
    or-int/2addr v0, v1

    .line 8
    not-int v0, v0

    .line 9
    .line 10
    .line 11
    const v1, 0x134c0040

    .line 12
    .line 13
    xor-int v2, v1, v0

    .line 14
    and-int/2addr v0, v1

    .line 15
    or-int/2addr v0, v2

    .line 16
    not-int v1, p0

    .line 17
    .line 18
    .line 19
    const v2, 0x1bde10c0

    .line 20
    .line 21
    xor-int v3, v1, v2

    .line 22
    .line 23
    and-int v4, v1, v2

    .line 24
    or-int/2addr v3, v4

    .line 25
    .line 26
    .line 27
    const v4, -0x8b27992

    .line 28
    .line 29
    xor-int v5, v3, v4

    .line 30
    .line 31
    and-int v6, v3, v4

    .line 32
    or-int/2addr v5, v6

    .line 33
    not-int v5, v5

    .line 34
    .line 35
    xor-int v6, v0, v5

    .line 36
    and-int/2addr v0, v5

    .line 37
    or-int/2addr v0, v6

    .line 38
    .line 39
    mul-int/lit16 v0, v0, 0x376

    .line 40
    not-int v0, v0

    .line 41
    .line 42
    .line 43
    const v5, 0x11f84779

    .line 44
    sub-int/2addr v5, v0

    .line 45
    not-int v0, p0

    .line 46
    or-int/2addr v4, v0

    .line 47
    not-int v4, v4

    .line 48
    or-int/2addr v2, v4

    .line 49
    .line 50
    mul-int/lit16 v2, v2, -0x6ec

    .line 51
    neg-int v2, v2

    .line 52
    neg-int v2, v2

    .line 53
    .line 54
    and-int v4, v5, v2

    .line 55
    or-int/2addr v2, v5

    .line 56
    add-int/2addr v4, v2

    .line 57
    not-int v2, v3

    .line 58
    .line 59
    mul-int/lit16 v2, v2, 0x376

    .line 60
    .line 61
    and-int v3, v4, v2

    .line 62
    or-int/2addr v2, v4

    .line 63
    add-int/2addr v3, v2

    .line 64
    .line 65
    .line 66
    const v2, -0x354725bd    # -6057249.5f

    .line 67
    or-int/2addr v2, v1

    .line 68
    not-int v2, v2

    .line 69
    .line 70
    .line 71
    const v4, 0x25022184

    .line 72
    .line 73
    xor-int v5, v4, v2

    .line 74
    and-int/2addr v2, v4

    .line 75
    or-int/2addr v2, v5

    .line 76
    .line 77
    mul-int/lit16 v2, v2, -0x4a4

    .line 78
    neg-int v2, v2

    .line 79
    neg-int v2, v2

    .line 80
    not-int v2, v2

    .line 81
    .line 82
    .line 83
    const v5, 0x766a7dc8

    .line 84
    sub-int/2addr v5, v2

    .line 85
    .line 86
    .line 87
    const v2, 0x354725bc

    .line 88
    .line 89
    or-int v6, v2, p0

    .line 90
    not-int v6, v6

    .line 91
    or-int/2addr v4, v6

    .line 92
    .line 93
    .line 94
    const v6, -0x1a7dd67a

    .line 95
    .line 96
    or-int v7, v1, v6

    .line 97
    not-int v7, v7

    .line 98
    or-int/2addr v4, v7

    .line 99
    .line 100
    mul-int/lit16 v4, v4, 0x252

    .line 101
    neg-int v4, v4

    .line 102
    neg-int v4, v4

    .line 103
    .line 104
    or-int v7, v5, v4

    .line 105
    const/4 v8, 0x1

    .line 106
    shl-int/2addr v7, v8

    .line 107
    xor-int/2addr v4, v5

    .line 108
    sub-int/2addr v7, v4

    .line 109
    .line 110
    xor-int v4, v2, v0

    .line 111
    and-int/2addr v0, v2

    .line 112
    or-int/2addr v0, v4

    .line 113
    not-int v0, v0

    .line 114
    .line 115
    .line 116
    const v2, 0xa38d241

    .line 117
    .line 118
    xor-int v4, v0, v2

    .line 119
    and-int/2addr v0, v2

    .line 120
    or-int/2addr v0, v4

    .line 121
    .line 122
    xor-int v2, v1, v6

    .line 123
    and-int/2addr v1, v6

    .line 124
    or-int/2addr v1, v2

    .line 125
    not-int v1, v1

    .line 126
    .line 127
    xor-int v2, v0, v1

    .line 128
    and-int/2addr v0, v1

    .line 129
    or-int/2addr v0, v2

    .line 130
    .line 131
    mul-int/lit16 v0, v0, 0x252

    .line 132
    add-int/2addr v7, v0

    .line 133
    .line 134
    if-le v3, v7, :cond_1

    .line 135
    .line 136
    sget-object v0, Lcom/appsflyer/internal/AFa1hSDK;->d:Ljava/lang/Object;

    .line 137
    .line 138
    sget v1, Lcom/appsflyer/internal/AFa1hSDK;->$10:I

    .line 139
    .line 140
    add-int/lit8 v1, v1, 0x61

    .line 141
    .line 142
    rem-int/lit16 v1, v1, 0x80

    .line 143
    .line 144
    sput v1, Lcom/appsflyer/internal/AFa1hSDK;->$11:I

    .line 145
    const/4 v1, 0x3

    .line 146
    .line 147
    :try_start_0
    new-array v1, v1, [Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 151
    move-result-object p2

    .line 152
    const/4 v2, 0x2

    .line 153
    .line 154
    aput-object p2, v1, v2

    .line 155
    .line 156
    .line 157
    invoke-static {p1}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 158
    move-result-object p1

    .line 159
    .line 160
    aput-object p1, v1, v8

    .line 161
    .line 162
    .line 163
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 164
    move-result-object p0

    .line 165
    const/4 p1, 0x0

    .line 166
    .line 167
    aput-object p0, v1, p1

    .line 168
    .line 169
    sget-object p0, Lcom/appsflyer/internal/AFa1hSDK;->$$a:[B

    .line 170
    .line 171
    const/16 p1, 0xc8

    .line 172
    .line 173
    aget-byte p1, p0, p1

    .line 174
    int-to-byte p1, p1

    .line 175
    .line 176
    const/16 p2, 0xaf

    .line 177
    .line 178
    aget-byte p2, p0, p2

    .line 179
    int-to-byte p2, p2

    .line 180
    .line 181
    xor-int/lit16 v2, p2, 0x212

    .line 182
    .line 183
    and-int/lit16 v3, p2, 0x212

    .line 184
    or-int/2addr v2, v3

    .line 185
    int-to-short v2, v2

    .line 186
    .line 187
    .line 188
    invoke-static {p1, p2, v2}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(BSI)Ljava/lang/String;

    .line 189
    move-result-object p1

    .line 190
    .line 191
    sget-object p2, Lcom/appsflyer/internal/AFa1hSDK;->w:Ljava/lang/Object;

    .line 192
    .line 193
    check-cast p2, Ljava/lang/ClassLoader;

    .line 194
    .line 195
    .line 196
    invoke-static {p1, v8, p2}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    .line 197
    move-result-object p1

    .line 198
    .line 199
    const/16 p2, 0xd

    .line 200
    .line 201
    aget-byte p2, p0, p2

    .line 202
    int-to-byte p2, p2

    .line 203
    .line 204
    const/16 v2, 0xbf

    .line 205
    .line 206
    aget-byte p0, p0, v2

    .line 207
    int-to-byte p0, p0

    .line 208
    .line 209
    const/16 v2, 0x46e

    .line 210
    int-to-short v2, v2

    .line 211
    .line 212
    .line 213
    invoke-static {p2, p0, v2}, Lcom/appsflyer/internal/AFa1hSDK;->$$c(BSI)Ljava/lang/String;

    .line 214
    move-result-object p0

    .line 215
    .line 216
    sget-object p2, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 217
    .line 218
    sget-object v2, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    .line 219
    .line 220
    .line 221
    filled-new-array {p2, v2, p2}, [Ljava/lang/Class;

    .line 222
    move-result-object p2

    .line 223
    .line 224
    .line 225
    invoke-virtual {p1, p0, p2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 226
    move-result-object p0

    .line 227
    .line 228
    .line 229
    invoke-virtual {p0, v0, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 230
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 231
    .line 232
    sget p1, Lcom/appsflyer/internal/AFa1hSDK;->$10:I

    .line 233
    .line 234
    add-int/lit8 p1, p1, 0x27

    .line 235
    .line 236
    rem-int/lit16 p1, p1, 0x80

    .line 237
    .line 238
    sput p1, Lcom/appsflyer/internal/AFa1hSDK;->$11:I

    .line 239
    return-object p0

    .line 240
    :catchall_0
    move-exception p0

    .line 241
    .line 242
    .line 243
    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 244
    move-result-object p1

    .line 245
    .line 246
    if-eqz p1, :cond_0

    .line 247
    throw p1

    .line 248
    :cond_0
    throw p0

    .line 249
    :cond_1
    const/4 p0, 0x0

    .line 250
    throw p0
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
.end method

.method public static init$0()V
    .locals 4

    .line 1
    .line 2
    sget v0, Lcom/appsflyer/internal/AFa1hSDK;->$10:I

    .line 3
    .line 4
    add-int/lit8 v0, v0, 0x79

    .line 5
    .line 6
    rem-int/lit16 v0, v0, 0x80

    .line 7
    .line 8
    sput v0, Lcom/appsflyer/internal/AFa1hSDK;->$11:I

    .line 9
    .line 10
    const/16 v0, 0x493

    .line 11
    .line 12
    new-array v1, v0, [B

    .line 13
    .line 14
    const-string v2, ".1*\u0095\u00f2\t\u00f1\u0002\u0005\u00045\u00c6\u00f4\u0010\u00f0\u0007\u00fe\u0005\u00efD\u00ea\u00d3\u0002\u00fc\u00fc\u000c\u0000\u00f3\u0001=\u00cd\u00f0\u00ff\u00fc\u000c\u00f9\u00f2\u0013\u00f2B\u00c5\u00fa\u00f9\u000e\u00f2\u0003\u000c\u00f4<\u00ed\u00fa\u00e30\u00b6&\u000e\u00f8\u00f7\u00ff\u00f3\u0001>\u00cc\u00f0\u00ff\u00fc\u000c\u00f9\u00f2\u0013\u00f2\u00f2\t\u00f1\u0002\u0005\u00045\u00cc\u00f0\u00ffA\u00ec\u00dd\u00ee\n\u00f2\u000c\u00f4\u00fa$\u00eb\u00f5\u000c\u0003\u00fc\u00ed\u0002\u00ff\u000c\u00f6\u00f92\u00d0\u00ff\u0003\u0002\u0005\u0001\u00ec\n\u00f9\u0000\u00f2\t\u00f1\u0002\u0005\u00045\u00cc\u00f0\u00ffA\u00ec\u00d0\u00ff(\u00da\u00fc\u000c\u0000\u00f4\u00f8\u0001\u00f0*\u00da\u0004\u00f4\n\u0007\u00f4*\u00d0\u00ff\u0003\u0002\u0005\u0001\u00ec\n\u00f9\u0000\u0001\u00f0-\u00dc\u00fc\u0006\u00f1.\u00da\u00f6\u0001\u00f00\u00d3\n\u00fe!\u00e1\u00fd\u00fa\u0002 \u00da\u00f6\u0001\u00f00\u00e1\u00fd\u00fa\u0002 \u00da\u00f6\u00ca\u0002\u00ec\u00121\u00ca\u0002\u00ec\u00121\u0008\u00ea\u00142\u00c4\u00f9@\u00e7\u00dc\u00fc\u0006\u0008\u00ea\u00142\u00c4\u00f9@\u00b9\u0006\u00fc\u000b\u00fa\u00f6\u0008\u00ea\u00142\u00c1\n\u00f2\u00068\u00da\u00d9\u0005\u00fe\u000e\u00f7\u0001\u00f0#\u00dd\u0002\u00fe\n\u00f2\u00fd\u00fa\u00f3\n\u00fe\u0005\u00fb\u0001\u00fd\u00fa\u0002\u00f2\t\u00f1\u0002\u0005\u00045\u00be\u00fbD\u00eb\u00cc\u000b\u00fc\u0007?\u00cd\u0010\u00f2\u00fe\t\u00f9\u0000\u000e\u00f8\u00eb\u0015\u00fa\u00f9\u0001\u00f2\u0016\u00e4\u0008\u00f4\u000e\u0014\u00f9\u0015\u00f7\u0008\u00ea\u00142\u00c4\u00f9@\u00e4\u00f9\t\u00cc\u0014\u00fd\u00f4\u00fb\n\u00f9\u0000\u00ed\u0002\u00ff\u000c\u00f6\u00f9\u001f\u00ea\u00fb\u0007\u0017\u00e3\u00fc\u00ff\u0002\u00f5\u0008\u00ea\u00142\u00c4\u00f9@\u00e7\u00dc\u00fc\u0006\u0015\u00d9\u0000\u0003\u00fa\u0000 \u00de\u0001\u000c\u0003\u00f3\u00f6\u00fc\u00fb\r\u0014\u00fc\u0012\u00f7\u00cd\u00ed\u00ff\r\u00f0\u0000C\u00cb\u00f3\u0001=\u00cd\u00f0\u00ff\u00fc\u000c\u00f9\u00f2\u0013\u00f2B\u00c5\u00fa\u00f9\u000e\u00f2\u0003\u000c\u00f4<\u00cb\u00ff/\u0000\u00ce\u0000)\u0001\u00ff\u00cf/\u0002\u00cf\u00fe.\u00fc\u00d63\u0001\u00f0!\u00ec\u00f1\u0003\u00f9\u0002\u000e\u00fd\u0008\u00ea\u00142\u00bf\u0008\u00f0E\u00d8\u0002\u0005\u0001\u00f0#\u00ee\u00ec\u000b\u0008\u00ea\u00142\u00c4\u00f9@\u00eb\u00cc\u000e\u00ff\u0000\u00f2\u000c\u0000\u001a\u00da\u00fd\u00fa\u0000 \u00de\u0001\u000c\u0003\u00f3\u0008\u00ea\u00142\u00c4\u00f9@\u00e4\u00da\u00fd\u00fa\u0000 \u00de\u0001\u000c\u0003\u00f3\u0008\u00ea\u00142\u00c4\u00f9@\u00e9\u00e2\u00ec\u0012\u0017\u00da\u00fd\u00fa\u0000 \u00de\u0001\u000c\u0003\u00f3\u000c\u0003\u00fc\u001d\u00d0\u0008\u00ff\u00f2\u0008\u00ea\u00142\u00c4\u00f9@\u00eb\u00c8\u0004\u000e#\u00ce\u00ff\u0010\u00e7/\u00da\u00fd\u00fa\u0000 \u00de\u0001\u000c\u0003\u00f3\u00f3\u0001>\u00cc\u00f0\u00ff\u00fc\u000c\u00f9\u00f2\u0013\u00f2C\u00c4\u00fa\u00f9\u000e\u00f2\u0003\u000c\u00f4=\u00ec\u00fa\u00da9\u00c0\u001c\u000e\u00f8\u00f3\u0001>\u00cc\u00f0\u00ff\u00fc\u000c\u00f9\u00f2\u0013\u00f2C\u00c4\u00fa\u00f9\u000e\u00f2\u0003\u000c\u00f4=\u00ec\u00fa\u00e30\u00b6&\u000e\u00f8\u00f7\u00ff\u0001\u00f00\u00cd\u0002\u00ff\u000c\u00f6\n\u00e9/\u00d5\u0003:\u0001\u0000\u00f9\u00f3\u00d3\n\u00fe\u0007\u0001\u00f8\u000c\u0003\u00fc\r\u00f0!\u00ec\u0003\u00fc\u0014\u00e0\u0001\u00f2\u0014\u00fb\u0013\u00f7\u0004\u0008\u00f4\u000e\u0001\u00f0-\u0001\u0008\u00ea\u00142\u00c4\u00f9@\u00e7\u00dc\u00fc\u0006 \u00de\u00f1\u000f\u00f0\u0008\u00f8\u00fb\u0004\u00fc\u00f9\n\n\u0002\u00f4\u00f5\u000c\u00fd<\u00ba\u00f9\u0005\u00fe\u000e\u00f7>\u00e9\u00de\u00ec1\u00dc\u00fc\u0006\u00fc\r\u00fc\u001f\u00de\u00ec\u0001\u00f02\u00de\u00ee\u0003\u0002\u00f6\u0000\u000e\u0014\u00ee\u00ec\u000b\u00fe\u00f8\u0006\u00f0\u000e\u0001\u00f00\u00d6\n\u00ed\u00ff&\u00dc\r\u00fc\u00fe\u00f2\u0008\u00ea\u00142\u00b8\u0000\n\u00fc=\u00b3\u0010\u00f8A\u00d3\u00f0\u00f8&\u00da\u00fd\u00fa\u0000 \u00de\u0001\u000c\u0003\u00f3\u0001\u00f0%\u00e8\u00ec\u0003.\u00d6\u00f9\u0001\u00f8\u0008\u00ea\u00142\u00b8\u0000\n\u00fc=\u00b3\u0010\u00f8A\u00d3\u00f0\u00f8*\u00d6\u00f9\u0001\u00f8\u0001\u00f0 \u00e9\u00ee\u0014\u0008\u00ea\u00142\u00c4\u00f9@\u00eb\u00c8\u0004\u000e#\u00ce\u00ff\u0010\u00e7)\u00d9\u0000\u0003\u00fa\u0000 \u00de\u0001\u000c\u0003\u00f3\u0004,\u00c8\u0004\u000e#\u00ce\u00ff\u0010\u00e7\u0008\u00ea\u00142\u00c4\u00f9@\u00ea\u00d6\u00fc\u00fb\r\u0003\u00fe\u00f5\u0006\u0002\u00f4\u00f5\u000c\u00fd<\u00ba\u00f9\u0005\u00fe\u000e\u00f7>\u00e4\u00da \u00e7\u00f7\u00fd\u00fc\u00f84\u00de\u00ec4\u00d6\n\u00ed\u00ff&\u00dc\r\u00fc\u00fe\u00f2\u0008\u00ea\u00142\u00bf\u0004\u00f9@\u00eb\u00c8\u0004\u000e\"\u00cc\u000e\u00ff\u0000\u00f2\u0008\u00ea\u00142\u00c1\n\u00f2\u00068\u00ea\u00d6\n\u00ed\u00ff&\u00dc\r\u00fc\u00fe\u00f2\u0004\u0010\u00f0\u0002\u00f4\u00f5\u000c\u00fd<\u00ba\u00f9\u0005\u00fe\u000e\u00f7>\u00eb\u00e0\u00ed\r \u00de\u00ec4\u00d6\n\u00ed\u00ff&\u00dc\r\u00fc\u00fe\u00f2\u000e\u00ec\u000b\u001b\u00e2\u00f5\u00fe\u000c\u00ec\n\u00f2\u0010\u0018\u00e2\u0006\u00ef\u0010\u00ee\u00f84\u00da\u00f6\u000c\u0001\u00ee\u0004\u00fc\u0008\u0003\u00f1\u000c\u00ec\n\u00f2\u0010\u0018\u00e2\u0006\u00ef\u0010\u00ee\u00f8(\u00ee\u00ec\u000b\"\u00d8\u0006\u00f7\u0007\u00f6\u00f9\u0000\u0001\u00f00\u00d3\u0001\u00fc\u0000\u0000\u0008\u00f6\u00f9\u001f\u00da\u0008\n\u0014\u00f7\u0017\u00f7\u00fc\r\u00fc \u00d6\n\u00ed\u00ff\u00f3\u0001=\u00cd\u00f0\u00ff\u00fc\u000c\u00f9\u00f2\u0013\u00f2B\u00c5\u00fa\u00f9\u000e\u00f2\u0003\u000c\u00f4<\u00ed\u00fa\u00e4/\u00c8\u0014\u000e\u00f8&\u00af\u00cd\u00ed\u00ff\r\u00f0\u0000C\u00cb\u00f3\u0001=\u00cd\u00f0\u00ff\u00fc\u000c\u00f9\u00f2\u0013\u00f2B\u00c5\u00fa\u00f9\u000e\u00f2\u0003\u000c\u00f4<\u00fb\u00cd.\u00d0,\u00d6(\u00d6(\u0002\u00cf3\u00cf\u00ff\u00ff.\u00cf4\u0014\u00f8\u0016\u00f7\u00b9\u00feN\u00b9\u0004\u00f4\u00ff\t\u0000\u00fd\u00f7\u00f7R\u00b3\u0006\u00fe\u00f1J\u0001\u00f0&\u00e7\u0000\u00fa\u0007\u00ec\n\u00f9\u0000\u001f\u00e8\u00f0\u00fc\u0007\u00fc\u0006\u00fa\u0004\u00dc\u0011\u00ec\u00ee\u0010\u00f6\u00f8\u000f \u00e2\u00ec\u0012"

    .line 15
    .line 16
    const-string v3, "ISO-8859-1"

    .line 17
    .line 18
    .line 19
    invoke-virtual {v2, v3}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    .line 20
    move-result-object v2

    .line 21
    const/4 v3, 0x0

    .line 22
    .line 23
    .line 24
    invoke-static {v2, v3, v1, v3, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 25
    .line 26
    sput-object v1, Lcom/appsflyer/internal/AFa1hSDK;->$$a:[B

    .line 27
    .line 28
    const/16 v0, 0xae

    .line 29
    .line 30
    sput v0, Lcom/appsflyer/internal/AFa1hSDK;->$$b:I

    .line 31
    .line 32
    sget v0, Lcom/appsflyer/internal/AFa1hSDK;->$11:I

    .line 33
    .line 34
    add-int/lit8 v0, v0, 0x45

    .line 35
    .line 36
    rem-int/lit16 v1, v0, 0x80

    .line 37
    .line 38
    sput v1, Lcom/appsflyer/internal/AFa1hSDK;->$10:I

    .line 39
    .line 40
    rem-int/lit8 v0, v0, 0x2

    .line 41
    .line 42
    if-nez v0, :cond_0

    .line 43
    return-void

    .line 44
    :cond_0
    const/4 v0, 0x0

    .line 45
    throw v0
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
.end method
