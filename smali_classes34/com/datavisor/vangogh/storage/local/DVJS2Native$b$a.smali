.class Lcom/datavisor/vangogh/storage/local/DVJS2Native$b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/datavisor/vangogh/storage/local/DVJS2Native$b;->onResult(Ljava/lang/String;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Lcom/datavisor/vangogh/storage/local/DVJS2Native$b;


# direct methods
.method public constructor <init>(Lcom/datavisor/vangogh/storage/local/DVJS2Native$b;Ljava/lang/String;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/datavisor/vangogh/storage/local/DVJS2Native$b$a;->b:Lcom/datavisor/vangogh/storage/local/DVJS2Native$b;

    .line 3
    .line 4
    iput-object p2, p0, Lcom/datavisor/vangogh/storage/local/DVJS2Native$b$a;->a:Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/datavisor/vangogh/storage/local/DVJS2Native$b$a;->b:Lcom/datavisor/vangogh/storage/local/DVJS2Native$b;

    .line 3
    .line 4
    iget-object v0, v0, Lcom/datavisor/vangogh/storage/local/DVJS2Native$b;->b:Lcom/datavisor/vangogh/storage/local/DVJS2Native;

    .line 5
    .line 6
    .line 7
    invoke-static {v0}, Lcom/datavisor/vangogh/storage/local/DVJS2Native;->access$000(Lcom/datavisor/vangogh/storage/local/DVJS2Native;)Landroid/webkit/WebView;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    iget-object v1, p0, Lcom/datavisor/vangogh/storage/local/DVJS2Native$b$a;->a:Ljava/lang/String;

    .line 11
    const/4 v2, 0x0

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, v1, v2}, Landroid/webkit/WebView;->evaluateJavascript(Ljava/lang/String;Landroid/webkit/ValueCallback;)V

    .line 15
    return-void
    .line 16
    .line 17
    .line 18
.end method
