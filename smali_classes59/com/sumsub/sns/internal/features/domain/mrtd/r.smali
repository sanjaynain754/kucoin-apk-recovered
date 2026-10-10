.class public final Lcom/sumsub/sns/internal/features/domain/mrtd/r;
.super Lcom/sumsub/sns/internal/features/domain/mrtd/y;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# instance fields
.field public final c:Lcom/sumsub/sns/internal/features/data/model/common/E2;

.field public final d:Lkotlin/Lazy;


# direct methods
.method public constructor <init>(Lcom/sumsub/sns/internal/features/data/repository/applicant/M;Lcom/sumsub/sns/internal/features/data/repository/common/a;Lcom/sumsub/sns/internal/features/data/model/common/E2;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1, p2}, Lcom/sumsub/sns/internal/features/domain/mrtd/y;-><init>(Lcom/sumsub/sns/internal/features/data/repository/applicant/M;Lcom/sumsub/sns/internal/features/data/repository/common/a;)V

    .line 4
    .line 5
    iput-object p3, p0, Lcom/sumsub/sns/internal/features/domain/mrtd/r;->c:Lcom/sumsub/sns/internal/features/data/model/common/E2;

    .line 6
    .line 7
    new-instance p1, Lcom/sumsub/sns/internal/features/domain/mrtd/h0;

    .line 8
    .line 9
    .line 10
    invoke-direct {p1, p0}, Lcom/sumsub/sns/internal/features/domain/mrtd/h0;-><init>(Lcom/sumsub/sns/internal/features/domain/mrtd/r;)V

    .line 11
    .line 12
    .line 13
    invoke-static {p1}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 14
    move-result-object p1

    .line 15
    .line 16
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/domain/mrtd/r;->d:Lkotlin/Lazy;

    .line 17
    return-void
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

.method public static final a(Lcom/sumsub/sns/internal/features/domain/mrtd/r;)Lcom/sumsub/sns/nfc/api/SNSKinegramNfcDocumentReader;
    .locals 4

    .line 1
    sget-object v0, Lcom/sumsub/sns/nfc/api/SNSKinegramNfcDocumentReaderFactory;->INSTANCE:Lcom/sumsub/sns/nfc/api/SNSKinegramNfcDocumentReaderFactory;

    .line 2
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/domain/mrtd/r;->c:Lcom/sumsub/sns/internal/features/data/model/common/E2;

    .line 3
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/data/model/common/E2;->k:Ljava/lang/String;

    .line 4
    iget-object v2, p0, Lcom/sumsub/sns/internal/features/data/model/common/E2;->l:Ljava/lang/String;

    .line 5
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/data/model/common/E2;->m:Ljava/lang/String;

    .line 6
    new-instance v3, Lcom/sumsub/sns/internal/features/domain/mrtd/i0;

    invoke-direct {v3}, Lcom/sumsub/sns/internal/features/domain/mrtd/i0;-><init>()V

    .line 7
    invoke-virtual {v0, v1, v2, p0, v3}, Lcom/sumsub/sns/nfc/api/SNSKinegramNfcDocumentReaderFactory;->create(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)Lcom/sumsub/sns/nfc/api/SNSKinegramNfcDocumentReader;

    move-result-object p0

    return-object p0
.end method

.method public static final a(Ljava/lang/String;Ljava/lang/Throwable;)Lkotlin/Unit;
    .locals 2

    .line 9
    sget-object v0, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 10
    iget-object v0, v0, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 11
    const-string v1, "ReadMRTDUseCase"

    invoke-virtual {v0, v1, p0, p1}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 12
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method


# virtual methods
.method public final a(Landroid/nfc/tech/IsoDep;Lkotlin/jvm/functions/Function1;Lcom/sumsub/sns/internal/core/presentation/nfc/i;)Ljava/lang/Object;
    .locals 3

    .line 8
    invoke-static {}, Lkotlinx/coroutines/z0;->b()Lkotlinx/coroutines/j0;

    move-result-object v0

    new-instance v1, Lcom/sumsub/sns/internal/features/domain/mrtd/p;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, p2, v2}, Lcom/sumsub/sns/internal/features/domain/mrtd/p;-><init>(Lcom/sumsub/sns/internal/features/domain/mrtd/r;Landroid/nfc/tech/IsoDep;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)V

    invoke-static {v0, v1, p3}, Lkotlinx/coroutines/h;->g(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
