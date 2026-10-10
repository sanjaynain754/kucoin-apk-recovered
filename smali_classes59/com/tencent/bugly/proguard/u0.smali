.class public final Lcom/tencent/bugly/proguard/u0;
.super Ljava/util/concurrent/locks/ReentrantLock;
.source "BUGLY"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tencent/bugly/proguard/u0$a;
    }
.end annotation


# static fields
.field public static final b:J = -0x2d8fce9aa49d67edL


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

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
.method public a()Lcom/tencent/bugly/proguard/i8;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    .line 4
    .line 5
    new-instance v0, Lcom/tencent/bugly/proguard/u0$a;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, p0}, Lcom/tencent/bugly/proguard/u0$a;-><init>(Ljava/util/concurrent/locks/ReentrantLock;)V

    .line 9
    return-object v0
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method
