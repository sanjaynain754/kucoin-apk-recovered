.class public Lc9/b$b$a;
.super Ljava/lang/Object;
.source "CameraInstance.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lc9/b$b;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lc9/b$b;


# direct methods
.method public constructor <init>(Lc9/b$b;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lc9/b$b$a;->b:Lc9/b$b;

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
    .line 24
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lc9/b$b$a;->b:Lc9/b$b;

    .line 3
    .line 4
    iget-object v0, v0, Lc9/b$b;->c:Lc9/b;

    .line 5
    .line 6
    .line 7
    invoke-static {v0}, Lc9/b;->a(Lc9/b;)Lcom/journeyapps/barcodescanner/camera/a;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    iget-object v1, p0, Lc9/b$b$a;->b:Lc9/b$b;

    .line 11
    .line 12
    iget-object v1, v1, Lc9/b$b;->b:Lc9/i;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, v1}, Lcom/journeyapps/barcodescanner/camera/a;->l(Lc9/i;)V

    .line 16
    return-void
.end method
