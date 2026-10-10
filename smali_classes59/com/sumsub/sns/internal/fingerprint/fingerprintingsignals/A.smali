.class public final Lcom/sumsub/sns/internal/fingerprint/fingerprintingsignals/A;
.super Lcom/sumsub/sns/internal/fingerprint/fingerprintingsignals/s;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# static fields
.field public static final b:Lcom/sumsub/sns/internal/fingerprint/fingerprintingsignals/r;


# instance fields
.field public final a:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/sumsub/sns/internal/fingerprint/fingerprintingsignals/r;

    .line 3
    .line 4
    sget-object v1, Lcom/sumsub/sns/internal/fingerprint/signalproviders/StabilityLevel;->OPTIMAL:Lcom/sumsub/sns/internal/fingerprint/signalproviders/StabilityLevel;

    .line 5
    .line 6
    .line 7
    invoke-direct {v0, v1}, Lcom/sumsub/sns/internal/fingerprint/fingerprintingsignals/r;-><init>(Lcom/sumsub/sns/internal/fingerprint/signalproviders/StabilityLevel;)V

    .line 8
    .line 9
    sput-object v0, Lcom/sumsub/sns/internal/fingerprint/fingerprintingsignals/A;->b:Lcom/sumsub/sns/internal/fingerprint/fingerprintingsignals/r;

    .line 10
    return-void
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public constructor <init>(Z)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/sumsub/sns/internal/fingerprint/fingerprintingsignals/s;-><init>()V

    .line 4
    .line 5
    iput-boolean p1, p0, Lcom/sumsub/sns/internal/fingerprint/fingerprintingsignals/A;->a:Z

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
.method public final a()Ljava/util/Map;
    .locals 2

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/sumsub/sns/internal/fingerprint/fingerprintingsignals/A;->a:Z

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    const-string v1, "is_pin_security_enabled"

    .line 9
    .line 10
    .line 11
    invoke-static {v1, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    .line 15
    invoke-static {v0}, Lkotlin/collections/MapsKt;->mapOf(Lkotlin/Pair;)Ljava/util/Map;

    .line 16
    move-result-object v0

    .line 17
    return-object v0
.end method
