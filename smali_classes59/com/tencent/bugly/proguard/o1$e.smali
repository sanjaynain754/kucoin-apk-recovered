.class public Lcom/tencent/bugly/proguard/o1$e;
.super Ljava/lang/Object;
.source "BUGLY"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/tencent/bugly/proguard/o1;->onStop(Landroid/app/Activity;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Lcom/tencent/bugly/proguard/o1;


# direct methods
.method public constructor <init>(Lcom/tencent/bugly/proguard/o1;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    .line 2
    iput-object p1, p0, Lcom/tencent/bugly/proguard/o1$e;->c:Lcom/tencent/bugly/proguard/o1;

    .line 3
    .line 4
    iput-object p2, p0, Lcom/tencent/bugly/proguard/o1$e;->b:Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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
.end method


# virtual methods
.method public run()V
    .locals 8

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/proguard/o1$e;->c:Lcom/tencent/bugly/proguard/o1;

    .line 3
    .line 4
    iget-object v0, v0, Lcom/tencent/bugly/proguard/o1;->j:Lcom/tencent/bugly/proguard/re;

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/re;->r()V

    .line 8
    .line 9
    iget-object v0, p0, Lcom/tencent/bugly/proguard/o1$e;->c:Lcom/tencent/bugly/proguard/o1;

    .line 10
    .line 11
    iget-object v0, v0, Lcom/tencent/bugly/proguard/o1;->j:Lcom/tencent/bugly/proguard/re;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/re;->l()Lcom/tencent/bugly/proguard/re$c;

    .line 15
    move-result-object v0

    .line 16
    .line 17
    if-nez v0, :cond_0

    .line 18
    return-void

    .line 19
    .line 20
    :cond_0
    iget-object v1, p0, Lcom/tencent/bugly/proguard/o1$e;->c:Lcom/tencent/bugly/proguard/o1;

    .line 21
    .line 22
    iget-object v2, v1, Lcom/tencent/bugly/proguard/o1;->g:Lcom/tencent/bugly/proguard/g1;

    .line 23
    .line 24
    iget-object v3, p0, Lcom/tencent/bugly/proguard/o1$e;->b:Ljava/lang/String;

    .line 25
    .line 26
    iget-wide v4, v0, Lcom/tencent/bugly/proguard/re$c;->n:J

    .line 27
    .line 28
    iget v1, v0, Lcom/tencent/bugly/proguard/re$c;->r:I

    .line 29
    .line 30
    iget v0, v0, Lcom/tencent/bugly/proguard/re$c;->q:I

    .line 31
    add-int/2addr v1, v0

    .line 32
    int-to-long v6, v1

    .line 33
    .line 34
    .line 35
    invoke-virtual/range {v2 .. v7}, Lcom/tencent/bugly/proguard/g1;->a(Ljava/lang/String;JJ)V

    .line 36
    .line 37
    iget-object v0, p0, Lcom/tencent/bugly/proguard/o1$e;->c:Lcom/tencent/bugly/proguard/o1;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/o1;->d()V

    .line 41
    return-void
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
