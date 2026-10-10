.class public Lcom/tencent/bugly/launch/AppLaunchProxy;
.super Ljava/lang/Object;
.source "BUGLY"

# interfaces
.implements Lcom/tencent/bugly/launch/AppLaunch;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tencent/bugly/launch/AppLaunchProxy$a;
    }
.end annotation


# instance fields
.field public final a:Lcom/tencent/bugly/launch/AppLaunch;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    new-instance v0, Lcom/tencent/bugly/proguard/y;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0}, Lcom/tencent/bugly/proguard/y;-><init>()V

    .line 9
    .line 10
    iput-object v0, p0, Lcom/tencent/bugly/launch/AppLaunchProxy;->a:Lcom/tencent/bugly/launch/AppLaunch;

    .line 11
    return-void
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public static getAppLaunch()Lcom/tencent/bugly/launch/AppLaunch;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/tencent/bugly/launch/AppLaunchProxy$a;->a()Lcom/tencent/bugly/launch/AppLaunchProxy;

    .line 4
    move-result-object v0

    .line 5
    return-object v0
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
.end method


# virtual methods
.method public addTag(Ljava/lang/String;)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/launch/AppLaunchProxy;->a:Lcom/tencent/bugly/launch/AppLaunch;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0, p1}, Lcom/tencent/bugly/launch/AppLaunch;->addTag(Ljava/lang/String;)V

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

.method public endSpanFromLaunch(Ljava/lang/String;)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/launch/AppLaunchProxy;->a:Lcom/tencent/bugly/launch/AppLaunch;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0, p1}, Lcom/tencent/bugly/launch/AppLaunch;->endSpanFromLaunch(Ljava/lang/String;)V

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

.method public install(Landroid/content/Context;)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/launch/AppLaunchProxy;->a:Lcom/tencent/bugly/launch/AppLaunch;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0, p1}, Lcom/tencent/bugly/launch/AppLaunch;->install(Landroid/content/Context;)V

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

.method public reportAppFullLaunch()V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/launch/AppLaunchProxy;->a:Lcom/tencent/bugly/launch/AppLaunch;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lcom/tencent/bugly/launch/AppLaunch;->reportAppFullLaunch()V

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
.end method

.method public spanEnd(Ljava/lang/String;)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/launch/AppLaunchProxy;->a:Lcom/tencent/bugly/launch/AppLaunch;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0, p1}, Lcom/tencent/bugly/launch/AppLaunch;->spanEnd(Ljava/lang/String;)V

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

.method public spanStart(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/launch/AppLaunchProxy;->a:Lcom/tencent/bugly/launch/AppLaunch;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0, p1, p2}, Lcom/tencent/bugly/launch/AppLaunch;->spanStart(Ljava/lang/String;Ljava/lang/String;)V

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
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
.end method
