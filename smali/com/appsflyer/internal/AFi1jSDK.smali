.class public Lcom/appsflyer/internal/AFi1jSDK;
.super Ljava/lang/Object;


# static fields
.field private static final $$a:[B = null

.field private static final $$b:I = 0x0

.field private static $10:I = 0x0

.field private static $11:I = 0x1

.field private static $12:I = 0x0

.field private static $13:I = 0x1

.field public static final AFInAppEventParameterName:Ljava/util/Map;

.field private static afDebugLog:J

.field private static afErrorLog:I

.field private static afErrorLogForExcManagerOnly:B

.field private static afInfoLog:J

.field public static final d:Ljava/util/Map;

.field private static e:Ljava/lang/Object;

.field private static force:J

.field private static i:Ljava/lang/Object;

.field private static unregisterClient:[B

.field private static v:I

.field private static w:[B


# direct methods
.method private static $$c(IIS)Ljava/lang/String;
    .locals 6

    .line 1
    .line 2
    sget v0, Lcom/appsflyer/internal/AFi1jSDK;->$12:I

    .line 3
    .line 4
    add-int/lit8 v0, v0, 0x59

    .line 5
    .line 6
    rem-int/lit16 v1, v0, 0x80

    .line 7
    .line 8
    sput v1, Lcom/appsflyer/internal/AFi1jSDK;->$13:I

    .line 9
    .line 10
    rem-int/lit8 v0, v0, 0x2

    .line 11
    const/4 v2, -0x1

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    add-int/lit8 p2, p2, 0x30

    .line 16
    .line 17
    sget-object v0, Lcom/appsflyer/internal/AFi1jSDK;->$$a:[B

    .line 18
    .line 19
    add-int/lit8 v3, p0, 0x53

    .line 20
    .line 21
    add-int/lit8 p1, p1, 0x29

    .line 22
    .line 23
    new-array v3, v3, [B

    .line 24
    .line 25
    add-int/lit8 p0, p0, 0x6e

    .line 26
    .line 27
    if-nez v0, :cond_2

    .line 28
    goto :goto_0

    .line 29
    .line 30
    :cond_0
    add-int/lit8 p2, p2, 0x21

    .line 31
    .line 32
    sget-object v0, Lcom/appsflyer/internal/AFi1jSDK;->$$a:[B

    .line 33
    .line 34
    add-int/lit8 v3, p0, 0x1

    .line 35
    .line 36
    add-int/lit8 p1, p1, 0x4

    .line 37
    .line 38
    new-array v3, v3, [B

    .line 39
    .line 40
    if-nez v0, :cond_2

    .line 41
    .line 42
    :goto_0
    add-int/lit8 v1, v1, 0x25

    .line 43
    .line 44
    rem-int/lit16 v4, v1, 0x80

    .line 45
    .line 46
    sput v4, Lcom/appsflyer/internal/AFi1jSDK;->$12:I

    .line 47
    .line 48
    rem-int/lit8 v1, v1, 0x2

    .line 49
    .line 50
    if-nez v1, :cond_1

    .line 51
    move-object v1, v0

    .line 52
    move v0, p2

    .line 53
    move p2, p1

    .line 54
    move p1, p0

    .line 55
    goto :goto_2

    .line 56
    :cond_1
    const/4 p0, 0x0

    .line 57
    throw p0

    .line 58
    .line 59
    :cond_2
    :goto_1
    add-int/lit8 v2, v2, 0x1

    .line 60
    int-to-byte v1, p2

    .line 61
    .line 62
    aput-byte v1, v3, v2

    .line 63
    .line 64
    if-ne v2, p0, :cond_3

    .line 65
    .line 66
    new-instance p0, Ljava/lang/String;

    .line 67
    const/4 p1, 0x0

    .line 68
    .line 69
    .line 70
    invoke-direct {p0, v3, p1}, Ljava/lang/String;-><init>([BI)V

    .line 71
    return-object p0

    .line 72
    .line 73
    :cond_3
    aget-byte v1, v0, p1

    .line 74
    move v5, p1

    .line 75
    move p1, p0

    .line 76
    move p0, v1

    .line 77
    move-object v1, v0

    .line 78
    move v0, p2

    .line 79
    move p2, v5

    .line 80
    :goto_2
    neg-int p0, p0

    .line 81
    add-int/2addr v0, p0

    .line 82
    .line 83
    add-int/lit8 p0, v0, -0x3

    .line 84
    .line 85
    add-int/lit8 p2, p2, 0x1

    .line 86
    move v0, p2

    .line 87
    move p2, p0

    .line 88
    move p0, p1

    .line 89
    move p1, v0

    .line 90
    move-object v0, v1

    .line 91
    goto :goto_1
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

.method static constructor <clinit>()V
    .locals 67

    const/16 v6, 0x144

    const/4 v7, 0x0

    const/16 v14, 0x9

    const/4 v15, 0x1

    const/16 v16, 0x261

    const/16 v17, -0x5

    const-class v2, [B

    invoke-static {}, Lcom/appsflyer/internal/AFi1jSDK;->init$0()V

    const/16 v18, 0x55

    const/4 v3, 0x3

    .line 1
    :try_start_0
    new-array v0, v3, [Ljava/lang/Object;

    const/16 v19, 0xbd

    invoke-static/range {v19 .. v19}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v19

    const/16 v20, 0x27

    const/4 v4, 0x2

    aput-object v19, v0, v4

    const/16 v19, 0xfb

    invoke-static/range {v19 .. v19}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v19

    aput-object v19, v0, v15

    const/16 v19, 0x40

    invoke-static/range {v19 .. v19}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v19

    aput-object v19, v0, v7

    sget-object v19, Lcom/appsflyer/internal/AFi1jSDK;->$$a:[B

    const/16 v21, 0x11f

    aget-byte v5, v19, v6

    int-to-byte v5, v5

    move/from16 v22, v6

    const/4 v6, 0x7

    const/16 v23, 0x14

    aget-byte v8, v19, v6

    int-to-short v8, v8

    const/16 v24, 0x8

    aget-byte v9, v19, v20

    int-to-byte v9, v9

    invoke-static {v5, v8, v9}, Lcom/appsflyer/internal/AFi1jSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v5

    aget-byte v8, v19, v14

    int-to-byte v8, v8

    aget-byte v9, v19, v22

    int-to-short v9, v9

    const/16 v25, 0x475

    const/16 v26, 0x5b

    aget-byte v13, v19, v25

    move-object/from16 v27, v2

    const/16 v25, 0x4

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    long-to-int v1, v1

    mul-int/lit8 v2, v13, 0x55

    or-int v28, v18, v2

    shl-int/lit8 v28, v28, 0x1

    xor-int v2, v18, v2

    sub-int v28, v28, v2

    not-int v2, v13

    const/16 v29, -0x2

    const/16 v30, 0x10

    or-int v10, v29, v2

    not-int v10, v10

    move/from16 v31, v3

    not-int v3, v1

    move/from16 v32, v15

    or-int v15, v29, v3

    not-int v15, v15

    xor-int v33, v10, v15

    and-int/2addr v10, v15

    or-int v10, v33, v10

    not-int v15, v1

    xor-int v33, v2, v15

    and-int v34, v2, v15

    or-int v11, v33, v34

    not-int v11, v11

    or-int/2addr v10, v11

    xor-int/lit8 v11, v13, 0x1

    and-int/lit8 v33, v13, 0x1

    or-int v11, v11, v33

    xor-int v33, v11, v1

    and-int v34, v11, v1

    or-int v12, v33, v34

    not-int v12, v12

    xor-int v33, v10, v12

    and-int/2addr v10, v12

    or-int v10, v33, v10

    mul-int/lit8 v10, v10, -0x54

    neg-int v10, v10

    neg-int v10, v10

    not-int v10, v10

    sub-int v28, v28, v10

    add-int/lit8 v28, v28, -0x1

    xor-int v10, v2, v1

    and-int/2addr v1, v2

    or-int/2addr v1, v10

    not-int v1, v1

    or-int/lit8 v1, v1, 0x1

    xor-int v2, v3, v13

    and-int/2addr v3, v13

    or-int/2addr v2, v3

    not-int v2, v2

    or-int/2addr v1, v2

    mul-int/lit8 v1, v1, -0x54

    not-int v1, v1

    sub-int v28, v28, v1

    add-int/lit8 v28, v28, -0x1

    xor-int v1, v15, v13

    and-int v2, v15, v13

    or-int/2addr v1, v2

    not-int v1, v1

    not-int v2, v11

    or-int/2addr v1, v2

    mul-int/lit8 v1, v1, 0x54

    xor-int v2, v28, v1

    and-int v1, v28, v1

    shl-int/lit8 v1, v1, 0x1

    add-int/2addr v2, v1

    int-to-byte v1, v2

    invoke-static {v8, v9, v1}, Lcom/appsflyer/internal/AFi1jSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v1

    sget-object v2, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    filled-new-array {v2, v2, v2}, [Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v5, v1, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v2, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_60

    const v1, 0x7d76fdfb

    or-int/2addr v1, v0

    mul-int/lit16 v1, v1, -0x273

    const v3, 0x4c5f6120

    or-int v5, v3, v1

    shl-int/lit8 v5, v5, 0x1

    xor-int/2addr v1, v3

    sub-int/2addr v5, v1

    const v1, -0x11604ce4

    xor-int v3, v1, v0

    and-int/2addr v1, v0

    or-int/2addr v1, v3

    not-int v1, v1

    const v3, -0x7c76f9fb

    xor-int v8, v3, v1

    and-int/2addr v1, v3

    or-int/2addr v1, v8

    mul-int/lit16 v1, v1, -0x273

    add-int/2addr v5, v1

    not-int v1, v0

    const v8, 0x11604ce3

    or-int/2addr v1, v8

    not-int v1, v1

    xor-int v8, v3, v0

    and-int/2addr v0, v3

    or-int/2addr v0, v8

    not-int v0, v0

    or-int/2addr v0, v1

    mul-int/lit16 v0, v0, 0x273

    or-int v1, v5, v0

    shl-int/lit8 v1, v1, 0x1

    xor-int/2addr v0, v5

    sub-int/2addr v1, v0

    if-nez v1, :cond_0

    goto/16 :goto_5b

    :cond_0
    const-wide v0, -0x42caa9b7eb32b53aL    # -7.580438453908188E-14

    sput-wide v0, Lcom/appsflyer/internal/AFi1jSDK;->afDebugLog:J

    const/16 v0, 0x4a

    sput-byte v0, Lcom/appsflyer/internal/AFi1jSDK;->afErrorLogForExcManagerOnly:B

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lcom/appsflyer/internal/AFi1jSDK;->AFInAppEventParameterName:Ljava/util/Map;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lcom/appsflyer/internal/AFi1jSDK;->d:Ljava/util/Map;

    const/16 v0, 0x388

    :try_start_1
    aget-byte v0, v19, v0

    int-to-byte v0, v0

    aget-byte v1, v19, v26

    neg-int v1, v1

    int-to-short v1, v1

    sget v3, Lcom/appsflyer/internal/AFi1jSDK;->$$b:I

    int-to-byte v5, v3

    invoke-static {v0, v1, v5}, Lcom/appsflyer/internal/AFi1jSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v1

    sget-object v0, Lcom/appsflyer/internal/AFi1jSDK;->e:Ljava/lang/Object;

    if-nez v0, :cond_1

    const/16 v0, 0x2b

    aget-byte v0, v19, v0

    int-to-byte v0, v0

    const/16 v5, 0x23a

    aget-byte v5, v19, v5

    int-to-short v5, v5

    int-to-byte v8, v3

    invoke-static {v0, v5, v8}, Lcom/appsflyer/internal/AFi1jSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_13

    goto :goto_0

    :cond_1
    move-object v0, v2

    :goto_0
    const/16 v5, 0x3c7

    const/16 v8, 0x1aa

    .line 2
    :try_start_2
    aget-byte v5, v19, v5

    int-to-byte v5, v5

    aget-byte v9, v19, v8

    int-to-short v9, v9

    aget-byte v10, v19, v20

    int-to-byte v10, v10

    invoke-static {v5, v9, v10}, Lcom/appsflyer/internal/AFi1jSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v5

    const/16 v9, 0x25

    aget-byte v9, v19, v9

    int-to-byte v9, v9

    const/16 v10, 0x5c

    int-to-short v10, v10

    int-to-byte v3, v3

    invoke-static {v9, v10, v3}, Lcom/appsflyer/internal/AFi1jSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v3

    new-array v9, v7, [Ljava/lang/Class;

    invoke-virtual {v5, v3, v9}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v3

    invoke-virtual {v3, v2, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    if-eqz v3, :cond_2

    goto :goto_1

    :catch_0
    move-object v3, v2

    :cond_2
    :try_start_3
    sget-object v5, Lcom/appsflyer/internal/AFi1jSDK;->$$a:[B

    aget-byte v9, v5, v22

    int-to-byte v9, v9

    const/16 v10, 0x6d

    int-to-short v10, v10

    aget-byte v11, v5, v20

    int-to-byte v11, v11

    invoke-static {v9, v10, v11}, Lcom/appsflyer/internal/AFi1jSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v9

    aget-byte v5, v5, v21

    int-to-byte v5, v5

    const/16 v10, 0x82

    int-to-short v10, v10

    sget v11, Lcom/appsflyer/internal/AFi1jSDK;->$$b:I

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v12

    long-to-int v12, v12

    mul-int/lit16 v13, v11, -0x3a1

    const/16 v15, -0x740

    add-int/2addr v15, v13

    xor-int v13, v11, v12

    and-int v19, v11, v12

    or-int v13, v13, v19

    not-int v8, v13

    xor-int v28, v17, v8

    and-int v8, v17, v8

    or-int v8, v28, v8

    mul-int/lit16 v8, v8, -0x1d1

    add-int/2addr v15, v8

    xor-int v8, v17, v12

    and-int v12, v17, v12

    or-int/2addr v8, v12

    not-int v8, v8

    xor-int v12, v11, v8

    and-int/2addr v8, v11

    or-int/2addr v8, v12

    mul-int/lit16 v8, v8, 0x3a2

    neg-int v8, v8

    neg-int v8, v8

    or-int v11, v15, v8

    shl-int/lit8 v11, v11, 0x1

    xor-int/2addr v8, v15

    sub-int/2addr v11, v8

    xor-int/lit8 v8, v13, -0x5

    and-int/lit8 v12, v13, -0x5

    or-int/2addr v8, v12

    mul-int/lit16 v8, v8, 0x1d1

    neg-int v8, v8

    neg-int v8, v8

    xor-int v12, v11, v8

    and-int/2addr v8, v11

    shl-int/lit8 v8, v8, 0x1

    add-int/2addr v12, v8

    int-to-byte v8, v12

    invoke-static {v5, v10, v8}, Lcom/appsflyer/internal/AFi1jSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v5

    new-array v8, v7, [Ljava/lang/Class;

    invoke-virtual {v9, v5, v8}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v5

    invoke-virtual {v5, v2, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    :catch_1
    :goto_1
    const/16 v5, 0x22

    if-eqz v3, :cond_3

    .line 3
    :try_start_4
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v8

    sget-object v9, Lcom/appsflyer/internal/AFi1jSDK;->$$a:[B

    aget-byte v9, v9, v5

    int-to-byte v9, v9

    const/16 v10, 0x96

    int-to-short v10, v10

    sget v11, Lcom/appsflyer/internal/AFi1jSDK;->$$b:I

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v12
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_3

    long-to-int v12, v12

    mul-int/lit16 v13, v11, 0x235

    not-int v13, v13

    rsub-int v13, v13, -0x8cd

    not-int v15, v11

    move/from16 v28, v7

    not-int v7, v12

    xor-int v33, v15, v7

    and-int/2addr v7, v15

    or-int v7, v33, v7

    not-int v7, v7

    xor-int v15, v17, v7

    and-int v7, v17, v7

    or-int/2addr v7, v15

    xor-int v15, v11, v12

    and-int v33, v11, v12

    or-int v15, v15, v33

    not-int v15, v15

    xor-int v33, v7, v15

    and-int/2addr v7, v15

    or-int v7, v33, v7

    mul-int/lit16 v7, v7, -0x234

    neg-int v7, v7

    neg-int v7, v7

    not-int v7, v7

    sub-int/2addr v13, v7

    add-int/lit8 v13, v13, -0x1

    or-int v7, v17, v11

    xor-int v15, v7, v12

    and-int/2addr v7, v12

    or-int/2addr v7, v15

    not-int v7, v7

    mul-int/lit16 v7, v7, 0x468

    not-int v7, v7

    sub-int/2addr v13, v7

    add-int/lit8 v13, v13, -0x1

    not-int v7, v12

    xor-int v12, v17, v7

    and-int v7, v17, v7

    or-int/2addr v7, v12

    not-int v7, v7

    xor-int/lit8 v12, v11, 0x4

    and-int/lit8 v11, v11, 0x4

    or-int/2addr v11, v12

    not-int v11, v11

    or-int/2addr v7, v11

    mul-int/lit16 v7, v7, 0x234

    xor-int v11, v13, v7

    and-int/2addr v7, v13

    shl-int/lit8 v7, v7, 0x1

    add-int/2addr v11, v7

    int-to-byte v7, v11

    :try_start_5
    invoke-static {v9, v10, v7}, Lcom/appsflyer/internal/AFi1jSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v8, v7, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v7

    invoke-virtual {v7, v3, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_2

    goto :goto_3

    :catch_2
    :goto_2
    move-object v7, v2

    goto :goto_3

    :catch_3
    :cond_3
    move/from16 v28, v7

    goto :goto_2

    :goto_3
    const/16 v8, 0xd

    if-eqz v3, :cond_4

    sget v9, Lcom/appsflyer/internal/AFi1jSDK;->$10:I

    and-int/lit8 v10, v9, 0x2d

    or-int/lit8 v9, v9, 0x2d

    add-int/2addr v10, v9

    rem-int/lit16 v10, v10, 0x80

    sput v10, Lcom/appsflyer/internal/AFi1jSDK;->$11:I

    :try_start_6
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v9

    sget-object v10, Lcom/appsflyer/internal/AFi1jSDK;->$$a:[B

    aget-byte v10, v10, v8

    int-to-byte v10, v10

    const/16 v11, 0xa0

    int-to-short v11, v11

    sget v12, Lcom/appsflyer/internal/AFi1jSDK;->$$b:I

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v14

    long-to-int v14, v14

    mul-int/lit16 v15, v12, 0x17e

    const/16 v33, -0x5f0

    or-int v34, v33, v15

    shl-int/lit8 v34, v34, 0x1

    xor-int v15, v33, v15

    sub-int v34, v34, v15

    or-int v15, v12, v14

    xor-int/lit8 v33, v15, -0x5

    and-int/lit8 v15, v15, -0x5

    or-int v15, v33, v15

    mul-int/lit16 v15, v15, -0x17d

    neg-int v15, v15

    neg-int v15, v15

    and-int v33, v34, v15

    or-int v15, v34, v15

    add-int v33, v33, v15

    not-int v15, v12

    xor-int v34, v17, v15

    and-int v15, v17, v15

    or-int v15, v34, v15

    not-int v15, v15

    not-int v14, v14

    xor-int v34, v14, v12

    and-int/2addr v14, v12

    or-int v14, v34, v14

    not-int v14, v14

    xor-int v34, v15, v14

    and-int/2addr v14, v15

    or-int v14, v34, v14

    xor-int/lit8 v15, v12, 0x4

    and-int/lit8 v34, v12, 0x4

    or-int v15, v15, v34

    not-int v15, v15

    or-int/2addr v14, v15

    mul-int/lit16 v14, v14, 0x17d

    neg-int v14, v14

    neg-int v14, v14

    or-int v15, v33, v14

    shl-int/lit8 v15, v15, 0x1

    xor-int v14, v33, v14

    sub-int/2addr v15, v14

    xor-int v14, v17, v12

    and-int v12, v17, v12

    or-int/2addr v12, v14

    not-int v12, v12

    mul-int/lit16 v12, v12, 0x17d

    not-int v12, v12

    sub-int/2addr v15, v12

    add-int/lit8 v15, v15, -0x1

    int-to-byte v12, v15

    invoke-static {v10, v11, v12}, Lcom/appsflyer/internal/AFi1jSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v9, v10, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v9

    invoke-virtual {v9, v3, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_4

    goto :goto_4

    :catch_4
    :cond_4
    move-object v9, v2

    :goto_4
    if-eqz v3, :cond_5

    sget v10, Lcom/appsflyer/internal/AFi1jSDK;->$11:I

    or-int/lit8 v11, v10, 0x2b

    shl-int/lit8 v11, v11, 0x1

    xor-int/lit8 v10, v10, 0x2b

    sub-int/2addr v11, v10

    rem-int/lit16 v11, v11, 0x80

    sput v11, Lcom/appsflyer/internal/AFi1jSDK;->$10:I

    :try_start_7
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v10

    sget-object v11, Lcom/appsflyer/internal/AFi1jSDK;->$$a:[B

    aget-byte v11, v11, v5

    int-to-byte v11, v11

    xor-int/lit16 v12, v11, 0xa4

    and-int/lit16 v14, v11, 0xa4

    or-int/2addr v12, v14

    int-to-short v12, v12

    sget v14, Lcom/appsflyer/internal/AFi1jSDK;->$$b:I

    and-int/lit8 v15, v14, 0x4

    or-int/lit8 v14, v14, 0x4

    add-int/2addr v15, v14

    int-to-byte v14, v15

    invoke-static {v11, v12, v14}, Lcom/appsflyer/internal/AFi1jSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v10, v11, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v10

    invoke-virtual {v10, v3, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_5

    goto :goto_5

    :catch_5
    :cond_5
    move-object v3, v2

    :goto_5
    const-class v10, Ljava/lang/String;

    const/16 v11, 0xd8

    if-eqz v7, :cond_6

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    :goto_6
    move/from16 v33, v8

    goto :goto_7

    :cond_6
    if-nez v0, :cond_7

    move-object v7, v2

    goto :goto_6

    :cond_7
    :try_start_8
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v12, Lcom/appsflyer/internal/AFi1jSDK;->$$a:[B

    aget-byte v14, v12, v5

    int-to-byte v14, v14

    const/16 v15, 0xb8

    int-to-short v15, v15

    move/from16 v33, v8

    aget-byte v8, v12, v33

    int-to-byte v8, v8

    invoke-static {v14, v15, v8}, Lcom/appsflyer/internal/AFi1jSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_13

    :try_start_9
    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    aget-byte v7, v12, v32

    int-to-byte v7, v7

    sget v8, Lcom/appsflyer/internal/AFi1jSDK;->$$b:I

    xor-int/lit16 v14, v8, 0x80

    and-int/lit16 v8, v8, 0x80

    or-int/2addr v8, v14

    int-to-short v8, v8

    aget-byte v12, v12, v11

    neg-int v12, v12

    int-to-byte v12, v12

    invoke-static {v7, v8, v12}, Lcom/appsflyer/internal/AFi1jSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v7

    filled-new-array {v10}, [Ljava/lang/Class;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v7

    invoke-virtual {v7, v0}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_5f

    :goto_7
    if-eqz v3, :cond_9

    sget v0, Lcom/appsflyer/internal/AFi1jSDK;->$11:I

    or-int/lit8 v8, v0, 0x1d

    shl-int/lit8 v8, v8, 0x1

    xor-int/lit8 v0, v0, 0x1d

    sub-int/2addr v8, v0

    rem-int/lit16 v0, v8, 0x80

    sput v0, Lcom/appsflyer/internal/AFi1jSDK;->$10:I

    rem-int/2addr v8, v4

    if-eqz v8, :cond_8

    const/4 v0, 0x3

    :try_start_a
    div-int/lit8 v0, v0, 0x0
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_13
    .catchall {:try_start_a .. :try_end_a} :catchall_0

    goto :goto_8

    :catchall_0
    move-exception v0

    throw v0

    :cond_8
    :goto_8
    move/from16 v36, v11

    goto/16 :goto_9

    :cond_9
    :try_start_b
    sget-object v0, Lcom/appsflyer/internal/AFi1jSDK;->$$a:[B

    const/16 v3, 0x29e

    aget-byte v3, v0, v3

    int-to-byte v3, v3

    or-int/lit16 v8, v3, 0xc0

    int-to-short v8, v8

    aget-byte v12, v0, v11

    neg-int v12, v12

    int-to-byte v12, v12

    invoke-static {v3, v8, v12}, Lcom/appsflyer/internal/AFi1jSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v3
    :try_end_b
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_13

    sget v8, Lcom/appsflyer/internal/AFi1jSDK;->$10:I

    or-int/lit8 v12, v8, 0x51

    shl-int/lit8 v12, v12, 0x1

    xor-int/lit8 v8, v8, 0x51

    sub-int/2addr v12, v8

    rem-int/lit16 v12, v12, 0x80

    sput v12, Lcom/appsflyer/internal/AFi1jSDK;->$11:I

    :try_start_c
    filled-new-array {v3}, [Ljava/lang/Object;

    move-result-object v3

    const/16 v8, 0x47e

    aget-byte v8, v0, v8

    int-to-byte v8, v8

    sget v12, Lcom/appsflyer/internal/AFi1jSDK;->$$b:I

    xor-int/lit16 v14, v12, 0x98

    and-int/lit16 v15, v12, 0x98

    or-int/2addr v14, v15

    int-to-short v14, v14

    aget-byte v15, v0, v11

    neg-int v15, v15

    int-to-byte v15, v15

    invoke-static {v8, v14, v15}, Lcom/appsflyer/internal/AFi1jSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v8

    aget-byte v14, v0, v5

    int-to-byte v14, v14

    const/16 v15, 0xe9

    int-to-short v15, v15

    and-int/lit8 v34, v12, 0x4

    or-int/lit8 v35, v12, 0x4

    move/from16 v36, v11

    add-int v11, v34, v35

    int-to-byte v11, v11

    invoke-static {v14, v15, v11}, Lcom/appsflyer/internal/AFi1jSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v11

    filled-new-array {v10}, [Ljava/lang/Class;

    move-result-object v14

    invoke-virtual {v8, v11, v14}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v8

    invoke-virtual {v8, v2, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_5e

    :try_start_d
    filled-new-array {v3}, [Ljava/lang/Object;

    move-result-object v3

    aget-byte v8, v0, v32

    int-to-byte v8, v8

    xor-int/lit16 v11, v12, 0x80

    and-int/lit16 v12, v12, 0x80

    or-int/2addr v11, v12

    int-to-short v11, v11

    aget-byte v0, v0, v36

    neg-int v0, v0

    int-to-byte v0, v0

    invoke-static {v8, v11, v0}, Lcom/appsflyer/internal/AFi1jSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    filled-new-array {v10}, [Ljava/lang/Class;

    move-result-object v8

    invoke-virtual {v0, v8}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_5d

    :goto_9
    if-nez v9, :cond_b

    if-eqz v7, :cond_b

    :try_start_e
    sget-object v0, Lcom/appsflyer/internal/AFi1jSDK;->$$a:[B

    const/16 v8, 0xdb

    aget-byte v8, v0, v8

    int-to-byte v8, v8

    sget v9, Lcom/appsflyer/internal/AFi1jSDK;->$$b:I

    xor-int/lit16 v11, v9, 0xb1

    and-int/lit16 v12, v9, 0xb1

    or-int/2addr v11, v12

    int-to-short v11, v11

    int-to-byte v12, v9

    invoke-static {v8, v11, v12}, Lcom/appsflyer/internal/AFi1jSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v8
    :try_end_e
    .catch Ljava/lang/Exception; {:try_start_e .. :try_end_e} :catch_13

    sget v11, Lcom/appsflyer/internal/AFi1jSDK;->$10:I

    add-int/lit8 v11, v11, 0xf

    rem-int/lit16 v11, v11, 0x80

    sput v11, Lcom/appsflyer/internal/AFi1jSDK;->$11:I

    :try_start_f
    new-array v11, v4, [Ljava/lang/Object;

    aput-object v8, v11, v32

    aput-object v7, v11, v28

    aget-byte v8, v0, v32

    int-to-byte v8, v8

    or-int/lit16 v12, v9, 0x80

    int-to-short v12, v12

    aget-byte v14, v0, v36

    neg-int v14, v14

    int-to-byte v14, v14

    invoke-static {v8, v12, v14}, Lcom/appsflyer/internal/AFi1jSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v8

    aget-byte v12, v0, v32

    int-to-byte v12, v12

    xor-int/lit16 v14, v9, 0x80

    and-int/lit16 v9, v9, 0x80

    or-int/2addr v9, v14

    int-to-short v9, v9

    aget-byte v0, v0, v36

    neg-int v0, v0

    int-to-byte v0, v0

    invoke-static {v12, v9, v0}, Lcom/appsflyer/internal/AFi1jSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    filled-new-array {v0, v10}, [Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v8, v0}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v0

    invoke-virtual {v0, v11}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_1

    goto :goto_a

    :catchall_1
    move-exception v0

    :try_start_10
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_a

    throw v1

    :cond_a
    throw v0

    :cond_b
    :goto_a
    sget-object v0, Lcom/appsflyer/internal/AFi1jSDK;->$$a:[B

    aget-byte v8, v0, v32

    int-to-byte v8, v8

    sget v11, Lcom/appsflyer/internal/AFi1jSDK;->$$b:I

    xor-int/lit16 v12, v11, 0x80

    and-int/lit16 v11, v11, 0x80

    or-int/2addr v11, v12

    int-to-short v11, v11

    aget-byte v12, v0, v36

    neg-int v12, v12

    int-to-byte v12, v12

    invoke-static {v8, v11, v12}, Lcom/appsflyer/internal/AFi1jSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v8

    invoke-static {v8, v6}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, [Ljava/lang/Object;

    aput-object v2, v8, v28

    aput-object v9, v8, v32

    aput-object v7, v8, v4

    aput-object v3, v8, v31

    aput-object v9, v8, v25

    const/4 v9, 0x5

    aput-object v7, v8, v9

    const/4 v7, 0x6

    aput-object v3, v8, v7

    const/4 v3, 0x7

    new-array v3, v3, [Z

    fill-array-data v3, :array_0

    const/4 v7, 0x7

    new-array v7, v7, [Z

    fill-array-data v7, :array_1

    new-array v11, v6, [Z

    aput-boolean v28, v11, v28

    aput-boolean v28, v11, v32

    aput-boolean v32, v11, v4

    aput-boolean v32, v11, v31

    aput-boolean v28, v11, v25

    aput-boolean v32, v11, v9

    const/4 v12, 0x6

    aput-boolean v32, v11, v12
    :try_end_10
    .catch Ljava/lang/Exception; {:try_start_10 .. :try_end_10} :catch_13

    :try_start_11
    aget-byte v12, v0, v26

    neg-int v12, v12

    int-to-byte v12, v12

    const/16 v14, 0xfc

    int-to-short v14, v14

    aget-byte v15, v0, v20

    int-to-byte v15, v15

    invoke-static {v12, v14, v15}, Lcom/appsflyer/internal/AFi1jSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v12

    invoke-static {v12}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v12

    const/16 v14, 0xc6

    aget-byte v14, v0, v14

    int-to-byte v14, v14

    const/16 v15, 0x113

    int-to-short v15, v15

    const/16 v34, 0x190

    aget-byte v0, v0, v34

    int-to-byte v0, v0

    invoke-static {v14, v15, v0}, Lcom/appsflyer/internal/AFi1jSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v12, v0}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v0

    invoke-virtual {v0, v12}, Ljava/lang/reflect/Field;->getInt(Ljava/lang/Object;)I

    move-result v0
    :try_end_11
    .catch Ljava/lang/ClassNotFoundException; {:try_start_11 .. :try_end_11} :catch_6
    .catch Ljava/lang/Exception; {:try_start_11 .. :try_end_11} :catch_13

    if-lt v0, v5, :cond_c

    move/from16 v12, v32

    goto :goto_b

    :cond_c
    move/from16 v12, v28

    :goto_b
    const/16 v14, 0x1d

    if-ne v0, v14, :cond_d

    goto :goto_c

    :cond_d
    const/16 v14, 0x1a

    if-lt v0, v14, :cond_e

    move/from16 v14, v32

    goto :goto_d

    :cond_e
    :goto_c
    move/from16 v14, v28

    :goto_d
    :try_start_12
    aput-boolean v14, v11, v28
    :try_end_12
    .catch Ljava/lang/ClassNotFoundException; {:try_start_12 .. :try_end_12} :catch_7
    .catch Ljava/lang/Exception; {:try_start_12 .. :try_end_12} :catch_13

    const/16 v14, 0x15

    if-lt v0, v14, :cond_f

    sget v14, Lcom/appsflyer/internal/AFi1jSDK;->$10:I

    and-int/lit8 v15, v14, 0x49

    or-int/lit8 v14, v14, 0x49

    add-int/2addr v15, v14

    rem-int/lit16 v15, v15, 0x80

    sput v15, Lcom/appsflyer/internal/AFi1jSDK;->$11:I

    move/from16 v14, v32

    goto :goto_e

    :cond_f
    move/from16 v14, v28

    :goto_e
    :try_start_13
    aput-boolean v14, v11, v32
    :try_end_13
    .catch Ljava/lang/ClassNotFoundException; {:try_start_13 .. :try_end_13} :catch_7
    .catch Ljava/lang/Exception; {:try_start_13 .. :try_end_13} :catch_13

    const/16 v14, 0x15

    if-lt v0, v14, :cond_10

    sget v0, Lcom/appsflyer/internal/AFi1jSDK;->$10:I

    or-int/lit8 v14, v0, 0x3b

    shl-int/lit8 v14, v14, 0x1

    xor-int/lit8 v0, v0, 0x3b

    sub-int/2addr v14, v0

    rem-int/lit16 v14, v14, 0x80

    sput v14, Lcom/appsflyer/internal/AFi1jSDK;->$11:I

    move/from16 v0, v32

    goto :goto_f

    :cond_10
    move/from16 v0, v28

    :goto_f
    :try_start_14
    aput-boolean v0, v11, v25
    :try_end_14
    .catch Ljava/lang/ClassNotFoundException; {:try_start_14 .. :try_end_14} :catch_7
    .catch Ljava/lang/Exception; {:try_start_14 .. :try_end_14} :catch_13

    goto :goto_10

    :catch_6
    move/from16 v12, v28

    :catch_7
    :goto_10
    move/from16 v14, v28

    move v15, v14

    :goto_11
    if-nez v14, :cond_5f

    sget v0, Lcom/appsflyer/internal/AFi1jSDK;->$11:I

    or-int/lit8 v34, v0, 0x37

    shl-int/lit8 v34, v34, 0x1

    xor-int/lit8 v35, v0, 0x37

    move/from16 v37, v5

    sub-int v5, v34, v35

    rem-int/lit16 v5, v5, 0x80

    sput v5, Lcom/appsflyer/internal/AFi1jSDK;->$10:I

    const/16 v13, 0x9

    if-ge v15, v13, :cond_5f

    :try_start_15
    aget-boolean v5, v11, v15
    :try_end_15
    .catch Ljava/lang/Exception; {:try_start_15 .. :try_end_15} :catch_13

    if-eqz v5, :cond_5e

    const/16 v34, 0xc8

    :try_start_16
    aget-boolean v35, v3, v15
    :try_end_16
    .catchall {:try_start_16 .. :try_end_16} :catchall_5a

    const/16 v38, 0x268

    :try_start_17
    aget-object v5, v8, v15

    aget-boolean v39, v7, v15
    :try_end_17
    .catchall {:try_start_17 .. :try_end_17} :catchall_59

    const/16 v40, 0x19

    const/16 v41, 0x9f

    if-eqz v35, :cond_16

    xor-int/lit8 v42, v0, 0x55

    and-int/lit8 v0, v0, 0x55

    shl-int/lit8 v0, v0, 0x1

    add-int v0, v42, v0

    rem-int/lit16 v13, v0, 0x80

    sput v13, Lcom/appsflyer/internal/AFi1jSDK;->$10:I

    rem-int/2addr v0, v4

    if-eqz v0, :cond_12

    const/16 v0, 0x4a

    :try_start_18
    div-int/lit8 v0, v0, 0x0
    :try_end_18
    .catchall {:try_start_18 .. :try_end_18} :catchall_2

    if-eqz v5, :cond_11

    goto :goto_13

    :cond_11
    move/from16 v45, v4

    move/from16 v43, v6

    move/from16 v44, v9

    goto/16 :goto_17

    :catchall_2
    move-exception v0

    move-object/from16 v50, v1

    move-object/from16 v48, v3

    move/from16 v43, v6

    move-object/from16 v52, v7

    move-object/from16 v51, v8

    move/from16 v44, v9

    :goto_12
    move-object v7, v10

    move-object/from16 v60, v11

    move/from16 v61, v12

    move/from16 v54, v14

    move/from16 v55, v15

    move-object/from16 v59, v27

    const/16 v19, 0x1aa

    goto/16 :goto_54

    :cond_12
    if-eqz v5, :cond_11

    .line 4
    :goto_13
    :try_start_19
    sget-object v0, Lcom/appsflyer/internal/AFi1jSDK;->$$a:[B

    aget-byte v13, v0, v32
    :try_end_19
    .catchall {:try_start_19 .. :try_end_19} :catchall_5

    int-to-byte v13, v13

    move/from16 v43, v6

    :try_start_1a
    sget v6, Lcom/appsflyer/internal/AFi1jSDK;->$$b:I
    :try_end_1a
    .catchall {:try_start_1a .. :try_end_1a} :catchall_4

    move/from16 v44, v9

    xor-int/lit16 v9, v6, 0x80

    move/from16 v45, v4

    and-int/lit16 v4, v6, 0x80

    or-int/2addr v4, v9

    int-to-short v4, v4

    :try_start_1b
    aget-byte v9, v0, v36

    neg-int v9, v9

    int-to-byte v9, v9

    invoke-static {v13, v4, v9}, Lcom/appsflyer/internal/AFi1jSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v4

    aget-byte v0, v0, v44

    int-to-byte v0, v0

    const/16 v9, 0x119

    int-to-short v9, v9

    int-to-byte v6, v6

    invoke-static {v0, v9, v6}, Lcom/appsflyer/internal/AFi1jSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    invoke-virtual {v0, v5, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0
    :try_end_1b
    .catchall {:try_start_1b .. :try_end_1b} :catchall_3

    if-eqz v0, :cond_14

    goto/16 :goto_18

    :catchall_3
    move-exception v0

    goto :goto_15

    :catchall_4
    move-exception v0

    move/from16 v45, v4

    :goto_14
    move/from16 v44, v9

    goto :goto_15

    :catchall_5
    move-exception v0

    move/from16 v45, v4

    move/from16 v43, v6

    goto :goto_14

    :goto_15
    :try_start_1c
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v4

    if-eqz v4, :cond_13

    throw v4

    :catchall_6
    move-exception v0

    move-object/from16 v50, v1

    move-object/from16 v48, v3

    :goto_16
    move-object/from16 v52, v7

    move-object/from16 v51, v8

    goto :goto_12

    :cond_13
    throw v0

    :cond_14
    :goto_17
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v4, Lcom/appsflyer/internal/AFi1jSDK;->$$a:[B

    aget-byte v6, v4, v41

    int-to-byte v6, v6

    const/16 v9, 0x120

    int-to-short v9, v9

    aget-byte v13, v4, v16

    int-to-byte v13, v13

    invoke-static {v6, v9, v13}, Lcom/appsflyer/internal/AFi1jSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    aget-byte v5, v4, v43

    int-to-byte v5, v5

    const/16 v6, 0x124

    or-int/lit16 v9, v5, 0x124

    int-to-short v6, v9

    aget-byte v9, v4, v40

    int-to-byte v9, v9

    invoke-static {v5, v6, v9}, Lcom/appsflyer/internal/AFi1jSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0
    :try_end_1c
    .catchall {:try_start_1c .. :try_end_1c} :catchall_6

    :try_start_1d
    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    aget-byte v5, v4, v34

    int-to-byte v5, v5

    const/16 v6, 0x124

    int-to-short v9, v6

    aget-byte v4, v4, v36

    neg-int v4, v4

    int-to-byte v4, v4

    invoke-static {v5, v9, v4}, Lcom/appsflyer/internal/AFi1jSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v4

    filled-new-array {v10}, [Ljava/lang/Class;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v4

    invoke-virtual {v4, v0}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Throwable;

    throw v0
    :try_end_1d
    .catchall {:try_start_1d .. :try_end_1d} :catchall_7

    :catchall_7
    move-exception v0

    :try_start_1e
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v4

    if-eqz v4, :cond_15

    throw v4

    :cond_15
    throw v0

    :cond_16
    move/from16 v45, v4

    move/from16 v43, v6

    move/from16 v44, v9

    :goto_18
    if-eqz v35, :cond_2b

    new-instance v0, Ljava/util/Random;

    invoke-direct {v0}, Ljava/util/Random;-><init>()V
    :try_end_1e
    .catchall {:try_start_1e .. :try_end_1e} :catchall_6

    :try_start_1f
    sget-object v4, Lcom/appsflyer/internal/AFi1jSDK;->$$a:[B

    const/16 v6, 0x47e

    aget-byte v6, v4, v6

    int-to-byte v6, v6

    sget v9, Lcom/appsflyer/internal/AFi1jSDK;->$$b:I

    xor-int/lit16 v13, v9, 0x98

    and-int/lit16 v2, v9, 0x98

    or-int/2addr v2, v13

    int-to-short v2, v2

    aget-byte v13, v4, v36

    neg-int v13, v13

    int-to-byte v13, v13

    invoke-static {v6, v2, v13}, Lcom/appsflyer/internal/AFi1jSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v2

    const/16 v6, 0xbf

    aget-byte v4, v4, v6

    int-to-byte v4, v4

    or-int/lit16 v6, v4, 0x126

    int-to-short v6, v6

    int-to-byte v9, v9

    invoke-static {v4, v6, v9}, Lcom/appsflyer/internal/AFi1jSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v4

    const/4 v6, 0x0

    invoke-virtual {v2, v4, v6}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v2

    invoke-virtual {v2, v6, v6}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Long;

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v47
    :try_end_1f
    .catchall {:try_start_1f .. :try_end_1f} :catchall_12

    const-wide/32 v49, -0x52c23660

    move-object v4, v1

    xor-long v1, v47, v49

    :try_start_20
    invoke-virtual {v0, v1, v2}, Ljava/util/Random;->setSeed(J)V

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v6, 0x0

    const/4 v9, 0x0

    :goto_19
    if-nez v1, :cond_29

    if-nez v2, :cond_17

    const/4 v13, 0x6

    move-object/from16 v47, v1

    goto :goto_1a

    :cond_17
    move-object/from16 v47, v1

    if-nez v6, :cond_18

    move/from16 v13, v44

    goto :goto_1a

    :cond_18
    if-nez v9, :cond_19

    move/from16 v13, v25

    goto :goto_1a

    :cond_19
    move/from16 v13, v31

    :goto_1a
    new-instance v1, Ljava/lang/StringBuilder;
    :try_end_20
    .catchall {:try_start_20 .. :try_end_20} :catchall_11

    move-object/from16 v49, v2

    move-object/from16 v48, v3

    :try_start_21
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    long-to-int v2, v2

    mul-int/lit16 v3, v13, -0x2f4

    const/16 v50, 0x2f6

    add-int v50, v50, v3

    not-int v3, v2

    xor-int/lit8 v51, v3, 0x1

    and-int/lit8 v3, v3, 0x1

    or-int v3, v51, v3

    mul-int/lit16 v3, v3, -0x2f5

    neg-int v3, v3

    neg-int v3, v3

    and-int v51, v50, v3

    or-int v3, v50, v3

    add-int v51, v51, v3

    not-int v3, v13

    xor-int/lit8 v50, v3, 0x1

    and-int/lit8 v3, v3, 0x1

    or-int v3, v50, v3

    xor-int v50, v3, v2

    and-int/2addr v3, v2

    or-int v3, v50, v3

    not-int v3, v3

    mul-int/lit16 v3, v3, 0x5ea

    or-int v50, v51, v3

    shl-int/lit8 v50, v50, 0x1

    xor-int v3, v51, v3

    sub-int v50, v50, v3

    not-int v3, v13

    const/16 v51, -0x2

    xor-int v52, v51, v3

    and-int v51, v51, v3

    move/from16 v53, v3

    or-int v3, v52, v51

    not-int v3, v3

    move/from16 v51, v3

    not-int v3, v2

    xor-int v52, v53, v3

    and-int v3, v53, v3

    or-int v3, v52, v3

    not-int v3, v3

    or-int v3, v51, v3

    xor-int/lit8 v51, v13, 0x1

    and-int/lit8 v52, v13, 0x1

    or-int v51, v51, v52

    xor-int v52, v51, v2

    and-int v2, v51, v2

    or-int v2, v52, v2

    not-int v2, v2

    or-int/2addr v2, v3

    mul-int/lit16 v2, v2, 0x2f5

    add-int v2, v50, v2

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    const/16 v2, 0x2e

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move/from16 v2, v28

    :goto_1b
    if-ge v2, v13, :cond_1d

    if-eqz v39, :cond_1c

    const/16 v3, 0x1a

    invoke-virtual {v0, v3}, Ljava/util/Random;->nextInt(I)I

    move-result v3

    invoke-virtual {v0}, Ljava/util/Random;->nextBoolean()Z

    move-result v50
    :try_end_21
    .catchall {:try_start_21 .. :try_end_21} :catchall_9

    if-nez v50, :cond_1a

    neg-int v3, v3

    neg-int v3, v3

    and-int/lit8 v50, v3, 0x60

    or-int/lit8 v3, v3, 0x60

    add-int v50, v50, v3

    move/from16 v52, v2

    move/from16 v2, v50

    move-object/from16 v50, v4

    goto :goto_1c

    .line 5
    :cond_1a
    sget v50, Lcom/appsflyer/internal/AFi1jSDK;->$11:I

    or-int/lit8 v51, v50, 0x21

    shl-int/lit8 v51, v51, 0x1

    xor-int/lit8 v50, v50, 0x21

    move/from16 v52, v2

    sub-int v2, v51, v50

    move-object/from16 v50, v4

    rem-int/lit16 v4, v2, 0x80

    sput v4, Lcom/appsflyer/internal/AFi1jSDK;->$10:I

    rem-int/lit8 v2, v2, 0x2

    if-eqz v2, :cond_1b

    const/16 v2, 0x46

    :try_start_22
    div-int/2addr v2, v3

    goto :goto_1c

    :catchall_8
    move-exception v0

    goto/16 :goto_16

    :cond_1b
    neg-int v2, v3

    neg-int v2, v2

    or-int/lit8 v3, v2, 0x41

    shl-int/lit8 v3, v3, 0x1

    xor-int/lit8 v2, v2, 0x41

    sub-int v2, v3, v2

    :goto_1c
    int-to-char v2, v2

    .line 6
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_1e

    :catchall_9
    move-exception v0

    :goto_1d
    move-object/from16 v50, v4

    goto/16 :goto_16

    :cond_1c
    move/from16 v52, v2

    move-object/from16 v50, v4

    const/16 v2, 0xc

    invoke-virtual {v0, v2}, Ljava/util/Random;->nextInt(I)I

    move-result v2

    neg-int v2, v2

    neg-int v2, v2

    xor-int/lit16 v3, v2, 0x2000

    and-int/lit16 v2, v2, 0x2000

    shl-int/lit8 v2, v2, 0x1

    add-int/2addr v3, v2

    int-to-char v2, v3

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :goto_1e
    and-int/lit8 v2, v52, 0x42

    or-int/lit8 v3, v52, 0x42

    add-int/2addr v2, v3

    xor-int/lit8 v3, v2, -0x41

    and-int/lit8 v2, v2, -0x41

    shl-int/lit8 v2, v2, 0x1

    add-int/2addr v2, v3

    move-object/from16 v4, v50

    goto :goto_1b

    :cond_1d
    move-object/from16 v50, v4

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1
    :try_end_22
    .catchall {:try_start_22 .. :try_end_22} :catchall_8

    if-nez v49, :cond_1f

    .line 7
    sget v2, Lcom/appsflyer/internal/AFi1jSDK;->$11:I

    add-int/lit8 v2, v2, 0x47

    rem-int/lit16 v2, v2, 0x80

    sput v2, Lcom/appsflyer/internal/AFi1jSDK;->$10:I

    move/from16 v2, v45

    .line 8
    :try_start_23
    new-array v3, v2, [Ljava/lang/Object;

    aput-object v1, v3, v32

    aput-object v5, v3, v28

    sget-object v1, Lcom/appsflyer/internal/AFi1jSDK;->$$a:[B

    aget-byte v2, v1, v32

    int-to-byte v2, v2

    sget v4, Lcom/appsflyer/internal/AFi1jSDK;->$$b:I

    xor-int/lit16 v13, v4, 0x80

    move-object/from16 v49, v1

    and-int/lit16 v1, v4, 0x80

    or-int/2addr v1, v13

    int-to-short v1, v1

    aget-byte v13, v49, v36

    neg-int v13, v13

    int-to-byte v13, v13

    invoke-static {v2, v1, v13}, Lcom/appsflyer/internal/AFi1jSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    aget-byte v2, v49, v32

    int-to-byte v2, v2

    xor-int/lit16 v13, v4, 0x80

    and-int/lit16 v4, v4, 0x80

    or-int/2addr v4, v13

    int-to-short v4, v4

    aget-byte v13, v49, v36

    neg-int v13, v13

    int-to-byte v13, v13

    invoke-static {v2, v4, v13}, Lcom/appsflyer/internal/AFi1jSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v2

    filled-new-array {v2, v10}, [Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1
    :try_end_23
    .catchall {:try_start_23 .. :try_end_23} :catchall_a

    .line 9
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-object v2, v1

    move-object/from16 v51, v5

    move-object/from16 v1, v47

    goto/16 :goto_20

    :catchall_a
    move-exception v0

    .line 10
    :try_start_24
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_1e

    throw v1

    :cond_1e
    throw v0
    :try_end_24
    .catchall {:try_start_24 .. :try_end_24} :catchall_8

    :cond_1f
    if-nez v6, :cond_21

    const/4 v2, 0x2

    :try_start_25
    new-array v3, v2, [Ljava/lang/Object;

    aput-object v1, v3, v32

    aput-object v5, v3, v28

    sget-object v1, Lcom/appsflyer/internal/AFi1jSDK;->$$a:[B

    aget-byte v2, v1, v32

    int-to-byte v2, v2

    sget v4, Lcom/appsflyer/internal/AFi1jSDK;->$$b:I

    xor-int/lit16 v6, v4, 0x80

    and-int/lit16 v13, v4, 0x80

    or-int/2addr v6, v13

    int-to-short v6, v6

    aget-byte v13, v1, v36

    neg-int v13, v13

    int-to-byte v13, v13

    invoke-static {v2, v6, v13}, Lcom/appsflyer/internal/AFi1jSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v2

    aget-byte v6, v1, v32

    int-to-byte v6, v6

    or-int/lit16 v4, v4, 0x80

    int-to-short v4, v4

    aget-byte v1, v1, v36

    neg-int v1, v1

    int-to-byte v1, v1

    invoke-static {v6, v4, v1}, Lcom/appsflyer/internal/AFi1jSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    filled-new-array {v1, v10}, [Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1
    :try_end_25
    .catchall {:try_start_25 .. :try_end_25} :catchall_b

    move-object v6, v1

    :goto_1f
    move-object/from16 v51, v5

    move-object/from16 v1, v47

    move-object/from16 v2, v49

    goto/16 :goto_20

    :catchall_b
    move-exception v0

    :try_start_26
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_20

    throw v1

    :cond_20
    throw v0
    :try_end_26
    .catchall {:try_start_26 .. :try_end_26} :catchall_8

    :cond_21
    if-nez v9, :cond_24

    .line 11
    sget v2, Lcom/appsflyer/internal/AFi1jSDK;->$11:I

    add-int/lit8 v2, v2, 0x29

    rem-int/lit16 v3, v2, 0x80

    sput v3, Lcom/appsflyer/internal/AFi1jSDK;->$10:I

    const/4 v3, 0x2

    rem-int/2addr v2, v3

    if-eqz v2, :cond_22

    const/16 v2, 0x35

    :try_start_27
    div-int/lit8 v2, v2, 0x0
    :try_end_27
    .catchall {:try_start_27 .. :try_end_27} :catchall_8

    .line 12
    :cond_22
    :try_start_28
    new-array v2, v3, [Ljava/lang/Object;

    aput-object v1, v2, v32

    aput-object v5, v2, v28

    sget-object v1, Lcom/appsflyer/internal/AFi1jSDK;->$$a:[B

    aget-byte v3, v1, v32

    int-to-byte v3, v3

    sget v4, Lcom/appsflyer/internal/AFi1jSDK;->$$b:I

    xor-int/lit16 v9, v4, 0x80

    and-int/lit16 v13, v4, 0x80

    or-int/2addr v9, v13

    int-to-short v9, v9

    aget-byte v13, v1, v36

    neg-int v13, v13

    int-to-byte v13, v13

    invoke-static {v3, v9, v13}, Lcom/appsflyer/internal/AFi1jSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v3

    aget-byte v9, v1, v32

    int-to-byte v9, v9

    xor-int/lit16 v13, v4, 0x80

    and-int/lit16 v4, v4, 0x80

    or-int/2addr v4, v13

    int-to-short v4, v4

    aget-byte v1, v1, v36

    neg-int v1, v1

    int-to-byte v1, v1

    invoke-static {v9, v4, v1}, Lcom/appsflyer/internal/AFi1jSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    filled-new-array {v1, v10}, [Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v1

    invoke-virtual {v1, v2}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1
    :try_end_28
    .catchall {:try_start_28 .. :try_end_28} :catchall_c

    move-object v9, v1

    goto :goto_1f

    :catchall_c
    move-exception v0

    :try_start_29
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_23

    throw v1

    :cond_23
    throw v0
    :try_end_29
    .catchall {:try_start_29 .. :try_end_29} :catchall_8

    :cond_24
    const/4 v2, 0x2

    :try_start_2a
    new-array v3, v2, [Ljava/lang/Object;

    aput-object v1, v3, v32

    aput-object v5, v3, v28

    sget-object v1, Lcom/appsflyer/internal/AFi1jSDK;->$$a:[B

    aget-byte v2, v1, v32

    int-to-byte v2, v2

    sget v4, Lcom/appsflyer/internal/AFi1jSDK;->$$b:I

    xor-int/lit16 v13, v4, 0x80

    move-object/from16 v47, v1

    and-int/lit16 v1, v4, 0x80

    or-int/2addr v1, v13

    int-to-short v1, v1

    aget-byte v13, v47, v36

    neg-int v13, v13

    int-to-byte v13, v13

    invoke-static {v2, v1, v13}, Lcom/appsflyer/internal/AFi1jSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    aget-byte v2, v47, v32

    int-to-byte v2, v2

    xor-int/lit16 v13, v4, 0x80

    move-object/from16 v51, v5

    and-int/lit16 v5, v4, 0x80

    or-int/2addr v5, v13

    int-to-short v5, v5

    aget-byte v13, v47, v36

    neg-int v13, v13

    int-to-byte v13, v13

    invoke-static {v2, v5, v13}, Lcom/appsflyer/internal/AFi1jSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v2

    filled-new-array {v2, v10}, [Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1
    :try_end_2a
    .catchall {:try_start_2a .. :try_end_2a} :catchall_10

    .line 13
    sget v2, Lcom/appsflyer/internal/AFi1jSDK;->$10:I

    xor-int/lit8 v3, v2, 0x49

    and-int/lit8 v2, v2, 0x49

    shl-int/lit8 v2, v2, 0x1

    add-int/2addr v3, v2

    rem-int/lit16 v3, v3, 0x80

    sput v3, Lcom/appsflyer/internal/AFi1jSDK;->$11:I

    .line 14
    :try_start_2b
    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v2

    aget-byte v3, v47, v26

    neg-int v3, v3

    int-to-byte v3, v3

    or-int/lit16 v5, v4, 0x104

    int-to-short v5, v5

    aget-byte v13, v47, v36

    neg-int v13, v13

    int-to-byte v13, v13

    invoke-static {v3, v5, v13}, Lcom/appsflyer/internal/AFi1jSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v3

    aget-byte v5, v47, v32

    int-to-byte v5, v5

    xor-int/lit16 v13, v4, 0x80

    move-object/from16 v52, v6

    and-int/lit16 v6, v4, 0x80

    or-int/2addr v6, v13

    int-to-short v6, v6

    aget-byte v13, v47, v36

    neg-int v13, v13

    int-to-byte v13, v13

    invoke-static {v5, v6, v13}, Lcom/appsflyer/internal/AFi1jSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v5

    filled-new-array {v5}, [Ljava/lang/Class;

    move-result-object v5

    invoke-virtual {v3, v5}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v3

    invoke-virtual {v3, v2}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2
    :try_end_2b
    .catchall {:try_start_2b .. :try_end_2b} :catchall_e

    :try_start_2c
    aget-byte v3, v47, v26

    neg-int v3, v3

    int-to-byte v3, v3

    xor-int/lit16 v5, v4, 0x104

    and-int/lit16 v6, v4, 0x104

    or-int/2addr v5, v6

    int-to-short v5, v5

    aget-byte v6, v47, v36

    neg-int v6, v6

    int-to-byte v6, v6

    invoke-static {v3, v5, v6}, Lcom/appsflyer/internal/AFi1jSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v3

    aget-byte v5, v47, v41

    int-to-byte v5, v5

    xor-int/lit16 v6, v5, 0x159

    and-int/lit16 v13, v5, 0x159

    or-int/2addr v6, v13

    int-to-short v6, v6

    int-to-byte v4, v4

    invoke-static {v5, v6, v4}, Lcom/appsflyer/internal/AFi1jSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v4

    const/4 v6, 0x0

    invoke-virtual {v3, v4, v6}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v3

    invoke-virtual {v3, v2, v6}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_2c
    .catchall {:try_start_2c .. :try_end_2c} :catchall_d

    move-object/from16 v2, v49

    move-object/from16 v6, v52

    :goto_20
    move-object/from16 v3, v48

    move-object/from16 v4, v50

    move-object/from16 v5, v51

    const/16 v45, 0x2

    goto/16 :goto_19

    :catchall_d
    move-exception v0

    :try_start_2d
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v2

    if-eqz v2, :cond_25

    throw v2

    :catch_8
    move-exception v0

    goto :goto_21

    :cond_25
    throw v0

    :catchall_e
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v2

    if-eqz v2, :cond_26

    throw v2

    :cond_26
    throw v0
    :try_end_2d
    .catch Ljava/lang/Exception; {:try_start_2d .. :try_end_2d} :catch_8
    .catchall {:try_start_2d .. :try_end_2d} :catchall_8

    :goto_21
    :try_start_2e
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v3, Lcom/appsflyer/internal/AFi1jSDK;->$$a:[B

    aget-byte v4, v3, v41

    int-to-byte v4, v4

    const/16 v5, 0x161

    int-to-short v5, v5

    aget-byte v6, v3, v16

    int-to-byte v6, v6

    invoke-static {v4, v5, v6}, Lcom/appsflyer/internal/AFi1jSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    aget-byte v1, v3, v43

    int-to-byte v1, v1

    const/16 v6, 0x124

    or-int/lit16 v4, v1, 0x124

    int-to-short v4, v4

    aget-byte v5, v3, v40

    int-to-byte v5, v5

    invoke-static {v1, v4, v5}, Lcom/appsflyer/internal/AFi1jSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1
    :try_end_2e
    .catchall {:try_start_2e .. :try_end_2e} :catchall_8

    const/4 v2, 0x2

    :try_start_2f
    new-array v4, v2, [Ljava/lang/Object;

    aput-object v0, v4, v32

    aput-object v1, v4, v28

    aget-byte v0, v3, v34

    int-to-byte v0, v0

    const/16 v6, 0x124

    int-to-short v1, v6

    aget-byte v2, v3, v36

    neg-int v2, v2

    int-to-byte v2, v2

    invoke-static {v0, v1, v2}, Lcom/appsflyer/internal/AFi1jSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    const-class v1, Ljava/lang/Throwable;

    filled-new-array {v10, v1}, [Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Throwable;

    throw v0
    :try_end_2f
    .catchall {:try_start_2f .. :try_end_2f} :catchall_f

    :catchall_f
    move-exception v0

    :try_start_30
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_27

    throw v1

    :cond_27
    throw v0

    :catchall_10
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_28

    throw v1

    :cond_28
    throw v0

    :catchall_11
    move-exception v0

    move-object/from16 v48, v3

    goto/16 :goto_1d

    :cond_29
    move-object/from16 v47, v1

    move-object/from16 v49, v2

    move-object/from16 v50, v4

    move-object/from16 v52, v6

    :goto_22
    move-object/from16 v48, v3

    goto :goto_23

    :catchall_12
    move-exception v0

    move-object/from16 v50, v1

    move-object/from16 v48, v3

    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_2a

    throw v1

    :cond_2a
    throw v0
    :try_end_30
    .catchall {:try_start_30 .. :try_end_30} :catchall_8

    :cond_2b
    move-object/from16 v50, v1

    const/4 v6, 0x0

    const/4 v9, 0x0

    const/16 v47, 0x0

    const/16 v49, 0x0

    goto :goto_22

    :goto_23
    :try_start_31
    sget-object v0, Lcom/appsflyer/internal/AFi1jSDK;->$$a:[B

    const/16 v1, 0x66

    aget-byte v1, v0, v1

    int-to-byte v1, v1

    const/16 v2, 0x165

    int-to-short v2, v2

    aget-byte v3, v0, v33

    int-to-byte v3, v3

    invoke-static {v1, v2, v3}, Lcom/appsflyer/internal/AFi1jSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v1

    const-class v2, Lcom/appsflyer/internal/AFi1jSDK;
    :try_end_31
    .catchall {:try_start_31 .. :try_end_31} :catchall_58

    :try_start_32
    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v3

    const-class v4, Ljava/lang/Class;

    aget-byte v5, v0, v37

    int-to-byte v5, v5

    const/16 v13, 0x195

    int-to-short v13, v13

    move-object/from16 v39, v6

    sget v6, Lcom/appsflyer/internal/AFi1jSDK;->$$b:I
    :try_end_32
    .catchall {:try_start_32 .. :try_end_32} :catchall_57

    move-object/from16 v52, v7

    move-object/from16 v51, v8

    :try_start_33
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v7

    long-to-int v7, v7

    mul-int/lit8 v8, v6, -0x70

    neg-int v8, v8

    neg-int v8, v8

    not-int v8, v8

    rsub-int v8, v8, -0x1c1

    move/from16 v53, v8

    not-int v8, v6

    move/from16 v54, v8

    not-int v8, v7

    move/from16 v55, v7

    or-int v7, v54, v8

    not-int v7, v7

    xor-int/lit8 v56, v7, 0x4

    and-int/lit8 v7, v7, 0x4

    or-int v7, v56, v7

    mul-int/lit16 v7, v7, 0xe2

    xor-int v56, v53, v7

    and-int v7, v53, v7

    shl-int/lit8 v7, v7, 0x1

    add-int v56, v56, v7

    xor-int v7, v17, v6

    and-int v53, v17, v6

    or-int v7, v7, v53

    not-int v7, v7

    xor-int v53, v17, v55

    and-int v57, v17, v55

    move/from16 v58, v7

    or-int v7, v53, v57

    not-int v7, v7

    xor-int v53, v58, v7

    and-int v7, v58, v7

    or-int v7, v53, v7

    xor-int v53, v54, v8

    and-int v8, v54, v8

    or-int v8, v53, v8

    xor-int/lit8 v53, v8, 0x4

    and-int/lit8 v8, v8, 0x4

    or-int v8, v53, v8

    not-int v8, v8

    or-int/2addr v7, v8

    mul-int/lit8 v7, v7, -0x71

    neg-int v7, v7

    neg-int v7, v7

    xor-int v8, v56, v7

    and-int v7, v56, v7

    shl-int/lit8 v7, v7, 0x1

    add-int/2addr v8, v7

    not-int v7, v6

    xor-int v53, v7, v55

    and-int v7, v7, v55

    or-int v7, v53, v7

    not-int v7, v7

    mul-int/lit8 v7, v7, 0x71

    neg-int v7, v7

    neg-int v7, v7

    xor-int v53, v8, v7

    and-int/2addr v7, v8

    shl-int/lit8 v7, v7, 0x1

    add-int v7, v53, v7

    int-to-byte v7, v7

    invoke-static {v5, v13, v7}, Lcom/appsflyer/internal/AFi1jSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v5

    filled-new-array {v10}, [Ljava/lang/Class;

    move-result-object v7

    invoke-virtual {v4, v5, v7}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v4

    invoke-virtual {v4, v2, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2
    :try_end_33
    .catchall {:try_start_33 .. :try_end_33} :catchall_56

    :try_start_34
    aget-byte v3, v0, v32

    int-to-byte v3, v3

    or-int/lit16 v4, v3, 0x194

    int-to-short v4, v4

    aget-byte v5, v0, v36

    neg-int v5, v5

    int-to-byte v5, v5

    invoke-static {v3, v4, v5}, Lcom/appsflyer/internal/AFi1jSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v3

    const/16 v4, 0xc6

    aget-byte v4, v0, v4

    int-to-byte v4, v4

    const/16 v5, 0x1aa

    int-to-short v7, v5

    move-object v5, v9

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v8

    long-to-int v8, v8

    mul-int/lit16 v9, v6, 0x172

    const/16 v13, 0x5c8

    add-int/2addr v13, v9

    xor-int/lit8 v9, v6, 0x4

    and-int/lit8 v53, v6, 0x4

    or-int v9, v9, v53

    move-object/from16 v53, v5

    not-int v5, v8

    xor-int v54, v9, v5

    and-int/2addr v5, v9

    or-int v5, v54, v5

    mul-int/lit16 v5, v5, -0x171

    neg-int v5, v5

    neg-int v5, v5

    or-int v9, v13, v5

    shl-int/lit8 v9, v9, 0x1

    xor-int/2addr v5, v13

    sub-int/2addr v9, v5

    not-int v5, v8

    xor-int v13, v17, v5

    and-int v54, v17, v5

    or-int v13, v13, v54

    not-int v13, v13

    or-int/2addr v13, v6

    mul-int/lit16 v13, v13, -0x171

    add-int/2addr v9, v13

    not-int v13, v6

    or-int/lit8 v13, v13, 0x4

    not-int v13, v13

    or-int/lit8 v8, v8, 0x4

    not-int v8, v8

    xor-int v54, v13, v8

    and-int/2addr v8, v13

    or-int v8, v54, v8

    xor-int v13, v17, v5

    and-int v5, v17, v5

    or-int/2addr v5, v13

    xor-int v13, v5, v6

    and-int/2addr v5, v6

    or-int/2addr v5, v13

    not-int v5, v5

    or-int/2addr v5, v8

    mul-int/lit16 v5, v5, 0x171

    neg-int v5, v5

    neg-int v5, v5

    xor-int v8, v9, v5

    and-int/2addr v5, v9

    shl-int/lit8 v5, v5, 0x1

    add-int/2addr v8, v5

    int-to-byte v5, v8

    invoke-static {v4, v7, v5}, Lcom/appsflyer/internal/AFi1jSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    invoke-virtual {v3, v4, v5}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v3

    invoke-virtual {v3, v2, v5}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;
    :try_end_34
    .catchall {:try_start_34 .. :try_end_34} :catchall_55

    :try_start_35
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    aget-byte v4, v0, v43

    int-to-byte v5, v4

    const/16 v7, 0x1b0

    xor-int/lit16 v8, v5, 0x1b0

    and-int/lit16 v9, v5, 0x1b0

    or-int v7, v8, v9

    int-to-short v7, v7

    int-to-byte v4, v4

    invoke-static {v5, v7, v4}, Lcom/appsflyer/internal/AFi1jSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v3
    :try_end_35
    .catchall {:try_start_35 .. :try_end_35} :catchall_54

    move/from16 v4, v44

    :try_start_36
    invoke-virtual {v2, v4, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2
    :try_end_36
    .catchall {:try_start_36 .. :try_end_36} :catchall_53

    :try_start_37
    new-instance v3, Ljava/util/zip/ZipFile;

    invoke-direct {v3, v2}, Ljava/util/zip/ZipFile;-><init>(Ljava/lang/String;)V
    :try_end_37
    .catchall {:try_start_37 .. :try_end_37} :catchall_52

    const/16 v2, 0x1be6    # 1.0008E-41f

    :try_start_38
    new-array v2, v2, [B

    move/from16 v4, v32

    invoke-virtual {v1, v4}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/util/zip/ZipFile;->getEntry(Ljava/lang/String;)Ljava/util/zip/ZipEntry;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/util/zip/ZipFile;->getInputStream(Ljava/util/zip/ZipEntry;)Ljava/io/InputStream;

    move-result-object v1
    :try_end_38
    .catchall {:try_start_38 .. :try_end_38} :catchall_4c

    :try_start_39
    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    const/16 v4, 0x26e

    aget-byte v4, v0, v4

    neg-int v4, v4

    int-to-byte v4, v4

    const/16 v7, 0x1b0

    int-to-short v5, v7

    aget-byte v7, v0, v36

    neg-int v7, v7

    int-to-byte v7, v7

    invoke-static {v4, v5, v7}, Lcom/appsflyer/internal/AFi1jSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v4

    aget-byte v5, v0, v34

    int-to-byte v5, v5

    or-int/lit16 v7, v6, 0x188

    int-to-short v7, v7

    aget-byte v8, v0, v36

    neg-int v8, v8

    int-to-byte v8, v8

    invoke-static {v5, v7, v8}, Lcom/appsflyer/internal/AFi1jSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v5

    filled-new-array {v5}, [Ljava/lang/Class;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v4

    invoke-virtual {v4, v1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1
    :try_end_39
    .catchall {:try_start_39 .. :try_end_39} :catchall_50

    :try_start_3a
    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    aget-byte v4, v0, v38

    int-to-byte v4, v4

    const/16 v5, 0x1dc

    int-to-short v5, v5

    aget-byte v7, v0, v36

    neg-int v7, v7

    int-to-byte v7, v7

    invoke-static {v4, v5, v7}, Lcom/appsflyer/internal/AFi1jSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v4

    aget-byte v7, v0, v34

    int-to-byte v7, v7

    xor-int/lit16 v8, v6, 0x188

    and-int/lit16 v9, v6, 0x188

    or-int/2addr v8, v9

    int-to-short v8, v8

    aget-byte v9, v0, v36

    neg-int v9, v9

    int-to-byte v9, v9

    invoke-static {v7, v8, v9}, Lcom/appsflyer/internal/AFi1jSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v7

    filled-new-array {v7}, [Ljava/lang/Class;

    move-result-object v7

    invoke-virtual {v4, v7}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v4

    invoke-virtual {v4, v1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1
    :try_end_3a
    .catchall {:try_start_3a .. :try_end_3a} :catchall_4f

    :try_start_3b
    filled-new-array {v2}, [Ljava/lang/Object;

    move-result-object v4

    aget-byte v7, v0, v38

    int-to-byte v7, v7

    aget-byte v8, v0, v36

    neg-int v8, v8

    int-to-byte v8, v8

    invoke-static {v7, v5, v8}, Lcom/appsflyer/internal/AFi1jSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v7

    aget-byte v8, v0, v40

    int-to-byte v8, v8

    const/16 v9, 0x1b0

    or-int/lit16 v13, v6, 0x1b0

    int-to-short v9, v13

    const/16 v13, 0x475

    aget-byte v13, v0, v13

    add-int/lit8 v13, v13, 0x1

    int-to-byte v13, v13

    invoke-static {v8, v9, v13}, Lcom/appsflyer/internal/AFi1jSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v8

    filled-new-array/range {v27 .. v27}, [Ljava/lang/Class;

    move-result-object v9

    invoke-virtual {v7, v8, v9}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v7

    invoke-virtual {v7, v1, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_3b
    .catchall {:try_start_3b .. :try_end_3b} :catchall_4e

    :try_start_3c
    aget-byte v4, v0, v38

    int-to-byte v4, v4

    aget-byte v7, v0, v36

    neg-int v7, v7

    int-to-byte v7, v7

    invoke-static {v4, v5, v7}, Lcom/appsflyer/internal/AFi1jSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v4

    aget-byte v0, v0, v41

    int-to-byte v0, v0

    xor-int/lit16 v5, v0, 0x159

    and-int/lit16 v7, v0, 0x159

    or-int/2addr v5, v7

    int-to-short v5, v5

    int-to-byte v6, v6

    invoke-static {v0, v5, v6}, Lcom/appsflyer/internal/AFi1jSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v0

    const/4 v6, 0x0

    invoke-virtual {v4, v0, v6}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    invoke-virtual {v0, v1, v6}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_3c
    .catchall {:try_start_3c .. :try_end_3c} :catchall_4d

    const/16 v0, 0x16

    const/16 v1, 0x1bae

    move v4, v1

    move v1, v0

    move v0, v4

    move-object/from16 v4, v50

    const/4 v6, 0x0

    :goto_24
    const/4 v5, 0x1

    int-to-long v7, v5

    .line 15
    :try_start_3d
    array-length v5, v2
    :try_end_3d
    .catchall {:try_start_3d .. :try_end_3d} :catchall_4c

    move/from16 v9, v28

    :goto_25
    if-ge v9, v5, :cond_2c

    :try_start_3e
    aget-byte v13, v2, v9
    :try_end_3e
    .catchall {:try_start_3e .. :try_end_3e} :catchall_13

    move-wide/from16 v54, v7

    int-to-long v7, v13

    const/4 v13, 0x6

    shl-long v56, v54, v13

    add-long v7, v7, v56

    shl-long v56, v54, v30

    add-long v7, v7, v56

    sub-long v7, v7, v54

    add-int/lit8 v9, v9, 0x1

    goto :goto_25

    :catchall_13
    move-exception v0

    move-object v1, v0

    move-object v8, v3

    move-object v7, v10

    move-object/from16 v60, v11

    move/from16 v61, v12

    move/from16 v54, v14

    move/from16 v55, v15

    move-object/from16 v59, v27

    const/16 v19, 0x1aa

    :goto_26
    const/16 v44, 0x5

    goto/16 :goto_4f

    :cond_2c
    move-wide/from16 v54, v7

    .line 16
    :try_start_3f
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v7

    long-to-int v5, v7

    mul-int/lit16 v7, v1, -0x12d

    neg-int v7, v7

    neg-int v7, v7

    const v8, 0x24654

    and-int v9, v8, v7

    or-int/2addr v7, v8

    add-int/2addr v9, v7

    not-int v7, v5

    const/16 v8, -0x1ed

    xor-int v13, v8, v7

    and-int/2addr v7, v8

    or-int/2addr v7, v13

    or-int/2addr v7, v1

    not-int v7, v7

    xor-int/lit16 v8, v1, 0x1ec

    and-int/lit16 v13, v1, 0x1ec

    or-int/2addr v8, v13

    xor-int v13, v8, v5

    and-int/2addr v8, v5

    or-int/2addr v8, v13

    not-int v8, v8

    or-int/2addr v7, v8

    mul-int/lit16 v7, v7, -0x12e

    not-int v7, v7

    sub-int/2addr v9, v7

    const/16 v32, 0x1

    add-int/lit8 v9, v9, -0x1

    const/16 v7, -0x1ed

    xor-int v8, v7, v1

    and-int/2addr v7, v1

    or-int/2addr v7, v8

    xor-int v8, v7, v5

    and-int/2addr v7, v5

    or-int/2addr v7, v8

    not-int v7, v7

    mul-int/lit16 v7, v7, -0x25c

    add-int/2addr v9, v7

    not-int v7, v1

    xor-int/lit16 v8, v7, 0x1ec

    and-int/lit16 v13, v7, 0x1ec

    or-int/2addr v8, v13

    not-int v8, v8

    or-int/2addr v5, v1

    not-int v5, v5

    xor-int v13, v8, v5

    and-int/2addr v5, v8

    or-int/2addr v5, v13

    mul-int/lit16 v5, v5, 0x12e

    not-int v5, v5

    sub-int/2addr v9, v5

    const/16 v32, 0x1

    add-int/lit8 v9, v9, -0x1

    move v5, v7

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v7

    long-to-int v7, v7

    mul-int/lit8 v8, v1, 0x55

    const v13, 0x40b9b

    add-int/2addr v13, v8

    const/16 v8, -0xc30

    or-int/2addr v5, v8

    not-int v5, v5

    const/16 v56, -0xc30

    not-int v8, v7

    or-int v8, v56, v8

    not-int v8, v8

    xor-int v56, v5, v8

    and-int/2addr v5, v8

    or-int v5, v56, v5

    not-int v8, v1

    move/from16 v56, v5

    not-int v5, v7

    xor-int v57, v8, v5

    and-int v58, v8, v5

    move/from16 v59, v5

    or-int v5, v57, v58

    not-int v5, v5

    xor-int v57, v56, v5

    and-int v5, v56, v5

    or-int v5, v57, v5

    move/from16 v56, v5

    xor-int/lit16 v5, v1, 0xc2f

    move/from16 v57, v5

    and-int/lit16 v5, v1, 0xc2f

    or-int v5, v57, v5

    xor-int v57, v5, v7

    and-int/2addr v5, v7

    or-int v5, v57, v5

    not-int v5, v5

    xor-int v57, v56, v5

    and-int v5, v56, v5

    or-int v5, v57, v5

    mul-int/lit8 v5, v5, -0x54

    xor-int v56, v13, v5

    and-int/2addr v5, v13

    const/16 v32, 0x1

    shl-int/lit8 v5, v5, 0x1

    add-int v56, v56, v5

    xor-int v5, v8, v7

    and-int/2addr v7, v8

    or-int/2addr v5, v7

    not-int v5, v5

    xor-int/lit16 v7, v5, 0xc2f

    and-int/lit16 v5, v5, 0xc2f

    or-int/2addr v5, v7

    xor-int v7, v59, v1

    and-int v8, v59, v1

    or-int/2addr v7, v8

    not-int v8, v7

    xor-int v13, v5, v8

    and-int/2addr v5, v8

    or-int/2addr v5, v13

    mul-int/lit8 v5, v5, -0x54

    and-int v8, v56, v5

    or-int v5, v56, v5

    add-int/2addr v8, v5

    not-int v5, v7

    or-int/lit16 v7, v1, 0xc2f

    not-int v7, v7

    or-int/2addr v5, v7

    mul-int/lit8 v5, v5, 0x54

    not-int v5, v5

    sub-int/2addr v8, v5

    const/16 v32, 0x1

    add-int/lit8 v8, v8, -0x1

    aget-byte v5, v2, v8

    or-int/lit8 v7, v5, -0x5a

    shl-int/lit8 v7, v7, 0x1

    xor-int/lit8 v5, v5, -0x5a

    sub-int/2addr v7, v5

    int-to-byte v5, v7

    aput-byte v5, v2, v9

    array-length v5, v2

    neg-int v7, v1

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v8
    :try_end_3f
    .catchall {:try_start_3f .. :try_end_3f} :catchall_4c

    long-to-int v8, v8

    mul-int/lit16 v9, v7, 0x3c0

    mul-int/lit16 v13, v5, -0x77d

    neg-int v13, v13

    neg-int v13, v13

    not-int v13, v13

    sub-int/2addr v9, v13

    const/16 v32, 0x1

    add-int/lit8 v9, v9, -0x1

    not-int v5, v5

    not-int v13, v8

    xor-int v56, v5, v13

    and-int/2addr v13, v5

    or-int v13, v56, v13

    not-int v13, v13

    move/from16 v56, v1

    or-int v1, v7, v8

    not-int v1, v1

    xor-int v57, v13, v1

    and-int/2addr v1, v13

    or-int v1, v57, v1

    mul-int/lit16 v1, v1, 0x3bf

    add-int/2addr v9, v1

    mul-int/lit16 v1, v5, -0x3bf

    neg-int v1, v1

    neg-int v1, v1

    and-int v13, v9, v1

    or-int/2addr v1, v9

    add-int/2addr v13, v1

    xor-int v1, v5, v8

    and-int/2addr v5, v8

    or-int/2addr v1, v5

    not-int v1, v1

    not-int v5, v8

    or-int/2addr v5, v7

    not-int v5, v5

    xor-int v7, v1, v5

    and-int/2addr v1, v5

    or-int/2addr v1, v7

    mul-int/lit16 v1, v1, 0x3bf

    add-int/2addr v13, v1

    move/from16 v1, v31

    :try_start_40
    new-array v5, v1, [Ljava/lang/Object;
    :try_end_40
    .catchall {:try_start_40 .. :try_end_40} :catchall_4b

    :try_start_41
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/16 v45, 0x2

    aput-object v1, v5, v45

    invoke-static/range {v56 .. v56}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/16 v32, 0x1

    aput-object v1, v5, v32

    aput-object v2, v5, v28

    sget-object v1, Lcom/appsflyer/internal/AFi1jSDK;->$$a:[B

    const/16 v2, 0x1f9

    aget-byte v2, v1, v2

    int-to-byte v2, v2

    sget v7, Lcom/appsflyer/internal/AFi1jSDK;->$$b:I

    xor-int/lit16 v8, v7, 0x1b8

    and-int/lit16 v9, v7, 0x1b8

    or-int/2addr v8, v9

    int-to-short v8, v8

    aget-byte v9, v1, v36

    neg-int v9, v9

    int-to-byte v9, v9

    invoke-static {v2, v8, v9}, Lcom/appsflyer/internal/AFi1jSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v2

    sget-object v8, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;
    :try_end_41
    .catchall {:try_start_41 .. :try_end_41} :catchall_4a

    move-object/from16 v9, v27

    :try_start_42
    filled-new-array {v9, v8, v8}, [Ljava/lang/Class;

    move-result-object v13

    invoke-virtual {v2, v13}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2
    :try_end_42
    .catchall {:try_start_42 .. :try_end_42} :catchall_49

    :try_start_43
    sget-object v5, Lcom/appsflyer/internal/AFi1jSDK;->e:Ljava/lang/Object;
    :try_end_43
    .catchall {:try_start_43 .. :try_end_43} :catchall_48

    if-nez v5, :cond_2f

    :try_start_44
    sput-wide v54, Lcom/appsflyer/internal/AFi1jSDK;->afInfoLog:J

    invoke-static {}, Landroid/view/ViewConfiguration;->getGlobalActionKeyTimeout()J

    move-result-wide v57

    const/16 v5, 0x20

    shr-long v57, v57, v5

    const-wide v59, 0x763eb63464452112L    # 3.777640560570502E261

    sub-long v59, v59, v57

    move-object/from16 v27, v1

    move-object v13, v2

    xor-long v1, v54, v59

    long-to-int v1, v1

    sget-wide v54, Lcom/appsflyer/internal/AFi1jSDK;->afInfoLog:J

    invoke-static {}, Landroid/os/SystemClock;->currentThreadTimeMillis()J

    move-result-wide v57

    const/16 v2, 0x30

    shr-long v57, v57, v2

    const-wide v59, 0x763eb6347aa4a662L    # 3.7776407246004187E261

    add-long v57, v57, v59

    move v5, v1

    xor-long v1, v54, v57

    long-to-int v1, v1

    int-to-byte v1, v1

    move/from16 v54, v1

    move/from16 v2, v30

    new-array v1, v2, [B

    fill-array-data v1, :array_2

    move-object/from16 v55, v1

    new-array v1, v2, [B

    const/4 v2, 0x0

    move/from16 v57, v5

    const/4 v5, 0x0

    invoke-static {v2, v5}, Landroid/graphics/PointF;->length(FF)F

    move-result v2

    const/4 v5, 0x0

    cmpl-float v2, v2, v5

    sget-wide v58, Lcom/appsflyer/internal/AFi1jSDK;->afInfoLog:J

    invoke-static {}, Landroid/os/SystemClock;->currentThreadTimeMillis()J

    move-result-wide v60
    :try_end_44
    .catchall {:try_start_44 .. :try_end_44} :catchall_17

    const/16 v5, 0x30

    shr-long v60, v60, v5

    const-wide v62, 0x763eb6347aa4a66aL    # 3.777640724600422E261

    sub-long v62, v62, v60

    move-object/from16 v60, v11

    move/from16 v61, v12

    xor-long v11, v58, v62

    long-to-int v5, v11

    .line 17
    sget v11, Lcom/appsflyer/internal/AFi1jSDK;->$11:I

    or-int/lit8 v12, v11, 0xd

    const/16 v32, 0x1

    shl-int/lit8 v12, v12, 0x1

    xor-int/lit8 v11, v11, 0xd

    sub-int/2addr v12, v11

    rem-int/lit16 v12, v12, 0x80

    sput v12, Lcom/appsflyer/internal/AFi1jSDK;->$10:I

    const/4 v11, 0x5

    .line 18
    :try_start_45
    new-array v12, v11, [Ljava/lang/Object;

    const/16 v30, 0x10

    invoke-static/range {v30 .. v30}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    aput-object v11, v12, v25

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    const/16 v31, 0x3

    aput-object v5, v12, v31

    const/16 v45, 0x2

    aput-object v1, v12, v45

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/16 v32, 0x1

    aput-object v2, v12, v32

    aput-object v55, v12, v28

    const/16 v2, 0x47e

    aget-byte v2, v27, v2

    int-to-byte v2, v2

    xor-int/lit16 v5, v7, 0x98

    and-int/lit16 v11, v7, 0x98

    or-int/2addr v5, v11

    int-to-short v5, v5

    aget-byte v11, v27, v36

    neg-int v11, v11

    int-to-byte v11, v11

    invoke-static {v2, v5, v11}, Lcom/appsflyer/internal/AFi1jSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v2

    aget-byte v5, v27, v40

    int-to-byte v5, v5

    const/16 v11, 0x215

    int-to-short v11, v11

    move-object/from16 v58, v13

    aget-byte v13, v27, v20

    int-to-byte v13, v13

    invoke-static {v5, v11, v13}, Lcom/appsflyer/internal/AFi1jSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v5

    const-class v11, Ljava/lang/Object;

    const-class v13, Ljava/lang/Object;

    filled-new-array {v11, v8, v13, v8, v8}, [Ljava/lang/Class;

    move-result-object v11

    invoke-virtual {v2, v5, v11}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v2

    const/4 v5, 0x0

    invoke-virtual {v2, v5, v12}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_45
    .catchall {:try_start_45 .. :try_end_45} :catchall_16

    :try_start_46
    sget-byte v2, Lcom/appsflyer/internal/AFi1jSDK;->afErrorLogForExcManagerOnly:B

    sget-wide v11, Lcom/appsflyer/internal/AFi1jSDK;->afDebugLog:J

    invoke-static {v1, v2, v11, v12}, Lcom/appsflyer/internal/AFk1oSDK;->AFAdRevenueData([BBJ)V

    invoke-static/range {v57 .. v57}, Lcom/appsflyer/internal/AFk1vSDK;->getMonetizationNetwork(I)[[B

    move-result-object v2
    :try_end_46
    .catchall {:try_start_46 .. :try_end_46} :catchall_15

    move/from16 v5, v25

    :try_start_47
    new-array v11, v5, [Ljava/lang/Object;

    const/16 v31, 0x3

    aput-object v2, v11, v31

    const/16 v45, 0x2

    aput-object v1, v11, v45

    invoke-static/range {v54 .. v54}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/16 v32, 0x1

    aput-object v1, v11, v32

    aput-object v58, v11, v28

    const/16 v1, 0xaf

    aget-byte v1, v27, v1

    int-to-byte v1, v1

    const/16 v2, 0x21d

    int-to-short v2, v2

    int-to-byte v5, v7

    invoke-static {v1, v2, v5}, Lcom/appsflyer/internal/AFi1jSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    aget-byte v2, v27, v34

    int-to-byte v2, v2

    xor-int/lit16 v5, v7, 0x188

    and-int/lit16 v12, v7, 0x188

    or-int/2addr v5, v12

    int-to-short v5, v5

    aget-byte v12, v27, v36

    neg-int v12, v12

    int-to-byte v12, v12

    invoke-static {v2, v5, v12}, Lcom/appsflyer/internal/AFi1jSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v2

    const-class v5, [[B

    filled-new-array {v2, v8, v9, v5}, [Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v1

    invoke-virtual {v1, v11}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1
    :try_end_47
    .catchall {:try_start_47 .. :try_end_47} :catchall_14

    move/from16 v54, v14

    const/16 v31, 0x3

    goto/16 :goto_28

    :catchall_14
    move-exception v0

    :try_start_48
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_2d

    throw v1

    :catchall_15
    move-exception v0

    :goto_27
    move-object v1, v0

    move-object v8, v3

    move-object/from16 v59, v9

    move-object v7, v10

    move/from16 v54, v14

    move/from16 v55, v15

    const/16 v19, 0x1aa

    const/16 v25, 0x4

    const/16 v30, 0x10

    const/16 v31, 0x3

    goto/16 :goto_26

    :cond_2d
    throw v0

    :catchall_16
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_2e

    throw v1

    :cond_2e
    throw v0
    :try_end_48
    .catchall {:try_start_48 .. :try_end_48} :catchall_15

    :catchall_17
    move-exception v0

    move-object/from16 v60, v11

    move/from16 v61, v12

    goto :goto_27

    :cond_2f
    move-object/from16 v27, v1

    move-object/from16 v58, v2

    move-object/from16 v60, v11

    move/from16 v61, v12

    :try_start_49
    sput-wide v54, Lcom/appsflyer/internal/AFi1jSDK;->force:J
    :try_end_49
    .catchall {:try_start_49 .. :try_end_49} :catchall_45

    const/16 v2, 0x10

    :try_start_4a
    new-array v1, v2, [B
    :try_end_4a
    .catchall {:try_start_4a .. :try_end_4a} :catchall_47

    :try_start_4b
    fill-array-data v1, :array_3
    :try_end_4b
    .catchall {:try_start_4b .. :try_end_4b} :catchall_46

    move/from16 v2, v28

    :try_start_4c
    invoke-static {v2, v2, v2}, Landroid/view/View;->resolveSizeAndState(III)I

    move-result v11

    neg-int v2, v11

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v11

    long-to-int v11, v11

    mul-int/lit16 v12, v2, -0x295

    xor-int/lit16 v13, v12, -0x14a8

    and-int/lit16 v12, v12, -0x14a8

    const/16 v32, 0x1

    shl-int/lit8 v12, v12, 0x1

    add-int/2addr v13, v12

    not-int v12, v11

    move-object/from16 v54, v1

    not-int v1, v2

    or-int/lit8 v1, v1, -0x9

    not-int v1, v1

    xor-int v55, v12, v1

    and-int/2addr v1, v12

    or-int v1, v55, v1

    mul-int/lit16 v1, v1, 0x52c

    neg-int v1, v1

    neg-int v1, v1

    xor-int v12, v13, v1

    and-int/2addr v1, v13

    const/16 v32, 0x1

    shl-int/lit8 v1, v1, 0x1

    add-int/2addr v12, v1

    xor-int v1, v2, v11

    and-int v13, v2, v11

    or-int/2addr v1, v13

    not-int v1, v1

    or-int/lit8 v11, v11, 0x8

    not-int v11, v11

    xor-int v13, v1, v11

    and-int/2addr v1, v11

    or-int/2addr v1, v13

    mul-int/lit16 v1, v1, -0x52c

    and-int v11, v12, v1

    or-int/2addr v1, v12

    add-int/2addr v11, v1

    not-int v1, v2

    xor-int/lit8 v12, v1, 0x8

    and-int/lit8 v1, v1, 0x8

    or-int/2addr v1, v12

    not-int v1, v1

    const/16 v12, -0x9

    xor-int v13, v12, v2

    and-int/2addr v2, v12

    or-int/2addr v2, v13

    not-int v2, v2

    xor-int v12, v1, v2

    and-int/2addr v1, v2

    or-int/2addr v1, v12

    mul-int/lit16 v1, v1, 0x296

    add-int/2addr v11, v1

    int-to-byte v1, v11

    sget-wide v11, Lcom/appsflyer/internal/AFi1jSDK;->force:J

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v62
    :try_end_4c
    .catchall {:try_start_4c .. :try_end_4c} :catchall_45

    const/16 v2, 0x30

    shr-long v62, v62, v2

    const-wide v64, -0x203dca9f2c91d7fL    # -7.360874818362942E298

    add-long v62, v62, v64

    xor-long v11, v11, v62

    long-to-int v2, v11

    .line 19
    sget v11, Lcom/appsflyer/internal/AFi1jSDK;->$10:I

    or-int/lit8 v12, v11, 0x3b

    const/16 v32, 0x1

    shl-int/lit8 v12, v12, 0x1

    xor-int/lit8 v11, v11, 0x3b

    sub-int/2addr v12, v11

    rem-int/lit16 v12, v12, 0x80

    sput v12, Lcom/appsflyer/internal/AFi1jSDK;->$11:I

    const/4 v11, 0x4

    .line 20
    :try_start_4d
    new-array v12, v11, [Ljava/lang/Object;
    :try_end_4d
    .catchall {:try_start_4d .. :try_end_4d} :catchall_44

    :try_start_4e
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2
    :try_end_4e
    .catchall {:try_start_4e .. :try_end_4e} :catchall_43

    const/16 v31, 0x3

    :try_start_4f
    aput-object v2, v12, v31

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/16 v45, 0x2

    aput-object v1, v12, v45

    const/16 v32, 0x1

    aput-object v54, v12, v32

    const/16 v28, 0x0

    aput-object v58, v12, v28

    const/16 v1, 0x388

    aget-byte v1, v27, v1

    int-to-byte v1, v1

    or-int/lit16 v2, v1, 0x21b

    int-to-short v2, v2

    int-to-byte v11, v7

    invoke-static {v1, v2, v11}, Lcom/appsflyer/internal/AFi1jSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lcom/appsflyer/internal/AFi1jSDK;->i:Ljava/lang/Object;

    check-cast v2, Ljava/lang/ClassLoader;

    const/4 v11, 0x1

    invoke-static {v1, v11, v2}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object v1

    aget-byte v2, v27, v22

    int-to-byte v2, v2

    or-int/lit16 v13, v7, 0x219

    int-to-short v13, v13

    const/16 v25, 0x4

    or-int/lit8 v32, v7, 0x4

    shl-int/lit8 v54, v32, 0x1

    xor-int/lit8 v11, v7, 0x4

    sub-int v11, v54, v11

    int-to-byte v11, v11

    invoke-static {v2, v13, v11}, Lcom/appsflyer/internal/AFi1jSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v2

    aget-byte v11, v27, v34
    :try_end_4f
    .catchall {:try_start_4f .. :try_end_4f} :catchall_42

    int-to-byte v11, v11

    xor-int/lit16 v13, v7, 0x188

    move/from16 v54, v13

    and-int/lit16 v13, v7, 0x188

    or-int v13, v54, v13

    int-to-short v13, v13

    move/from16 v54, v14

    :try_start_50
    aget-byte v14, v27, v36

    neg-int v14, v14

    int-to-byte v14, v14

    invoke-static {v11, v13, v14}, Lcom/appsflyer/internal/AFi1jSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v11

    invoke-static {v11}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v11

    filled-new-array {v11, v9, v8, v8}, [Ljava/lang/Class;

    move-result-object v11

    invoke-virtual {v1, v2, v11}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    invoke-virtual {v1, v5, v12}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1
    :try_end_50
    .catchall {:try_start_50 .. :try_end_50} :catchall_41

    :goto_28
    :try_start_51
    aget-byte v2, v27, v34

    int-to-byte v2, v2

    or-int/lit16 v5, v7, 0x188

    int-to-short v5, v5

    aget-byte v11, v27, v36

    neg-int v11, v11

    int-to-byte v11, v11

    invoke-static {v2, v5, v11}, Lcom/appsflyer/internal/AFi1jSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v2

    aget-byte v5, v27, v24

    int-to-byte v5, v5

    const/16 v11, 0x270

    int-to-short v11, v11

    const/16 v30, 0x10

    xor-int/lit8 v12, v7, 0x10

    and-int/lit8 v13, v7, 0x10

    or-int/2addr v12, v13

    int-to-byte v12, v12

    invoke-static {v5, v11, v12}, Lcom/appsflyer/internal/AFi1jSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v5

    sget-object v11, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    filled-new-array {v11}, [Ljava/lang/Class;

    move-result-object v11

    invoke-virtual {v2, v5, v11}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v2

    invoke-static/range {v23 .. v23}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    filled-new-array {v5}, [Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v2, v1, v5}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_51
    .catchall {:try_start_51 .. :try_end_51} :catchall_40

    if-eqz v35, :cond_3f

    .line 21
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v11

    long-to-int v2, v11

    const v5, -0x675a58b0

    xor-int v11, v5, v2

    and-int v12, v5, v2

    or-int/2addr v11, v12

    const v12, -0x64e5a57f

    xor-int v13, v11, v12

    and-int/2addr v11, v12

    or-int/2addr v11, v13

    mul-int/lit16 v11, v11, -0x2a4

    not-int v11, v11

    const v13, -0x5b6fe4ab

    sub-int/2addr v13, v11

    not-int v11, v2

    xor-int v14, v11, v5

    and-int/2addr v5, v11

    or-int/2addr v5, v14

    not-int v5, v5

    const v11, 0x6440002e

    or-int/2addr v5, v11

    mul-int/lit16 v5, v5, 0x2a4

    and-int v11, v13, v5

    or-int/2addr v5, v13

    add-int/2addr v11, v5

    not-int v5, v2

    or-int/2addr v5, v12

    not-int v5, v5

    const v12, 0xa5a550

    xor-int v13, v12, v5

    and-int/2addr v5, v12

    or-int/2addr v5, v13

    const v12, -0x31a5882

    xor-int v13, v12, v2

    and-int/2addr v2, v12

    or-int/2addr v2, v13

    not-int v2, v2

    or-int/2addr v2, v5

    mul-int/lit16 v2, v2, 0x2a4

    neg-int v2, v2

    neg-int v2, v2

    or-int v5, v11, v2

    const/16 v32, 0x1

    shl-int/lit8 v5, v5, 0x1

    xor-int/2addr v2, v11

    sub-int/2addr v5, v2

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v11

    long-to-int v2, v11

    not-int v2, v2

    const v11, -0x759ea315

    xor-int v12, v2, v11

    and-int v13, v2, v11

    or-int/2addr v12, v13

    not-int v12, v12

    const v13, -0x75beeb55

    xor-int v14, v13, v12

    and-int/2addr v12, v13

    or-int/2addr v12, v14

    mul-int/lit16 v12, v12, -0x3ca

    const v13, -0x6231deb3

    add-int/2addr v13, v12

    const v12, 0x50fa3250

    and-int v14, v13, v12

    or-int/2addr v12, v13

    add-int/2addr v14, v12

    xor-int v12, v2, v11

    and-int/2addr v2, v11

    or-int/2addr v2, v12

    not-int v2, v2

    const v11, 0x204840

    or-int/2addr v2, v11

    mul-int/lit16 v2, v2, 0x3ca

    neg-int v2, v2

    neg-int v2, v2

    or-int v11, v14, v2

    const/16 v32, 0x1

    shl-int/lit8 v11, v11, 0x1

    xor-int/2addr v2, v14

    sub-int/2addr v11, v2

    if-le v5, v11, :cond_3e

    .line 22
    :try_start_52
    sget-object v2, Lcom/appsflyer/internal/AFi1jSDK;->e:Ljava/lang/Object;

    if-nez v2, :cond_30

    move-object/from16 v5, v49

    goto :goto_29

    :cond_30
    move-object/from16 v5, v39

    :goto_29
    if-nez v2, :cond_31

    move-object/from16 v2, v53

    goto :goto_2a

    :cond_31
    move-object/from16 v2, v47

    .line 23
    :goto_2a
    aget-byte v11, v27, v34

    int-to-byte v11, v11

    xor-int/lit16 v12, v7, 0x188

    and-int/lit16 v13, v7, 0x188

    or-int/2addr v12, v13

    int-to-short v12, v12

    aget-byte v13, v27, v36

    neg-int v13, v13

    int-to-byte v13, v13

    invoke-static {v11, v12, v13}, Lcom/appsflyer/internal/AFi1jSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v11

    invoke-static {v11}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v11

    aget-byte v12, v27, v24

    int-to-byte v12, v12

    xor-int/lit16 v13, v12, 0x270

    and-int/lit16 v14, v12, 0x270

    or-int/2addr v13, v14

    int-to-short v13, v13

    and-int/lit16 v14, v13, 0x1dd

    int-to-byte v14, v14

    invoke-static {v12, v13, v14}, Lcom/appsflyer/internal/AFi1jSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v12

    filled-new-array {v9, v8, v8}, [Ljava/lang/Class;

    move-result-object v13

    invoke-virtual {v11, v12, v13}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v11

    aget-byte v12, v27, v26

    neg-int v12, v12

    int-to-byte v12, v12

    xor-int/lit16 v13, v7, 0x104

    and-int/lit16 v14, v7, 0x104

    or-int/2addr v13, v14

    int-to-short v13, v13

    aget-byte v14, v27, v36

    neg-int v14, v14

    int-to-byte v14, v14

    invoke-static {v12, v13, v14}, Lcom/appsflyer/internal/AFi1jSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v12

    invoke-static {v12}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v12
    :try_end_52
    .catchall {:try_start_52 .. :try_end_52} :catchall_27

    const/16 v32, 0x1

    :try_start_53
    aget-byte v13, v27, v32
    :try_end_53
    .catch Ljava/lang/Exception; {:try_start_53 .. :try_end_53} :catch_b
    .catchall {:try_start_53 .. :try_end_53} :catchall_23

    int-to-byte v13, v13

    or-int/lit16 v14, v7, 0x80

    int-to-short v14, v14

    move/from16 v55, v15

    :try_start_54
    aget-byte v15, v27, v36

    neg-int v15, v15

    int-to-byte v15, v15

    invoke-static {v13, v14, v15}, Lcom/appsflyer/internal/AFi1jSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v13

    invoke-static {v13}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v13

    filled-new-array {v13}, [Ljava/lang/Class;

    move-result-object v13

    invoke-virtual {v12, v13}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v13

    filled-new-array {v5}, [Ljava/lang/Object;

    move-result-object v14

    invoke-virtual {v13, v14}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13
    :try_end_54
    .catch Ljava/lang/Exception; {:try_start_54 .. :try_end_54} :catch_a
    .catchall {:try_start_54 .. :try_end_54} :catchall_22

    if-eqz v61, :cond_33

    const/16 v32, 0x1

    :try_start_55
    aget-byte v14, v27, v32

    int-to-byte v14, v14

    xor-int/lit16 v15, v7, 0x80

    move/from16 v57, v15

    and-int/lit16 v15, v7, 0x80

    or-int v15, v57, v15

    int-to-short v15, v15

    move-object/from16 v57, v6

    aget-byte v6, v27, v36

    neg-int v6, v6

    int-to-byte v6, v6

    invoke-static {v14, v15, v6}, Lcom/appsflyer/internal/AFi1jSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v6

    aget-byte v14, v27, v37
    :try_end_55
    .catchall {:try_start_55 .. :try_end_55} :catchall_19

    int-to-byte v14, v14

    xor-int/lit16 v15, v7, 0x234

    move/from16 v58, v15

    and-int/lit16 v15, v7, 0x234

    or-int v15, v58, v15

    int-to-short v15, v15

    move-object/from16 v58, v3

    and-int/lit16 v3, v15, 0x1db

    int-to-byte v3, v3

    :try_start_56
    invoke-static {v14, v15, v3}, Lcom/appsflyer/internal/AFi1jSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v3

    const/4 v14, 0x0

    invoke-virtual {v6, v3, v14}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v3

    invoke-virtual {v3, v5, v14}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_56
    .catchall {:try_start_56 .. :try_end_56} :catchall_18

    goto :goto_2e

    :catchall_18
    move-exception v0

    goto :goto_2b

    :catchall_19
    move-exception v0

    move-object/from16 v58, v3

    :goto_2b
    :try_start_57
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_32

    throw v1

    :catchall_1a
    move-exception v0

    :goto_2c
    const/16 v30, 0x10

    goto/16 :goto_34

    :catch_9
    move-exception v0

    :goto_2d
    const/16 v30, 0x10

    goto/16 :goto_33

    :cond_32
    throw v0
    :try_end_57
    .catch Ljava/lang/Exception; {:try_start_57 .. :try_end_57} :catch_9
    .catchall {:try_start_57 .. :try_end_57} :catchall_1a

    :cond_33
    move-object/from16 v58, v3

    move-object/from16 v57, v6

    .line 24
    :goto_2e
    sget v3, Lcom/appsflyer/internal/AFi1jSDK;->$10:I

    add-int/lit8 v3, v3, 0x3

    rem-int/lit16 v3, v3, 0x80

    sput v3, Lcom/appsflyer/internal/AFi1jSDK;->$11:I

    const/16 v3, 0x400

    .line 25
    :try_start_58
    new-array v6, v3, [B

    aget-byte v14, v27, v41

    int-to-byte v14, v14

    xor-int/lit16 v15, v14, 0x280

    and-int/lit16 v3, v14, 0x280

    or-int/2addr v3, v15

    int-to-short v3, v3

    xor-int/lit8 v15, v7, 0x14

    and-int/lit8 v7, v7, 0x14

    or-int/2addr v7, v15

    int-to-byte v7, v7

    invoke-static {v14, v3, v7}, Lcom/appsflyer/internal/AFi1jSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v3

    filled-new-array {v9, v8, v8}, [Ljava/lang/Class;

    move-result-object v7

    invoke-virtual {v12, v3, v7}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v3

    :goto_2f
    if-lez v0, :cond_34

    const/16 v28, 0x0

    invoke-static/range {v28 .. v28}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    const/16 v8, 0x400

    invoke-static {v8, v0}, Ljava/lang/Math;->min(II)I

    move-result v14

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    filled-new-array {v6, v7, v14}, [Ljava/lang/Object;

    move-result-object v7

    invoke-virtual {v11, v1, v7}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Integer;

    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v14
    :try_end_58
    .catchall {:try_start_58 .. :try_end_58} :catchall_1a

    const/4 v15, -0x1

    if-eq v14, v15, :cond_34

    .line 26
    sget v15, Lcom/appsflyer/internal/AFi1jSDK;->$10:I

    xor-int/lit8 v27, v15, 0x6d

    and-int/lit8 v15, v15, 0x6d

    const/16 v32, 0x1

    shl-int/lit8 v15, v15, 0x1

    add-int v15, v27, v15

    rem-int/lit16 v15, v15, 0x80

    sput v15, Lcom/appsflyer/internal/AFi1jSDK;->$11:I

    const/16 v28, 0x0

    .line 27
    :try_start_59
    invoke-static/range {v28 .. v28}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    filled-new-array {v6, v15, v7}, [Ljava/lang/Object;

    move-result-object v7

    invoke-virtual {v3, v13, v7}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    neg-int v7, v14

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v14

    long-to-int v14, v14

    mul-int/lit16 v15, v7, -0xb7

    mul-int/lit16 v8, v0, -0xb7

    or-int v27, v15, v8

    const/16 v32, 0x1

    shl-int/lit8 v27, v27, 0x1

    xor-int/2addr v8, v15

    sub-int v27, v27, v8

    not-int v8, v7

    not-int v15, v14

    xor-int v62, v8, v15

    and-int v63, v8, v15

    or-int v62, v62, v63

    move-object/from16 v63, v1

    or-int v1, v62, v0

    not-int v1, v1

    move/from16 v62, v1

    not-int v1, v0

    not-int v14, v14

    xor-int v64, v1, v14

    and-int v65, v1, v14

    or-int v64, v64, v65

    xor-int v65, v64, v7

    and-int v64, v64, v7

    move/from16 v66, v1

    or-int v1, v65, v64

    not-int v1, v1

    or-int v1, v62, v1

    mul-int/lit16 v1, v1, -0xb8

    xor-int v62, v27, v1

    and-int v1, v27, v1

    const/16 v32, 0x1

    shl-int/lit8 v1, v1, 0x1

    add-int v62, v62, v1

    xor-int v1, v8, v66

    and-int v8, v8, v66

    or-int/2addr v1, v8

    not-int v1, v1

    not-int v8, v7

    xor-int v27, v8, v14

    and-int/2addr v8, v14

    or-int v8, v27, v8

    not-int v8, v8

    or-int/2addr v1, v8

    xor-int v8, v66, v15

    and-int v14, v66, v15

    or-int/2addr v8, v14

    not-int v8, v8

    xor-int v14, v1, v8

    and-int/2addr v1, v8

    or-int/2addr v1, v14

    mul-int/lit16 v1, v1, 0xb8

    or-int v8, v62, v1

    const/16 v32, 0x1

    shl-int/lit8 v8, v8, 0x1

    xor-int v1, v62, v1

    sub-int/2addr v8, v1

    xor-int v1, v7, v0

    and-int/2addr v0, v7

    or-int/2addr v0, v1

    mul-int/lit16 v0, v0, 0xb8

    neg-int v0, v0

    neg-int v0, v0

    and-int v1, v8, v0

    or-int/2addr v0, v8

    add-int/2addr v0, v1

    move-object/from16 v1, v63

    goto/16 :goto_2f

    :cond_34
    sget-object v0, Lcom/appsflyer/internal/AFi1jSDK;->$$a:[B

    aget-byte v1, v0, v41

    int-to-byte v1, v1

    const/16 v3, 0x288

    int-to-short v3, v3

    sget v6, Lcom/appsflyer/internal/AFi1jSDK;->$$b:I

    const/16 v25, 0x4

    and-int/lit8 v7, v6, 0x4

    or-int/lit8 v8, v6, 0x4

    add-int/2addr v7, v8

    int-to-byte v7, v7

    invoke-static {v1, v3, v7}, Lcom/appsflyer/internal/AFi1jSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v1

    const/4 v3, 0x0

    new-array v7, v3, [Ljava/lang/Class;

    invoke-virtual {v12, v1, v7}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    new-array v7, v3, [Ljava/lang/Object;

    invoke-virtual {v1, v13, v7}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    aget-byte v3, v0, v22

    int-to-byte v3, v3

    const/16 v7, 0x28c

    int-to-short v7, v7

    aget-byte v8, v0, v36

    neg-int v8, v8

    int-to-byte v8, v8

    invoke-static {v3, v7, v8}, Lcom/appsflyer/internal/AFi1jSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v3

    aget-byte v7, v0, v24
    :try_end_59
    .catchall {:try_start_59 .. :try_end_59} :catchall_1a

    int-to-byte v7, v7

    const/16 v8, 0x2a1

    int-to-short v8, v8

    const/16 v30, 0x10

    or-int/lit8 v11, v6, 0x10

    int-to-byte v11, v11

    :try_start_5a
    invoke-static {v7, v8, v11}, Lcom/appsflyer/internal/AFi1jSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v7

    const/4 v8, 0x0

    new-array v11, v8, [Ljava/lang/Class;

    invoke-virtual {v3, v7, v11}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v3

    new-array v7, v8, [Ljava/lang/Object;

    invoke-virtual {v3, v1, v7}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    aget-byte v1, v0, v41

    int-to-byte v1, v1

    or-int/lit16 v3, v1, 0x159

    int-to-short v3, v3

    int-to-byte v7, v6

    invoke-static {v1, v3, v7}, Lcom/appsflyer/internal/AFi1jSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v1

    const/4 v3, 0x0

    new-array v7, v3, [Ljava/lang/Class;

    invoke-virtual {v12, v1, v7}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    new-array v7, v3, [Ljava/lang/Object;

    invoke-virtual {v1, v13, v7}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    aget-byte v1, v0, v21

    int-to-byte v1, v1

    const/16 v3, 0x2a4

    int-to-short v3, v3

    const/16 v19, 0x1aa

    aget-byte v7, v0, v19

    int-to-byte v7, v7

    invoke-static {v1, v3, v7}, Lcom/appsflyer/internal/AFi1jSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    const/16 v3, 0xc6

    aget-byte v3, v0, v3

    int-to-byte v3, v3

    const/16 v7, 0x2b8

    int-to-short v7, v7

    const/16 v13, 0x9

    xor-int/lit8 v8, v6, 0x9

    and-int/lit8 v11, v6, 0x9

    or-int/2addr v8, v11

    int-to-byte v8, v8

    invoke-static {v3, v7, v8}, Lcom/appsflyer/internal/AFi1jSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v3

    sget-object v7, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    filled-new-array {v10, v10, v7}, [Ljava/lang/Class;

    move-result-object v7

    invoke-virtual {v1, v3, v7}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1
    :try_end_5a
    .catchall {:try_start_5a .. :try_end_5a} :catchall_1f

    const/16 v32, 0x1

    :try_start_5b
    aget-byte v3, v0, v32

    int-to-byte v3, v3

    xor-int/lit16 v7, v6, 0x80

    and-int/lit16 v8, v6, 0x80

    or-int/2addr v7, v8

    int-to-short v7, v7

    aget-byte v8, v0, v36

    neg-int v8, v8

    int-to-byte v8, v8

    invoke-static {v3, v7, v8}, Lcom/appsflyer/internal/AFi1jSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v3

    aget-byte v7, v0, v33

    int-to-byte v7, v7

    xor-int/lit16 v8, v7, 0x2b0

    and-int/lit16 v11, v7, 0x2b0

    or-int/2addr v8, v11

    int-to-short v8, v8

    const/16 v25, 0x4

    and-int/lit8 v11, v6, 0x4

    or-int/lit8 v12, v6, 0x4

    add-int/2addr v11, v12

    int-to-byte v11, v11

    invoke-static {v7, v8, v11}, Lcom/appsflyer/internal/AFi1jSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v7

    const/4 v14, 0x0

    invoke-virtual {v3, v7, v14}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v3

    invoke-virtual {v3, v5, v14}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3
    :try_end_5b
    .catchall {:try_start_5b .. :try_end_5b} :catchall_21

    const/16 v32, 0x1

    :try_start_5c
    aget-byte v7, v0, v32

    int-to-byte v7, v7

    xor-int/lit16 v8, v6, 0x80

    and-int/lit16 v11, v6, 0x80

    or-int/2addr v8, v11

    int-to-short v8, v8

    aget-byte v11, v0, v36

    neg-int v11, v11

    int-to-byte v11, v11

    invoke-static {v7, v8, v11}, Lcom/appsflyer/internal/AFi1jSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v7

    aget-byte v8, v0, v33

    int-to-byte v8, v8

    xor-int/lit16 v11, v8, 0x2b0

    and-int/lit16 v12, v8, 0x2b0

    or-int/2addr v11, v12

    int-to-short v11, v11

    add-int/lit8 v12, v6, 0x4

    int-to-byte v12, v12

    invoke-static {v8, v11, v12}, Lcom/appsflyer/internal/AFi1jSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v8

    const/4 v14, 0x0

    invoke-virtual {v7, v8, v14}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v7

    invoke-virtual {v7, v2, v14}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7
    :try_end_5c
    .catchall {:try_start_5c .. :try_end_5c} :catchall_20

    const/16 v28, 0x0

    :try_start_5d
    invoke-static/range {v28 .. v28}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    filled-new-array {v3, v7, v8}, [Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v1, v14, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1
    :try_end_5d
    .catchall {:try_start_5d .. :try_end_5d} :catchall_1f

    const/16 v32, 0x1

    :try_start_5e
    aget-byte v3, v0, v32

    int-to-byte v3, v3

    or-int/lit16 v7, v6, 0x80

    int-to-short v7, v7

    aget-byte v8, v0, v36

    neg-int v8, v8

    int-to-byte v8, v8

    invoke-static {v3, v7, v8}, Lcom/appsflyer/internal/AFi1jSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v3

    const/16 v7, 0xf

    aget-byte v7, v0, v7

    int-to-byte v7, v7

    const/16 v8, 0x2cc

    int-to-short v8, v8

    const/16 v19, 0x1aa

    aget-byte v11, v0, v19

    int-to-byte v11, v11

    invoke-static {v7, v8, v11}, Lcom/appsflyer/internal/AFi1jSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v7

    const/4 v14, 0x0

    invoke-virtual {v3, v7, v14}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v3

    invoke-virtual {v3, v5, v14}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_5e
    .catchall {:try_start_5e .. :try_end_5e} :catchall_1e

    const/16 v32, 0x1

    :try_start_5f
    aget-byte v3, v0, v32

    int-to-byte v3, v3

    or-int/lit16 v5, v6, 0x80

    int-to-short v5, v5

    aget-byte v7, v0, v36

    neg-int v7, v7

    int-to-byte v7, v7

    invoke-static {v3, v5, v7}, Lcom/appsflyer/internal/AFi1jSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v3

    const/16 v5, 0xf

    aget-byte v5, v0, v5

    int-to-byte v5, v5

    const/16 v19, 0x1aa

    aget-byte v7, v0, v19

    int-to-byte v7, v7

    invoke-static {v5, v8, v7}, Lcom/appsflyer/internal/AFi1jSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v5

    const/4 v14, 0x0

    invoke-virtual {v3, v5, v14}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v3

    invoke-virtual {v3, v2, v14}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_5f
    .catchall {:try_start_5f .. :try_end_5f} :catchall_1d

    :try_start_60
    sget-object v2, Lcom/appsflyer/internal/AFi1jSDK;->i:Ljava/lang/Object;

    if-nez v2, :cond_36

    const-class v2, Lcom/appsflyer/internal/AFi1jSDK;
    :try_end_60
    .catchall {:try_start_60 .. :try_end_60} :catchall_1b

    :try_start_61
    const-class v3, Ljava/lang/Class;

    const/16 v5, 0x29e

    aget-byte v0, v0, v5

    int-to-byte v0, v0

    const/16 v5, 0x2d1

    int-to-short v5, v5

    add-int/lit8 v6, v6, 0x4

    int-to-byte v6, v6

    invoke-static {v0, v5, v6}, Lcom/appsflyer/internal/AFi1jSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v0

    const/4 v14, 0x0

    invoke-virtual {v3, v0, v14}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    invoke-virtual {v0, v2, v14}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_61
    .catchall {:try_start_61 .. :try_end_61} :catchall_1c

    :try_start_62
    sput-object v0, Lcom/appsflyer/internal/AFi1jSDK;->i:Ljava/lang/Object;

    goto :goto_32

    :catchall_1b
    move-exception v0

    :goto_30
    move-object v1, v0

    move-object/from16 v59, v9

    move-object v7, v10

    :goto_31
    move-object/from16 v8, v58

    const/16 v19, 0x1aa

    const/16 v25, 0x4

    goto/16 :goto_26

    :catchall_1c
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_35

    throw v1

    :cond_35
    throw v0

    :cond_36
    :goto_32
    move-object/from16 v59, v9

    move-object/from16 v27, v10

    const/16 v44, 0x5

    goto/16 :goto_39

    :catchall_1d
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_37

    throw v1

    :cond_37
    throw v0

    :catchall_1e
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_38

    throw v1

    :cond_38
    throw v0
    :try_end_62
    .catchall {:try_start_62 .. :try_end_62} :catchall_1b

    :catchall_1f
    move-exception v0

    goto/16 :goto_34

    :catchall_20
    move-exception v0

    :try_start_63
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_39

    throw v1

    :cond_39
    throw v0

    :catchall_21
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_3a

    throw v1

    :cond_3a
    throw v0

    :catchall_22
    move-exception v0

    move-object/from16 v58, v3

    goto/16 :goto_2c

    :catch_a
    move-exception v0

    move-object/from16 v58, v3

    goto/16 :goto_2d

    :catchall_23
    move-exception v0

    move-object/from16 v58, v3

    move/from16 v55, v15

    goto/16 :goto_2c

    :catch_b
    move-exception v0

    move-object/from16 v58, v3

    move/from16 v55, v15

    goto/16 :goto_2d

    :goto_33
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v3, Lcom/appsflyer/internal/AFi1jSDK;->$$a:[B

    aget-byte v4, v3, v41

    int-to-byte v4, v4

    const/16 v6, 0x280

    int-to-short v6, v6

    aget-byte v7, v3, v16

    int-to-byte v7, v7

    invoke-static {v4, v6, v7}, Lcom/appsflyer/internal/AFi1jSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    aget-byte v4, v3, v43

    int-to-byte v4, v4

    const/16 v6, 0x124

    xor-int/lit16 v7, v4, 0x124

    and-int/lit16 v8, v4, 0x124

    or-int v6, v7, v8

    int-to-short v6, v6

    aget-byte v7, v3, v40

    int-to-byte v7, v7

    invoke-static {v4, v6, v7}, Lcom/appsflyer/internal/AFi1jSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1
    :try_end_63
    .catchall {:try_start_63 .. :try_end_63} :catchall_1f

    const/4 v4, 0x2

    :try_start_64
    new-array v6, v4, [Ljava/lang/Object;

    const/16 v32, 0x1

    aput-object v0, v6, v32

    const/16 v28, 0x0

    aput-object v1, v6, v28

    aget-byte v0, v3, v34

    int-to-byte v0, v0

    const/16 v1, 0x124

    int-to-short v4, v1

    aget-byte v1, v3, v36

    neg-int v1, v1

    int-to-byte v1, v1

    invoke-static {v0, v4, v1}, Lcom/appsflyer/internal/AFi1jSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    const-class v1, Ljava/lang/Throwable;

    filled-new-array {v10, v1}, [Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Throwable;

    throw v0
    :try_end_64
    .catchall {:try_start_64 .. :try_end_64} :catchall_24

    :catchall_24
    move-exception v0

    :try_start_65
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_3b

    throw v1

    :cond_3b
    throw v0
    :try_end_65
    .catchall {:try_start_65 .. :try_end_65} :catchall_1f

    :goto_34
    :try_start_66
    sget-object v1, Lcom/appsflyer/internal/AFi1jSDK;->$$a:[B

    const/16 v32, 0x1

    aget-byte v3, v1, v32

    int-to-byte v3, v3

    sget v4, Lcom/appsflyer/internal/AFi1jSDK;->$$b:I

    or-int/lit16 v6, v4, 0x80

    int-to-short v6, v6

    aget-byte v7, v1, v36

    neg-int v7, v7

    int-to-byte v7, v7

    invoke-static {v3, v6, v7}, Lcom/appsflyer/internal/AFi1jSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v3

    const/16 v6, 0xf

    aget-byte v6, v1, v6

    int-to-byte v6, v6

    const/16 v7, 0x2cc

    int-to-short v7, v7

    const/16 v19, 0x1aa

    aget-byte v8, v1, v19

    int-to-byte v8, v8

    invoke-static {v6, v7, v8}, Lcom/appsflyer/internal/AFi1jSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v6

    const/4 v14, 0x0

    invoke-virtual {v3, v6, v14}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v3

    invoke-virtual {v3, v5, v14}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_66
    .catchall {:try_start_66 .. :try_end_66} :catchall_26

    .line 28
    sget v3, Lcom/appsflyer/internal/AFi1jSDK;->$11:I

    or-int/lit8 v5, v3, 0x67

    const/16 v32, 0x1

    shl-int/lit8 v5, v5, 0x1

    xor-int/lit8 v3, v3, 0x67

    sub-int/2addr v5, v3

    rem-int/lit16 v5, v5, 0x80

    sput v5, Lcom/appsflyer/internal/AFi1jSDK;->$10:I

    .line 29
    :try_start_67
    aget-byte v3, v1, v32

    int-to-byte v3, v3

    or-int/lit16 v4, v4, 0x80

    int-to-short v4, v4

    aget-byte v5, v1, v36

    neg-int v5, v5

    int-to-byte v5, v5

    invoke-static {v3, v4, v5}, Lcom/appsflyer/internal/AFi1jSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v3

    const/16 v4, 0xf

    aget-byte v4, v1, v4

    int-to-byte v4, v4

    const/16 v19, 0x1aa

    aget-byte v1, v1, v19

    int-to-byte v1, v1

    invoke-static {v4, v7, v1}, Lcom/appsflyer/internal/AFi1jSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v1

    const/4 v14, 0x0

    invoke-virtual {v3, v1, v14}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    invoke-virtual {v1, v2, v14}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_67
    .catchall {:try_start_67 .. :try_end_67} :catchall_25

    :try_start_68
    throw v0

    :catchall_25
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_3c

    throw v1

    :cond_3c
    throw v0

    :catchall_26
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_3d

    throw v1

    :cond_3d
    throw v0

    :catchall_27
    move-exception v0

    move-object/from16 v58, v3

    move/from16 v55, v15

    const/16 v30, 0x10

    goto/16 :goto_30

    :cond_3e
    move-object/from16 v58, v3

    move/from16 v55, v15

    const/16 v30, 0x10

    const/16 v46, 0x0

    .line 30
    throw v46
    :try_end_68
    .catchall {:try_start_68 .. :try_end_68} :catchall_1b

    :cond_3f
    move-object/from16 v63, v1

    move-object/from16 v58, v3

    move-object/from16 v57, v6

    move/from16 v55, v15

    const/16 v30, 0x10

    const/16 v0, 0x1f9

    .line 31
    :try_start_69
    aget-byte v0, v27, v0

    int-to-byte v0, v0

    xor-int/lit16 v1, v7, 0x29c

    and-int/lit16 v2, v7, 0x29c

    or-int/2addr v1, v2

    int-to-short v1, v1

    aget-byte v2, v27, v36

    neg-int v2, v2

    int-to-byte v2, v2

    invoke-static {v0, v1, v2}, Lcom/appsflyer/internal/AFi1jSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    aget-byte v1, v27, v34

    int-to-byte v1, v1

    xor-int/lit16 v2, v7, 0x188

    and-int/lit16 v3, v7, 0x188

    or-int/2addr v2, v3

    int-to-short v2, v2

    aget-byte v3, v27, v36

    neg-int v3, v3

    int-to-byte v3, v3

    invoke-static {v1, v2, v3}, Lcom/appsflyer/internal/AFi1jSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    filled-new-array {v1}, [Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v2

    filled-new-array/range {v63 .. v63}, [Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    const/16 v32, 0x1

    aget-byte v3, v27, v32

    int-to-byte v3, v3

    const/16 v5, 0x2f9

    int-to-short v5, v5

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v11

    long-to-int v6, v11

    mul-int/lit16 v11, v7, -0x9f

    const/16 v12, -0x27c

    add-int/2addr v12, v11

    xor-int/lit8 v11, v7, -0x5

    and-int/lit8 v14, v7, -0x5

    or-int/2addr v11, v14

    mul-int/lit16 v11, v11, 0xa0

    or-int v14, v12, v11

    const/16 v32, 0x1

    shl-int/lit8 v14, v14, 0x1

    xor-int/2addr v11, v12

    sub-int/2addr v14, v11

    not-int v6, v6

    const/16 v25, 0x4

    xor-int/lit8 v11, v6, 0x4

    and-int/lit8 v12, v6, 0x4

    or-int/2addr v11, v12

    not-int v11, v11

    xor-int/lit8 v12, v7, 0x4

    and-int/lit8 v15, v7, 0x4

    or-int/2addr v12, v15

    not-int v12, v12

    xor-int v15, v11, v12

    and-int/2addr v11, v12

    or-int/2addr v11, v15

    mul-int/lit16 v11, v11, -0xa0

    not-int v11, v11

    sub-int/2addr v14, v11

    const/16 v32, 0x1

    add-int/lit8 v14, v14, -0x1

    not-int v11, v7

    or-int/2addr v6, v11

    not-int v6, v6

    const/16 v25, 0x4

    xor-int/lit8 v11, v6, 0x4

    and-int/lit8 v6, v6, 0x4

    or-int/2addr v6, v11

    mul-int/lit16 v6, v6, 0xa0

    xor-int v11, v14, v6

    and-int/2addr v6, v14

    shl-int/lit8 v6, v6, 0x1

    add-int/2addr v11, v6

    int-to-byte v6, v11

    invoke-static {v3, v5, v6}, Lcom/appsflyer/internal/AFi1jSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v3

    const/4 v5, 0x0

    new-array v6, v5, [Ljava/lang/Class;

    invoke-virtual {v0, v3, v6}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    new-array v3, v5, [Ljava/lang/Object;

    invoke-virtual {v0, v2, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    aget-byte v3, v27, v22

    int-to-byte v3, v3

    const/16 v5, 0x304

    int-to-short v5, v5

    aget-byte v6, v27, v36

    neg-int v6, v6

    int-to-byte v6, v6

    invoke-static {v3, v5, v6}, Lcom/appsflyer/internal/AFi1jSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v3

    const/16 v5, 0xc6

    aget-byte v5, v27, v5

    int-to-byte v5, v5

    const/16 v6, 0x319

    int-to-short v6, v6

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v11

    long-to-int v11, v11

    mul-int/lit16 v12, v7, 0x198

    const/16 v14, -0xcb4

    add-int/2addr v14, v12

    not-int v12, v7

    const/16 v25, 0x4

    xor-int/lit8 v15, v12, 0x4

    and-int/lit8 v42, v12, 0x4

    or-int v15, v15, v42

    not-int v15, v15

    or-int/lit8 v13, v11, 0x4

    not-int v13, v13

    xor-int v59, v15, v13

    and-int/2addr v13, v15

    or-int v13, v59, v13

    mul-int/lit16 v13, v13, -0x32e

    neg-int v13, v13

    neg-int v13, v13

    xor-int v15, v14, v13

    and-int/2addr v13, v14

    const/16 v32, 0x1

    shl-int/lit8 v13, v13, 0x1

    add-int/2addr v15, v13

    not-int v13, v11

    or-int/2addr v12, v13

    not-int v12, v12

    xor-int v13, v17, v7

    and-int v14, v17, v7

    or-int/2addr v13, v14

    not-int v13, v13

    or-int/2addr v12, v13

    const/16 v25, 0x4

    xor-int/lit8 v14, v11, 0x4

    and-int/lit8 v59, v11, 0x4

    or-int v14, v14, v59

    not-int v14, v14

    or-int/2addr v12, v14

    mul-int/lit16 v12, v12, 0x197

    neg-int v12, v12

    neg-int v12, v12

    and-int v14, v15, v12

    or-int/2addr v12, v15

    add-int/2addr v14, v12

    or-int v12, v17, v11

    not-int v12, v12

    or-int/2addr v12, v13

    xor-int v13, v7, v11

    and-int/2addr v11, v7

    or-int/2addr v11, v13

    not-int v11, v11

    xor-int v13, v12, v11

    and-int/2addr v11, v12

    or-int/2addr v11, v13

    mul-int/lit16 v11, v11, 0x197

    neg-int v11, v11

    neg-int v11, v11

    or-int v12, v14, v11

    const/16 v32, 0x1

    shl-int/lit8 v12, v12, 0x1

    xor-int/2addr v11, v14

    sub-int/2addr v12, v11

    int-to-byte v11, v12

    invoke-static {v5, v6, v11}, Lcom/appsflyer/internal/AFi1jSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x0

    new-array v11, v6, [Ljava/lang/Class;

    invoke-virtual {v3, v5, v11}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v3

    aget-byte v5, v27, v24

    int-to-byte v5, v5

    xor-int/lit16 v6, v5, 0x270

    and-int/lit16 v11, v5, 0x270

    or-int/2addr v6, v11

    int-to-short v6, v6

    and-int/lit16 v11, v6, 0x1dd

    int-to-byte v11, v11

    invoke-static {v5, v6, v11}, Lcom/appsflyer/internal/AFi1jSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v5

    filled-new-array {v9}, [Ljava/lang/Class;

    move-result-object v6

    invoke-virtual {v1, v5, v6}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1
    :try_end_69
    .catchall {:try_start_69 .. :try_end_69} :catchall_3d

    :try_start_6a
    filled-new-array {v2}, [Ljava/lang/Object;

    move-result-object v2

    const/16 v5, 0x26e

    aget-byte v5, v27, v5

    neg-int v5, v5

    int-to-byte v5, v5

    const/16 v6, 0x1b0

    int-to-short v11, v6

    aget-byte v6, v27, v36

    neg-int v6, v6

    int-to-byte v6, v6

    invoke-static {v5, v11, v6}, Lcom/appsflyer/internal/AFi1jSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v5

    aget-byte v6, v27, v34

    int-to-byte v6, v6

    xor-int/lit16 v11, v7, 0x188

    and-int/lit16 v12, v7, 0x188

    or-int/2addr v11, v12

    int-to-short v11, v11

    aget-byte v12, v27, v36

    neg-int v12, v12

    int-to-byte v12, v12

    invoke-static {v6, v11, v12}, Lcom/appsflyer/internal/AFi1jSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v6

    filled-new-array {v6}, [Ljava/lang/Class;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v5

    invoke-virtual {v5, v2}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2
    :try_end_6a
    .catchall {:try_start_6a .. :try_end_6a} :catchall_3f

    :try_start_6b
    const-class v5, Lcom/appsflyer/internal/AFi1jSDK;
    :try_end_6b
    .catchall {:try_start_6b .. :try_end_6b} :catchall_3d

    :try_start_6c
    const-class v6, Ljava/lang/Class;

    const/16 v11, 0x29e

    aget-byte v11, v27, v11

    int-to-byte v11, v11

    const/16 v12, 0x2d1

    int-to-short v12, v12

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v13

    long-to-int v13, v13

    mul-int/lit16 v14, v7, -0x397

    neg-int v14, v14

    neg-int v14, v14

    not-int v14, v14

    rsub-int v14, v14, -0xe5d

    not-int v15, v7

    xor-int v59, v17, v15

    and-int v62, v17, v15

    move/from16 v63, v14

    or-int v14, v59, v62

    move/from16 v59, v15

    or-int v15, v14, v13

    not-int v15, v15

    move/from16 v62, v15

    not-int v15, v13

    or-int v64, v59, v15

    move/from16 v65, v13

    const/16 v25, 0x4

    or-int/lit8 v13, v64, 0x4

    not-int v13, v13

    xor-int v64, v62, v13

    and-int v13, v62, v13

    or-int v13, v64, v13

    mul-int/lit16 v13, v13, 0x398

    add-int v13, v63, v13

    not-int v14, v14

    move/from16 v62, v13

    or-int v13, v17, v15

    not-int v13, v13

    xor-int v63, v14, v13

    and-int/2addr v13, v14

    or-int v13, v63, v13

    mul-int/lit16 v13, v13, 0x398

    or-int v14, v62, v13

    const/16 v32, 0x1

    shl-int/lit8 v14, v14, 0x1

    xor-int v13, v62, v13

    sub-int/2addr v14, v13

    xor-int v13, v17, v59

    and-int v59, v17, v59

    or-int v13, v13, v59

    xor-int v59, v13, v15

    and-int/2addr v13, v15

    or-int v13, v59, v13

    not-int v13, v13

    xor-int v15, v17, v7

    and-int v59, v17, v7

    or-int v15, v15, v59

    xor-int v59, v15, v65

    and-int v15, v15, v65

    or-int v15, v59, v15

    not-int v15, v15

    or-int/2addr v13, v15

    not-int v15, v7

    const/16 v25, 0x4

    xor-int/lit8 v59, v15, 0x4

    and-int/lit8 v15, v15, 0x4

    or-int v15, v59, v15

    or-int v15, v15, v65

    not-int v15, v15

    xor-int v59, v13, v15

    and-int/2addr v13, v15

    or-int v13, v59, v13

    mul-int/lit16 v13, v13, 0x398

    and-int v15, v14, v13

    or-int/2addr v13, v14

    add-int/2addr v15, v13

    int-to-byte v13, v15

    invoke-static {v11, v12, v13}, Lcom/appsflyer/internal/AFi1jSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v11

    const/4 v14, 0x0

    invoke-virtual {v6, v11, v14}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v6

    invoke-virtual {v6, v5, v14}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5
    :try_end_6c
    .catchall {:try_start_6c .. :try_end_6c} :catchall_3e

    const/16 v45, 0x2

    :try_start_6d
    aget-byte v6, v27, v45

    int-to-byte v6, v6

    xor-int/lit16 v11, v6, 0x303

    and-int/lit16 v12, v6, 0x303

    or-int/2addr v11, v12

    int-to-short v11, v11

    aget-byte v12, v27, v36

    neg-int v12, v12

    int-to-byte v12, v12

    invoke-static {v6, v11, v12}, Lcom/appsflyer/internal/AFi1jSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v6

    const/4 v11, 0x0

    new-array v12, v11, [Ljava/lang/Class;

    invoke-virtual {v6, v12}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v12

    new-array v13, v11, [Ljava/lang/Object;

    invoke-virtual {v12, v13}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    aget-byte v12, v27, v41

    int-to-byte v12, v12

    xor-int/lit16 v13, v12, 0x280

    and-int/lit16 v14, v12, 0x280

    or-int/2addr v13, v14

    int-to-short v13, v13

    xor-int/lit8 v14, v7, 0x14

    and-int/lit8 v15, v7, 0x14

    or-int/2addr v14, v15

    int-to-byte v14, v14

    invoke-static {v12, v13, v14}, Lcom/appsflyer/internal/AFi1jSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v12

    filled-new-array {v9, v8, v8}, [Ljava/lang/Class;

    move-result-object v8

    invoke-virtual {v6, v12, v8}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v8

    aget-byte v12, v27, v37

    int-to-byte v12, v12

    xor-int/lit16 v13, v12, 0x331

    and-int/lit16 v14, v12, 0x331

    or-int/2addr v13, v14

    int-to-short v13, v13

    xor-int/lit8 v14, v7, 0x11

    and-int/lit8 v15, v7, 0x11

    or-int/2addr v14, v15

    int-to-byte v14, v14

    invoke-static {v12, v13, v14}, Lcom/appsflyer/internal/AFi1jSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v12

    const/4 v13, 0x0

    new-array v14, v13, [Ljava/lang/Class;

    invoke-virtual {v6, v12, v14}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v6

    const/16 v12, 0xbf

    aget-byte v12, v27, v12

    int-to-byte v12, v12

    const/16 v13, 0x345

    int-to-short v13, v13

    aget-byte v14, v27, v36

    neg-int v14, v14

    int-to-byte v14, v14

    invoke-static {v12, v13, v14}, Lcom/appsflyer/internal/AFi1jSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v12

    invoke-static {v12}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v12

    aget-byte v13, v27, v41

    int-to-byte v13, v13

    xor-int/lit16 v14, v13, 0x159

    and-int/lit16 v15, v13, 0x159

    or-int/2addr v14, v15

    int-to-short v14, v14

    int-to-byte v7, v7

    invoke-static {v13, v14, v7}, Lcom/appsflyer/internal/AFi1jSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v7

    const/4 v13, 0x0

    new-array v14, v13, [Ljava/lang/Class;

    invoke-virtual {v12, v7, v14}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v7

    const/16 v12, 0x400

    new-array v12, v12, [B

    const/4 v13, 0x0

    :goto_35
    filled-new-array {v12}, [Ljava/lang/Object;

    move-result-object v14

    invoke-virtual {v1, v2, v14}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ljava/lang/Integer;

    invoke-virtual {v14}, Ljava/lang/Integer;->intValue()I

    move-result v15
    :try_end_6d
    .catchall {:try_start_6d .. :try_end_6d} :catchall_3d

    if-lez v15, :cond_41

    move-object/from16 v59, v9

    move-object/from16 v27, v10

    int-to-long v9, v13

    move-object/from16 v62, v1

    move-wide/from16 v63, v9

    const/4 v1, 0x0

    :try_start_6e
    new-array v9, v1, [Ljava/lang/Object;

    invoke-virtual {v3, v0, v9}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v9
    :try_end_6e
    .catchall {:try_start_6e .. :try_end_6e} :catchall_28

    cmp-long v1, v63, v9

    if-gez v1, :cond_40

    .line 32
    sget v1, Lcom/appsflyer/internal/AFi1jSDK;->$11:I

    add-int/lit8 v1, v1, 0x39

    rem-int/lit16 v1, v1, 0x80

    sput v1, Lcom/appsflyer/internal/AFi1jSDK;->$10:I

    const/16 v28, 0x0

    .line 33
    :try_start_6f
    invoke-static/range {v28 .. v28}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    filled-new-array {v12, v1, v14}, [Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v8, v11, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v9
    :try_end_6f
    .catchall {:try_start_6f .. :try_end_6f} :catchall_28

    long-to-int v1, v9

    mul-int/lit16 v9, v15, 0xec

    mul-int/lit16 v10, v13, 0x1d7

    neg-int v10, v10

    neg-int v10, v10

    or-int v14, v9, v10

    const/16 v32, 0x1

    shl-int/lit8 v14, v14, 0x1

    xor-int/2addr v9, v10

    sub-int/2addr v14, v9

    not-int v9, v15

    not-int v10, v1

    or-int/2addr v10, v9

    not-int v10, v10

    xor-int v63, v13, v10

    and-int/2addr v10, v13

    or-int v10, v63, v10

    mul-int/lit16 v10, v10, -0xeb

    neg-int v10, v10

    neg-int v10, v10

    and-int v63, v14, v10

    or-int/2addr v10, v14

    add-int v63, v63, v10

    xor-int v10, v9, v1

    and-int v14, v9, v1

    or-int/2addr v10, v14

    not-int v10, v10

    xor-int v14, v13, v10

    and-int/2addr v10, v13

    or-int/2addr v10, v14

    mul-int/lit16 v10, v10, -0x1d6

    xor-int v14, v63, v10

    and-int v10, v63, v10

    const/16 v32, 0x1

    shl-int/lit8 v10, v10, 0x1

    add-int/2addr v14, v10

    not-int v10, v13

    xor-int v63, v10, v15

    and-int/2addr v10, v15

    or-int v10, v63, v10

    not-int v10, v10

    or-int/2addr v9, v13

    xor-int v13, v9, v1

    and-int/2addr v1, v9

    or-int/2addr v1, v13

    not-int v1, v1

    xor-int v9, v10, v1

    and-int/2addr v1, v10

    or-int/2addr v1, v9

    mul-int/lit16 v1, v1, 0xeb

    or-int v9, v14, v1

    const/16 v32, 0x1

    shl-int/lit8 v9, v9, 0x1

    xor-int/2addr v1, v14

    sub-int v13, v9, v1

    move-object/from16 v10, v27

    move-object/from16 v9, v59

    move-object/from16 v1, v62

    goto/16 :goto_35

    :catchall_28
    move-exception v0

    move-object v1, v0

    move-object/from16 v7, v27

    goto/16 :goto_31

    :cond_40
    :goto_36
    const/4 v3, 0x0

    goto :goto_37

    :cond_41
    move-object/from16 v59, v9

    move-object/from16 v27, v10

    goto :goto_36

    :goto_37
    :try_start_70
    new-array v0, v3, [Ljava/lang/Object;

    invoke-virtual {v6, v11, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B
    :try_end_70
    .catchall {:try_start_70 .. :try_end_70} :catchall_39

    :try_start_71
    new-array v1, v3, [Ljava/lang/Object;

    invoke-virtual {v7, v2, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    new-array v1, v3, [Ljava/lang/Object;

    invoke-virtual {v7, v11, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_71
    .catch Ljava/lang/Exception; {:try_start_71 .. :try_end_71} :catch_c
    .catchall {:try_start_71 .. :try_end_71} :catchall_28

    :catch_c
    :try_start_72
    sget-object v1, Lcom/appsflyer/internal/AFi1jSDK;->$$a:[B

    const/16 v2, 0x2ff

    aget-byte v2, v1, v2
    :try_end_72
    .catchall {:try_start_72 .. :try_end_72} :catchall_39

    int-to-byte v2, v2

    const/16 v3, 0x355

    int-to-short v3, v3

    const/16 v19, 0x1aa

    :try_start_73
    aget-byte v6, v1, v19
    :try_end_73
    .catchall {:try_start_73 .. :try_end_73} :catchall_3a

    int-to-byte v6, v6

    :try_start_74
    invoke-static {v2, v3, v6}, Lcom/appsflyer/internal/AFi1jSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v2

    aget-byte v3, v1, v34

    int-to-byte v3, v3

    const/16 v6, 0x378

    int-to-short v6, v6

    aget-byte v7, v1, v36

    neg-int v7, v7

    int-to-byte v7, v7

    invoke-static {v3, v6, v7}, Lcom/appsflyer/internal/AFi1jSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v3

    aget-byte v7, v1, v21

    int-to-byte v7, v7

    const/16 v8, 0x38a

    int-to-short v8, v8

    aget-byte v9, v1, v36

    neg-int v9, v9

    int-to-byte v9, v9

    invoke-static {v7, v8, v9}, Lcom/appsflyer/internal/AFi1jSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v7

    filled-new-array {v3, v7}, [Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v2
    :try_end_74
    .catchall {:try_start_74 .. :try_end_74} :catchall_39

    :try_start_75
    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    aget-byte v3, v1, v34

    int-to-byte v3, v3

    aget-byte v7, v1, v36

    neg-int v7, v7

    int-to-byte v7, v7

    invoke-static {v3, v6, v7}, Lcom/appsflyer/internal/AFi1jSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v3

    aget-byte v6, v1, v24

    int-to-byte v6, v6

    const/16 v7, 0x39e

    int-to-short v7, v7

    sget v8, Lcom/appsflyer/internal/AFi1jSDK;->$$b:I

    xor-int/lit8 v9, v8, 0x14

    and-int/lit8 v10, v8, 0x14

    or-int/2addr v9, v10

    int-to-byte v9, v9

    invoke-static {v6, v7, v9}, Lcom/appsflyer/internal/AFi1jSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v6

    filled-new-array/range {v59 .. v59}, [Ljava/lang/Class;

    move-result-object v7

    invoke-virtual {v3, v6, v7}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v3

    const/4 v14, 0x0

    invoke-virtual {v3, v14, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_75
    .catchall {:try_start_75 .. :try_end_75} :catchall_3c

    :try_start_76
    filled-new-array {v0, v5}, [Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_76
    .catchall {:try_start_76 .. :try_end_76} :catchall_39

    const/16 v2, 0xaa

    :try_start_77
    aget-byte v2, v1, v2
    :try_end_77
    .catch Ljava/lang/Exception; {:try_start_77 .. :try_end_77} :catch_11
    .catchall {:try_start_77 .. :try_end_77} :catchall_39

    int-to-byte v2, v2

    const/16 v3, 0x3a1

    int-to-short v3, v3

    const/16 v19, 0x1aa

    :try_start_78
    aget-byte v6, v1, v19
    :try_end_78
    .catch Ljava/lang/Exception; {:try_start_78 .. :try_end_78} :catch_12
    .catchall {:try_start_78 .. :try_end_78} :catchall_3a

    int-to-byte v6, v6

    :try_start_79
    invoke-static {v2, v3, v6}, Lcom/appsflyer/internal/AFi1jSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v2
    :try_end_79
    .catch Ljava/lang/Exception; {:try_start_79 .. :try_end_79} :catch_11
    .catchall {:try_start_79 .. :try_end_79} :catchall_39

    const/16 v44, 0x5

    :try_start_7a
    aget-byte v3, v1, v44

    int-to-byte v3, v3

    const/16 v6, 0x3c0

    int-to-short v6, v6

    const/16 v7, 0x2eb

    aget-byte v7, v1, v7

    neg-int v7, v7

    int-to-byte v7, v7

    invoke-static {v3, v6, v7}, Lcom/appsflyer/internal/AFi1jSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v2

    const/4 v11, 0x1

    invoke-virtual {v2, v11}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    invoke-virtual {v2, v5}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v6

    aget-byte v7, v1, v26

    neg-int v7, v7

    int-to-byte v7, v7

    xor-int/lit16 v9, v8, 0x385

    and-int/lit16 v10, v8, 0x385

    or-int/2addr v9, v10

    int-to-short v9, v9

    const/16 v10, 0x46b

    aget-byte v10, v1, v10

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v11

    long-to-int v11, v11

    mul-int/lit8 v12, v10, -0x45

    const/16 v13, 0x47

    add-int/2addr v13, v12

    or-int v12, v29, v10

    not-int v12, v12

    or-int v14, v10, v11

    not-int v14, v14

    xor-int v15, v12, v14

    and-int/2addr v12, v14

    or-int/2addr v12, v15

    mul-int/lit16 v12, v12, -0x8c

    neg-int v12, v12

    neg-int v12, v12

    xor-int v14, v13, v12

    and-int/2addr v12, v13

    const/16 v32, 0x1

    shl-int/lit8 v12, v12, 0x1

    add-int/2addr v14, v12

    xor-int/lit8 v12, v10, 0x1

    and-int/lit8 v13, v10, 0x1

    or-int/2addr v12, v13

    xor-int v13, v12, v11

    and-int/2addr v12, v11

    or-int/2addr v12, v13

    not-int v12, v12

    mul-int/lit8 v12, v12, 0x46

    or-int v13, v14, v12

    shl-int/lit8 v13, v13, 0x1

    xor-int/2addr v12, v14

    sub-int/2addr v13, v12

    const/4 v12, -0x2

    xor-int v14, v12, v10

    and-int/2addr v12, v10

    or-int/2addr v12, v14

    not-int v12, v12

    not-int v10, v10

    or-int/lit8 v10, v10, 0x1

    not-int v10, v10

    xor-int v14, v12, v10

    and-int/2addr v10, v12

    or-int/2addr v10, v14

    xor-int/lit8 v12, v11, 0x1

    and-int/lit8 v11, v11, 0x1

    or-int/2addr v11, v12

    not-int v11, v11

    xor-int v12, v10, v11

    and-int/2addr v10, v11

    or-int/2addr v10, v12

    mul-int/lit8 v10, v10, 0x46

    neg-int v10, v10

    neg-int v10, v10

    not-int v10, v10

    sub-int/2addr v13, v10

    const/4 v11, 0x1

    sub-int/2addr v13, v11

    int-to-byte v10, v13

    invoke-static {v7, v9, v10}, Lcom/appsflyer/internal/AFi1jSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v7

    invoke-virtual {v7, v11}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    const/16 v9, 0x1c3

    aget-byte v9, v1, v9

    int-to-byte v9, v9

    xor-int/lit16 v10, v9, 0x3c6

    and-int/lit16 v11, v9, 0x3c6

    or-int/2addr v10, v11

    int-to-short v10, v10

    const/16 v11, 0x46b

    aget-byte v11, v1, v11

    const/4 v12, 0x1

    add-int/2addr v11, v12

    int-to-byte v11, v11

    invoke-static {v9, v10, v11}, Lcom/appsflyer/internal/AFi1jSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v6, v9}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v6

    invoke-virtual {v6, v12}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    invoke-virtual {v7, v3}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    invoke-virtual {v6, v3}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v2, v0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    new-instance v10, Ljava/util/ArrayList;

    check-cast v9, Ljava/util/List;

    invoke-direct {v10, v9}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v9
    :try_end_7a
    .catch Ljava/lang/Exception; {:try_start_7a .. :try_end_7a} :catch_d
    .catchall {:try_start_7a .. :try_end_7a} :catchall_37

    .line 34
    sget v11, Lcom/appsflyer/internal/AFi1jSDK;->$11:I

    and-int/lit8 v12, v11, 0x7

    or-int/lit8 v11, v11, 0x7

    add-int/2addr v12, v11

    rem-int/lit16 v12, v12, 0x80

    sput v12, Lcom/appsflyer/internal/AFi1jSDK;->$10:I

    .line 35
    :try_start_7b
    const-class v11, Ljava/lang/Class;

    const/16 v12, 0x47e

    aget-byte v1, v1, v12

    int-to-byte v1, v1

    xor-int/lit16 v12, v8, 0x3b4

    and-int/lit16 v8, v8, 0x3b4

    or-int/2addr v8, v12

    int-to-short v8, v8

    and-int/lit8 v12, v8, 0x4f

    int-to-byte v12, v12

    invoke-static {v1, v8, v12}, Lcom/appsflyer/internal/AFi1jSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v1

    const/4 v14, 0x0

    invoke-virtual {v11, v1, v14}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    invoke-virtual {v1, v9, v14}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Class;
    :try_end_7b
    .catchall {:try_start_7b .. :try_end_7b} :catchall_38

    :try_start_7c
    invoke-static {v3}, Ljava/lang/reflect/Array;->getLength(Ljava/lang/Object;)I

    move-result v8

    invoke-static {v1, v8}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;I)Ljava/lang/Object;

    move-result-object v1
    :try_end_7c
    .catch Ljava/lang/Exception; {:try_start_7c .. :try_end_7c} :catch_d
    .catchall {:try_start_7c .. :try_end_7c} :catchall_37

    const/4 v9, 0x0

    :goto_38
    if-ge v9, v8, :cond_42

    :try_start_7d
    invoke-static {v3, v9}, Ljava/lang/reflect/Array;->get(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v11

    invoke-static {v1, v9, v11}, Ljava/lang/reflect/Array;->set(Ljava/lang/Object;ILjava/lang/Object;)V
    :try_end_7d
    .catch Ljava/lang/Exception; {:try_start_7d .. :try_end_7d} :catch_d
    .catchall {:try_start_7d .. :try_end_7d} :catchall_29

    or-int/lit8 v11, v9, 0x7d

    const/16 v32, 0x1

    shl-int/lit8 v11, v11, 0x1

    xor-int/lit8 v9, v9, 0x7d

    sub-int/2addr v11, v9

    and-int/lit8 v9, v11, -0x7c

    or-int/lit8 v11, v11, -0x7c

    add-int/2addr v9, v11

    goto :goto_38

    :catchall_29
    move-exception v0

    move-object v1, v0

    move-object/from16 v7, v27

    move-object/from16 v8, v58

    const/16 v19, 0x1aa

    const/16 v25, 0x4

    goto/16 :goto_4f

    :catch_d
    move-exception v0

    move-object/from16 v7, v27

    move-object/from16 v8, v58

    const/16 v19, 0x1aa

    const/16 v25, 0x4

    goto/16 :goto_45

    :cond_42
    :try_start_7e
    invoke-virtual {v7, v2, v10}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v6, v2, v1}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_7e
    .catch Ljava/lang/Exception; {:try_start_7e .. :try_end_7e} :catch_d
    .catchall {:try_start_7e .. :try_end_7e} :catchall_37

    :try_start_7f
    sget-object v1, Lcom/appsflyer/internal/AFi1jSDK;->i:Ljava/lang/Object;
    :try_end_7f
    .catchall {:try_start_7f .. :try_end_7f} :catchall_37

    if-nez v1, :cond_43

    :try_start_80
    sput-object v0, Lcom/appsflyer/internal/AFi1jSDK;->i:Ljava/lang/Object;
    :try_end_80
    .catchall {:try_start_80 .. :try_end_80} :catchall_29

    :cond_43
    move-object v1, v0

    :goto_39
    if-eqz v35, :cond_46

    .line 36
    :try_start_81
    sget-object v0, Lcom/appsflyer/internal/AFi1jSDK;->$$a:[B

    aget-byte v2, v0, v21
    :try_end_81
    .catchall {:try_start_81 .. :try_end_81} :catchall_2f

    int-to-byte v2, v2

    const/16 v3, 0x2a4

    int-to-short v3, v3

    const/16 v19, 0x1aa

    :try_start_82
    aget-byte v5, v0, v19

    int-to-byte v5, v5

    invoke-static {v2, v3, v5}, Lcom/appsflyer/internal/AFi1jSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v2

    aget-byte v3, v0, v40

    int-to-byte v3, v3

    xor-int/lit16 v5, v3, 0x401

    and-int/lit16 v6, v3, 0x401

    or-int/2addr v5, v6

    int-to-short v5, v5

    sget v6, Lcom/appsflyer/internal/AFi1jSDK;->$$b:I

    const/16 v13, 0x9

    xor-int/lit8 v7, v6, 0x9

    and-int/lit8 v8, v6, 0x9

    or-int/2addr v7, v8

    int-to-byte v7, v7

    invoke-static {v3, v5, v7}, Lcom/appsflyer/internal/AFi1jSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v3

    aget-byte v5, v0, v21

    int-to-byte v5, v5

    const/16 v7, 0x38a

    int-to-short v7, v7

    aget-byte v8, v0, v36

    neg-int v8, v8

    int-to-byte v8, v8

    invoke-static {v5, v7, v8}, Lcom/appsflyer/internal/AFi1jSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v5
    :try_end_82
    .catchall {:try_start_82 .. :try_end_82} :catchall_2e

    move-object/from16 v7, v27

    :try_start_83
    filled-new-array {v7, v5}, [Ljava/lang/Class;

    move-result-object v5

    invoke-virtual {v2, v3, v5}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v3

    const/4 v11, 0x1

    invoke-virtual {v3, v11}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    const-class v5, Lcom/appsflyer/internal/AFi1jSDK;
    :try_end_83
    .catchall {:try_start_83 .. :try_end_83} :catchall_2d

    :try_start_84
    const-class v8, Ljava/lang/Class;

    const/16 v9, 0x29e

    aget-byte v9, v0, v9
    :try_end_84
    .catchall {:try_start_84 .. :try_end_84} :catchall_2c

    int-to-byte v9, v9

    const/16 v10, 0x2d1

    int-to-short v10, v10

    const/16 v25, 0x4

    xor-int/lit8 v11, v6, 0x4

    and-int/lit8 v12, v6, 0x4

    const/16 v32, 0x1

    shl-int/lit8 v12, v12, 0x1

    add-int/2addr v11, v12

    int-to-byte v11, v11

    :try_start_85
    invoke-static {v9, v10, v11}, Lcom/appsflyer/internal/AFi1jSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v9

    const/4 v14, 0x0

    invoke-virtual {v8, v9, v14}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v8

    invoke-virtual {v8, v5, v14}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5
    :try_end_85
    .catchall {:try_start_85 .. :try_end_85} :catchall_2b

    :try_start_86
    filled-new-array {v4, v5}, [Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v3, v1, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    if-eqz v3, :cond_44

    aget-byte v0, v0, v41

    int-to-byte v0, v0

    xor-int/lit16 v4, v0, 0x159

    and-int/lit16 v5, v0, 0x159

    or-int/2addr v4, v5

    int-to-short v4, v4

    int-to-byte v5, v6

    invoke-static {v0, v4, v5}, Lcom/appsflyer/internal/AFi1jSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v0

    const/4 v5, 0x0

    new-array v4, v5, [Ljava/lang/Class;

    invoke-virtual {v2, v0, v4}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    new-array v2, v5, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_3b

    :catchall_2a
    move-exception v0

    :goto_3a
    move-object v1, v0

    move-object/from16 v8, v58

    goto/16 :goto_4f

    :cond_44
    :goto_3b
    move-object v0, v3

    const/16 v13, 0x9

    goto :goto_3e

    :catchall_2b
    move-exception v0

    goto :goto_3c

    :catchall_2c
    move-exception v0

    const/16 v25, 0x4

    :goto_3c
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_45

    throw v1

    :cond_45
    throw v0
    :try_end_86
    .catchall {:try_start_86 .. :try_end_86} :catchall_2a

    :catchall_2d
    move-exception v0

    :goto_3d
    const/16 v25, 0x4

    goto :goto_3a

    :catchall_2e
    move-exception v0

    move-object/from16 v7, v27

    goto :goto_3d

    :catchall_2f
    move-exception v0

    move-object/from16 v7, v27

    const/16 v19, 0x1aa

    goto :goto_3d

    :cond_46
    move-object/from16 v7, v27

    const/16 v19, 0x1aa

    const/16 v25, 0x4

    :try_start_87
    sget-object v0, Lcom/appsflyer/internal/AFi1jSDK;->$$a:[B

    aget-byte v2, v0, v21

    int-to-byte v2, v2

    const/16 v3, 0x38a

    int-to-short v3, v3

    aget-byte v5, v0, v36

    neg-int v5, v5

    int-to-byte v5, v5

    invoke-static {v2, v3, v5}, Lcom/appsflyer/internal/AFi1jSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v2

    aget-byte v0, v0, v40

    int-to-byte v0, v0

    or-int/lit16 v3, v0, 0x401

    int-to-short v3, v3

    sget v5, Lcom/appsflyer/internal/AFi1jSDK;->$$b:I

    const/16 v13, 0x9

    xor-int/lit8 v6, v5, 0x9

    and-int/2addr v5, v13

    or-int/2addr v5, v6

    int-to-byte v5, v5

    invoke-static {v0, v3, v5}, Lcom/appsflyer/internal/AFi1jSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v0

    filled-new-array {v7}, [Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v2, v0, v3}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0
    :try_end_87
    .catchall {:try_start_87 .. :try_end_87} :catchall_35

    const/4 v11, 0x1

    :try_start_88
    invoke-virtual {v0, v11}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    filled-new-array {v4}, [Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_88
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_88 .. :try_end_88} :catch_e
    .catchall {:try_start_88 .. :try_end_88} :catchall_2a

    goto :goto_3e

    :catch_e
    move-exception v0

    :try_start_89
    invoke-virtual {v0}, Ljava/lang/reflect/InvocationTargetException;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    check-cast v0, Ljava/lang/Exception;

    throw v0
    :try_end_89
    .catch Ljava/lang/ClassNotFoundException; {:try_start_89 .. :try_end_89} :catch_f
    .catchall {:try_start_89 .. :try_end_89} :catchall_2a

    :catch_f
    const/4 v0, 0x0

    :goto_3e
    if-eqz v0, :cond_4b

    :try_start_8a
    move-object v6, v0

    check-cast v6, Ljava/lang/Class;

    sget-object v0, Lcom/appsflyer/internal/AFi1jSDK;->$$a:[B

    const/16 v2, 0x388

    aget-byte v2, v0, v2

    int-to-byte v2, v2

    const/16 v3, 0x411

    int-to-short v3, v3

    sget v4, Lcom/appsflyer/internal/AFi1jSDK;->$$b:I

    int-to-byte v5, v4

    invoke-static {v2, v3, v5}, Lcom/appsflyer/internal/AFi1jSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v2

    const-class v3, Ljava/lang/Object;

    sget-object v5, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    filled-new-array {v3, v5}, [Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v6, v3}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v3

    const/4 v11, 0x1

    invoke-virtual {v3, v11}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    xor-int/lit8 v5, v35, 0x1

    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5

    filled-new-array {v1, v5}, [Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    sput-object v1, Lcom/appsflyer/internal/AFi1jSDK;->e:Ljava/lang/Object;

    const/16 v1, 0xc46

    new-array v1, v1, [B

    const/16 v3, 0x66

    aget-byte v3, v0, v3

    int-to-byte v3, v3

    xor-int/lit16 v5, v3, 0x401

    and-int/lit16 v8, v3, 0x401

    or-int/2addr v5, v8

    int-to-short v5, v5

    aget-byte v8, v0, v33

    int-to-byte v8, v8

    invoke-static {v3, v5, v8}, Lcom/appsflyer/internal/AFi1jSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v3

    const/4 v11, 0x1

    invoke-virtual {v3, v11}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v3
    :try_end_8a
    .catchall {:try_start_8a .. :try_end_8a} :catchall_35

    move-object/from16 v8, v58

    :try_start_8b
    invoke-virtual {v8, v3}, Ljava/util/zip/ZipFile;->getEntry(Ljava/lang/String;)Ljava/util/zip/ZipEntry;

    move-result-object v3

    invoke-virtual {v8, v3}, Ljava/util/zip/ZipFile;->getInputStream(Ljava/util/zip/ZipEntry;)Ljava/io/InputStream;

    move-result-object v3
    :try_end_8b
    .catchall {:try_start_8b .. :try_end_8b} :catchall_30

    :try_start_8c
    filled-new-array {v3}, [Ljava/lang/Object;

    move-result-object v3

    const/16 v5, 0x26e

    aget-byte v5, v0, v5

    neg-int v5, v5

    int-to-byte v5, v5

    const/16 v9, 0x1b0

    int-to-short v10, v9

    aget-byte v9, v0, v36

    neg-int v9, v9

    int-to-byte v9, v9

    invoke-static {v5, v10, v9}, Lcom/appsflyer/internal/AFi1jSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v5

    aget-byte v9, v0, v34

    int-to-byte v9, v9

    xor-int/lit16 v10, v4, 0x188

    and-int/lit16 v11, v4, 0x188

    or-int/2addr v10, v11

    int-to-short v10, v10

    aget-byte v11, v0, v36

    neg-int v11, v11

    int-to-byte v11, v11

    invoke-static {v9, v10, v11}, Lcom/appsflyer/internal/AFi1jSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v9

    filled-new-array {v9}, [Ljava/lang/Class;

    move-result-object v9

    invoke-virtual {v5, v9}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v5

    invoke-virtual {v5, v3}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3
    :try_end_8c
    .catchall {:try_start_8c .. :try_end_8c} :catchall_34

    :try_start_8d
    filled-new-array {v3}, [Ljava/lang/Object;

    move-result-object v3

    aget-byte v5, v0, v38

    int-to-byte v5, v5

    const/16 v9, 0x1dc

    int-to-short v9, v9

    aget-byte v10, v0, v36

    neg-int v10, v10

    int-to-byte v10, v10

    invoke-static {v5, v9, v10}, Lcom/appsflyer/internal/AFi1jSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v5

    aget-byte v10, v0, v34

    int-to-byte v10, v10

    xor-int/lit16 v11, v4, 0x188

    and-int/lit16 v12, v4, 0x188

    or-int/2addr v11, v12

    int-to-short v11, v11

    aget-byte v12, v0, v36

    neg-int v12, v12

    int-to-byte v12, v12

    invoke-static {v10, v11, v12}, Lcom/appsflyer/internal/AFi1jSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v10

    filled-new-array {v10}, [Ljava/lang/Class;

    move-result-object v10

    invoke-virtual {v5, v10}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v5

    invoke-virtual {v5, v3}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3
    :try_end_8d
    .catchall {:try_start_8d .. :try_end_8d} :catchall_33

    :try_start_8e
    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v5

    aget-byte v10, v0, v38

    int-to-byte v10, v10

    aget-byte v11, v0, v36

    neg-int v11, v11

    int-to-byte v11, v11

    invoke-static {v10, v9, v11}, Lcom/appsflyer/internal/AFi1jSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v10

    aget-byte v11, v0, v40

    int-to-byte v11, v11

    const/16 v12, 0x1b0

    or-int/lit16 v14, v4, 0x1b0

    int-to-short v14, v14

    const/16 v15, 0x475

    aget-byte v15, v0, v15

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v12

    long-to-int v12, v12

    mul-int/lit16 v13, v15, 0x173

    neg-int v13, v13

    neg-int v13, v13

    const/16 v27, 0x173

    xor-int v57, v27, v13

    and-int v13, v27, v13

    const/16 v32, 0x1

    shl-int/lit8 v13, v13, 0x1

    add-int v57, v57, v13

    not-int v13, v15

    move-object/from16 v27, v1

    not-int v1, v12

    xor-int v58, v13, v1

    and-int/2addr v1, v13

    or-int v1, v58, v1

    not-int v1, v1

    const/16 v58, -0x2

    or-int v13, v58, v12

    not-int v13, v13

    or-int/2addr v1, v13

    mul-int/lit16 v1, v1, -0x172

    add-int v57, v57, v1

    not-int v1, v12

    xor-int v13, v58, v1

    and-int v1, v58, v1

    or-int/2addr v1, v13

    not-int v1, v1

    not-int v13, v15

    xor-int v58, v13, v12

    and-int/2addr v12, v13

    or-int v12, v58, v12

    not-int v12, v12

    or-int/2addr v1, v12

    const/16 v32, 0x1

    xor-int/lit8 v12, v15, 0x1

    and-int/lit8 v13, v15, 0x1

    or-int/2addr v12, v13

    not-int v13, v12

    or-int/2addr v1, v13

    mul-int/lit16 v1, v1, -0x172

    xor-int v13, v57, v1

    and-int v1, v57, v1

    shl-int/lit8 v1, v1, 0x1

    add-int/2addr v13, v1

    not-int v1, v12

    mul-int/lit16 v1, v1, 0x172

    neg-int v1, v1

    neg-int v1, v1

    and-int v12, v13, v1

    or-int/2addr v1, v13

    add-int/2addr v12, v1

    int-to-byte v1, v12

    invoke-static {v11, v14, v1}, Lcom/appsflyer/internal/AFi1jSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v1

    filled-new-array/range {v59 .. v59}, [Ljava/lang/Class;

    move-result-object v11

    invoke-virtual {v10, v1, v11}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    invoke-virtual {v1, v3, v5}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_8e
    .catchall {:try_start_8e .. :try_end_8e} :catchall_32

    :try_start_8f
    aget-byte v1, v0, v38

    int-to-byte v1, v1

    aget-byte v5, v0, v36

    neg-int v5, v5

    int-to-byte v5, v5

    invoke-static {v1, v9, v5}, Lcom/appsflyer/internal/AFi1jSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    aget-byte v0, v0, v41

    int-to-byte v0, v0

    xor-int/lit16 v5, v0, 0x159

    and-int/lit16 v9, v0, 0x159

    or-int/2addr v5, v9

    int-to-short v5, v5

    int-to-byte v4, v4

    invoke-static {v0, v5, v4}, Lcom/appsflyer/internal/AFi1jSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v0

    const/4 v14, 0x0

    invoke-virtual {v1, v0, v14}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    invoke-virtual {v0, v3, v14}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_8f
    .catchall {:try_start_8f .. :try_end_8f} :catchall_31

    :try_start_90
    invoke-static/range {v56 .. v56}, Ljava/lang/Math;->abs(I)I

    move-result v1

    const/16 v0, 0xc0e

    move-object v4, v2

    move-object v10, v7

    move-object v3, v8

    move-object/from16 v2, v27

    move/from16 v14, v54

    move/from16 v15, v55

    move-object/from16 v27, v59

    move-object/from16 v11, v60

    move/from16 v12, v61

    const/16 v28, 0x0

    goto/16 :goto_24

    :catchall_30
    move-exception v0

    :goto_3f
    move-object v1, v0

    goto/16 :goto_4f

    :catchall_31
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_47

    throw v1

    :cond_47
    throw v0

    :catchall_32
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_48

    throw v1

    :cond_48
    throw v0

    :catchall_33
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_49

    throw v1

    :cond_49
    throw v0

    :catchall_34
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_4a

    throw v1

    :cond_4a
    throw v0

    :catchall_35
    move-exception v0

    move-object/from16 v8, v58

    goto :goto_3f

    :cond_4b
    move-object/from16 v8, v58

    const-class v0, Ljava/lang/Object;

    sget-object v2, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    filled-new-array {v0, v2}, [Ljava/lang/Class;

    move-result-object v0

    move-object/from16 v6, v57

    invoke-virtual {v6, v0}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v0

    const/4 v11, 0x1

    invoke-virtual {v0, v11}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    xor-int/lit8 v2, v35, 0x1

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    filled-new-array {v1, v2}, [Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    sput-object v0, Lcom/appsflyer/internal/AFi1jSDK;->e:Ljava/lang/Object;
    :try_end_90
    .catchall {:try_start_90 .. :try_end_90} :catchall_30

    :try_start_91
    invoke-virtual {v8}, Ljava/util/zip/ZipFile;->close()V
    :try_end_91
    .catchall {:try_start_91 .. :try_end_91} :catchall_36

    move/from16 v2, v43

    const/4 v3, 0x2

    const/16 v6, 0x124

    const/4 v14, 0x1

    const/16 v28, 0x0

    const/16 v46, 0x0

    goto/16 :goto_5a

    :catchall_36
    move-exception v0

    :goto_40
    const/16 v32, 0x1

    goto/16 :goto_54

    :catchall_37
    move-exception v0

    move-object/from16 v7, v27

    move-object/from16 v8, v58

    const/16 v19, 0x1aa

    const/16 v25, 0x4

    goto :goto_3f

    :catchall_38
    move-exception v0

    move-object/from16 v7, v27

    move-object/from16 v8, v58

    const/16 v19, 0x1aa

    const/16 v25, 0x4

    .line 37
    :try_start_92
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_4c

    throw v1

    :catch_10
    move-exception v0

    goto :goto_45

    :cond_4c
    throw v0
    :try_end_92
    .catch Ljava/lang/Exception; {:try_start_92 .. :try_end_92} :catch_10
    .catchall {:try_start_92 .. :try_end_92} :catchall_30

    :catchall_39
    move-exception v0

    move-object/from16 v7, v27

    :goto_41
    move-object/from16 v8, v58

    const/16 v19, 0x1aa

    :goto_42
    const/16 v25, 0x4

    :goto_43
    const/16 v44, 0x5

    goto/16 :goto_3f

    :catch_11
    move-exception v0

    move-object/from16 v7, v27

    move-object/from16 v8, v58

    const/16 v19, 0x1aa

    :goto_44
    const/16 v25, 0x4

    const/16 v44, 0x5

    goto :goto_45

    :catchall_3a
    move-exception v0

    move-object/from16 v7, v27

    move-object/from16 v8, v58

    goto :goto_42

    :catch_12
    move-exception v0

    move-object/from16 v7, v27

    move-object/from16 v8, v58

    goto :goto_44

    :goto_45
    :try_start_93
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lcom/appsflyer/internal/AFi1jSDK;->$$a:[B

    aget-byte v3, v2, v41

    int-to-byte v3, v3

    or-int/lit16 v4, v3, 0x401

    int-to-short v4, v4

    aget-byte v6, v2, v16

    int-to-byte v6, v6

    invoke-static {v3, v4, v6}, Lcom/appsflyer/internal/AFi1jSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    aget-byte v3, v2, v43

    int-to-byte v3, v3

    const/16 v6, 0x124

    xor-int/lit16 v4, v3, 0x124

    and-int/lit16 v5, v3, 0x124

    or-int/2addr v4, v5

    int-to-short v4, v4

    aget-byte v5, v2, v40

    int-to-byte v5, v5

    invoke-static {v3, v4, v5}, Lcom/appsflyer/internal/AFi1jSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1
    :try_end_93
    .catchall {:try_start_93 .. :try_end_93} :catchall_30

    const/4 v3, 0x2

    :try_start_94
    new-array v4, v3, [Ljava/lang/Object;

    const/16 v32, 0x1

    aput-object v0, v4, v32

    const/16 v28, 0x0

    aput-object v1, v4, v28

    aget-byte v0, v2, v34

    int-to-byte v0, v0

    const/16 v6, 0x124

    int-to-short v1, v6

    aget-byte v2, v2, v36

    neg-int v2, v2

    int-to-byte v2, v2

    invoke-static {v0, v1, v2}, Lcom/appsflyer/internal/AFi1jSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    const-class v1, Ljava/lang/Throwable;

    filled-new-array {v7, v1}, [Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Throwable;

    throw v0
    :try_end_94
    .catchall {:try_start_94 .. :try_end_94} :catchall_3b

    :catchall_3b
    move-exception v0

    :try_start_95
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_4d

    throw v1

    :cond_4d
    throw v0

    :catchall_3c
    move-exception v0

    move-object/from16 v7, v27

    move-object/from16 v8, v58

    const/16 v19, 0x1aa

    const/16 v25, 0x4

    const/16 v44, 0x5

    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_4e

    throw v1

    :cond_4e
    throw v0

    :catchall_3d
    move-exception v0

    move-object/from16 v59, v9

    move-object v7, v10

    goto/16 :goto_41

    :catchall_3e
    move-exception v0

    move-object/from16 v59, v9

    move-object v7, v10

    move-object/from16 v8, v58

    const/16 v19, 0x1aa

    const/16 v25, 0x4

    const/16 v44, 0x5

    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_4f

    throw v1

    :cond_4f
    throw v0

    :catchall_3f
    move-exception v0

    move-object/from16 v59, v9

    move-object v7, v10

    move-object/from16 v8, v58

    const/16 v19, 0x1aa

    const/16 v25, 0x4

    const/16 v44, 0x5

    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_50

    throw v1

    :cond_50
    throw v0

    :catchall_40
    move-exception v0

    move-object v8, v3

    move-object/from16 v59, v9

    move-object v7, v10

    move/from16 v55, v15

    const/16 v19, 0x1aa

    const/16 v25, 0x4

    const/16 v30, 0x10

    goto/16 :goto_43

    :catchall_41
    move-exception v0

    move-object v8, v3

    move-object/from16 v59, v9

    move-object v7, v10

    :goto_46
    move/from16 v55, v15

    const/16 v19, 0x1aa

    const/16 v25, 0x4

    const/16 v30, 0x10

    :goto_47
    const/16 v44, 0x5

    goto :goto_49

    :catchall_42
    move-exception v0

    move-object v8, v3

    move-object/from16 v59, v9

    move-object v7, v10

    move/from16 v54, v14

    goto :goto_46

    :catchall_43
    move-exception v0

    move-object v8, v3

    move-object/from16 v59, v9

    move-object v7, v10

    move/from16 v54, v14

    move/from16 v55, v15

    const/16 v19, 0x1aa

    const/16 v25, 0x4

    :goto_48
    const/16 v30, 0x10

    const/16 v31, 0x3

    goto :goto_47

    :catchall_44
    move-exception v0

    move-object v8, v3

    move-object/from16 v59, v9

    move-object v7, v10

    move/from16 v25, v11

    move/from16 v54, v14

    move/from16 v55, v15

    const/16 v19, 0x1aa

    goto :goto_48

    .line 38
    :goto_49
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_51

    throw v1

    :cond_51
    throw v0

    :catchall_45
    move-exception v0

    move-object v8, v3

    move-object/from16 v59, v9

    move-object v7, v10

    move/from16 v54, v14

    move/from16 v55, v15

    const/16 v19, 0x1aa

    const/16 v25, 0x4

    const/16 v30, 0x10

    :goto_4a
    const/16 v31, 0x3

    goto/16 :goto_43

    :catchall_46
    move-exception v0

    const/16 v30, 0x10

    :goto_4b
    move-object v8, v3

    move-object/from16 v59, v9

    move-object v7, v10

    move/from16 v54, v14

    move/from16 v55, v15

    const/16 v19, 0x1aa

    const/16 v25, 0x4

    const/16 v31, 0x3

    goto/16 :goto_43

    :catchall_47
    move-exception v0

    move/from16 v30, v2

    goto :goto_4b

    :catchall_48
    move-exception v0

    move-object v8, v3

    move-object/from16 v59, v9

    move-object v7, v10

    move-object/from16 v60, v11

    move/from16 v61, v12

    move/from16 v54, v14

    move/from16 v55, v15

    const/16 v19, 0x1aa

    goto :goto_4a

    :catchall_49
    move-exception v0

    move-object v8, v3

    move-object/from16 v59, v9

    move-object v7, v10

    move-object/from16 v60, v11

    move/from16 v61, v12

    move/from16 v54, v14

    move/from16 v55, v15

    :goto_4c
    const/16 v19, 0x1aa

    const/16 v31, 0x3

    :goto_4d
    const/16 v44, 0x5

    goto :goto_4e

    :catchall_4a
    move-exception v0

    move-object v8, v3

    move-object v7, v10

    move-object/from16 v60, v11

    move/from16 v61, v12

    move/from16 v54, v14

    move/from16 v55, v15

    move-object/from16 v59, v27

    goto :goto_4c

    :catchall_4b
    move-exception v0

    move/from16 v31, v1

    move-object v8, v3

    move-object v7, v10

    move-object/from16 v60, v11

    move/from16 v61, v12

    move/from16 v54, v14

    move/from16 v55, v15

    move-object/from16 v59, v27

    const/16 v19, 0x1aa

    goto :goto_4d

    :goto_4e
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_52

    throw v1

    :cond_52
    throw v0

    :catchall_4c
    move-exception v0

    move-object v8, v3

    move-object v7, v10

    move-object/from16 v60, v11

    move/from16 v61, v12

    move/from16 v54, v14

    move/from16 v55, v15

    move-object/from16 v59, v27

    const/16 v19, 0x1aa

    goto/16 :goto_43

    :catchall_4d
    move-exception v0

    move-object v8, v3

    move-object v7, v10

    move-object/from16 v60, v11

    move/from16 v61, v12

    move/from16 v54, v14

    move/from16 v55, v15

    move-object/from16 v59, v27

    const/16 v19, 0x1aa

    const/16 v44, 0x5

    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_53

    throw v1

    :cond_53
    throw v0

    :catchall_4e
    move-exception v0

    move-object v8, v3

    move-object v7, v10

    move-object/from16 v60, v11

    move/from16 v61, v12

    move/from16 v54, v14

    move/from16 v55, v15

    move-object/from16 v59, v27

    const/16 v19, 0x1aa

    const/16 v44, 0x5

    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_54

    throw v1

    :cond_54
    throw v0

    :catchall_4f
    move-exception v0

    move-object v8, v3

    move-object v7, v10

    move-object/from16 v60, v11

    move/from16 v61, v12

    move/from16 v54, v14

    move/from16 v55, v15

    move-object/from16 v59, v27

    const/16 v19, 0x1aa

    const/16 v44, 0x5

    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_55

    throw v1

    :cond_55
    throw v0

    :catchall_50
    move-exception v0

    move-object v8, v3

    move-object v7, v10

    move-object/from16 v60, v11

    move/from16 v61, v12

    move/from16 v54, v14

    move/from16 v55, v15

    move-object/from16 v59, v27

    const/16 v19, 0x1aa

    const/16 v44, 0x5

    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_56

    throw v1

    :cond_56
    throw v0
    :try_end_95
    .catchall {:try_start_95 .. :try_end_95} :catchall_30

    :goto_4f
    :try_start_96
    invoke-virtual {v8}, Ljava/util/zip/ZipFile;->close()V
    :try_end_96
    .catchall {:try_start_96 .. :try_end_96} :catchall_51

    goto :goto_50

    :catchall_51
    move-exception v0

    :try_start_97
    invoke-virtual {v1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_50
    throw v1

    :catchall_52
    move-exception v0

    move-object v7, v10

    move-object/from16 v60, v11

    move/from16 v61, v12

    move/from16 v54, v14

    move/from16 v55, v15

    move-object/from16 v59, v27

    const/16 v19, 0x1aa

    const/16 v44, 0x5

    goto/16 :goto_40

    :catchall_53
    move-exception v0

    move/from16 v44, v4

    :goto_51
    move-object v7, v10

    move-object/from16 v60, v11

    move/from16 v61, v12

    move/from16 v54, v14

    move/from16 v55, v15

    move-object/from16 v59, v27

    const/16 v19, 0x1aa

    goto/16 :goto_40

    :catchall_54
    move-exception v0

    goto :goto_51

    :catchall_55
    move-exception v0

    move-object v7, v10

    move-object/from16 v60, v11

    move/from16 v61, v12

    move/from16 v54, v14

    move/from16 v55, v15

    move-object/from16 v59, v27

    const/16 v19, 0x1aa

    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_57

    throw v1

    :cond_57
    throw v0

    :catchall_56
    move-exception v0

    :goto_52
    move-object v7, v10

    move-object/from16 v60, v11

    move/from16 v61, v12

    move/from16 v54, v14

    move/from16 v55, v15

    move-object/from16 v59, v27

    const/16 v19, 0x1aa

    goto :goto_53

    :catchall_57
    move-exception v0

    move-object/from16 v52, v7

    move-object/from16 v51, v8

    goto :goto_52

    :goto_53
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_58

    throw v1

    :cond_58
    throw v0
    :try_end_97
    .catchall {:try_start_97 .. :try_end_97} :catchall_36

    :catchall_58
    move-exception v0

    move-object/from16 v52, v7

    move-object/from16 v51, v8

    goto :goto_51

    :catchall_59
    move-exception v0

    move-object/from16 v50, v1

    move-object/from16 v48, v3

    move/from16 v43, v6

    move-object/from16 v52, v7

    move-object/from16 v51, v8

    move/from16 v44, v9

    goto :goto_51

    :catchall_5a
    move-exception v0

    move-object/from16 v50, v1

    move-object/from16 v48, v3

    move/from16 v43, v6

    move-object/from16 v52, v7

    move-object/from16 v51, v8

    move/from16 v44, v9

    move-object v7, v10

    move-object/from16 v60, v11

    move/from16 v61, v12

    move/from16 v54, v14

    move/from16 v55, v15

    move-object/from16 v59, v27

    const/16 v19, 0x1aa

    const/16 v38, 0x268

    goto/16 :goto_40

    :goto_54
    xor-int/lit8 v1, v55, 0x1

    and-int/lit8 v2, v55, 0x1

    shl-int/lit8 v2, v2, 0x1

    add-int/2addr v1, v2

    move/from16 v2, v43

    :goto_55
    if-ge v1, v2, :cond_5b

    .line 39
    sget v3, Lcom/appsflyer/internal/AFi1jSDK;->$10:I

    xor-int/lit8 v4, v3, 0x63

    and-int/lit8 v3, v3, 0x63

    shl-int/lit8 v3, v3, 0x1

    add-int/2addr v4, v3

    rem-int/lit16 v3, v4, 0x80

    sput v3, Lcom/appsflyer/internal/AFi1jSDK;->$11:I

    const/16 v45, 0x2

    rem-int/lit8 v4, v4, 0x2

    if-eqz v4, :cond_5a

    :try_start_98
    aget-boolean v3, v60, v1

    if-eqz v3, :cond_59

    const/4 v1, 0x1

    :goto_56
    const/16 v46, 0x0

    goto :goto_57

    :cond_59
    xor-int/lit8 v3, v1, -0xd

    and-int/lit8 v1, v1, -0xd

    const/16 v32, 0x1

    shl-int/lit8 v1, v1, 0x1

    add-int/2addr v3, v1

    add-int/lit8 v1, v3, 0xe

    const/16 v32, 0x1

    goto :goto_55

    :cond_5a
    aget-boolean v0, v60, v1
    :try_end_98
    .catch Ljava/lang/Exception; {:try_start_98 .. :try_end_98} :catch_13

    const/16 v46, 0x0

    :try_start_99
    throw v46
    :try_end_99
    .catch Ljava/lang/Exception; {:try_start_99 .. :try_end_99} :catch_13
    .catchall {:try_start_99 .. :try_end_99} :catchall_5b

    :catchall_5b
    move-exception v0

    throw v0

    :cond_5b
    const/4 v1, 0x0

    goto :goto_56

    :goto_57
    if-eqz v1, :cond_5c

    :try_start_9a
    sput-object v46, Lcom/appsflyer/internal/AFi1jSDK;->e:Ljava/lang/Object;

    sput-object v46, Lcom/appsflyer/internal/AFi1jSDK;->i:Ljava/lang/Object;
    :try_end_9a
    .catch Ljava/lang/Exception; {:try_start_9a .. :try_end_9a} :catch_13

    sget v0, Lcom/appsflyer/internal/AFi1jSDK;->$10:I

    add-int/lit8 v0, v0, 0x1f

    rem-int/lit16 v0, v0, 0x80

    sput v0, Lcom/appsflyer/internal/AFi1jSDK;->$11:I

    const/4 v3, 0x2

    const/16 v28, 0x0

    :goto_58
    const/16 v6, 0x124

    goto :goto_59

    :cond_5c
    :try_start_9b
    sget-object v1, Lcom/appsflyer/internal/AFi1jSDK;->$$a:[B

    aget-byte v2, v1, v38

    int-to-byte v2, v2

    const/16 v3, 0x461

    int-to-short v3, v3

    aget-byte v4, v1, v16

    int-to-byte v4, v4

    invoke-static {v2, v3, v4}, Lcom/appsflyer/internal/AFi1jSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v2
    :try_end_9b
    .catch Ljava/lang/Exception; {:try_start_9b .. :try_end_9b} :catch_13

    const/4 v3, 0x2

    :try_start_9c
    new-array v3, v3, [Ljava/lang/Object;

    const/16 v32, 0x1

    aput-object v0, v3, v32

    const/16 v28, 0x0

    aput-object v2, v3, v28

    aget-byte v0, v1, v34

    int-to-byte v0, v0

    const/16 v6, 0x124

    int-to-short v2, v6

    aget-byte v1, v1, v36

    neg-int v1, v1

    int-to-byte v1, v1

    invoke-static {v0, v2, v1}, Lcom/appsflyer/internal/AFi1jSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    const-class v1, Ljava/lang/Throwable;

    filled-new-array {v7, v1}, [Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Throwable;

    throw v0
    :try_end_9c
    .catchall {:try_start_9c .. :try_end_9c} :catchall_5c

    :catchall_5c
    move-exception v0

    :try_start_9d
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_5d

    throw v1

    :cond_5d
    throw v0

    :cond_5e
    move-object/from16 v50, v1

    move-object/from16 v46, v2

    move-object/from16 v48, v3

    move v3, v4

    move v2, v6

    move-object/from16 v52, v7

    move-object/from16 v51, v8

    move/from16 v44, v9

    move-object v7, v10

    move-object/from16 v60, v11

    move/from16 v61, v12

    move/from16 v54, v14

    move/from16 v55, v15

    move-object/from16 v59, v27

    const/16 v19, 0x1aa

    goto :goto_58

    :goto_59
    move/from16 v14, v54

    :goto_5a
    xor-int/lit8 v0, v55, -0x4f

    and-int/lit8 v1, v55, -0x4f

    const/16 v32, 0x1

    shl-int/lit8 v1, v1, 0x1

    add-int/2addr v0, v1

    xor-int/lit8 v1, v0, 0x50

    and-int/lit8 v0, v0, 0x50

    shl-int/lit8 v0, v0, 0x1

    add-int v15, v1, v0

    move v6, v2

    move v4, v3

    move-object v10, v7

    move/from16 v5, v37

    move/from16 v9, v44

    move-object/from16 v2, v46

    move-object/from16 v3, v48

    move-object/from16 v1, v50

    move-object/from16 v8, v51

    move-object/from16 v7, v52

    move-object/from16 v27, v59

    move-object/from16 v11, v60

    move/from16 v12, v61

    goto/16 :goto_11

    :cond_5f
    :goto_5b
    return-void

    :catchall_5d
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_60

    throw v1

    :cond_60
    throw v0

    :catchall_5e
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_61

    throw v1

    :cond_61
    throw v0

    :catchall_5f
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_62

    throw v1

    :cond_62
    throw v0
    :try_end_9d
    .catch Ljava/lang/Exception; {:try_start_9d .. :try_end_9d} :catch_13

    :catch_13
    move-exception v0

    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1

    :catchall_60
    move-exception v0

    .line 40
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_63

    throw v1

    :cond_63
    throw v0

    nop

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

    :array_2
    .array-data 1
        0x54t
        0x76t
        0x4dt
        -0x5ct
        0x5t
        -0x29t
        -0x80t
        0x51t
        0x4bt
        -0x10t
        0x2dt
        -0x60t
        0x59t
        0x5bt
        -0x66t
        0x12t
    .end array-data

    :array_3
    .array-data 1
        -0x39t
        0x4at
        0x61t
        -0x78t
        0x5et
        0x13t
        0x3at
        0x21t
        -0x40t
        0x57t
        -0x7at
        -0x46t
        0x48t
        0x24t
        -0x77t
        -0x2ct
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
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public static getMediationNetwork(CII)Ljava/lang/Object;
    .locals 6

    .line 1
    .line 2
    sget v0, Lcom/appsflyer/internal/AFi1jSDK;->$11:I

    .line 3
    .line 4
    and-int/lit8 v1, v0, 0x5b

    .line 5
    .line 6
    or-int/lit8 v2, v0, 0x5b

    .line 7
    add-int/2addr v1, v2

    .line 8
    .line 9
    rem-int/lit16 v2, v1, 0x80

    .line 10
    .line 11
    sput v2, Lcom/appsflyer/internal/AFi1jSDK;->$10:I

    .line 12
    const/4 v2, 0x2

    .line 13
    rem-int/2addr v1, v2

    .line 14
    .line 15
    if-nez v1, :cond_1

    .line 16
    .line 17
    sget-object v1, Lcom/appsflyer/internal/AFi1jSDK;->e:Ljava/lang/Object;

    .line 18
    .line 19
    add-int/lit8 v0, v0, 0x5d

    .line 20
    .line 21
    rem-int/lit16 v0, v0, 0x80

    .line 22
    .line 23
    sput v0, Lcom/appsflyer/internal/AFi1jSDK;->$10:I

    .line 24
    const/4 v0, 0x3

    .line 25
    .line 26
    :try_start_0
    new-array v0, v0, [Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 30
    move-result-object p2

    .line 31
    .line 32
    aput-object p2, v0, v2

    .line 33
    .line 34
    .line 35
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 36
    move-result-object p1

    .line 37
    const/4 p2, 0x1

    .line 38
    .line 39
    aput-object p1, v0, p2

    .line 40
    .line 41
    .line 42
    invoke-static {p0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 43
    move-result-object p0

    .line 44
    const/4 p1, 0x0

    .line 45
    .line 46
    aput-object p0, v0, p1

    .line 47
    .line 48
    sget-object p0, Lcom/appsflyer/internal/AFi1jSDK;->$$a:[B

    .line 49
    .line 50
    const/16 p1, 0x388

    .line 51
    .line 52
    aget-byte v2, p0, p1

    .line 53
    int-to-byte v2, v2

    .line 54
    .line 55
    or-int/lit16 v3, v2, 0x21b

    .line 56
    int-to-short v3, v3

    .line 57
    .line 58
    sget v4, Lcom/appsflyer/internal/AFi1jSDK;->$$b:I

    .line 59
    int-to-byte v5, v4

    .line 60
    .line 61
    .line 62
    invoke-static {v2, v3, v5}, Lcom/appsflyer/internal/AFi1jSDK;->$$c(IIS)Ljava/lang/String;

    .line 63
    move-result-object v2

    .line 64
    .line 65
    sget-object v3, Lcom/appsflyer/internal/AFi1jSDK;->i:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast v3, Ljava/lang/ClassLoader;

    .line 68
    .line 69
    .line 70
    invoke-static {v2, p2, v3}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    .line 71
    move-result-object p2

    .line 72
    .line 73
    const/16 v2, 0xd

    .line 74
    .line 75
    aget-byte v2, p0, v2

    .line 76
    int-to-byte v2, v2

    .line 77
    .line 78
    or-int/lit16 v3, v4, 0x435

    .line 79
    int-to-short v3, v3

    .line 80
    .line 81
    aget-byte p0, p0, p1

    .line 82
    int-to-byte p0, p0

    .line 83
    .line 84
    .line 85
    invoke-static {v2, v3, p0}, Lcom/appsflyer/internal/AFi1jSDK;->$$c(IIS)Ljava/lang/String;

    .line 86
    move-result-object p0

    .line 87
    .line 88
    sget-object p1, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    .line 89
    .line 90
    sget-object v2, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 91
    .line 92
    .line 93
    filled-new-array {p1, v2, v2}, [Ljava/lang/Class;

    .line 94
    move-result-object p1

    .line 95
    .line 96
    .line 97
    invoke-virtual {p2, p0, p1}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 98
    move-result-object p0

    .line 99
    .line 100
    .line 101
    invoke-virtual {p0, v1, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 102
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 103
    .line 104
    sget p1, Lcom/appsflyer/internal/AFi1jSDK;->$11:I

    .line 105
    .line 106
    add-int/lit8 p1, p1, 0x31

    .line 107
    .line 108
    rem-int/lit16 p1, p1, 0x80

    .line 109
    .line 110
    sput p1, Lcom/appsflyer/internal/AFi1jSDK;->$10:I

    .line 111
    return-object p0

    .line 112
    :catchall_0
    move-exception p0

    .line 113
    .line 114
    .line 115
    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 116
    move-result-object p1

    .line 117
    .line 118
    if-eqz p1, :cond_0

    .line 119
    throw p1

    .line 120
    :cond_0
    throw p0

    .line 121
    :cond_1
    const/4 p0, 0x0

    .line 122
    throw p0
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

.method public static getMonetizationNetwork(I)I
    .locals 6

    .line 1
    sget v0, Lcom/appsflyer/internal/AFi1jSDK;->$11:I

    add-int/lit8 v1, v0, 0xf

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/appsflyer/internal/AFi1jSDK;->$10:I

    rem-int/lit8 v1, v1, 0x2

    if-nez v1, :cond_1

    sget-object v1, Lcom/appsflyer/internal/AFi1jSDK;->e:Ljava/lang/Object;

    add-int/lit8 v0, v0, 0x25

    rem-int/lit16 v0, v0, 0x80

    sput v0, Lcom/appsflyer/internal/AFi1jSDK;->$10:I

    :try_start_0
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    sget-object v0, Lcom/appsflyer/internal/AFi1jSDK;->$$a:[B

    const/16 v2, 0x388

    aget-byte v2, v0, v2

    int-to-byte v2, v2

    or-int/lit16 v3, v2, 0x21b

    int-to-short v3, v3

    sget v4, Lcom/appsflyer/internal/AFi1jSDK;->$$b:I

    int-to-byte v5, v4

    invoke-static {v2, v3, v5}, Lcom/appsflyer/internal/AFi1jSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v2

    sget-object v3, Lcom/appsflyer/internal/AFi1jSDK;->i:Ljava/lang/Object;

    check-cast v3, Ljava/lang/ClassLoader;

    const/4 v5, 0x1

    invoke-static {v2, v5, v3}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object v2

    const/16 v3, 0x144

    aget-byte v0, v0, v3

    int-to-byte v0, v0

    const/16 v3, 0x48e

    int-to-short v3, v3

    add-int/lit8 v4, v4, 0x4

    int-to-byte v4, v4

    invoke-static {v0, v3, v4}, Lcom/appsflyer/internal/AFi1jSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v0

    sget-object v3, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    filled-new-array {v3}, [Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v2, v0, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    invoke-virtual {v0, v1, p0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Integer;

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return p0

    :catchall_0
    move-exception p0

    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_0

    throw v0

    :cond_0
    throw p0

    :cond_1
    const/4 p0, 0x0

    throw p0
.end method

.method public static getMonetizationNetwork(Ljava/lang/Object;)I
    .locals 7

    .line 2
    sget v0, Lcom/appsflyer/internal/AFi1jSDK;->$11:I

    sget-object v1, Lcom/appsflyer/internal/AFi1jSDK;->e:Ljava/lang/Object;

    add-int/lit8 v0, v0, 0xb

    rem-int/lit16 v0, v0, 0x80

    sput v0, Lcom/appsflyer/internal/AFi1jSDK;->$10:I

    :try_start_0
    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    sget-object v0, Lcom/appsflyer/internal/AFi1jSDK;->$$a:[B

    const/16 v2, 0x388

    aget-byte v2, v0, v2

    int-to-byte v2, v2

    xor-int/lit16 v3, v2, 0x21b

    and-int/lit16 v4, v2, 0x21b

    or-int/2addr v3, v4

    int-to-short v3, v3

    sget v4, Lcom/appsflyer/internal/AFi1jSDK;->$$b:I

    int-to-byte v5, v4

    invoke-static {v2, v3, v5}, Lcom/appsflyer/internal/AFi1jSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v2

    sget-object v3, Lcom/appsflyer/internal/AFi1jSDK;->i:Ljava/lang/Object;

    check-cast v3, Ljava/lang/ClassLoader;

    const/4 v5, 0x1

    invoke-static {v2, v5, v3}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object v2

    const/16 v3, 0xdb

    aget-byte v0, v0, v3

    int-to-byte v0, v0

    const/16 v3, 0x485

    int-to-short v3, v3

    or-int/lit8 v6, v4, 0x4

    shl-int/lit8 v5, v6, 0x1

    xor-int/lit8 v4, v4, 0x4

    sub-int/2addr v5, v4

    int-to-byte v4, v5

    invoke-static {v0, v3, v4}, Lcom/appsflyer/internal/AFi1jSDK;->$$c(IIS)Ljava/lang/String;

    move-result-object v0

    const-class v3, Ljava/lang/Object;

    filled-new-array {v3}, [Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v2, v0, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    invoke-virtual {v0, v1, p0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Integer;

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    sget v0, Lcom/appsflyer/internal/AFi1jSDK;->$11:I

    and-int/lit8 v1, v0, 0x4d

    or-int/lit8 v0, v0, 0x4d

    add-int/2addr v1, v0

    rem-int/lit16 v1, v1, 0x80

    sput v1, Lcom/appsflyer/internal/AFi1jSDK;->$10:I

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

.method private static getMonetizationNetwork(II)V
    .locals 0

    .line 3
    sget p0, Lcom/appsflyer/internal/AFi1jSDK;->$10:I

    xor-int/lit8 p1, p0, 0x19

    and-int/lit8 p0, p0, 0x19

    shl-int/lit8 p0, p0, 0x1

    add-int/2addr p1, p0

    rem-int/lit16 p1, p1, 0x80

    sput p1, Lcom/appsflyer/internal/AFi1jSDK;->$11:I

    return-void
.end method

.method public static init$0()V
    .locals 5

    .line 1
    .line 2
    sget v0, Lcom/appsflyer/internal/AFi1jSDK;->$10:I

    .line 3
    .line 4
    add-int/lit8 v0, v0, 0x79

    .line 5
    .line 6
    rem-int/lit16 v1, v0, 0x80

    .line 7
    .line 8
    sput v1, Lcom/appsflyer/internal/AFi1jSDK;->$11:I

    .line 9
    .line 10
    rem-int/lit8 v0, v0, 0x2

    .line 11
    .line 12
    const-string v1, "ISO-8859-1"

    .line 13
    .line 14
    .line 15
    const-string/jumbo v2, "~\u000b\u001ct\u00f0\u0007\u00ef\u0000\u0003\u00023\u00c4\u00f2\u000e\u00ee\u0005\u00fc\u0003\u00edB\u00e8\u00d1\u0000\u00fa\u00fa\u0008\u0002\u00f1\u00ff;\u00cb\u00ee\u00fd\u00fa\n\u00f7\u00f0\u0011\u00f0@\u00c3\u00f8\u00f7\u000c\u00f0\u0001\n\u00f2:\u00eb\u00f8\u00da5\u00cd\u000b\u000c\u00f6\u00f5\u00fd\u00f1\u00ff<\u00ca\u00ee\u00fd\u00fa\n\u00f7\u00f0\u0011\u00f0\u00f0\u0007\u00ef\u0000\u0003\u00023\u00ca\u00ee\u00fd?\u00ea\u00db\u00ec\u0008\u00f0\n\u00f2\u00f8\"\u00e9\u00f3\n\u0001\u00fa\u00eb\u0000\u00fd\n\u00f4\u00f70\u00ce\u00fd\u0001\u0000\u0003\u00ff\u00ea\u0008\u00f7\u00fe\u00f0\u0007\u00ef\u0000\u0003\u00023\u00ca\u00ee\u00fd?\u00ea\u00ce\u00fd&\u00d8\u00fa\n\u00fe\u00f2\u00f6\u00ff\u00ee(\u00d8\u0002\u00f2\u0008\u0005\u00f2(\u00ce\u00fd\u0001\u0000\u0003\u00ff\u00ea\u0008\u00f7\u00fe\u00ff\u00ee+\u00da\u00fa\u0004\u00ef,\u00d8\u00f4\u00ff\u00ee.\u00d1\u0008\u00fc\u001f\u00df\u00fb\u00f8\u0000\u001e\u00d8\u00f4\u00ff\u00ee.\u00df\u00fb\u00f8\u0000\u001e\u00d8\u00f4\u00c8\u0000\u00ea\u0010/\u00c8\u0000\u00ea\u0010/\u0006\u00e8\u00120\u00c2\u00f7>\u00e5\u00da\u00fa\u0004\u0006\u00e8\u00120\u00c2\u00f7>\u00b7\u0004\u00fa\t\u00f8\u00f4\u0006\u00e8\u00120\u00bf\u0008\u00f0\u00046\u00d8\u00d7\u0003\u00fc\u000c\u00f5\u00ff\u00ee!\u00db\u0000\u00fc\u0008\u00f0\u00fb\u00f8\u00f1\u0008\u00fc\u0003\u00f9\u00ff\u00fb\u00f8\u0000\u00f0\u0007\u00ef\u0000\u0003\u00023\u00bc\u00f9B\u00e9\u00ca\t\u00fa\u0005=\u00cb\u000e\u00f0\u00fc\u0007\u00f7\u00fe\u000c\u00f6\u00e9\u0013\u00f8\u00f7\u00ff\u00f0\u0014\u00e2\u0006\u00f2\u000c\u0012\u00f7\u0013\u00f5\u0006\u00e8\u00120\u00c2\u00f7>\u00e2\u00f7\u0007\u00ca\u0012\u00fb\u00f2\u00f9\u0008\u00f7\u00fe\u00eb\u0000\u00fd\n\u00f4\u00f7\u001d\u00e8\u00f9\u0005\u0015\u00e1\u00fa\u00fd\u0000\u00f3\u0006\u00e8\u00120\u00c2\u00f7>\u00e5\u00da\u00fa\u0004\u0013\u00d7\u00fe\u0001\u00f8\u00fe\u001e\u00dc\u00ff\n\u0001\u00f1\u00f4\u00fa\u00f9\u000b\u0012\u00fa\u0010\u00f5\u00cb\u00eb\u00fd\u000b\u00ee\u00feA\u00c9\u00f1\u00ff;\u00cb\u00ee\u00fd\u00fa\n\u00f7\u00f0\u0011\u00f0@\u00c3\u00f8\u00f7\u000c\u00f0\u0001\n\u00f2:\u00fb\u00cd\'\u00cf*\u0005\u00fb\u00fc\u00ca2\u00fa\u00fa\u00d1\u00ff\u00fb\u00ff\u00fb3\u00ff\u00ee\u001f\u00ea\u00ef\u0001\u00f7\u0000\u000c\u00fb\u0006\u00e8\u00120\u00bd\u0006\u00eeC\u00d6\u0000\u0003\u00ff\u00ee!\u00ec\u00ea\t\u0006\u00e8\u00120\u00c2\u00f7>\u00e9\u00ca\u000c\u00fd\u00fe\u00f0\n\u00fe\u0018\u00d8\u00fb\u00f8\u00fe\u001e\u00dc\u00ff\n\u0001\u00f1\u0006\u00e8\u00120\u00c2\u00f7>\u00e2\u00d8\u00fb\u00f8\u00fe\u001e\u00dc\u00ff\n\u0001\u00f1\u0006\u00e8\u00120\u00c2\u00f7>\u00e7\u00e0\u00ea\u0010\u0015\u00d8\u00fb\u00f8\u00fe\u001e\u00dc\u00ff\n\u0001\u00f1\n\u0001\u00fa\u001b\u00ce\u0006\u00fd\u00f0\u0006\u00e8\u00120\u00c2\u00f7>\u00e9\u00c6\u0002\u000c!\u00cc\u00fd\u000e\u00e5-\u00d8\u00fb\u00f8\u00fe\u001e\u00dc\u00ff\n\u0001\u00f1\u00ec\u00fd\u000e\u00e5\u0013\u00f1\u00fc\u00f4\u00f1\u00ff<\u00ca\u00ee\u00fd\u00fa\n\u00f7\u00f0\u0011\u00f0A\u00c2\u00f8\u00f7\u000c\u00f0\u0001\n\u00f2;\u00ea\u00f8\u00d87\u00bd\u001b\u000c\u00f6\u00f1\u00ff<\u00ca\u00ee\u00fd\u00fa\n\u00f7\u00f0\u0011\u00f0A\u00c2\u00f8\u00f7\u000c\u00f0\u0001\n\u00f2;\u00ea\u00f8\u00da5\u00cd\u000b\u000c\u00f6\u00f5\u00fd\u00ff\u00ee$\u00db\u00fe\u0006\u00ee\u0008\u00ec\u0016\u00ea\u0008\u00f7\u00fe\u001d\u00e6\u00ee\u00fa\u0005\u00fa\u0004\u0005\u00ff\u00f6\n\u0001\u00fa\u000b\u00ee\u001f\u00ea\u0001\u00fa\u0012\u00de\u00ff\u00f0\u0012\u00f9\u0011\u00f5\u0002\u0006\u00f2\u000c\u00ff\u00ee+\u00ff\u0006\u00e8\u00120\u00c2\u00f7>\u00e5\u00da\u00fa\u0004\u001e\u00dc\u00ef\r\u00ee\u0006\u00f6\u00f9\u0002\u00fa\u00f7\u0008\u0008\u0000\u00f2\u00f3\n\u00fb:\u00b8\u00f7\u0003\u00fc\u000c\u00f5<\u00e7\u00dc\u00ea/\u00da\u00fa\u0004\u00fa\u000b\u00fa\u001d\u00dc\u00ea\u00ff\u00ee0\u00dc\u00ec\u0001\u0000\u00f4\u00fe\u000c\u0012\u00ec\u00ea\t\u00fc\u00f6\u0004\u00ee\u000c\u00ff\u00ee.\u00d4\u0008\u00eb\u00fd$\u00da\u000b\u00fa\u00fc\u00f0\u0006\u00e8\u00120\u00b6\u00fe\u0008\u00fa;\u00b1\u000e\u00f6?\u00d1\u00ee\u00f6$\u00d8\u00fb\u00f8\u00fe\u001e\u00dc\u00ff\n\u0001\u00f1\u00ff\u00ee#\u00e6\u00ea\u0001,\u00d4\u00f7\u00ff\u00f6\u0006\u00e8\u00120\u00b6\u00fe\u0008\u00fa;\u00b1\u000e\u00f6?\u00d1\u00ee\u00f6(\u00d4\u00f7\u00ff\u00f6\u00ff\u00ee\u001e\u00e7\u00ec\u0012\u0006\u00e8\u00120\u00c2\u00f7>\u00e9\u00c6\u0002\u000c!\u00cc\u00fd\u000e\u00e5\'\u00d7\u00fe\u0001\u00f8\u00fe\u001e\u00dc\u00ff\n\u0001\u00f1\u0002*\u00c6\u0002\u000c!\u00cc\u00fd\u000e\u00e5\u0006\u00e8\u00120\u00c2\u00f7>\u00e8\u00d4\u00fa\u00f9\u000b\u0001\u00fc\u00f3\u0004\u0000\u00f2\u00f3\n\u00fb:\u00b8\u00f7\u0003\u00fc\u000c\u00f5<\u00e2\u00d8\u001e\u00e5\u00f5\u00fb\u00fa\u00f62\u00dc\u00ea2\u00d4\u0008\u00eb\u00fd$\u00da\u000b\u00fa\u00fc\u00f0\u0006\u00e8\u00120\u00bd\u0002\u00f7>\u00e9\u00c6\u0002\u000c \u00ca\u000c\u00fd\u00fe\u00f0\u0006\u00e8\u00120\u00bf\u0008\u00f0\u00046\u00e8\u00d4\u0008\u00eb\u00fd$\u00da\u000b\u00fa\u00fc\u00f0\u0002\u000e\u00ee\u0000\u00f2\u00f3\n\u00fb:\u00b8\u00f7\u0003\u00fc\u000c\u00f5<\u00e9\u00de\u00eb\u000b\u001e\u00dc\u00ea2\u00d4\u0008\u00eb\u00fd$\u00da\u000b\u00fa\u00fc\u00f0\u000c\u00ea\t\u0019\u00e0\u00f3\u00fc\n\u00ea\u0008\u00f0\u000e\u0016\u00e0\u0004\u00ed\u000e\u00ec\u00f62\u00d8\u00f4\n\u00ff\u00ec\u0002\u00fa\u0006\u0001\u00ef\n\u00ea\u0008\u00f0\u000e\u0016\u00e0\u0004\u00ed\u000e\u00ec\u00f6&\u00ec\u00ea\t \u00d6\u0004\u00f5\u0005\u00f4\u00f7\u00fe\u00ff\u00ee.\u00d1\u00ff\u00fa\u00fe\u00fe\u0006\u00f4\u00f7\u001d\u00d8\u0006\u0008\u0012\u00f5\u0015\u00f5\u00fa\u000b\u00fa\u001e\u00d4\u0008\u00eb\u00fd\u00f1\u00ff;\u00cb\u00ee\u00fd\u00fa\n\u00f7\u00f0\u0011\u00f0@\u00c3\u00f8\u00f7\u000c\u00f0\u0001\n\u00f2:\u00eb\u00f8\u00da5\u00c4\u0014\u000c\u00f6$\u00b8\u00cb\u00eb\u00fd\u000b\u00ee\u00feA\u00c9\u00f1\u00ff;\u00cb\u00ee\u00fd\u00fa\n\u00f7\u00f0\u0011\u00f0@\u00c3\u00f8\u00f7\u000c\u00f0\u0001\n\u00f2:\u00c9\u00fa1\u00cd*\u00fc\u00fe\u0000\u00fd\u00fd\u00ca\u00fe\u0000\u00fa\u00fd\u00fc\u00fe4\u0012\u00f6\u0014\u00f5\u00b7\u00fcL\u00b7\u0002\u00f2\u00fd\u0007\u00fe\u00fb\u00f5\u00f5P\u00b1\u0004\u00fc\u00efH\u00f8\u0002\u00da\u000f\u00ea\u00ec\u000e\u00f4\u00f6\r\u001e\u00e0\u00ea\u0010\u00ff\u00ee\u001f\u00ea\u00ec\u000e\u00f4\u00f6\r\u00ff\u00ee.\u00cb\u0000\u00fd\n\u00f4\u0008\u00e7-\u00d3\u00018\u00ff\u00fe\u00f7\u00f1\u00d1\u0008\u00fc"

    .line 16
    const/4 v3, 0x0

    .line 17
    .line 18
    const/16 v4, 0x4a7

    .line 19
    .line 20
    if-nez v0, :cond_0

    .line 21
    .line 22
    new-array v0, v4, [B

    .line 23
    .line 24
    .line 25
    invoke-virtual {v2, v1}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    .line 26
    move-result-object v1

    .line 27
    .line 28
    .line 29
    invoke-static {v1, v3, v0, v3, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 30
    .line 31
    sput-object v0, Lcom/appsflyer/internal/AFi1jSDK;->$$a:[B

    .line 32
    .line 33
    const/16 v0, 0x61

    .line 34
    .line 35
    :goto_0
    sput v0, Lcom/appsflyer/internal/AFi1jSDK;->$$b:I

    .line 36
    return-void

    .line 37
    .line 38
    :cond_0
    new-array v0, v4, [B

    .line 39
    .line 40
    .line 41
    invoke-virtual {v2, v1}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    .line 42
    move-result-object v1

    .line 43
    .line 44
    .line 45
    invoke-static {v1, v3, v0, v3, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 46
    .line 47
    sput-object v0, Lcom/appsflyer/internal/AFi1jSDK;->$$a:[B

    .line 48
    .line 49
    const/16 v0, 0x42

    .line 50
    goto :goto_0
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
.end method
