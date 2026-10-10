.class Lcom/facebook/react/devsupport/DevSupportManagerBase$2;
.super Ljava/lang/Object;
.source "DevSupportManagerBase.java"

# interfaces
.implements Lcom/facebook/react/devsupport/interfaces/DevOptionHandler;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/react/devsupport/DevSupportManagerBase;->showDevOptionsDialog()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/facebook/react/devsupport/DevSupportManagerBase;


# direct methods
.method public constructor <init>(Lcom/facebook/react/devsupport/DevSupportManagerBase;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase$2;->this$0:Lcom/facebook/react/devsupport/DevSupportManagerBase;

    .line 3
    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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
.end method


# virtual methods
.method public onOptionSelected()V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase$2;->this$0:Lcom/facebook/react/devsupport/DevSupportManagerBase;

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Lcom/facebook/react/devsupport/DevSupportManagerBase;->x(Lcom/facebook/react/devsupport/DevSupportManagerBase;)Lcom/facebook/react/modules/debug/interfaces/DeveloperSettings;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    invoke-interface {v0}, Lcom/facebook/react/modules/debug/interfaces/DeveloperSettings;->isJSDevModeEnabled()Z

    .line 10
    move-result v0

    .line 11
    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    iget-object v0, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase$2;->this$0:Lcom/facebook/react/devsupport/DevSupportManagerBase;

    .line 15
    .line 16
    .line 17
    invoke-static {v0}, Lcom/facebook/react/devsupport/DevSupportManagerBase;->x(Lcom/facebook/react/devsupport/DevSupportManagerBase;)Lcom/facebook/react/modules/debug/interfaces/DeveloperSettings;

    .line 18
    move-result-object v0

    .line 19
    .line 20
    .line 21
    invoke-interface {v0}, Lcom/facebook/react/modules/debug/interfaces/DeveloperSettings;->isHotModuleReplacementEnabled()Z

    .line 22
    move-result v0

    .line 23
    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    iget-object v0, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase$2;->this$0:Lcom/facebook/react/devsupport/DevSupportManagerBase;

    .line 27
    .line 28
    .line 29
    invoke-static {v0}, Lcom/facebook/react/devsupport/DevSupportManagerBase;->r(Lcom/facebook/react/devsupport/DevSupportManagerBase;)Landroid/content/Context;

    .line 30
    move-result-object v0

    .line 31
    .line 32
    iget-object v1, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase$2;->this$0:Lcom/facebook/react/devsupport/DevSupportManagerBase;

    .line 33
    .line 34
    .line 35
    invoke-static {v1}, Lcom/facebook/react/devsupport/DevSupportManagerBase;->r(Lcom/facebook/react/devsupport/DevSupportManagerBase;)Landroid/content/Context;

    .line 36
    move-result-object v1

    .line 37
    .line 38
    sget v2, Lcom/facebook/react/R$string;->catalyst_hot_reloading_auto_disable:I

    .line 39
    .line 40
    .line 41
    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 42
    move-result-object v1

    .line 43
    const/4 v2, 0x1

    .line 44
    .line 45
    .line 46
    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 47
    move-result-object v0

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 51
    .line 52
    iget-object v0, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase$2;->this$0:Lcom/facebook/react/devsupport/DevSupportManagerBase;

    .line 53
    .line 54
    .line 55
    invoke-static {v0}, Lcom/facebook/react/devsupport/DevSupportManagerBase;->x(Lcom/facebook/react/devsupport/DevSupportManagerBase;)Lcom/facebook/react/modules/debug/interfaces/DeveloperSettings;

    .line 56
    move-result-object v0

    .line 57
    const/4 v1, 0x0

    .line 58
    .line 59
    .line 60
    invoke-interface {v0, v1}, Lcom/facebook/react/modules/debug/interfaces/DeveloperSettings;->setHotModuleReplacementEnabled(Z)V

    .line 61
    .line 62
    :cond_0
    iget-object v0, p0, Lcom/facebook/react/devsupport/DevSupportManagerBase$2;->this$0:Lcom/facebook/react/devsupport/DevSupportManagerBase;

    .line 63
    .line 64
    .line 65
    invoke-interface {v0}, Lcom/facebook/react/devsupport/interfaces/DevSupportManager;->handleReloadJS()V

    .line 66
    return-void
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
.end method
