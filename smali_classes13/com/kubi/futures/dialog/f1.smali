.class public final Lcom/kubi/futures/dialog/f1;
.super Ljava/lang/Object;
.source "PositionRiskRatioDialog.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0002\u00a8\u0006\u0004"
    }
    d2 = {
        "showIsolateRiskRatioDialog",
        "",
        "manager",
        "Landroidx/fragment/app/FragmentManager;",
        "KumexLib_googleRelease"
    }
    k = 0x2
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final synthetic a(Landroidx/fragment/app/FragmentManager;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/futures/dialog/f1;->b(Landroidx/fragment/app/FragmentManager;)V

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
.end method

.method public static final b(Landroidx/fragment/app/FragmentManager;)V
    .locals 4

    .line 1
    .line 2
    sget v0, Lcom/kubi/kumex/R$string;->kumex_position_risk_ratio:I

    .line 3
    .line 4
    sget v1, Lcom/kubi/kumex/R$string;->kumex_cross_risk_rate_desc:I

    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x4

    .line 7
    .line 8
    .line 9
    invoke-static {v0, v1, v2, v3, v2}, Lcom/kubi/kumex/dialog/u;->J(IILkotlin/jvm/functions/Function0;ILjava/lang/Object;)Lcom/kubi/resources/dialog/BaseDialogFragment;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    const-string v1, "IsolatedRiskRatioDialog"

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, p0, v1}, Lcom/kubi/resources/dialog/BaseDialogFragment;->show(Landroidx/fragment/app/FragmentManager;Ljava/lang/String;)V

    .line 16
    return-void
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
.end method
