.class public final Lcom/sumsub/sns/internal/features/presentation/prooface/session/b0;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"

# interfaces
.implements Lcom/sumsub/sns/internal/features/presentation/prooface/session/d0;


# static fields
.field public static final c:J


# instance fields
.field public final a:Lkotlinx/coroutines/flow/n;

.field public final b:Lkotlinx/coroutines/flow/m;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    sget-object v0, Lkotlin/time/Duration;->Companion:Lkotlin/time/Duration$Companion;

    .line 3
    .line 4
    sget-object v0, Lkotlin/time/DurationUnit;->SECONDS:Lkotlin/time/DurationUnit;

    .line 5
    .line 6
    const/16 v1, 0x78

    .line 7
    .line 8
    .line 9
    invoke-static {v1, v0}, Lkotlin/time/DurationKt;->toDuration(ILkotlin/time/DurationUnit;)J

    .line 10
    move-result-wide v0

    .line 11
    .line 12
    sput-wide v0, Lcom/sumsub/sns/internal/features/presentation/prooface/session/b0;->c:J

    .line 13
    return-void
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public constructor <init>()V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    sget-object v0, Lcom/sumsub/sns/internal/features/presentation/prooface/session/c0;->a:Lcom/sumsub/sns/internal/features/presentation/prooface/session/c0;

    .line 6
    .line 7
    .line 8
    invoke-static {v0}, Lkotlinx/coroutines/flow/x;->a(Ljava/lang/Object;)Lkotlinx/coroutines/flow/n;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    iput-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/session/b0;->a:Lkotlinx/coroutines/flow/n;

    .line 12
    const/4 v0, 0x0

    .line 13
    const/4 v1, 0x7

    .line 14
    const/4 v2, 0x0

    .line 15
    .line 16
    .line 17
    invoke-static {v2, v2, v0, v1, v0}, Lkotlinx/coroutines/flow/s;->b(IILkotlinx/coroutines/channels/BufferOverflow;ILjava/lang/Object;)Lkotlinx/coroutines/flow/m;

    .line 18
    move-result-object v0

    .line 19
    .line 20
    iput-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/session/b0;->b:Lkotlinx/coroutines/flow/m;

    .line 21
    return-void
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


