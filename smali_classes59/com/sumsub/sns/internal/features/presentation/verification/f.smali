.class public abstract synthetic Lcom/sumsub/sns/internal/features/presentation/verification/f;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# static fields
.field public static final synthetic a:[I

.field public static final synthetic b:[I


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/sumsub/sns/internal/features/data/model/common/ValidationIdentifierType;->values()[Lcom/sumsub/sns/internal/features/data/model/common/ValidationIdentifierType;

    .line 4
    move-result-object v0

    .line 5
    array-length v0, v0

    .line 6
    .line 7
    new-array v0, v0, [I

    .line 8
    const/4 v1, 0x1

    .line 9
    .line 10
    :try_start_0
    sget-object v2, Lcom/sumsub/sns/internal/features/data/model/common/ValidationIdentifierType;->EMAIL:Lcom/sumsub/sns/internal/features/data/model/common/ValidationIdentifierType;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 14
    move-result v2

    .line 15
    .line 16
    aput v1, v0, v2
    :try_end_0
    .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_0

    .line 17
    :catch_0
    const/4 v2, 0x2

    .line 18
    .line 19
    :try_start_1
    sget-object v3, Lcom/sumsub/sns/internal/features/data/model/common/ValidationIdentifierType;->PHONE:Lcom/sumsub/sns/internal/features/data/model/common/ValidationIdentifierType;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 23
    move-result v3

    .line 24
    .line 25
    aput v2, v0, v3
    :try_end_1
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1 .. :try_end_1} :catch_1

    .line 26
    .line 27
    :catch_1
    sput-object v0, Lcom/sumsub/sns/internal/features/presentation/verification/f;->a:[I

    .line 28
    .line 29
    .line 30
    invoke-static {}, Lcom/sumsub/sns/internal/features/presentation/verification/SNSVerificationStepViewModel$ViewState$ButtonSpec$Action;->values()[Lcom/sumsub/sns/internal/features/presentation/verification/SNSVerificationStepViewModel$ViewState$ButtonSpec$Action;

    .line 31
    move-result-object v0

    .line 32
    array-length v0, v0

    .line 33
    .line 34
    new-array v0, v0, [I

    .line 35
    .line 36
    :try_start_2
    sget-object v3, Lcom/sumsub/sns/internal/features/presentation/verification/SNSVerificationStepViewModel$ViewState$ButtonSpec$Action;->RESEND_CODE:Lcom/sumsub/sns/internal/features/presentation/verification/SNSVerificationStepViewModel$ViewState$ButtonSpec$Action;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 40
    move-result v3

    .line 41
    .line 42
    aput v1, v0, v3
    :try_end_2
    .catch Ljava/lang/NoSuchFieldError; {:try_start_2 .. :try_end_2} :catch_2

    .line 43
    .line 44
    :catch_2
    :try_start_3
    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/verification/SNSVerificationStepViewModel$ViewState$ButtonSpec$Action;->ENTER_OTP:Lcom/sumsub/sns/internal/features/presentation/verification/SNSVerificationStepViewModel$ViewState$ButtonSpec$Action;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 48
    move-result v1

    .line 49
    .line 50
    aput v2, v0, v1
    :try_end_3
    .catch Ljava/lang/NoSuchFieldError; {:try_start_3 .. :try_end_3} :catch_3

    .line 51
    .line 52
    :catch_3
    sput-object v0, Lcom/sumsub/sns/internal/features/presentation/verification/f;->b:[I

    .line 53
    return-void
    .line 54
    .line 55
    .line 56
    .line 57
.end method
