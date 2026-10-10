.class public final Lcom/sumsub/sns/core/data/model/SNSSDKState$Failed$ApplicantMisconfigured;
.super Lcom/sumsub/sns/core/data/model/SNSSDKState$Failed;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/sumsub/sns/core/data/model/SNSSDKState$Failed;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "ApplicantMisconfigured"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "Lcom/sumsub/sns/core/data/model/SNSSDKState$Failed$ApplicantMisconfigured;",
        "Lcom/sumsub/sns/core/data/model/SNSSDKState$Failed;",
        "<init>",
        "()V",
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
.field public static final INSTANCE:Lcom/sumsub/sns/core/data/model/SNSSDKState$Failed$ApplicantMisconfigured;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/sumsub/sns/core/data/model/SNSSDKState$Failed$ApplicantMisconfigured;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/sumsub/sns/core/data/model/SNSSDKState$Failed$ApplicantMisconfigured;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcom/sumsub/sns/core/data/model/SNSSDKState$Failed$ApplicantMisconfigured;->INSTANCE:Lcom/sumsub/sns/core/data/model/SNSSDKState$Failed$ApplicantMisconfigured;

    .line 8
    return-void
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

.method private constructor <init>()V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x2

    .line 3
    .line 4
    const-string v2, "Applicant is found, but is misconfigured (most likely lacks of idDocs)"

    .line 5
    .line 6
    .line 7
    invoke-direct {p0, v2, v0, v1, v0}, Lcom/sumsub/sns/core/data/model/SNSSDKState$Failed;-><init>(Ljava/lang/String;Ljava/lang/Exception;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 8
    return-void
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
