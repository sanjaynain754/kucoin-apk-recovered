.class public final Lbf0/b$f;
.super Ljava/lang/Object;
.source "Context.java"

# interfaces
.implements Lbf0/b$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lbf0/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "f"
.end annotation


# instance fields
.field public final synthetic a:Lbf0/b;


# direct methods
.method public constructor <init>(Lbf0/b;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lbf0/b$f;->a:Lbf0/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lbf0/b;Lbf0/a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lbf0/b$f;-><init>(Lbf0/b;)V

    return-void
.end method


# virtual methods
.method public a(Lbf0/b;)V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lbf0/b$f;->a:Lbf0/b;

    .line 3
    .line 4
    instance-of v1, v0, Lbf0/b$a;

    .line 5
    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    check-cast v0, Lbf0/b$a;

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Lbf0/b;->h()Ljava/lang/Throwable;

    .line 12
    move-result-object p1

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, p1}, Lbf0/b$a;->w(Ljava/lang/Throwable;)Z

    .line 16
    return-void

    .line 17
    .line 18
    .line 19
    :cond_0
    invoke-virtual {v0}, Lbf0/b;->o()V

    .line 20
    return-void
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
.end method
