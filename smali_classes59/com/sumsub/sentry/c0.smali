.class public final Lcom/sumsub/sentry/c0;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Lcom/sumsub/sentry/G;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput-object p1, p0, Lcom/sumsub/sentry/c0;->a:Landroid/content/Context;

    .line 6
    .line 7
    new-instance p1, Lcom/sumsub/sentry/G;

    .line 8
    .line 9
    sget-object v0, Lcom/sumsub/sentry/D;->i:Lkotlin/Lazy;

    .line 10
    .line 11
    .line 12
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 13
    move-result-object v0

    .line 14
    .line 15
    check-cast v0, Lcom/sumsub/sentry/D;

    .line 16
    .line 17
    .line 18
    invoke-direct {p1, v0}, Lcom/sumsub/sentry/G;-><init>(Lcom/sumsub/sentry/D;)V

    .line 19
    .line 20
    iput-object p1, p0, Lcom/sumsub/sentry/c0;->b:Lcom/sumsub/sentry/G;

    .line 21
    return-void
    .line 22
    .line 23
    .line 24
    .line 25
.end method


# virtual methods
.method public final a(Lcom/sumsub/sentry/y;Ljava/lang/String;)Lcom/sumsub/sentry/b0;
    .locals 7

    const/4 v0, 0x0

    .line 14
    :try_start_0
    new-instance v1, Lcom/sumsub/sentry/n0;

    invoke-direct {v1}, Lcom/sumsub/sentry/n0;-><init>()V

    .line 15
    iput-object p1, v1, Lcom/sumsub/sentry/a0;->l:Lcom/sumsub/sentry/y;

    .line 16
    new-instance p1, Lcom/sumsub/sentry/android/e;

    .line 17
    iget-object v2, p0, Lcom/sumsub/sentry/c0;->a:Landroid/content/Context;

    .line 18
    new-instance v3, Lcom/sumsub/sentry/android/a;

    invoke-direct {v3}, Lcom/sumsub/sentry/android/a;-><init>()V

    .line 19
    new-instance v4, Lcom/sumsub/sentry/android/g;

    iget-object v5, p0, Lcom/sumsub/sentry/c0;->a:Landroid/content/Context;

    const/16 v6, 0x1e

    invoke-direct {v4, v5, v0, v6}, Lcom/sumsub/sentry/android/g;-><init>(Landroid/content/Context;Lcom/sumsub/sentry/android/a;I)V

    .line 20
    invoke-direct {p1, v2, v3, v4, p2}, Lcom/sumsub/sentry/android/e;-><init>(Landroid/content/Context;Lcom/sumsub/sentry/android/a;Lcom/sumsub/sentry/android/g;Ljava/lang/String;)V

    .line 21
    iget-object p2, p0, Lcom/sumsub/sentry/c0;->b:Lcom/sumsub/sentry/G;

    invoke-virtual {p2, v1}, Lcom/sumsub/sentry/G;->a(Lcom/sumsub/sentry/n0;)Lcom/sumsub/sentry/n0;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/sumsub/sentry/android/e;->b(Lcom/sumsub/sentry/n0;)Lcom/sumsub/sentry/n0;

    move-result-object p1

    .line 22
    new-instance p2, Lcom/sumsub/sentry/b0;

    .line 23
    new-instance v1, Lcom/sumsub/sentry/f0;

    .line 24
    iget-object v2, p1, Lcom/sumsub/sentry/n0;->o:Ljava/lang/String;

    .line 25
    invoke-direct {v1, v2}, Lcom/sumsub/sentry/f0;-><init>(Ljava/lang/String;)V

    .line 26
    invoke-static {p1}, Lcom/sumsub/sentry/g0;->a(Lcom/sumsub/sentry/n0;)Lcom/sumsub/sentry/h0;

    move-result-object p1

    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    .line 27
    invoke-direct {p2, v1, p1}, Lcom/sumsub/sentry/b0;-><init>(Lcom/sumsub/sentry/f0;Ljava/util/List;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p2

    :catchall_0
    move-exception p1

    .line 28
    sget-object p2, Lcom/sumsub/sns/internal/log/c;->c:Lcom/sumsub/sns/internal/log/logger/k;

    const-string v1, "SentryEnvelopeFactory"

    const-string v2, "Failed to create event"

    invoke-virtual {p2, v1, v2, p1}, Lcom/sumsub/sns/internal/log/logger/k;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-object v0
.end method

.method public final a(Lcom/sumsub/sns/internal/core/exception/SNSCallbacksLostOnRestoreException;)Lcom/sumsub/sentry/b0;
    .locals 7

    .line 7
    sget-object v0, Lcom/sumsub/sns/internal/log/c;->a:Lcom/sumsub/sns/internal/log/c;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v2, "prepare handled envelope: applicantId="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v6, 0x0

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " exception="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v4, 0x4

    const/4 v5, 0x0

    const-string v1, "SentryEnvelopeFactory"

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, Lcom/sumsub/log/logger/Logger$DefaultImpls;->d$default(Lcom/sumsub/log/logger/Logger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 8
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    .line 9
    new-instance v1, Lcom/sumsub/sentry/J;

    .line 10
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 11
    const-string v3, "SNSSDK"

    invoke-direct {v1, v3, v2}, Lcom/sumsub/sentry/J;-><init>(Ljava/lang/String;Ljava/lang/Boolean;)V

    .line 12
    new-instance v2, Lcom/sumsub/sentry/y;

    invoke-direct {v2, v1, p1, v0}, Lcom/sumsub/sentry/y;-><init>(Lcom/sumsub/sentry/J;Ljava/lang/Throwable;Ljava/lang/Thread;)V

    .line 13
    invoke-virtual {p0, v2, v6}, Lcom/sumsub/sentry/c0;->a(Lcom/sumsub/sentry/y;Ljava/lang/String;)Lcom/sumsub/sentry/b0;

    move-result-object p1

    return-object p1
.end method

.method public final a(Ljava/lang/Thread;Ljava/lang/Throwable;Ljava/lang/String;)Lcom/sumsub/sentry/b0;
    .locals 6

    .line 1
    sget-object v0, Lcom/sumsub/sns/internal/log/c;->a:Lcom/sumsub/sns/internal/log/c;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v2, "prepare unhandled envelope: applicantId="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " exception="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v4, 0x4

    const/4 v5, 0x0

    const-string v1, "SentryEnvelopeFactory"

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, Lcom/sumsub/log/logger/Logger$DefaultImpls;->d$default(Lcom/sumsub/log/logger/Logger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 2
    new-instance v0, Lcom/sumsub/sentry/J;

    .line 3
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 4
    const-string v2, "UncaughtExceptionHandler"

    invoke-direct {v0, v2, v1}, Lcom/sumsub/sentry/J;-><init>(Ljava/lang/String;Ljava/lang/Boolean;)V

    .line 5
    new-instance v1, Lcom/sumsub/sentry/y;

    invoke-direct {v1, v0, p2, p1}, Lcom/sumsub/sentry/y;-><init>(Lcom/sumsub/sentry/J;Ljava/lang/Throwable;Ljava/lang/Thread;)V

    .line 6
    invoke-virtual {p0, v1, p3}, Lcom/sumsub/sentry/c0;->a(Lcom/sumsub/sentry/y;Ljava/lang/String;)Lcom/sumsub/sentry/b0;

    move-result-object p1

    return-object p1
.end method
