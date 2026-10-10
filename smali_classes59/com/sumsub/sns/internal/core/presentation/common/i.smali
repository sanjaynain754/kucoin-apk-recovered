.class public final Lcom/sumsub/sns/internal/core/presentation/common/i;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;Z)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput-object p1, p0, Lcom/sumsub/sns/internal/core/presentation/common/i;->a:Ljava/lang/String;

    .line 6
    .line 7
    iput-boolean p2, p0, Lcom/sumsub/sns/internal/core/presentation/common/i;->b:Z

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
    .line 18
    .line 19
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
.end method


# virtual methods
.method public final a(Lcom/sumsub/sns/internal/core/presentation/common/t;)Z
    .locals 2

    .line 1
    .line 2
    iget-object v0, p1, Lcom/sumsub/sns/internal/core/presentation/common/t;->a:Lcom/sumsub/sns/core/presentation/base/l;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object v1, p0, Lcom/sumsub/sns/internal/core/presentation/common/i;->a:Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1, v1}, Lcom/sumsub/sns/internal/core/presentation/common/t;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 14
    move-result-object p1

    .line 15
    .line 16
    iget-boolean v1, p0, Lcom/sumsub/sns/internal/core/presentation/common/i;->b:Z

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, p1, v1}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 20
    move-result p1

    .line 21
    return p1

    .line 22
    .line 23
    :cond_0
    iget-boolean p1, p0, Lcom/sumsub/sns/internal/core/presentation/common/i;->b:Z

    .line 24
    return p1
    .line 25
.end method
