.class public abstract Lcom/sumsub/sns/internal/features/presentation/main/Y;
.super Lcom/sumsub/sns/internal/features/presentation/main/b0;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"

# interfaces
.implements Landroid/os/Parcelable;


# instance fields
.field public a:Lcom/sumsub/sns/internal/features/data/model/common/t2;

.field public final b:Z


# direct methods
.method public constructor <init>(Lcom/sumsub/sns/internal/features/data/model/common/t2;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/sumsub/sns/internal/features/presentation/main/b0;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/main/Y;->a:Lcom/sumsub/sns/internal/features/data/model/common/t2;

    const/4 p1, 0x1

    .line 3
    iput-boolean p1, p0, Lcom/sumsub/sns/internal/features/presentation/main/Y;->b:Z

    return-void
.end method

.method public constructor <init>(Lcom/sumsub/sns/internal/features/data/model/common/t2;I)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    .line 4
    :cond_0
    invoke-direct {p0}, Lcom/sumsub/sns/internal/features/presentation/main/b0;-><init>()V

    .line 5
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/main/Y;->a:Lcom/sumsub/sns/internal/features/data/model/common/t2;

    const/4 p1, 0x0

    .line 6
    iput-boolean p1, p0, Lcom/sumsub/sns/internal/features/presentation/main/Y;->b:Z

    return-void
.end method
