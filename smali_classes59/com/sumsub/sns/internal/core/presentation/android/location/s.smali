.class public final Lcom/sumsub/sns/internal/core/presentation/android/location/s;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# instance fields
.field public final a:Lkotlin/jvm/functions/Function0;

.field public final b:Lcom/sumsub/sns/internal/features/domain/utils/b;

.field public final c:Lkotlinx/coroutines/flow/n;

.field public final d:Lkotlinx/coroutines/flow/w;

.field public e:Lkotlinx/coroutines/w;


# direct methods
.method public constructor <init>(Lkotlin/jvm/functions/Function0;Lcom/sumsub/sns/internal/features/domain/utils/b;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput-object p1, p0, Lcom/sumsub/sns/internal/core/presentation/android/location/s;->a:Lkotlin/jvm/functions/Function0;

    .line 6
    .line 7
    iput-object p2, p0, Lcom/sumsub/sns/internal/core/presentation/android/location/s;->b:Lcom/sumsub/sns/internal/features/domain/utils/b;

    .line 8
    .line 9
    sget-object p1, Lcom/sumsub/sns/internal/core/presentation/android/location/LocationServiceController$Phase;->Idle:Lcom/sumsub/sns/internal/core/presentation/android/location/LocationServiceController$Phase;

    .line 10
    .line 11
    .line 12
    invoke-static {p1}, Lkotlinx/coroutines/flow/x;->a(Ljava/lang/Object;)Lkotlinx/coroutines/flow/n;

    .line 13
    move-result-object p1

    .line 14
    .line 15
    iput-object p1, p0, Lcom/sumsub/sns/internal/core/presentation/android/location/s;->c:Lkotlinx/coroutines/flow/n;

    .line 16
    .line 17
    .line 18
    invoke-static {p1}, Lkotlinx/coroutines/flow/g;->c(Lkotlinx/coroutines/flow/n;)Lkotlinx/coroutines/flow/w;

    .line 19
    move-result-object p1

    .line 20
    .line 21
    iput-object p1, p0, Lcom/sumsub/sns/internal/core/presentation/android/location/s;->d:Lkotlinx/coroutines/flow/w;

    .line 22
    return-void
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


# virtual methods
.method public final a(Ljava/lang/String;)V
    .locals 3

    .line 6
    iget-object v0, p0, Lcom/sumsub/sns/internal/core/presentation/android/location/s;->b:Lcom/sumsub/sns/internal/features/domain/utils/b;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "LocationServiceController"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/sumsub/sns/internal/features/domain/utils/b;->a(Lcom/sumsub/sns/internal/features/domain/utils/b;Ljava/lang/String;)V

    return-void
.end method

.method public final a(Z)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/sumsub/sns/internal/core/presentation/android/location/s;->e:Lkotlinx/coroutines/w;

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v1, 0x0

    .line 2
    iput-object v1, p0, Lcom/sumsub/sns/internal/core/presentation/android/location/s;->e:Lkotlinx/coroutines/w;

    .line 3
    iget-object v1, p0, Lcom/sumsub/sns/internal/core/presentation/android/location/s;->c:Lkotlinx/coroutines/flow/n;

    sget-object v2, Lcom/sumsub/sns/internal/core/presentation/android/location/LocationServiceController$Phase;->Idle:Lcom/sumsub/sns/internal/core/presentation/android/location/LocationServiceController$Phase;

    invoke-interface {v1, v2}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 4
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v2, "resolved: enabled="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/sumsub/sns/internal/core/presentation/android/location/s;->a(Ljava/lang/String;)V

    .line 5
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {v0, p1}, Lkotlinx/coroutines/w;->n(Ljava/lang/Object;)Z

    return-void
.end method

.method public final b(Z)V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/core/presentation/android/location/s;->e:Lkotlinx/coroutines/w;

    .line 3
    .line 4
    if-eqz v0, :cond_2

    .line 5
    .line 6
    iget-object v0, p0, Lcom/sumsub/sns/internal/core/presentation/android/location/s;->c:Lkotlinx/coroutines/flow/n;

    .line 7
    .line 8
    .line 9
    invoke-interface {v0}, Lkotlinx/coroutines/flow/n;->getValue()Ljava/lang/Object;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    sget-object v1, Lcom/sumsub/sns/internal/core/presentation/android/location/LocationServiceController$Phase;->AwaitingSettingsReturn:Lcom/sumsub/sns/internal/core/presentation/android/location/LocationServiceController$Phase;

    .line 13
    .line 14
    if-eq v0, v1, :cond_0

    .line 15
    goto :goto_0

    .line 16
    .line 17
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 21
    .line 22
    .line 23
    const-string/jumbo v1, "settings return: enabled="

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 33
    move-result-object v0

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0, v0}, Lcom/sumsub/sns/internal/core/presentation/android/location/s;->a(Ljava/lang/String;)V

    .line 37
    .line 38
    if-eqz p1, :cond_1

    .line 39
    const/4 p1, 0x1

    .line 40
    .line 41
    .line 42
    invoke-virtual {p0, p1}, Lcom/sumsub/sns/internal/core/presentation/android/location/s;->a(Z)V

    .line 43
    return-void

    .line 44
    .line 45
    :cond_1
    iget-object p1, p0, Lcom/sumsub/sns/internal/core/presentation/android/location/s;->c:Lkotlinx/coroutines/flow/n;

    .line 46
    .line 47
    sget-object v0, Lcom/sumsub/sns/internal/core/presentation/android/location/LocationServiceController$Phase;->CheckRequested:Lcom/sumsub/sns/internal/core/presentation/android/location/LocationServiceController$Phase;

    .line 48
    .line 49
    .line 50
    invoke-interface {p1, v0}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 51
    :cond_2
    :goto_0
    return-void
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
