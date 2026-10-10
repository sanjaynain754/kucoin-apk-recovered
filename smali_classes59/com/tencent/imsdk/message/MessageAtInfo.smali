.class public Lcom/tencent/imsdk/message/MessageAtInfo;
.super Ljava/lang/Object;
.source "MessageAtInfo.java"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field public static final AT_ALL_TAG:Ljava/lang/String; = "__kImSDK_MesssageAtALL__"


# instance fields
.field private atAll:I

.field private atUserID:Ljava/lang/String;


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
.method public getAtUserID()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/tencent/imsdk/message/MessageAtInfo;->atAll:I

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    const-string v0, "__kImSDK_MesssageAtALL__"

    .line 7
    .line 8
    iput-object v0, p0, Lcom/tencent/imsdk/message/MessageAtInfo;->atUserID:Ljava/lang/String;

    .line 9
    .line 10
    :cond_0
    iget-object v0, p0, Lcom/tencent/imsdk/message/MessageAtInfo;->atUserID:Ljava/lang/String;

    .line 11
    return-object v0
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public setAtUserID(Ljava/lang/String;)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    return-void

    .line 8
    .line 9
    :cond_0
    const-string v0, "__kImSDK_MesssageAtALL__"

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 13
    move-result v0

    .line 14
    .line 15
    if-eqz v0, :cond_1

    .line 16
    const/4 p1, 0x1

    .line 17
    .line 18
    iput p1, p0, Lcom/tencent/imsdk/message/MessageAtInfo;->atAll:I

    .line 19
    return-void

    .line 20
    .line 21
    :cond_1
    iput-object p1, p0, Lcom/tencent/imsdk/message/MessageAtInfo;->atUserID:Ljava/lang/String;

    .line 22
    return-void
    .line 23
    .line 24
    .line 25
.end method
