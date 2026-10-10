.class public Lf/l$c;
.super Lm/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lf/l;->c()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lf/l;


# direct methods
.method public constructor <init>(Lf/l;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lf/l$c;->b:Lf/l;

    .line 3
    .line 4
    .line 5
    invoke-direct {p0}, Lm/c;-><init>()V

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
.method public d(Ljava/lang/String;)V
    .locals 2

    .line 1
    .line 2
    .line 3
    :try_start_0
    invoke-static {}, Lf/l;->k()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    const/4 v0, 0x1

    .line 8
    .line 9
    .line 10
    invoke-static {v0}, Lf/l;->l(Z)Z

    .line 11
    .line 12
    iget-object v0, p0, Lf/l$c;->b:Lf/l;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Lf/l;->p()Lg/e;

    .line 16
    move-result-object v1

    .line 17
    .line 18
    .line 19
    invoke-static {v0, p1, v1}, Lf/l;->g(Lf/l;Ljava/lang/String;Lg/e;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 20
    :catch_0
    :cond_0
    return-void
    .line 21
    .line 22
    .line 23
    .line 24
.end method
