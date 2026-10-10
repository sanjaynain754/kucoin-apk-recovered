.class public final Lcom/sumsub/sns/internal/core/presentation/android/location/l;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# static fields
.field public static final e:J

.field public static final f:J


# instance fields
.field public final a:Lcom/sumsub/sns/internal/features/domain/utils/b;

.field public final b:Lkotlinx/coroutines/flow/n;

.field public final c:Lkotlinx/coroutines/flow/w;

.field public d:Lkotlinx/coroutines/w;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    sget-object v0, Lkotlin/time/Duration;->Companion:Lkotlin/time/Duration$Companion;

    .line 3
    .line 4
    sget-object v0, Lkotlin/time/DurationUnit;->MINUTES:Lkotlin/time/DurationUnit;

    .line 5
    .line 6
    const/16 v1, 0xa

    .line 7
    .line 8
    .line 9
    invoke-static {v1, v0}, Lkotlin/time/DurationKt;->toDuration(ILkotlin/time/DurationUnit;)J

    .line 10
    move-result-wide v0

    .line 11
    .line 12
    sput-wide v0, Lcom/sumsub/sns/internal/core/presentation/android/location/l;->e:J

    .line 13
    .line 14
    sget-object v0, Lkotlin/time/DurationUnit;->SECONDS:Lkotlin/time/DurationUnit;

    .line 15
    .line 16
    const/16 v1, 0x1e

    .line 17
    .line 18
    .line 19
    invoke-static {v1, v0}, Lkotlin/time/DurationKt;->toDuration(ILkotlin/time/DurationUnit;)J

    .line 20
    move-result-wide v0

    .line 21
    .line 22
    sput-wide v0, Lcom/sumsub/sns/internal/core/presentation/android/location/l;->f:J

    .line 23
    return-void
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

