.class public final Lcom/sumsub/sns/internal/features/presentation/paymentmethod/selector/v;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# instance fields
.field public final a:Lcom/sumsub/sns/internal/features/presentation/paymentmethod/selector/s;

.field public final b:Lkotlin/jvm/functions/Function0;

.field public final c:Lcom/sumsub/sns/internal/features/domain/utils/b;

.field public d:Z

.field public e:Lcom/sumsub/sns/internal/features/presentation/paymentmethod/b;

.field public f:Z


# direct methods
.method public constructor <init>(Lcom/sumsub/sns/internal/features/presentation/paymentmethod/selector/s;Lkotlin/jvm/functions/Function0;Lcom/sumsub/sns/internal/features/domain/utils/b;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/selector/v;->a:Lcom/sumsub/sns/internal/features/presentation/paymentmethod/selector/s;

    .line 6
    .line 7
    iput-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/selector/v;->b:Lkotlin/jvm/functions/Function0;

    .line 8
    .line 9
    iput-object p3, p0, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/selector/v;->c:Lcom/sumsub/sns/internal/features/domain/utils/b;

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


# virtual methods
.method public final a()V
    .locals 5

    .line 14
    iget-boolean v0, p0, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/selector/v;->d:Z

    if-nez v0, :cond_0

    goto :goto_0

    .line 15
    :cond_0
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/selector/v;->e:Lcom/sumsub/sns/internal/features/presentation/paymentmethod/b;

    if-nez v0, :cond_1

    goto :goto_0

    .line 16
    :cond_1
    iget-boolean v1, p0, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/selector/v;->f:Z

    if-eqz v1, :cond_2

    :goto_0
    return-void

    :cond_2
    const/4 v1, 0x1

    .line 17
    iput-boolean v1, p0, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/selector/v;->f:Z

    const/4 v1, 0x0

    .line 18
    iput-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/selector/v;->e:Lcom/sumsub/sns/internal/features/presentation/paymentmethod/b;

    .line 19
    iget-object v2, p0, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/selector/v;->c:Lcom/sumsub/sns/internal/features/domain/utils/b;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v4, "tryFire: opening "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "bankCard"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 20
    iget-object v2, v2, Lcom/sumsub/sns/internal/features/domain/utils/b;->a:Ljava/lang/String;

    .line 21
    sget-object v4, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 22
    iget-object v4, v4, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 23
    invoke-virtual {v4, v2, v3, v1}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 24
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/selector/v;->a:Lcom/sumsub/sns/internal/features/presentation/paymentmethod/selector/s;

    invoke-virtual {v1, v0}, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/selector/s;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final a(Lcom/sumsub/sns/internal/features/presentation/paymentmethod/b;)V
    .locals 5

    .line 1
    iget-boolean v0, p0, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/selector/v;->f:Z

    const/4 v1, 0x0

    const-string v2, "bankCard"

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/selector/v;->c:Lcom/sumsub/sns/internal/features/domain/utils/b;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v3, "requestAutoOpen("

    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ") ignored: already opened"

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 3
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/domain/utils/b;->a:Ljava/lang/String;

    .line 4
    sget-object v2, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 5
    iget-object v2, v2, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 6
    invoke-virtual {v2, v0, p1, v1}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void

    .line 7
    :cond_0
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/selector/v;->c:Lcom/sumsub/sns/internal/features/domain/utils/b;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v4, "requestAutoOpen: pending="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 8
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/domain/utils/b;->a:Ljava/lang/String;

    .line 9
    sget-object v3, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 10
    iget-object v3, v3, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 11
    invoke-virtual {v3, v0, v2, v1}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 12
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/selector/v;->e:Lcom/sumsub/sns/internal/features/presentation/paymentmethod/b;

    .line 13
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/paymentmethod/selector/v;->a()V

    return-void
.end method
