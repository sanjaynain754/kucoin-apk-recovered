.class public abstract Lcom/sumsub/sns/internal/fingerprint/d;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# direct methods
.method public static a()Lcom/sumsub/sns/internal/fingerprint/infoproviders/d;
    .locals 3

    .line 12
    new-instance v0, Lcom/sumsub/sns/internal/fingerprint/infoproviders/d;

    .line 13
    new-instance v1, Lcom/sumsub/sns/internal/fingerprint/o;

    invoke-direct {v1}, Lcom/sumsub/sns/internal/fingerprint/o;-><init>()V

    .line 14
    invoke-static {v1}, Lcom/sumsub/sns/internal/fingerprint/tools/threading/safe/c;->a(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;

    move-result-object v1

    .line 15
    invoke-static {v1}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v1, 0x0

    :cond_0
    check-cast v1, Landroid/media/MediaCodecList;

    .line 16
    invoke-direct {v0, v1}, Lcom/sumsub/sns/internal/fingerprint/infoproviders/d;-><init>(Landroid/media/MediaCodecList;)V

    return-object v0
.end method

.method public static a(Landroid/content/Context;)Lcom/sumsub/sns/internal/fingerprint/infoproviders/f;
    .locals 5

    .line 1
    new-instance v0, Lcom/sumsub/sns/internal/fingerprint/infoproviders/f;

    .line 2
    new-instance v1, Lcom/sumsub/sns/internal/fingerprint/s;

    invoke-direct {v1, p0}, Lcom/sumsub/sns/internal/fingerprint/s;-><init>(Landroid/content/Context;)V

    .line 3
    invoke-static {v1}, Lcom/sumsub/sns/internal/fingerprint/tools/threading/safe/c;->a(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;

    move-result-object v1

    .line 4
    invoke-static {v1}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    move-object v1, v3

    :cond_0
    check-cast v1, Landroid/media/RingtoneManager;

    .line 5
    new-instance v2, Lcom/sumsub/sns/internal/fingerprint/t;

    invoke-direct {v2, p0}, Lcom/sumsub/sns/internal/fingerprint/t;-><init>(Landroid/content/Context;)V

    .line 6
    invoke-static {v2}, Lcom/sumsub/sns/internal/fingerprint/tools/threading/safe/c;->a(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;

    move-result-object v2

    .line 7
    invoke-static {v2}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    move-object v2, v3

    :cond_1
    check-cast v2, Landroid/content/res/AssetManager;

    .line 8
    new-instance v4, Lcom/sumsub/sns/internal/fingerprint/u;

    invoke-direct {v4, p0}, Lcom/sumsub/sns/internal/fingerprint/u;-><init>(Landroid/content/Context;)V

    .line 9
    invoke-static {v4}, Lcom/sumsub/sns/internal/fingerprint/tools/threading/safe/c;->a(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;

    move-result-object p0

    .line 10
    invoke-static {p0}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    goto :goto_0

    :cond_2
    move-object v3, p0

    :goto_0
    check-cast v3, Landroid/content/res/Configuration;

    .line 11
    invoke-direct {v0, v1, v2, v3}, Lcom/sumsub/sns/internal/fingerprint/infoproviders/f;-><init>(Landroid/media/RingtoneManager;Landroid/content/res/AssetManager;Landroid/content/res/Configuration;)V

    return-object v0
.end method

.method public static final b(Landroid/content/Context;)Landroid/content/res/AssetManager;
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object p0

    return-object p0
.end method

.method public static final b()Landroid/media/MediaCodecList;
    .locals 2

    .line 2
    new-instance v0, Landroid/media/MediaCodecList;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/media/MediaCodecList;-><init>(I)V

    return-object v0
.end method

.method public static final c(Landroid/content/Context;)Landroid/content/res/Configuration;
    .locals 0

    .line 2
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    invoke-virtual {p0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object p0

    return-object p0
.end method

.method public static final c()Landroid/os/StatFs;
    .locals 2

    .line 1
    new-instance v0, Landroid/os/StatFs;

    invoke-static {}, Landroid/os/Environment;->getRootDirectory()Ljava/io/File;

    move-result-object v1

    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/StatFs;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public static final d(Landroid/content/Context;)Landroid/media/RingtoneManager;
    .locals 1

    .line 1
    .line 2
    new-instance v0, Landroid/media/RingtoneManager;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p0}, Landroid/media/RingtoneManager;-><init>(Landroid/content/Context;)V

    .line 6
    return-object v0
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

.method public static e(Landroid/content/Context;)Lcom/sumsub/sns/internal/fingerprint/infoproviders/g;
    .locals 4

    .line 1
    .line 2
    new-instance v0, Lcom/sumsub/sns/internal/fingerprint/infoproviders/g;

    .line 3
    .line 4
    new-instance v1, Lcom/sumsub/sns/internal/fingerprint/q;

    .line 5
    .line 6
    .line 7
    invoke-direct {v1, p0}, Lcom/sumsub/sns/internal/fingerprint/q;-><init>(Landroid/content/Context;)V

    .line 8
    .line 9
    .line 10
    invoke-static {v1}, Lcom/sumsub/sns/internal/fingerprint/tools/threading/safe/c;->a(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;

    .line 11
    move-result-object v1

    .line 12
    .line 13
    .line 14
    invoke-static {v1}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    .line 15
    move-result v2

    .line 16
    const/4 v3, 0x0

    .line 17
    .line 18
    if-eqz v2, :cond_0

    .line 19
    move-object v1, v3

    .line 20
    .line 21
    :cond_0
    check-cast v1, Landroid/app/admin/DevicePolicyManager;

    .line 22
    .line 23
    new-instance v2, Lcom/sumsub/sns/internal/fingerprint/r;

    .line 24
    .line 25
    .line 26
    invoke-direct {v2, p0}, Lcom/sumsub/sns/internal/fingerprint/r;-><init>(Landroid/content/Context;)V

    .line 27
    .line 28
    .line 29
    invoke-static {v2}, Lcom/sumsub/sns/internal/fingerprint/tools/threading/safe/c;->a(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;

    .line 30
    move-result-object p0

    .line 31
    .line 32
    .line 33
    invoke-static {p0}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    .line 34
    move-result v2

    .line 35
    .line 36
    if-eqz v2, :cond_1

    .line 37
    goto :goto_0

    .line 38
    :cond_1
    move-object v3, p0

    .line 39
    .line 40
    :goto_0
    check-cast v3, Landroid/app/KeyguardManager;

    .line 41
    .line 42
    .line 43
    invoke-direct {v0, v1, v3}, Lcom/sumsub/sns/internal/fingerprint/infoproviders/g;-><init>(Landroid/app/admin/DevicePolicyManager;Landroid/app/KeyguardManager;)V

    .line 44
    return-object v0
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
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
.end method

.method public static final f(Landroid/content/Context;)Landroid/app/admin/DevicePolicyManager;
    .locals 1

    .line 1
    .line 2
    const-string v0, "device_policy"

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 6
    move-result-object p0

    .line 7
    .line 8
    check-cast p0, Landroid/app/admin/DevicePolicyManager;

    .line 9
    return-object p0
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

.method public static final g(Landroid/content/Context;)Landroid/app/KeyguardManager;
    .locals 1

    .line 1
    .line 2
    const-string v0, "keyguard"

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 6
    move-result-object p0

    .line 7
    .line 8
    check-cast p0, Landroid/app/KeyguardManager;

    .line 9
    return-object p0
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

.method public static h(Landroid/content/Context;)Lcom/sumsub/sns/internal/fingerprint/c;
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/sumsub/sns/internal/fingerprint/c;

    .line 3
    .line 4
    new-instance v1, Lcom/sumsub/sns/internal/fingerprint/h;

    .line 5
    .line 6
    .line 7
    invoke-direct {v1, p0}, Lcom/sumsub/sns/internal/fingerprint/h;-><init>(Landroid/content/Context;)V

    .line 8
    .line 9
    .line 10
    invoke-direct {v0, v1}, Lcom/sumsub/sns/internal/fingerprint/c;-><init>(Lkotlin/jvm/functions/Function0;)V

    .line 11
    return-object v0
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

.method public static final i(Landroid/content/Context;)Lcom/sumsub/sns/internal/fingerprint/e;
    .locals 14

    .line 1
    .line 2
    new-instance v0, Lcom/sumsub/sns/internal/fingerprint/e;

    .line 3
    .line 4
    new-instance v1, Lcom/sumsub/sns/internal/fingerprint/fingerprintingsignals/u;

    .line 5
    .line 6
    new-instance v2, Lcom/sumsub/sns/internal/fingerprint/infoproviders/e;

    .line 7
    .line 8
    .line 9
    invoke-direct {v2}, Lcom/sumsub/sns/internal/fingerprint/infoproviders/e;-><init>()V

    .line 10
    .line 11
    .line 12
    invoke-static {p0}, Lcom/sumsub/sns/internal/fingerprint/d;->n(Landroid/content/Context;)Lcom/sumsub/sns/internal/fingerprint/infoproviders/l;

    .line 13
    move-result-object v3

    .line 14
    .line 15
    .line 16
    invoke-static {p0}, Lcom/sumsub/sns/internal/fingerprint/d;->q(Landroid/content/Context;)Lcom/sumsub/sns/internal/fingerprint/infoproviders/o;

    .line 17
    move-result-object v4

    .line 18
    .line 19
    .line 20
    invoke-static {p0}, Lcom/sumsub/sns/internal/fingerprint/d;->l(Landroid/content/Context;)Lcom/sumsub/sns/internal/fingerprint/infoproviders/j;

    .line 21
    move-result-object v5

    .line 22
    .line 23
    new-instance v6, Lcom/sumsub/sns/internal/fingerprint/infoproviders/a;

    .line 24
    .line 25
    .line 26
    invoke-direct {v6, p0}, Lcom/sumsub/sns/internal/fingerprint/infoproviders/a;-><init>(Landroid/content/Context;)V

    .line 27
    .line 28
    new-instance v7, Lcom/sumsub/sns/internal/fingerprint/infoproviders/c;

    .line 29
    .line 30
    .line 31
    invoke-direct {v7}, Lcom/sumsub/sns/internal/fingerprint/infoproviders/c;-><init>()V

    .line 32
    .line 33
    .line 34
    invoke-static {p0}, Lcom/sumsub/sns/internal/fingerprint/d;->j(Landroid/content/Context;)Lcom/sumsub/sns/internal/fingerprint/infoproviders/h;

    .line 35
    move-result-object v8

    .line 36
    .line 37
    new-instance v9, Lcom/sumsub/sns/internal/fingerprint/infoproviders/m;

    .line 38
    .line 39
    .line 40
    invoke-direct {v9}, Lcom/sumsub/sns/internal/fingerprint/infoproviders/m;-><init>()V

    .line 41
    .line 42
    .line 43
    invoke-static {}, Lcom/sumsub/sns/internal/fingerprint/d;->a()Lcom/sumsub/sns/internal/fingerprint/infoproviders/d;

    .line 44
    move-result-object v10

    .line 45
    .line 46
    .line 47
    invoke-static {p0}, Lcom/sumsub/sns/internal/fingerprint/d;->e(Landroid/content/Context;)Lcom/sumsub/sns/internal/fingerprint/infoproviders/g;

    .line 48
    move-result-object v11

    .line 49
    .line 50
    .line 51
    invoke-static {p0}, Lcom/sumsub/sns/internal/fingerprint/d;->s(Landroid/content/Context;)Lcom/sumsub/sns/internal/fingerprint/infoproviders/p;

    .line 52
    move-result-object v12

    .line 53
    .line 54
    .line 55
    invoke-static {p0}, Lcom/sumsub/sns/internal/fingerprint/d;->a(Landroid/content/Context;)Lcom/sumsub/sns/internal/fingerprint/infoproviders/f;

    .line 56
    move-result-object v13

    .line 57
    .line 58
    .line 59
    invoke-direct/range {v1 .. v13}, Lcom/sumsub/sns/internal/fingerprint/fingerprintingsignals/u;-><init>(Lcom/sumsub/sns/internal/fingerprint/infoproviders/e;Lcom/sumsub/sns/internal/fingerprint/infoproviders/l;Lcom/sumsub/sns/internal/fingerprint/infoproviders/o;Lcom/sumsub/sns/internal/fingerprint/infoproviders/j;Lcom/sumsub/sns/internal/fingerprint/infoproviders/a;Lcom/sumsub/sns/internal/fingerprint/infoproviders/c;Lcom/sumsub/sns/internal/fingerprint/infoproviders/h;Lcom/sumsub/sns/internal/fingerprint/infoproviders/m;Lcom/sumsub/sns/internal/fingerprint/infoproviders/d;Lcom/sumsub/sns/internal/fingerprint/infoproviders/g;Lcom/sumsub/sns/internal/fingerprint/infoproviders/p;Lcom/sumsub/sns/internal/fingerprint/infoproviders/f;)V

    .line 60
    .line 61
    .line 62
    invoke-direct {v0, v1}, Lcom/sumsub/sns/internal/fingerprint/e;-><init>(Lcom/sumsub/sns/internal/fingerprint/fingerprintingsignals/u;)V

    .line 63
    return-object v0
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
.end method

.method public static j(Landroid/content/Context;)Lcom/sumsub/sns/internal/fingerprint/infoproviders/h;
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/sumsub/sns/internal/fingerprint/infoproviders/h;

    .line 3
    .line 4
    new-instance v1, Lcom/sumsub/sns/internal/fingerprint/l;

    .line 5
    .line 6
    .line 7
    invoke-direct {v1, p0}, Lcom/sumsub/sns/internal/fingerprint/l;-><init>(Landroid/content/Context;)V

    .line 8
    .line 9
    .line 10
    invoke-static {v1}, Lcom/sumsub/sns/internal/fingerprint/tools/threading/safe/c;->a(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;

    .line 11
    move-result-object p0

    .line 12
    .line 13
    .line 14
    invoke-static {p0}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    .line 15
    move-result v1

    .line 16
    .line 17
    if-eqz v1, :cond_0

    .line 18
    const/4 p0, 0x0

    .line 19
    .line 20
    :cond_0
    check-cast p0, Landroid/app/ActivityManager;

    .line 21
    .line 22
    .line 23
    invoke-direct {v0, p0}, Lcom/sumsub/sns/internal/fingerprint/infoproviders/h;-><init>(Landroid/app/ActivityManager;)V

    .line 24
    return-object v0
    .line 25
.end method

.method public static final k(Landroid/content/Context;)Landroid/app/ActivityManager;
    .locals 1

    .line 1
    .line 2
    const-string v0, "activity"

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 6
    move-result-object p0

    .line 7
    .line 8
    check-cast p0, Landroid/app/ActivityManager;

    .line 9
    return-object p0
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

.method public static l(Landroid/content/Context;)Lcom/sumsub/sns/internal/fingerprint/infoproviders/j;
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/sumsub/sns/internal/fingerprint/infoproviders/j;

    .line 3
    .line 4
    new-instance v1, Lcom/sumsub/sns/internal/fingerprint/n;

    .line 5
    .line 6
    .line 7
    invoke-direct {v1, p0}, Lcom/sumsub/sns/internal/fingerprint/n;-><init>(Landroid/content/Context;)V

    .line 8
    .line 9
    .line 10
    invoke-static {v1}, Lcom/sumsub/sns/internal/fingerprint/tools/threading/safe/c;->a(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;

    .line 11
    move-result-object p0

    .line 12
    .line 13
    .line 14
    invoke-static {p0}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    .line 15
    move-result v1

    .line 16
    .line 17
    if-eqz v1, :cond_0

    .line 18
    const/4 p0, 0x0

    .line 19
    .line 20
    :cond_0
    check-cast p0, Landroid/hardware/input/InputManager;

    .line 21
    .line 22
    .line 23
    invoke-direct {v0, p0}, Lcom/sumsub/sns/internal/fingerprint/infoproviders/j;-><init>(Landroid/hardware/input/InputManager;)V

    .line 24
    return-object v0
    .line 25
.end method

.method public static final m(Landroid/content/Context;)Landroid/hardware/input/InputManager;
    .locals 1

    .line 1
    .line 2
    const-string v0, "input"

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 6
    move-result-object p0

    .line 7
    .line 8
    check-cast p0, Landroid/hardware/input/InputManager;

    .line 9
    return-object p0
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

.method public static n(Landroid/content/Context;)Lcom/sumsub/sns/internal/fingerprint/infoproviders/l;
    .locals 5

    .line 1
    .line 2
    new-instance v0, Lcom/sumsub/sns/internal/fingerprint/infoproviders/l;

    .line 3
    .line 4
    new-instance v1, Lcom/sumsub/sns/internal/fingerprint/i;

    .line 5
    .line 6
    .line 7
    invoke-direct {v1, p0}, Lcom/sumsub/sns/internal/fingerprint/i;-><init>(Landroid/content/Context;)V

    .line 8
    .line 9
    .line 10
    invoke-static {v1}, Lcom/sumsub/sns/internal/fingerprint/tools/threading/safe/c;->a(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;

    .line 11
    move-result-object v1

    .line 12
    .line 13
    .line 14
    invoke-static {v1}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    .line 15
    move-result v2

    .line 16
    const/4 v3, 0x0

    .line 17
    .line 18
    if-eqz v2, :cond_0

    .line 19
    move-object v1, v3

    .line 20
    .line 21
    :cond_0
    check-cast v1, Landroid/app/ActivityManager;

    .line 22
    .line 23
    new-instance v2, Lcom/sumsub/sns/internal/fingerprint/j;

    .line 24
    .line 25
    .line 26
    invoke-direct {v2}, Lcom/sumsub/sns/internal/fingerprint/j;-><init>()V

    .line 27
    .line 28
    .line 29
    invoke-static {v2}, Lcom/sumsub/sns/internal/fingerprint/tools/threading/safe/c;->a(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;

    .line 30
    move-result-object v2

    .line 31
    .line 32
    .line 33
    invoke-static {v2}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    .line 34
    move-result v4

    .line 35
    .line 36
    if-eqz v4, :cond_1

    .line 37
    move-object v2, v3

    .line 38
    .line 39
    :cond_1
    check-cast v2, Landroid/os/StatFs;

    .line 40
    .line 41
    new-instance v4, Lcom/sumsub/sns/internal/fingerprint/k;

    .line 42
    .line 43
    .line 44
    invoke-direct {v4, p0}, Lcom/sumsub/sns/internal/fingerprint/k;-><init>(Landroid/content/Context;)V

    .line 45
    .line 46
    .line 47
    invoke-static {v4}, Lcom/sumsub/sns/internal/fingerprint/tools/threading/safe/c;->a(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;

    .line 48
    move-result-object p0

    .line 49
    .line 50
    .line 51
    invoke-static {p0}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    .line 52
    move-result v4

    .line 53
    .line 54
    if-eqz v4, :cond_2

    .line 55
    goto :goto_0

    .line 56
    :cond_2
    move-object v3, p0

    .line 57
    .line 58
    :goto_0
    check-cast v3, Landroid/os/StatFs;

    .line 59
    .line 60
    .line 61
    invoke-direct {v0, v1, v2}, Lcom/sumsub/sns/internal/fingerprint/infoproviders/l;-><init>(Landroid/app/ActivityManager;Landroid/os/StatFs;)V

    .line 62
    return-object v0
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
.end method

.method public static final o(Landroid/content/Context;)Landroid/app/ActivityManager;
    .locals 1

    .line 1
    .line 2
    const-string v0, "activity"

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 6
    move-result-object p0

    .line 7
    .line 8
    check-cast p0, Landroid/app/ActivityManager;

    .line 9
    return-object p0
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

.method public static final p(Landroid/content/Context;)Landroid/os/StatFs;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, v0}, Landroid/content/Context;->getExternalFilesDir(Ljava/lang/String;)Ljava/io/File;

    .line 5
    move-result-object p0

    .line 6
    .line 7
    if-eqz p0, :cond_1

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Ljava/io/File;->canRead()Z

    .line 11
    move-result v1

    .line 12
    .line 13
    if-eqz v1, :cond_0

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    move-object p0, v0

    .line 16
    .line 17
    :goto_0
    if-eqz p0, :cond_1

    .line 18
    .line 19
    new-instance v0, Landroid/os/StatFs;

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 23
    move-result-object p0

    .line 24
    .line 25
    .line 26
    invoke-direct {v0, p0}, Landroid/os/StatFs;-><init>(Ljava/lang/String;)V

    .line 27
    :cond_1
    return-object v0
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
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
.end method

.method public static q(Landroid/content/Context;)Lcom/sumsub/sns/internal/fingerprint/infoproviders/o;
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/sumsub/sns/internal/fingerprint/infoproviders/o;

    .line 3
    .line 4
    new-instance v1, Lcom/sumsub/sns/internal/fingerprint/m;

    .line 5
    .line 6
    .line 7
    invoke-direct {v1, p0}, Lcom/sumsub/sns/internal/fingerprint/m;-><init>(Landroid/content/Context;)V

    .line 8
    .line 9
    .line 10
    invoke-static {v1}, Lcom/sumsub/sns/internal/fingerprint/tools/threading/safe/c;->a(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;

    .line 11
    move-result-object p0

    .line 12
    .line 13
    .line 14
    invoke-static {p0}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    .line 15
    move-result v1

    .line 16
    .line 17
    if-eqz v1, :cond_0

    .line 18
    const/4 p0, 0x0

    .line 19
    .line 20
    :cond_0
    check-cast p0, Landroid/hardware/SensorManager;

    .line 21
    .line 22
    .line 23
    invoke-direct {v0, p0}, Lcom/sumsub/sns/internal/fingerprint/infoproviders/o;-><init>(Landroid/hardware/SensorManager;)V

    .line 24
    return-object v0
    .line 25
.end method

.method public static final r(Landroid/content/Context;)Landroid/hardware/SensorManager;
    .locals 1

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "sensor"

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 7
    move-result-object p0

    .line 8
    .line 9
    check-cast p0, Landroid/hardware/SensorManager;

    .line 10
    return-object p0
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

.method public static s(Landroid/content/Context;)Lcom/sumsub/sns/internal/fingerprint/infoproviders/p;
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/sumsub/sns/internal/fingerprint/infoproviders/p;

    .line 3
    .line 4
    new-instance v1, Lcom/sumsub/sns/internal/fingerprint/p;

    .line 5
    .line 6
    .line 7
    invoke-direct {v1, p0}, Lcom/sumsub/sns/internal/fingerprint/p;-><init>(Landroid/content/Context;)V

    .line 8
    .line 9
    .line 10
    invoke-static {v1}, Lcom/sumsub/sns/internal/fingerprint/tools/threading/safe/c;->a(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;

    .line 11
    move-result-object p0

    .line 12
    .line 13
    .line 14
    invoke-static {p0}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    .line 15
    move-result v1

    .line 16
    .line 17
    if-eqz v1, :cond_0

    .line 18
    const/4 p0, 0x0

    .line 19
    .line 20
    :cond_0
    check-cast p0, Landroid/content/ContentResolver;

    .line 21
    .line 22
    .line 23
    invoke-direct {v0, p0}, Lcom/sumsub/sns/internal/fingerprint/infoproviders/p;-><init>(Landroid/content/ContentResolver;)V

    .line 24
    return-object v0
    .line 25
.end method

.method public static final t(Landroid/content/Context;)Landroid/content/ContentResolver;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 4
    move-result-object p0

    .line 5
    return-object p0
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
.end method