.method public constructor <init>(Lcom/sumsub/sns/internal/features/domain/utils/b;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput-object p1, p0, Lcom/sumsub/sns/internal/core/presentation/android/location/l;->a:Lcom/sumsub/sns/internal/features/domain/utils/b;

    .line 6
    .line 7
    sget-object p1, Lcom/sumsub/sns/internal/core/presentation/android/location/h;->a:Lcom/sumsub/sns/internal/core/presentation/android/location/h;

    .line 8
    .line 9
    .line 10
    invoke-static {p1}, Lkotlinx/coroutines/flow/x;->a(Ljava/lang/Object;)Lkotlinx/coroutines/flow/n;

    .line 11
    move-result-object p1

    .line 12
    .line 13
    iput-object p1, p0, Lcom/sumsub/sns/internal/core/presentation/android/location/l;->b:Lkotlinx/coroutines/flow/n;

    .line 14
    .line 15
    .line 16
    invoke-static {p1}, Lkotlinx/coroutines/flow/g;->c(Lkotlinx/coroutines/flow/n;)Lkotlinx/coroutines/flow/w;

    .line 17
    move-result-object p1

    .line 18
    .line 19
    iput-object p1, p0, Lcom/sumsub/sns/internal/core/presentation/android/location/l;->c:Lkotlinx/coroutines/flow/w;

    .line 20
    return-void
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
.end method


# virtual methods
.method public final a(Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 8

    instance-of v0, p1, Lcom/sumsub/sns/internal/core/presentation/android/location/j;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/sumsub/sns/internal/core/presentation/android/location/j;

    iget v1, v0, Lcom/sumsub/sns/internal/core/presentation/android/location/j;->c:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/sumsub/sns/internal/core/presentation/android/location/j;->c:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/sumsub/sns/internal/core/presentation/android/location/j;

    invoke-direct {v0, p0, p1}, Lcom/sumsub/sns/internal/core/presentation/android/location/j;-><init>(Lcom/sumsub/sns/internal/core/presentation/android/location/l;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object p1, v0, Lcom/sumsub/sns/internal/core/presentation/android/location/j;->a:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 1
    iget v2, v0, Lcom/sumsub/sns/internal/core/presentation/android/location/j;->c:I

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    :try_start_0
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 2
    invoke-static {v4, v3, v4}, Lkotlinx/coroutines/y;->c(Lkotlinx/coroutines/x1;ILjava/lang/Object;)Lkotlinx/coroutines/w;

    move-result-object p1

    iput-object p1, p0, Lcom/sumsub/sns/internal/core/presentation/android/location/l;->d:Lkotlinx/coroutines/w;

    .line 3
    iget-object v2, p0, Lcom/sumsub/sns/internal/core/presentation/android/location/l;->b:Lkotlinx/coroutines/flow/n;

    new-instance v5, Lcom/sumsub/sns/internal/core/presentation/android/location/g;

    sget-wide v6, Lcom/sumsub/sns/internal/core/presentation/android/location/l;->e:J

    invoke-direct {v5, v6, v7}, Lcom/sumsub/sns/internal/core/presentation/android/location/g;-><init>(J)V

    invoke-interface {v2, v5}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 4
    const-string v2, "acquireLocation: started"

    invoke-virtual {p0, v2}, Lcom/sumsub/sns/internal/core/presentation/android/location/l;->a(Ljava/lang/String;)V

    .line 5
    :try_start_1
    sget-wide v5, Lcom/sumsub/sns/internal/core/presentation/android/location/l;->f:J

    new-instance v2, Lcom/sumsub/sns/internal/core/presentation/android/location/k;

    invoke-direct {v2, p1, v4}, Lcom/sumsub/sns/internal/core/presentation/android/location/k;-><init>(Lkotlinx/coroutines/w;Lkotlin/coroutines/Continuation;)V

    iput v3, v0, Lcom/sumsub/sns/internal/core/presentation/android/location/j;->c:I

    invoke-static {v5, v6, v2, v0}, Lkotlinx/coroutines/TimeoutKt;->e(JLkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    .line 6
    :cond_3
    :goto_1
    check-cast p1, Lcom/sumsub/sns/internal/core/presentation/android/location/f;

    if-nez p1, :cond_4

    .line 7
    const-string v0, "acquireLocation: timed out"

    invoke-virtual {p0, v0}, Lcom/sumsub/sns/internal/core/presentation/android/location/l;->a(Ljava/lang/String;)V

    :cond_4
    if-nez p1, :cond_5

    .line 8
    sget-object p1, Lcom/sumsub/sns/internal/core/presentation/android/location/d;->a:Lcom/sumsub/sns/internal/core/presentation/android/location/d;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 9
    :cond_5
    iput-object v4, p0, Lcom/sumsub/sns/internal/core/presentation/android/location/l;->d:Lkotlinx/coroutines/w;

    .line 10
    iget-object v0, p0, Lcom/sumsub/sns/internal/core/presentation/android/location/l;->b:Lkotlinx/coroutines/flow/n;

    sget-object v1, Lcom/sumsub/sns/internal/core/presentation/android/location/h;->a:Lcom/sumsub/sns/internal/core/presentation/android/location/h;

    invoke-interface {v0, v1}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    return-object p1

    .line 11
    :goto_2
    iput-object v4, p0, Lcom/sumsub/sns/internal/core/presentation/android/location/l;->d:Lkotlinx/coroutines/w;

    .line 12
    iget-object v0, p0, Lcom/sumsub/sns/internal/core/presentation/android/location/l;->b:Lkotlinx/coroutines/flow/n;

    sget-object v1, Lcom/sumsub/sns/internal/core/presentation/android/location/h;->a:Lcom/sumsub/sns/internal/core/presentation/android/location/h;

    invoke-interface {v0, v1}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    throw p1
.end method

.method public final a(Ljava/lang/String;)V
    .locals 3

    .line 13
    iget-object v0, p0, Lcom/sumsub/sns/internal/core/presentation/android/location/l;->a:Lcom/sumsub/sns/internal/features/domain/utils/b;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "LocationAcquisitionController"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/sumsub/sns/internal/features/domain/utils/b;->a(Lcom/sumsub/sns/internal/features/domain/utils/b;Ljava/lang/String;)V

    return-void
.end method
