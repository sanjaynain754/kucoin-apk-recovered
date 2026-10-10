.class public Ln7/c;
.super Ln7/a;
.source "Java7HandlersImpl.java"


# instance fields
.field public final b:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ln7/a;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {}, Ln7/b;->a()Ljava/lang/Class;

    .line 7
    move-result-object v0

    .line 8
    .line 9
    iput-object v0, p0, Ln7/c;->b:Ljava/lang/Class;

    .line 10
    return-void
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
.end method


# virtual methods
.method public a(Ljava/lang/Class;)Lcom/fasterxml/jackson/databind/e;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)",
            "Lcom/fasterxml/jackson/databind/e<",
            "*>;"
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Ln7/c;->b:Ljava/lang/Class;

    .line 3
    .line 4
    if-ne p1, v0, :cond_0

    .line 5
    .line 6
    new-instance p1, Lcom/fasterxml/jackson/databind/ext/NioPathDeserializer;

    .line 7
    .line 8
    .line 9
    invoke-direct {p1}, Lcom/fasterxml/jackson/databind/ext/NioPathDeserializer;-><init>()V

    .line 10
    return-object p1

    .line 11
    :cond_0
    const/4 p1, 0x0

    .line 12
    return-object p1
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

.method public b(Ljava/lang/Class;)Lcom/fasterxml/jackson/databind/h;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)",
            "Lcom/fasterxml/jackson/databind/h<",
            "*>;"
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Ln7/c;->b:Ljava/lang/Class;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 6
    move-result p1

    .line 7
    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    new-instance p1, Lcom/fasterxml/jackson/databind/ext/NioPathSerializer;

    .line 11
    .line 12
    .line 13
    invoke-direct {p1}, Lcom/fasterxml/jackson/databind/ext/NioPathSerializer;-><init>()V

    .line 14
    return-object p1

    .line 15
    :cond_0
    const/4 p1, 0x0

    .line 16
    return-object p1
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method
