.class public abstract Lcom/sumsub/sns/internal/features/domain/f0;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# instance fields
.field public final a:Lcom/sumsub/sns/internal/features/data/model/common/Document;

.field public final b:Ljava/lang/String;

.field public final c:Z


# direct methods
.method public constructor <init>(Lcom/sumsub/sns/internal/features/data/model/common/Document;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/sumsub/sns/internal/features/domain/f0;->a:Lcom/sumsub/sns/internal/features/data/model/common/Document;

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/sumsub/sns/internal/features/domain/f0;->b:Ljava/lang/String;

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/sumsub/sns/internal/features/domain/f0;->c:Z

    return-void
.end method

.method public constructor <init>(Lcom/sumsub/sns/internal/features/data/model/common/Document;Ljava/lang/String;Z)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/sumsub/sns/internal/features/domain/f0;->a:Lcom/sumsub/sns/internal/features/data/model/common/Document;

    iput-object p2, p0, Lcom/sumsub/sns/internal/features/domain/f0;->b:Ljava/lang/String;

    iput-boolean p3, p0, Lcom/sumsub/sns/internal/features/domain/f0;->c:Z

    return-void
.end method
