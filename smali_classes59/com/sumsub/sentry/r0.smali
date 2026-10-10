.class public final Lcom/sumsub/sentry/r0;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# instance fields
.field public final a:Lcom/sumsub/sentry/Q0;


# direct methods
.method public constructor <init>(Lcom/sumsub/sentry/Q0;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput-object p1, p0, Lcom/sumsub/sentry/r0;->a:Lcom/sumsub/sentry/Q0;

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


# virtual methods
.method public final a(Ljava/lang/Throwable;Lcom/sumsub/sentry/J;Ljava/lang/Thread;Z)Lcom/sumsub/sentry/q0;
    .locals 10

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getPackage()Ljava/lang/Package;

    move-result-object v0

    .line 2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    .line 3
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    if-eqz v0, :cond_0

    .line 4
    invoke-virtual {v0}, Ljava/lang/Package;->getName()Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "."

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v6, 0x4

    const/4 v7, 0x0

    const-string v4, ""

    const/4 v5, 0x0

    invoke-static/range {v2 .. v7}, Lkotlin/text/StringsKt;->replace$default(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    :cond_0
    move-object v4, v2

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    .line 5
    invoke-virtual {v0}, Ljava/lang/Package;->getName()Ljava/lang/String;

    move-result-object v0

    move-object v6, v0

    goto :goto_0

    :cond_1
    move-object v6, v2

    .line 6
    :goto_0
    iget-object v0, p0, Lcom/sumsub/sentry/r0;->a:Lcom/sumsub/sentry/Q0;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getStackTrace()[Ljava/lang/StackTraceElement;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/sumsub/sentry/Q0;->a([Ljava/lang/StackTraceElement;)Ljava/util/ArrayList;

    move-result-object p1

    if-eqz p1, :cond_4

    .line 7
    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    move-object v0, p1

    goto :goto_1

    :cond_2
    move-object v0, v2

    :goto_1
    if-eqz v0, :cond_4

    .line 8
    invoke-static {p4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    if-eqz p4, :cond_3

    goto :goto_2

    :cond_3
    move-object v0, v2

    .line 9
    :goto_2
    new-instance p4, Lcom/sumsub/sentry/N0;

    invoke-direct {p4, p1, v0}, Lcom/sumsub/sentry/N0;-><init>(Ljava/util/ArrayList;Ljava/lang/Boolean;)V

    move-object v8, p4

    goto :goto_3

    :cond_4
    move-object v8, v2

    :goto_3
    if-eqz p3, :cond_5

    .line 10
    invoke-virtual {p3}, Ljava/lang/Thread;->getId()J

    move-result-wide p3

    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    :cond_5
    move-object v7, v2

    .line 11
    new-instance v3, Lcom/sumsub/sentry/q0;

    move-object v9, p2

    move-object v5, v1

    invoke-direct/range {v3 .. v9}, Lcom/sumsub/sentry/q0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Lcom/sumsub/sentry/N0;Lcom/sumsub/sentry/J;)V

    return-object v3
.end method

.method public final a(Lcom/sumsub/sentry/y;)Ljava/util/ArrayList;
    .locals 6

    .line 12
    new-instance v0, Ljava/util/ArrayDeque;

    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    .line 13
    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    :goto_0
    if-eqz p1, :cond_1

    .line 14
    invoke-virtual {v1, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 15
    instance-of v2, p1, Lcom/sumsub/sentry/y;

    if-eqz v2, :cond_0

    .line 16
    check-cast p1, Lcom/sumsub/sentry/y;

    .line 17
    iget-object v2, p1, Lcom/sumsub/sentry/y;->a:Lcom/sumsub/sentry/J;

    .line 18
    iget-object v3, p1, Lcom/sumsub/sentry/y;->b:Ljava/lang/Throwable;

    .line 19
    iget-object p1, p1, Lcom/sumsub/sentry/y;->c:Ljava/lang/Thread;

    move-object v5, v2

    move-object v2, p1

    move-object p1, v3

    move-object v3, v5

    goto :goto_1

    .line 20
    :cond_0
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v2

    const/4 v3, 0x0

    :goto_1
    const/4 v4, 0x0

    .line 21
    invoke-virtual {p0, p1, v3, v2, v4}, Lcom/sumsub/sentry/r0;->a(Ljava/lang/Throwable;Lcom/sumsub/sentry/J;Ljava/lang/Thread;Z)Lcom/sumsub/sentry/q0;

    move-result-object v2

    .line 22
    invoke-virtual {v0, v2}, Ljava/util/ArrayDeque;->addFirst(Ljava/lang/Object;)V

    .line 23
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object p1

    goto :goto_0

    .line 24
    :cond_1
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    return-object p1
.end method
