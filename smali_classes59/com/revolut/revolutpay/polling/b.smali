.class public final Lcom/revolut/revolutpay/polling/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/revolut/revolutpay/polling/b$a;
    }
.end annotation


# instance fields
.field public final a:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final b:Lcom/revolut/revolutpay/polling/a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final c:Lcom/revolut/revolutpay/polling/d;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final d:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final e:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/lang/Throwable;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final f:Lja0/d;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final g:Lcom/revolut/revolutpay/polling/i;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final h:J

.field public final i:J

.field public final j:Ljava/util/concurrent/TimeUnit;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final k:Lcom/revolut/revolutpay/polling/b$a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public l:Ljava/lang/Long;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/revolut/revolutpay/polling/a;Lcom/revolut/revolutpay/polling/d;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lja0/d;Lcom/revolut/revolutpay/polling/i;JJLjava/util/concurrent/TimeUnit;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/revolut/revolutpay/polling/a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lcom/revolut/revolutpay/polling/d;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lkotlin/jvm/functions/Function1;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p5    # Lkotlin/jvm/functions/Function1;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p6    # Lja0/d;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p7    # Lcom/revolut/revolutpay/polling/i;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p12    # Ljava/util/concurrent/TimeUnit;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/revolut/revolutpay/polling/a;",
            "Lcom/revolut/revolutpay/polling/d;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Throwable;",
            "Lkotlin/Unit;",
            ">;",
            "Lja0/d;",
            "Lcom/revolut/revolutpay/polling/i;",
            "JJ",
            "Ljava/util/concurrent/TimeUnit;",
            ")V"
        }
    .end annotation

    .line 1
    const-string/jumbo v0, "orderToken"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "lifecycleProxy"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "schedulerService"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "onCompletedState"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "onErrorHappened"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "apiService"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "timestampProvider"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "timeUnit"

    invoke-static {p12, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/revolut/revolutpay/polling/b;->a:Ljava/lang/String;

    iput-object p2, p0, Lcom/revolut/revolutpay/polling/b;->b:Lcom/revolut/revolutpay/polling/a;

    iput-object p3, p0, Lcom/revolut/revolutpay/polling/b;->c:Lcom/revolut/revolutpay/polling/d;

    iput-object p4, p0, Lcom/revolut/revolutpay/polling/b;->d:Lkotlin/jvm/functions/Function1;

    iput-object p5, p0, Lcom/revolut/revolutpay/polling/b;->e:Lkotlin/jvm/functions/Function1;

    iput-object p6, p0, Lcom/revolut/revolutpay/polling/b;->f:Lja0/d;

    iput-object p7, p0, Lcom/revolut/revolutpay/polling/b;->g:Lcom/revolut/revolutpay/polling/i;

    iput-wide p8, p0, Lcom/revolut/revolutpay/polling/b;->h:J

    iput-wide p10, p0, Lcom/revolut/revolutpay/polling/b;->i:J

    iput-object p12, p0, Lcom/revolut/revolutpay/polling/b;->j:Ljava/util/concurrent/TimeUnit;

    new-instance p1, Lcom/revolut/revolutpay/polling/b$a;

    invoke-direct {p1, p0}, Lcom/revolut/revolutpay/polling/b$a;-><init>(Lcom/revolut/revolutpay/polling/b;)V

    iput-object p1, p0, Lcom/revolut/revolutpay/polling/b;->k:Lcom/revolut/revolutpay/polling/b$a;

    invoke-virtual {p2, p1}, Lcom/revolut/revolutpay/polling/a;->b(Lcom/revolut/revolutpay/polling/c;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Lcom/revolut/revolutpay/polling/a;Lcom/revolut/revolutpay/polling/d;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lja0/d;Lcom/revolut/revolutpay/polling/i;JJLjava/util/concurrent/TimeUnit;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 15

    move/from16 v0, p13

    and-int/lit8 v1, v0, 0x40

    if-eqz v1, :cond_0

    .line 2
    new-instance v1, Lcom/revolut/revolutpay/polling/i;

    invoke-direct {v1}, Lcom/revolut/revolutpay/polling/i;-><init>()V

    move-object v9, v1

    goto :goto_0

    :cond_0
    move-object/from16 v9, p7

    :goto_0
    and-int/lit16 v1, v0, 0x80

    if-eqz v1, :cond_1

    const-wide/16 v1, 0x3

    move-wide v10, v1

    goto :goto_1

    :cond_1
    move-wide/from16 v10, p8

    :goto_1
    and-int/lit16 v1, v0, 0x100

    if-eqz v1, :cond_2

    const-wide/16 v1, 0x258

    move-wide v12, v1

    goto :goto_2

    :cond_2
    move-wide/from16 v12, p10

    :goto_2
    and-int/lit16 v0, v0, 0x200

    if-eqz v0, :cond_3

    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    move-object v14, v0

    :goto_3
    move-object v2, p0

    move-object/from16 v3, p1

    move-object/from16 v4, p2

    move-object/from16 v5, p3

    move-object/from16 v6, p4

    move-object/from16 v7, p5

    move-object/from16 v8, p6

    goto :goto_4

    :cond_3
    move-object/from16 v14, p12

    goto :goto_3

    :goto_4
    invoke-direct/range {v2 .. v14}, Lcom/revolut/revolutpay/polling/b;-><init>(Ljava/lang/String;Lcom/revolut/revolutpay/polling/a;Lcom/revolut/revolutpay/polling/d;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lja0/d;Lcom/revolut/revolutpay/polling/i;JJLjava/util/concurrent/TimeUnit;)V

    return-void
.end method

.method public static final synthetic c(Lcom/revolut/revolutpay/polling/b;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/revolut/revolutpay/polling/b;->k()V

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
    .line 23
    .line 24
    .line 25
.end method

.method public static final synthetic d(Lcom/revolut/revolutpay/polling/b;Ljava/lang/Throwable;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/revolut/revolutpay/polling/b;->e(Ljava/lang/Throwable;)V

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
.end method

.method public static final synthetic f(Lcom/revolut/revolutpay/polling/b;)Lja0/d;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/revolut/revolutpay/polling/b;->f:Lja0/d;

    .line 3
    return-object p0
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
    .line 23
    .line 24
    .line 25
.end method

.method public static final synthetic h(Lcom/revolut/revolutpay/polling/b;)Lkotlin/jvm/functions/Function1;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/revolut/revolutpay/polling/b;->d:Lkotlin/jvm/functions/Function1;

    .line 3
    return-object p0
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
    .line 23
    .line 24
    .line 25
.end method

.method public static final synthetic j(Lcom/revolut/revolutpay/polling/b;)Lkotlin/jvm/functions/Function1;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/revolut/revolutpay/polling/b;->e:Lkotlin/jvm/functions/Function1;

    .line 3
    return-object p0
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
    .line 23
    .line 24
    .line 25
.end method

.method public static final synthetic l(Lcom/revolut/revolutpay/polling/b;)Ljava/lang/String;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/revolut/revolutpay/polling/b;->a:Ljava/lang/String;

    .line 3
    return-object p0
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
    .line 23
    .line 24
    .line 25
.end method

.method public static final synthetic o(Lcom/revolut/revolutpay/polling/b;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/revolut/revolutpay/polling/b;->m()V

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
    .line 23
    .line 24
    .line 25
.end method

.method public static final synthetic p(Lcom/revolut/revolutpay/polling/b;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/revolut/revolutpay/polling/b;->n()V

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
    .line 23
    .line 24
    .line 25
.end method


# virtual methods
.method public final a(J)J
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/revolut/revolutpay/polling/b;->j:Ljava/util/concurrent/TimeUnit;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p1, p2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    .line 6
    move-result-wide p1

    .line 7
    return-wide p1
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

.method public b()V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/revolut/revolutpay/polling/b;->c:Lcom/revolut/revolutpay/polling/d;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lcom/revolut/revolutpay/polling/d;->a()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/revolut/revolutpay/polling/b;->k()V

    .line 9
    return-void
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public final e(Ljava/lang/Throwable;)V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/revolut/revolutpay/polling/b;->c:Lcom/revolut/revolutpay/polling/d;

    .line 3
    .line 4
    new-instance v1, Lcom/revolut/revolutpay/polling/b$d;

    .line 5
    .line 6
    .line 7
    invoke-direct {v1, p0, p1}, Lcom/revolut/revolutpay/polling/b$d;-><init>(Lcom/revolut/revolutpay/polling/b;Ljava/lang/Throwable;)V

    .line 8
    .line 9
    .line 10
    invoke-interface {v0, v1}, Lcom/revolut/revolutpay/polling/d;->c(Lkotlin/jvm/functions/Function0;)Z

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Lcom/revolut/revolutpay/polling/b;->i()V

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
.end method

.method public g()V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/revolut/revolutpay/polling/b;->c:Lcom/revolut/revolutpay/polling/d;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lcom/revolut/revolutpay/polling/d;->pause()V

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
.end method

.method public i()V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/revolut/revolutpay/polling/b;->c:Lcom/revolut/revolutpay/polling/d;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lcom/revolut/revolutpay/polling/d;->stop()V

    .line 6
    const/4 v0, 0x0

    .line 7
    .line 8
    iput-object v0, p0, Lcom/revolut/revolutpay/polling/b;->l:Ljava/lang/Long;

    .line 9
    .line 10
    iget-object v0, p0, Lcom/revolut/revolutpay/polling/b;->b:Lcom/revolut/revolutpay/polling/a;

    .line 11
    .line 12
    iget-object v1, p0, Lcom/revolut/revolutpay/polling/b;->k:Lcom/revolut/revolutpay/polling/b$a;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, v1}, Lcom/revolut/revolutpay/polling/a;->c(Lcom/revolut/revolutpay/polling/c;)V

    .line 16
    return-void
    .line 17
.end method

.method public final k()V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/revolut/revolutpay/polling/b;->l:Ljava/lang/Long;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    new-instance v0, Lcom/revolut/revolutpay/api/exceptions/OrderStateException;

    .line 7
    .line 8
    const-string v1, "Cannot get the order state"

    .line 9
    .line 10
    .line 11
    invoke-direct {v0, v1}, Lcom/revolut/revolutpay/api/exceptions/OrderStateException;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, v0}, Lcom/revolut/revolutpay/polling/b;->e(Ljava/lang/Throwable;)V

    .line 15
    return-void

    .line 16
    .line 17
    :cond_0
    iget-object v0, p0, Lcom/revolut/revolutpay/polling/b;->c:Lcom/revolut/revolutpay/polling/d;

    .line 18
    .line 19
    new-instance v1, Lcom/revolut/revolutpay/polling/b$b;

    .line 20
    .line 21
    .line 22
    invoke-direct {v1, p0}, Lcom/revolut/revolutpay/polling/b$b;-><init>(Lcom/revolut/revolutpay/polling/b;)V

    .line 23
    .line 24
    .line 25
    invoke-interface {v0, v1}, Lcom/revolut/revolutpay/polling/d;->b(Lkotlin/jvm/functions/Function0;)Z

    .line 26
    return-void
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
    .line 43
    .line 44
    .line 45
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
.end method

.method public final m()V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/revolut/revolutpay/polling/b;->c:Lcom/revolut/revolutpay/polling/d;

    .line 3
    .line 4
    new-instance v1, Lcom/revolut/revolutpay/polling/b$c;

    .line 5
    .line 6
    .line 7
    invoke-direct {v1, p0}, Lcom/revolut/revolutpay/polling/b$c;-><init>(Lcom/revolut/revolutpay/polling/b;)V

    .line 8
    .line 9
    .line 10
    invoke-interface {v0, v1}, Lcom/revolut/revolutpay/polling/d;->c(Lkotlin/jvm/functions/Function0;)Z

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Lcom/revolut/revolutpay/polling/b;->i()V

    .line 14
    return-void
    .line 15
    .line 16
    .line 17
.end method

.method public final n()V
    .locals 5

    .line 1
    .line 2
    iget-object v0, p0, Lcom/revolut/revolutpay/polling/b;->l:Ljava/lang/Long;

    .line 3
    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    .line 8
    move-result-wide v0

    .line 9
    .line 10
    iget-wide v2, p0, Lcom/revolut/revolutpay/polling/b;->i:J

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, v2, v3}, Lcom/revolut/revolutpay/polling/b;->a(J)J

    .line 14
    move-result-wide v2

    .line 15
    add-long/2addr v0, v2

    .line 16
    .line 17
    iget-object v2, p0, Lcom/revolut/revolutpay/polling/b;->g:Lcom/revolut/revolutpay/polling/i;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v2}, Lcom/revolut/revolutpay/polling/i;->a()J

    .line 21
    move-result-wide v2

    .line 22
    sub-long/2addr v0, v2

    .line 23
    .line 24
    iget-wide v2, p0, Lcom/revolut/revolutpay/polling/b;->h:J

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0, v2, v3}, Lcom/revolut/revolutpay/polling/b;->a(J)J

    .line 28
    move-result-wide v2

    .line 29
    .line 30
    .line 31
    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->min(JJ)J

    .line 32
    move-result-wide v0

    .line 33
    .line 34
    const-wide/16 v2, 0x0

    .line 35
    .line 36
    cmp-long v2, v0, v2

    .line 37
    .line 38
    if-lez v2, :cond_0

    .line 39
    .line 40
    iget-object v2, p0, Lcom/revolut/revolutpay/polling/b;->c:Lcom/revolut/revolutpay/polling/d;

    .line 41
    .line 42
    new-instance v3, Lcom/revolut/revolutpay/polling/b$e;

    .line 43
    .line 44
    .line 45
    invoke-direct {v3, p0}, Lcom/revolut/revolutpay/polling/b$e;-><init>(Ljava/lang/Object;)V

    .line 46
    .line 47
    sget-object v4, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 48
    .line 49
    .line 50
    invoke-interface {v2, v3, v0, v1, v4}, Lcom/revolut/revolutpay/polling/d;->a(Lkotlin/jvm/functions/Function0;JLjava/util/concurrent/TimeUnit;)Z

    .line 51
    return-void

    .line 52
    .line 53
    :cond_0
    new-instance v0, Lcom/revolut/revolutpay/api/exceptions/OrderStateException;

    .line 54
    .line 55
    const-string v1, "Timeout has passed"

    .line 56
    .line 57
    .line 58
    invoke-direct {v0, v1}, Lcom/revolut/revolutpay/api/exceptions/OrderStateException;-><init>(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {p0, v0}, Lcom/revolut/revolutpay/polling/b;->e(Ljava/lang/Throwable;)V

    .line 62
    :cond_1
    return-void
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
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
.end method

.method public q()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/revolut/revolutpay/polling/b;->i()V

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
.end method

.method public r()V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/revolut/revolutpay/polling/b;->c:Lcom/revolut/revolutpay/polling/d;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lcom/revolut/revolutpay/polling/d;->pause()V

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
.end method

.method public s()V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/revolut/revolutpay/polling/b;->g:Lcom/revolut/revolutpay/polling/i;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/revolut/revolutpay/polling/i;->a()J

    .line 6
    move-result-wide v0

    .line 7
    .line 8
    .line 9
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    iput-object v0, p0, Lcom/revolut/revolutpay/polling/b;->l:Ljava/lang/Long;

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Lcom/revolut/revolutpay/polling/b;->k()V

    .line 16
    return-void
    .line 17
.end method
