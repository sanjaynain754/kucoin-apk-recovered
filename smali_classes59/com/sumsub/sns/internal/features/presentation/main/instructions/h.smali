.class public final Lcom/sumsub/sns/internal/features/presentation/main/instructions/h;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# static fields
.field public static final synthetic d:[Lkotlin/reflect/KProperty;

.field public static final e:[Ljava/lang/String;


# instance fields
.field public final a:Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;

.field public final b:Ljava/util/Set;

.field public final c:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    .line 2
    const-string v0, "getPendingInstructionsData()Lcom/sumsub/sns/internal/features/presentation/main/instructions/InstructionsResolver$PendingInstructionsData;"

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    const-class v2, Lcom/sumsub/sns/internal/features/presentation/main/instructions/h;

    .line 6
    .line 7
    .line 8
    const-string/jumbo v3, "pendingInstructionsData"

    .line 9
    .line 10
    .line 11
    invoke-static {v2, v3, v0, v1}, Lcom/sumsub/sns/internal/core/presentation/android/a;->a(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)Lkotlin/reflect/KMutableProperty1;

    .line 12
    move-result-object v0

    .line 13
    const/4 v2, 0x1

    .line 14
    .line 15
    new-array v2, v2, [Lkotlin/reflect/KProperty;

    .line 16
    .line 17
    aput-object v0, v2, v1

    .line 18
    .line 19
    sput-object v2, Lcom/sumsub/sns/internal/features/presentation/main/instructions/h;->d:[Lkotlin/reflect/KProperty;

    .line 20
    .line 21
    const-string v0, "VIDEO_IDENT"

    .line 22
    .line 23
    const-string v1, "PROOF_OF_RESIDENCE"

    .line 24
    .line 25
    .line 26
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 27
    move-result-object v0

    .line 28
    .line 29
    sput-object v0, Lcom/sumsub/sns/internal/features/presentation/main/instructions/h;->e:[Ljava/lang/String;

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

.method public constructor <init>(Landroidx/lifecycle/SavedStateHandle;Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;Ljava/util/Set;)V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/main/instructions/h;->a:Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;

    .line 6
    .line 7
    iput-object p3, p0, Lcom/sumsub/sns/internal/features/presentation/main/instructions/h;->b:Ljava/util/Set;

    .line 8
    .line 9
    new-instance p2, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 10
    const/4 p3, 0x0

    .line 11
    const/4 v0, 0x0

    .line 12
    .line 13
    const-string v1, "KEY_AFTER_INSTRUCTIONS_DATA"

    .line 14
    .line 15
    .line 16
    invoke-direct {p2, p1, v1, p3, v0}, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;-><init>(Landroidx/lifecycle/SavedStateHandle;Ljava/lang/String;Ljava/lang/Object;Z)V

    .line 17
    .line 18
    iput-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/main/instructions/h;->c:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

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
.end method

.method public static final a(Lcom/sumsub/sns/internal/features/presentation/main/instructions/h;Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;Lcom/sumsub/sns/internal/features/data/model/common/h;Lcom/sumsub/sns/internal/features/data/model/common/t2;)Lcom/sumsub/sns/internal/core/presentation/intro/b;
    .locals 7

    .line 82
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 83
    new-instance v0, Lcom/sumsub/sns/internal/core/presentation/intro/b;

    .line 84
    iget-object v2, p2, Lcom/sumsub/sns/internal/features/data/model/common/h;->d:Ljava/util/Map;

    .line 85
    iget-object v3, p3, Lcom/sumsub/sns/internal/features/data/model/common/t2;->a:Ljava/lang/String;

    .line 86
    iget-object v4, p3, Lcom/sumsub/sns/internal/features/data/model/common/t2;->c:Ljava/lang/String;

    .line 87
    iget-object v5, p3, Lcom/sumsub/sns/internal/features/data/model/common/t2;->b:Ljava/lang/String;

    const/4 v6, 0x0

    move-object v1, p1

    .line 88
    invoke-direct/range {v0 .. v6}, Lcom/sumsub/sns/internal/core/presentation/intro/b;-><init>(Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    return-object v0
.end method

.method public static a(Lcom/sumsub/sns/internal/features/data/model/common/t2;)Ljava/lang/String;
    .locals 3

    .line 24
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/data/model/common/t2;->a:Ljava/lang/String;

    .line 25
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/data/model/common/t2;->b:Ljava/lang/String;

    .line 26
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/data/model/common/t2;->c:Ljava/lang/String;

    .line 27
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string/jumbo v0, "|"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static a(Lcom/sumsub/sns/internal/features/data/model/common/t2;Lcom/sumsub/sns/internal/features/data/model/common/h;Lcom/sumsub/sns/internal/features/data/model/common/p;)Z
    .locals 11

    .line 1
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/data/model/common/t2;->a:Ljava/lang/String;

    .line 2
    const-string v1, "VIDEO_IDENT"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {p2}, Lcom/sumsub/sns/internal/features/data/model/common/p;->p()Z

    move-result p2

    if-eqz p2, :cond_0

    move p2, v1

    goto :goto_0

    :cond_0
    move p2, v2

    .line 4
    :goto_0
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/data/model/common/t2;->a:Ljava/lang/String;

    .line 5
    const-string v3, "PAYMENT_METHODS"

    const/4 v4, 0x2

    const/4 v5, 0x0

    invoke-static {v0, v3, v2, v4, v5}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v0

    .line 6
    iget-object v3, p0, Lcom/sumsub/sns/internal/features/data/model/common/t2;->a:Ljava/lang/String;

    .line 7
    const-string v6, "PROOF_OF_RESIDENCE"

    invoke-static {v3, v6, v2, v4, v5}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 8
    sget-object v3, Lcom/sumsub/sns/internal/ff/a;->W:Lcom/sumsub/sns/internal/ff/core/a;

    .line 9
    invoke-virtual {v3}, Lcom/sumsub/sns/internal/ff/core/a;->a()Z

    move-result v3

    if-eqz v3, :cond_1

    move v3, v1

    goto :goto_1

    :cond_1
    move v3, v2

    .line 10
    :goto_1
    sget-object v6, Lcom/sumsub/sns/internal/features/presentation/main/instructions/h;->e:[Ljava/lang/String;

    .line 11
    array-length v7, v6

    move v8, v2

    :goto_2
    if-ge v8, v7, :cond_3

    aget-object v9, v6, v8

    .line 12
    iget-object v10, p0, Lcom/sumsub/sns/internal/features/data/model/common/t2;->a:Ljava/lang/String;

    .line 13
    invoke-static {v10, v9, v2, v4, v5}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_2

    move v4, v1

    goto :goto_3

    :cond_2
    add-int/lit8 v8, v8, 0x1

    goto :goto_2

    :cond_3
    move v4, v2

    .line 14
    :goto_3
    iget-object v6, p0, Lcom/sumsub/sns/internal/features/data/model/common/t2;->a:Ljava/lang/String;

    .line 15
    iget-object v7, p0, Lcom/sumsub/sns/internal/features/data/model/common/t2;->b:Ljava/lang/String;

    .line 16
    sget-object v8, Lcom/sumsub/sns/internal/core/presentation/intro/IntroScene;->SCAN_BACKSIDE:Lcom/sumsub/sns/internal/core/presentation/intro/IntroScene;

    invoke-virtual {v8}, Lcom/sumsub/sns/internal/core/presentation/intro/IntroScene;->getSceneName()Ljava/lang/String;

    move-result-object v8

    invoke-static {v7, v8}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    .line 17
    invoke-static {p1, v6, v7}, Lcom/sumsub/sns/internal/features/data/model/common/i;->a(Lcom/sumsub/sns/internal/features/data/model/common/h;Ljava/lang/String;Z)Z

    move-result p1

    if-eqz v4, :cond_4

    if-eqz v3, :cond_5

    :cond_4
    if-eqz p1, :cond_5

    move v6, v1

    goto :goto_4

    :cond_5
    move v6, v2

    :goto_4
    if-nez v6, :cond_7

    if-nez p2, :cond_7

    if-eqz v0, :cond_6

    goto :goto_5

    :cond_6
    move v1, v2

    .line 18
    :cond_7
    :goto_5
    iget-object v2, p0, Lcom/sumsub/sns/internal/features/data/model/common/t2;->a:Ljava/lang/String;

    .line 19
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/data/model/common/t2;->b:Ljava/lang/String;

    .line 20
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "instructionsRequired: step="

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ", scene="

    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, ", matchesHardcoded="

    invoke-virtual {v7, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string p0, ", isOldPoa="

    invoke-virtual {v7, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string p0, ", config.showIntroScreen="

    invoke-virtual {v7, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string p0, " \u2192 required="

    invoke-virtual {v7, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string p0, " (orVideoIdent="

    invoke-virtual {v7, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string p0, ", orPaymentMethods="

    invoke-virtual {v7, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string p0, ") result="

    invoke-virtual {v7, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    .line 21
    sget-object p1, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 22
    iget-object p1, p1, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 23
    const-string p2, "InstructionsResolver"

    invoke-virtual {p1, p2, p0, v5}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return v1
.end method


# virtual methods
.method public final a(Z)Lcom/sumsub/sns/internal/features/presentation/main/b0;
    .locals 5

    .line 89
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "executeAfterInstructionsAction, success="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 90
    sget-object v1, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 91
    iget-object v1, v1, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 92
    const-string v2, "InstructionsResolver"

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v0, v3}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 93
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/main/instructions/h;->c:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/main/instructions/h;->d:[Lkotlin/reflect/KProperty;

    const/4 v2, 0x0

    aget-object v4, v1, v2

    invoke-virtual {v0}, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/main/instructions/f;

    if-nez v0, :cond_0

    return-object v3

    .line 94
    :cond_0
    iget-object v4, p0, Lcom/sumsub/sns/internal/features/presentation/main/instructions/h;->c:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    aget-object v1, v1, v2

    .line 95
    iget-object v1, v4, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a:Landroidx/lifecycle/SavedStateHandle;

    .line 96
    iget-object v4, v4, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->b:Ljava/lang/String;

    invoke-virtual {v1, v4, v3}, Landroidx/lifecycle/SavedStateHandle;->set(Ljava/lang/String;Ljava/lang/Object;)V

    if-eqz p1, :cond_4

    .line 97
    iget-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/main/instructions/f;->b:Landroid/os/Parcelable;

    .line 98
    instance-of v1, p1, Lcom/sumsub/sns/internal/features/presentation/main/Y;

    if-eqz v1, :cond_1

    .line 99
    move-object v1, p1

    check-cast v1, Lcom/sumsub/sns/internal/features/presentation/main/Y;

    .line 100
    iput-object v3, v1, Lcom/sumsub/sns/internal/features/presentation/main/Y;->a:Lcom/sumsub/sns/internal/features/data/model/common/t2;

    .line 101
    :cond_1
    instance-of v1, p1, Lcom/sumsub/sns/internal/features/presentation/main/b0;

    if-eqz v1, :cond_2

    .line 102
    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/main/b0;

    return-object p1

    .line 103
    :cond_2
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/presentation/main/instructions/f;->c:Ljava/lang/String;

    if-eqz v0, :cond_3

    .line 104
    new-instance v1, Lcom/sumsub/sns/internal/features/presentation/main/f;

    const/4 v2, 0x1

    invoke-direct {v1, v2, p1, v0}, Lcom/sumsub/sns/internal/features/presentation/main/f;-><init>(ZLandroid/os/Parcelable;Ljava/lang/String;)V

    return-object v1

    :cond_3
    return-object v3

    .line 105
    :cond_4
    iget-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/main/instructions/f;->c:Ljava/lang/String;

    if-eqz p1, :cond_5

    .line 106
    new-instance v1, Lcom/sumsub/sns/internal/features/presentation/main/f;

    .line 107
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/presentation/main/instructions/f;->b:Landroid/os/Parcelable;

    .line 108
    invoke-direct {v1, v2, v0, p1}, Lcom/sumsub/sns/internal/features/presentation/main/f;-><init>(ZLandroid/os/Parcelable;Ljava/lang/String;)V

    return-object v1

    :cond_5
    return-object v3
.end method

.method public final a(Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;Lcom/sumsub/sns/internal/features/data/model/common/t2;Landroid/os/Parcelable;Ljava/lang/String;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 9

    instance-of v0, p5, Lcom/sumsub/sns/internal/features/presentation/main/instructions/g;

    if-eqz v0, :cond_0

    move-object v0, p5

    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/main/instructions/g;

    iget v1, v0, Lcom/sumsub/sns/internal/features/presentation/main/instructions/g;->h:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/sumsub/sns/internal/features/presentation/main/instructions/g;->h:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/main/instructions/g;

    invoke-direct {v0, p0, p5}, Lcom/sumsub/sns/internal/features/presentation/main/instructions/g;-><init>(Lcom/sumsub/sns/internal/features/presentation/main/instructions/h;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object p5, v0, Lcom/sumsub/sns/internal/features/presentation/main/instructions/g;->f:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 28
    iget v2, v0, Lcom/sumsub/sns/internal/features/presentation/main/instructions/g;->h:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    const/4 v5, 0x0

    const-string v6, "InstructionsResolver"

    const/4 v7, 0x0

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/main/instructions/g;->e:Lcom/sumsub/sns/internal/features/data/model/common/p;

    iget-object p2, v0, Lcom/sumsub/sns/internal/features/presentation/main/instructions/g;->d:Ljava/lang/String;

    iget-object p3, v0, Lcom/sumsub/sns/internal/features/presentation/main/instructions/g;->c:Landroid/os/Parcelable;

    iget-object p4, v0, Lcom/sumsub/sns/internal/features/presentation/main/instructions/g;->b:Lcom/sumsub/sns/internal/features/data/model/common/t2;

    iget-object v0, v0, Lcom/sumsub/sns/internal/features/presentation/main/instructions/g;->a:Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;

    invoke-static {p5}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p4, v0, Lcom/sumsub/sns/internal/features/presentation/main/instructions/g;->d:Ljava/lang/String;

    iget-object p3, v0, Lcom/sumsub/sns/internal/features/presentation/main/instructions/g;->c:Landroid/os/Parcelable;

    iget-object p2, v0, Lcom/sumsub/sns/internal/features/presentation/main/instructions/g;->b:Lcom/sumsub/sns/internal/features/data/model/common/t2;

    iget-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/main/instructions/g;->a:Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;

    invoke-static {p5}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p5}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 29
    new-instance p5, Ljava/lang/StringBuilder;

    invoke-direct {p5}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v2, "resolveInstructions, introParams="

    invoke-virtual {p5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p5, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", payload="

    invoke-virtual {p5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p5, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p5

    .line 30
    sget-object v2, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 31
    iget-object v2, v2, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 32
    invoke-virtual {v2, v6, p5, v7}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 33
    iget-object p5, p0, Lcom/sumsub/sns/internal/features/presentation/main/instructions/h;->a:Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;

    iput-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/main/instructions/g;->a:Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;

    iput-object p2, v0, Lcom/sumsub/sns/internal/features/presentation/main/instructions/g;->b:Lcom/sumsub/sns/internal/features/data/model/common/t2;

    iput-object p3, v0, Lcom/sumsub/sns/internal/features/presentation/main/instructions/g;->c:Landroid/os/Parcelable;

    iput-object p4, v0, Lcom/sumsub/sns/internal/features/presentation/main/instructions/g;->d:Ljava/lang/String;

    iput v4, v0, Lcom/sumsub/sns/internal/features/presentation/main/instructions/g;->h:I

    .line 34
    check-cast p5, Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;

    invoke-virtual {p5, v5, v0}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;->a(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p5

    if-ne p5, v1, :cond_4

    goto :goto_2

    .line 35
    :cond_4
    :goto_1
    check-cast p5, Lcom/sumsub/sns/internal/features/data/repository/dynamic/N;

    invoke-virtual {p5}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/N;->c()Ljava/lang/Object;

    move-result-object p5

    check-cast p5, Lcom/sumsub/sns/internal/features/data/model/common/p;

    .line 36
    iget-object v2, p0, Lcom/sumsub/sns/internal/features/presentation/main/instructions/h;->a:Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;

    iput-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/main/instructions/g;->a:Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;

    iput-object p2, v0, Lcom/sumsub/sns/internal/features/presentation/main/instructions/g;->b:Lcom/sumsub/sns/internal/features/data/model/common/t2;

    iput-object p3, v0, Lcom/sumsub/sns/internal/features/presentation/main/instructions/g;->c:Landroid/os/Parcelable;

    iput-object p4, v0, Lcom/sumsub/sns/internal/features/presentation/main/instructions/g;->d:Ljava/lang/String;

    iput-object p5, v0, Lcom/sumsub/sns/internal/features/presentation/main/instructions/g;->e:Lcom/sumsub/sns/internal/features/data/model/common/p;

    iput v3, v0, Lcom/sumsub/sns/internal/features/presentation/main/instructions/g;->h:I

    .line 37
    check-cast v2, Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;

    invoke-virtual {v2, v5, v0}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;->b(ZLkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_5

    :goto_2
    return-object v1

    :cond_5
    move-object v8, v0

    move-object v0, p1

    move-object p1, p5

    move-object p5, v8

    move-object v8, p4

    move-object p4, p2

    move-object p2, v8

    .line 38
    :goto_3
    check-cast p5, Lcom/sumsub/sns/internal/features/data/repository/dynamic/N;

    invoke-virtual {p5}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/N;->c()Ljava/lang/Object;

    move-result-object p5

    check-cast p5, Lcom/sumsub/sns/internal/features/data/model/common/h;

    if-eqz p5, :cond_10

    if-nez p1, :cond_6

    goto/16 :goto_8

    :cond_6
    if-eqz p3, :cond_7

    .line 39
    new-instance v1, Lcom/sumsub/sns/internal/features/presentation/main/instructions/f;

    invoke-direct {v1, p4, p3, p2}, Lcom/sumsub/sns/internal/features/presentation/main/instructions/f;-><init>(Lcom/sumsub/sns/internal/features/data/model/common/t2;Landroid/os/Parcelable;Ljava/lang/String;)V

    .line 40
    iget-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/main/instructions/h;->c:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    sget-object p3, Lcom/sumsub/sns/internal/features/presentation/main/instructions/h;->d:[Lkotlin/reflect/KProperty;

    aget-object p3, p3, v5

    .line 41
    iget-object p3, p2, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a:Landroidx/lifecycle/SavedStateHandle;

    .line 42
    iget-object p2, p2, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->b:Ljava/lang/String;

    invoke-virtual {p3, p2, v1}, Landroidx/lifecycle/SavedStateHandle;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 43
    :cond_7
    invoke-static {p4, p5, p1}, Lcom/sumsub/sns/internal/features/presentation/main/instructions/h;->a(Lcom/sumsub/sns/internal/features/data/model/common/t2;Lcom/sumsub/sns/internal/features/data/model/common/h;Lcom/sumsub/sns/internal/features/data/model/common/p;)Z

    move-result p2

    .line 44
    iget-object p3, p0, Lcom/sumsub/sns/internal/features/presentation/main/instructions/h;->b:Ljava/util/Set;

    invoke-static {p4}, Lcom/sumsub/sns/internal/features/presentation/main/instructions/h;->a(Lcom/sumsub/sns/internal/features/data/model/common/t2;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {p3, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p3

    .line 45
    new-instance v1, Lcom/sumsub/sns/internal/features/presentation/main/instructions/i;

    invoke-direct {v1, p0, v0, p5, p4}, Lcom/sumsub/sns/internal/features/presentation/main/instructions/i;-><init>(Lcom/sumsub/sns/internal/features/presentation/main/instructions/h;Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;Lcom/sumsub/sns/internal/features/data/model/common/h;Lcom/sumsub/sns/internal/features/data/model/common/t2;)V

    invoke-static {v1}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object p5

    if-eqz p2, :cond_9

    if-nez p3, :cond_9

    .line 46
    invoke-interface {p5}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sumsub/sns/internal/core/presentation/intro/b;

    .line 47
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/core/presentation/intro/b;->b()Z

    move-result v0

    if-eqz v0, :cond_9

    .line 48
    sget-object p2, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 49
    iget-object p2, p2, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 50
    const-string/jumbo p3, "resolveInstructions: instructions required"

    invoke-virtual {p2, v6, p3, v7}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 51
    new-instance p2, Lcom/sumsub/sns/internal/features/presentation/main/instructions/b;

    .line 52
    iget-object p3, p4, Lcom/sumsub/sns/internal/features/data/model/common/t2;->e:Ljava/lang/String;

    if-nez p3, :cond_8

    .line 53
    invoke-virtual {p1}, Lcom/sumsub/sns/internal/features/data/model/common/p;->b()Ljava/lang/String;

    move-result-object p3

    .line 54
    :cond_8
    new-instance p1, Lcom/sumsub/sns/internal/core/presentation/intro/g;

    .line 55
    iget-object p5, p4, Lcom/sumsub/sns/internal/features/data/model/common/t2;->a:Ljava/lang/String;

    .line 56
    iget-object v0, p4, Lcom/sumsub/sns/internal/features/data/model/common/t2;->b:Ljava/lang/String;

    .line 57
    iget-object v1, p4, Lcom/sumsub/sns/internal/features/data/model/common/t2;->c:Ljava/lang/String;

    .line 58
    invoke-direct {p1, p5, v0, v1, p3}, Lcom/sumsub/sns/internal/core/presentation/intro/g;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 59
    new-instance p3, Lcom/sumsub/sns/internal/features/presentation/main/Z;

    .line 60
    iget-boolean p5, p4, Lcom/sumsub/sns/internal/features/data/model/common/t2;->d:Z

    .line 61
    iget-object p4, p4, Lcom/sumsub/sns/internal/features/data/model/common/t2;->f:Ljava/util/Map;

    .line 62
    invoke-direct {p3, p1, p5, p4}, Lcom/sumsub/sns/internal/features/presentation/main/Z;-><init>(Lcom/sumsub/sns/internal/core/presentation/intro/g;ZLjava/util/Map;)V

    .line 63
    invoke-direct {p2, p3}, Lcom/sumsub/sns/internal/features/presentation/main/instructions/b;-><init>(Lcom/sumsub/sns/internal/features/presentation/main/Z;)V

    return-object p2

    :cond_9
    if-nez p2, :cond_a

    .line 64
    const-string/jumbo p1, "not required  "

    goto :goto_4

    :cond_a
    move-object p1, v7

    :goto_4
    const-string p2, ""

    if-nez p1, :cond_b

    move-object p1, p2

    :cond_b
    if-eqz p3, :cond_c

    .line 65
    const-string p3, "already shown  "

    goto :goto_5

    :cond_c
    move-object p3, v7

    :goto_5
    if-nez p3, :cond_d

    move-object p3, p2

    .line 66
    :cond_d
    invoke-interface {p5}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Lcom/sumsub/sns/internal/core/presentation/intro/b;

    .line 67
    invoke-virtual {p4}, Lcom/sumsub/sns/internal/core/presentation/intro/b;->b()Z

    move-result p4

    if-nez p4, :cond_e

    const-string/jumbo p4, "no resources  "

    goto :goto_6

    :cond_e
    move-object p4, v7

    :goto_6
    if-nez p4, :cond_f

    goto :goto_7

    :cond_f
    move-object p2, p4

    :goto_7
    new-instance p4, Ljava/lang/StringBuilder;

    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo p5, "resolveInstructions: no instructions expected: "

    invoke-virtual {p4, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 68
    sget-object p2, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 69
    iget-object p2, p2, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 70
    invoke-virtual {p2, v6, p1, v7}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 71
    sget-object p1, Lcom/sumsub/sns/internal/features/presentation/main/instructions/c;->a:Lcom/sumsub/sns/internal/features/presentation/main/instructions/c;

    return-object p1

    :cond_10
    :goto_8
    if-eqz p5, :cond_11

    .line 72
    invoke-static {p5}, Lcom/sumsub/sns/internal/core/common/h;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    goto :goto_9

    :cond_11
    move-object p2, v7

    :goto_9
    if-eqz p1, :cond_12

    .line 73
    invoke-static {p1}, Lcom/sumsub/sns/internal/core/common/h;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    goto :goto_a

    :cond_12
    move-object p1, v7

    :goto_a
    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo p5, "resolveInstructions: config or applicant is null. c="

    invoke-virtual {p3, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, ", a="

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 74
    sget-object p2, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 75
    iget-object p2, p2, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 76
    invoke-virtual {p2, v6, p1, v7}, Lcom/sumsub/sns/internal/log/logger/b;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 77
    new-instance p1, Lcom/sumsub/sns/internal/features/presentation/main/instructions/a;

    .line 78
    new-instance p2, Lcom/sumsub/sns/internal/features/data/model/common/e0;

    new-instance v0, Lcom/sumsub/sns/core/data/model/SNSGeneralException;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string p5, "Resolve instructions error. Params - "

    invoke-virtual {p3, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v4, 0x6

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct/range {v0 .. v5}, Lcom/sumsub/sns/core/data/model/SNSGeneralException;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 p3, 0x6

    invoke-direct {p2, v0, v7, v7, p3}, Lcom/sumsub/sns/internal/features/data/model/common/e0;-><init>(Ljava/lang/Throwable;Landroid/os/Parcelable;Lcom/sumsub/sns/internal/features/data/model/common/c0;I)V

    .line 79
    iget-object p3, p4, Lcom/sumsub/sns/internal/features/data/model/common/t2;->c:Ljava/lang/String;

    if-nez p3, :cond_13

    .line 80
    const-string p3, "TYPE_UNKNOWN"

    .line 81
    :cond_13
    invoke-direct {p1, p2, p3}, Lcom/sumsub/sns/internal/features/presentation/main/instructions/a;-><init>(Lcom/sumsub/sns/internal/features/data/model/common/e0;Ljava/lang/String;)V

    return-object p1
.end method
