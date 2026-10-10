.class public abstract Lcom/ishumei/smantifraud/l111l11111Il/l111l1111llIl;
.super Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l1111l111111Il/l111l1111llIl;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l1111l111111Il/l111l1111llIl<",
        "TT;>;"
    }
.end annotation


# static fields
.field private static l111l11111I1l:Ljava/lang/String; = "application/octet-stream"

.field private static l111l11111Il:Ljava/lang/String; = "Connection"

.field private static l111l11111lIl:Ljava/lang/String; = "Content-Type"

.field private static l111l1111l1Il:Ljava/lang/String; = "Close"


# direct methods
.method public constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l11l1111lIIl$l111l11111lIl;Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l11l1111lIIl$l1111l111111Il;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l11l1111lIIl$l111l11111lIl<",
            "TT;>;",
            "Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l11l1111lIIl$l1111l111111Il;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct/range {p0 .. p6}, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l1111l111111Il/l111l1111llIl;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l11l1111lIIl$l111l11111lIl;Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l11l1111lIIl$l1111l111111Il;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 7

    .line 2
    new-instance v5, Lcom/ishumei/smantifraud/l111l11111Il/l111l1111llIl$1;

    invoke-direct {v5}, Lcom/ishumei/smantifraud/l111l11111Il/l111l1111llIl$1;-><init>()V

    new-instance v6, Lcom/ishumei/smantifraud/l111l11111Il/l111l1111llIl$2;

    invoke-direct {v6}, Lcom/ishumei/smantifraud/l111l11111Il/l111l1111llIl$2;-><init>()V

    const/4 v1, 0x1

    move-object v0, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    invoke-direct/range {v0 .. v6}, Lcom/ishumei/smantifraud/l111l11111Il/l111l1111llIl;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l11l1111lIIl$l111l11111lIl;Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l11l1111lIIl$l1111l111111Il;)V

    return-void
.end method


# virtual methods
.method public final l111l11111lIl()Ljava/util/Map;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    .line 2
    new-instance v0, Ljava/util/HashMap;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 6
    .line 7
    const-string v1, "Content-Type"

    .line 8
    .line 9
    const-string v2, "application/octet-stream"

    .line 10
    .line 11
    .line 12
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    const-string v1, "Connection"

    .line 15
    .line 16
    const-string v2, "Close"

    .line 17
    .line 18
    .line 19
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    return-object v0
    .line 21
    .line 22
.end method
