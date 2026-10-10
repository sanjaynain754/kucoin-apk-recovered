.class public Lcom/tencent/imsdk/group/GroupMemberOperationResult;
.super Ljava/lang/Object;
.source "GroupMemberOperationResult.java"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field public static OPERATION_RESULT_FAIL:I = 0x1

.field public static OPERATION_RESULT_INVALID:I = 0x3

.field public static OPERATION_RESULT_OVERLIMIT:I = 0x5

.field public static OPERATION_RESULT_PENDING:I = 0x4

.field public static OPERATION_RESULT_SUCCESS:I = 0x2


# instance fields
.field private status:I

.field private userID:Ljava/lang/String;


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
.end method

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
.method public getStatus()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/tencent/imsdk/group/GroupMemberOperationResult;->status:I

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

.method public getUserID()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/imsdk/group/GroupMemberOperationResult;->userID:Ljava/lang/String;

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
