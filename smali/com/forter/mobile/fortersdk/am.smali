.class public final Lcom/forter/mobile/fortersdk/am;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/forter/mobile/fortersdk/am$a;
    }
.end annotation


# static fields
.field public static g:Ljava/lang/String; = ""
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public static h:Ljava/lang/String; = ""
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field


# instance fields
.field public a:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Lcom/forter/mobile/fortersdk/p;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final c:Ljava/util/List;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/forter/mobile/fortersdk/e;",
            ">;"
        }
    .end annotation
.end field

.field public final d:Ljava/util/List;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/forter/mobile/fortersdk/w3;",
            ">;"
        }
    .end annotation
.end field

.field public e:Lt7/a;

.field public final f:Lcom/forter/mobile/fortersdk/w3;


# direct methods
.method static constructor <clinit>()V
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

.method public constructor <init>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/forter/mobile/fortersdk/p;

    invoke-direct {v0}, Lcom/forter/mobile/fortersdk/p;-><init>()V

    invoke-direct {p0, v0}, Lcom/forter/mobile/fortersdk/am;-><init>(Lcom/forter/mobile/fortersdk/p;)V

    return-void
.end method

.method public constructor <init>(Lcom/forter/mobile/fortersdk/p;)V
    .locals 4
    .param p1    # Lcom/forter/mobile/fortersdk/p;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/forter/mobile/fortersdk/am;->e:Lt7/a;

    new-instance v0, Lcom/forter/mobile/fortersdk/am$b;

    invoke-direct {v0, p0}, Lcom/forter/mobile/fortersdk/am$b;-><init>(Lcom/forter/mobile/fortersdk/am;)V

    iput-object v0, p0, Lcom/forter/mobile/fortersdk/am;->f:Lcom/forter/mobile/fortersdk/w3;

    iput-object p1, p0, Lcom/forter/mobile/fortersdk/am;->b:Lcom/forter/mobile/fortersdk/p;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/forter/mobile/fortersdk/am;->c:Ljava/util/List;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/forter/mobile/fortersdk/am;->d:Ljava/util/List;

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    invoke-static {}, Lcom/forter/mobile/fortersdk/c;->b()Lcom/forter/mobile/fortersdk/c;

    move-result-object v2

    invoke-virtual {v2}, Lcom/forter/mobile/fortersdk/c;->p()Lt7/a;

    move-result-object v2

    iput-object v2, p0, Lcom/forter/mobile/fortersdk/am;->e:Lt7/a;

    if-eqz v2, :cond_0

    const-string v3, "User-agent"

    invoke-virtual {v2}, Lt7/a;->d()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v2, p0, Lcom/forter/mobile/fortersdk/am;->e:Lt7/a;

    invoke-virtual {v2}, Lt7/a;->r()Ljava/lang/String;

    move-result-object v2

    const-string/jumbo v3, "x-forter-siteid"

    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string/jumbo v2, "x-forter-nativeapp"

    invoke-static {}, Lcom/forter/mobile/fortersdk/f3;->K()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    iput-object v1, p0, Lcom/forter/mobile/fortersdk/am;->a:Ljava/util/Map;

    new-instance v1, Lcom/forter/mobile/fortersdk/m;

    invoke-direct {v1}, Lcom/forter/mobile/fortersdk/m;-><init>()V

    invoke-interface {p1, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance p1, Lcom/forter/mobile/fortersdk/n;

    invoke-direct {p1}, Lcom/forter/mobile/fortersdk/n;-><init>()V

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public static a(Lcom/forter/mobile/fortersdk/am$a;)Ljava/lang/String;
    .locals 2
    .param p0    # Lcom/forter/mobile/fortersdk/am$a;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 6
    .line 7
    sget-object v1, Lcom/forter/mobile/fortersdk/am;->g:Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    const-string v1, "/"

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 19
    move-result-object p0

    .line 20
    .line 21
    .line 22
    invoke-static {p0}, Lcom/forter/mobile/fortersdk/f3;->f(Ljava/lang/String;)Ljava/lang/String;

    .line 23
    move-result-object p0

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 30
    move-result-object p0

    .line 31
    return-object p0
.end method

.method public static b(Lt7/a;Landroid/content/Context;)Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lt7/a;->l()Ljava/lang/String;

    .line 4
    move-result-object p0

    .line 5
    .line 6
    .line 7
    :try_start_0
    invoke-static {p0}, Lcom/forter/mobile/fortersdk/am;->i(Ljava/lang/String;)Z

    .line 8
    move-result v0

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    .line 13
    invoke-static {p1}, Lr7/b;->a(Landroid/content/Context;)Ljava/lang/String;

    .line 14
    move-result-object p0

    .line 15
    .line 16
    .line 17
    invoke-static {p0}, Lcom/forter/mobile/fortersdk/am;->i(Ljava/lang/String;)Z

    .line 18
    move-result p1

    .line 19
    .line 20
    if-eqz p1, :cond_0

    .line 21
    .line 22
    const-string p0, "error-no-ids"
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 23
    :cond_0
    return-object p0

    .line 24
    :catch_0
    move-exception p0

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    invoke-static {}, Lcom/forter/mobile/fortersdk/c3;->f()V

    .line 31
    .line 32
    const-string p0, "error-ex"

    .line 33
    return-object p0
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

.method public static synthetic c(Lcom/forter/mobile/fortersdk/am;)Ljava/util/List;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/forter/mobile/fortersdk/am;->d:Ljava/util/List;

    .line 3
    return-object p0
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
.end method

.method public static g(Lt7/a;)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lt7/a;->a()Ljava/lang/String;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    sput-object v0, Lcom/forter/mobile/fortersdk/am;->g:Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lt7/a;->e()Ljava/lang/String;

    .line 10
    move-result-object p0

    .line 11
    .line 12
    sput-object p0, Lcom/forter/mobile/fortersdk/am;->h:Ljava/lang/String;

    .line 13
    return-void
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
.end method

.method public static i(Ljava/lang/String;)Z
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    .line 3
    .line 4
    :try_start_0
    invoke-static {p0, v0}, Ljava/net/IDN;->toASCII(Ljava/lang/String;I)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 5
    const/4 p0, 0x0

    .line 6
    return p0

    .line 7
    :catch_0
    const/4 p0, 0x1

    .line 8
    return p0
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
.end method


# virtual methods
.method public final d(Lcom/forter/mobile/fortersdk/v3;)Lorg/json/JSONObject;
    .locals 4
    .param p1    # Lcom/forter/mobile/fortersdk/v3;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-interface {p1}, Lcom/forter/mobile/fortersdk/v3;->d()Lorg/json/JSONObject;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    :try_start_0
    invoke-static {}, Lcom/forter/mobile/fortersdk/c;->b()Lcom/forter/mobile/fortersdk/c;

    .line 8
    move-result-object v1

    .line 9
    .line 10
    .line 11
    invoke-virtual {v1}, Lcom/forter/mobile/fortersdk/c;->p()Lt7/a;

    .line 12
    move-result-object v1

    .line 13
    .line 14
    iput-object v1, p0, Lcom/forter/mobile/fortersdk/am;->e:Lt7/a;

    .line 15
    .line 16
    const-string v2, "mobileUID"

    .line 17
    .line 18
    .line 19
    invoke-virtual {v1}, Lt7/a;->l()Ljava/lang/String;

    .line 20
    move-result-object v1

    .line 21
    .line 22
    .line 23
    invoke-static {v1}, Lcom/forter/mobile/fortersdk/f3;->v(Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    move-result-object v1

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 28
    .line 29
    const-string v1, "accountID"

    .line 30
    .line 31
    iget-object v2, p0, Lcom/forter/mobile/fortersdk/am;->e:Lt7/a;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v2}, Lt7/a;->c()Ljava/lang/String;

    .line 35
    move-result-object v2

    .line 36
    .line 37
    .line 38
    invoke-static {v2}, Lcom/forter/mobile/fortersdk/f3;->v(Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    move-result-object v2

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 43
    .line 44
    .line 45
    const-string/jumbo v1, "timestamp"

    .line 46
    .line 47
    .line 48
    invoke-interface {p1}, Lcom/forter/mobile/fortersdk/v3;->c()J

    .line 49
    move-result-wide v2

    .line 50
    .line 51
    .line 52
    invoke-static {v2, v3}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    .line 53
    move-result-object p1

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0, v1, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 57
    .line 58
    .line 59
    const-string/jumbo p1, "sentTS"

    .line 60
    .line 61
    .line 62
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 63
    move-result-wide v1

    .line 64
    .line 65
    .line 66
    invoke-static {v1, v2}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    .line 67
    move-result-object v1

    .line 68
    .line 69
    .line 70
    invoke-virtual {v0, p1, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 71
    return-object v0

    .line 72
    .line 73
    .line 74
    :catch_0
    invoke-static {}, Lcom/forter/mobile/fortersdk/c3;->f()V

    .line 75
    return-object v0
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
.end method

.method public final e(Lorg/json/JSONObject;)Lorg/json/JSONObject;
    .locals 5

    .line 1
    .line 2
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 9
    move-result-object v1

    .line 10
    .line 11
    .line 12
    invoke-static {v1}, Lcom/forter/mobile/fortersdk/bk;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 13
    move-result-object v1

    .line 14
    .line 15
    const-string v2, "data"

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 19
    .line 20
    .line 21
    const-string/jumbo v2, "type"

    .line 22
    .line 23
    const-string v3, "enc"

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 27
    .line 28
    .line 29
    const-string/jumbo v2, "signature"

    .line 30
    .line 31
    new-instance v3, Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 35
    .line 36
    iget-object v4, p0, Lcom/forter/mobile/fortersdk/am;->e:Lt7/a;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v4}, Lt7/a;->r()Ljava/lang/String;

    .line 40
    move-result-object v4

    .line 41
    .line 42
    .line 43
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 47
    move-result v1

    .line 48
    .line 49
    .line 50
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 54
    move-result-object v1

    .line 55
    .line 56
    .line 57
    invoke-static {v1}, Lcom/forter/mobile/fortersdk/f3;->w(Ljava/lang/String;)Ljava/lang/String;

    .line 58
    move-result-object v1

    .line 59
    .line 60
    .line 61
    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 62
    .line 63
    const-string v1, "mobileUID"

    .line 64
    .line 65
    iget-object v2, p0, Lcom/forter/mobile/fortersdk/am;->e:Lt7/a;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v2}, Lt7/a;->l()Ljava/lang/String;

    .line 69
    move-result-object v2

    .line 70
    .line 71
    .line 72
    invoke-static {v2}, Lcom/forter/mobile/fortersdk/f3;->v(Ljava/lang/Object;)Ljava/lang/Object;

    .line 73
    move-result-object v2

    .line 74
    .line 75
    .line 76
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 77
    return-object v0

    .line 78
    .line 79
    .line 80
    :catch_0
    invoke-static {}, Lcom/forter/mobile/fortersdk/c3;->d()V

    .line 81
    return-object p1
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
.end method

.method public final f(Lcom/forter/mobile/fortersdk/as;)V
    .locals 2
    .param p1    # Lcom/forter/mobile/fortersdk/as;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/forter/mobile/fortersdk/am;->c:Ljava/util/List;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 10
    move-result v1

    .line 11
    .line 12
    if-eqz v1, :cond_1

    .line 13
    .line 14
    .line 15
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 16
    move-result-object v1

    .line 17
    .line 18
    check-cast v1, Lcom/forter/mobile/fortersdk/e;

    .line 19
    .line 20
    if-eqz v1, :cond_0

    .line 21
    .line 22
    .line 23
    invoke-interface {v1, p1}, Lcom/forter/mobile/fortersdk/e;->a(Lcom/forter/mobile/fortersdk/as;)Lcom/forter/mobile/fortersdk/as;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 24
    goto :goto_0

    .line 25
    :catch_0
    move-exception v0

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    invoke-static {}, Lcom/forter/mobile/fortersdk/c3;->a()V

    .line 32
    .line 33
    :cond_1
    iget-object v0, p0, Lcom/forter/mobile/fortersdk/am;->b:Lcom/forter/mobile/fortersdk/p;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0, p1}, Lcom/forter/mobile/fortersdk/p;->f(Lcom/forter/mobile/fortersdk/as;)Z

    .line 37
    return-void
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
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
.end method

