.class public abstract Lcom/tencent/bugly/proguard/JceStruct;
.super Ljava/lang/Object;
.source "BUGLY"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field public static final b:B = 0x0t

.field public static final c:B = 0x1t

.field public static final d:B = 0x2t

.field public static final e:B = 0x3t

.field public static final f:B = 0x4t

.field public static final g:B = 0x5t

.field public static final h:B = 0x6t

.field public static final i:B = 0x7t

.field public static final j:B = 0x8t

.field public static final k:B = 0x9t

.field public static final l:B = 0xat

.field public static final m:B = 0xbt

.field public static final n:B = 0xct

.field public static final o:B = 0xdt

.field public static final p:I = 0x6400000


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    return-void
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
.end method


# virtual methods
.method public a()Lcom/tencent/bugly/proguard/JceStruct;
    .locals 1

    .line 1
    const/4 v0, 0x0

    return-object v0
.end method

.method public abstract a(Lcom/tencent/bugly/proguard/ka;)V
.end method

.method public abstract a(Lcom/tencent/bugly/proguard/la;)V
.end method

.method public a(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 0

    .line 2
    return-void
.end method

.method public abstract a(Ljava/lang/StringBuilder;I)V
.end method

.method public a(Ljava/lang/String;)Z
    .locals 0

    .line 3
    const/4 p1, 0x0

    return p1
.end method

.method public b(Ljava/lang/String;)Ljava/lang/Object;
    .locals 0

    .line 1
    const/4 p1, 0x0

    return-object p1
.end method

.method public b()V
    .locals 0

    .line 2
    return-void
.end method

.method public c()[B
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/tencent/bugly/proguard/la;

    .line 3
    .line 4
    const/16 v1, 0x80

    .line 5
    .line 6
    .line 7
    invoke-direct {v0, v1}, Lcom/tencent/bugly/proguard/la;-><init>(I)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, v0}, Lcom/tencent/bugly/proguard/JceStruct;->a(Lcom/tencent/bugly/proguard/la;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/la;->b()[B

    .line 14
    move-result-object v0

    .line 15
    return-object v0
    .line 16
    .line 17
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 6
    const/4 v1, 0x0

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0, v0, v1}, Lcom/tencent/bugly/proguard/JceStruct;->a(Ljava/lang/StringBuilder;I)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 13
    move-result-object v0

    .line 14
    return-object v0
    .line 15
    .line 16
    .line 17
.end method
