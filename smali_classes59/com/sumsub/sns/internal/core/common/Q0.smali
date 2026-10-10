.class public final Lcom/sumsub/sns/internal/core/common/Q0;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# instance fields
.field public final a:Landroid/content/SharedPreferences;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string/jumbo v0, "sns_session_prefs"

    .line 7
    const/4 v1, 0x0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 11
    move-result-object p1

    .line 12
    .line 13
    iput-object p1, p0, Lcom/sumsub/sns/internal/core/common/Q0;->a:Landroid/content/SharedPreferences;

    .line 14
    return-void
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


# virtual methods
.method public final a()Lcom/sumsub/sns/internal/core/common/SNSSession;
    .locals 12

    .line 12
    iget-object v0, p0, Lcom/sumsub/sns/internal/core/common/Q0;->a:Landroid/content/SharedPreferences;

    const-string/jumbo v1, "sessionId"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_0

    return-object v2

    .line 13
    :cond_0
    iget-object v0, p0, Lcom/sumsub/sns/internal/core/common/Q0;->a:Landroid/content/SharedPreferences;

    const-string/jumbo v1, "url"

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    if-nez v5, :cond_1

    return-object v2

    .line 14
    :cond_1
    iget-object v0, p0, Lcom/sumsub/sns/internal/core/common/Q0;->a:Landroid/content/SharedPreferences;

    const-string v1, "locale"

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_2

    return-object v2

    .line 15
    :cond_2
    iget-object v1, p0, Lcom/sumsub/sns/internal/core/common/Q0;->a:Landroid/content/SharedPreferences;

    const-string v3, "isDebug"

    const/4 v6, 0x0

    invoke-interface {v1, v3, v6}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v7

    .line 16
    iget-object v1, p0, Lcom/sumsub/sns/internal/core/common/Q0;->a:Landroid/content/SharedPreferences;

    const-string/jumbo v3, "packageName"

    invoke-interface {v1, v3, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    if-nez v8, :cond_3

    return-object v2

    .line 17
    :cond_3
    iget-object v1, p0, Lcom/sumsub/sns/internal/core/common/Q0;->a:Landroid/content/SharedPreferences;

    const-string/jumbo v3, "versionName"

    invoke-interface {v1, v3, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    if-nez v9, :cond_4

    return-object v2

    .line 18
    :cond_4
    iget-object v1, p0, Lcom/sumsub/sns/internal/core/common/Q0;->a:Landroid/content/SharedPreferences;

    const-string/jumbo v3, "versionCode"

    const/4 v6, -0x1

    invoke-interface {v1, v3, v6}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v10

    if-ne v10, v6, :cond_5

    return-object v2

    .line 19
    :cond_5
    iget-object v1, p0, Lcom/sumsub/sns/internal/core/common/Q0;->a:Landroid/content/SharedPreferences;

    const-string/jumbo v3, "theme"

    invoke-interface {v1, v3, v6}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v11

    if-ne v11, v6, :cond_6

    return-object v2

    .line 20
    :cond_6
    new-instance v3, Lcom/sumsub/sns/internal/core/common/SNSSession;

    .line 21
    invoke-static {v0}, Ljava/util/Locale;->forLanguageTag(Ljava/lang/String;)Ljava/util/Locale;

    move-result-object v6

    .line 22
    invoke-direct/range {v3 .. v11}, Lcom/sumsub/sns/internal/core/common/SNSSession;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Locale;ZLjava/lang/String;Ljava/lang/String;II)V

    return-object v3
.end method

.method public final a(Lcom/sumsub/sns/internal/core/common/SNSSession;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/sumsub/sns/internal/core/common/Q0;->a:Landroid/content/SharedPreferences;

    .line 2
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 3
    invoke-virtual {p1}, Lcom/sumsub/sns/internal/core/common/SNSSession;->getSessionId()Ljava/lang/String;

    move-result-object v1

    const-string/jumbo v2, "sessionId"

    invoke-interface {v0, v2, v1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 4
    invoke-virtual {p1}, Lcom/sumsub/sns/internal/core/common/SNSSession;->getUrl()Ljava/lang/String;

    move-result-object v1

    const-string/jumbo v2, "url"

    invoke-interface {v0, v2, v1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 5
    invoke-virtual {p1}, Lcom/sumsub/sns/internal/core/common/SNSSession;->getLocale()Ljava/util/Locale;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/Locale;->toLanguageTag()Ljava/lang/String;

    move-result-object v1

    const-string v2, "locale"

    invoke-interface {v0, v2, v1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 6
    invoke-virtual {p1}, Lcom/sumsub/sns/internal/core/common/SNSSession;->isDebug()Z

    move-result v1

    const-string v2, "isDebug"

    invoke-interface {v0, v2, v1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 7
    invoke-virtual {p1}, Lcom/sumsub/sns/internal/core/common/SNSSession;->getPackageName()Ljava/lang/String;

    move-result-object v1

    const-string/jumbo v2, "packageName"

    invoke-interface {v0, v2, v1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 8
    invoke-virtual {p1}, Lcom/sumsub/sns/internal/core/common/SNSSession;->getVersionName()Ljava/lang/String;

    move-result-object v1

    const-string/jumbo v2, "versionName"

    invoke-interface {v0, v2, v1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 9
    invoke-virtual {p1}, Lcom/sumsub/sns/internal/core/common/SNSSession;->getVersionCode()I

    move-result v1

    const-string/jumbo v2, "versionCode"

    invoke-interface {v0, v2, v1}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 10
    invoke-virtual {p1}, Lcom/sumsub/sns/internal/core/common/SNSSession;->getTheme()I

    move-result p1

    const-string/jumbo v1, "theme"

    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 11
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method
