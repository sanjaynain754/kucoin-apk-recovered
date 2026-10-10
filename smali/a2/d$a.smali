.class public abstract La2/d$a;
.super Ljava/lang/Object;
.source "QMediaStoreUriLoader.java"

# interfaces
.implements Lz1/o;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La2/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<DataT:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lz1/o<",
        "Landroid/net/Uri;",
        "TDataT;>;"
    }
.end annotation


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "TDataT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/Class;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/Class<",
            "TDataT;>;)V"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput-object p1, p0, La2/d$a;->a:Landroid/content/Context;

    .line 6
    .line 7
    iput-object p2, p0, La2/d$a;->b:Ljava/lang/Class;

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
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
.end method


# virtual methods
.method public final a(Lz1/r;)Lz1/n;
    .locals 5
    .param p1    # Lz1/r;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lz1/r;",
            ")",
            "Lz1/n<",
            "Landroid/net/Uri;",
            "TDataT;>;"
        }
    .end annotation

    .line 1
    .line 2
    new-instance v0, La2/d;

    .line 3
    .line 4
    iget-object v1, p0, La2/d$a;->a:Landroid/content/Context;

    .line 5
    .line 6
    const-class v2, Ljava/io/File;

    .line 7
    .line 8
    iget-object v3, p0, La2/d$a;->b:Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1, v2, v3}, Lz1/r;->d(Ljava/lang/Class;Ljava/lang/Class;)Lz1/n;

    .line 12
    move-result-object v2

    .line 13
    .line 14
    const-class v3, Landroid/net/Uri;

    .line 15
    .line 16
    iget-object v4, p0, La2/d$a;->b:Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1, v3, v4}, Lz1/r;->d(Ljava/lang/Class;Ljava/lang/Class;)Lz1/n;

    .line 20
    move-result-object p1

    .line 21
    .line 22
    iget-object v3, p0, La2/d$a;->b:Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    invoke-direct {v0, v1, v2, p1, v3}, La2/d;-><init>(Landroid/content/Context;Lz1/n;Lz1/n;Ljava/lang/Class;)V

    .line 26
    return-object v0
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
.end method

.method public final c()V
    .locals 0

    .line 1
    return-void
    .line 2
    .line 3
    .line 4
    .line 5
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
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method
