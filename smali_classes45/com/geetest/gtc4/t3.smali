.class public abstract Lcom/geetest/gtc4/t3;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(ILandroid/content/SharedPreferences$Editor;)V
    .locals 1

    .line 1
    const-string v0, "gt_scr_st"

    invoke-interface {p1, v0, p0}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    return-void
.end method

.method public static a(ILandroid/content/SharedPreferences;)V
    .locals 1

    .line 2
    new-instance v0, Lv7/d;

    invoke-direct {v0, p0}, Lv7/d;-><init>(I)V

    .line 3
    invoke-interface {p1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object p0

    .line 4
    invoke-interface {v0, p0}, Lcom/geetest/gtc4/s3;->a(Landroid/content/SharedPreferences$Editor;)V

    .line 5
    invoke-interface {p0}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method

.method public static synthetic a(Landroid/content/SharedPreferences$Editor;)V
    .locals 1

    .line 6
    const-string v0, "gt_scr_st"

    invoke-interface {p0, v0}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    return-void
.end method

.method public static a(Landroid/content/SharedPreferences;)V
    .locals 1

    .line 7
    new-instance v0, Lv7/c;

    invoke-direct {v0}, Lv7/c;-><init>()V

    .line 8
    invoke-interface {p0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object p0

    .line 9
    invoke-interface {v0, p0}, Lcom/geetest/gtc4/s3;->a(Landroid/content/SharedPreferences$Editor;)V

    .line 10
    invoke-interface {p0}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method
