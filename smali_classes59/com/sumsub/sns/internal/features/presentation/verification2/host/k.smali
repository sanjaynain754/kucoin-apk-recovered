.class public final Lcom/sumsub/sns/internal/features/presentation/verification2/host/k;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# static fields
.field public static final synthetic c:[Lkotlin/reflect/KProperty;


# instance fields
.field public final a:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

.field public final b:Lkotlinx/coroutines/flow/w;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    .line 2
    const-string v0, "getLatestAttempt()Lcom/sumsub/sns/internal/features/presentation/verification2/host/VerificationAttempt;"

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    const-class v2, Lcom/sumsub/sns/internal/features/presentation/verification2/host/k;

    .line 6
    .line 7
    const-string v3, "latestAttempt"

    .line 8
    .line 9
    .line 10
    invoke-static {v2, v3, v0, v1}, Lcom/sumsub/sns/internal/core/presentation/android/a;->a(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)Lkotlin/reflect/KMutableProperty1;

    .line 11
    move-result-object v0

    .line 12
    const/4 v2, 0x1

    .line 13
    .line 14
    new-array v2, v2, [Lkotlin/reflect/KProperty;

    .line 15
    .line 16
    aput-object v0, v2, v1

    .line 17
    .line 18
    sput-object v2, Lcom/sumsub/sns/internal/features/presentation/verification2/host/k;->c:[Lkotlin/reflect/KProperty;

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

.method public constructor <init>(Landroidx/lifecycle/SavedStateHandle;)V
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    new-instance v0, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 6
    const/4 v1, 0x0

    .line 7
    .line 8
    const-string v2, "latestVerificationAttempt"

    .line 9
    const/4 v3, 0x0

    .line 10
    .line 11
    .line 12
    invoke-direct {v0, p1, v2, v3, v1}, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;-><init>(Landroidx/lifecycle/SavedStateHandle;Ljava/lang/String;Ljava/lang/Object;Z)V

    .line 13
    .line 14
    iput-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/verification2/host/k;->a:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1, v2, v3}, Landroidx/lifecycle/SavedStateHandle;->getStateFlow(Ljava/lang/String;Ljava/lang/Object;)Lkotlinx/coroutines/flow/w;

    .line 18
    move-result-object p1

    .line 19
    .line 20
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/verification2/host/k;->b:Lkotlinx/coroutines/flow/w;

    .line 21
    return-void
    .line 22
    .line 23
    .line 24
    .line 25
.end method
