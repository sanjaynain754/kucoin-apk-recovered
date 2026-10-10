.class public final Lcom/sumsub/sns/core/widget/SNSStepAttrs;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u0015\n\u0002\u0008\u000b\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007R\u0011\u0010\u0008\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\u0007R\u0011\u0010\n\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u0007R\u0011\u0010\u000c\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u0007R\u0011\u0010\u000e\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u0007\u00a8\u0006\u0010"
    }
    d2 = {
        "Lcom/sumsub/sns/core/widget/SNSStepAttrs;",
        "",
        "<init>",
        "()V",
        "STATE_INIT",
        "",
        "getSTATE_INIT",
        "()[I",
        "STATE_PENDING",
        "getSTATE_PENDING",
        "STATE_APPROVED",
        "getSTATE_APPROVED",
        "STATE_REJECTED",
        "getSTATE_REJECTED",
        "STATE_PROCESSING",
        "getSTATE_PROCESSING",
        "idensic-mobile-sdk-aar_defaultRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final INSTANCE:Lcom/sumsub/sns/core/widget/SNSStepAttrs;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final STATE_APPROVED:[I
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final STATE_INIT:[I
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final STATE_PENDING:[I
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final STATE_PROCESSING:[I
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final STATE_REJECTED:[I
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/sumsub/sns/core/widget/SNSStepAttrs;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/sumsub/sns/core/widget/SNSStepAttrs;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcom/sumsub/sns/core/widget/SNSStepAttrs;->INSTANCE:Lcom/sumsub/sns/core/widget/SNSStepAttrs;

    .line 8
    .line 9
    sget v0, Lcom/sumsub/sns/R$attr;->sns_stateInit:I

    .line 10
    .line 11
    .line 12
    filled-new-array {v0}, [I

    .line 13
    move-result-object v0

    .line 14
    .line 15
    sput-object v0, Lcom/sumsub/sns/core/widget/SNSStepAttrs;->STATE_INIT:[I

    .line 16
    .line 17
    sget v0, Lcom/sumsub/sns/R$attr;->sns_statePending:I

    .line 18
    .line 19
    .line 20
    filled-new-array {v0}, [I

    .line 21
    move-result-object v0

    .line 22
    .line 23
    sput-object v0, Lcom/sumsub/sns/core/widget/SNSStepAttrs;->STATE_PENDING:[I

    .line 24
    .line 25
    sget v0, Lcom/sumsub/sns/R$attr;->sns_stateApproved:I

    .line 26
    .line 27
    .line 28
    filled-new-array {v0}, [I

    .line 29
    move-result-object v0

    .line 30
    .line 31
    sput-object v0, Lcom/sumsub/sns/core/widget/SNSStepAttrs;->STATE_APPROVED:[I

    .line 32
    .line 33
    sget v0, Lcom/sumsub/sns/R$attr;->sns_stateRejected:I

    .line 34
    .line 35
    .line 36
    filled-new-array {v0}, [I

    .line 37
    move-result-object v0

    .line 38
    .line 39
    sput-object v0, Lcom/sumsub/sns/core/widget/SNSStepAttrs;->STATE_REJECTED:[I

    .line 40
    .line 41
    sget v0, Lcom/sumsub/sns/R$attr;->sns_stateProcessing:I

    .line 42
    .line 43
    .line 44
    filled-new-array {v0}, [I

    .line 45
    move-result-object v0

    .line 46
    .line 47
    sput-object v0, Lcom/sumsub/sns/core/widget/SNSStepAttrs;->STATE_PROCESSING:[I

    .line 48
    return-void
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

.method private constructor <init>()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    return-void
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


# virtual methods
.method public final getSTATE_APPROVED()[I
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    sget-object v0, Lcom/sumsub/sns/core/widget/SNSStepAttrs;->STATE_APPROVED:[I

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

.method public final getSTATE_INIT()[I
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    sget-object v0, Lcom/sumsub/sns/core/widget/SNSStepAttrs;->STATE_INIT:[I

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

.method public final getSTATE_PENDING()[I
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    sget-object v0, Lcom/sumsub/sns/core/widget/SNSStepAttrs;->STATE_PENDING:[I

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

.method public final getSTATE_PROCESSING()[I
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    sget-object v0, Lcom/sumsub/sns/core/widget/SNSStepAttrs;->STATE_PROCESSING:[I

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

.method public final getSTATE_REJECTED()[I
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    sget-object v0, Lcom/sumsub/sns/core/widget/SNSStepAttrs;->STATE_REJECTED:[I

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
