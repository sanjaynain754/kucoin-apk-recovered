.class public final Lcom/sumsub/sns/internal/features/domain/mrtd/j;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# instance fields
.field public final a:Lkotlin/jvm/functions/Function0;

.field public final b:Lkotlin/jvm/functions/Function0;

.field public final c:Lkotlin/Lazy;

.field public final d:Lkotlin/Lazy;


# direct methods
.method public constructor <init>(Lcom/sumsub/sns/internal/core/domain/h;)V
    .locals 2

    .line 6
    new-instance v0, Lcom/sumsub/sns/internal/features/domain/mrtd/b0;

    invoke-direct {v0, p1}, Lcom/sumsub/sns/internal/features/domain/mrtd/b0;-><init>(Lcom/sumsub/sns/internal/core/domain/h;)V

    .line 7
    new-instance v1, Lcom/sumsub/sns/internal/features/domain/mrtd/c0;

    invoke-direct {v1, p1}, Lcom/sumsub/sns/internal/features/domain/mrtd/c0;-><init>(Lcom/sumsub/sns/internal/core/domain/h;)V

    .line 8
    invoke-direct {p0, v0, v1}, Lcom/sumsub/sns/internal/features/domain/mrtd/j;-><init>(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V

    return-void
.end method

.method public constructor <init>(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/domain/mrtd/j;->a:Lkotlin/jvm/functions/Function0;

    .line 3
    iput-object p2, p0, Lcom/sumsub/sns/internal/features/domain/mrtd/j;->b:Lkotlin/jvm/functions/Function0;

    .line 4
    new-instance p1, Lcom/sumsub/sns/internal/features/domain/mrtd/d0;

    invoke-direct {p1, p0}, Lcom/sumsub/sns/internal/features/domain/mrtd/d0;-><init>(Lcom/sumsub/sns/internal/features/domain/mrtd/j;)V

    invoke-static {p1}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object p1

    iput-object p1, p0, Lcom/sumsub/sns/internal/features/domain/mrtd/j;->c:Lkotlin/Lazy;

    .line 5
    new-instance p1, Lcom/sumsub/sns/internal/features/domain/mrtd/e0;

    invoke-direct {p1, p0}, Lcom/sumsub/sns/internal/features/domain/mrtd/e0;-><init>(Lcom/sumsub/sns/internal/features/domain/mrtd/j;)V

    invoke-static {p1}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object p1

    iput-object p1, p0, Lcom/sumsub/sns/internal/features/domain/mrtd/j;->d:Lkotlin/Lazy;

    return-void
.end method

.method public static final a(Lcom/sumsub/sns/internal/core/domain/h;)Lcom/sumsub/sns/internal/core/common/r0;
    .locals 0

    .line 10
    iget-object p0, p0, Lcom/sumsub/sns/internal/core/domain/h;->a:Landroid/content/Context;

    .line 11
    invoke-static {p0}, Lcom/sumsub/sns/internal/core/common/h;->b(Landroid/content/Context;)Lcom/sumsub/sns/internal/core/common/r0;

    move-result-object p0

    return-object p0
.end method

.method public static a(Lcom/sumsub/sns/internal/core/common/r0;)Z
    .locals 7

    .line 2
    sget-object v0, Lcom/sumsub/sns/internal/core/common/o0;->b:Lcom/sumsub/sns/internal/core/common/o0;

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    sget-object v0, Lcom/sumsub/sns/internal/core/common/n0;->b:Lcom/sumsub/sns/internal/core/common/n0;

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 3
    :goto_1
    sget-object v1, Lcom/sumsub/sns/internal/log/c;->a:Lcom/sumsub/sns/internal/log/c;

    .line 4
    iget-object v2, p0, Lcom/sumsub/sns/internal/core/common/r0;->a:Ljava/lang/String;

    .line 5
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "NFC message: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v5, 0x4

    const/4 v6, 0x0

    const-string v2, "SumSubNfc"

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Lcom/sumsub/log/logger/Logger$DefaultImpls;->d$default(Lcom/sumsub/log/logger/Logger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 6
    instance-of v1, p0, Lcom/sumsub/sns/internal/core/common/p0;

    if-eqz v1, :cond_2

    .line 7
    check-cast p0, Lcom/sumsub/sns/internal/core/common/p0;

    .line 8
    iget-object p0, p0, Lcom/sumsub/sns/internal/core/common/p0;->b:Ljava/lang/Throwable;

    .line 9
    sget-object v1, Lcom/sumsub/sns/internal/log/c;->c:Lcom/sumsub/sns/internal/log/logger/k;

    const-string v2, "SumSubNfc"

    const-string v3, "NFC Error"

    invoke-virtual {v1, v2, v3, p0}, Lcom/sumsub/sns/internal/log/logger/k;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_2
    return v0
.end method

.method public static final a(Lcom/sumsub/sns/internal/features/domain/mrtd/j;)Z
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/domain/mrtd/j;->b:Lkotlin/jvm/functions/Function0;

    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method

.method public static final b(Lcom/sumsub/sns/internal/core/domain/h;)Z
    .locals 4

    .line 4
    iget-object p0, p0, Lcom/sumsub/sns/internal/core/domain/h;->a:Landroid/content/Context;

    .line 5
    const-string v0, "android.permission.NFC"

    const/4 v1, 0x0

    .line 6
    :try_start_0
    sget-object v2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 7
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v2

    .line 8
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p0

    const/16 v3, 0x1000

    .line 9
    invoke-virtual {v2, p0, v3}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object p0

    iget-object p0, p0, Landroid/content/pm/PackageInfo;->requestedPermissions:[Ljava/lang/String;

    if-eqz p0, :cond_0

    .line 10
    invoke-static {p0, v0}, Lkotlin/collections/ArraysKt;->contains([Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_1

    :cond_0
    move p0, v1

    :goto_0
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    .line 11
    invoke-static {p0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :goto_1
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {p0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    .line 12
    :goto_2
    invoke-static {p0}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 p0, 0x0

    :cond_1
    check-cast p0, Ljava/lang/Boolean;

    if-eqz p0, :cond_2

    .line 13
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    :cond_2
    return v1
.end method

.method public static final b(Lcom/sumsub/sns/internal/features/domain/mrtd/j;)Z
    .locals 7

    .line 1
    const-string v0, "com.sumsub.sns.nfc.BuildConfig"

    invoke-static {v0}, Lcom/sumsub/sns/internal/core/common/N0;->a(Ljava/lang/String;)Z

    move-result v0

    .line 2
    sget-object v1, Lcom/sumsub/sns/internal/log/c;->a:Lcom/sumsub/sns/internal/log/c;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "NFC module enabled: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v5, 0x4

    const/4 v6, 0x0

    const-string v2, "SumSubNfc"

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Lcom/sumsub/log/logger/Logger$DefaultImpls;->d$default(Lcom/sumsub/log/logger/Logger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 3
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/domain/mrtd/j;->a:Lkotlin/jvm/functions/Function0;

    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/sumsub/sns/internal/core/common/r0;

    invoke-static {p0}, Lcom/sumsub/sns/internal/features/domain/mrtd/j;->a(Lcom/sumsub/sns/internal/core/common/r0;)Z

    move-result p0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "NFC has capability: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const-string v2, "SumSubNfc"

    invoke-static/range {v1 .. v6}, Lcom/sumsub/log/logger/Logger$DefaultImpls;->d$default(Lcom/sumsub/log/logger/Logger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    return v0
.end method
