.class public abstract Lcom/sumsub/sns/internal/core/common/P0;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# static fields
.field public static a:Z

.field public static b:Lcom/sumsub/sns/internal/core/common/Q0;

.field public static c:Lcom/sumsub/sns/internal/core/common/SNSSession;


# direct methods
.method public static a()Lcom/sumsub/sns/internal/core/common/SNSSession;
    .locals 2

    .line 1
    sget-boolean v0, Lcom/sumsub/sns/internal/core/common/P0;->a:Z

    if-eqz v0, :cond_1

    .line 2
    sget-object v0, Lcom/sumsub/sns/internal/core/common/P0;->c:Lcom/sumsub/sns/internal/core/common/SNSSession;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :cond_0
    return-object v0

    .line 3
    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Failed requirement."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static a(Landroid/content/Context;Lcom/sumsub/sns/internal/core/common/SNSSession;)V
    .locals 2

    .line 4
    sget-boolean v0, Lcom/sumsub/sns/internal/core/common/P0;->a:Z

    const/4 v1, 0x0

    if-nez v0, :cond_3

    .line 5
    new-instance v0, Lcom/sumsub/sns/internal/core/common/Q0;

    invoke-direct {v0, p0}, Lcom/sumsub/sns/internal/core/common/Q0;-><init>(Landroid/content/Context;)V

    sput-object v0, Lcom/sumsub/sns/internal/core/common/P0;->b:Lcom/sumsub/sns/internal/core/common/Q0;

    const/4 p0, 0x1

    .line 6
    sput-boolean p0, Lcom/sumsub/sns/internal/core/common/P0;->a:Z

    if-nez p1, :cond_1

    .line 7
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/core/common/Q0;->a()Lcom/sumsub/sns/internal/core/common/SNSSession;

    move-result-object p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "SNSSession not found."

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 8
    :cond_1
    :goto_0
    sput-object p1, Lcom/sumsub/sns/internal/core/common/P0;->c:Lcom/sumsub/sns/internal/core/common/SNSSession;

    .line 9
    sget-object p0, Lcom/sumsub/sns/internal/core/common/P0;->b:Lcom/sumsub/sns/internal/core/common/Q0;

    if-nez p0, :cond_2

    goto :goto_1

    :cond_2
    move-object v1, p0

    :goto_1
    invoke-virtual {v1, p1}, Lcom/sumsub/sns/internal/core/common/Q0;->a(Lcom/sumsub/sns/internal/core/common/SNSSession;)V

    return-void

    :cond_3
    if-eqz p1, :cond_5

    .line 10
    invoke-static {}, Lcom/sumsub/sns/internal/core/common/P0;->a()Lcom/sumsub/sns/internal/core/common/SNSSession;

    move-result-object p0

    invoke-virtual {p0}, Lcom/sumsub/sns/internal/core/common/SNSSession;->getSessionId()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1}, Lcom/sumsub/sns/internal/core/common/SNSSession;->getSessionId()Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_5

    .line 11
    sput-object p1, Lcom/sumsub/sns/internal/core/common/P0;->c:Lcom/sumsub/sns/internal/core/common/SNSSession;

    .line 12
    sget-object p0, Lcom/sumsub/sns/internal/core/common/P0;->b:Lcom/sumsub/sns/internal/core/common/Q0;

    if-nez p0, :cond_4

    goto :goto_2

    :cond_4
    move-object v1, p0

    :goto_2
    invoke-virtual {v1, p1}, Lcom/sumsub/sns/internal/core/common/Q0;->a(Lcom/sumsub/sns/internal/core/common/SNSSession;)V

    :cond_5
    return-void
.end method