# virtual methods
.method public final a(Lcom/sumsub/sns/internal/features/data/network/prooface/Liveness3dFaceRepository$LivenessRepositoryResult;Lcom/sumsub/sns/internal/features/presentation/prooface/session/i0;)Ljava/lang/Object;
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/session/b0;->b:Lkotlinx/coroutines/flow/m;

    invoke-interface {v0, p1, p2}, Lkotlinx/coroutines/flow/m;->emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final a(Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 11

    const/4 v0, 0x1

    instance-of v1, p1, Lcom/sumsub/sns/internal/features/presentation/prooface/session/S;

    if-eqz v1, :cond_0

    move-object v1, p1

    check-cast v1, Lcom/sumsub/sns/internal/features/presentation/prooface/session/S;

    iget v2, v1, Lcom/sumsub/sns/internal/features/presentation/prooface/session/S;->f:I

    const/high16 v3, -0x80000000

    and-int v4, v2, v3

    if-eqz v4, :cond_0

    sub-int/2addr v2, v3

    iput v2, v1, Lcom/sumsub/sns/internal/features/presentation/prooface/session/S;->f:I

    goto :goto_0

    :cond_0
    new-instance v1, Lcom/sumsub/sns/internal/features/presentation/prooface/session/S;

    invoke-direct {v1, p0, p1}, Lcom/sumsub/sns/internal/features/presentation/prooface/session/S;-><init>(Lcom/sumsub/sns/internal/features/presentation/prooface/session/b0;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object p1, v1, Lcom/sumsub/sns/internal/features/presentation/prooface/session/S;->d:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v2

    .line 3
    iget v3, v1, Lcom/sumsub/sns/internal/features/presentation/prooface/session/S;->f:I

    const/4 v4, 0x2

    const/4 v5, 0x0

    if-eqz v3, :cond_3

    if-eq v3, v0, :cond_2

    if-ne v3, v4, :cond_1

    iget v2, v1, Lcom/sumsub/sns/internal/features/presentation/prooface/session/S;->b:I

    iget v3, v1, Lcom/sumsub/sns/internal/features/presentation/prooface/session/S;->a:I

    iget-object v1, v1, Lcom/sumsub/sns/internal/features/presentation/prooface/session/S;->c:Ljava/lang/String;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_4

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 4
    sget-wide v6, Lcom/sumsub/sns/internal/features/presentation/prooface/session/b0;->c:J

    new-instance p1, Lcom/sumsub/sns/internal/features/presentation/prooface/session/a0;

    invoke-direct {p1, p0, v5}, Lcom/sumsub/sns/internal/features/presentation/prooface/session/a0;-><init>(Lcom/sumsub/sns/internal/features/presentation/prooface/session/b0;Lkotlin/coroutines/Continuation;)V

    iput v0, v1, Lcom/sumsub/sns/internal/features/presentation/prooface/session/S;->f:I

    invoke-static {v6, v7, p1, v1}, Lkotlinx/coroutines/TimeoutKt;->e(JLkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v2, :cond_4

    goto :goto_3

    :cond_4
    :goto_1
    check-cast p1, Lcom/sumsub/sns/internal/features/data/network/prooface/h;

    if-nez p1, :cond_5

    .line 5
    sget-object p1, Lcom/sumsub/sns/internal/features/presentation/prooface/session/O;->a:Lcom/sumsub/sns/internal/features/presentation/prooface/session/O;

    .line 6
    sget-wide v0, Lcom/sumsub/sns/internal/features/presentation/prooface/session/b0;->c:J

    invoke-static {v0, v1}, Lkotlin/time/Duration;->toString-impl(J)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Init phase: OnStarted event timeout: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/sumsub/sns/internal/features/presentation/prooface/utils/d;->a(Ljava/lang/String;)V

    return-object p1

    .line 7
    :cond_5
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/data/network/prooface/h;->a:Lcom/sumsub/sns/internal/features/data/model/prooface/M;

    if-nez p1, :cond_6

    .line 8
    sget-object p1, Lcom/sumsub/sns/internal/features/presentation/prooface/session/O;->a:Lcom/sumsub/sns/internal/features/presentation/prooface/session/O;

    .line 9
    const-string v0, "Init phase: session not received"

    invoke-static {v0}, Lcom/sumsub/sns/internal/features/presentation/prooface/utils/d;->a(Ljava/lang/String;)V

    return-object p1

    .line 10
    :cond_6
    iget-object v3, p1, Lcom/sumsub/sns/internal/features/data/model/prooface/M;->c:Ljava/lang/Integer;

    if-eqz v3, :cond_f

    .line 11
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v6

    if-lez v6, :cond_7

    goto :goto_2

    :cond_7
    move-object v3, v5

    :goto_2
    if-eqz v3, :cond_f

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    .line 12
    iget-object v6, p1, Lcom/sumsub/sns/internal/features/data/model/prooface/M;->b:Ljava/lang/String;

    if-nez v6, :cond_8

    .line 13
    sget-object p1, Lcom/sumsub/sns/internal/features/presentation/prooface/session/O;->a:Lcom/sumsub/sns/internal/features/presentation/prooface/session/O;

    .line 14
    const-string v0, "Init phase: sessionKey not received"

    invoke-static {v0}, Lcom/sumsub/sns/internal/features/presentation/prooface/utils/d;->a(Ljava/lang/String;)V

    return-object p1

    .line 15
    :cond_8
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/data/model/prooface/M;->f:Ljava/lang/Boolean;

    .line 16
    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    move-result-object v7

    invoke-static {p1, v7}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    xor-int/2addr p1, v0

    .line 17
    sget-wide v7, Lcom/sumsub/sns/internal/features/presentation/prooface/session/b0;->c:J

    new-instance v9, Lcom/sumsub/sns/internal/features/presentation/prooface/session/W;

    invoke-direct {v9, p0, v5}, Lcom/sumsub/sns/internal/features/presentation/prooface/session/W;-><init>(Lcom/sumsub/sns/internal/features/presentation/prooface/session/b0;Lkotlin/coroutines/Continuation;)V

    iput-object v6, v1, Lcom/sumsub/sns/internal/features/presentation/prooface/session/S;->c:Ljava/lang/String;

    iput v3, v1, Lcom/sumsub/sns/internal/features/presentation/prooface/session/S;->a:I

    iput p1, v1, Lcom/sumsub/sns/internal/features/presentation/prooface/session/S;->b:I

    iput v4, v1, Lcom/sumsub/sns/internal/features/presentation/prooface/session/S;->f:I

    invoke-static {v7, v8, v9, v1}, Lkotlinx/coroutines/TimeoutKt;->e(JLkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v2, :cond_9

    :goto_3
    return-object v2

    :cond_9
    move v2, p1

    move-object p1, v1

    move-object v1, v6

    :goto_4
    check-cast p1, Lcom/sumsub/sns/internal/features/data/network/prooface/f;

    if-nez p1, :cond_a

    .line 18
    sget-object p1, Lcom/sumsub/sns/internal/features/presentation/prooface/session/O;->a:Lcom/sumsub/sns/internal/features/presentation/prooface/session/O;

    .line 19
    sget-wide v0, Lcom/sumsub/sns/internal/features/presentation/prooface/session/b0;->c:J

    invoke-static {v0, v1}, Lkotlin/time/Duration;->toString-impl(J)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Init phase: OnProgress event timeout: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/sumsub/sns/internal/features/presentation/prooface/utils/d;->a(Ljava/lang/String;)V

    return-object p1

    .line 20
    :cond_a
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/data/network/prooface/f;->a:Lcom/sumsub/sns/internal/features/data/model/prooface/M;

    const/4 v4, 0x0

    if-eqz p1, :cond_d

    .line 21
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/data/model/prooface/M;->d:Ljava/lang/String;

    if-eqz p1, :cond_d

    .line 22
    sget-object v6, Lcom/sumsub/sns/internal/features/data/model/common/AnswerType;->Companion:Lcom/sumsub/sns/internal/features/data/model/common/f;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    invoke-static {}, Lcom/sumsub/sns/internal/features/data/model/common/AnswerType;->values()[Lcom/sumsub/sns/internal/features/data/model/common/AnswerType;

    move-result-object v6

    array-length v7, v6

    move v8, v4

    :goto_5
    if-ge v8, v7, :cond_c

    aget-object v9, v6, v8

    invoke-virtual {v9}, Lcom/sumsub/sns/internal/features/data/model/common/AnswerType;->getValue()Ljava/lang/String;

    move-result-object v10

    invoke-static {v10, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_b

    move-object v5, v9

    goto :goto_6

    :cond_b
    add-int/2addr v8, v0

    goto :goto_5

    :cond_c
    :goto_6
    if-nez v5, :cond_d

    sget-object v5, Lcom/sumsub/sns/internal/features/data/model/common/AnswerType;->Error:Lcom/sumsub/sns/internal/features/data/model/common/AnswerType;

    .line 24
    :cond_d
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "Init phase: session.answer: "

    invoke-virtual {p1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/sumsub/sns/internal/features/presentation/prooface/utils/d;->a(Ljava/lang/String;)V

    .line 25
    sget-object p1, Lcom/sumsub/sns/internal/features/data/model/common/AnswerType;->Companion:Lcom/sumsub/sns/internal/features/data/model/common/f;

    .line 26
    new-instance p1, Lcom/sumsub/sns/internal/features/presentation/prooface/session/d1;

    if-eqz v2, :cond_e

    goto :goto_7

    :cond_e
    move v0, v4

    :goto_7
    invoke-direct {p1, v3, v1, v0}, Lcom/sumsub/sns/internal/features/presentation/prooface/session/d1;-><init>(ILjava/lang/String;Z)V

    .line 27
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Init phase: finished: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/sumsub/sns/internal/features/presentation/prooface/utils/d;->a(Ljava/lang/String;)V

    .line 28
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/prooface/session/P;

    invoke-direct {v0, p1}, Lcom/sumsub/sns/internal/features/presentation/prooface/session/P;-><init>(Lcom/sumsub/sns/internal/features/presentation/prooface/session/d1;)V

    return-object v0

    .line 29
    :cond_f
    sget-object v0, Lcom/sumsub/sns/internal/features/presentation/prooface/session/O;->a:Lcom/sumsub/sns/internal/features/presentation/prooface/session/O;

    .line 30
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/data/model/prooface/M;->c:Ljava/lang/Integer;

    .line 31
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Init phase: illegal requiredFragments: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/sumsub/sns/internal/features/presentation/prooface/utils/d;->a(Ljava/lang/String;)V

    return-object v0
.end method

.method public final a(Landroidx/camera/core/ImageProxy;Landroid/graphics/RectF;F)Z
    .locals 0

    .line 1
    const/4 p1, 0x0

    return p1
.end method

.method public final getState()Lkotlinx/coroutines/flow/e;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/session/b0;->a:Lkotlinx/coroutines/flow/n;

    .line 3
    return-object v0
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
.end method