.method public final h(Lcom/forter/mobile/fortersdk/g3;)Z
    .locals 3
    .param p1    # Lcom/forter/mobile/fortersdk/g3;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/forter/mobile/fortersdk/am;->d(Lcom/forter/mobile/fortersdk/v3;)Lorg/json/JSONObject;

    .line 4
    move-result-object p1

    .line 5
    .line 6
    sget-object v0, Lcom/forter/mobile/fortersdk/am$a;->a:Lcom/forter/mobile/fortersdk/am$a;

    .line 7
    .line 8
    .line 9
    invoke-static {v0}, Lcom/forter/mobile/fortersdk/am;->a(Lcom/forter/mobile/fortersdk/am$a;)Ljava/lang/String;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    :try_start_0
    const-string v1, "localTime"

    .line 13
    .line 14
    .line 15
    invoke-static {}, Lcom/forter/mobile/fortersdk/f3;->C()Ljava/lang/String;

    .line 16
    move-result-object v2

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 20
    goto :goto_0

    .line 21
    .line 22
    .line 23
    :catch_0
    invoke-static {}, Lcom/forter/mobile/fortersdk/c3;->f()V

    .line 24
    .line 25
    :goto_0
    const-string v1, "app/active"

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0, v1, v0, p1}, Lcom/forter/mobile/fortersdk/am;->k(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)Z

    .line 29
    move-result p1

    .line 30
    return p1
    .line 31
