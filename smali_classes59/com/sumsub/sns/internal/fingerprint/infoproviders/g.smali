.class public final Lcom/sumsub/sns/internal/fingerprint/infoproviders/g;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# instance fields
.field public final a:Landroid/app/admin/DevicePolicyManager;

.field public final b:Landroid/app/KeyguardManager;


# direct methods
.method public constructor <init>(Landroid/app/admin/DevicePolicyManager;Landroid/app/KeyguardManager;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput-object p1, p0, Lcom/sumsub/sns/internal/fingerprint/infoproviders/g;->a:Landroid/app/admin/DevicePolicyManager;

    .line 6
    .line 7
    iput-object p2, p0, Lcom/sumsub/sns/internal/fingerprint/infoproviders/g;->b:Landroid/app/KeyguardManager;

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

.method public static final a(Lcom/sumsub/sns/internal/fingerprint/infoproviders/g;)Ljava/lang/String;
    .locals 1

    .line 4
    iget-object p0, p0, Lcom/sumsub/sns/internal/fingerprint/infoproviders/g;->a:Landroid/app/admin/DevicePolicyManager;

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Landroid/app/admin/DevicePolicyManager;->getStorageEncryptionStatus()I

    move-result p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    if-eqz p0, :cond_5

    const/4 v0, 0x1

    if-eq p0, v0, :cond_4

    const/4 v0, 0x2

    if-eq p0, v0, :cond_3

    const/4 v0, 0x3

    if-eq p0, v0, :cond_2

    const/4 v0, 0x5

    if-eq p0, v0, :cond_1

    .line 5
    const-string p0, ""

    return-object p0

    .line 6
    :cond_1
    const-string p0, "active_per_user"

    return-object p0

    .line 7
    :cond_2
    const-string p0, "active"

    return-object p0

    .line 8
    :cond_3
    const-string p0, "activating"

    return-object p0

    .line 9
    :cond_4
    const-string p0, "inactive"

    return-object p0

    .line 10
    :cond_5
    const-string/jumbo p0, "unsupported"

    return-object p0
.end method

.method public static final b(Lcom/sumsub/sns/internal/fingerprint/infoproviders/g;)Z
    .locals 0

    .line 4
    iget-object p0, p0, Lcom/sumsub/sns/internal/fingerprint/infoproviders/g;->b:Landroid/app/KeyguardManager;

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Landroid/app/KeyguardManager;->isKeyguardSecure()Z

    move-result p0

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static final d()Ljava/util/List;
    .locals 8

    .line 1
    .line 2
    .line 3
    invoke-static {}, Ljava/security/Security;->getProviders()[Ljava/security/Provider;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    new-instance v1, Ljava/util/ArrayList;

    .line 7
    array-length v2, v0

    .line 8
    .line 9
    .line 10
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 11
    array-length v2, v0

    .line 12
    const/4 v3, 0x0

    .line 13
    .line 14
    :goto_0
    if-ge v3, v2, :cond_3

    .line 15
    .line 16
    aget-object v4, v0, v3

    .line 17
    .line 18
    new-instance v5, Lkotlin/Pair;

    .line 19
    .line 20
    const-string v6, ""

    .line 21
    .line 22
    if-eqz v4, :cond_0

    .line 23
    .line 24
    .line 25
    invoke-virtual {v4}, Ljava/security/Provider;->getName()Ljava/lang/String;

    .line 26
    move-result-object v7

    .line 27
    .line 28
    if-nez v7, :cond_1

    .line 29
    :cond_0
    move-object v7, v6

    .line 30
    .line 31
    .line 32
    :cond_1
    invoke-virtual {v4}, Ljava/security/Provider;->getInfo()Ljava/lang/String;

    .line 33
    move-result-object v4

    .line 34
    .line 35
    if-nez v4, :cond_2

    .line 36
    goto :goto_1

    .line 37
    :cond_2
    move-object v6, v4

    .line 38
    .line 39
    .line 40
    :goto_1
    invoke-direct {v5, v7, v6}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    invoke-interface {v1, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 44
    .line 45
    add-int/lit8 v3, v3, 0x1

    .line 46
    goto :goto_0

    .line 47
    :cond_3
    return-object v1
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Lcom/sumsub/sns/internal/fingerprint/infoproviders/d0;

    invoke-direct {v0, p0}, Lcom/sumsub/sns/internal/fingerprint/infoproviders/d0;-><init>(Lcom/sumsub/sns/internal/fingerprint/infoproviders/g;)V

    .line 2
    invoke-static {v0}, Lcom/sumsub/sns/internal/fingerprint/tools/threading/safe/c;->a(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;

    move-result-object v0

    .line 3
    invoke-static {v0}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v0, ""

    :cond_0
    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public final b()Z
    .locals 3

    .line 1
    new-instance v0, Lcom/sumsub/sns/internal/fingerprint/infoproviders/e0;

    invoke-direct {v0, p0}, Lcom/sumsub/sns/internal/fingerprint/infoproviders/e0;-><init>(Lcom/sumsub/sns/internal/fingerprint/infoproviders/g;)V

    .line 2
    invoke-static {v0}, Lcom/sumsub/sns/internal/fingerprint/tools/threading/safe/c;->a(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;

    move-result-object v0

    .line 3
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v0}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    move-object v0, v1

    :cond_0
    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public final c()Ljava/util/List;
    .locals 3

    .line 1
    .line 2
    new-instance v0, Lcom/sumsub/sns/internal/fingerprint/infoproviders/c0;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/sumsub/sns/internal/fingerprint/infoproviders/c0;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-static {v0}, Lcom/sumsub/sns/internal/fingerprint/tools/threading/safe/c;->a(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    .line 12
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 13
    move-result-object v1

    .line 14
    .line 15
    .line 16
    invoke-static {v0}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    .line 17
    move-result v2

    .line 18
    .line 19
    if-eqz v2, :cond_0

    .line 20
    move-object v0, v1

    .line 21
    .line 22
    :cond_0
    check-cast v0, Ljava/util/List;

    .line 23
    return-object v0
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
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
.end method
