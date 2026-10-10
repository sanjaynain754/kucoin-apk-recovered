.class public final Lcom/sumsub/sns/internal/fingerprint/infoproviders/p;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# instance fields
.field public final a:Landroid/content/ContentResolver;


# direct methods
.method public constructor <init>(Landroid/content/ContentResolver;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput-object p1, p0, Lcom/sumsub/sns/internal/fingerprint/infoproviders/p;->a:Landroid/content/ContentResolver;

    .line 6
    return-void
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
.end method

.method public static final a(Lcom/sumsub/sns/internal/fingerprint/infoproviders/p;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 7
    iget-object p0, p0, Lcom/sumsub/sns/internal/fingerprint/infoproviders/p;->a:Landroid/content/ContentResolver;

    invoke-static {p0, p1}, Landroid/provider/Settings$Global;->getString(Landroid/content/ContentResolver;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Lcom/sumsub/sns/internal/fingerprint/infoproviders/p;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 4
    iget-object p0, p0, Lcom/sumsub/sns/internal/fingerprint/infoproviders/p;->a:Landroid/content/ContentResolver;

    invoke-static {p0, p1}, Landroid/provider/Settings$Secure;->getString(Landroid/content/ContentResolver;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Lcom/sumsub/sns/internal/fingerprint/infoproviders/p;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 4
    iget-object p0, p0, Lcom/sumsub/sns/internal/fingerprint/infoproviders/p;->a:Landroid/content/ContentResolver;

    invoke-static {p0, p1}, Landroid/provider/Settings$System;->getString(Landroid/content/ContentResolver;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-lt v0, v1, :cond_0

    .line 2
    const-string/jumbo v0, "rtt_calling_mode"

    invoke-virtual {p0, v0}, Lcom/sumsub/sns/internal/fingerprint/infoproviders/p;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 3
    :cond_0
    const-string v0, ""

    return-object v0
.end method

.method public final a(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 4
    new-instance v0, Lcom/sumsub/sns/internal/fingerprint/infoproviders/s0;

    invoke-direct {v0, p0, p1}, Lcom/sumsub/sns/internal/fingerprint/infoproviders/s0;-><init>(Lcom/sumsub/sns/internal/fingerprint/infoproviders/p;Ljava/lang/String;)V

    .line 5
    invoke-static {v0}, Lcom/sumsub/sns/internal/fingerprint/tools/threading/safe/c;->a(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;

    move-result-object p1

    .line 6
    invoke-static {p1}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string p1, ""

    :cond_0
    check-cast p1, Ljava/lang/String;

    return-object p1
.end method

.method public final b(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    new-instance v0, Lcom/sumsub/sns/internal/fingerprint/infoproviders/q0;

    invoke-direct {v0, p0, p1}, Lcom/sumsub/sns/internal/fingerprint/infoproviders/q0;-><init>(Lcom/sumsub/sns/internal/fingerprint/infoproviders/p;Ljava/lang/String;)V

    .line 2
    invoke-static {v0}, Lcom/sumsub/sns/internal/fingerprint/tools/threading/safe/c;->a(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;

    move-result-object p1

    .line 3
    invoke-static {p1}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string p1, ""

    :cond_0
    check-cast p1, Ljava/lang/String;

    return-object p1
.end method

.method public final c(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    new-instance v0, Lcom/sumsub/sns/internal/fingerprint/infoproviders/r0;

    invoke-direct {v0, p0, p1}, Lcom/sumsub/sns/internal/fingerprint/infoproviders/r0;-><init>(Lcom/sumsub/sns/internal/fingerprint/infoproviders/p;Ljava/lang/String;)V

    .line 2
    invoke-static {v0}, Lcom/sumsub/sns/internal/fingerprint/tools/threading/safe/c;->a(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;

    move-result-object p1

    .line 3
    invoke-static {p1}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string p1, ""

    :cond_0
    check-cast p1, Ljava/lang/String;

    return-object p1
.end method
