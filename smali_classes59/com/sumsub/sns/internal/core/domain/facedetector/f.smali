.class public abstract Lcom/sumsub/sns/internal/core/domain/facedetector/f;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# direct methods
.method public static final a()Lcom/sumsub/sns/internal/core/domain/facedetector/g;
    .locals 1

    .line 1
    new-instance v0, Lcom/sumsub/sns/internal/core/domain/facedetector/h;

    invoke-direct {v0}, Lcom/sumsub/sns/internal/core/domain/facedetector/h;-><init>()V

    return-object v0
.end method

.method public static a(Ljava/util/concurrent/LinkedBlockingQueue;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V
    .locals 2

    const-string v0, "FaceDetectorFactory"

    .line 14
    :try_start_0
    invoke-interface {p2}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object p2

    invoke-virtual {p0, p2}, Ljava/util/concurrent/LinkedBlockingQueue;->offer(Ljava/lang/Object;)Z

    .line 15
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "Using "

    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, " Face detector"

    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    .line 16
    sget-object p2, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 17
    iget-object p2, p2, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    const/4 v1, 0x0

    .line 18
    invoke-virtual {p2, v0, p0, v1}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p0

    .line 19
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Can\'t use "

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " detector"

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 20
    sget-object p2, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 21
    iget-object p2, p2, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 22
    invoke-virtual {p2, v0, p1, p0}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static a(Landroid/content/Context;)Z
    .locals 5

    const/4 v0, 0x0

    const/4 v1, 0x0

    const-string v2, "FaceDetectorFactory"

    if-nez p0, :cond_0

    .line 2
    sget-object p0, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 3
    iget-object p0, p0, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 4
    const-string v3, "@isGooglePlayServicesAvailable, Context is null"

    invoke-virtual {p0, v2, v3, v0}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return v1

    .line 5
    :cond_0
    :try_start_0
    invoke-static {}, Lcom/google/android/gms/common/GoogleApiAvailability;->getInstance()Lcom/google/android/gms/common/GoogleApiAvailability;

    move-result-object v3

    .line 6
    invoke-virtual {v3, p0}, Lcom/google/android/gms/common/GoogleApiAvailability;->isGooglePlayServicesAvailable(Landroid/content/Context;)I

    move-result p0

    if-nez p0, :cond_1

    const/4 p0, 0x1

    goto :goto_0

    :cond_1
    move p0, v1

    .line 7
    :goto_0
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "@isGooglePlayServicesAvailable, Has connection to GP Services: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 8
    sget-object v4, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 9
    iget-object v4, v4, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 10
    invoke-virtual {v4, v2, v3, v0}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return p0

    :catchall_0
    move-exception p0

    .line 11
    sget-object v0, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 12
    iget-object v0, v0, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 13
    const-string v3, "@isGooglePlayServicesAvailable, Failed to check GP Services"

    invoke-virtual {v0, v2, v3, p0}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return v1
.end method

.method public static b(Landroid/content/Context;)Lcom/sumsub/sns/internal/core/domain/facedetector/d;
    .locals 8

    .line 1
    new-instance v0, Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-direct {v0}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    .line 2
    sget-object v1, Lcom/sumsub/sns/internal/ff/a;->f:Lcom/sumsub/sns/internal/ff/core/a;

    .line 3
    invoke-virtual {v1}, Lcom/sumsub/sns/internal/ff/core/a;->a()Z

    move-result v1

    .line 4
    sget-object v2, Lcom/sumsub/sns/internal/ff/a;->g:Lcom/sumsub/sns/internal/ff/core/a;

    .line 5
    invoke-virtual {v2}, Lcom/sumsub/sns/internal/ff/core/a;->a()Z

    move-result v2

    .line 6
    sget-object v3, Lkotlin/random/Random;->Default:Lkotlin/random/Random$Default;

    const-wide/16 v4, -0x64

    const-wide/16 v6, 0x64

    invoke-virtual {v3, v4, v5, v6, v7}, Lkotlin/random/Random$Default;->nextLong(JJ)J

    const/4 v3, 0x0

    const-string v4, "FaceDetectorFactory"

    if-eqz p0, :cond_2

    .line 7
    sget-object v5, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 8
    iget-object v6, v5, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 9
    const-string v7, "@isTensorflowDisabled, Checking is TF disabled"

    invoke-virtual {v6, v4, v7, v3}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    if-nez v2, :cond_0

    .line 10
    iget-object v2, v5, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 11
    const-string v5, "@isTensorflowDisabled, disabled with FF"

    invoke-virtual {v2, v4, v5, v3}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0

    .line 12
    :cond_0
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v6, 0x1a

    if-ge v2, v6, :cond_1

    .line 13
    iget-object v2, v5, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 14
    const-string v5, "@isTensorflowDisabled, old Android version"

    invoke-virtual {v2, v4, v5, v3}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0

    .line 15
    :cond_1
    :try_start_0
    const-string/jumbo v2, "tensorflowlite_jni"

    invoke-static {v2}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V

    .line 16
    const-string v2, "@isTensorflowDisabled, TF library found"

    .line 17
    iget-object v5, v5, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 18
    invoke-virtual {v5, v4, v2, v3}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    new-instance v2, Lcom/sumsub/sns/internal/core/domain/facedetector/s;

    invoke-direct {v2, p0}, Lcom/sumsub/sns/internal/core/domain/facedetector/s;-><init>(Landroid/content/Context;)V

    const-string v5, "TensorFlow"

    invoke-static {v0, v5, v2}, Lcom/sumsub/sns/internal/core/domain/facedetector/f;->a(Ljava/util/concurrent/LinkedBlockingQueue;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    goto :goto_0

    .line 20
    :catchall_0
    sget-object v2, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 21
    iget-object v2, v2, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 22
    const-string v5, "@isTensorflowDisabled, TF library is missing"

    invoke-virtual {v2, v4, v5, v3}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 23
    :cond_2
    :goto_0
    sget-object v2, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 24
    iget-object v5, v2, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 25
    const-string v6, "@isMlKitDisabled, Checking is MLKit disabled"

    invoke-virtual {v5, v4, v6, v3}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    if-nez v1, :cond_3

    .line 26
    iget-object p0, v2, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 27
    const-string v1, "@isMlKitDisabled, disabled with FF"

    invoke-virtual {p0, v4, v1, v3}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_1

    .line 28
    :cond_3
    sget-object v1, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    if-eqz v1, :cond_4

    sget-object v5, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v1, v5}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_4

    const/4 v5, 0x0

    const/4 v6, 0x2

    const-string v7, "huawei"

    invoke-static {v1, v7, v5, v6, v3}, Lkotlin/text/StringsKt;->contains$default(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v1

    const/4 v5, 0x1

    if-ne v1, v5, :cond_4

    .line 29
    iget-object p0, v2, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 30
    const-string v1, "@isMlKitDisabled, disabled - manufacturer is Huawei"

    invoke-virtual {p0, v4, v1, v3}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_1

    .line 31
    :cond_4
    invoke-static {p0}, Lcom/sumsub/sns/internal/core/domain/facedetector/f;->a(Landroid/content/Context;)Z

    move-result p0

    if-nez p0, :cond_5

    .line 32
    iget-object p0, v2, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 33
    const-string v1, "@isMlKitDisabled, disabled - no connection to GP Services"

    invoke-virtual {p0, v4, v1, v3}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_1

    .line 34
    :cond_5
    :try_start_1
    const-string p0, "com.google.mlkit.vision.face.FaceDetection"

    invoke-static {p0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 35
    const-string p0, "MLKit class found"

    .line 36
    iget-object v1, v2, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 37
    invoke-virtual {v1, v4, p0, v3}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 38
    new-instance p0, Lcom/sumsub/sns/internal/core/domain/facedetector/t;

    invoke-direct {p0}, Lcom/sumsub/sns/internal/core/domain/facedetector/t;-><init>()V

    const-string v1, "MLKit"

    invoke-static {v0, v1, p0}, Lcom/sumsub/sns/internal/core/domain/facedetector/f;->a(Ljava/util/concurrent/LinkedBlockingQueue;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    goto :goto_1

    :catchall_1
    move-exception p0

    .line 39
    sget-object v1, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 40
    iget-object v1, v1, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 41
    const-string v2, "Can\'t use MLKit detector"

    invoke-virtual {v1, v4, v2, p0}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 42
    :goto_1
    new-instance p0, Lcom/sumsub/sns/internal/core/domain/facedetector/u;

    invoke-direct {p0}, Lcom/sumsub/sns/internal/core/domain/facedetector/u;-><init>()V

    const-string v1, "Native"

    invoke-static {v0, v1, p0}, Lcom/sumsub/sns/internal/core/domain/facedetector/f;->a(Ljava/util/concurrent/LinkedBlockingQueue;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 43
    new-instance p0, Lcom/sumsub/sns/internal/core/domain/facedetector/d;

    invoke-direct {p0, v0}, Lcom/sumsub/sns/internal/core/domain/facedetector/d;-><init>(Ljava/util/concurrent/LinkedBlockingQueue;)V

    return-object p0
.end method

.method public static final b()Lcom/sumsub/sns/internal/core/domain/facedetector/g;
    .locals 1

    .line 44
    new-instance v0, Lcom/sumsub/sns/internal/core/domain/facedetector/i;

    invoke-direct {v0}, Lcom/sumsub/sns/internal/core/domain/facedetector/i;-><init>()V

    return-object v0
.end method

.method public static final c(Landroid/content/Context;)Lcom/sumsub/sns/internal/core/domain/facedetector/g;
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/sumsub/sns/internal/core/domain/facedetector/r;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 6
    move-result-object p0

    .line 7
    .line 8
    .line 9
    invoke-direct {v0, p0}, Lcom/sumsub/sns/internal/core/domain/facedetector/r;-><init>(Landroid/content/Context;)V

    .line 10
    return-object v0
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
