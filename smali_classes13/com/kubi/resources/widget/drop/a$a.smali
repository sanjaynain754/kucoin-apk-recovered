.class public Lcom/kubi/resources/widget/drop/a$a;
.super Ljava/lang/Object;
.source "DropMenuHelper.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kubi/resources/widget/drop/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field public a:Ljava/lang/String;

.field public b:Ljava/lang/String;

.field public c:[Lcom/kubi/resources/widget/drop/FilterType$b;

.field public d:Lio/reactivex/functions/Consumer;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/functions/Consumer<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public e:I


# direct methods
.method public constructor <init>(Ljava/lang/String;[Lcom/kubi/resources/widget/drop/FilterType$b;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x3

    .line 2
    iput v0, p0, Lcom/kubi/resources/widget/drop/a$a;->e:I

    .line 3
    iput-object p1, p0, Lcom/kubi/resources/widget/drop/a$a;->b:Ljava/lang/String;

    const/4 p1, 0x0

    move v0, p1

    .line 4
    :goto_0
    array-length v1, p2

    if-ge v0, v1, :cond_1

    if-nez v0, :cond_0

    .line 5
    aget-object v1, p2, p1

    const/4 v2, 0x1

    invoke-interface {v1, v2}, Lcom/kubi/resources/widget/drop/FilterType$b;->c(Z)V

    goto :goto_1

    .line 6
    :cond_0
    aget-object v1, p2, v0

    invoke-interface {v1, p1}, Lcom/kubi/resources/widget/drop/FilterType$b;->c(Z)V

    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 7
    :cond_1
    iput-object p2, p0, Lcom/kubi/resources/widget/drop/a$a;->c:[Lcom/kubi/resources/widget/drop/FilterType$b;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;[Lcom/kubi/resources/widget/drop/FilterType$b;I)V
    .locals 2

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    iput-object p1, p0, Lcom/kubi/resources/widget/drop/a$a;->b:Ljava/lang/String;

    .line 19
    iput p3, p0, Lcom/kubi/resources/widget/drop/a$a;->e:I

    const/4 p1, 0x0

    move p3, p1

    .line 20
    :goto_0
    array-length v0, p2

    if-ge p3, v0, :cond_1

    if-nez p3, :cond_0

    .line 21
    aget-object v0, p2, p1

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Lcom/kubi/resources/widget/drop/FilterType$b;->c(Z)V

    goto :goto_1

    .line 22
    :cond_0
    aget-object v0, p2, p3

    invoke-interface {v0, p1}, Lcom/kubi/resources/widget/drop/FilterType$b;->c(Z)V

    :goto_1
    add-int/lit8 p3, p3, 0x1

    goto :goto_0

    .line 23
    :cond_1
    iput-object p2, p0, Lcom/kubi/resources/widget/drop/a$a;->c:[Lcom/kubi/resources/widget/drop/FilterType$b;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;[Lcom/kubi/resources/widget/drop/FilterType$b;Lio/reactivex/functions/Consumer;Ljava/lang/Boolean;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "[",
            "Lcom/kubi/resources/widget/drop/FilterType$b;",
            "Lio/reactivex/functions/Consumer<",
            "Ljava/lang/Integer;",
            ">;",
            "Ljava/lang/Boolean;",
            ")V"
        }
    .end annotation

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x3

    .line 9
    iput v0, p0, Lcom/kubi/resources/widget/drop/a$a;->e:I

    .line 10
    iput-object p1, p0, Lcom/kubi/resources/widget/drop/a$a;->b:Ljava/lang/String;

    .line 11
    iput-object p3, p0, Lcom/kubi/resources/widget/drop/a$a;->d:Lio/reactivex/functions/Consumer;

    .line 12
    invoke-virtual {p4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, 0x0

    move p3, p1

    .line 13
    :goto_0
    array-length p4, p2

    if-ge p3, p4, :cond_1

    if-nez p3, :cond_0

    .line 14
    aget-object p4, p2, p1

    const/4 v0, 0x1

    invoke-interface {p4, v0}, Lcom/kubi/resources/widget/drop/FilterType$b;->c(Z)V

    goto :goto_1

    .line 15
    :cond_0
    aget-object p4, p2, p3

    invoke-interface {p4, p1}, Lcom/kubi/resources/widget/drop/FilterType$b;->c(Z)V

    :goto_1
    add-int/lit8 p3, p3, 0x1

    goto :goto_0

    .line 16
    :cond_1
    iput-object p2, p0, Lcom/kubi/resources/widget/drop/a$a;->c:[Lcom/kubi/resources/widget/drop/FilterType$b;

    return-void
.end method


# virtual methods
.method public a()Lio/reactivex/functions/Consumer;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/functions/Consumer<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/resources/widget/drop/a$a;->d:Lio/reactivex/functions/Consumer;

    .line 3
    return-object v0
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
.end method

.method public b()[Lcom/kubi/resources/widget/drop/FilterType$b;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/resources/widget/drop/a$a;->c:[Lcom/kubi/resources/widget/drop/FilterType$b;

    .line 3
    return-object v0
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
.end method

.method public c()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/resources/widget/drop/a$a;->b:Ljava/lang/String;

    .line 3
    return-object v0
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
.end method

.method public d()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/kubi/resources/widget/drop/a$a;->e:I

    .line 3
    return v0
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
.end method
