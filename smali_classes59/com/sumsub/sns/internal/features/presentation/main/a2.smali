.class public final Lcom/sumsub/sns/internal/features/presentation/main/a2;
.super Lcom/sumsub/sns/internal/features/presentation/main/i2;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# static fields
.field public static final synthetic x:[Lkotlin/reflect/KProperty;


# instance fields
.field public final d:Lcom/sumsub/sns/internal/features/domain/L;

.field public final e:Lcom/sumsub/sns/internal/features/domain/fisherman/f;

.field public final f:Lcom/sumsub/sns/internal/features/domain/O;

.field public final g:Lcom/sumsub/sns/internal/features/data/repository/common/a;

.field public final h:Lcom/sumsub/sns/internal/features/data/repository/settings/c;

.field public final i:Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;

.field public final j:Lcom/sumsub/sns/internal/features/data/repository/socket/a;

.field public final k:Lcom/sumsub/sns/internal/features/presentation/main/j2;

.field public final l:Lcom/sumsub/sns/internal/features/presentation/main/instructions/h;

.field public final m:Lcom/sumsub/sns/internal/features/presentation/main/navigation/n;

.field public final n:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

.field public final o:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

.field public p:Lkotlinx/coroutines/x1;

.field public final q:Lkotlinx/coroutines/flow/n;

.field public final r:Lkotlinx/coroutines/flow/n;

.field public final s:Lcom/sumsub/sns/internal/features/presentation/main/k2;

.field public final t:Lcom/sumsub/sns/internal/features/presentation/main/k2;

.field public final u:Lcom/sumsub/sns/internal/features/presentation/main/d;

.field public v:Lkotlin/jvm/functions/Function0;

.field public final w:Lcom/sumsub/sns/internal/features/presentation/main/p0;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    .line 2
    const-class v0, Lcom/sumsub/sns/internal/features/presentation/main/a2;

    .line 3
    .line 4
    const-string v1, "currentLevelName"

    .line 5
    .line 6
    const-string v2, "getCurrentLevelName()Ljava/lang/String;"

    .line 7
    const/4 v3, 0x0

    .line 8
    .line 9
    .line 10
    invoke-static {v0, v1, v2, v3}, Lcom/sumsub/sns/internal/core/presentation/android/a;->a(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)Lkotlin/reflect/KMutableProperty1;

    .line 11
    move-result-object v1

    .line 12
    .line 13
    const-string v2, "isSDKPrepared"

    .line 14
    .line 15
    const-string v4, "isSDKPrepared()Z"

    .line 16
    .line 17
    .line 18
    invoke-static {v0, v2, v4, v3}, Lcom/sumsub/sns/internal/core/presentation/android/a;->a(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)Lkotlin/reflect/KMutableProperty1;

    .line 19
    move-result-object v0

    .line 20
    const/4 v2, 0x2

    .line 21
    .line 22
    new-array v2, v2, [Lkotlin/reflect/KProperty;

    .line 23
    .line 24
    aput-object v1, v2, v3

    .line 25
    const/4 v1, 0x1

    .line 26
    .line 27
    aput-object v0, v2, v1

    .line 28
    .line 29
    sput-object v2, Lcom/sumsub/sns/internal/features/presentation/main/a2;->x:[Lkotlin/reflect/KProperty;

    .line 30
    return-void
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

.method public constructor <init>(Landroidx/lifecycle/SavedStateHandle;Lcom/sumsub/sns/internal/features/domain/L;Lcom/sumsub/sns/internal/features/domain/fisherman/f;Lcom/sumsub/sns/internal/features/domain/O;Lcom/sumsub/sns/internal/features/domain/appdata/f;Lcom/sumsub/sns/internal/features/data/repository/common/a;Lcom/sumsub/sns/internal/features/data/repository/settings/c;Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;Lcom/sumsub/sns/internal/features/data/repository/socket/a;Lcom/sumsub/sns/internal/features/data/repository/applicant/d;Lcom/sumsub/sns/internal/features/presentation/main/j2;Lcom/sumsub/sns/internal/features/presentation/main/instructions/h;Lcom/sumsub/sns/internal/features/presentation/main/navigation/n;)V
    .locals 21

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p6

    move-object/from16 v4, p8

    move-object/from16 v3, p13

    .line 1
    invoke-direct {v0, v1, v2, v4}, Lcom/sumsub/sns/internal/features/presentation/main/i2;-><init>(Landroidx/lifecycle/SavedStateHandle;Lcom/sumsub/sns/internal/features/data/repository/common/a;Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;)V

    move-object/from16 v5, p2

    .line 2
    iput-object v5, v0, Lcom/sumsub/sns/internal/features/presentation/main/a2;->d:Lcom/sumsub/sns/internal/features/domain/L;

    move-object/from16 v5, p3

    .line 3
    iput-object v5, v0, Lcom/sumsub/sns/internal/features/presentation/main/a2;->e:Lcom/sumsub/sns/internal/features/domain/fisherman/f;

    move-object/from16 v5, p4

    .line 4
    iput-object v5, v0, Lcom/sumsub/sns/internal/features/presentation/main/a2;->f:Lcom/sumsub/sns/internal/features/domain/O;

    .line 5
    iput-object v2, v0, Lcom/sumsub/sns/internal/features/presentation/main/a2;->g:Lcom/sumsub/sns/internal/features/data/repository/common/a;

    move-object/from16 v6, p7

    .line 6
    iput-object v6, v0, Lcom/sumsub/sns/internal/features/presentation/main/a2;->h:Lcom/sumsub/sns/internal/features/data/repository/settings/c;

    .line 7
    iput-object v4, v0, Lcom/sumsub/sns/internal/features/presentation/main/a2;->i:Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;

    move-object/from16 v2, p9

    .line 8
    iput-object v2, v0, Lcom/sumsub/sns/internal/features/presentation/main/a2;->j:Lcom/sumsub/sns/internal/features/data/repository/socket/a;

    move-object/from16 v2, p11

    .line 9
    iput-object v2, v0, Lcom/sumsub/sns/internal/features/presentation/main/a2;->k:Lcom/sumsub/sns/internal/features/presentation/main/j2;

    move-object/from16 v2, p12

    .line 10
    iput-object v2, v0, Lcom/sumsub/sns/internal/features/presentation/main/a2;->l:Lcom/sumsub/sns/internal/features/presentation/main/instructions/h;

    .line 11
    iput-object v3, v0, Lcom/sumsub/sns/internal/features/presentation/main/a2;->m:Lcom/sumsub/sns/internal/features/presentation/main/navigation/n;

    .line 12
    new-instance v2, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 13
    const-string v5, "KEY_CURRENT_LEVEL"

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-direct {v2, v1, v5, v7, v8}, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;-><init>(Landroidx/lifecycle/SavedStateHandle;Ljava/lang/String;Ljava/lang/Object;Z)V

    .line 14
    iput-object v2, v0, Lcom/sumsub/sns/internal/features/presentation/main/a2;->n:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 15
    new-instance v2, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    sget-object v5, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 16
    const-string v9, "KEY_SDK_PREPARED"

    invoke-direct {v2, v1, v9, v5, v8}, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;-><init>(Landroidx/lifecycle/SavedStateHandle;Ljava/lang/String;Ljava/lang/Object;Z)V

    .line 17
    iput-object v2, v0, Lcom/sumsub/sns/internal/features/presentation/main/a2;->o:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 18
    invoke-static {v5}, Lkotlinx/coroutines/flow/x;->a(Ljava/lang/Object;)Lkotlinx/coroutines/flow/n;

    move-result-object v2

    iput-object v2, v0, Lcom/sumsub/sns/internal/features/presentation/main/a2;->q:Lkotlinx/coroutines/flow/n;

    .line 19
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v5}, Lkotlinx/coroutines/flow/x;->a(Ljava/lang/Object;)Lkotlinx/coroutines/flow/n;

    move-result-object v5

    iput-object v5, v0, Lcom/sumsub/sns/internal/features/presentation/main/a2;->r:Lkotlinx/coroutines/flow/n;

    .line 20
    new-instance v8, Lcom/sumsub/sns/internal/features/presentation/main/k2;

    invoke-direct {v8}, Lcom/sumsub/sns/internal/features/presentation/main/k2;-><init>()V

    iput-object v8, v0, Lcom/sumsub/sns/internal/features/presentation/main/a2;->s:Lcom/sumsub/sns/internal/features/presentation/main/k2;

    .line 21
    iput-object v8, v0, Lcom/sumsub/sns/internal/features/presentation/main/a2;->t:Lcom/sumsub/sns/internal/features/presentation/main/k2;

    .line 22
    new-instance v9, Lcom/sumsub/sns/internal/features/presentation/main/d;

    invoke-direct {v9, v0}, Lcom/sumsub/sns/internal/features/presentation/main/d;-><init>(Lcom/sumsub/sns/internal/features/presentation/main/i2;)V

    iput-object v9, v0, Lcom/sumsub/sns/internal/features/presentation/main/a2;->u:Lcom/sumsub/sns/internal/features/presentation/main/d;

    move-object v9, v2

    .line 23
    invoke-static {v0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    move-result-object v2

    move-object v10, v9

    .line 24
    new-instance v9, Lcom/sumsub/sns/internal/features/presentation/main/A1;

    invoke-direct {v9, v0}, Lcom/sumsub/sns/internal/features/presentation/main/A1;-><init>(Lcom/sumsub/sns/internal/features/presentation/main/a2;)V

    move-object v11, v10

    .line 25
    new-instance v10, Lcom/sumsub/sns/internal/features/presentation/main/B1;

    invoke-direct {v10, v0}, Lcom/sumsub/sns/internal/features/presentation/main/B1;-><init>(Lcom/sumsub/sns/internal/features/presentation/main/a2;)V

    .line 26
    new-instance v13, Lcom/sumsub/sns/internal/features/presentation/main/C1;

    invoke-direct {v13, v0}, Lcom/sumsub/sns/internal/features/presentation/main/C1;-><init>(Lcom/sumsub/sns/internal/features/presentation/main/a2;)V

    .line 27
    new-instance v12, Lcom/sumsub/sns/internal/features/presentation/main/D1;

    invoke-direct {v12, v0}, Lcom/sumsub/sns/internal/features/presentation/main/D1;-><init>(Lcom/sumsub/sns/internal/features/presentation/main/a2;)V

    move-object v14, v11

    .line 28
    new-instance v11, Lcom/sumsub/sns/internal/features/presentation/main/E1;

    invoke-direct {v11, v0}, Lcom/sumsub/sns/internal/features/presentation/main/E1;-><init>(Lcom/sumsub/sns/internal/features/presentation/main/a2;)V

    .line 29
    new-instance v15, Lcom/sumsub/sns/internal/features/presentation/main/F1;

    invoke-direct {v15, v0}, Lcom/sumsub/sns/internal/features/presentation/main/F1;-><init>(Lcom/sumsub/sns/internal/features/presentation/main/a2;)V

    .line 30
    new-instance v7, Lcom/sumsub/sns/internal/features/presentation/main/G1;

    invoke-direct {v7, v0}, Lcom/sumsub/sns/internal/features/presentation/main/G1;-><init>(Lcom/sumsub/sns/internal/features/presentation/main/a2;)V

    .line 31
    new-instance v1, Lcom/sumsub/sns/internal/features/presentation/main/p0;

    move-object/from16 v17, v7

    move-object v7, v8

    .line 32
    new-instance v8, Lcom/sumsub/sns/internal/features/presentation/main/s2;

    invoke-direct {v8, v0}, Lcom/sumsub/sns/internal/features/presentation/main/s2;-><init>(Lcom/sumsub/sns/internal/features/presentation/main/a2;)V

    move-object/from16 v16, v14

    .line 33
    new-instance v14, Lcom/sumsub/sns/internal/features/presentation/main/H1;

    move-object/from16 p3, v1

    const/4 v1, 0x0

    invoke-direct {v14, v0, v1}, Lcom/sumsub/sns/internal/features/presentation/main/H1;-><init>(Lcom/sumsub/sns/internal/features/presentation/main/a2;Lkotlin/coroutines/Continuation;)V

    move-object/from16 v18, v16

    move-object/from16 v16, v15

    .line 34
    new-instance v15, Lcom/sumsub/sns/internal/features/presentation/main/t2;

    invoke-direct {v15, v0}, Lcom/sumsub/sns/internal/features/presentation/main/t2;-><init>(Lcom/sumsub/sns/internal/features/presentation/main/a2;)V

    move-object/from16 v1, p3

    move-object/from16 v3, p5

    move-object/from16 v20, v5

    move-object/from16 v19, v18

    move-object/from16 v18, p1

    move-object/from16 v5, p10

    .line 35
    invoke-direct/range {v1 .. v18}, Lcom/sumsub/sns/internal/features/presentation/main/p0;-><init>(Lkotlinx/coroutines/m0;Lcom/sumsub/sns/internal/features/domain/appdata/f;Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;Lcom/sumsub/sns/internal/features/data/repository/applicant/d;Lcom/sumsub/sns/internal/features/data/repository/settings/c;Lcom/sumsub/sns/internal/features/presentation/main/k2;Lkotlin/jvm/functions/Function0;Lcom/sumsub/sns/internal/features/presentation/main/A1;Lcom/sumsub/sns/internal/features/presentation/main/B1;Lcom/sumsub/sns/internal/features/presentation/main/E1;Lcom/sumsub/sns/internal/features/presentation/main/D1;Lcom/sumsub/sns/internal/features/presentation/main/C1;Lcom/sumsub/sns/internal/features/presentation/main/H1;Lkotlin/jvm/functions/Function0;Lcom/sumsub/sns/internal/features/presentation/main/F1;Lcom/sumsub/sns/internal/features/presentation/main/G1;Landroidx/lifecycle/SavedStateHandle;)V

    iput-object v1, v0, Lcom/sumsub/sns/internal/features/presentation/main/a2;->w:Lcom/sumsub/sns/internal/features/presentation/main/p0;

    .line 36
    invoke-virtual {v0}, Lcom/sumsub/sns/core/presentation/base/M0;->getViewModelInternalState()Lkotlinx/coroutines/flow/w;

    move-result-object v1

    .line 37
    new-instance v2, Lcom/sumsub/sns/internal/features/presentation/main/O1;

    const/4 v3, 0x0

    invoke-direct {v2, v0, v3}, Lcom/sumsub/sns/internal/features/presentation/main/O1;-><init>(Lcom/sumsub/sns/internal/features/presentation/main/a2;Lkotlin/coroutines/Continuation;)V

    move-object/from16 v9, v19

    move-object/from16 v4, v20

    invoke-static {v1, v9, v4, v2}, Lkotlinx/coroutines/flow/g;->q(Lkotlinx/coroutines/flow/e;Lkotlinx/coroutines/flow/e;Lkotlinx/coroutines/flow/e;Lkotlin/jvm/functions/Function5;)Lkotlinx/coroutines/flow/e;

    move-result-object v1

    new-instance v2, Lcom/sumsub/sns/internal/features/presentation/main/u2;

    invoke-direct {v2}, Lcom/sumsub/sns/internal/features/presentation/main/u2;-><init>()V

    .line 38
    invoke-static {v1, v2}, Lkotlinx/coroutines/flow/g;->u(Lkotlinx/coroutines/flow/e;Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/flow/e;

    move-result-object v1

    .line 39
    new-instance v2, Lcom/sumsub/sns/internal/features/presentation/main/Z1;

    invoke-direct {v2, v1}, Lcom/sumsub/sns/internal/features/presentation/main/Z1;-><init>(Lkotlinx/coroutines/flow/e;)V

    .line 40
    invoke-static {v2}, Lkotlinx/coroutines/flow/g;->v(Lkotlinx/coroutines/flow/e;)Lkotlinx/coroutines/flow/e;

    move-result-object v1

    .line 41
    invoke-static {v0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    move-result-object v2

    new-instance v4, Lcom/sumsub/sns/internal/features/presentation/main/m1;

    invoke-direct {v4, v0, v3}, Lcom/sumsub/sns/internal/features/presentation/main/m1;-><init>(Lcom/sumsub/sns/internal/features/presentation/main/a2;Lkotlin/coroutines/Continuation;)V

    invoke-static {v1, v2, v4}, Lcom/sumsub/sns/internal/core/common/U;->a(Lkotlinx/coroutines/flow/e;Lkotlinx/coroutines/m0;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/x1;

    move-object/from16 v3, p13

    .line 42
    iget-object v1, v3, Lcom/sumsub/sns/internal/features/presentation/main/navigation/n;->d:Lkotlinx/coroutines/flow/r;

    .line 43
    invoke-static {v0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    move-result-object v2

    new-instance v3, Lcom/sumsub/sns/internal/features/presentation/main/n1;

    invoke-direct {v3, v0}, Lcom/sumsub/sns/internal/features/presentation/main/n1;-><init>(Lcom/sumsub/sns/internal/features/presentation/main/a2;)V

    invoke-static {v1, v2, v3}, Lcom/sumsub/sns/internal/core/common/U;->a(Lkotlinx/coroutines/flow/e;Lkotlinx/coroutines/m0;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/x1;

    .line 44
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/presentation/main/i2;->h()Z

    move-result v1

    if-nez v1, :cond_0

    .line 45
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/presentation/main/a2;->onLoad()V

    :cond_0
    return-void
.end method

.method public static final a(Lkotlin/Pair;)J
    .locals 2

    .line 38
    invoke-virtual {p0}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    return-wide v0
.end method

.method public static final a(Lcom/sumsub/sns/internal/features/presentation/main/a2;)Lcom/sumsub/sns/internal/features/data/model/common/h;
    .locals 0

    .line 37
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/M0;->getConfig()Lcom/sumsub/sns/internal/features/data/model/common/h;

    move-result-object p0

    return-object p0
.end method

.method public static final a(Lcom/sumsub/sns/internal/features/presentation/main/a2;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 7

    .line 1
    instance-of v0, p1, Lcom/sumsub/sns/internal/features/presentation/main/p1;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/main/p1;

    iget v1, v0, Lcom/sumsub/sns/internal/features/presentation/main/p1;->d:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/sumsub/sns/internal/features/presentation/main/p1;->d:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/main/p1;

    invoke-direct {v0, p0, p1}, Lcom/sumsub/sns/internal/features/presentation/main/p1;-><init>(Lcom/sumsub/sns/internal/features/presentation/main/a2;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/main/p1;->b:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 2
    iget v2, v0, Lcom/sumsub/sns/internal/features/presentation/main/p1;->d:I

    const/4 v3, 0x0

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v5, :cond_2

    if-ne v2, v4, :cond_1

    iget-object v0, v0, Lcom/sumsub/sns/internal/features/presentation/main/p1;->a:Lcom/sumsub/sns/internal/features/data/model/common/p;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_3

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 3
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/main/a2;->i:Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;

    iput v5, v0, Lcom/sumsub/sns/internal/features/presentation/main/p1;->d:I

    .line 4
    check-cast p1, Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;

    invoke-virtual {p1, v3, v0}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;->a(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    goto :goto_2

    .line 5
    :cond_4
    :goto_1
    check-cast p1, Lcom/sumsub/sns/internal/features/data/repository/dynamic/N;

    invoke-virtual {p1}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/N;->c()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/sumsub/sns/internal/features/data/model/common/p;

    .line 6
    iget-object v2, p0, Lcom/sumsub/sns/internal/features/presentation/main/a2;->i:Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;

    iput-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/main/p1;->a:Lcom/sumsub/sns/internal/features/data/model/common/p;

    iput v4, v0, Lcom/sumsub/sns/internal/features/presentation/main/p1;->d:I

    .line 7
    check-cast v2, Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;

    invoke-virtual {v2, v3, v0}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;->b(ZLkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_5

    :goto_2
    return-object v1

    :cond_5
    move-object v6, v0

    move-object v0, p1

    move-object p1, v6

    .line 8
    :goto_3
    check-cast p1, Lcom/sumsub/sns/internal/features/data/repository/dynamic/N;

    invoke-virtual {p1}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/N;->c()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/sumsub/sns/internal/features/data/model/common/h;

    if-eqz p1, :cond_7

    .line 9
    invoke-static {p1}, Lcom/sumsub/sns/internal/features/data/model/common/i;->k(Lcom/sumsub/sns/internal/features/data/model/common/h;)Z

    move-result p1

    if-nez p1, :cond_7

    const/4 p1, 0x0

    if-eqz v0, :cond_6

    .line 10
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/data/model/common/p;->m()Lcom/sumsub/sns/internal/features/data/model/common/o;

    move-result-object v1

    .line 11
    iget-object v1, v1, Lcom/sumsub/sns/internal/features/data/model/common/o;->b:Lcom/sumsub/sns/internal/features/data/model/common/ReviewStatusType;

    goto :goto_4

    :cond_6
    move-object v1, p1

    .line 12
    :goto_4
    sget-object v2, Lcom/sumsub/sns/internal/features/data/model/common/ReviewStatusType;->Completed:Lcom/sumsub/sns/internal/features/data/model/common/ReviewStatusType;

    if-ne v1, v2, :cond_7

    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/data/model/common/p;->n()Z

    move-result v0

    if-eqz v0, :cond_7

    .line 13
    sget-object v0, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 14
    iget-object v0, v0, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 15
    const-string v1, "SNSAppViewModel2"

    const-string v2, "Check init applicant status: completed and approved, closing sdk"

    invoke-virtual {v0, v1, v2, p1}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 16
    sget-object p1, Lcom/sumsub/sns/internal/features/presentation/main/s;->c:Lcom/sumsub/sns/internal/features/presentation/main/s;

    invoke-virtual {p0, p1}, Lcom/sumsub/sns/internal/features/presentation/main/a2;->fireEvent(Lcom/sumsub/sns/core/presentation/base/r;)V

    .line 17
    :cond_7
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static final a(Lcom/sumsub/sns/internal/features/presentation/main/a2;Lcom/sumsub/sns/internal/features/data/model/common/h;)Lkotlin/Unit;
    .locals 2

    .line 39
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/main/q1;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Lcom/sumsub/sns/internal/features/presentation/main/q1;-><init>(Lcom/sumsub/sns/internal/features/presentation/main/a2;Lcom/sumsub/sns/internal/features/data/model/common/h;Lkotlin/coroutines/Continuation;)V

    invoke-virtual {p0, v0}, Lcom/sumsub/sns/internal/features/presentation/main/a2;->a(Lkotlin/jvm/functions/Function2;)V

    .line 41
    iput-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/main/a2;->v:Lkotlin/jvm/functions/Function0;

    .line 42
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static a(Lcom/sumsub/sns/core/data/listener/SNSEvent;)V
    .locals 3

    .line 83
    :try_start_0
    sget-object v0, Lcom/sumsub/sns/core/SNSMobileSDK;->INSTANCE:Lcom/sumsub/sns/core/SNSMobileSDK;

    invoke-virtual {v0}, Lcom/sumsub/sns/core/SNSMobileSDK;->getEventHandler()Lcom/sumsub/sns/core/data/listener/SNSEventHandler;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0, p0}, Lcom/sumsub/sns/core/data/listener/SNSEventHandler;->onEvent(Lcom/sumsub/sns/core/data/listener/SNSEvent;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception v0

    goto :goto_0

    :cond_0
    return-void

    .line 84
    :goto_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Can\'t fire sns event "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    .line 85
    sget-object v1, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 86
    iget-object v1, v1, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 87
    const-string v2, "SNSAppViewModel2"

    invoke-virtual {v1, v2, p0, v0}, Lcom/sumsub/sns/internal/log/logger/b;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static final a(Lcom/sumsub/sns/internal/features/presentation/main/a2;Ljava/lang/Throwable;)V
    .locals 8

    .line 30
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    instance-of v0, p1, Ljava/util/concurrent/CancellationException;

    if-eqz v0, :cond_0

    return-void

    .line 32
    :cond_0
    new-instance v2, Lcom/sumsub/sns/internal/features/data/model/common/e0;

    const/4 v0, 0x6

    const/4 v1, 0x0

    invoke-direct {v2, p1, v1, v1, v0}, Lcom/sumsub/sns/internal/features/data/model/common/e0;-><init>(Ljava/lang/Throwable;Landroid/os/Parcelable;Lcom/sumsub/sns/internal/features/data/model/common/c0;I)V

    const/16 v6, 0xc

    const/4 v7, 0x0

    const-string v3, "TYPE_UNKNOWN"

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v1, p0

    invoke-static/range {v1 .. v7}, Lcom/sumsub/sns/core/presentation/base/C;->throwError$default(Lcom/sumsub/sns/core/presentation/base/C;Lcom/sumsub/sns/internal/features/data/model/common/l0;Ljava/lang/String;ZLjava/lang/String;ILjava/lang/Object;)V

    .line 33
    iget-object p0, v1, Lcom/sumsub/sns/internal/features/presentation/main/a2;->q:Lkotlinx/coroutines/flow/n;

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-interface {p0, v0}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 34
    sget-object p0, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 35
    iget-object p0, p0, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 36
    const-string v0, "SNSAppViewModel2"

    const-string v1, "An error while preparing the sdk..."

    invoke-virtual {p0, v0, v1, p1}, Lcom/sumsub/sns/internal/log/logger/b;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static final b(Lcom/sumsub/sns/internal/features/presentation/main/a2;)Ljava/lang/String;
    .locals 2

    .line 1
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/presentation/main/a2;->n:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 2
    sget-object v0, Lcom/sumsub/sns/internal/features/presentation/main/a2;->x:[Lkotlin/reflect/KProperty;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-virtual {p0}, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    return-object p0
.end method


# virtual methods
.method public final a(ZLcom/sumsub/sns/internal/features/data/model/common/h;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 10

    instance-of v0, p3, Lcom/sumsub/sns/internal/features/presentation/main/Q1;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/main/Q1;

    iget v1, v0, Lcom/sumsub/sns/internal/features/presentation/main/Q1;->e:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/sumsub/sns/internal/features/presentation/main/Q1;->e:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/main/Q1;

    invoke-direct {v0, p0, p3}, Lcom/sumsub/sns/internal/features/presentation/main/Q1;-><init>(Lcom/sumsub/sns/internal/features/presentation/main/a2;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object p3, v0, Lcom/sumsub/sns/internal/features/presentation/main/Q1;->c:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 60
    iget v2, v0, Lcom/sumsub/sns/internal/features/presentation/main/Q1;->e:I

    const/4 v3, 0x0

    const/4 v4, 0x3

    const/4 v5, 0x2

    const/4 v6, 0x1

    const/4 v7, 0x0

    if-eqz v2, :cond_4

    if-eq v2, v6, :cond_3

    if-eq v2, v5, :cond_2

    if-ne v2, v4, :cond_1

    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_5

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast p3, Lkotlin/Result;

    invoke-virtual {p3}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p1

    goto/16 :goto_2

    :cond_3
    iget-boolean p1, v0, Lcom/sumsub/sns/internal/features/presentation/main/Q1;->a:Z

    iget-object p2, v0, Lcom/sumsub/sns/internal/features/presentation/main/Q1;->b:Lcom/sumsub/sns/internal/features/data/model/common/h;

    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_4
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 61
    iget-object p3, p2, Lcom/sumsub/sns/internal/features/data/model/common/h;->a:Ljava/lang/String;

    .line 62
    iget-object v2, p2, Lcom/sumsub/sns/internal/features/data/model/common/h;->b:Lcom/sumsub/sns/core/data/model/FlowType;

    .line 63
    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "SDK is prepared. Applicant - "

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p3, ", type="

    invoke-virtual {v8, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    .line 64
    sget-object v2, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 65
    iget-object v2, v2, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 66
    const-string v8, "SNSAppViewModel2"

    invoke-virtual {v2, v8, p3, v7}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 67
    new-instance p3, Lcom/sumsub/sns/internal/features/presentation/main/R1;

    invoke-direct {p3, v7}, Lcom/sumsub/sns/internal/features/presentation/main/R1;-><init>(Lkotlin/coroutines/Continuation;)V

    invoke-static {p0, v3, p3, v6, v7}, Lcom/sumsub/sns/core/presentation/base/M0;->updateState$default(Lcom/sumsub/sns/core/presentation/base/M0;ZLkotlin/jvm/functions/Function2;ILjava/lang/Object;)V

    .line 68
    iget-object p3, p0, Lcom/sumsub/sns/internal/features/presentation/main/a2;->o:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    sget-object v2, Lcom/sumsub/sns/internal/features/presentation/main/a2;->x:[Lkotlin/reflect/KProperty;

    aget-object v2, v2, v6

    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 69
    iget-object v8, p3, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a:Landroidx/lifecycle/SavedStateHandle;

    .line 70
    iget-object p3, p3, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->b:Ljava/lang/String;

    invoke-virtual {v8, p3, v2}, Landroidx/lifecycle/SavedStateHandle;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 71
    new-instance p3, Lcom/sumsub/sns/core/data/listener/SNSEvent$VerificationStarted;

    .line 72
    iget-object v2, p2, Lcom/sumsub/sns/internal/features/data/model/common/h;->a:Ljava/lang/String;

    .line 73
    invoke-direct {p3, v2}, Lcom/sumsub/sns/core/data/listener/SNSEvent$VerificationStarted;-><init>(Ljava/lang/String;)V

    invoke-static {p3}, Lcom/sumsub/sns/internal/features/presentation/main/a2;->a(Lcom/sumsub/sns/core/data/listener/SNSEvent;)V

    .line 74
    iput-object p2, v0, Lcom/sumsub/sns/internal/features/presentation/main/Q1;->b:Lcom/sumsub/sns/internal/features/data/model/common/h;

    iput-boolean p1, v0, Lcom/sumsub/sns/internal/features/presentation/main/Q1;->a:Z

    iput v6, v0, Lcom/sumsub/sns/internal/features/presentation/main/Q1;->e:I

    invoke-virtual {p0, v0}, Lcom/sumsub/sns/internal/features/presentation/main/a2;->b(Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_5

    goto :goto_4

    :cond_5
    :goto_1
    if-nez p1, :cond_c

    .line 75
    sget-object p1, Lcom/sumsub/sns/internal/ff/a;->b0:Lcom/sumsub/sns/internal/ff/core/a;

    .line 76
    invoke-virtual {p1}, Lcom/sumsub/sns/internal/ff/core/a;->a()Z

    move-result p1

    if-eqz p1, :cond_7

    .line 77
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/main/a2;->m:Lcom/sumsub/sns/internal/features/presentation/main/navigation/n;

    iput-object v7, v0, Lcom/sumsub/sns/internal/features/presentation/main/Q1;->b:Lcom/sumsub/sns/internal/features/data/model/common/h;

    iput v5, v0, Lcom/sumsub/sns/internal/features/presentation/main/Q1;->e:I

    invoke-virtual {p1, v0}, Lcom/sumsub/sns/internal/features/presentation/main/navigation/n;->b(Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_6

    goto :goto_4

    :cond_6
    :goto_2
    invoke-static {p1}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    goto :goto_6

    .line 78
    :cond_7
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/main/a2;->w:Lcom/sumsub/sns/internal/features/presentation/main/p0;

    iput-object v7, v0, Lcom/sumsub/sns/internal/features/presentation/main/Q1;->b:Lcom/sumsub/sns/internal/features/data/model/common/h;

    iput v4, v0, Lcom/sumsub/sns/internal/features/presentation/main/Q1;->e:I

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 79
    invoke-static {p2}, Lcom/sumsub/sns/internal/features/data/model/common/i;->k(Lcom/sumsub/sns/internal/features/data/model/common/h;)Z

    move-result p3

    if-eqz p3, :cond_9

    .line 80
    invoke-virtual {p1, p2, v0}, Lcom/sumsub/sns/internal/features/presentation/main/p0;->a(Lcom/sumsub/sns/internal/features/data/model/common/h;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_8

    goto :goto_3

    :cond_8
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    goto :goto_3

    .line 81
    :cond_9
    invoke-virtual {p1, v3, p2, v0}, Lcom/sumsub/sns/internal/features/presentation/main/p0;->a(ZLcom/sumsub/sns/internal/features/data/model/common/h;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_a

    goto :goto_3

    :cond_a
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    :goto_3
    if-ne p1, v1, :cond_b

    :goto_4
    return-object v1

    .line 82
    :cond_b
    :goto_5
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1

    :cond_c
    :goto_6
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final a(Lcom/sumsub/sns/core/data/model/SNSCompletionResult;Z)V
    .locals 6

    .line 43
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Cancel verification with reason - "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/Throwable;

    const-string/jumbo v2, "onCancel"

    invoke-direct {v1, v2}, Ljava/lang/Throwable;-><init>(Ljava/lang/String;)V

    .line 44
    sget-object v2, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 45
    iget-object v2, v2, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 46
    const-string v3, "SNSAppViewModel2"

    invoke-virtual {v2, v3, v0, v1}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 v0, 0x1

    .line 47
    invoke-virtual {p0, v0}, Lcom/sumsub/sns/core/presentation/base/C;->showProgress(Z)V

    .line 48
    new-instance v1, Lcom/sumsub/sns/internal/core/analytics/g;

    invoke-direct {v1}, Lcom/sumsub/sns/internal/core/analytics/g;-><init>()V

    .line 49
    sget-object v2, Lcom/sumsub/sns/internal/core/analytics/SdkEvent;->Dismiss:Lcom/sumsub/sns/internal/core/analytics/SdkEvent;

    .line 50
    iget-object v3, v1, Lcom/sumsub/sns/internal/core/analytics/g;->b:Ljava/util/ArrayList;

    sget-object v4, Lcom/sumsub/sns/internal/core/analytics/Domain;->Sdk:Lcom/sumsub/sns/internal/core/analytics/Domain;

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 51
    iget-object v3, v1, Lcom/sumsub/sns/internal/core/analytics/g;->b:Ljava/util/ArrayList;

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 52
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    const-string v2, "isDismissMethodCalled"

    invoke-static {v2, p2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p2

    filled-new-array {p2}, [Lkotlin/Pair;

    move-result-object p2

    .line 53
    invoke-static {p2}, Lkotlin/collections/ArraysKt;->filterNotNull([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p2

    invoke-static {p2}, Lkotlin/collections/MapsKt;->toMap(Ljava/lang/Iterable;)Ljava/util/Map;

    move-result-object p2

    iput-object p2, v1, Lcom/sumsub/sns/internal/core/analytics/g;->c:Ljava/util/Map;

    .line 54
    invoke-virtual {v1, v0}, Lcom/sumsub/sns/internal/core/analytics/g;->a(Z)V

    .line 55
    sget-object p2, Lcom/sumsub/sns/internal/ff/a;->b0:Lcom/sumsub/sns/internal/ff/core/a;

    .line 56
    invoke-virtual {p2}, Lcom/sumsub/sns/internal/ff/core/a;->a()Z

    move-result p2

    if-nez p2, :cond_0

    .line 57
    iget-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/main/a2;->w:Lcom/sumsub/sns/internal/features/presentation/main/p0;

    invoke-virtual {p2}, Lcom/sumsub/sns/internal/features/presentation/main/p0;->a()V

    .line 58
    :cond_0
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    move-result-object v0

    new-instance v3, Lcom/sumsub/sns/internal/features/presentation/main/I1;

    const/4 p2, 0x0

    invoke-direct {v3, p0, p1, p2}, Lcom/sumsub/sns/internal/features/presentation/main/I1;-><init>(Lcom/sumsub/sns/internal/features/presentation/main/a2;Lcom/sumsub/sns/core/data/model/SNSCompletionResult;Lkotlin/coroutines/Continuation;)V

    const/4 v4, 0x3

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static/range {v0 .. v5}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    return-void
.end method

.method public final a(Lcom/sumsub/sns/internal/core/common/w;J)V
    .locals 8

    .line 91
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    move-result-object v0

    new-instance v1, Lcom/sumsub/sns/internal/features/presentation/main/r1;

    const/4 v3, 0x0

    move-object v7, p0

    move-object v2, p0

    move-object v6, p1

    move-wide v4, p2

    invoke-direct/range {v1 .. v7}, Lcom/sumsub/sns/internal/features/presentation/main/r1;-><init>(Lcom/sumsub/sns/internal/features/presentation/main/a2;Lkotlin/coroutines/Continuation;JLcom/sumsub/sns/internal/core/common/w;Lcom/sumsub/sns/internal/features/presentation/main/a2;)V

    const/4 v4, 0x3

    const/4 v5, 0x0

    move-object v3, v1

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static/range {v0 .. v5}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    return-void
.end method

.method public final a(Lcom/sumsub/sns/internal/features/data/model/common/X;)V
    .locals 3

    .line 25
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/data/model/common/X;->a:Ljava/lang/String;

    .line 26
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "A user has uploaded document: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 27
    sget-object v0, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 28
    iget-object v0, v0, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 29
    const-string v1, "SNSAppViewModel2"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p1, v2}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final a(Lcom/sumsub/sns/internal/features/data/model/common/h;Lcom/sumsub/sns/internal/features/data/model/common/remote/response/o0;)V
    .locals 4

    .line 18
    iget-object v0, p2, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/o0;->a:Ljava/lang/String;

    .line 19
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Postponing SDK init for restrictions prompt: restriction="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 20
    sget-object v1, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 21
    iget-object v1, v1, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 22
    const-string v2, "SNSAppViewModel2"

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v0, v3}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 23
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/main/v2;

    invoke-direct {v0, p0, p1}, Lcom/sumsub/sns/internal/features/presentation/main/v2;-><init>(Lcom/sumsub/sns/internal/features/presentation/main/a2;Lcom/sumsub/sns/internal/features/data/model/common/h;)V

    iput-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/main/a2;->v:Lkotlin/jvm/functions/Function0;

    .line 24
    new-instance p1, Lcom/sumsub/sns/internal/features/presentation/main/V;

    invoke-direct {p1, p2}, Lcom/sumsub/sns/internal/features/presentation/main/V;-><init>(Lcom/sumsub/sns/internal/features/data/model/common/remote/response/o0;)V

    invoke-virtual {p0, p1}, Lcom/sumsub/sns/internal/features/presentation/main/a2;->fireEvent(Lcom/sumsub/sns/core/presentation/base/r;)V

    return-void
.end method

.method public final a(Lcom/sumsub/sns/internal/features/data/model/common/t2;Landroid/os/Parcelable;Ljava/lang/String;)V
    .locals 7

    .line 59
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    move-result-object v0

    new-instance v1, Lcom/sumsub/sns/internal/features/presentation/main/S1;

    const/4 v6, 0x0

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    invoke-direct/range {v1 .. v6}, Lcom/sumsub/sns/internal/features/presentation/main/S1;-><init>(Lcom/sumsub/sns/internal/features/presentation/main/a2;Lcom/sumsub/sns/internal/features/data/model/common/t2;Landroid/os/Parcelable;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    const/4 v4, 0x3

    const/4 v5, 0x0

    move-object v3, v1

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static/range {v0 .. v5}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    return-void
.end method

.method public final a(Lkotlin/jvm/functions/Function2;)V
    .locals 7

    const/4 v0, 0x1

    .line 88
    invoke-virtual {p0, v0}, Lcom/sumsub/sns/internal/features/presentation/main/a2;->f(Z)V

    .line 89
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    move-result-object v1

    new-instance v4, Lcom/sumsub/sns/internal/features/presentation/main/w1;

    const/4 v0, 0x0

    invoke-direct {v4, p1, p0, v0}, Lcom/sumsub/sns/internal/features/presentation/main/w1;-><init>(Lkotlin/jvm/functions/Function2;Lcom/sumsub/sns/internal/features/presentation/main/a2;Lkotlin/coroutines/Continuation;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    return-void
.end method

.method public final a(ZZ)V
    .locals 7

    .line 90
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    move-result-object v0

    new-instance v1, Lcom/sumsub/sns/internal/features/presentation/main/L1;

    const/4 v3, 0x0

    move-object v5, p0

    move-object v2, p0

    move v4, p1

    move v6, p2

    invoke-direct/range {v1 .. v6}, Lcom/sumsub/sns/internal/features/presentation/main/L1;-><init>(Lcom/sumsub/sns/internal/features/presentation/main/a2;Lkotlin/coroutines/Continuation;ZLcom/sumsub/sns/internal/features/presentation/main/a2;Z)V

    const/4 v4, 0x3

    const/4 v5, 0x0

    move-object v3, v1

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static/range {v0 .. v5}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    return-void
.end method

.method public final b(Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 4

    instance-of v0, p1, Lcom/sumsub/sns/internal/features/presentation/main/V1;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/main/V1;

    iget v1, v0, Lcom/sumsub/sns/internal/features/presentation/main/V1;->c:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/sumsub/sns/internal/features/presentation/main/V1;->c:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/main/V1;

    invoke-direct {v0, p0, p1}, Lcom/sumsub/sns/internal/features/presentation/main/V1;-><init>(Lcom/sumsub/sns/internal/features/presentation/main/a2;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/main/V1;->a:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 3
    iget v2, v0, Lcom/sumsub/sns/internal/features/presentation/main/V1;->c:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 4
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/main/a2;->i:Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;

    iput v3, v0, Lcom/sumsub/sns/internal/features/presentation/main/V1;->c:I

    .line 5
    check-cast p1, Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;

    const/4 v2, 0x0

    invoke-virtual {p1, v2, v0}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;->a(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    .line 6
    :cond_3
    :goto_1
    check-cast p1, Lcom/sumsub/sns/internal/features/data/repository/dynamic/N;

    invoke-virtual {p1}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/N;->c()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/sumsub/sns/internal/features/data/model/common/p;

    if-eqz p1, :cond_5

    .line 7
    invoke-virtual {p1}, Lcom/sumsub/sns/internal/features/data/model/common/p;->l()Lcom/sumsub/sns/internal/features/data/model/common/j3;

    move-result-object v0

    .line 8
    iget-object v1, v0, Lcom/sumsub/sns/internal/features/data/model/common/j3;->b:Ljava/util/List;

    .line 9
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/data/model/common/j3;->d:Lcom/sumsub/sns/internal/features/data/model/common/B3;

    if-eqz v0, :cond_4

    .line 10
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/data/model/common/B3;->a:Lcom/sumsub/sns/internal/features/data/model/common/ReviewStatusType;

    goto :goto_2

    :cond_4
    const/4 v0, 0x0

    .line 11
    :goto_2
    invoke-static {p1, v1, v0}, Lcom/sumsub/sns/internal/features/data/model/common/H;->a(Lcom/sumsub/sns/internal/features/data/model/common/p;Ljava/util/List;Lcom/sumsub/sns/internal/features/data/model/common/ReviewStatusType;)Lcom/sumsub/sns/core/data/model/SNSSDKState;

    move-result-object p1

    if-eqz p1, :cond_5

    .line 12
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/main/a2;->g:Lcom/sumsub/sns/internal/features/data/repository/common/a;

    check-cast v0, Lcom/sumsub/sns/internal/features/data/repository/common/e;

    invoke-virtual {v0, p1}, Lcom/sumsub/sns/internal/features/data/repository/common/e;->a(Lcom/sumsub/sns/core/data/model/SNSSDKState;)V

    .line 13
    :cond_5
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final b(Ljava/lang/String;)V
    .locals 6

    .line 14
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    move-result-object v0

    new-instance v3, Lcom/sumsub/sns/internal/features/presentation/main/W1;

    const/4 v1, 0x0

    invoke-direct {v3, p0, v1, p0, p1}, Lcom/sumsub/sns/internal/features/presentation/main/W1;-><init>(Lcom/sumsub/sns/internal/features/presentation/main/a2;Lkotlin/coroutines/Continuation;Lcom/sumsub/sns/internal/features/presentation/main/a2;Ljava/lang/String;)V

    const/4 v4, 0x3

    const/4 v5, 0x0

    const/4 v2, 0x0

    invoke-static/range {v0 .. v5}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    return-void
.end method

.method public final c()V
    .locals 4

    .line 1
    sget-object v0, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 2
    iget-object v0, v0, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 3
    const-string v1, "SNSAppViewModel2"

    const-string v2, "Restrictions check passed. Continuing SDK init..."

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 4
    sget-object v0, Lcom/sumsub/sns/internal/ff/a;->b0:Lcom/sumsub/sns/internal/ff/core/a;

    .line 5
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/ff/core/a;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 6
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/main/P1;

    invoke-direct {v0, p0, v3}, Lcom/sumsub/sns/internal/features/presentation/main/P1;-><init>(Lcom/sumsub/sns/internal/features/presentation/main/a2;Lkotlin/coroutines/Continuation;)V

    invoke-virtual {p0, v0}, Lcom/sumsub/sns/internal/features/presentation/main/a2;->a(Lkotlin/jvm/functions/Function2;)V

    return-void

    .line 7
    :cond_0
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/main/a2;->v:Lkotlin/jvm/functions/Function0;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    :cond_1
    return-void
.end method

.method public final c(Z)V
    .locals 1

    .line 8
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/main/a2;->l:Lcom/sumsub/sns/internal/features/presentation/main/instructions/h;

    invoke-virtual {v0, p1}, Lcom/sumsub/sns/internal/features/presentation/main/instructions/h;->a(Z)Lcom/sumsub/sns/internal/features/presentation/main/b0;

    move-result-object p1

    if-nez p1, :cond_0

    return-void

    .line 9
    :cond_0
    invoke-virtual {p0, p1}, Lcom/sumsub/sns/internal/features/presentation/main/a2;->fireEvent(Lcom/sumsub/sns/core/presentation/base/r;)V

    return-void
.end method

.method public final d(Z)V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/main/x1;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, p0, p1, v1}, Lcom/sumsub/sns/internal/features/presentation/main/x1;-><init>(Lcom/sumsub/sns/internal/features/presentation/main/a2;ZLkotlin/coroutines/Continuation;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0, v0}, Lcom/sumsub/sns/internal/features/presentation/main/a2;->a(Lkotlin/jvm/functions/Function2;)V

    .line 10
    return-void
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

.method public final e()V
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/main/a2;->l:Lcom/sumsub/sns/internal/features/presentation/main/instructions/h;

    .line 3
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/presentation/main/instructions/h;->b:Ljava/util/Set;

    .line 4
    invoke-interface {v0}, Ljava/util/Set;->clear()V

    return-void
.end method

.method public final e(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/main/a2;->q:Lkotlinx/coroutines/flow/n;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {v0, p1}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final f()Lcom/sumsub/sns/internal/features/presentation/main/d;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/main/a2;->u:Lcom/sumsub/sns/internal/features/presentation/main/d;

    return-object v0
.end method

.method public final f(Z)V
    .locals 2

    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/main/a2;->r:Lkotlinx/coroutines/flow/n;

    invoke-interface {v0}, Lkotlinx/coroutines/flow/n;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, -0x1

    :goto_0
    add-int/2addr v1, p1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, p1}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final fireEvent(Lcom/sumsub/sns/core/presentation/base/r;)V
    .locals 11

    .line 1
    .line 2
    instance-of v0, p1, Lcom/sumsub/sns/internal/features/presentation/main/Y;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    move-object v0, p1

    .line 6
    .line 7
    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/main/Y;

    .line 8
    .line 9
    iget-object v3, v0, Lcom/sumsub/sns/internal/features/presentation/main/Y;->a:Lcom/sumsub/sns/internal/features/data/model/common/t2;

    .line 10
    .line 11
    if-eqz v3, :cond_0

    .line 12
    move-object v4, p1

    .line 13
    .line 14
    check-cast v4, Landroid/os/Parcelable;

    .line 15
    .line 16
    .line 17
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    .line 18
    move-result-object p1

    .line 19
    .line 20
    new-instance v1, Lcom/sumsub/sns/internal/features/presentation/main/S1;

    .line 21
    const/4 v5, 0x0

    .line 22
    const/4 v6, 0x0

    .line 23
    move-object v2, p0

    .line 24
    .line 25
    .line 26
    invoke-direct/range {v1 .. v6}, Lcom/sumsub/sns/internal/features/presentation/main/S1;-><init>(Lcom/sumsub/sns/internal/features/presentation/main/a2;Lcom/sumsub/sns/internal/features/data/model/common/t2;Landroid/os/Parcelable;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    .line 27
    const/4 v9, 0x3

    .line 28
    const/4 v10, 0x0

    .line 29
    const/4 v7, 0x0

    .line 30
    move-object v5, p1

    .line 31
    move-object v8, v1

    .line 32
    .line 33
    .line 34
    invoke-static/range {v5 .. v10}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 35
    return-void

    .line 36
    .line 37
    .line 38
    :cond_0
    invoke-super {p0, p1}, Lcom/sumsub/sns/core/presentation/base/C;->fireEvent(Lcom/sumsub/sns/core/presentation/base/r;)V

    .line 39
    return-void
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
.end method

.method public final g()Lcom/sumsub/sns/internal/features/presentation/main/k2;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/main/a2;->t:Lcom/sumsub/sns/internal/features/presentation/main/k2;

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

.method public final getDefaultState()Lcom/sumsub/sns/core/presentation/base/s;
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/main/f2;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/sumsub/sns/internal/features/presentation/main/f2;-><init>()V

    .line 6
    return-object v0
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

.method public final handleDataUpdated(Lcom/sumsub/sns/internal/features/data/repository/dynamic/i;)V
    .locals 14

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    .line 5
    .line 6
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    .line 7
    move-result-object v1

    .line 8
    .line 9
    new-instance v4, Lcom/sumsub/sns/internal/features/presentation/main/v1;

    .line 10
    .line 11
    .line 12
    invoke-direct {v4, p0, v0}, Lcom/sumsub/sns/internal/features/presentation/main/v1;-><init>(Lcom/sumsub/sns/internal/features/presentation/main/a2;Lkotlin/coroutines/Continuation;)V

    .line 13
    const/4 v5, 0x3

    .line 14
    const/4 v6, 0x0

    .line 15
    const/4 v2, 0x0

    .line 16
    const/4 v3, 0x0

    .line 17
    .line 18
    .line 19
    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 20
    return-void

    .line 21
    .line 22
    :cond_0
    iget-object v1, p1, Lcom/sumsub/sns/internal/features/data/repository/dynamic/i;->a:Lcom/sumsub/sns/internal/features/data/repository/dynamic/N;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/N;->c()Ljava/lang/Object;

    .line 26
    move-result-object v1

    .line 27
    .line 28
    check-cast v1, Lcom/sumsub/sns/internal/features/data/model/common/p;

    .line 29
    .line 30
    const-string v2, "SNSAppViewModel2"

    .line 31
    .line 32
    if-eqz v1, :cond_3

    .line 33
    .line 34
    instance-of v3, v1, Lcom/sumsub/sns/internal/features/data/model/common/a;

    .line 35
    .line 36
    if-eqz v3, :cond_1

    .line 37
    move-object v3, v1

    .line 38
    goto :goto_0

    .line 39
    :cond_1
    move-object v3, v0

    .line 40
    .line 41
    :goto_0
    if-eqz v3, :cond_3

    .line 42
    .line 43
    check-cast v3, Lcom/sumsub/sns/internal/features/data/model/common/a;

    .line 44
    .line 45
    iget-object v4, p1, Lcom/sumsub/sns/internal/features/data/repository/dynamic/i;->b:Lcom/sumsub/sns/internal/features/data/repository/dynamic/N;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v4}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/N;->c()Ljava/lang/Object;

    .line 49
    move-result-object v4

    .line 50
    .line 51
    check-cast v4, Lcom/sumsub/sns/internal/features/data/model/common/h;

    .line 52
    .line 53
    iget-object v5, v3, Lcom/sumsub/sns/internal/features/data/model/common/a;->n:Ljava/lang/String;

    .line 54
    .line 55
    if-eqz v4, :cond_2

    .line 56
    .line 57
    iget-object v4, v4, Lcom/sumsub/sns/internal/features/data/model/common/h;->x:Lcom/sumsub/sns/internal/features/data/model/common/g;

    .line 58
    .line 59
    if-eqz v4, :cond_2

    .line 60
    .line 61
    iget-object v4, v4, Lcom/sumsub/sns/internal/features/data/model/common/g;->b:Lcom/sumsub/sns/core/data/model/FlowActionType;

    .line 62
    .line 63
    if-eqz v4, :cond_2

    .line 64
    .line 65
    .line 66
    invoke-virtual {v4}, Lcom/sumsub/sns/core/data/model/FlowActionType;->getValue()Ljava/lang/String;

    .line 67
    move-result-object v4

    .line 68
    goto :goto_1

    .line 69
    :cond_2
    move-object v4, v0

    .line 70
    .line 71
    :goto_1
    iget-object v3, v3, Lcom/sumsub/sns/internal/features/data/model/common/a;->f:Lcom/sumsub/sns/internal/features/data/model/common/o;

    .line 72
    .line 73
    iget-object v3, v3, Lcom/sumsub/sns/internal/features/data/model/common/o;->b:Lcom/sumsub/sns/internal/features/data/model/common/ReviewStatusType;

    .line 74
    .line 75
    new-instance v6, Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 79
    .line 80
    const-string v7, "Action state: "

    .line 81
    .line 82
    .line 83
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    const-string v5, ", "

    .line 89
    .line 90
    .line 91
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 104
    move-result-object v3

    .line 105
    .line 106
    sget-object v4, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 107
    .line 108
    iget-object v4, v4, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 109
    .line 110
    .line 111
    invoke-virtual {v4, v2, v3, v0}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 112
    .line 113
    :cond_3
    iget-object v3, p0, Lcom/sumsub/sns/internal/features/presentation/main/a2;->n:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 114
    .line 115
    sget-object v4, Lcom/sumsub/sns/internal/features/presentation/main/a2;->x:[Lkotlin/reflect/KProperty;

    .line 116
    const/4 v5, 0x0

    .line 117
    .line 118
    aget-object v6, v4, v5

    .line 119
    .line 120
    .line 121
    invoke-virtual {v3}, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a()Ljava/lang/Object;

    .line 122
    move-result-object v3

    .line 123
    .line 124
    check-cast v3, Ljava/lang/String;

    .line 125
    .line 126
    if-nez v3, :cond_5

    .line 127
    .line 128
    if-eqz v1, :cond_4

    .line 129
    .line 130
    .line 131
    invoke-virtual {v1}, Lcom/sumsub/sns/internal/features/data/model/common/p;->l()Lcom/sumsub/sns/internal/features/data/model/common/j3;

    .line 132
    move-result-object v3

    .line 133
    .line 134
    if-eqz v3, :cond_4

    .line 135
    .line 136
    iget-object v3, v3, Lcom/sumsub/sns/internal/features/data/model/common/j3;->a:Lcom/sumsub/sns/internal/features/data/model/common/r2;

    .line 137
    .line 138
    iget-object v3, v3, Lcom/sumsub/sns/internal/features/data/model/common/r2;->a:Ljava/lang/String;

    .line 139
    goto :goto_2

    .line 140
    :cond_4
    move-object v3, v0

    .line 141
    .line 142
    :goto_2
    iget-object v6, p0, Lcom/sumsub/sns/internal/features/presentation/main/a2;->n:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 143
    .line 144
    aget-object v7, v4, v5

    .line 145
    .line 146
    iget-object v7, v6, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a:Landroidx/lifecycle/SavedStateHandle;

    .line 147
    .line 148
    iget-object v6, v6, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->b:Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    invoke-virtual {v7, v6, v3}, Landroidx/lifecycle/SavedStateHandle;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 152
    .line 153
    :cond_5
    if-eqz v1, :cond_6

    .line 154
    .line 155
    .line 156
    invoke-virtual {v1}, Lcom/sumsub/sns/internal/features/data/model/common/p;->l()Lcom/sumsub/sns/internal/features/data/model/common/j3;

    .line 157
    move-result-object v3

    .line 158
    .line 159
    if-eqz v3, :cond_6

    .line 160
    .line 161
    iget-object v3, v3, Lcom/sumsub/sns/internal/features/data/model/common/j3;->a:Lcom/sumsub/sns/internal/features/data/model/common/r2;

    .line 162
    .line 163
    iget-object v3, v3, Lcom/sumsub/sns/internal/features/data/model/common/r2;->a:Ljava/lang/String;

    .line 164
    goto :goto_3

    .line 165
    :cond_6
    move-object v3, v0

    .line 166
    .line 167
    :goto_3
    iget-object v6, p0, Lcom/sumsub/sns/internal/features/presentation/main/a2;->n:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 168
    .line 169
    aget-object v7, v4, v5

    .line 170
    .line 171
    .line 172
    invoke-virtual {v6}, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a()Ljava/lang/Object;

    .line 173
    move-result-object v6

    .line 174
    .line 175
    check-cast v6, Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    invoke-static {v6, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 179
    move-result v6

    .line 180
    const/4 v7, 0x1

    .line 181
    .line 182
    if-nez v6, :cond_7

    .line 183
    .line 184
    if-eqz v3, :cond_7

    .line 185
    move v6, v7

    .line 186
    goto :goto_4

    .line 187
    :cond_7
    move v6, v5

    .line 188
    .line 189
    :goto_4
    iget-object v8, p0, Lcom/sumsub/sns/internal/features/presentation/main/a2;->n:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 190
    .line 191
    aget-object v9, v4, v5

    .line 192
    .line 193
    iget-object v9, v8, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a:Landroidx/lifecycle/SavedStateHandle;

    .line 194
    .line 195
    iget-object v8, v8, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->b:Ljava/lang/String;

    .line 196
    .line 197
    .line 198
    invoke-virtual {v9, v8, v3}, Landroidx/lifecycle/SavedStateHandle;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 199
    .line 200
    if-eqz v6, :cond_9

    .line 201
    .line 202
    iget-object v3, p0, Lcom/sumsub/sns/internal/features/presentation/main/a2;->s:Lcom/sumsub/sns/internal/features/presentation/main/k2;

    .line 203
    .line 204
    iget-object v3, v3, Lcom/sumsub/sns/internal/features/presentation/main/k2;->a:Ljava/util/LinkedHashSet;

    .line 205
    .line 206
    .line 207
    invoke-interface {v3}, Ljava/util/Set;->clear()V

    .line 208
    .line 209
    if-eqz v1, :cond_8

    .line 210
    .line 211
    .line 212
    invoke-virtual {v1}, Lcom/sumsub/sns/internal/features/data/model/common/p;->e()Ljava/lang/String;

    .line 213
    move-result-object v3

    .line 214
    .line 215
    if-eqz v3, :cond_8

    .line 216
    .line 217
    .line 218
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    .line 219
    move-result-object v8

    .line 220
    .line 221
    new-instance v11, Lcom/sumsub/sns/internal/features/presentation/main/s1;

    .line 222
    .line 223
    .line 224
    invoke-direct {v11, p0, v3, v0}, Lcom/sumsub/sns/internal/features/presentation/main/s1;-><init>(Lcom/sumsub/sns/internal/features/presentation/main/a2;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    .line 225
    const/4 v12, 0x3

    .line 226
    const/4 v13, 0x0

    .line 227
    const/4 v9, 0x0

    .line 228
    const/4 v10, 0x0

    .line 229
    .line 230
    .line 231
    invoke-static/range {v8 .. v13}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 232
    .line 233
    :cond_8
    sget-object v3, Lcom/sumsub/sns/internal/ff/a;->b0:Lcom/sumsub/sns/internal/ff/core/a;

    .line 234
    .line 235
    .line 236
    invoke-virtual {v3}, Lcom/sumsub/sns/internal/ff/core/a;->a()Z

    .line 237
    move-result v3

    .line 238
    .line 239
    if-eqz v3, :cond_9

    .line 240
    .line 241
    new-instance v3, Lcom/sumsub/sns/internal/features/presentation/main/t1;

    .line 242
    .line 243
    .line 244
    invoke-direct {v3, p0, v0}, Lcom/sumsub/sns/internal/features/presentation/main/t1;-><init>(Lcom/sumsub/sns/internal/features/presentation/main/a2;Lkotlin/coroutines/Continuation;)V

    .line 245
    .line 246
    .line 247
    invoke-virtual {p0, v3}, Lcom/sumsub/sns/internal/features/presentation/main/a2;->a(Lkotlin/jvm/functions/Function2;)V

    .line 248
    .line 249
    :cond_9
    iget-object v3, p0, Lcom/sumsub/sns/internal/features/presentation/main/a2;->n:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 250
    .line 251
    aget-object v4, v4, v5

    .line 252
    .line 253
    .line 254
    invoke-virtual {v3}, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a()Ljava/lang/Object;

    .line 255
    move-result-object v3

    .line 256
    .line 257
    check-cast v3, Ljava/lang/String;

    .line 258
    .line 259
    iget-object v4, p0, Lcom/sumsub/sns/internal/features/presentation/main/a2;->w:Lcom/sumsub/sns/internal/features/presentation/main/p0;

    .line 260
    .line 261
    iget-object v4, v4, Lcom/sumsub/sns/internal/features/presentation/main/p0;->r:Lkotlinx/coroutines/x1;

    .line 262
    .line 263
    if-eqz v4, :cond_a

    .line 264
    move v5, v7

    .line 265
    .line 266
    :cond_a
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/data/repository/dynamic/i;->a:Lcom/sumsub/sns/internal/features/data/repository/dynamic/N;

    .line 267
    .line 268
    .line 269
    invoke-virtual {p1}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/N;->c()Ljava/lang/Object;

    .line 270
    move-result-object p1

    .line 271
    .line 272
    check-cast p1, Lcom/sumsub/sns/internal/features/data/model/common/p;

    .line 273
    .line 274
    if-eqz p1, :cond_b

    .line 275
    .line 276
    .line 277
    invoke-virtual {p1}, Lcom/sumsub/sns/internal/features/data/model/common/p;->m()Lcom/sumsub/sns/internal/features/data/model/common/o;

    .line 278
    move-result-object p1

    .line 279
    .line 280
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/data/model/common/o;->b:Lcom/sumsub/sns/internal/features/data/model/common/ReviewStatusType;

    .line 281
    goto :goto_5

    .line 282
    :cond_b
    move-object p1, v0

    .line 283
    .line 284
    :goto_5
    new-instance v4, Ljava/lang/StringBuilder;

    .line 285
    .line 286
    .line 287
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 288
    .line 289
    const-string v7, "Data updated: levelChanged="

    .line 290
    .line 291
    .line 292
    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 293
    .line 294
    .line 295
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 296
    .line 297
    const-string v7, ", level="

    .line 298
    .line 299
    .line 300
    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 301
    .line 302
    .line 303
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 304
    .line 305
    const-string v3, ", isWaitingForLevelChange="

    .line 306
    .line 307
    .line 308
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 309
    .line 310
    .line 311
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 312
    .line 313
    const-string v3, ", applicant.status="

    .line 314
    .line 315
    .line 316
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 317
    .line 318
    .line 319
    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 320
    .line 321
    .line 322
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 323
    move-result-object p1

    .line 324
    .line 325
    sget-object v3, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 326
    .line 327
    iget-object v3, v3, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 328
    .line 329
    .line 330
    invoke-virtual {v3, v2, p1, v0}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 331
    .line 332
    sget-object p1, Lcom/sumsub/sns/internal/ff/a;->b0:Lcom/sumsub/sns/internal/ff/core/a;

    .line 333
    .line 334
    .line 335
    invoke-virtual {p1}, Lcom/sumsub/sns/internal/ff/core/a;->a()Z

    .line 336
    move-result p1

    .line 337
    .line 338
    if-nez p1, :cond_c

    .line 339
    .line 340
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/main/a2;->w:Lcom/sumsub/sns/internal/features/presentation/main/p0;

    .line 341
    .line 342
    iget-object v2, p1, Lcom/sumsub/sns/internal/features/presentation/main/p0;->r:Lkotlinx/coroutines/x1;

    .line 343
    .line 344
    if-eqz v2, :cond_c

    .line 345
    .line 346
    if-eqz v6, :cond_c

    .line 347
    .line 348
    .line 349
    invoke-virtual {p1}, Lcom/sumsub/sns/internal/features/presentation/main/p0;->a()V

    .line 350
    .line 351
    .line 352
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    .line 353
    move-result-object v7

    .line 354
    .line 355
    new-instance v10, Lcom/sumsub/sns/internal/features/presentation/main/u1;

    .line 356
    .line 357
    .line 358
    invoke-direct {v10, p0, v1, v0}, Lcom/sumsub/sns/internal/features/presentation/main/u1;-><init>(Lcom/sumsub/sns/internal/features/presentation/main/a2;Lcom/sumsub/sns/internal/features/data/model/common/p;Lkotlin/coroutines/Continuation;)V

    .line 359
    const/4 v11, 0x3

    .line 360
    const/4 v12, 0x0

    .line 361
    const/4 v8, 0x0

    .line 362
    const/4 v9, 0x0

    .line 363
    .line 364
    .line 365
    invoke-static/range {v7 .. v12}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 366
    :cond_c
    return-void
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
.end method

.method public final onCleared()V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    sput-object v0, Lcom/sumsub/sns/internal/core/analytics/e;->g:Lkotlin/jvm/functions/Function1;

    .line 4
    .line 5
    sget-object v1, Lcom/sumsub/sns/internal/ff/a;->b0:Lcom/sumsub/sns/internal/ff/core/a;

    .line 6
    .line 7
    .line 8
    invoke-virtual {v1}, Lcom/sumsub/sns/internal/ff/core/a;->a()Z

    .line 9
    move-result v1

    .line 10
    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/main/a2;->w:Lcom/sumsub/sns/internal/features/presentation/main/p0;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v1}, Lcom/sumsub/sns/internal/features/presentation/main/p0;->a()V

    .line 17
    .line 18
    :cond_0
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/main/a2;->i:Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;

    .line 19
    .line 20
    check-cast v1, Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;

    .line 21
    .line 22
    iget-object v2, v1, Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;->j:Lcom/sumsub/sns/internal/features/data/repository/dynamic/g;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v2}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/g;->a()V

    .line 26
    .line 27
    iget-object v2, v1, Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;->k:Lcom/sumsub/sns/internal/features/data/repository/dynamic/g;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v2}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/g;->a()V

    .line 31
    .line 32
    iget-object v2, v1, Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;->l:Lcom/sumsub/sns/internal/features/data/repository/dynamic/g;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v2}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/g;->a()V

    .line 36
    .line 37
    iget-object v1, v1, Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;->h:Lkotlinx/coroutines/flow/n;

    .line 38
    .line 39
    .line 40
    invoke-interface {v1, v0}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    invoke-super {p0}, Lcom/sumsub/sns/internal/features/presentation/main/i2;->onCleared()V

    .line 44
    return-void
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

.method public final onHandleError(Lcom/sumsub/sns/internal/features/data/model/common/l0;)V
    .locals 0

    .line 1
    return-void
    .line 2
    .line 3
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

.method public final onLoad()V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/main/a2;->g:Lcom/sumsub/sns/internal/features/data/repository/common/a;

    .line 3
    .line 4
    sget-object v1, Lcom/sumsub/sns/core/data/model/SNSSDKState$Ready;->INSTANCE:Lcom/sumsub/sns/core/data/model/SNSSDKState$Ready;

    .line 5
    .line 6
    check-cast v0, Lcom/sumsub/sns/internal/features/data/repository/common/e;

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, v1}, Lcom/sumsub/sns/internal/features/data/repository/common/e;->a(Lcom/sumsub/sns/core/data/model/SNSSDKState;)V

    .line 10
    .line 11
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/main/K1;

    .line 12
    const/4 v1, 0x0

    .line 13
    .line 14
    .line 15
    invoke-direct {v0, p0, v1}, Lcom/sumsub/sns/internal/features/presentation/main/K1;-><init>(Lcom/sumsub/sns/internal/features/presentation/main/a2;Lkotlin/coroutines/Continuation;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0, v0}, Lcom/sumsub/sns/internal/features/presentation/main/a2;->a(Lkotlin/jvm/functions/Function2;)V

    .line 19
    return-void
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

.method public final onPrepare(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 4

    .line 1
    .line 2
    instance-of v0, p1, Lcom/sumsub/sns/internal/features/presentation/main/M1;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    move-object v0, p1

    .line 6
    .line 7
    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/main/M1;

    .line 8
    .line 9
    iget v1, v0, Lcom/sumsub/sns/internal/features/presentation/main/M1;->c:I

    .line 10
    .line 11
    const/high16 v2, -0x80000000

    .line 12
    .line 13
    and-int v3, v1, v2

    .line 14
    .line 15
    if-eqz v3, :cond_0

    .line 16
    sub-int/2addr v1, v2

    .line 17
    .line 18
    iput v1, v0, Lcom/sumsub/sns/internal/features/presentation/main/M1;->c:I

    .line 19
    goto :goto_0

    .line 20
    .line 21
    :cond_0
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/main/M1;

    .line 22
    .line 23
    check-cast p1, Lkotlin/coroutines/jvm/internal/ContinuationImpl;

    .line 24
    .line 25
    .line 26
    invoke-direct {v0, p0, p1}, Lcom/sumsub/sns/internal/features/presentation/main/M1;-><init>(Lcom/sumsub/sns/internal/features/presentation/main/a2;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    .line 27
    .line 28
    :goto_0
    iget-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/main/M1;->a:Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 32
    move-result-object v1

    .line 33
    .line 34
    iget v2, v0, Lcom/sumsub/sns/internal/features/presentation/main/M1;->c:I

    .line 35
    const/4 v3, 0x1

    .line 36
    .line 37
    if-eqz v2, :cond_2

    .line 38
    .line 39
    if-ne v2, v3, :cond_1

    .line 40
    .line 41
    .line 42
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 43
    goto :goto_1

    .line 44
    .line 45
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 46
    .line 47
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 48
    .line 49
    .line 50
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 51
    throw p1

    .line 52
    .line 53
    .line 54
    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 55
    .line 56
    iput v3, v0, Lcom/sumsub/sns/internal/features/presentation/main/M1;->c:I

    .line 57
    .line 58
    .line 59
    invoke-static {p0, v0}, Lcom/sumsub/sns/internal/features/presentation/main/i2;->a(Lcom/sumsub/sns/internal/features/presentation/main/i2;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 60
    move-result-object p1

    .line 61
    .line 62
    if-ne p1, v1, :cond_3

    .line 63
    return-object v1

    .line 64
    .line 65
    :cond_3
    :goto_1
    new-instance p1, Lcom/sumsub/sns/internal/features/presentation/main/N1;

    .line 66
    const/4 v0, 0x0

    .line 67
    .line 68
    .line 69
    invoke-direct {p1, p0, v0}, Lcom/sumsub/sns/internal/features/presentation/main/N1;-><init>(Lcom/sumsub/sns/internal/features/presentation/main/a2;Lkotlin/coroutines/Continuation;)V

    .line 70
    const/4 v1, 0x0

    .line 71
    .line 72
    .line 73
    invoke-static {p0, v1, p1, v3, v0}, Lcom/sumsub/sns/core/presentation/base/M0;->updateState$default(Lcom/sumsub/sns/core/presentation/base/M0;ZLkotlin/jvm/functions/Function2;ILjava/lang/Object;)V

    .line 74
    .line 75
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 76
    return-object p1
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
.end method
