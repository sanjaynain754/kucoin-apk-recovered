.class public final Lcom/sumsub/sns/internal/core/exception/d;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"

# interfaces
.implements Lcom/sumsub/sns/internal/core/exception/e;


# instance fields
.field public final a:Lcom/sumsub/sns/internal/log/cacher/l;


# direct methods
.method public constructor <init>(Lcom/sumsub/sns/internal/log/cacher/l;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput-object p1, p0, Lcom/sumsub/sns/internal/core/exception/d;->a:Lcom/sumsub/sns/internal/log/cacher/l;

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

.method public static a(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/sumsub/sns/internal/features/data/model/common/LogParams;
    .locals 14

    .line 3
    new-instance v0, Ljava/io/StringWriter;

    invoke-direct {v0}, Ljava/io/StringWriter;-><init>()V

    .line 4
    new-instance v1, Ljava/io/PrintWriter;

    invoke-direct {v1, v0}, Ljava/io/PrintWriter;-><init>(Ljava/io/Writer;)V

    invoke-virtual {p1, v1}, Ljava/lang/Throwable;->printStackTrace(Ljava/io/PrintWriter;)V

    .line 5
    invoke-virtual {p1}, Ljava/lang/Throwable;->getStackTrace()[Ljava/lang/StackTraceElement;

    move-result-object v1

    invoke-static {v1}, Lkotlin/collections/ArraysKt;->firstOrNull([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/StackTraceElement;

    if-eqz v1, :cond_1

    .line 6
    invoke-virtual {v1}, Ljava/lang/StackTraceElement;->getFileName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, Ljava/lang/StackTraceElement;->getLineNumber()I

    move-result v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ":"

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_0

    goto :goto_1

    :cond_0
    :goto_0
    move-object v5, v2

    goto :goto_2

    :cond_1
    :goto_1
    const-string/jumbo v2, "unknown"

    goto :goto_0

    :goto_2
    if-eqz v1, :cond_2

    .line 7
    invoke-virtual {v1}, Ljava/lang/StackTraceElement;->getFileName()Ljava/lang/String;

    move-result-object v1

    :goto_3
    move-object v7, v1

    goto :goto_4

    :cond_2
    const/4 v1, 0x0

    goto :goto_3

    :goto_4
    const-string v1, ""

    if-nez p0, :cond_3

    move-object v8, v1

    goto :goto_5

    :cond_3
    move-object v8, p0

    .line 8
    :goto_5
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p0

    if-nez p0, :cond_4

    move-object v9, v1

    goto :goto_6

    :cond_4
    move-object v9, p0

    .line 9
    :goto_6
    invoke-virtual {v0}, Ljava/io/StringWriter;->toString()Ljava/lang/String;

    move-result-object v11

    .line 10
    new-instance v3, Lcom/sumsub/sns/internal/features/data/model/common/LogParams;

    const/16 v12, 0x40

    const/4 v13, 0x0

    const-string/jumbo v4, "uncaughtException"

    const/4 v6, 0x0

    const/4 v10, 0x0

    invoke-direct/range {v3 .. v13}, Lcom/sumsub/sns/internal/features/data/model/common/LogParams;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v3
.end method


# virtual methods
.method public final a(Ljava/lang/Thread;Ljava/lang/Throwable;Ljava/lang/String;Lcom/sumsub/sns/internal/core/exception/f;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-static {p3, p2}, Lcom/sumsub/sns/internal/core/exception/d;->a(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/sumsub/sns/internal/features/data/model/common/LogParams;

    move-result-object p1

    .line 2
    iget-object p2, p0, Lcom/sumsub/sns/internal/core/exception/d;->a:Lcom/sumsub/sns/internal/log/cacher/l;

    invoke-virtual {p2, p1, p4}, Lcom/sumsub/sns/internal/log/cacher/l;->send(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
