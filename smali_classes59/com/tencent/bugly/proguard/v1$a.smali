.class public Lcom/tencent/bugly/proguard/v1$a;
.super Ljava/lang/Object;
.source "BUGLY"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/tencent/bugly/proguard/v1;->a(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lcom/tencent/bugly/crashreport/biz/UserInfoBean;

.field public final synthetic c:Lcom/tencent/bugly/proguard/v1;


# direct methods
.method public constructor <init>(Lcom/tencent/bugly/proguard/v1;Lcom/tencent/bugly/crashreport/biz/UserInfoBean;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    .line 2
    iput-object p1, p0, Lcom/tencent/bugly/proguard/v1$a;->c:Lcom/tencent/bugly/proguard/v1;

    .line 3
    .line 4
    iput-object p2, p0, Lcom/tencent/bugly/proguard/v1$a;->b:Lcom/tencent/bugly/crashreport/biz/UserInfoBean;

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
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/proguard/v1$a;->c:Lcom/tencent/bugly/proguard/v1;

    .line 3
    .line 4
    iget-object v1, p0, Lcom/tencent/bugly/proguard/v1$a;->b:Lcom/tencent/bugly/crashreport/biz/UserInfoBean;

    .line 5
    .line 6
    .line 7
    invoke-static {v1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 8
    move-result-object v1

    .line 9
    const/4 v2, 0x1

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, v1, v2}, Lcom/tencent/bugly/proguard/v1;->a(Ljava/util/List;Z)V

    .line 13
    return-void
    .line 14
    .line 15
    .line 16
    .line 17
.end method
