.class public abstract synthetic Lcom/sumsub/sns/internal/core/presentation/nfc/j;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# static fields
.field public static final synthetic a:[I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/sumsub/sns/internal/core/presentation/nfc/NfcReadController$ReadingStep;->values()[Lcom/sumsub/sns/internal/core/presentation/nfc/NfcReadController$ReadingStep;

    .line 4
    move-result-object v0

    .line 5
    array-length v0, v0

    .line 6
    .line 7
    new-array v0, v0, [I

    .line 8
    .line 9
    :try_start_0
    sget-object v1, Lcom/sumsub/sns/internal/core/presentation/nfc/NfcReadController$ReadingStep;->IDLE:Lcom/sumsub/sns/internal/core/presentation/nfc/NfcReadController$ReadingStep;

    .line 10
    .line 11
    .line 12
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 13
    move-result v1

    .line 14
    const/4 v2, 0x1

    .line 15
    .line 16
    aput v2, v0, v1
    :try_end_0
    .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_0

    .line 17
    .line 18
    :catch_0
    :try_start_1
    sget-object v1, Lcom/sumsub/sns/internal/core/presentation/nfc/NfcReadController$ReadingStep;->LISTENING:Lcom/sumsub/sns/internal/core/presentation/nfc/NfcReadController$ReadingStep;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 22
    move-result v1

    .line 23
    const/4 v2, 0x2

    .line 24
    .line 25
    aput v2, v0, v1
    :try_end_1
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1 .. :try_end_1} :catch_1

    .line 26
    .line 27
    :catch_1
    :try_start_2
    sget-object v1, Lcom/sumsub/sns/internal/core/presentation/nfc/NfcReadController$ReadingStep;->READING:Lcom/sumsub/sns/internal/core/presentation/nfc/NfcReadController$ReadingStep;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 31
    move-result v1

    .line 32
    const/4 v2, 0x3

    .line 33
    .line 34
    aput v2, v0, v1
    :try_end_2
    .catch Ljava/lang/NoSuchFieldError; {:try_start_2 .. :try_end_2} :catch_2

    .line 35
    .line 36
    :catch_2
    :try_start_3
    sget-object v1, Lcom/sumsub/sns/internal/core/presentation/nfc/NfcReadController$ReadingStep;->SUCCESS:Lcom/sumsub/sns/internal/core/presentation/nfc/NfcReadController$ReadingStep;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 40
    move-result v1

    .line 41
    const/4 v2, 0x4

    .line 42
    .line 43
    aput v2, v0, v1
    :try_end_3
    .catch Ljava/lang/NoSuchFieldError; {:try_start_3 .. :try_end_3} :catch_3

    .line 44
    .line 45
    :catch_3
    :try_start_4
    sget-object v1, Lcom/sumsub/sns/internal/core/presentation/nfc/NfcReadController$ReadingStep;->ERROR:Lcom/sumsub/sns/internal/core/presentation/nfc/NfcReadController$ReadingStep;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 49
    move-result v1

    .line 50
    const/4 v2, 0x5

    .line 51
    .line 52
    aput v2, v0, v1
    :try_end_4
    .catch Ljava/lang/NoSuchFieldError; {:try_start_4 .. :try_end_4} :catch_4

    .line 53
    .line 54
    :catch_4
    sput-object v0, Lcom/sumsub/sns/internal/core/presentation/nfc/j;->a:[I

    .line 55
    return-void
    .line 56
    .line 57
.end method
