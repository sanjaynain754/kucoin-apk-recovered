.class public final Lcom/sumsub/sns/internal/features/domain/m0;
.super Lcom/sumsub/sns/internal/features/domain/f0;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# instance fields
.field public final d:Ljava/util/List;

.field public final e:Z


# direct methods
.method public constructor <init>(Lcom/sumsub/sns/internal/features/data/model/common/Document;Ljava/lang/String;Ljava/util/List;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, p2, v0}, Lcom/sumsub/sns/internal/features/domain/f0;-><init>(Lcom/sumsub/sns/internal/features/data/model/common/Document;Ljava/lang/String;Z)V

    .line 2
    iput-object p3, p0, Lcom/sumsub/sns/internal/features/domain/m0;->d:Ljava/util/List;

    .line 3
    iput-boolean v0, p0, Lcom/sumsub/sns/internal/features/domain/m0;->e:Z

    return-void
.end method

.method public constructor <init>(Lcom/sumsub/sns/internal/features/data/model/common/Document;Ljava/lang/String;Ljava/util/List;ZZ)V
    .locals 0

    .line 4
    invoke-direct {p0, p1, p2, p4}, Lcom/sumsub/sns/internal/features/domain/f0;-><init>(Lcom/sumsub/sns/internal/features/data/model/common/Document;Ljava/lang/String;Z)V

    .line 5
    iput-object p3, p0, Lcom/sumsub/sns/internal/features/domain/m0;->d:Ljava/util/List;

    .line 6
    iput-boolean p5, p0, Lcom/sumsub/sns/internal/features/domain/m0;->e:Z

    return-void
.end method
