.class public Lgi0/g;
.super Ljava/lang/Object;
.source "HuaweiImpl.java"

# interfaces
.implements Lfi0/d;


# instance fields
.field public final a:Landroid/content/Context;

.field public b:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput-object p1, p0, Lgi0/g;->a:Landroid/content/Context;

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
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
.end method


# virtual methods
.method public a()Z
    .locals 6

    .line 1
    .line 2
    const-string v0, "com.huawei.hwid.tv"

    .line 3
    .line 4
    const-string v1, "com.huawei.hwid"

    .line 5
    .line 6
    iget-object v2, p0, Lgi0/g;->a:Landroid/content/Context;

    .line 7
    const/4 v3, 0x0

    .line 8
    .line 9
    if-nez v2, :cond_0

    .line 10
    return v3

    .line 11
    .line 12
    .line 13
    :cond_0
    :try_start_0
    invoke-virtual {v2}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 14
    move-result-object v2

    .line 15
    .line 16
    .line 17
    invoke-virtual {v2, v1, v3}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 18
    move-result-object v4

    .line 19
    const/4 v5, 0x1

    .line 20
    .line 21
    if-eqz v4, :cond_1

    .line 22
    .line 23
    iput-object v1, p0, Lgi0/g;->b:Ljava/lang/String;

    .line 24
    return v5

    .line 25
    :catch_0
    move-exception v0

    .line 26
    goto :goto_0

    .line 27
    .line 28
    .line 29
    :cond_1
    invoke-virtual {v2, v0, v3}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 30
    move-result-object v1

    .line 31
    .line 32
    if-eqz v1, :cond_2

    .line 33
    .line 34
    iput-object v0, p0, Lgi0/g;->b:Ljava/lang/String;

    .line 35
    return v5

    .line 36
    .line 37
    :cond_2
    const-string v0, "com.huawei.hms"

    .line 38
    .line 39
    iput-object v0, p0, Lgi0/g;->b:Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v2, v0, v3}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 43
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 44
    .line 45
    if-eqz v0, :cond_3

    .line 46
    return v5

    .line 47
    :cond_3
    return v3

    .line 48
    .line 49
    .line 50
    :goto_0
    invoke-static {v0}, Lfi0/e;->a(Ljava/lang/Object;)V

    .line 51
    return v3
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
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
.end method

.method public b(Lfi0/c;)V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lgi0/g;->a:Landroid/content/Context;

    .line 3
    .line 4
    if-eqz v0, :cond_3

    .line 5
    .line 6
    if-nez p1, :cond_0

    .line 7
    goto :goto_0

    .line 8
    .line 9
    .line 10
    :cond_0
    :try_start_0
    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 11
    move-result-object v0

    .line 12
    .line 13
    const-string v1, "pps_oaid"

    .line 14
    .line 15
    .line 16
    invoke-static {v0, v1}, Landroid/provider/Settings$Global;->getString(Landroid/content/ContentResolver;Ljava/lang/String;)Ljava/lang/String;

    .line 17
    move-result-object v0

    .line 18
    .line 19
    .line 20
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 21
    move-result v1

    .line 22
    .line 23
    if-nez v1, :cond_1

    .line 24
    .line 25
    new-instance v1, Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 29
    .line 30
    const-string v2, "Get oaid from global settings: "

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 40
    move-result-object v1

    .line 41
    .line 42
    .line 43
    invoke-static {v1}, Lfi0/e;->a(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    invoke-interface {p1, v0}, Lfi0/c;->a(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 47
    return-void

    .line 48
    :catch_0
    move-exception v0

    .line 49
    .line 50
    .line 51
    invoke-static {v0}, Lfi0/e;->a(Ljava/lang/Object;)V

    .line 52
    .line 53
    :cond_1
    iget-object v0, p0, Lgi0/g;->b:Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 57
    move-result v0

    .line 58
    .line 59
    if-eqz v0, :cond_2

    .line 60
    .line 61
    .line 62
    invoke-virtual {p0}, Lgi0/g;->a()Z

    .line 63
    move-result v0

    .line 64
    .line 65
    if-nez v0, :cond_2

    .line 66
    .line 67
    new-instance v0, Lthird/sdk/oaid/OAIDException;

    .line 68
    .line 69
    const-string v1, "Huawei Advertising ID not available"

    .line 70
    .line 71
    .line 72
    invoke-direct {v0, v1}, Lthird/sdk/oaid/OAIDException;-><init>(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    invoke-interface {p1, v0}, Lfi0/c;->b(Ljava/lang/Exception;)V

    .line 76
    return-void

    .line 77
    .line 78
    :cond_2
    new-instance v0, Landroid/content/Intent;

    .line 79
    .line 80
    const-string v1, "com.uodis.opendevice.OPENIDS_SERVICE"

    .line 81
    .line 82
    .line 83
    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 84
    .line 85
    iget-object v1, p0, Lgi0/g;->b:Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    invoke-virtual {v0, v1}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 89
    .line 90
    iget-object v1, p0, Lgi0/g;->a:Landroid/content/Context;

    .line 91
    .line 92
    new-instance v2, Lgi0/g$a;

    .line 93
    .line 94
    .line 95
    invoke-direct {v2, p0}, Lgi0/g$a;-><init>(Lgi0/g;)V

    .line 96
    .line 97
    .line 98
    invoke-static {v1, v0, p1, v2}, Lgi0/m;->a(Landroid/content/Context;Landroid/content/Intent;Lfi0/c;Lgi0/m$a;)V

    .line 99
    :cond_3
    :goto_0
    return-void
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
.end method
