.class public Lcom/tencent/feedback/eup/jni/NativeExceptionHandlerRqdImp;
.super Ljava/lang/Object;
.source "BUGLY"

# interfaces
.implements Lcom/tencent/feedback/eup/jni/NativeExceptionHandler;


# static fields
.field public static c:Lcom/tencent/feedback/eup/jni/NativeExceptionHandlerRqdImp;

.field public static listener:Lcom/tencent/feedback/eup/CrashHandleListener;


# instance fields
.field public a:Landroid/content/Context;

.field public b:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput-object p1, p0, Lcom/tencent/feedback/eup/jni/NativeExceptionHandlerRqdImp;->a:Landroid/content/Context;

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
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
.end method

.method public static declared-synchronized getInstance()Lcom/tencent/feedback/eup/jni/NativeExceptionHandlerRqdImp;
    .locals 2

    const-class v0, Lcom/tencent/feedback/eup/jni/NativeExceptionHandlerRqdImp;

    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, Lcom/tencent/feedback/eup/jni/NativeExceptionHandlerRqdImp;->c:Lcom/tencent/feedback/eup/jni/NativeExceptionHandlerRqdImp;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public static declared-synchronized getInstance(Landroid/content/Context;)Lcom/tencent/feedback/eup/jni/NativeExceptionHandlerRqdImp;
    .locals 2

    const-class v0, Lcom/tencent/feedback/eup/jni/NativeExceptionHandlerRqdImp;

    monitor-enter v0

    .line 1
    :try_start_0
    sget-object v1, Lcom/tencent/feedback/eup/jni/NativeExceptionHandlerRqdImp;->c:Lcom/tencent/feedback/eup/jni/NativeExceptionHandlerRqdImp;

    if-nez v1, :cond_0

    .line 2
    new-instance v1, Lcom/tencent/feedback/eup/jni/NativeExceptionHandlerRqdImp;

    invoke-direct {v1, p0}, Lcom/tencent/feedback/eup/jni/NativeExceptionHandlerRqdImp;-><init>(Landroid/content/Context;)V

    sput-object v1, Lcom/tencent/feedback/eup/jni/NativeExceptionHandlerRqdImp;->c:Lcom/tencent/feedback/eup/jni/NativeExceptionHandlerRqdImp;

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_1

    .line 3
    :cond_0
    :goto_0
    sget-object p0, Lcom/tencent/feedback/eup/jni/NativeExceptionHandlerRqdImp;->c:Lcom/tencent/feedback/eup/jni/NativeExceptionHandlerRqdImp;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object p0

    :goto_1
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0
.end method


# virtual methods
.method public declared-synchronized getTombDir()Ljava/lang/String;
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    .line 3
    :try_start_0
    iget-object v0, p0, Lcom/tencent/feedback/eup/jni/NativeExceptionHandlerRqdImp;->b:Ljava/lang/String;
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
.end method

.method public handleNativeException(IIJJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 19

    .line 1
    const-string v17, ""

    const-string/jumbo v18, "unknown"

    const v12, -0x499602d2

    const-string v13, ""

    const/4 v14, -0x1

    const/4 v15, -0x1

    const/16 v16, -0x1

    move-object/from16 v0, p0

    move/from16 v1, p1

    move/from16 v2, p2

    move-wide/from16 v3, p3

    move-wide/from16 v5, p5

    move-object/from16 v7, p7

    move-object/from16 v8, p8

    move-object/from16 v9, p9

    move-object/from16 v10, p10

    move-object/from16 v11, p11

    invoke-virtual/range {v0 .. v18}, Lcom/tencent/feedback/eup/jni/NativeExceptionHandlerRqdImp;->handleNativeException(IIJJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;IIILjava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public handleNativeException(IIJJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;IIILjava/lang/String;Ljava/lang/String;)V
    .locals 20

    const/16 v19, 0x0

    move-object/from16 v0, p0

    move/from16 v1, p1

    move/from16 v2, p2

    move-wide/from16 v3, p3

    move-wide/from16 v5, p5

    move-object/from16 v7, p7

    move-object/from16 v8, p8

    move-object/from16 v9, p9

    move-object/from16 v10, p10

    move-object/from16 v11, p11

    move/from16 v12, p12

    move-object/from16 v13, p13

    move/from16 v14, p14

    move/from16 v15, p15

    move/from16 v16, p16

    move-object/from16 v17, p17

    move-object/from16 v18, p18

    .line 2
    invoke-virtual/range {v0 .. v19}, Lcom/tencent/feedback/eup/jni/NativeExceptionHandlerRqdImp;->handleNativeException(IIJJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;IIILjava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V

    return-void
.end method

.method public handleNativeException(IIJJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;IIILjava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V
    .locals 21

    .line 3
    invoke-static {}, Lcom/tencent/bugly/proguard/k3;->l()Lcom/tencent/bugly/proguard/k3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/k3;->m()Lcom/tencent/bugly/crashreport/crash/jni/NativeExceptionHandler;

    move-result-object v1

    move/from16 v2, p1

    move/from16 v3, p2

    move-wide/from16 v4, p3

    move-wide/from16 v6, p5

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move/from16 v13, p12

    move-object/from16 v14, p13

    move/from16 v15, p14

    move/from16 v16, p15

    move/from16 v17, p16

    move-object/from16 v18, p17

    move-object/from16 v19, p18

    move-object/from16 v20, p19

    invoke-interface/range {v1 .. v20}, Lcom/tencent/bugly/crashreport/crash/jni/NativeExceptionHandler;->handleNativeException2(IIJJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;IIILjava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V

    return-void
.end method

.method public declared-synchronized setTombDir(Ljava/lang/String;)V
    .locals 0

    .line 1
    monitor-enter p0

    .line 2
    .line 3
    :try_start_0
    iput-object p1, p0, Lcom/tencent/feedback/eup/jni/NativeExceptionHandlerRqdImp;->b:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 4
    monitor-exit p0

    .line 5
    return-void

    .line 6
    :catchall_0
    move-exception p1

    .line 7
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 8
    throw p1
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
    .line 25
.end method
