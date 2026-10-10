.class public Lcom/tencent/bugly/proguard/r7;
.super Ljava/lang/Object;
.source "BUGLY"


# static fields
.field public static final e:I = 0x1

.field public static final f:I = 0x2

.field public static final g:I = 0x4

.field public static final h:I = 0x8

.field public static final i:I = 0x10

.field public static final j:I = 0x20


# instance fields
.field public final a:Z

.field public final b:I

.field public final c:Ljava/lang/String;

.field public d:Lcom/tencent/bugly/proguard/d9;


# direct methods
.method public constructor <init>(Z)V
    .locals 1

    const/4 v0, 0x0

    .line 6
    invoke-direct {p0, p1, v0}, Lcom/tencent/bugly/proguard/r7;-><init>(ZI)V

    return-void
.end method

.method public constructor <init>(ZI)V
    .locals 1

    .line 5
    const-string v0, ""

    invoke-direct {p0, p1, p2, v0}, Lcom/tencent/bugly/proguard/r7;-><init>(ZILjava/lang/String;)V

    return-void
.end method

.method public constructor <init>(ZILjava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-boolean p1, p0, Lcom/tencent/bugly/proguard/r7;->a:Z

    .line 3
    iput p2, p0, Lcom/tencent/bugly/proguard/r7;->b:I

    .line 4
    iput-object p3, p0, Lcom/tencent/bugly/proguard/r7;->c:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tencent/bugly/proguard/r7;->c:Ljava/lang/String;

    return-object v0
.end method

.method public a(Lcom/tencent/bugly/proguard/d9;)V
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/tencent/bugly/proguard/r7;->d:Lcom/tencent/bugly/proguard/d9;

    return-void
.end method

.method public b()Lcom/tencent/bugly/proguard/d9;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/proguard/r7;->d:Lcom/tencent/bugly/proguard/d9;

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

.method public c()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/tencent/bugly/proguard/r7;->b:I

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

.method public d()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/tencent/bugly/proguard/r7;->a:Z

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
