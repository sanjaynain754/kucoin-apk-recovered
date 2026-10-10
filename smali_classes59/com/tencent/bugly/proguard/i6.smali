.class public Lcom/tencent/bugly/proguard/i6;
.super Lcom/tencent/bugly/proguard/s5;
.source "BUGLY"

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field public final p:I

.field public q:Ljava/lang/Object;

.field public r:Ljava/lang/String;

.field public s:J


# direct methods
.method public constructor <init>(IILjava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/tencent/bugly/proguard/s5;-><init>()V

    .line 2
    iput p1, p0, Lcom/tencent/bugly/proguard/i6;->p:I

    .line 3
    iput p2, p0, Lcom/tencent/bugly/proguard/s5;->b:I

    .line 4
    iput-object p3, p0, Lcom/tencent/bugly/proguard/s5;->c:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(ILjava/lang/String;Ljava/lang/Object;)V
    .locals 0

    .line 5
    invoke-direct {p0}, Lcom/tencent/bugly/proguard/s5;-><init>()V

    .line 6
    iput p1, p0, Lcom/tencent/bugly/proguard/i6;->p:I

    .line 7
    iput-object p3, p0, Lcom/tencent/bugly/proguard/i6;->q:Ljava/lang/Object;

    .line 8
    iput-object p2, p0, Lcom/tencent/bugly/proguard/i6;->r:Ljava/lang/String;

    return-void
.end method

.method public static a(II)Lcom/tencent/bugly/proguard/i6;
    .locals 2

    .line 1
    new-instance v0, Lcom/tencent/bugly/proguard/i6;

    const-string v1, ""

    invoke-direct {v0, p0, p1, v1}, Lcom/tencent/bugly/proguard/i6;-><init>(IILjava/lang/String;)V

    return-object v0
.end method

.method public static a(IILjava/lang/String;)Lcom/tencent/bugly/proguard/i6;
    .locals 1

    .line 2
    new-instance v0, Lcom/tencent/bugly/proguard/i6;

    invoke-direct {v0, p0, p1, p2}, Lcom/tencent/bugly/proguard/i6;-><init>(IILjava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method public a(J)V
    .locals 0

    .line 4
    iput-wide p1, p0, Lcom/tencent/bugly/proguard/i6;->s:J

    return-void
.end method

.method public a(Ljava/lang/Object;)V
    .locals 0

    .line 3
    iput-object p1, p0, Lcom/tencent/bugly/proguard/i6;->q:Ljava/lang/Object;

    return-void
.end method

.method public d()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">()TT;"
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/proguard/i6;->q:Ljava/lang/Object;

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
.end method

.method public e()J
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/tencent/bugly/proguard/i6;->s:J

    .line 3
    return-wide v0
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
.end method

.method public f()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/proguard/i6;->r:Ljava/lang/String;

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
.end method

.method public g()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/tencent/bugly/proguard/i6;->p:I

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
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 1
    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    .line 3
    .line 4
    const-string v1, "FdLeakDumpResult{errorCode="

    .line 5
    .line 6
    .line 7
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    iget v1, p0, Lcom/tencent/bugly/proguard/s5;->b:I

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    const-string v1, ", dumpFilePath=\'"

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    iget-object v1, p0, Lcom/tencent/bugly/proguard/i6;->r:Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    const-string v1, "\', errorMessage=\'"

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    iget-object v1, p0, Lcom/tencent/bugly/proguard/s5;->c:Ljava/lang/String;

    .line 30
    .line 31
    const-string v2, "\'}"

    .line 32
    .line 33
    .line 34
    invoke-static {v0, v1, v2}, Lcom/tencent/bugly/proguard/xh;->a(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 35
    move-result-object v0

    .line 36
    return-object v0
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
.end method
