.class public abstract Lcom/sumsub/sentry/Y;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# static fields
.field public static a:Z

.field public static b:Ljava/lang/String;

.field public static c:Lcom/sumsub/sentry/t0;


# direct methods
.method public static a(Landroid/content/Context;Lcom/sumsub/sns/internal/log/cacher/c;)V
    .locals 7

    .line 4
    sget-boolean v0, Lcom/sumsub/sentry/Y;->a:Z

    const/4 v1, 0x1

    .line 5
    sput-boolean v1, Lcom/sumsub/sentry/Y;->a:Z

    if-eqz v0, :cond_0

    return-void

    .line 6
    :cond_0
    const-string v0, "60aff167-da40-4d53-8e62-aa8260b8dbac"

    sput-object v0, Lcom/sumsub/sentry/Y;->b:Ljava/lang/String;

    .line 7
    sget-object v1, Lcom/sumsub/sns/internal/log/c;->a:Lcom/sumsub/sns/internal/log/c;

    sget-object v0, Lcom/sumsub/sentry/Y;->b:Ljava/lang/String;

    if-nez v0, :cond_1

    const-string v0, "<not set>"

    :cond_1
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "SDK build UUID: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v5, 0x4

    const/4 v6, 0x0

    const-string v2, "Sentry"

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Lcom/sumsub/log/logger/Logger$DefaultImpls;->d$default(Lcom/sumsub/log/logger/Logger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 8
    new-instance v0, Lcom/sumsub/sentry/t0;

    .line 9
    new-instance v1, Lcom/sumsub/sentry/c0;

    invoke-direct {v1, p0}, Lcom/sumsub/sentry/c0;-><init>(Landroid/content/Context;)V

    .line 10
    invoke-direct {v0, v1, p1}, Lcom/sumsub/sentry/t0;-><init>(Lcom/sumsub/sentry/c0;Lcom/sumsub/sns/internal/log/cacher/c;)V

    sput-object v0, Lcom/sumsub/sentry/Y;->c:Lcom/sumsub/sentry/t0;

    return-void
.end method

.method public static a(Lcom/sumsub/sns/internal/core/exception/SNSCallbacksLostOnRestoreException;)V
    .locals 13

    .line 1
    sget-object v0, Lcom/sumsub/sentry/Y;->c:Lcom/sumsub/sentry/t0;

    if-nez v0, :cond_0

    .line 2
    sget-object v1, Lcom/sumsub/sns/internal/log/c;->a:Lcom/sumsub/sns/internal/log/c;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "captureException called before init; dropping "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v5, 0x4

    const/4 v6, 0x0

    const-string v2, "Sentry"

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Lcom/sumsub/log/logger/Logger$DefaultImpls;->w$default(Lcom/sumsub/log/logger/Logger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    return-void

    .line 3
    :cond_0
    iget-object v7, v0, Lcom/sumsub/sentry/t0;->c:Lkotlinx/coroutines/m0;

    new-instance v10, Lcom/sumsub/sentry/s0;

    const/4 v1, 0x0

    invoke-direct {v10, v0, p0, v1}, Lcom/sumsub/sentry/s0;-><init>(Lcom/sumsub/sentry/t0;Lcom/sumsub/sns/internal/core/exception/SNSCallbacksLostOnRestoreException;Lkotlin/coroutines/Continuation;)V

    const/4 v11, 0x3

    const/4 v12, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-static/range {v7 .. v12}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    return-void
.end method
