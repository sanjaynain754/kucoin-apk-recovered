.class public Lcom/google/firebase/sessions/SessionLifecycleServiceBinderImpl$AjcClosure1;
.super Lorg/aspectj/runtime/internal/a;
.source "SessionLifecycleServiceBinder.kt"


# direct methods
.method public constructor <init>([Ljava/lang/Object;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1}, Lorg/aspectj/runtime/internal/a;-><init>([Ljava/lang/Object;)V

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
.method public run([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    .line 2
    iget-object p1, p0, Lorg/aspectj/runtime/internal/a;->state:[Ljava/lang/Object;

    .line 3
    const/4 v0, 0x0

    .line 4
    .line 5
    aget-object v0, p1, v0

    .line 6
    .line 7
    check-cast v0, Lcom/google/firebase/sessions/SessionLifecycleServiceBinderImpl;

    .line 8
    const/4 v1, 0x1

    .line 9
    .line 10
    aget-object v1, p1, v1

    .line 11
    .line 12
    check-cast v1, Landroid/os/Messenger;

    .line 13
    const/4 v2, 0x2

    .line 14
    .line 15
    aget-object v2, p1, v2

    .line 16
    .line 17
    check-cast v2, Landroid/content/ServiceConnection;

    .line 18
    const/4 v3, 0x3

    .line 19
    .line 20
    aget-object p1, p1, v3

    .line 21
    .line 22
    check-cast p1, Lorg/aspectj/lang/a;

    .line 23
    .line 24
    .line 25
    invoke-static {v0, v1, v2, p1}, Lcom/google/firebase/sessions/SessionLifecycleServiceBinderImpl;->bindToService_aroundBody0(Lcom/google/firebase/sessions/SessionLifecycleServiceBinderImpl;Landroid/os/Messenger;Landroid/content/ServiceConnection;Lorg/aspectj/lang/a;)V

    .line 26
    const/4 p1, 0x0

    .line 27
    return-object p1
    .line 28
    .line 29
    .line 30
    .line 31
.end method
