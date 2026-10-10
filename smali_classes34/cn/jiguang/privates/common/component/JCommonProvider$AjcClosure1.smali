.class public Lcn/jiguang/privates/common/component/JCommonProvider$AjcClosure1;
.super Lorg/aspectj/runtime/internal/a;
.source "JCommonProvider.java"


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
.end method


# virtual methods
.method public run([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    .line 2
    iget-object p1, p0, Lorg/aspectj/runtime/internal/a;->state:[Ljava/lang/Object;

    .line 3
    const/4 v0, 0x0

    .line 4
    .line 5
    aget-object v0, p1, v0

    .line 6
    move-object v1, v0

    .line 7
    .line 8
    check-cast v1, Lcn/jiguang/privates/common/component/JCommonProvider;

    .line 9
    const/4 v0, 0x1

    .line 10
    .line 11
    aget-object v0, p1, v0

    .line 12
    move-object v2, v0

    .line 13
    .line 14
    check-cast v2, Landroid/net/Uri;

    .line 15
    const/4 v0, 0x2

    .line 16
    .line 17
    aget-object v0, p1, v0

    .line 18
    move-object v3, v0

    .line 19
    .line 20
    check-cast v3, [Ljava/lang/String;

    .line 21
    const/4 v0, 0x3

    .line 22
    .line 23
    aget-object v0, p1, v0

    .line 24
    move-object v4, v0

    .line 25
    .line 26
    check-cast v4, Ljava/lang/String;

    .line 27
    const/4 v0, 0x4

    .line 28
    .line 29
    aget-object v0, p1, v0

    .line 30
    move-object v5, v0

    .line 31
    .line 32
    check-cast v5, [Ljava/lang/String;

    .line 33
    const/4 v0, 0x5

    .line 34
    .line 35
    aget-object v0, p1, v0

    .line 36
    move-object v6, v0

    .line 37
    .line 38
    check-cast v6, Ljava/lang/String;

    .line 39
    const/4 v0, 0x6

    .line 40
    .line 41
    aget-object p1, p1, v0

    .line 42
    move-object v7, p1

    .line 43
    .line 44
    check-cast v7, Lorg/aspectj/lang/a;

    .line 45
    .line 46
    .line 47
    invoke-static/range {v1 .. v7}, Lcn/jiguang/privates/common/component/JCommonProvider;->query_aroundBody0(Lcn/jiguang/privates/common/component/JCommonProvider;Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Lorg/aspectj/lang/a;)Landroid/database/Cursor;

    .line 48
    move-result-object p1

    .line 49
    return-object p1
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
.end method
