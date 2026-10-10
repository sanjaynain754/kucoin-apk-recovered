.class public Lc9/a$b$a;
.super Ljava/lang/Object;
.source "AutoFocusManager.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lc9/a$b;->onAutoFocus(ZLandroid/hardware/Camera;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lc9/a$b;


# direct methods
.method public constructor <init>(Lc9/a$b;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lc9/a$b$a;->b:Lc9/a$b;

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
    iget-object v0, p0, Lc9/a$b$a;->b:Lc9/a$b;

    .line 3
    .line 4
    iget-object v0, v0, Lc9/a$b;->a:Lc9/a;

    .line 5
    const/4 v1, 0x0

    .line 6
    .line 7
    .line 8
    invoke-static {v0, v1}, Lc9/a;->c(Lc9/a;Z)Z

    .line 9
    .line 10
    iget-object v0, p0, Lc9/a$b$a;->b:Lc9/a$b;

    .line 11
    .line 12
    iget-object v0, v0, Lc9/a$b;->a:Lc9/a;

    .line 13
    .line 14
    .line 15
    invoke-static {v0}, Lc9/a;->d(Lc9/a;)V

    .line 16
    return-void
.end method