.end method

.method public final j(Ljava/lang/String;Landroid/content/Context;)Z
    .locals 3
    .param p2    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    :try_start_0
    invoke-static {}, Lcom/forter/mobile/fortersdk/c;->b()Lcom/forter/mobile/fortersdk/c;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/forter/mobile/fortersdk/c;->p()Lt7/a;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    .line 11
    invoke-static {v0, p2}, Lcom/forter/mobile/fortersdk/am;->b(Lt7/a;Landroid/content/Context;)Ljava/lang/String;

    .line 12
    move-result-object p2

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Lt7/a;->r()Ljava/lang/String;

    .line 16
    move-result-object v0

    .line 17
    .line 18
    .line 19
    invoke-static {}, Lcom/forter/mobile/fortersdk/f3;->a()Ljava/lang/String;

    .line 20
    move-result-object v1

    .line 21
    .line 22
    const-string v2, "#SID#"

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1, v2, v0}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 26
    move-result-object p1

    .line 27
    .line 28
    const-string v0, "#MID#"

    .line 29
    .line 30
    .line 31
    invoke-virtual {p1, v0, p2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 32
    move-result-object p1

    .line 33
    .line 34
    const-string p2, "#GID#"

    .line 35
    .line 36
    .line 37
    invoke-virtual {p1, p2, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 38
    move-result-object p1

    .line 39
    .line 40
    new-instance p2, Lcom/forter/mobile/fortersdk/s;

    .line 41
    .line 42
    iget-object v0, p0, Lcom/forter/mobile/fortersdk/am;->f:Lcom/forter/mobile/fortersdk/w3;

    .line 43
    .line 44
    .line 45
    invoke-direct {p2, p1, v0}, Lcom/forter/mobile/fortersdk/s;-><init>(Ljava/lang/String;Lcom/forter/mobile/fortersdk/w3;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0, p2}, Lcom/forter/mobile/fortersdk/am;->f(Lcom/forter/mobile/fortersdk/as;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 49
    const/4 p1, 0x1

    .line 50
    return p1

    .line 51
    .line 52
    .line 53
    :catch_0
    invoke-static {}, Lcom/forter/mobile/fortersdk/c3;->g()V

    .line 54
    const/4 p1, 0x0

    .line 55
    return p1
    .line 56
    .line 57
    .line 58
    .line 59
.end method

.method public final k(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)Z
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Lorg/json/JSONObject;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/forter/mobile/fortersdk/am;->e:Lt7/a;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lt7/a;->G()Z

    .line 6
    move-result v0

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, p3}, Lcom/forter/mobile/fortersdk/am;->e(Lorg/json/JSONObject;)Lorg/json/JSONObject;

    .line 12
    move-result-object p3

    .line 13
    .line 14
    :cond_0
    iget-object v0, p0, Lcom/forter/mobile/fortersdk/am;->e:Lt7/a;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0}, Lt7/a;->I()Z

    .line 18
    move-result v0

    .line 19
    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    .line 23
    invoke-static {p2, p3}, Lcom/forter/mobile/fortersdk/f3;->h(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    .line 24
    move-result-object p2

    .line 25
    .line 26
    new-instance p3, Lcom/forter/mobile/fortersdk/s;

    .line 27
    .line 28
    iget-object v0, p0, Lcom/forter/mobile/fortersdk/am;->f:Lcom/forter/mobile/fortersdk/w3;

    .line 29
    .line 30
    .line 31
    invoke-direct {p3, p2, v0}, Lcom/forter/mobile/fortersdk/s;-><init>(Ljava/lang/String;Lcom/forter/mobile/fortersdk/w3;)V

    .line 32
    goto :goto_0

    .line 33
    .line 34
    :cond_1
    new-instance v0, Lcom/forter/mobile/fortersdk/t;

    .line 35
    .line 36
    iget-object v1, p0, Lcom/forter/mobile/fortersdk/am;->f:Lcom/forter/mobile/fortersdk/w3;

    .line 37
    .line 38
    .line 39
    invoke-direct {v0, p2, p3, v1}, Lcom/forter/mobile/fortersdk/t;-><init>(Ljava/lang/String;Lorg/json/JSONObject;Lcom/forter/mobile/fortersdk/w3;)V

    .line 40
    move-object p3, v0

    .line 41
    .line 42
    :goto_0
    iget-object p2, p0, Lcom/forter/mobile/fortersdk/am;->a:Ljava/util/Map;

    .line 43
    .line 44
    if-eqz p2, :cond_2

    .line 45
    .line 46
    iput-object p2, p3, Lcom/forter/mobile/fortersdk/as;->c:Ljava/util/Map;

    .line 47
    .line 48
    .line 49
    :cond_2
    invoke-virtual {p0, p3}, Lcom/forter/mobile/fortersdk/am;->f(Lcom/forter/mobile/fortersdk/as;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 50
    const/4 p1, 0x1

    .line 51
    return p1

    .line 52
    .line 53
    .line 54
    :catch_0
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 55
    move-result-object p1

    .line 56
    .line 57
    const-string p2, "Failed to create and queue request: "

    .line 58
    .line 59
    .line 60
    invoke-virtual {p2, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    invoke-static {}, Lcom/forter/mobile/fortersdk/c3;->f()V

    .line 64
    const/4 p1, 0x0

    .line 65
    return p1
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
.end method
