.class public final Lcom/sumsub/sns/internal/features/data/model/common/p2;
.super Lcom/sumsub/sns/internal/features/data/model/common/q2;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# static fields
.field public static final c:Lcom/sumsub/sns/internal/features/data/model/common/p2;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/sumsub/sns/internal/features/data/model/common/p2;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/sumsub/sns/internal/features/data/model/common/p2;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcom/sumsub/sns/internal/features/data/model/common/p2;->c:Lcom/sumsub/sns/internal/features/data/model/common/p2;

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

.method public constructor <init>()V
    .locals 2

    .line 1
    .line 2
    sget-object v0, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSIdentityTypeIcons;->VISA:Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSIdentityTypeIcons;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSIdentityTypeIcons;->getImageName()Ljava/lang/String;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    const-string v1, "VISA"

    .line 9
    .line 10
    .line 11
    invoke-direct {p0, v1, v0}, Lcom/sumsub/sns/internal/features/data/model/common/q2;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 12
    return-void
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    .line 3
    if-ne p0, p1, :cond_0

    .line 4
    return v0

    .line 5
    .line 6
    :cond_0
    instance-of p1, p1, Lcom/sumsub/sns/internal/features/data/model/common/p2;

    .line 7
    .line 8
    if-nez p1, :cond_1

    .line 9
    const/4 p1, 0x0

    .line 10
    return p1

    .line 11
    :cond_1
    return v0
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

.method public final hashCode()I
    .locals 1

    .line 1
    .line 2
    .line 3
    const v0, -0x3e453765

    .line 4
    return v0
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

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    const-string v0, "Visa"

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
