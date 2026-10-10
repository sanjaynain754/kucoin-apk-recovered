.class public final Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;
.super Ljava/lang/Object;
.source "FuturesGridRunningItemModel.kt"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel$CouponReward;,
        Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel$Transfer;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\t\n\u0002\u0008 \n\u0002\u0010\u0007\n\u0002\u0008\u0012\n\u0002\u0010\u000b\n\u0002\u0008\r\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0003\u0008\u0094\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0087\u0008\u0018\u00002\u00020\u0001:\u0004\u00fa\u0002\u00fb\u0002B\u00e3\u0007\u0012\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0008\u0012\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u0008\u0012\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u0008\u0012\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0008\u0012\n\u0008\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0008\u0012\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\u0008\u0008\u0002\u0010\u0013\u001a\u00020\u0008\u0012\n\u0008\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0012\u0012\n\u0008\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\n\u0008\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0012\u0012\n\u0008\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010 \u001a\u0004\u0018\u00010\u0012\u0012\n\u0008\u0002\u0010!\u001a\u0004\u0018\u00010\u0008\u0012\n\u0008\u0002\u0010\"\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010#\u001a\u0004\u0018\u00010\u0012\u0012\n\u0008\u0002\u0010$\u001a\u0004\u0018\u00010\u0008\u0012\n\u0008\u0002\u0010%\u001a\u0004\u0018\u00010\u0008\u0012\n\u0008\u0002\u0010&\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010\'\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010(\u001a\u0004\u0018\u00010\u0012\u0012\n\u0008\u0002\u0010)\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010*\u001a\u0004\u0018\u00010\u0012\u0012\n\u0008\u0002\u0010+\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010,\u001a\u0004\u0018\u00010\u0012\u0012\n\u0008\u0002\u0010-\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010.\u001a\u0004\u0018\u00010\u0012\u0012\n\u0008\u0002\u0010/\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u00100\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0008\u0002\u00101\u001a\u00020\u0008\u0012\n\u0008\u0002\u00102\u001a\u0004\u0018\u00010\u0012\u0012\n\u0008\u0002\u00103\u001a\u0004\u0018\u00010\u0012\u0012\n\u0008\u0002\u00104\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u00105\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u00106\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u00107\u001a\u0004\u0018\u000108\u0012\n\u0008\u0002\u00109\u001a\u0004\u0018\u000108\u0012\n\u0008\u0002\u0010:\u001a\u0004\u0018\u000108\u0012\n\u0008\u0002\u0010;\u001a\u0004\u0018\u000108\u0012\u0008\u0008\u0002\u0010<\u001a\u00020\u0008\u0012\u0008\u0008\u0002\u0010=\u001a\u00020\u0008\u0012\n\u0008\u0002\u0010>\u001a\u0004\u0018\u00010\u0008\u0012\n\u0008\u0002\u0010?\u001a\u0004\u0018\u00010\u0008\u0012\n\u0008\u0002\u0010@\u001a\u0004\u0018\u00010\u0017\u0012\n\u0008\u0002\u0010A\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010B\u001a\u0004\u0018\u00010\u0008\u0012\n\u0008\u0002\u0010C\u001a\u0004\u0018\u00010\u0008\u0012\n\u0008\u0002\u0010D\u001a\u0004\u0018\u00010\u0008\u0012\n\u0008\u0002\u0010E\u001a\u0004\u0018\u00010\u0012\u0012\n\u0008\u0002\u0010F\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010G\u001a\u0004\u0018\u00010\u0017\u0012\n\u0008\u0002\u0010H\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010I\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010J\u001a\u0004\u0018\u00010K\u0012\n\u0008\u0002\u0010L\u001a\u0004\u0018\u00010K\u0012\n\u0008\u0002\u0010M\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010N\u001a\u0004\u0018\u00010\u0017\u0012\n\u0008\u0002\u0010O\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010P\u001a\u0004\u0018\u00010\u0012\u0012\n\u0008\u0002\u0010Q\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010R\u001a\u0004\u0018\u00010\u0012\u0012\n\u0008\u0002\u0010S\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010T\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010U\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010V\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010W\u001a\u0004\u0018\u00010\u0003\u0012\u0010\u0008\u0002\u0010X\u001a\n\u0012\u0004\u0012\u00020Z\u0018\u00010Y\u0012\u0008\u0008\u0002\u0010[\u001a\u00020\u0008\u0012\n\u0008\u0002\u0010\\\u001a\u0004\u0018\u00010]\u00a2\u0006\u0004\u0008^\u0010_J\u000c\u0010\u009a\u0002\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000c\u0010\u009b\u0002\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000c\u0010\u009c\u0002\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000c\u0010\u009d\u0002\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\n\u0010\u009e\u0002\u001a\u00020\u0008H\u00c6\u0003J\u000c\u0010\u009f\u0002\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000c\u0010\u00a0\u0002\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0011\u0010\u00a1\u0002\u001a\u0004\u0018\u00010\u0008H\u00c6\u0003\u00a2\u0006\u0002\u0010sJ\n\u0010\u00a2\u0002\u001a\u00020\u0008H\u00c6\u0003J\u0011\u0010\u00a3\u0002\u001a\u0004\u0018\u00010\u0008H\u00c6\u0003\u00a2\u0006\u0002\u0010sJ\u0011\u0010\u00a4\u0002\u001a\u0004\u0018\u00010\u0008H\u00c6\u0003\u00a2\u0006\u0002\u0010sJ\u0011\u0010\u00a5\u0002\u001a\u0004\u0018\u00010\u0008H\u00c6\u0003\u00a2\u0006\u0002\u0010sJ\u000c\u0010\u00a6\u0002\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000c\u0010\u00a7\u0002\u001a\u0004\u0018\u00010\u0012H\u00c6\u0003J\n\u0010\u00a8\u0002\u001a\u00020\u0008H\u00c6\u0003J\u000c\u0010\u00a9\u0002\u001a\u0004\u0018\u00010\u0012H\u00c6\u0003J\u000c\u0010\u00aa\u0002\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0012\u0010\u00ab\u0002\u001a\u0004\u0018\u00010\u0017H\u00c6\u0003\u00a2\u0006\u0003\u0010\u008c\u0001J\u000c\u0010\u00ac\u0002\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000c\u0010\u00ad\u0002\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000c\u0010\u00ae\u0002\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000c\u0010\u00af\u0002\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000c\u0010\u00b0\u0002\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000c\u0010\u00b1\u0002\u001a\u0004\u0018\u00010\u0012H\u00c6\u0003J\u000c\u0010\u00b2\u0002\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000c\u0010\u00b3\u0002\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000c\u0010\u00b4\u0002\u001a\u0004\u0018\u00010\u0012H\u00c6\u0003J\u0011\u0010\u00b5\u0002\u001a\u0004\u0018\u00010\u0008H\u00c6\u0003\u00a2\u0006\u0002\u0010sJ\u000c\u0010\u00b6\u0002\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000c\u0010\u00b7\u0002\u001a\u0004\u0018\u00010\u0012H\u00c6\u0003J\u0011\u0010\u00b8\u0002\u001a\u0004\u0018\u00010\u0008H\u00c6\u0003\u00a2\u0006\u0002\u0010sJ\u0011\u0010\u00b9\u0002\u001a\u0004\u0018\u00010\u0008H\u00c6\u0003\u00a2\u0006\u0002\u0010sJ\u000c\u0010\u00ba\u0002\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000c\u0010\u00bb\u0002\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000c\u0010\u00bc\u0002\u001a\u0004\u0018\u00010\u0012H\u00c6\u0003J\u000c\u0010\u00bd\u0002\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000c\u0010\u00be\u0002\u001a\u0004\u0018\u00010\u0012H\u00c6\u0003J\u000c\u0010\u00bf\u0002\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000c\u0010\u00c0\u0002\u001a\u0004\u0018\u00010\u0012H\u00c6\u0003J\u000c\u0010\u00c1\u0002\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000c\u0010\u00c2\u0002\u001a\u0004\u0018\u00010\u0012H\u00c6\u0003J\u000c\u0010\u00c3\u0002\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0011\u0010\u00c4\u0002\u001a\u0004\u0018\u00010\u0008H\u00c6\u0003\u00a2\u0006\u0002\u0010sJ\n\u0010\u00c5\u0002\u001a\u00020\u0008H\u00c6\u0003J\u000c\u0010\u00c6\u0002\u001a\u0004\u0018\u00010\u0012H\u00c6\u0003J\u000c\u0010\u00c7\u0002\u001a\u0004\u0018\u00010\u0012H\u00c6\u0003J\u000c\u0010\u00c8\u0002\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000c\u0010\u00c9\u0002\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000c\u0010\u00ca\u0002\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0012\u0010\u00cb\u0002\u001a\u0004\u0018\u000108H\u00c6\u0003\u00a2\u0006\u0003\u0010\u00cf\u0001J\u0012\u0010\u00cc\u0002\u001a\u0004\u0018\u000108H\u00c6\u0003\u00a2\u0006\u0003\u0010\u00cf\u0001J\u0012\u0010\u00cd\u0002\u001a\u0004\u0018\u000108H\u00c6\u0003\u00a2\u0006\u0003\u0010\u00cf\u0001J\u0012\u0010\u00ce\u0002\u001a\u0004\u0018\u000108H\u00c6\u0003\u00a2\u0006\u0003\u0010\u00cf\u0001J\n\u0010\u00cf\u0002\u001a\u00020\u0008H\u00c6\u0003J\n\u0010\u00d0\u0002\u001a\u00020\u0008H\u00c6\u0003J\u0011\u0010\u00d1\u0002\u001a\u0004\u0018\u00010\u0008H\u00c6\u0003\u00a2\u0006\u0002\u0010sJ\u0011\u0010\u00d2\u0002\u001a\u0004\u0018\u00010\u0008H\u00c6\u0003\u00a2\u0006\u0002\u0010sJ\u0012\u0010\u00d3\u0002\u001a\u0004\u0018\u00010\u0017H\u00c6\u0003\u00a2\u0006\u0003\u0010\u008c\u0001J\u000c\u0010\u00d4\u0002\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0011\u0010\u00d5\u0002\u001a\u0004\u0018\u00010\u0008H\u00c6\u0003\u00a2\u0006\u0002\u0010sJ\u0011\u0010\u00d6\u0002\u001a\u0004\u0018\u00010\u0008H\u00c6\u0003\u00a2\u0006\u0002\u0010sJ\u0011\u0010\u00d7\u0002\u001a\u0004\u0018\u00010\u0008H\u00c6\u0003\u00a2\u0006\u0002\u0010sJ\u000c\u0010\u00d8\u0002\u001a\u0004\u0018\u00010\u0012H\u00c6\u0003J\u000c\u0010\u00d9\u0002\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0012\u0010\u00da\u0002\u001a\u0004\u0018\u00010\u0017H\u00c6\u0003\u00a2\u0006\u0003\u0010\u008c\u0001J\u000c\u0010\u00db\u0002\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000c\u0010\u00dc\u0002\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0012\u0010\u00dd\u0002\u001a\u0004\u0018\u00010KH\u00c6\u0003\u00a2\u0006\u0003\u0010\u00f5\u0001J\u0012\u0010\u00de\u0002\u001a\u0004\u0018\u00010KH\u00c6\u0003\u00a2\u0006\u0003\u0010\u00f5\u0001J\u000c\u0010\u00df\u0002\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0012\u0010\u00e0\u0002\u001a\u0004\u0018\u00010\u0017H\u00c6\u0003\u00a2\u0006\u0003\u0010\u008c\u0001J\u000c\u0010\u00e1\u0002\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000c\u0010\u00e2\u0002\u001a\u0004\u0018\u00010\u0012H\u00c6\u0003J\u000c\u0010\u00e3\u0002\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000c\u0010\u00e4\u0002\u001a\u0004\u0018\u00010\u0012H\u00c6\u0003J\u000c\u0010\u00e5\u0002\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000c\u0010\u00e6\u0002\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000c\u0010\u00e7\u0002\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000c\u0010\u00e8\u0002\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000c\u0010\u00e9\u0002\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0012\u0010\u00ea\u0002\u001a\n\u0012\u0004\u0012\u00020Z\u0018\u00010YH\u00c6\u0003J\n\u0010\u00eb\u0002\u001a\u00020\u0008H\u00c6\u0003J\u000c\u0010\u00ec\u0002\u001a\u0004\u0018\u00010]H\u00c6\u0003J\u00ec\u0007\u0010\u00ed\u0002\u001a\u00020\u00002\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00082\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00082\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u00082\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u00082\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00082\n\u0008\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00082\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0008\u0008\u0002\u0010\u0013\u001a\u00020\u00082\n\u0008\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00122\n\u0008\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\u0008\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00122\n\u0008\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010 \u001a\u0004\u0018\u00010\u00122\n\u0008\u0002\u0010!\u001a\u0004\u0018\u00010\u00082\n\u0008\u0002\u0010\"\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010#\u001a\u0004\u0018\u00010\u00122\n\u0008\u0002\u0010$\u001a\u0004\u0018\u00010\u00082\n\u0008\u0002\u0010%\u001a\u0004\u0018\u00010\u00082\n\u0008\u0002\u0010&\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\'\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010(\u001a\u0004\u0018\u00010\u00122\n\u0008\u0002\u0010)\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010*\u001a\u0004\u0018\u00010\u00122\n\u0008\u0002\u0010+\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010,\u001a\u0004\u0018\u00010\u00122\n\u0008\u0002\u0010-\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010.\u001a\u0004\u0018\u00010\u00122\n\u0008\u0002\u0010/\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u00100\u001a\u0004\u0018\u00010\u00082\u0008\u0008\u0002\u00101\u001a\u00020\u00082\n\u0008\u0002\u00102\u001a\u0004\u0018\u00010\u00122\n\u0008\u0002\u00103\u001a\u0004\u0018\u00010\u00122\n\u0008\u0002\u00104\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u00105\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u00106\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u00107\u001a\u0004\u0018\u0001082\n\u0008\u0002\u00109\u001a\u0004\u0018\u0001082\n\u0008\u0002\u0010:\u001a\u0004\u0018\u0001082\n\u0008\u0002\u0010;\u001a\u0004\u0018\u0001082\u0008\u0008\u0002\u0010<\u001a\u00020\u00082\u0008\u0008\u0002\u0010=\u001a\u00020\u00082\n\u0008\u0002\u0010>\u001a\u0004\u0018\u00010\u00082\n\u0008\u0002\u0010?\u001a\u0004\u0018\u00010\u00082\n\u0008\u0002\u0010@\u001a\u0004\u0018\u00010\u00172\n\u0008\u0002\u0010A\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010B\u001a\u0004\u0018\u00010\u00082\n\u0008\u0002\u0010C\u001a\u0004\u0018\u00010\u00082\n\u0008\u0002\u0010D\u001a\u0004\u0018\u00010\u00082\n\u0008\u0002\u0010E\u001a\u0004\u0018\u00010\u00122\n\u0008\u0002\u0010F\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010G\u001a\u0004\u0018\u00010\u00172\n\u0008\u0002\u0010H\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010I\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010J\u001a\u0004\u0018\u00010K2\n\u0008\u0002\u0010L\u001a\u0004\u0018\u00010K2\n\u0008\u0002\u0010M\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010N\u001a\u0004\u0018\u00010\u00172\n\u0008\u0002\u0010O\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010P\u001a\u0004\u0018\u00010\u00122\n\u0008\u0002\u0010Q\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010R\u001a\u0004\u0018\u00010\u00122\n\u0008\u0002\u0010S\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010T\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010U\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010V\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010W\u001a\u0004\u0018\u00010\u00032\u0010\u0008\u0002\u0010X\u001a\n\u0012\u0004\u0012\u00020Z\u0018\u00010Y2\u0008\u0008\u0002\u0010[\u001a\u00020\u00082\n\u0008\u0002\u0010\\\u001a\u0004\u0018\u00010]H\u00c6\u0001\u00a2\u0006\u0003\u0010\u00ee\u0002J\u0007\u0010\u00ef\u0002\u001a\u00020\u0008J\u0016\u0010\u00f0\u0002\u001a\u00020K2\n\u0010\u00f1\u0002\u001a\u0005\u0018\u00010\u00f2\u0002H\u00d6\u0003J\n\u0010\u00f3\u0002\u001a\u00020\u0008H\u00d6\u0001J\n\u0010\u00f4\u0002\u001a\u00020\u0003H\u00d6\u0001J\u001b\u0010\u00f5\u0002\u001a\u00030\u00f6\u00022\u0008\u0010\u00f7\u0002\u001a\u00030\u00f8\u00022\u0007\u0010\u00f9\u0002\u001a\u00020\u0008R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008`\u0010a\"\u0004\u0008b\u0010cR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008d\u0010a\"\u0004\u0008e\u0010cR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008f\u0010a\"\u0004\u0008g\u0010cR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008h\u0010a\"\u0004\u0008i\u0010cR\u001a\u0010\u0007\u001a\u00020\u0008X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008j\u0010k\"\u0004\u0008l\u0010mR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008n\u0010a\"\u0004\u0008o\u0010cR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008p\u0010a\"\u0004\u0008q\u0010cR\u001e\u0010\u000b\u001a\u0004\u0018\u00010\u0008X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010v\u001a\u0004\u0008r\u0010s\"\u0004\u0008t\u0010uR\u001a\u0010\u000c\u001a\u00020\u0008X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008w\u0010k\"\u0004\u0008x\u0010mR\u001e\u0010\r\u001a\u0004\u0018\u00010\u0008X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010v\u001a\u0004\u0008y\u0010s\"\u0004\u0008z\u0010uR\u001e\u0010\u000e\u001a\u0004\u0018\u00010\u0008X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010v\u001a\u0004\u0008{\u0010s\"\u0004\u0008|\u0010uR\u001e\u0010\u000f\u001a\u0004\u0018\u00010\u0008X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010v\u001a\u0004\u0008}\u0010s\"\u0004\u0008~\u0010uR\u001d\u0010\u0010\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000f\n\u0000\u001a\u0004\u0008\u007f\u0010a\"\u0005\u0008\u0080\u0001\u0010cR \u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0086\u000e\u00a2\u0006\u0012\n\u0000\u001a\u0006\u0008\u0081\u0001\u0010\u0082\u0001\"\u0006\u0008\u0083\u0001\u0010\u0084\u0001R\u001c\u0010\u0013\u001a\u00020\u0008X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\u0008\u0085\u0001\u0010k\"\u0005\u0008\u0086\u0001\u0010mR \u0010\u0014\u001a\u0004\u0018\u00010\u0012X\u0086\u000e\u00a2\u0006\u0012\n\u0000\u001a\u0006\u0008\u0087\u0001\u0010\u0082\u0001\"\u0006\u0008\u0088\u0001\u0010\u0084\u0001R\u001e\u0010\u0015\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\u0008\u0089\u0001\u0010a\"\u0005\u0008\u008a\u0001\u0010cR#\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0086\u000e\u00a2\u0006\u0015\n\u0003\u0010\u008f\u0001\u001a\u0006\u0008\u008b\u0001\u0010\u008c\u0001\"\u0006\u0008\u008d\u0001\u0010\u008e\u0001R\u001e\u0010\u0018\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\u0008\u0090\u0001\u0010a\"\u0005\u0008\u0091\u0001\u0010cR\u001e\u0010\u0019\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\u0008\u0092\u0001\u0010a\"\u0005\u0008\u0093\u0001\u0010cR\u001e\u0010\u001a\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\u0008\u0094\u0001\u0010a\"\u0005\u0008\u0095\u0001\u0010cR\u001e\u0010\u001b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\u0008\u0096\u0001\u0010a\"\u0005\u0008\u0097\u0001\u0010cR\u001e\u0010\u001c\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\u0008\u0098\u0001\u0010a\"\u0005\u0008\u0099\u0001\u0010cR \u0010\u001d\u001a\u0004\u0018\u00010\u0012X\u0086\u000e\u00a2\u0006\u0012\n\u0000\u001a\u0006\u0008\u009a\u0001\u0010\u0082\u0001\"\u0006\u0008\u009b\u0001\u0010\u0084\u0001R\u001e\u0010\u001e\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\u0008\u009c\u0001\u0010a\"\u0005\u0008\u009d\u0001\u0010cR\u001e\u0010\u001f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\u0008\u009e\u0001\u0010a\"\u0005\u0008\u009f\u0001\u0010cR \u0010 \u001a\u0004\u0018\u00010\u0012X\u0086\u000e\u00a2\u0006\u0012\n\u0000\u001a\u0006\u0008\u00a0\u0001\u0010\u0082\u0001\"\u0006\u0008\u00a1\u0001\u0010\u0084\u0001R \u0010!\u001a\u0004\u0018\u00010\u0008X\u0086\u000e\u00a2\u0006\u0012\n\u0002\u0010v\u001a\u0005\u0008\u00a2\u0001\u0010s\"\u0005\u0008\u00a3\u0001\u0010uR\u001e\u0010\"\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\u0008\u00a4\u0001\u0010a\"\u0005\u0008\u00a5\u0001\u0010cR \u0010#\u001a\u0004\u0018\u00010\u0012X\u0086\u000e\u00a2\u0006\u0012\n\u0000\u001a\u0006\u0008\u00a6\u0001\u0010\u0082\u0001\"\u0006\u0008\u00a7\u0001\u0010\u0084\u0001R \u0010$\u001a\u0004\u0018\u00010\u0008X\u0086\u000e\u00a2\u0006\u0012\n\u0002\u0010v\u001a\u0005\u0008\u00a8\u0001\u0010s\"\u0005\u0008\u00a9\u0001\u0010uR \u0010%\u001a\u0004\u0018\u00010\u0008X\u0086\u000e\u00a2\u0006\u0012\n\u0002\u0010v\u001a\u0005\u0008\u00aa\u0001\u0010s\"\u0005\u0008\u00ab\u0001\u0010uR\u001e\u0010&\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\u0008\u00ac\u0001\u0010a\"\u0005\u0008\u00ad\u0001\u0010cR\u001e\u0010\'\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\u0008\u00ae\u0001\u0010a\"\u0005\u0008\u00af\u0001\u0010cR \u0010(\u001a\u0004\u0018\u00010\u0012X\u0086\u000e\u00a2\u0006\u0012\n\u0000\u001a\u0006\u0008\u00b0\u0001\u0010\u0082\u0001\"\u0006\u0008\u00b1\u0001\u0010\u0084\u0001R\u001e\u0010)\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\u0008\u00b2\u0001\u0010a\"\u0005\u0008\u00b3\u0001\u0010cR \u0010*\u001a\u0004\u0018\u00010\u0012X\u0086\u000e\u00a2\u0006\u0012\n\u0000\u001a\u0006\u0008\u00b4\u0001\u0010\u0082\u0001\"\u0006\u0008\u00b5\u0001\u0010\u0084\u0001R\u001e\u0010+\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\u0008\u00b6\u0001\u0010a\"\u0005\u0008\u00b7\u0001\u0010cR \u0010,\u001a\u0004\u0018\u00010\u0012X\u0086\u000e\u00a2\u0006\u0012\n\u0000\u001a\u0006\u0008\u00b8\u0001\u0010\u0082\u0001\"\u0006\u0008\u00b9\u0001\u0010\u0084\u0001R\u001e\u0010-\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\u0008\u00ba\u0001\u0010a\"\u0005\u0008\u00bb\u0001\u0010cR \u0010.\u001a\u0004\u0018\u00010\u0012X\u0086\u000e\u00a2\u0006\u0012\n\u0000\u001a\u0006\u0008\u00bc\u0001\u0010\u0082\u0001\"\u0006\u0008\u00bd\u0001\u0010\u0084\u0001R\u001e\u0010/\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\u0008\u00be\u0001\u0010a\"\u0005\u0008\u00bf\u0001\u0010cR \u00100\u001a\u0004\u0018\u00010\u0008X\u0086\u000e\u00a2\u0006\u0012\n\u0002\u0010v\u001a\u0005\u0008\u00c0\u0001\u0010s\"\u0005\u0008\u00c1\u0001\u0010uR\u001c\u00101\u001a\u00020\u0008X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\u0008\u00c2\u0001\u0010k\"\u0005\u0008\u00c3\u0001\u0010mR \u00102\u001a\u0004\u0018\u00010\u0012X\u0086\u000e\u00a2\u0006\u0012\n\u0000\u001a\u0006\u0008\u00c4\u0001\u0010\u0082\u0001\"\u0006\u0008\u00c5\u0001\u0010\u0084\u0001R \u00103\u001a\u0004\u0018\u00010\u0012X\u0086\u000e\u00a2\u0006\u0012\n\u0000\u001a\u0006\u0008\u00c6\u0001\u0010\u0082\u0001\"\u0006\u0008\u00c7\u0001\u0010\u0084\u0001R\u001e\u00104\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\u0008\u00c8\u0001\u0010a\"\u0005\u0008\u00c9\u0001\u0010cR\u001e\u00105\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\u0008\u00ca\u0001\u0010a\"\u0005\u0008\u00cb\u0001\u0010cR\u001e\u00106\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\u0008\u00cc\u0001\u0010a\"\u0005\u0008\u00cd\u0001\u0010cR#\u00107\u001a\u0004\u0018\u000108X\u0086\u000e\u00a2\u0006\u0015\n\u0003\u0010\u00d2\u0001\u001a\u0006\u0008\u00ce\u0001\u0010\u00cf\u0001\"\u0006\u0008\u00d0\u0001\u0010\u00d1\u0001R#\u00109\u001a\u0004\u0018\u000108X\u0086\u000e\u00a2\u0006\u0015\n\u0003\u0010\u00d2\u0001\u001a\u0006\u0008\u00d3\u0001\u0010\u00cf\u0001\"\u0006\u0008\u00d4\u0001\u0010\u00d1\u0001R#\u0010:\u001a\u0004\u0018\u000108X\u0086\u000e\u00a2\u0006\u0015\n\u0003\u0010\u00d2\u0001\u001a\u0006\u0008\u00d5\u0001\u0010\u00cf\u0001\"\u0006\u0008\u00d6\u0001\u0010\u00d1\u0001R#\u0010;\u001a\u0004\u0018\u000108X\u0086\u000e\u00a2\u0006\u0015\n\u0003\u0010\u00d2\u0001\u001a\u0006\u0008\u00d7\u0001\u0010\u00cf\u0001\"\u0006\u0008\u00d8\u0001\u0010\u00d1\u0001R\u001c\u0010<\u001a\u00020\u0008X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\u0008\u00d9\u0001\u0010k\"\u0005\u0008\u00da\u0001\u0010mR\u001c\u0010=\u001a\u00020\u0008X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\u0008\u00db\u0001\u0010k\"\u0005\u0008\u00dc\u0001\u0010mR \u0010>\u001a\u0004\u0018\u00010\u0008X\u0086\u000e\u00a2\u0006\u0012\n\u0002\u0010v\u001a\u0005\u0008\u00dd\u0001\u0010s\"\u0005\u0008\u00de\u0001\u0010uR \u0010?\u001a\u0004\u0018\u00010\u0008X\u0086\u000e\u00a2\u0006\u0012\n\u0002\u0010v\u001a\u0005\u0008\u00df\u0001\u0010s\"\u0005\u0008\u00e0\u0001\u0010uR#\u0010@\u001a\u0004\u0018\u00010\u0017X\u0086\u000e\u00a2\u0006\u0015\n\u0003\u0010\u008f\u0001\u001a\u0006\u0008\u00e1\u0001\u0010\u008c\u0001\"\u0006\u0008\u00e2\u0001\u0010\u008e\u0001R\u001e\u0010A\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\u0008\u00e3\u0001\u0010a\"\u0005\u0008\u00e4\u0001\u0010cR \u0010B\u001a\u0004\u0018\u00010\u0008X\u0086\u000e\u00a2\u0006\u0012\n\u0002\u0010v\u001a\u0005\u0008\u00e5\u0001\u0010s\"\u0005\u0008\u00e6\u0001\u0010uR \u0010C\u001a\u0004\u0018\u00010\u0008X\u0086\u000e\u00a2\u0006\u0012\n\u0002\u0010v\u001a\u0005\u0008\u00e7\u0001\u0010s\"\u0005\u0008\u00e8\u0001\u0010uR \u0010D\u001a\u0004\u0018\u00010\u0008X\u0086\u000e\u00a2\u0006\u0012\n\u0002\u0010v\u001a\u0005\u0008\u00e9\u0001\u0010s\"\u0005\u0008\u00ea\u0001\u0010uR \u0010E\u001a\u0004\u0018\u00010\u0012X\u0086\u000e\u00a2\u0006\u0012\n\u0000\u001a\u0006\u0008\u00eb\u0001\u0010\u0082\u0001\"\u0006\u0008\u00ec\u0001\u0010\u0084\u0001R\u001e\u0010F\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\u0008\u00ed\u0001\u0010a\"\u0005\u0008\u00ee\u0001\u0010cR#\u0010G\u001a\u0004\u0018\u00010\u0017X\u0086\u000e\u00a2\u0006\u0015\n\u0003\u0010\u008f\u0001\u001a\u0006\u0008\u00ef\u0001\u0010\u008c\u0001\"\u0006\u0008\u00f0\u0001\u0010\u008e\u0001R\u001e\u0010H\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\u0008\u00f1\u0001\u0010a\"\u0005\u0008\u00f2\u0001\u0010cR\u001e\u0010I\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\u0008\u00f3\u0001\u0010a\"\u0005\u0008\u00f4\u0001\u0010cR\"\u0010J\u001a\u0004\u0018\u00010KX\u0086\u000e\u00a2\u0006\u0014\n\u0003\u0010\u00f8\u0001\u001a\u0005\u0008J\u0010\u00f5\u0001\"\u0006\u0008\u00f6\u0001\u0010\u00f7\u0001R\"\u0010L\u001a\u0004\u0018\u00010KX\u0086\u000e\u00a2\u0006\u0014\n\u0003\u0010\u00f8\u0001\u001a\u0005\u0008L\u0010\u00f5\u0001\"\u0006\u0008\u00f9\u0001\u0010\u00f7\u0001R\u001e\u0010M\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\u0008\u00fa\u0001\u0010a\"\u0005\u0008\u00fb\u0001\u0010cR#\u0010N\u001a\u0004\u0018\u00010\u0017X\u0086\u000e\u00a2\u0006\u0015\n\u0003\u0010\u008f\u0001\u001a\u0006\u0008\u00fc\u0001\u0010\u008c\u0001\"\u0006\u0008\u00fd\u0001\u0010\u008e\u0001R\u001e\u0010O\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\u0008\u00fe\u0001\u0010a\"\u0005\u0008\u00ff\u0001\u0010cR \u0010P\u001a\u0004\u0018\u00010\u0012X\u0086\u000e\u00a2\u0006\u0012\n\u0000\u001a\u0006\u0008\u0080\u0002\u0010\u0082\u0001\"\u0006\u0008\u0081\u0002\u0010\u0084\u0001R\u001e\u0010Q\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\u0008\u0082\u0002\u0010a\"\u0005\u0008\u0083\u0002\u0010cR \u0010R\u001a\u0004\u0018\u00010\u0012X\u0086\u000e\u00a2\u0006\u0012\n\u0000\u001a\u0006\u0008\u0084\u0002\u0010\u0082\u0001\"\u0006\u0008\u0085\u0002\u0010\u0084\u0001R\u001e\u0010S\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\u0008\u0086\u0002\u0010a\"\u0005\u0008\u0087\u0002\u0010cR\u001e\u0010T\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\u0008\u0088\u0002\u0010a\"\u0005\u0008\u0089\u0002\u0010cR\u001e\u0010U\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\u0008\u008a\u0002\u0010a\"\u0005\u0008\u008b\u0002\u0010cR\u001e\u0010V\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\u0008\u008c\u0002\u0010a\"\u0005\u0008\u008d\u0002\u0010cR\u001e\u0010W\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\u0008\u008e\u0002\u0010a\"\u0005\u0008\u008f\u0002\u0010cR&\u0010X\u001a\n\u0012\u0004\u0012\u00020Z\u0018\u00010YX\u0086\u000e\u00a2\u0006\u0012\n\u0000\u001a\u0006\u0008\u0090\u0002\u0010\u0091\u0002\"\u0006\u0008\u0092\u0002\u0010\u0093\u0002R\u001c\u0010[\u001a\u00020\u0008X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\u0008\u0094\u0002\u0010k\"\u0005\u0008\u0095\u0002\u0010mR \u0010\\\u001a\u0004\u0018\u00010]X\u0086\u000e\u00a2\u0006\u0012\n\u0000\u001a\u0006\u0008\u0096\u0002\u0010\u0097\u0002\"\u0006\u0008\u0098\u0002\u0010\u0099\u0002\u00a8\u0006\u00fc\u0002"
    }
    d2 = {
        "Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;",
        "Landroid/os/Parcelable;",
        "symbolName",
        "",
        "symbolCode",
        "direction",
        "directionCode",
        "directionVisible",
        "",
        "leverageValue",
        "leverage",
        "leverageBgColor",
        "leverageVisible",
        "centerContentBgColor",
        "leverageTextColor",
        "directionBgColor",
        "lastPrice",
        "lastPriceValue",
        "Ljava/math/BigDecimal;",
        "lastPriceVisible",
        "liquidationPriceValue",
        "liquidationPrice",
        "runningTimeValue",
        "",
        "runningTime",
        "quoteCode",
        "quoteName",
        "totalInvestText",
        "totalInvest",
        "totalInvestValue",
        "totalProfitText",
        "totalProfit",
        "totalProfitValue",
        "totalProfitColor",
        "totalProfitRate",
        "totalProfitRateValue",
        "dayArbitrageNum",
        "totalArbitrageNum",
        "arbitrage",
        "gridProfit",
        "gridProfitValue",
        "floatAmount",
        "floatAmountValue",
        "fundingFee",
        "fundingFeeValue",
        "entryPrice",
        "entryPriceValue",
        "priceRange",
        "priceRangeColor",
        "outPriceRange",
        "priceStart",
        "priceEnd",
        "pendingOrder",
        "buyNumber",
        "sellNumber",
        "buyNumberWidget",
        "",
        "sellNumberWidget",
        "splitWidget",
        "weightSum",
        "pendingOrderNumberSellColor",
        "pendingOrderNumberBuyColor",
        "buyNumberBg",
        "sellNumberBg",
        "taskId",
        "runningStatus",
        "viewType",
        "pricePrecision",
        "profitPrecision",
        "openUnitPriceValue",
        "openUnitPrice",
        "endTime",
        "loadingString",
        "notTradingOrderPrice",
        "isOpenUnit",
        "",
        "isRisk",
        "futuresGridProtectionTip",
        "riskLimitTimeValue",
        "riskLimitTime",
        "stopLossPriceValue",
        "stopLossPrice",
        "stopProfitPriceValue",
        "stopProfitPrice",
        "stopReason",
        "stopPriceText",
        "stopPriceNumber",
        "stopReasonDetail",
        "transfers",
        "",
        "Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel$Transfer;",
        "totalInvestVisible",
        "couponReward",
        "Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel$CouponReward;",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/math/BigDecimal;ILjava/math/BigDecimal;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/Integer;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/Integer;ILjava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;IILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ILcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel$CouponReward;)V",
        "getSymbolName",
        "()Ljava/lang/String;",
        "setSymbolName",
        "(Ljava/lang/String;)V",
        "getSymbolCode",
        "setSymbolCode",
        "getDirection",
        "setDirection",
        "getDirectionCode",
        "setDirectionCode",
        "getDirectionVisible",
        "()I",
        "setDirectionVisible",
        "(I)V",
        "getLeverageValue",
        "setLeverageValue",
        "getLeverage",
        "setLeverage",
        "getLeverageBgColor",
        "()Ljava/lang/Integer;",
        "setLeverageBgColor",
        "(Ljava/lang/Integer;)V",
        "Ljava/lang/Integer;",
        "getLeverageVisible",
        "setLeverageVisible",
        "getCenterContentBgColor",
        "setCenterContentBgColor",
        "getLeverageTextColor",
        "setLeverageTextColor",
        "getDirectionBgColor",
        "setDirectionBgColor",
        "getLastPrice",
        "setLastPrice",
        "getLastPriceValue",
        "()Ljava/math/BigDecimal;",
        "setLastPriceValue",
        "(Ljava/math/BigDecimal;)V",
        "getLastPriceVisible",
        "setLastPriceVisible",
        "getLiquidationPriceValue",
        "setLiquidationPriceValue",
        "getLiquidationPrice",
        "setLiquidationPrice",
        "getRunningTimeValue",
        "()Ljava/lang/Long;",
        "setRunningTimeValue",
        "(Ljava/lang/Long;)V",
        "Ljava/lang/Long;",
        "getRunningTime",
        "setRunningTime",
        "getQuoteCode",
        "setQuoteCode",
        "getQuoteName",
        "setQuoteName",
        "getTotalInvestText",
        "setTotalInvestText",
        "getTotalInvest",
        "setTotalInvest",
        "getTotalInvestValue",
        "setTotalInvestValue",
        "getTotalProfitText",
        "setTotalProfitText",
        "getTotalProfit",
        "setTotalProfit",
        "getTotalProfitValue",
        "setTotalProfitValue",
        "getTotalProfitColor",
        "setTotalProfitColor",
        "getTotalProfitRate",
        "setTotalProfitRate",
        "getTotalProfitRateValue",
        "setTotalProfitRateValue",
        "getDayArbitrageNum",
        "setDayArbitrageNum",
        "getTotalArbitrageNum",
        "setTotalArbitrageNum",
        "getArbitrage",
        "setArbitrage",
        "getGridProfit",
        "setGridProfit",
        "getGridProfitValue",
        "setGridProfitValue",
        "getFloatAmount",
        "setFloatAmount",
        "getFloatAmountValue",
        "setFloatAmountValue",
        "getFundingFee",
        "setFundingFee",
        "getFundingFeeValue",
        "setFundingFeeValue",
        "getEntryPrice",
        "setEntryPrice",
        "getEntryPriceValue",
        "setEntryPriceValue",
        "getPriceRange",
        "setPriceRange",
        "getPriceRangeColor",
        "setPriceRangeColor",
        "getOutPriceRange",
        "setOutPriceRange",
        "getPriceStart",
        "setPriceStart",
        "getPriceEnd",
        "setPriceEnd",
        "getPendingOrder",
        "setPendingOrder",
        "getBuyNumber",
        "setBuyNumber",
        "getSellNumber",
        "setSellNumber",
        "getBuyNumberWidget",
        "()Ljava/lang/Float;",
        "setBuyNumberWidget",
        "(Ljava/lang/Float;)V",
        "Ljava/lang/Float;",
        "getSellNumberWidget",
        "setSellNumberWidget",
        "getSplitWidget",
        "setSplitWidget",
        "getWeightSum",
        "setWeightSum",
        "getPendingOrderNumberSellColor",
        "setPendingOrderNumberSellColor",
        "getPendingOrderNumberBuyColor",
        "setPendingOrderNumberBuyColor",
        "getBuyNumberBg",
        "setBuyNumberBg",
        "getSellNumberBg",
        "setSellNumberBg",
        "getTaskId",
        "setTaskId",
        "getRunningStatus",
        "setRunningStatus",
        "getViewType",
        "setViewType",
        "getPricePrecision",
        "setPricePrecision",
        "getProfitPrecision",
        "setProfitPrecision",
        "getOpenUnitPriceValue",
        "setOpenUnitPriceValue",
        "getOpenUnitPrice",
        "setOpenUnitPrice",
        "getEndTime",
        "setEndTime",
        "getLoadingString",
        "setLoadingString",
        "getNotTradingOrderPrice",
        "setNotTradingOrderPrice",
        "()Ljava/lang/Boolean;",
        "setOpenUnit",
        "(Ljava/lang/Boolean;)V",
        "Ljava/lang/Boolean;",
        "setRisk",
        "getFuturesGridProtectionTip",
        "setFuturesGridProtectionTip",
        "getRiskLimitTimeValue",
        "setRiskLimitTimeValue",
        "getRiskLimitTime",
        "setRiskLimitTime",
        "getStopLossPriceValue",
        "setStopLossPriceValue",
        "getStopLossPrice",
        "setStopLossPrice",
        "getStopProfitPriceValue",
        "setStopProfitPriceValue",
        "getStopProfitPrice",
        "setStopProfitPrice",
        "getStopReason",
        "setStopReason",
        "getStopPriceText",
        "setStopPriceText",
        "getStopPriceNumber",
        "setStopPriceNumber",
        "getStopReasonDetail",
        "setStopReasonDetail",
        "getTransfers",
        "()Ljava/util/List;",
        "setTransfers",
        "(Ljava/util/List;)V",
        "getTotalInvestVisible",
        "setTotalInvestVisible",
        "getCouponReward",
        "()Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel$CouponReward;",
        "setCouponReward",
        "(Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel$CouponReward;)V",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "component9",
        "component10",
        "component11",
        "component12",
        "component13",
        "component14",
        "component15",
        "component16",
        "component17",
        "component18",
        "component19",
        "component20",
        "component21",
        "component22",
        "component23",
        "component24",
        "component25",
        "component26",
        "component27",
        "component28",
        "component29",
        "component30",
        "component31",
        "component32",
        "component33",
        "component34",
        "component35",
        "component36",
        "component37",
        "component38",
        "component39",
        "component40",
        "component41",
        "component42",
        "component43",
        "component44",
        "component45",
        "component46",
        "component47",
        "component48",
        "component49",
        "component50",
        "component51",
        "component52",
        "component53",
        "component54",
        "component55",
        "component56",
        "component57",
        "component58",
        "component59",
        "component60",
        "component61",
        "component62",
        "component63",
        "component64",
        "component65",
        "component66",
        "component67",
        "component68",
        "component69",
        "component70",
        "component71",
        "component72",
        "component73",
        "component74",
        "component75",
        "component76",
        "component77",
        "component78",
        "component79",
        "component80",
        "component81",
        "component82",
        "component83",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/math/BigDecimal;ILjava/math/BigDecimal;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/Integer;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/Integer;ILjava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;IILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ILcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel$CouponReward;)Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;",
        "describeContents",
        "equals",
        "other",
        "",
        "hashCode",
        "toString",
        "writeToParcel",
        "",
        "dest",
        "Landroid/os/Parcel;",
        "flags",
        "Transfer",
        "CouponReward",
        "TradingBotKitLib_googleRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field private arbitrage:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private buyNumber:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private buyNumberBg:Ljava/lang/Integer;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private buyNumberWidget:Ljava/lang/Float;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private centerContentBgColor:Ljava/lang/Integer;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private couponReward:Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel$CouponReward;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private dayArbitrageNum:Ljava/lang/Integer;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private direction:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private directionBgColor:Ljava/lang/Integer;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private directionCode:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private directionVisible:I

.field private endTime:Ljava/lang/Long;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private entryPrice:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private entryPriceValue:Ljava/math/BigDecimal;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private floatAmount:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private floatAmountValue:Ljava/math/BigDecimal;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private fundingFee:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private fundingFeeValue:Ljava/math/BigDecimal;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private futuresGridProtectionTip:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private gridProfit:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private gridProfitValue:Ljava/math/BigDecimal;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private isOpenUnit:Ljava/lang/Boolean;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private isRisk:Ljava/lang/Boolean;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private lastPrice:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private lastPriceValue:Ljava/math/BigDecimal;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private lastPriceVisible:I

.field private leverage:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private leverageBgColor:Ljava/lang/Integer;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private leverageTextColor:Ljava/lang/Integer;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private leverageValue:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private leverageVisible:I

.field private liquidationPrice:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private liquidationPriceValue:Ljava/math/BigDecimal;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private loadingString:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private notTradingOrderPrice:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private openUnitPrice:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private openUnitPriceValue:Ljava/math/BigDecimal;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private outPriceRange:I

.field private pendingOrder:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private pendingOrderNumberBuyColor:I

.field private pendingOrderNumberSellColor:I

.field private priceEnd:Ljava/math/BigDecimal;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private pricePrecision:Ljava/lang/Integer;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private priceRange:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private priceRangeColor:Ljava/lang/Integer;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private priceStart:Ljava/math/BigDecimal;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private profitPrecision:Ljava/lang/Integer;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private quoteCode:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private quoteName:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private riskLimitTime:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private riskLimitTimeValue:Ljava/lang/Long;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private runningStatus:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private runningTime:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private runningTimeValue:Ljava/lang/Long;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private sellNumber:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private sellNumberBg:Ljava/lang/Integer;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private sellNumberWidget:Ljava/lang/Float;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private splitWidget:Ljava/lang/Float;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private stopLossPrice:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private stopLossPriceValue:Ljava/math/BigDecimal;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private stopPriceNumber:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private stopPriceText:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private stopProfitPrice:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private stopProfitPriceValue:Ljava/math/BigDecimal;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private stopReason:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private stopReasonDetail:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private symbolCode:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private symbolName:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private taskId:Ljava/lang/Long;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private totalArbitrageNum:Ljava/lang/Integer;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private totalInvest:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private totalInvestText:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private totalInvestValue:Ljava/math/BigDecimal;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private totalInvestVisible:I

.field private totalProfit:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private totalProfitColor:Ljava/lang/Integer;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private totalProfitRate:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private totalProfitRateValue:Ljava/math/BigDecimal;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private totalProfitText:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private totalProfitValue:Ljava/math/BigDecimal;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private transfers:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel$Transfer;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private viewType:Ljava/lang/Integer;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private weightSum:Ljava/lang/Float;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel$a;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel$a;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->CREATOR:Landroid/os/Parcelable$Creator;

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
    .line 58
    .line 59
.end method

.method public constructor <init>()V
    .locals 88

    .line 1
    const v86, 0x7ffff

    const/16 v87, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    const/16 v39, 0x0

    const/16 v40, 0x0

    const/16 v41, 0x0

    const/16 v42, 0x0

    const/16 v43, 0x0

    const/16 v44, 0x0

    const/16 v45, 0x0

    const/16 v46, 0x0

    const/16 v47, 0x0

    const/16 v48, 0x0

    const/16 v49, 0x0

    const/16 v50, 0x0

    const/16 v51, 0x0

    const/16 v52, 0x0

    const/16 v53, 0x0

    const/16 v54, 0x0

    const/16 v55, 0x0

    const/16 v56, 0x0

    const/16 v57, 0x0

    const/16 v58, 0x0

    const/16 v59, 0x0

    const/16 v60, 0x0

    const/16 v61, 0x0

    const/16 v62, 0x0

    const/16 v63, 0x0

    const/16 v64, 0x0

    const/16 v65, 0x0

    const/16 v66, 0x0

    const/16 v67, 0x0

    const/16 v68, 0x0

    const/16 v69, 0x0

    const/16 v70, 0x0

    const/16 v71, 0x0

    const/16 v72, 0x0

    const/16 v73, 0x0

    const/16 v74, 0x0

    const/16 v75, 0x0

    const/16 v76, 0x0

    const/16 v77, 0x0

    const/16 v78, 0x0

    const/16 v79, 0x0

    const/16 v80, 0x0

    const/16 v81, 0x0

    const/16 v82, 0x0

    const/16 v83, 0x0

    const/16 v84, -0x1

    const/16 v85, -0x1

    move-object/from16 v0, p0

    invoke-direct/range {v0 .. v87}, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/math/BigDecimal;ILjava/math/BigDecimal;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/Integer;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/Integer;ILjava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;IILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ILcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel$CouponReward;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/math/BigDecimal;ILjava/math/BigDecimal;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/Integer;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/Integer;ILjava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;IILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ILcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel$CouponReward;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p6    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p7    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p8    # Ljava/lang/Integer;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p10    # Ljava/lang/Integer;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p11    # Ljava/lang/Integer;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p12    # Ljava/lang/Integer;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p13    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p14    # Ljava/math/BigDecimal;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p16    # Ljava/math/BigDecimal;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p17    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p18    # Ljava/lang/Long;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p19    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p20    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p21    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p22    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p23    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p24    # Ljava/math/BigDecimal;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p25    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p26    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p27    # Ljava/math/BigDecimal;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p28    # Ljava/lang/Integer;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p29    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p30    # Ljava/math/BigDecimal;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p31    # Ljava/lang/Integer;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p32    # Ljava/lang/Integer;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p33    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p34    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p35    # Ljava/math/BigDecimal;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p36    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p37    # Ljava/math/BigDecimal;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p38    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p39    # Ljava/math/BigDecimal;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p40    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p41    # Ljava/math/BigDecimal;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p42    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p43    # Ljava/lang/Integer;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p45    # Ljava/math/BigDecimal;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p46    # Ljava/math/BigDecimal;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p47    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p48    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p49    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p50    # Ljava/lang/Float;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p51    # Ljava/lang/Float;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p52    # Ljava/lang/Float;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p53    # Ljava/lang/Float;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p56    # Ljava/lang/Integer;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p57    # Ljava/lang/Integer;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p58    # Ljava/lang/Long;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p59    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p60    # Ljava/lang/Integer;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p61    # Ljava/lang/Integer;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p62    # Ljava/lang/Integer;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p63    # Ljava/math/BigDecimal;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p64    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p65    # Ljava/lang/Long;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p66    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p67    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p68    # Ljava/lang/Boolean;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p69    # Ljava/lang/Boolean;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p70    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p71    # Ljava/lang/Long;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p72    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p73    # Ljava/math/BigDecimal;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p74    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p75    # Ljava/math/BigDecimal;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p76    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p77    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p78    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p79    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p80    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p81    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p83    # Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel$CouponReward;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "I",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            "I",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            "Ljava/lang/String;",
            "Ljava/math/BigDecimal;",
            "I",
            "Ljava/math/BigDecimal;",
            "Ljava/lang/String;",
            "Ljava/lang/Long;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/math/BigDecimal;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/math/BigDecimal;",
            "Ljava/lang/Integer;",
            "Ljava/lang/String;",
            "Ljava/math/BigDecimal;",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/math/BigDecimal;",
            "Ljava/lang/String;",
            "Ljava/math/BigDecimal;",
            "Ljava/lang/String;",
            "Ljava/math/BigDecimal;",
            "Ljava/lang/String;",
            "Ljava/math/BigDecimal;",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            "I",
            "Ljava/math/BigDecimal;",
            "Ljava/math/BigDecimal;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/Float;",
            "Ljava/lang/Float;",
            "Ljava/lang/Float;",
            "Ljava/lang/Float;",
            "II",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            "Ljava/lang/Long;",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            "Ljava/math/BigDecimal;",
            "Ljava/lang/String;",
            "Ljava/lang/Long;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/String;",
            "Ljava/lang/Long;",
            "Ljava/lang/String;",
            "Ljava/math/BigDecimal;",
            "Ljava/lang/String;",
            "Ljava/math/BigDecimal;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel$Transfer;",
            ">;I",
            "Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel$CouponReward;",
            ")V"
        }
    .end annotation

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->symbolName:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->symbolCode:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->direction:Ljava/lang/String;

    .line 6
    iput-object p4, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->directionCode:Ljava/lang/String;

    .line 7
    iput p5, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->directionVisible:I

    .line 8
    iput-object p6, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->leverageValue:Ljava/lang/String;

    .line 9
    iput-object p7, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->leverage:Ljava/lang/String;

    .line 10
    iput-object p8, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->leverageBgColor:Ljava/lang/Integer;

    .line 11
    iput p9, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->leverageVisible:I

    .line 12
    iput-object p10, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->centerContentBgColor:Ljava/lang/Integer;

    .line 13
    iput-object p11, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->leverageTextColor:Ljava/lang/Integer;

    .line 14
    iput-object p12, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->directionBgColor:Ljava/lang/Integer;

    .line 15
    iput-object p13, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->lastPrice:Ljava/lang/String;

    .line 16
    iput-object p14, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->lastPriceValue:Ljava/math/BigDecimal;

    .line 17
    iput p15, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->lastPriceVisible:I

    move-object/from16 p1, p16

    .line 18
    iput-object p1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->liquidationPriceValue:Ljava/math/BigDecimal;

    move-object/from16 p1, p17

    .line 19
    iput-object p1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->liquidationPrice:Ljava/lang/String;

    move-object/from16 p1, p18

    .line 20
    iput-object p1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->runningTimeValue:Ljava/lang/Long;

    move-object/from16 p1, p19

    .line 21
    iput-object p1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->runningTime:Ljava/lang/String;

    move-object/from16 p1, p20

    .line 22
    iput-object p1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->quoteCode:Ljava/lang/String;

    move-object/from16 p1, p21

    .line 23
    iput-object p1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->quoteName:Ljava/lang/String;

    move-object/from16 p1, p22

    .line 24
    iput-object p1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->totalInvestText:Ljava/lang/String;

    move-object/from16 p1, p23

    .line 25
    iput-object p1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->totalInvest:Ljava/lang/String;

    move-object/from16 p1, p24

    .line 26
    iput-object p1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->totalInvestValue:Ljava/math/BigDecimal;

    move-object/from16 p1, p25

    .line 27
    iput-object p1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->totalProfitText:Ljava/lang/String;

    move-object/from16 p1, p26

    .line 28
    iput-object p1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->totalProfit:Ljava/lang/String;

    move-object/from16 p1, p27

    iput-object p1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->totalProfitValue:Ljava/math/BigDecimal;

    move-object/from16 p1, p28

    .line 29
    iput-object p1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->totalProfitColor:Ljava/lang/Integer;

    move-object/from16 p1, p29

    .line 30
    iput-object p1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->totalProfitRate:Ljava/lang/String;

    move-object/from16 p1, p30

    .line 31
    iput-object p1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->totalProfitRateValue:Ljava/math/BigDecimal;

    move-object/from16 p1, p31

    .line 32
    iput-object p1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->dayArbitrageNum:Ljava/lang/Integer;

    move-object/from16 p1, p32

    .line 33
    iput-object p1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->totalArbitrageNum:Ljava/lang/Integer;

    move-object/from16 p1, p33

    .line 34
    iput-object p1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->arbitrage:Ljava/lang/String;

    move-object/from16 p1, p34

    .line 35
    iput-object p1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->gridProfit:Ljava/lang/String;

    move-object/from16 p1, p35

    .line 36
    iput-object p1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->gridProfitValue:Ljava/math/BigDecimal;

    move-object/from16 p1, p36

    .line 37
    iput-object p1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->floatAmount:Ljava/lang/String;

    move-object/from16 p1, p37

    .line 38
    iput-object p1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->floatAmountValue:Ljava/math/BigDecimal;

    move-object/from16 p1, p38

    .line 39
    iput-object p1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->fundingFee:Ljava/lang/String;

    move-object/from16 p1, p39

    .line 40
    iput-object p1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->fundingFeeValue:Ljava/math/BigDecimal;

    move-object/from16 p1, p40

    .line 41
    iput-object p1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->entryPrice:Ljava/lang/String;

    move-object/from16 p1, p41

    .line 42
    iput-object p1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->entryPriceValue:Ljava/math/BigDecimal;

    move-object/from16 p1, p42

    .line 43
    iput-object p1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->priceRange:Ljava/lang/String;

    move-object/from16 p1, p43

    .line 44
    iput-object p1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->priceRangeColor:Ljava/lang/Integer;

    move/from16 p1, p44

    .line 45
    iput p1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->outPriceRange:I

    move-object/from16 p1, p45

    .line 46
    iput-object p1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->priceStart:Ljava/math/BigDecimal;

    move-object/from16 p1, p46

    .line 47
    iput-object p1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->priceEnd:Ljava/math/BigDecimal;

    move-object/from16 p1, p47

    .line 48
    iput-object p1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->pendingOrder:Ljava/lang/String;

    move-object/from16 p1, p48

    .line 49
    iput-object p1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->buyNumber:Ljava/lang/String;

    move-object/from16 p1, p49

    .line 50
    iput-object p1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->sellNumber:Ljava/lang/String;

    move-object/from16 p1, p50

    .line 51
    iput-object p1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->buyNumberWidget:Ljava/lang/Float;

    move-object/from16 p1, p51

    .line 52
    iput-object p1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->sellNumberWidget:Ljava/lang/Float;

    move-object/from16 p1, p52

    .line 53
    iput-object p1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->splitWidget:Ljava/lang/Float;

    move-object/from16 p1, p53

    .line 54
    iput-object p1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->weightSum:Ljava/lang/Float;

    move/from16 p1, p54

    .line 55
    iput p1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->pendingOrderNumberSellColor:I

    move/from16 p1, p55

    .line 56
    iput p1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->pendingOrderNumberBuyColor:I

    move-object/from16 p1, p56

    .line 57
    iput-object p1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->buyNumberBg:Ljava/lang/Integer;

    move-object/from16 p1, p57

    .line 58
    iput-object p1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->sellNumberBg:Ljava/lang/Integer;

    move-object/from16 p1, p58

    .line 59
    iput-object p1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->taskId:Ljava/lang/Long;

    move-object/from16 p1, p59

    .line 60
    iput-object p1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->runningStatus:Ljava/lang/String;

    move-object/from16 p1, p60

    .line 61
    iput-object p1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->viewType:Ljava/lang/Integer;

    move-object/from16 p1, p61

    .line 62
    iput-object p1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->pricePrecision:Ljava/lang/Integer;

    move-object/from16 p1, p62

    .line 63
    iput-object p1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->profitPrecision:Ljava/lang/Integer;

    move-object/from16 p1, p63

    .line 64
    iput-object p1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->openUnitPriceValue:Ljava/math/BigDecimal;

    move-object/from16 p1, p64

    .line 65
    iput-object p1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->openUnitPrice:Ljava/lang/String;

    move-object/from16 p1, p65

    .line 66
    iput-object p1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->endTime:Ljava/lang/Long;

    move-object/from16 p1, p66

    .line 67
    iput-object p1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->loadingString:Ljava/lang/String;

    move-object/from16 p1, p67

    .line 68
    iput-object p1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->notTradingOrderPrice:Ljava/lang/String;

    move-object/from16 p1, p68

    .line 69
    iput-object p1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->isOpenUnit:Ljava/lang/Boolean;

    move-object/from16 p1, p69

    .line 70
    iput-object p1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->isRisk:Ljava/lang/Boolean;

    move-object/from16 p1, p70

    .line 71
    iput-object p1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->futuresGridProtectionTip:Ljava/lang/String;

    move-object/from16 p1, p71

    .line 72
    iput-object p1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->riskLimitTimeValue:Ljava/lang/Long;

    move-object/from16 p1, p72

    .line 73
    iput-object p1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->riskLimitTime:Ljava/lang/String;

    move-object/from16 p1, p73

    .line 74
    iput-object p1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->stopLossPriceValue:Ljava/math/BigDecimal;

    move-object/from16 p1, p74

    .line 75
    iput-object p1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->stopLossPrice:Ljava/lang/String;

    move-object/from16 p1, p75

    .line 76
    iput-object p1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->stopProfitPriceValue:Ljava/math/BigDecimal;

    move-object/from16 p1, p76

    .line 77
    iput-object p1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->stopProfitPrice:Ljava/lang/String;

    move-object/from16 p1, p77

    .line 78
    iput-object p1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->stopReason:Ljava/lang/String;

    move-object/from16 p1, p78

    .line 79
    iput-object p1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->stopPriceText:Ljava/lang/String;

    move-object/from16 p1, p79

    .line 80
    iput-object p1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->stopPriceNumber:Ljava/lang/String;

    move-object/from16 p1, p80

    .line 81
    iput-object p1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->stopReasonDetail:Ljava/lang/String;

    move-object/from16 p1, p81

    .line 82
    iput-object p1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->transfers:Ljava/util/List;

    move/from16 p1, p82

    .line 83
    iput p1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->totalInvestVisible:I

    move-object/from16 p1, p83

    .line 84
    iput-object p1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->couponReward:Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel$CouponReward;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/math/BigDecimal;ILjava/math/BigDecimal;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/Integer;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/Integer;ILjava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;IILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ILcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel$CouponReward;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 67

    move/from16 v0, p84

    move/from16 v1, p85

    move/from16 v2, p86

    and-int/lit8 v3, v0, 0x1

    if-eqz v3, :cond_0

    const/4 v3, 0x0

    goto :goto_0

    :cond_0
    move-object/from16 v3, p1

    :goto_0
    and-int/lit8 v5, v0, 0x2

    if-eqz v5, :cond_1

    const/4 v5, 0x0

    goto :goto_1

    :cond_1
    move-object/from16 v5, p2

    :goto_1
    and-int/lit8 v6, v0, 0x4

    if-eqz v6, :cond_2

    const/4 v6, 0x0

    goto :goto_2

    :cond_2
    move-object/from16 v6, p3

    :goto_2
    and-int/lit8 v7, v0, 0x8

    if-eqz v7, :cond_3

    const/4 v7, 0x0

    goto :goto_3

    :cond_3
    move-object/from16 v7, p4

    :goto_3
    and-int/lit8 v8, v0, 0x10

    if-eqz v8, :cond_4

    const/4 v8, 0x0

    goto :goto_4

    :cond_4
    move/from16 v8, p5

    :goto_4
    and-int/lit8 v10, v0, 0x20

    if-eqz v10, :cond_5

    const/4 v10, 0x0

    goto :goto_5

    :cond_5
    move-object/from16 v10, p6

    :goto_5
    and-int/lit8 v11, v0, 0x40

    if-eqz v11, :cond_6

    const/4 v11, 0x0

    goto :goto_6

    :cond_6
    move-object/from16 v11, p7

    :goto_6
    and-int/lit16 v12, v0, 0x80

    if-eqz v12, :cond_7

    const/4 v12, 0x0

    goto :goto_7

    :cond_7
    move-object/from16 v12, p8

    :goto_7
    and-int/lit16 v13, v0, 0x100

    if-eqz v13, :cond_8

    const/4 v13, 0x0

    goto :goto_8

    :cond_8
    move/from16 v13, p9

    :goto_8
    and-int/lit16 v14, v0, 0x200

    if-eqz v14, :cond_9

    const/4 v14, 0x0

    goto :goto_9

    :cond_9
    move-object/from16 v14, p10

    :goto_9
    and-int/lit16 v15, v0, 0x400

    if-eqz v15, :cond_a

    const/4 v15, 0x0

    goto :goto_a

    :cond_a
    move-object/from16 v15, p11

    :goto_a
    and-int/lit16 v4, v0, 0x800

    if-eqz v4, :cond_b

    const/4 v4, 0x0

    goto :goto_b

    :cond_b
    move-object/from16 v4, p12

    :goto_b
    and-int/lit16 v9, v0, 0x1000

    if-eqz v9, :cond_c

    const/4 v9, 0x0

    goto :goto_c

    :cond_c
    move-object/from16 v9, p13

    :goto_c
    move-object/from16 v16, v3

    and-int/lit16 v3, v0, 0x2000

    if-eqz v3, :cond_d

    const/4 v3, 0x0

    goto :goto_d

    :cond_d
    move-object/from16 v3, p14

    :goto_d
    move-object/from16 p2, v3

    and-int/lit16 v3, v0, 0x4000

    if-eqz v3, :cond_e

    const/4 v3, 0x0

    goto :goto_e

    :cond_e
    move/from16 v3, p15

    :goto_e
    const v17, 0x8000

    and-int v18, v0, v17

    if-eqz v18, :cond_f

    const/16 v18, 0x0

    goto :goto_f

    :cond_f
    move-object/from16 v18, p16

    :goto_f
    const/high16 v19, 0x10000

    and-int v20, v0, v19

    if-eqz v20, :cond_10

    const/16 v20, 0x0

    goto :goto_10

    :cond_10
    move-object/from16 v20, p17

    :goto_10
    const/high16 v21, 0x20000

    and-int v22, v0, v21

    if-eqz v22, :cond_11

    const/16 v22, 0x0

    goto :goto_11

    :cond_11
    move-object/from16 v22, p18

    :goto_11
    const/high16 v23, 0x40000

    and-int v24, v0, v23

    if-eqz v24, :cond_12

    const/16 v24, 0x0

    goto :goto_12

    :cond_12
    move-object/from16 v24, p19

    :goto_12
    const/high16 v25, 0x80000

    and-int v26, v0, v25

    if-eqz v26, :cond_13

    const/16 v26, 0x0

    goto :goto_13

    :cond_13
    move-object/from16 v26, p20

    :goto_13
    const/high16 v27, 0x100000

    and-int v27, v0, v27

    if-eqz v27, :cond_14

    const/16 v27, 0x0

    goto :goto_14

    :cond_14
    move-object/from16 v27, p21

    :goto_14
    const/high16 v28, 0x200000

    and-int v28, v0, v28

    if-eqz v28, :cond_15

    const/16 v28, 0x0

    goto :goto_15

    :cond_15
    move-object/from16 v28, p22

    :goto_15
    const/high16 v29, 0x400000

    and-int v29, v0, v29

    if-eqz v29, :cond_16

    const/16 v29, 0x0

    goto :goto_16

    :cond_16
    move-object/from16 v29, p23

    :goto_16
    const/high16 v30, 0x800000

    and-int v30, v0, v30

    if-eqz v30, :cond_17

    const/16 v30, 0x0

    goto :goto_17

    :cond_17
    move-object/from16 v30, p24

    :goto_17
    const/high16 v31, 0x1000000

    and-int v31, v0, v31

    if-eqz v31, :cond_18

    const/16 v31, 0x0

    goto :goto_18

    :cond_18
    move-object/from16 v31, p25

    :goto_18
    const/high16 v32, 0x2000000

    and-int v32, v0, v32

    if-eqz v32, :cond_19

    const/16 v32, 0x0

    goto :goto_19

    :cond_19
    move-object/from16 v32, p26

    :goto_19
    const/high16 v33, 0x4000000

    and-int v33, v0, v33

    if-eqz v33, :cond_1a

    const/16 v33, 0x0

    goto :goto_1a

    :cond_1a
    move-object/from16 v33, p27

    :goto_1a
    const/high16 v34, 0x8000000

    and-int v34, v0, v34

    if-eqz v34, :cond_1b

    const/16 v34, 0x0

    goto :goto_1b

    :cond_1b
    move-object/from16 v34, p28

    :goto_1b
    const/high16 v35, 0x10000000

    and-int v35, v0, v35

    if-eqz v35, :cond_1c

    const/16 v35, 0x0

    goto :goto_1c

    :cond_1c
    move-object/from16 v35, p29

    :goto_1c
    const/high16 v36, 0x20000000

    and-int v36, v0, v36

    if-eqz v36, :cond_1d

    const/16 v36, 0x0

    goto :goto_1d

    :cond_1d
    move-object/from16 v36, p30

    :goto_1d
    const/high16 v37, 0x40000000    # 2.0f

    and-int v37, v0, v37

    if-eqz v37, :cond_1e

    const/16 v37, 0x0

    goto :goto_1e

    :cond_1e
    move-object/from16 v37, p31

    :goto_1e
    const/high16 v38, -0x80000000

    and-int v0, v0, v38

    if-eqz v0, :cond_1f

    const/4 v0, 0x0

    goto :goto_1f

    :cond_1f
    move-object/from16 v0, p32

    :goto_1f
    and-int/lit8 v38, v1, 0x1

    if-eqz v38, :cond_20

    const/16 v38, 0x0

    goto :goto_20

    :cond_20
    move-object/from16 v38, p33

    :goto_20
    and-int/lit8 v39, v1, 0x2

    if-eqz v39, :cond_21

    const/16 v39, 0x0

    goto :goto_21

    :cond_21
    move-object/from16 v39, p34

    :goto_21
    and-int/lit8 v40, v1, 0x4

    if-eqz v40, :cond_22

    const/16 v40, 0x0

    goto :goto_22

    :cond_22
    move-object/from16 v40, p35

    :goto_22
    and-int/lit8 v41, v1, 0x8

    if-eqz v41, :cond_23

    const/16 v41, 0x0

    goto :goto_23

    :cond_23
    move-object/from16 v41, p36

    :goto_23
    and-int/lit8 v42, v1, 0x10

    if-eqz v42, :cond_24

    const/16 v42, 0x0

    goto :goto_24

    :cond_24
    move-object/from16 v42, p37

    :goto_24
    and-int/lit8 v43, v1, 0x20

    if-eqz v43, :cond_25

    const/16 v43, 0x0

    goto :goto_25

    :cond_25
    move-object/from16 v43, p38

    :goto_25
    and-int/lit8 v44, v1, 0x40

    if-eqz v44, :cond_26

    const/16 v44, 0x0

    goto :goto_26

    :cond_26
    move-object/from16 v44, p39

    :goto_26
    move-object/from16 p3, v0

    and-int/lit16 v0, v1, 0x80

    if-eqz v0, :cond_27

    const/4 v0, 0x0

    goto :goto_27

    :cond_27
    move-object/from16 v0, p40

    :goto_27
    move-object/from16 p4, v0

    and-int/lit16 v0, v1, 0x100

    if-eqz v0, :cond_28

    const/4 v0, 0x0

    goto :goto_28

    :cond_28
    move-object/from16 v0, p41

    :goto_28
    move-object/from16 p5, v0

    and-int/lit16 v0, v1, 0x200

    if-eqz v0, :cond_29

    const/4 v0, 0x0

    goto :goto_29

    :cond_29
    move-object/from16 v0, p42

    :goto_29
    move-object/from16 p6, v0

    and-int/lit16 v0, v1, 0x400

    if-eqz v0, :cond_2a

    const/4 v0, 0x0

    goto :goto_2a

    :cond_2a
    move-object/from16 v0, p43

    :goto_2a
    move-object/from16 p7, v0

    and-int/lit16 v0, v1, 0x800

    if-eqz v0, :cond_2b

    const/4 v0, 0x4

    goto :goto_2b

    :cond_2b
    move/from16 v0, p44

    :goto_2b
    move/from16 p8, v0

    and-int/lit16 v0, v1, 0x1000

    if-eqz v0, :cond_2c

    const/4 v0, 0x0

    goto :goto_2c

    :cond_2c
    move-object/from16 v0, p45

    :goto_2c
    move-object/from16 p9, v0

    and-int/lit16 v0, v1, 0x2000

    if-eqz v0, :cond_2d

    const/4 v0, 0x0

    goto :goto_2d

    :cond_2d
    move-object/from16 v0, p46

    :goto_2d
    move-object/from16 p10, v0

    and-int/lit16 v0, v1, 0x4000

    if-eqz v0, :cond_2e

    const/4 v0, 0x0

    goto :goto_2e

    :cond_2e
    move-object/from16 v0, p47

    :goto_2e
    and-int v45, v1, v17

    if-eqz v45, :cond_2f

    const/16 v45, 0x0

    goto :goto_2f

    :cond_2f
    move-object/from16 v45, p48

    :goto_2f
    and-int v46, v1, v19

    if-eqz v46, :cond_30

    const/16 v46, 0x0

    goto :goto_30

    :cond_30
    move-object/from16 v46, p49

    :goto_30
    and-int v47, v1, v21

    if-eqz v47, :cond_31

    const/16 v47, 0x0

    goto :goto_31

    :cond_31
    move-object/from16 v47, p50

    :goto_31
    and-int v48, v1, v23

    if-eqz v48, :cond_32

    const/16 v48, 0x0

    goto :goto_32

    :cond_32
    move-object/from16 v48, p51

    :goto_32
    and-int v25, v1, v25

    if-eqz v25, :cond_33

    const/16 v25, 0x0

    goto :goto_33

    :cond_33
    move-object/from16 v25, p52

    :goto_33
    const/high16 v49, 0x100000

    and-int v49, v1, v49

    if-eqz v49, :cond_34

    const/16 v49, 0x0

    goto :goto_34

    :cond_34
    move-object/from16 v49, p53

    :goto_34
    const/high16 v50, 0x200000

    and-int v50, v1, v50

    if-eqz v50, :cond_35

    .line 85
    sget-object v50, Lcom/kubi/utils/c;->a:Lcom/kubi/utils/c;

    invoke-virtual/range {v50 .. v50}, Lcom/kubi/utils/c;->b()Landroid/content/Context;

    move-result-object v50

    invoke-static/range {v50 .. v50}, Lcom/kubi/resources/g;->n(Landroid/content/Context;)I

    move-result v50

    goto :goto_35

    :cond_35
    move/from16 v50, p54

    :goto_35
    const/high16 v51, 0x400000

    and-int v51, v1, v51

    if-eqz v51, :cond_36

    .line 86
    sget-object v51, Lcom/kubi/utils/c;->a:Lcom/kubi/utils/c;

    invoke-virtual/range {v51 .. v51}, Lcom/kubi/utils/c;->b()Landroid/content/Context;

    move-result-object v51

    invoke-static/range {v51 .. v51}, Lcom/kubi/resources/g;->p(Landroid/content/Context;)I

    move-result v51

    goto :goto_36

    :cond_36
    move/from16 v51, p55

    :goto_36
    const/high16 v52, 0x800000

    and-int v52, v1, v52

    if-eqz v52, :cond_37

    const/16 v52, 0x0

    goto :goto_37

    :cond_37
    move-object/from16 v52, p56

    :goto_37
    const/high16 v53, 0x1000000

    and-int v53, v1, v53

    if-eqz v53, :cond_38

    const/16 v53, 0x0

    goto :goto_38

    :cond_38
    move-object/from16 v53, p57

    :goto_38
    const/high16 v54, 0x2000000

    and-int v54, v1, v54

    if-eqz v54, :cond_39

    const/16 v54, 0x0

    goto :goto_39

    :cond_39
    move-object/from16 v54, p58

    :goto_39
    const/high16 v55, 0x4000000

    and-int v55, v1, v55

    if-eqz v55, :cond_3a

    const/16 v55, 0x0

    goto :goto_3a

    :cond_3a
    move-object/from16 v55, p59

    :goto_3a
    const/high16 v56, 0x8000000

    and-int v56, v1, v56

    if-eqz v56, :cond_3b

    const/16 v56, 0x0

    goto :goto_3b

    :cond_3b
    move-object/from16 v56, p60

    :goto_3b
    const/high16 v57, 0x10000000

    and-int v57, v1, v57

    if-eqz v57, :cond_3c

    const/16 v57, 0x0

    goto :goto_3c

    :cond_3c
    move-object/from16 v57, p61

    :goto_3c
    const/high16 v58, 0x20000000

    and-int v58, v1, v58

    if-eqz v58, :cond_3d

    const/16 v58, 0x0

    goto :goto_3d

    :cond_3d
    move-object/from16 v58, p62

    :goto_3d
    const/high16 v59, 0x40000000    # 2.0f

    and-int v59, v1, v59

    if-eqz v59, :cond_3e

    const/16 v59, 0x0

    goto :goto_3e

    :cond_3e
    move-object/from16 v59, p63

    :goto_3e
    const/high16 v60, -0x80000000

    and-int v1, v1, v60

    if-eqz v1, :cond_3f

    const/4 v1, 0x0

    goto :goto_3f

    :cond_3f
    move-object/from16 v1, p64

    :goto_3f
    and-int/lit8 v60, v2, 0x1

    if-eqz v60, :cond_40

    const/16 v60, 0x0

    goto :goto_40

    :cond_40
    move-object/from16 v60, p65

    :goto_40
    and-int/lit8 v61, v2, 0x2

    if-eqz v61, :cond_41

    const/16 v61, 0x0

    goto :goto_41

    :cond_41
    move-object/from16 v61, p66

    :goto_41
    and-int/lit8 v62, v2, 0x4

    if-eqz v62, :cond_42

    const/16 v62, 0x0

    goto :goto_42

    :cond_42
    move-object/from16 v62, p67

    :goto_42
    and-int/lit8 v63, v2, 0x8

    if-eqz v63, :cond_43

    const/16 v63, 0x0

    goto :goto_43

    :cond_43
    move-object/from16 v63, p68

    :goto_43
    and-int/lit8 v64, v2, 0x10

    if-eqz v64, :cond_44

    const/16 v64, 0x0

    goto :goto_44

    :cond_44
    move-object/from16 v64, p69

    :goto_44
    and-int/lit8 v65, v2, 0x20

    if-eqz v65, :cond_45

    const/16 v65, 0x0

    goto :goto_45

    :cond_45
    move-object/from16 v65, p70

    :goto_45
    and-int/lit8 v66, v2, 0x40

    if-eqz v66, :cond_46

    const/16 v66, 0x0

    goto :goto_46

    :cond_46
    move-object/from16 v66, p71

    :goto_46
    move-object/from16 p11, v0

    and-int/lit16 v0, v2, 0x80

    if-eqz v0, :cond_47

    const/4 v0, 0x0

    goto :goto_47

    :cond_47
    move-object/from16 v0, p72

    :goto_47
    move-object/from16 p12, v0

    and-int/lit16 v0, v2, 0x100

    if-eqz v0, :cond_48

    const/4 v0, 0x0

    goto :goto_48

    :cond_48
    move-object/from16 v0, p73

    :goto_48
    move-object/from16 p13, v0

    and-int/lit16 v0, v2, 0x200

    if-eqz v0, :cond_49

    const/4 v0, 0x0

    goto :goto_49

    :cond_49
    move-object/from16 v0, p74

    :goto_49
    move-object/from16 p14, v0

    and-int/lit16 v0, v2, 0x400

    if-eqz v0, :cond_4a

    const/4 v0, 0x0

    goto :goto_4a

    :cond_4a
    move-object/from16 v0, p75

    :goto_4a
    move-object/from16 p15, v0

    and-int/lit16 v0, v2, 0x800

    if-eqz v0, :cond_4b

    const/4 v0, 0x0

    goto :goto_4b

    :cond_4b
    move-object/from16 v0, p76

    :goto_4b
    move-object/from16 p16, v0

    and-int/lit16 v0, v2, 0x1000

    if-eqz v0, :cond_4c

    const/4 v0, 0x0

    goto :goto_4c

    :cond_4c
    move-object/from16 v0, p77

    :goto_4c
    move-object/from16 p17, v0

    and-int/lit16 v0, v2, 0x2000

    if-eqz v0, :cond_4d

    const/4 v0, 0x0

    goto :goto_4d

    :cond_4d
    move-object/from16 v0, p78

    :goto_4d
    move-object/from16 p18, v0

    and-int/lit16 v0, v2, 0x4000

    if-eqz v0, :cond_4e

    const/4 v0, 0x0

    goto :goto_4e

    :cond_4e
    move-object/from16 v0, p79

    :goto_4e
    and-int v17, v2, v17

    if-eqz v17, :cond_4f

    const/16 v17, 0x0

    goto :goto_4f

    :cond_4f
    move-object/from16 v17, p80

    :goto_4f
    and-int v19, v2, v19

    if-eqz v19, :cond_50

    const/16 v19, 0x0

    goto :goto_50

    :cond_50
    move-object/from16 v19, p81

    :goto_50
    and-int v21, v2, v21

    if-eqz v21, :cond_51

    const/16 v21, 0x0

    goto :goto_51

    :cond_51
    move/from16 v21, p82

    :goto_51
    and-int v2, v2, v23

    if-eqz v2, :cond_52

    const/16 p84, 0x0

    :goto_52
    move-object/from16 p1, p0

    move-object/from16 p33, p3

    move-object/from16 p41, p4

    move-object/from16 p42, p5

    move-object/from16 p43, p6

    move-object/from16 p44, p7

    move/from16 p45, p8

    move-object/from16 p46, p9

    move-object/from16 p47, p10

    move-object/from16 p48, p11

    move-object/from16 p73, p12

    move-object/from16 p74, p13

    move-object/from16 p75, p14

    move-object/from16 p76, p15

    move-object/from16 p77, p16

    move-object/from16 p78, p17

    move-object/from16 p79, p18

    move-object/from16 p80, v0

    move-object/from16 p65, v1

    move/from16 p16, v3

    move-object/from16 p13, v4

    move-object/from16 p3, v5

    move-object/from16 p4, v6

    move-object/from16 p5, v7

    move/from16 p6, v8

    move-object/from16 p14, v9

    move-object/from16 p7, v10

    move-object/from16 p8, v11

    move-object/from16 p9, v12

    move/from16 p10, v13

    move-object/from16 p11, v14

    move-object/from16 p12, v15

    move-object/from16 p81, v17

    move-object/from16 p17, v18

    move-object/from16 p82, v19

    move-object/from16 p18, v20

    move/from16 p83, v21

    move-object/from16 p19, v22

    move-object/from16 p20, v24

    move-object/from16 p53, v25

    move-object/from16 p21, v26

    move-object/from16 p22, v27

    move-object/from16 p23, v28

    move-object/from16 p24, v29

    move-object/from16 p25, v30

    move-object/from16 p26, v31

    move-object/from16 p27, v32

    move-object/from16 p28, v33

    move-object/from16 p29, v34

    move-object/from16 p30, v35

    move-object/from16 p31, v36

    move-object/from16 p32, v37

    move-object/from16 p34, v38

    move-object/from16 p35, v39

    move-object/from16 p36, v40

    move-object/from16 p37, v41

    move-object/from16 p38, v42

    move-object/from16 p39, v43

    move-object/from16 p40, v44

    move-object/from16 p49, v45

    move-object/from16 p50, v46

    move-object/from16 p51, v47

    move-object/from16 p52, v48

    move-object/from16 p54, v49

    move/from16 p55, v50

    move/from16 p56, v51

    move-object/from16 p57, v52

    move-object/from16 p58, v53

    move-object/from16 p59, v54

    move-object/from16 p60, v55

    move-object/from16 p61, v56

    move-object/from16 p62, v57

    move-object/from16 p63, v58

    move-object/from16 p64, v59

    move-object/from16 p66, v60

    move-object/from16 p67, v61

    move-object/from16 p68, v62

    move-object/from16 p69, v63

    move-object/from16 p70, v64

    move-object/from16 p71, v65

    move-object/from16 p72, v66

    move-object/from16 p15, p2

    move-object/from16 p2, v16

    goto :goto_53

    :cond_52
    move-object/from16 p84, p83

    goto/16 :goto_52

    .line 87
    :goto_53
    invoke-direct/range {p1 .. p84}, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/math/BigDecimal;ILjava/math/BigDecimal;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/Integer;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/Integer;ILjava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;IILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ILcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel$CouponReward;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/math/BigDecimal;ILjava/math/BigDecimal;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/Integer;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/Integer;ILjava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;IILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ILcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel$CouponReward;IIILjava/lang/Object;)Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;
    .locals 24

    .line 1
    move-object/from16 v0, p0

    move/from16 v1, p84

    move/from16 v2, p85

    move/from16 v3, p86

    and-int/lit8 v4, v1, 0x1

    if-eqz v4, :cond_0

    iget-object v4, v0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->symbolName:Ljava/lang/String;

    goto :goto_0

    :cond_0
    move-object/from16 v4, p1

    :goto_0
    and-int/lit8 v5, v1, 0x2

    if-eqz v5, :cond_1

    iget-object v5, v0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->symbolCode:Ljava/lang/String;

    goto :goto_1

    :cond_1
    move-object/from16 v5, p2

    :goto_1
    and-int/lit8 v6, v1, 0x4

    if-eqz v6, :cond_2

    iget-object v6, v0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->direction:Ljava/lang/String;

    goto :goto_2

    :cond_2
    move-object/from16 v6, p3

    :goto_2
    and-int/lit8 v7, v1, 0x8

    if-eqz v7, :cond_3

    iget-object v7, v0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->directionCode:Ljava/lang/String;

    goto :goto_3

    :cond_3
    move-object/from16 v7, p4

    :goto_3
    and-int/lit8 v8, v1, 0x10

    if-eqz v8, :cond_4

    iget v8, v0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->directionVisible:I

    goto :goto_4

    :cond_4
    move/from16 v8, p5

    :goto_4
    and-int/lit8 v9, v1, 0x20

    if-eqz v9, :cond_5

    iget-object v9, v0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->leverageValue:Ljava/lang/String;

    goto :goto_5

    :cond_5
    move-object/from16 v9, p6

    :goto_5
    and-int/lit8 v10, v1, 0x40

    if-eqz v10, :cond_6

    iget-object v10, v0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->leverage:Ljava/lang/String;

    goto :goto_6

    :cond_6
    move-object/from16 v10, p7

    :goto_6
    and-int/lit16 v11, v1, 0x80

    if-eqz v11, :cond_7

    iget-object v11, v0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->leverageBgColor:Ljava/lang/Integer;

    goto :goto_7

    :cond_7
    move-object/from16 v11, p8

    :goto_7
    and-int/lit16 v12, v1, 0x100

    if-eqz v12, :cond_8

    iget v12, v0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->leverageVisible:I

    goto :goto_8

    :cond_8
    move/from16 v12, p9

    :goto_8
    and-int/lit16 v13, v1, 0x200

    if-eqz v13, :cond_9

    iget-object v13, v0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->centerContentBgColor:Ljava/lang/Integer;

    goto :goto_9

    :cond_9
    move-object/from16 v13, p10

    :goto_9
    and-int/lit16 v14, v1, 0x400

    if-eqz v14, :cond_a

    iget-object v14, v0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->leverageTextColor:Ljava/lang/Integer;

    goto :goto_a

    :cond_a
    move-object/from16 v14, p11

    :goto_a
    and-int/lit16 v15, v1, 0x800

    if-eqz v15, :cond_b

    iget-object v15, v0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->directionBgColor:Ljava/lang/Integer;

    goto :goto_b

    :cond_b
    move-object/from16 v15, p12

    :goto_b
    move-object/from16 p1, v4

    and-int/lit16 v4, v1, 0x1000

    if-eqz v4, :cond_c

    iget-object v4, v0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->lastPrice:Ljava/lang/String;

    goto :goto_c

    :cond_c
    move-object/from16 v4, p13

    :goto_c
    move-object/from16 p2, v4

    and-int/lit16 v4, v1, 0x2000

    if-eqz v4, :cond_d

    iget-object v4, v0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->lastPriceValue:Ljava/math/BigDecimal;

    goto :goto_d

    :cond_d
    move-object/from16 v4, p14

    :goto_d
    move-object/from16 p3, v4

    and-int/lit16 v4, v1, 0x4000

    if-eqz v4, :cond_e

    iget v4, v0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->lastPriceVisible:I

    goto :goto_e

    :cond_e
    move/from16 v4, p15

    :goto_e
    const v16, 0x8000

    and-int v17, v1, v16

    if-eqz v17, :cond_f

    iget-object v1, v0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->liquidationPriceValue:Ljava/math/BigDecimal;

    goto :goto_f

    :cond_f
    move-object/from16 v1, p16

    :goto_f
    const/high16 v17, 0x10000

    and-int v18, p84, v17

    move-object/from16 p4, v1

    if-eqz v18, :cond_10

    iget-object v1, v0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->liquidationPrice:Ljava/lang/String;

    goto :goto_10

    :cond_10
    move-object/from16 v1, p17

    :goto_10
    const/high16 v18, 0x20000

    and-int v19, p84, v18

    move-object/from16 p5, v1

    if-eqz v19, :cond_11

    iget-object v1, v0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->runningTimeValue:Ljava/lang/Long;

    goto :goto_11

    :cond_11
    move-object/from16 v1, p18

    :goto_11
    const/high16 v19, 0x40000

    and-int v20, p84, v19

    move-object/from16 p6, v1

    if-eqz v20, :cond_12

    iget-object v1, v0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->runningTime:Ljava/lang/String;

    goto :goto_12

    :cond_12
    move-object/from16 v1, p19

    :goto_12
    const/high16 v20, 0x80000

    and-int v21, p84, v20

    move-object/from16 p7, v1

    if-eqz v21, :cond_13

    iget-object v1, v0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->quoteCode:Ljava/lang/String;

    goto :goto_13

    :cond_13
    move-object/from16 v1, p20

    :goto_13
    const/high16 v21, 0x100000

    and-int v22, p84, v21

    move-object/from16 p8, v1

    if-eqz v22, :cond_14

    iget-object v1, v0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->quoteName:Ljava/lang/String;

    goto :goto_14

    :cond_14
    move-object/from16 v1, p21

    :goto_14
    const/high16 v22, 0x200000

    and-int v23, p84, v22

    move-object/from16 p9, v1

    if-eqz v23, :cond_15

    iget-object v1, v0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->totalInvestText:Ljava/lang/String;

    goto :goto_15

    :cond_15
    move-object/from16 v1, p22

    :goto_15
    const/high16 v23, 0x400000

    and-int v23, p84, v23

    move-object/from16 p10, v1

    if-eqz v23, :cond_16

    iget-object v1, v0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->totalInvest:Ljava/lang/String;

    goto :goto_16

    :cond_16
    move-object/from16 v1, p23

    :goto_16
    const/high16 v23, 0x800000

    and-int v23, p84, v23

    move-object/from16 p11, v1

    if-eqz v23, :cond_17

    iget-object v1, v0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->totalInvestValue:Ljava/math/BigDecimal;

    goto :goto_17

    :cond_17
    move-object/from16 v1, p24

    :goto_17
    const/high16 v23, 0x1000000

    and-int v23, p84, v23

    move-object/from16 p12, v1

    if-eqz v23, :cond_18

    iget-object v1, v0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->totalProfitText:Ljava/lang/String;

    goto :goto_18

    :cond_18
    move-object/from16 v1, p25

    :goto_18
    const/high16 v23, 0x2000000

    and-int v23, p84, v23

    move-object/from16 p13, v1

    if-eqz v23, :cond_19

    iget-object v1, v0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->totalProfit:Ljava/lang/String;

    goto :goto_19

    :cond_19
    move-object/from16 v1, p26

    :goto_19
    const/high16 v23, 0x4000000

    and-int v23, p84, v23

    move-object/from16 p14, v1

    if-eqz v23, :cond_1a

    iget-object v1, v0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->totalProfitValue:Ljava/math/BigDecimal;

    goto :goto_1a

    :cond_1a
    move-object/from16 v1, p27

    :goto_1a
    const/high16 v23, 0x8000000

    and-int v23, p84, v23

    move-object/from16 p15, v1

    if-eqz v23, :cond_1b

    iget-object v1, v0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->totalProfitColor:Ljava/lang/Integer;

    goto :goto_1b

    :cond_1b
    move-object/from16 v1, p28

    :goto_1b
    const/high16 v23, 0x10000000

    and-int v23, p84, v23

    move-object/from16 p16, v1

    if-eqz v23, :cond_1c

    iget-object v1, v0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->totalProfitRate:Ljava/lang/String;

    goto :goto_1c

    :cond_1c
    move-object/from16 v1, p29

    :goto_1c
    const/high16 v23, 0x20000000

    and-int v23, p84, v23

    move-object/from16 p17, v1

    if-eqz v23, :cond_1d

    iget-object v1, v0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->totalProfitRateValue:Ljava/math/BigDecimal;

    goto :goto_1d

    :cond_1d
    move-object/from16 v1, p30

    :goto_1d
    const/high16 v23, 0x40000000    # 2.0f

    and-int v23, p84, v23

    move-object/from16 p18, v1

    if-eqz v23, :cond_1e

    iget-object v1, v0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->dayArbitrageNum:Ljava/lang/Integer;

    goto :goto_1e

    :cond_1e
    move-object/from16 v1, p31

    :goto_1e
    const/high16 v23, -0x80000000

    and-int v23, p84, v23

    move-object/from16 p19, v1

    if-eqz v23, :cond_1f

    iget-object v1, v0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->totalArbitrageNum:Ljava/lang/Integer;

    goto :goto_1f

    :cond_1f
    move-object/from16 v1, p32

    :goto_1f
    and-int/lit8 v23, v2, 0x1

    move-object/from16 p20, v1

    if-eqz v23, :cond_20

    iget-object v1, v0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->arbitrage:Ljava/lang/String;

    goto :goto_20

    :cond_20
    move-object/from16 v1, p33

    :goto_20
    and-int/lit8 v23, v2, 0x2

    move-object/from16 p21, v1

    if-eqz v23, :cond_21

    iget-object v1, v0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->gridProfit:Ljava/lang/String;

    goto :goto_21

    :cond_21
    move-object/from16 v1, p34

    :goto_21
    and-int/lit8 v23, v2, 0x4

    move-object/from16 p22, v1

    if-eqz v23, :cond_22

    iget-object v1, v0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->gridProfitValue:Ljava/math/BigDecimal;

    goto :goto_22

    :cond_22
    move-object/from16 v1, p35

    :goto_22
    and-int/lit8 v23, v2, 0x8

    move-object/from16 p23, v1

    if-eqz v23, :cond_23

    iget-object v1, v0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->floatAmount:Ljava/lang/String;

    goto :goto_23

    :cond_23
    move-object/from16 v1, p36

    :goto_23
    and-int/lit8 v23, v2, 0x10

    move-object/from16 p24, v1

    if-eqz v23, :cond_24

    iget-object v1, v0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->floatAmountValue:Ljava/math/BigDecimal;

    goto :goto_24

    :cond_24
    move-object/from16 v1, p37

    :goto_24
    and-int/lit8 v23, v2, 0x20

    move-object/from16 p25, v1

    if-eqz v23, :cond_25

    iget-object v1, v0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->fundingFee:Ljava/lang/String;

    goto :goto_25

    :cond_25
    move-object/from16 v1, p38

    :goto_25
    and-int/lit8 v23, v2, 0x40

    move-object/from16 p26, v1

    if-eqz v23, :cond_26

    iget-object v1, v0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->fundingFeeValue:Ljava/math/BigDecimal;

    goto :goto_26

    :cond_26
    move-object/from16 v1, p39

    :goto_26
    move-object/from16 p27, v1

    and-int/lit16 v1, v2, 0x80

    if-eqz v1, :cond_27

    iget-object v1, v0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->entryPrice:Ljava/lang/String;

    goto :goto_27

    :cond_27
    move-object/from16 v1, p40

    :goto_27
    move-object/from16 p28, v1

    and-int/lit16 v1, v2, 0x100

    if-eqz v1, :cond_28

    iget-object v1, v0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->entryPriceValue:Ljava/math/BigDecimal;

    goto :goto_28

    :cond_28
    move-object/from16 v1, p41

    :goto_28
    move-object/from16 p29, v1

    and-int/lit16 v1, v2, 0x200

    if-eqz v1, :cond_29

    iget-object v1, v0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->priceRange:Ljava/lang/String;

    goto :goto_29

    :cond_29
    move-object/from16 v1, p42

    :goto_29
    move-object/from16 p30, v1

    and-int/lit16 v1, v2, 0x400

    if-eqz v1, :cond_2a

    iget-object v1, v0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->priceRangeColor:Ljava/lang/Integer;

    goto :goto_2a

    :cond_2a
    move-object/from16 v1, p43

    :goto_2a
    move-object/from16 p31, v1

    and-int/lit16 v1, v2, 0x800

    if-eqz v1, :cond_2b

    iget v1, v0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->outPriceRange:I

    goto :goto_2b

    :cond_2b
    move/from16 v1, p44

    :goto_2b
    move/from16 p32, v1

    and-int/lit16 v1, v2, 0x1000

    if-eqz v1, :cond_2c

    iget-object v1, v0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->priceStart:Ljava/math/BigDecimal;

    goto :goto_2c

    :cond_2c
    move-object/from16 v1, p45

    :goto_2c
    move-object/from16 p33, v1

    and-int/lit16 v1, v2, 0x2000

    if-eqz v1, :cond_2d

    iget-object v1, v0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->priceEnd:Ljava/math/BigDecimal;

    goto :goto_2d

    :cond_2d
    move-object/from16 v1, p46

    :goto_2d
    move-object/from16 p34, v1

    and-int/lit16 v1, v2, 0x4000

    if-eqz v1, :cond_2e

    iget-object v1, v0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->pendingOrder:Ljava/lang/String;

    goto :goto_2e

    :cond_2e
    move-object/from16 v1, p47

    :goto_2e
    and-int v23, v2, v16

    move-object/from16 p35, v1

    if-eqz v23, :cond_2f

    iget-object v1, v0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->buyNumber:Ljava/lang/String;

    goto :goto_2f

    :cond_2f
    move-object/from16 v1, p48

    :goto_2f
    and-int v23, v2, v17

    move-object/from16 p36, v1

    if-eqz v23, :cond_30

    iget-object v1, v0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->sellNumber:Ljava/lang/String;

    goto :goto_30

    :cond_30
    move-object/from16 v1, p49

    :goto_30
    and-int v23, v2, v18

    move-object/from16 p37, v1

    if-eqz v23, :cond_31

    iget-object v1, v0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->buyNumberWidget:Ljava/lang/Float;

    goto :goto_31

    :cond_31
    move-object/from16 v1, p50

    :goto_31
    and-int v23, v2, v19

    move-object/from16 p38, v1

    if-eqz v23, :cond_32

    iget-object v1, v0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->sellNumberWidget:Ljava/lang/Float;

    goto :goto_32

    :cond_32
    move-object/from16 v1, p51

    :goto_32
    and-int v20, v2, v20

    move-object/from16 p39, v1

    if-eqz v20, :cond_33

    iget-object v1, v0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->splitWidget:Ljava/lang/Float;

    goto :goto_33

    :cond_33
    move-object/from16 v1, p52

    :goto_33
    and-int v20, v2, v21

    move-object/from16 p40, v1

    if-eqz v20, :cond_34

    iget-object v1, v0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->weightSum:Ljava/lang/Float;

    goto :goto_34

    :cond_34
    move-object/from16 v1, p53

    :goto_34
    and-int v20, v2, v22

    move-object/from16 p41, v1

    if-eqz v20, :cond_35

    iget v1, v0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->pendingOrderNumberSellColor:I

    goto :goto_35

    :cond_35
    move/from16 v1, p54

    :goto_35
    const/high16 v20, 0x400000

    and-int v20, v2, v20

    move/from16 p42, v1

    if-eqz v20, :cond_36

    iget v1, v0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->pendingOrderNumberBuyColor:I

    goto :goto_36

    :cond_36
    move/from16 v1, p55

    :goto_36
    const/high16 v20, 0x800000

    and-int v20, v2, v20

    move/from16 p43, v1

    if-eqz v20, :cond_37

    iget-object v1, v0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->buyNumberBg:Ljava/lang/Integer;

    goto :goto_37

    :cond_37
    move-object/from16 v1, p56

    :goto_37
    const/high16 v20, 0x1000000

    and-int v20, v2, v20

    move-object/from16 p44, v1

    if-eqz v20, :cond_38

    iget-object v1, v0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->sellNumberBg:Ljava/lang/Integer;

    goto :goto_38

    :cond_38
    move-object/from16 v1, p57

    :goto_38
    const/high16 v20, 0x2000000

    and-int v20, v2, v20

    move-object/from16 p45, v1

    if-eqz v20, :cond_39

    iget-object v1, v0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->taskId:Ljava/lang/Long;

    goto :goto_39

    :cond_39
    move-object/from16 v1, p58

    :goto_39
    const/high16 v20, 0x4000000

    and-int v20, v2, v20

    move-object/from16 p46, v1

    if-eqz v20, :cond_3a

    iget-object v1, v0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->runningStatus:Ljava/lang/String;

    goto :goto_3a

    :cond_3a
    move-object/from16 v1, p59

    :goto_3a
    const/high16 v20, 0x8000000

    and-int v20, v2, v20

    move-object/from16 p47, v1

    if-eqz v20, :cond_3b

    iget-object v1, v0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->viewType:Ljava/lang/Integer;

    goto :goto_3b

    :cond_3b
    move-object/from16 v1, p60

    :goto_3b
    const/high16 v20, 0x10000000

    and-int v20, v2, v20

    move-object/from16 p48, v1

    if-eqz v20, :cond_3c

    iget-object v1, v0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->pricePrecision:Ljava/lang/Integer;

    goto :goto_3c

    :cond_3c
    move-object/from16 v1, p61

    :goto_3c
    const/high16 v20, 0x20000000

    and-int v20, v2, v20

    move-object/from16 p49, v1

    if-eqz v20, :cond_3d

    iget-object v1, v0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->profitPrecision:Ljava/lang/Integer;

    goto :goto_3d

    :cond_3d
    move-object/from16 v1, p62

    :goto_3d
    const/high16 v20, 0x40000000    # 2.0f

    and-int v20, v2, v20

    move-object/from16 p50, v1

    if-eqz v20, :cond_3e

    iget-object v1, v0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->openUnitPriceValue:Ljava/math/BigDecimal;

    goto :goto_3e

    :cond_3e
    move-object/from16 v1, p63

    :goto_3e
    const/high16 v20, -0x80000000

    and-int v2, v2, v20

    if-eqz v2, :cond_3f

    iget-object v2, v0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->openUnitPrice:Ljava/lang/String;

    goto :goto_3f

    :cond_3f
    move-object/from16 v2, p64

    :goto_3f
    and-int/lit8 v20, v3, 0x1

    move-object/from16 p51, v1

    if-eqz v20, :cond_40

    iget-object v1, v0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->endTime:Ljava/lang/Long;

    goto :goto_40

    :cond_40
    move-object/from16 v1, p65

    :goto_40
    and-int/lit8 v20, v3, 0x2

    move-object/from16 p52, v1

    if-eqz v20, :cond_41

    iget-object v1, v0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->loadingString:Ljava/lang/String;

    goto :goto_41

    :cond_41
    move-object/from16 v1, p66

    :goto_41
    and-int/lit8 v20, v3, 0x4

    move-object/from16 p53, v1

    if-eqz v20, :cond_42

    iget-object v1, v0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->notTradingOrderPrice:Ljava/lang/String;

    goto :goto_42

    :cond_42
    move-object/from16 v1, p67

    :goto_42
    and-int/lit8 v20, v3, 0x8

    move-object/from16 p54, v1

    if-eqz v20, :cond_43

    iget-object v1, v0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->isOpenUnit:Ljava/lang/Boolean;

    goto :goto_43

    :cond_43
    move-object/from16 v1, p68

    :goto_43
    and-int/lit8 v20, v3, 0x10

    move-object/from16 p55, v1

    if-eqz v20, :cond_44

    iget-object v1, v0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->isRisk:Ljava/lang/Boolean;

    goto :goto_44

    :cond_44
    move-object/from16 v1, p69

    :goto_44
    and-int/lit8 v20, v3, 0x20

    move-object/from16 p56, v1

    if-eqz v20, :cond_45

    iget-object v1, v0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->futuresGridProtectionTip:Ljava/lang/String;

    goto :goto_45

    :cond_45
    move-object/from16 v1, p70

    :goto_45
    and-int/lit8 v20, v3, 0x40

    move-object/from16 p57, v1

    if-eqz v20, :cond_46

    iget-object v1, v0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->riskLimitTimeValue:Ljava/lang/Long;

    goto :goto_46

    :cond_46
    move-object/from16 v1, p71

    :goto_46
    move-object/from16 p58, v1

    and-int/lit16 v1, v3, 0x80

    if-eqz v1, :cond_47

    iget-object v1, v0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->riskLimitTime:Ljava/lang/String;

    goto :goto_47

    :cond_47
    move-object/from16 v1, p72

    :goto_47
    move-object/from16 p59, v1

    and-int/lit16 v1, v3, 0x100

    if-eqz v1, :cond_48

    iget-object v1, v0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->stopLossPriceValue:Ljava/math/BigDecimal;

    goto :goto_48

    :cond_48
    move-object/from16 v1, p73

    :goto_48
    move-object/from16 p60, v1

    and-int/lit16 v1, v3, 0x200

    if-eqz v1, :cond_49

    iget-object v1, v0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->stopLossPrice:Ljava/lang/String;

    goto :goto_49

    :cond_49
    move-object/from16 v1, p74

    :goto_49
    move-object/from16 p61, v1

    and-int/lit16 v1, v3, 0x400

    if-eqz v1, :cond_4a

    iget-object v1, v0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->stopProfitPriceValue:Ljava/math/BigDecimal;

    goto :goto_4a

    :cond_4a
    move-object/from16 v1, p75

    :goto_4a
    move-object/from16 p62, v1

    and-int/lit16 v1, v3, 0x800

    if-eqz v1, :cond_4b

    iget-object v1, v0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->stopProfitPrice:Ljava/lang/String;

    goto :goto_4b

    :cond_4b
    move-object/from16 v1, p76

    :goto_4b
    move-object/from16 p63, v1

    and-int/lit16 v1, v3, 0x1000

    if-eqz v1, :cond_4c

    iget-object v1, v0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->stopReason:Ljava/lang/String;

    goto :goto_4c

    :cond_4c
    move-object/from16 v1, p77

    :goto_4c
    move-object/from16 p64, v1

    and-int/lit16 v1, v3, 0x2000

    if-eqz v1, :cond_4d

    iget-object v1, v0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->stopPriceText:Ljava/lang/String;

    goto :goto_4d

    :cond_4d
    move-object/from16 v1, p78

    :goto_4d
    move-object/from16 p65, v1

    and-int/lit16 v1, v3, 0x4000

    if-eqz v1, :cond_4e

    iget-object v1, v0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->stopPriceNumber:Ljava/lang/String;

    goto :goto_4e

    :cond_4e
    move-object/from16 v1, p79

    :goto_4e
    and-int v16, v3, v16

    move-object/from16 p66, v1

    if-eqz v16, :cond_4f

    iget-object v1, v0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->stopReasonDetail:Ljava/lang/String;

    goto :goto_4f

    :cond_4f
    move-object/from16 v1, p80

    :goto_4f
    and-int v16, v3, v17

    move-object/from16 p67, v1

    if-eqz v16, :cond_50

    iget-object v1, v0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->transfers:Ljava/util/List;

    goto :goto_50

    :cond_50
    move-object/from16 v1, p81

    :goto_50
    and-int v16, v3, v18

    move-object/from16 p68, v1

    if-eqz v16, :cond_51

    iget v1, v0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->totalInvestVisible:I

    goto :goto_51

    :cond_51
    move/from16 v1, p82

    :goto_51
    and-int v3, v3, v19

    if-eqz v3, :cond_52

    iget-object v3, v0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->couponReward:Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel$CouponReward;

    move-object/from16 p84, v3

    :goto_52
    move-object/from16 p69, p55

    move-object/from16 p70, p56

    move-object/from16 p71, p57

    move-object/from16 p72, p58

    move-object/from16 p73, p59

    move-object/from16 p74, p60

    move-object/from16 p75, p61

    move-object/from16 p76, p62

    move-object/from16 p77, p63

    move-object/from16 p78, p64

    move-object/from16 p79, p65

    move-object/from16 p80, p66

    move-object/from16 p81, p67

    move-object/from16 p82, p68

    move/from16 p83, v1

    move-object/from16 p65, v2

    move/from16 p55, p42

    move/from16 p56, p43

    move-object/from16 p57, p44

    move-object/from16 p58, p45

    move-object/from16 p59, p46

    move-object/from16 p60, p47

    move-object/from16 p61, p48

    move-object/from16 p62, p49

    move-object/from16 p63, p50

    move-object/from16 p64, p51

    move-object/from16 p66, p52

    move-object/from16 p67, p53

    move-object/from16 p68, p54

    move-object/from16 p42, p29

    move-object/from16 p43, p30

    move-object/from16 p44, p31

    move/from16 p45, p32

    move-object/from16 p46, p33

    move-object/from16 p47, p34

    move-object/from16 p48, p35

    move-object/from16 p49, p36

    move-object/from16 p50, p37

    move-object/from16 p51, p38

    move-object/from16 p52, p39

    move-object/from16 p53, p40

    move-object/from16 p54, p41

    move-object/from16 p29, p16

    move-object/from16 p30, p17

    move-object/from16 p31, p18

    move-object/from16 p32, p19

    move-object/from16 p33, p20

    move-object/from16 p34, p21

    move-object/from16 p35, p22

    move-object/from16 p36, p23

    move-object/from16 p37, p24

    move-object/from16 p38, p25

    move-object/from16 p39, p26

    move-object/from16 p40, p27

    move-object/from16 p41, p28

    move/from16 p16, v4

    move-object/from16 p17, p4

    move-object/from16 p18, p5

    move-object/from16 p19, p6

    move-object/from16 p20, p7

    move-object/from16 p21, p8

    move-object/from16 p22, p9

    move-object/from16 p23, p10

    move-object/from16 p24, p11

    move-object/from16 p25, p12

    move-object/from16 p26, p13

    move-object/from16 p27, p14

    move-object/from16 p28, p15

    move-object/from16 p4, v6

    move-object/from16 p5, v7

    move/from16 p6, v8

    move-object/from16 p7, v9

    move-object/from16 p8, v10

    move-object/from16 p9, v11

    move/from16 p10, v12

    move-object/from16 p11, v13

    move-object/from16 p12, v14

    move-object/from16 p13, v15

    move-object/from16 p14, p2

    move-object/from16 p15, p3

    move-object/from16 p3, v5

    move-object/from16 p2, p1

    move-object/from16 p1, v0

    goto :goto_53

    :cond_52
    move-object/from16 p84, p83

    goto/16 :goto_52

    :goto_53
    invoke-virtual/range {p1 .. p84}, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/math/BigDecimal;ILjava/math/BigDecimal;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/Integer;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/Integer;ILjava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;IILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ILcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel$CouponReward;)Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->symbolName:Ljava/lang/String;

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
    .line 58
    .line 59
.end method

.method public final component10()Ljava/lang/Integer;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->centerContentBgColor:Ljava/lang/Integer;

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
    .line 58
    .line 59
.end method

.method public final component11()Ljava/lang/Integer;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->leverageTextColor:Ljava/lang/Integer;

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
    .line 58
    .line 59
.end method

.method public final component12()Ljava/lang/Integer;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->directionBgColor:Ljava/lang/Integer;

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
    .line 58
    .line 59
.end method

.method public final component13()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->lastPrice:Ljava/lang/String;

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
    .line 58
    .line 59
.end method

.method public final component14()Ljava/math/BigDecimal;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->lastPriceValue:Ljava/math/BigDecimal;

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
    .line 58
    .line 59
.end method

.method public final component15()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->lastPriceVisible:I

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
    .line 58
    .line 59
.end method

.method public final component16()Ljava/math/BigDecimal;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->liquidationPriceValue:Ljava/math/BigDecimal;

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
    .line 58
    .line 59
.end method

.method public final component17()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->liquidationPrice:Ljava/lang/String;

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
    .line 58
    .line 59
.end method

.method public final component18()Ljava/lang/Long;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->runningTimeValue:Ljava/lang/Long;

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
    .line 58
    .line 59
.end method

.method public final component19()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->runningTime:Ljava/lang/String;

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
    .line 58
    .line 59
.end method

.method public final component2()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->symbolCode:Ljava/lang/String;

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
    .line 58
    .line 59
.end method

.method public final component20()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->quoteCode:Ljava/lang/String;

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
    .line 58
    .line 59
.end method

.method public final component21()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->quoteName:Ljava/lang/String;

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
    .line 58
    .line 59
.end method

.method public final component22()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->totalInvestText:Ljava/lang/String;

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
    .line 58
    .line 59
.end method

.method public final component23()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->totalInvest:Ljava/lang/String;

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
    .line 58
    .line 59
.end method

.method public final component24()Ljava/math/BigDecimal;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->totalInvestValue:Ljava/math/BigDecimal;

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
    .line 58
    .line 59
.end method

.method public final component25()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->totalProfitText:Ljava/lang/String;

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
    .line 58
    .line 59
.end method

.method public final component26()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->totalProfit:Ljava/lang/String;

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
    .line 58
    .line 59
.end method

.method public final component27()Ljava/math/BigDecimal;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->totalProfitValue:Ljava/math/BigDecimal;

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
    .line 58
    .line 59
.end method

.method public final component28()Ljava/lang/Integer;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->totalProfitColor:Ljava/lang/Integer;

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
    .line 58
    .line 59
.end method

.method public final component29()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->totalProfitRate:Ljava/lang/String;

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
    .line 58
    .line 59
.end method

.method public final component3()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->direction:Ljava/lang/String;

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
    .line 58
    .line 59
.end method

.method public final component30()Ljava/math/BigDecimal;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->totalProfitRateValue:Ljava/math/BigDecimal;

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
    .line 58
    .line 59
.end method

.method public final component31()Ljava/lang/Integer;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->dayArbitrageNum:Ljava/lang/Integer;

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
    .line 58
    .line 59
.end method

.method public final component32()Ljava/lang/Integer;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->totalArbitrageNum:Ljava/lang/Integer;

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
    .line 58
    .line 59
.end method

.method public final component33()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->arbitrage:Ljava/lang/String;

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
    .line 58
    .line 59
.end method

.method public final component34()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->gridProfit:Ljava/lang/String;

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
    .line 58
    .line 59
.end method

.method public final component35()Ljava/math/BigDecimal;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->gridProfitValue:Ljava/math/BigDecimal;

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
    .line 58
    .line 59
.end method

.method public final component36()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->floatAmount:Ljava/lang/String;

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
    .line 58
    .line 59
.end method

.method public final component37()Ljava/math/BigDecimal;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->floatAmountValue:Ljava/math/BigDecimal;

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
    .line 58
    .line 59
.end method

.method public final component38()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->fundingFee:Ljava/lang/String;

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
    .line 58
    .line 59
.end method

.method public final component39()Ljava/math/BigDecimal;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->fundingFeeValue:Ljava/math/BigDecimal;

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
    .line 58
    .line 59
.end method

.method public final component4()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->directionCode:Ljava/lang/String;

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
    .line 58
    .line 59
.end method

.method public final component40()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->entryPrice:Ljava/lang/String;

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
    .line 58
    .line 59
.end method

.method public final component41()Ljava/math/BigDecimal;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->entryPriceValue:Ljava/math/BigDecimal;

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
    .line 58
    .line 59
.end method

.method public final component42()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->priceRange:Ljava/lang/String;

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
    .line 58
    .line 59
.end method

.method public final component43()Ljava/lang/Integer;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->priceRangeColor:Ljava/lang/Integer;

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
    .line 58
    .line 59
.end method

.method public final component44()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->outPriceRange:I

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
    .line 58
    .line 59
.end method

.method public final component45()Ljava/math/BigDecimal;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->priceStart:Ljava/math/BigDecimal;

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
    .line 58
    .line 59
.end method

.method public final component46()Ljava/math/BigDecimal;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->priceEnd:Ljava/math/BigDecimal;

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
    .line 58
    .line 59
.end method

.method public final component47()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->pendingOrder:Ljava/lang/String;

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
    .line 58
    .line 59
.end method

.method public final component48()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->buyNumber:Ljava/lang/String;

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
    .line 58
    .line 59
.end method

.method public final component49()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->sellNumber:Ljava/lang/String;

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
    .line 58
    .line 59
.end method

.method public final component5()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->directionVisible:I

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
    .line 58
    .line 59
.end method

.method public final component50()Ljava/lang/Float;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->buyNumberWidget:Ljava/lang/Float;

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
    .line 58
    .line 59
.end method

.method public final component51()Ljava/lang/Float;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->sellNumberWidget:Ljava/lang/Float;

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
    .line 58
    .line 59
.end method

.method public final component52()Ljava/lang/Float;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->splitWidget:Ljava/lang/Float;

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
    .line 58
    .line 59
.end method

.method public final component53()Ljava/lang/Float;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->weightSum:Ljava/lang/Float;

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
    .line 58
    .line 59
.end method

.method public final component54()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->pendingOrderNumberSellColor:I

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
    .line 58
    .line 59
.end method

.method public final component55()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->pendingOrderNumberBuyColor:I

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
    .line 58
    .line 59
.end method

.method public final component56()Ljava/lang/Integer;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->buyNumberBg:Ljava/lang/Integer;

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
    .line 58
    .line 59
.end method

.method public final component57()Ljava/lang/Integer;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->sellNumberBg:Ljava/lang/Integer;

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
    .line 58
    .line 59
.end method

.method public final component58()Ljava/lang/Long;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->taskId:Ljava/lang/Long;

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
    .line 58
    .line 59
.end method

.method public final component59()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->runningStatus:Ljava/lang/String;

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
    .line 58
    .line 59
.end method

.method public final component6()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->leverageValue:Ljava/lang/String;

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
    .line 58
    .line 59
.end method

.method public final component60()Ljava/lang/Integer;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->viewType:Ljava/lang/Integer;

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
    .line 58
    .line 59
.end method

.method public final component61()Ljava/lang/Integer;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->pricePrecision:Ljava/lang/Integer;

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
    .line 58
    .line 59
.end method

.method public final component62()Ljava/lang/Integer;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->profitPrecision:Ljava/lang/Integer;

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
    .line 58
    .line 59
.end method

.method public final component63()Ljava/math/BigDecimal;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->openUnitPriceValue:Ljava/math/BigDecimal;

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
    .line 58
    .line 59
.end method

.method public final component64()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->openUnitPrice:Ljava/lang/String;

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
    .line 58
    .line 59
.end method

.method public final component65()Ljava/lang/Long;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->endTime:Ljava/lang/Long;

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
    .line 58
    .line 59
.end method

.method public final component66()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->loadingString:Ljava/lang/String;

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
    .line 58
    .line 59
.end method

.method public final component67()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->notTradingOrderPrice:Ljava/lang/String;

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
    .line 58
    .line 59
.end method

.method public final component68()Ljava/lang/Boolean;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->isOpenUnit:Ljava/lang/Boolean;

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
    .line 58
    .line 59
.end method

.method public final component69()Ljava/lang/Boolean;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->isRisk:Ljava/lang/Boolean;

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
    .line 58
    .line 59
.end method

.method public final component7()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->leverage:Ljava/lang/String;

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
    .line 58
    .line 59
.end method

.method public final component70()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->futuresGridProtectionTip:Ljava/lang/String;

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
    .line 58
    .line 59
.end method

.method public final component71()Ljava/lang/Long;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->riskLimitTimeValue:Ljava/lang/Long;

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
    .line 58
    .line 59
.end method

.method public final component72()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->riskLimitTime:Ljava/lang/String;

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
    .line 58
    .line 59
.end method

.method public final component73()Ljava/math/BigDecimal;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->stopLossPriceValue:Ljava/math/BigDecimal;

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
    .line 58
    .line 59
.end method

.method public final component74()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->stopLossPrice:Ljava/lang/String;

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
    .line 58
    .line 59
.end method

.method public final component75()Ljava/math/BigDecimal;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->stopProfitPriceValue:Ljava/math/BigDecimal;

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
    .line 58
    .line 59
.end method

.method public final component76()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->stopProfitPrice:Ljava/lang/String;

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
    .line 58
    .line 59
.end method

.method public final component77()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->stopReason:Ljava/lang/String;

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
    .line 58
    .line 59
.end method

.method public final component78()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->stopPriceText:Ljava/lang/String;

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
    .line 58
    .line 59
.end method

.method public final component79()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->stopPriceNumber:Ljava/lang/String;

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
    .line 58
    .line 59
.end method

.method public final component8()Ljava/lang/Integer;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->leverageBgColor:Ljava/lang/Integer;

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
    .line 58
    .line 59
.end method

.method public final component80()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->stopReasonDetail:Ljava/lang/String;

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
    .line 58
    .line 59
.end method

.method public final component81()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel$Transfer;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->transfers:Ljava/util/List;

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
    .line 58
    .line 59
.end method

.method public final component82()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->totalInvestVisible:I

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
    .line 58
    .line 59
.end method

.method public final component83()Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel$CouponReward;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->couponReward:Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel$CouponReward;

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
    .line 58
    .line 59
.end method

.method public final component9()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->leverageVisible:I

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
    .line 58
    .line 59
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/math/BigDecimal;ILjava/math/BigDecimal;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/Integer;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/Integer;ILjava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;IILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ILcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel$CouponReward;)Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;
    .locals 84
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p6    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p7    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p8    # Ljava/lang/Integer;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p10    # Ljava/lang/Integer;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p11    # Ljava/lang/Integer;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p12    # Ljava/lang/Integer;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p13    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p14    # Ljava/math/BigDecimal;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p16    # Ljava/math/BigDecimal;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p17    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p18    # Ljava/lang/Long;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p19    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p20    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p21    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p22    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p23    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p24    # Ljava/math/BigDecimal;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p25    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p26    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p27    # Ljava/math/BigDecimal;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p28    # Ljava/lang/Integer;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p29    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p30    # Ljava/math/BigDecimal;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p31    # Ljava/lang/Integer;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p32    # Ljava/lang/Integer;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p33    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p34    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p35    # Ljava/math/BigDecimal;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p36    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p37    # Ljava/math/BigDecimal;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p38    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p39    # Ljava/math/BigDecimal;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p40    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p41    # Ljava/math/BigDecimal;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p42    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p43    # Ljava/lang/Integer;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p45    # Ljava/math/BigDecimal;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p46    # Ljava/math/BigDecimal;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p47    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p48    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p49    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p50    # Ljava/lang/Float;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p51    # Ljava/lang/Float;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p52    # Ljava/lang/Float;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p53    # Ljava/lang/Float;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p56    # Ljava/lang/Integer;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p57    # Ljava/lang/Integer;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p58    # Ljava/lang/Long;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p59    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p60    # Ljava/lang/Integer;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p61    # Ljava/lang/Integer;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p62    # Ljava/lang/Integer;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p63    # Ljava/math/BigDecimal;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p64    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p65    # Ljava/lang/Long;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p66    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p67    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p68    # Ljava/lang/Boolean;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p69    # Ljava/lang/Boolean;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p70    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p71    # Ljava/lang/Long;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p72    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p73    # Ljava/math/BigDecimal;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p74    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p75    # Ljava/math/BigDecimal;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p76    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p77    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p78    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p79    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p80    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p81    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p83    # Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel$CouponReward;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "I",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            "I",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            "Ljava/lang/String;",
            "Ljava/math/BigDecimal;",
            "I",
            "Ljava/math/BigDecimal;",
            "Ljava/lang/String;",
            "Ljava/lang/Long;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/math/BigDecimal;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/math/BigDecimal;",
            "Ljava/lang/Integer;",
            "Ljava/lang/String;",
            "Ljava/math/BigDecimal;",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/math/BigDecimal;",
            "Ljava/lang/String;",
            "Ljava/math/BigDecimal;",
            "Ljava/lang/String;",
            "Ljava/math/BigDecimal;",
            "Ljava/lang/String;",
            "Ljava/math/BigDecimal;",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            "I",
            "Ljava/math/BigDecimal;",
            "Ljava/math/BigDecimal;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/Float;",
            "Ljava/lang/Float;",
            "Ljava/lang/Float;",
            "Ljava/lang/Float;",
            "II",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            "Ljava/lang/Long;",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            "Ljava/math/BigDecimal;",
            "Ljava/lang/String;",
            "Ljava/lang/Long;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/String;",
            "Ljava/lang/Long;",
            "Ljava/lang/String;",
            "Ljava/math/BigDecimal;",
            "Ljava/lang/String;",
            "Ljava/math/BigDecimal;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel$Transfer;",
            ">;I",
            "Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel$CouponReward;",
            ")",
            "Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    new-instance v0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    move/from16 v5, p5

    move-object/from16 v6, p6

    move-object/from16 v7, p7

    move-object/from16 v8, p8

    move/from16 v9, p9

    move-object/from16 v10, p10

    move-object/from16 v11, p11

    move-object/from16 v12, p12

    move-object/from16 v13, p13

    move-object/from16 v14, p14

    move/from16 v15, p15

    move-object/from16 v16, p16

    move-object/from16 v17, p17

    move-object/from16 v18, p18

    move-object/from16 v19, p19

    move-object/from16 v20, p20

    move-object/from16 v21, p21

    move-object/from16 v22, p22

    move-object/from16 v23, p23

    move-object/from16 v24, p24

    move-object/from16 v25, p25

    move-object/from16 v26, p26

    move-object/from16 v27, p27

    move-object/from16 v28, p28

    move-object/from16 v29, p29

    move-object/from16 v30, p30

    move-object/from16 v31, p31

    move-object/from16 v32, p32

    move-object/from16 v33, p33

    move-object/from16 v34, p34

    move-object/from16 v35, p35

    move-object/from16 v36, p36

    move-object/from16 v37, p37

    move-object/from16 v38, p38

    move-object/from16 v39, p39

    move-object/from16 v40, p40

    move-object/from16 v41, p41

    move-object/from16 v42, p42

    move-object/from16 v43, p43

    move/from16 v44, p44

    move-object/from16 v45, p45

    move-object/from16 v46, p46

    move-object/from16 v47, p47

    move-object/from16 v48, p48

    move-object/from16 v49, p49

    move-object/from16 v50, p50

    move-object/from16 v51, p51

    move-object/from16 v52, p52

    move-object/from16 v53, p53

    move/from16 v54, p54

    move/from16 v55, p55

    move-object/from16 v56, p56

    move-object/from16 v57, p57

    move-object/from16 v58, p58

    move-object/from16 v59, p59

    move-object/from16 v60, p60

    move-object/from16 v61, p61

    move-object/from16 v62, p62

    move-object/from16 v63, p63

    move-object/from16 v64, p64

    move-object/from16 v65, p65

    move-object/from16 v66, p66

    move-object/from16 v67, p67

    move-object/from16 v68, p68

    move-object/from16 v69, p69

    move-object/from16 v70, p70

    move-object/from16 v71, p71

    move-object/from16 v72, p72

    move-object/from16 v73, p73

    move-object/from16 v74, p74

    move-object/from16 v75, p75

    move-object/from16 v76, p76

    move-object/from16 v77, p77

    move-object/from16 v78, p78

    move-object/from16 v79, p79

    move-object/from16 v80, p80

    move-object/from16 v81, p81

    move/from16 v82, p82

    move-object/from16 v83, p83

    invoke-direct/range {v0 .. v83}, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/math/BigDecimal;ILjava/math/BigDecimal;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/Integer;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/Integer;ILjava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;IILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ILcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel$CouponReward;)V

    return-object v0
.end method

.method public final describeContents()I
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
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
    .line 58
    .line 59
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    const/4 v0, 0x1

    .line 2
    .line 3
    if-ne p0, p1, :cond_0

    .line 4
    return v0

    .line 5
    .line 6
    :cond_0
    instance-of v1, p1, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;

    .line 7
    const/4 v2, 0x0

    .line 8
    .line 9
    if-nez v1, :cond_1

    .line 10
    return v2

    .line 11
    .line 12
    :cond_1
    check-cast p1, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;

    .line 13
    .line 14
    iget-object v1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->symbolName:Ljava/lang/String;

    .line 15
    .line 16
    iget-object v3, p1, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->symbolName:Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 20
    move-result v1

    .line 21
    .line 22
    if-nez v1, :cond_2

    .line 23
    return v2

    .line 24
    .line 25
    :cond_2
    iget-object v1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->symbolCode:Ljava/lang/String;

    .line 26
    .line 27
    iget-object v3, p1, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->symbolCode:Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 31
    move-result v1

    .line 32
    .line 33
    if-nez v1, :cond_3

    .line 34
    return v2

    .line 35
    .line 36
    :cond_3
    iget-object v1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->direction:Ljava/lang/String;

    .line 37
    .line 38
    iget-object v3, p1, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->direction:Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 42
    move-result v1

    .line 43
    .line 44
    if-nez v1, :cond_4

    .line 45
    return v2

    .line 46
    .line 47
    :cond_4
    iget-object v1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->directionCode:Ljava/lang/String;

    .line 48
    .line 49
    iget-object v3, p1, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->directionCode:Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 53
    move-result v1

    .line 54
    .line 55
    if-nez v1, :cond_5

    .line 56
    return v2

    .line 57
    .line 58
    :cond_5
    iget v1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->directionVisible:I

    .line 59
    .line 60
    iget v3, p1, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->directionVisible:I

    .line 61
    .line 62
    if-eq v1, v3, :cond_6

    .line 63
    return v2

    .line 64
    .line 65
    :cond_6
    iget-object v1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->leverageValue:Ljava/lang/String;

    .line 66
    .line 67
    iget-object v3, p1, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->leverageValue:Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 71
    move-result v1

    .line 72
    .line 73
    if-nez v1, :cond_7

    .line 74
    return v2

    .line 75
    .line 76
    :cond_7
    iget-object v1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->leverage:Ljava/lang/String;

    .line 77
    .line 78
    iget-object v3, p1, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->leverage:Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 82
    move-result v1

    .line 83
    .line 84
    if-nez v1, :cond_8

    .line 85
    return v2

    .line 86
    .line 87
    :cond_8
    iget-object v1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->leverageBgColor:Ljava/lang/Integer;

    .line 88
    .line 89
    iget-object v3, p1, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->leverageBgColor:Ljava/lang/Integer;

    .line 90
    .line 91
    .line 92
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 93
    move-result v1

    .line 94
    .line 95
    if-nez v1, :cond_9

    .line 96
    return v2

    .line 97
    .line 98
    :cond_9
    iget v1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->leverageVisible:I

    .line 99
    .line 100
    iget v3, p1, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->leverageVisible:I

    .line 101
    .line 102
    if-eq v1, v3, :cond_a

    .line 103
    return v2

    .line 104
    .line 105
    :cond_a
    iget-object v1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->centerContentBgColor:Ljava/lang/Integer;

    .line 106
    .line 107
    iget-object v3, p1, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->centerContentBgColor:Ljava/lang/Integer;

    .line 108
    .line 109
    .line 110
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 111
    move-result v1

    .line 112
    .line 113
    if-nez v1, :cond_b

    .line 114
    return v2

    .line 115
    .line 116
    :cond_b
    iget-object v1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->leverageTextColor:Ljava/lang/Integer;

    .line 117
    .line 118
    iget-object v3, p1, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->leverageTextColor:Ljava/lang/Integer;

    .line 119
    .line 120
    .line 121
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 122
    move-result v1

    .line 123
    .line 124
    if-nez v1, :cond_c

    .line 125
    return v2

    .line 126
    .line 127
    :cond_c
    iget-object v1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->directionBgColor:Ljava/lang/Integer;

    .line 128
    .line 129
    iget-object v3, p1, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->directionBgColor:Ljava/lang/Integer;

    .line 130
    .line 131
    .line 132
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 133
    move-result v1

    .line 134
    .line 135
    if-nez v1, :cond_d

    .line 136
    return v2

    .line 137
    .line 138
    :cond_d
    iget-object v1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->lastPrice:Ljava/lang/String;

    .line 139
    .line 140
    iget-object v3, p1, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->lastPrice:Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 144
    move-result v1

    .line 145
    .line 146
    if-nez v1, :cond_e

    .line 147
    return v2

    .line 148
    .line 149
    :cond_e
    iget-object v1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->lastPriceValue:Ljava/math/BigDecimal;

    .line 150
    .line 151
    iget-object v3, p1, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->lastPriceValue:Ljava/math/BigDecimal;

    .line 152
    .line 153
    .line 154
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 155
    move-result v1

    .line 156
    .line 157
    if-nez v1, :cond_f

    .line 158
    return v2

    .line 159
    .line 160
    :cond_f
    iget v1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->lastPriceVisible:I

    .line 161
    .line 162
    iget v3, p1, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->lastPriceVisible:I

    .line 163
    .line 164
    if-eq v1, v3, :cond_10

    .line 165
    return v2

    .line 166
    .line 167
    :cond_10
    iget-object v1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->liquidationPriceValue:Ljava/math/BigDecimal;

    .line 168
    .line 169
    iget-object v3, p1, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->liquidationPriceValue:Ljava/math/BigDecimal;

    .line 170
    .line 171
    .line 172
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 173
    move-result v1

    .line 174
    .line 175
    if-nez v1, :cond_11

    .line 176
    return v2

    .line 177
    .line 178
    :cond_11
    iget-object v1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->liquidationPrice:Ljava/lang/String;

    .line 179
    .line 180
    iget-object v3, p1, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->liquidationPrice:Ljava/lang/String;

    .line 181
    .line 182
    .line 183
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 184
    move-result v1

    .line 185
    .line 186
    if-nez v1, :cond_12

    .line 187
    return v2

    .line 188
    .line 189
    :cond_12
    iget-object v1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->runningTimeValue:Ljava/lang/Long;

    .line 190
    .line 191
    iget-object v3, p1, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->runningTimeValue:Ljava/lang/Long;

    .line 192
    .line 193
    .line 194
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 195
    move-result v1

    .line 196
    .line 197
    if-nez v1, :cond_13

    .line 198
    return v2

    .line 199
    .line 200
    :cond_13
    iget-object v1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->runningTime:Ljava/lang/String;

    .line 201
    .line 202
    iget-object v3, p1, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->runningTime:Ljava/lang/String;

    .line 203
    .line 204
    .line 205
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 206
    move-result v1

    .line 207
    .line 208
    if-nez v1, :cond_14

    .line 209
    return v2

    .line 210
    .line 211
    :cond_14
    iget-object v1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->quoteCode:Ljava/lang/String;

    .line 212
    .line 213
    iget-object v3, p1, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->quoteCode:Ljava/lang/String;

    .line 214
    .line 215
    .line 216
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 217
    move-result v1

    .line 218
    .line 219
    if-nez v1, :cond_15

    .line 220
    return v2

    .line 221
    .line 222
    :cond_15
    iget-object v1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->quoteName:Ljava/lang/String;

    .line 223
    .line 224
    iget-object v3, p1, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->quoteName:Ljava/lang/String;

    .line 225
    .line 226
    .line 227
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 228
    move-result v1

    .line 229
    .line 230
    if-nez v1, :cond_16

    .line 231
    return v2

    .line 232
    .line 233
    :cond_16
    iget-object v1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->totalInvestText:Ljava/lang/String;

    .line 234
    .line 235
    iget-object v3, p1, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->totalInvestText:Ljava/lang/String;

    .line 236
    .line 237
    .line 238
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 239
    move-result v1

    .line 240
    .line 241
    if-nez v1, :cond_17

    .line 242
    return v2

    .line 243
    .line 244
    :cond_17
    iget-object v1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->totalInvest:Ljava/lang/String;

    .line 245
    .line 246
    iget-object v3, p1, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->totalInvest:Ljava/lang/String;

    .line 247
    .line 248
    .line 249
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 250
    move-result v1

    .line 251
    .line 252
    if-nez v1, :cond_18

    .line 253
    return v2

    .line 254
    .line 255
    :cond_18
    iget-object v1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->totalInvestValue:Ljava/math/BigDecimal;

    .line 256
    .line 257
    iget-object v3, p1, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->totalInvestValue:Ljava/math/BigDecimal;

    .line 258
    .line 259
    .line 260
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 261
    move-result v1

    .line 262
    .line 263
    if-nez v1, :cond_19

    .line 264
    return v2

    .line 265
    .line 266
    :cond_19
    iget-object v1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->totalProfitText:Ljava/lang/String;

    .line 267
    .line 268
    iget-object v3, p1, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->totalProfitText:Ljava/lang/String;

    .line 269
    .line 270
    .line 271
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 272
    move-result v1

    .line 273
    .line 274
    if-nez v1, :cond_1a

    .line 275
    return v2

    .line 276
    .line 277
    :cond_1a
    iget-object v1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->totalProfit:Ljava/lang/String;

    .line 278
    .line 279
    iget-object v3, p1, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->totalProfit:Ljava/lang/String;

    .line 280
    .line 281
    .line 282
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 283
    move-result v1

    .line 284
    .line 285
    if-nez v1, :cond_1b

    .line 286
    return v2

    .line 287
    .line 288
    :cond_1b
    iget-object v1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->totalProfitValue:Ljava/math/BigDecimal;

    .line 289
    .line 290
    iget-object v3, p1, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->totalProfitValue:Ljava/math/BigDecimal;

    .line 291
    .line 292
    .line 293
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 294
    move-result v1

    .line 295
    .line 296
    if-nez v1, :cond_1c

    .line 297
    return v2

    .line 298
    .line 299
    :cond_1c
    iget-object v1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->totalProfitColor:Ljava/lang/Integer;

    .line 300
    .line 301
    iget-object v3, p1, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->totalProfitColor:Ljava/lang/Integer;

    .line 302
    .line 303
    .line 304
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 305
    move-result v1

    .line 306
    .line 307
    if-nez v1, :cond_1d

    .line 308
    return v2

    .line 309
    .line 310
    :cond_1d
    iget-object v1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->totalProfitRate:Ljava/lang/String;

    .line 311
    .line 312
    iget-object v3, p1, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->totalProfitRate:Ljava/lang/String;

    .line 313
    .line 314
    .line 315
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 316
    move-result v1

    .line 317
    .line 318
    if-nez v1, :cond_1e

    .line 319
    return v2

    .line 320
    .line 321
    :cond_1e
    iget-object v1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->totalProfitRateValue:Ljava/math/BigDecimal;

    .line 322
    .line 323
    iget-object v3, p1, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->totalProfitRateValue:Ljava/math/BigDecimal;

    .line 324
    .line 325
    .line 326
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 327
    move-result v1

    .line 328
    .line 329
    if-nez v1, :cond_1f

    .line 330
    return v2

    .line 331
    .line 332
    :cond_1f
    iget-object v1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->dayArbitrageNum:Ljava/lang/Integer;

    .line 333
    .line 334
    iget-object v3, p1, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->dayArbitrageNum:Ljava/lang/Integer;

    .line 335
    .line 336
    .line 337
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 338
    move-result v1

    .line 339
    .line 340
    if-nez v1, :cond_20

    .line 341
    return v2

    .line 342
    .line 343
    :cond_20
    iget-object v1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->totalArbitrageNum:Ljava/lang/Integer;

    .line 344
    .line 345
    iget-object v3, p1, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->totalArbitrageNum:Ljava/lang/Integer;

    .line 346
    .line 347
    .line 348
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 349
    move-result v1

    .line 350
    .line 351
    if-nez v1, :cond_21

    .line 352
    return v2

    .line 353
    .line 354
    :cond_21
    iget-object v1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->arbitrage:Ljava/lang/String;

    .line 355
    .line 356
    iget-object v3, p1, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->arbitrage:Ljava/lang/String;

    .line 357
    .line 358
    .line 359
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 360
    move-result v1

    .line 361
    .line 362
    if-nez v1, :cond_22

    .line 363
    return v2

    .line 364
    .line 365
    :cond_22
    iget-object v1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->gridProfit:Ljava/lang/String;

    .line 366
    .line 367
    iget-object v3, p1, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->gridProfit:Ljava/lang/String;

    .line 368
    .line 369
    .line 370
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 371
    move-result v1

    .line 372
    .line 373
    if-nez v1, :cond_23

    .line 374
    return v2

    .line 375
    .line 376
    :cond_23
    iget-object v1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->gridProfitValue:Ljava/math/BigDecimal;

    .line 377
    .line 378
    iget-object v3, p1, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->gridProfitValue:Ljava/math/BigDecimal;

    .line 379
    .line 380
    .line 381
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 382
    move-result v1

    .line 383
    .line 384
    if-nez v1, :cond_24

    .line 385
    return v2

    .line 386
    .line 387
    :cond_24
    iget-object v1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->floatAmount:Ljava/lang/String;

    .line 388
    .line 389
    iget-object v3, p1, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->floatAmount:Ljava/lang/String;

    .line 390
    .line 391
    .line 392
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 393
    move-result v1

    .line 394
    .line 395
    if-nez v1, :cond_25

    .line 396
    return v2

    .line 397
    .line 398
    :cond_25
    iget-object v1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->floatAmountValue:Ljava/math/BigDecimal;

    .line 399
    .line 400
    iget-object v3, p1, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->floatAmountValue:Ljava/math/BigDecimal;

    .line 401
    .line 402
    .line 403
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 404
    move-result v1

    .line 405
    .line 406
    if-nez v1, :cond_26

    .line 407
    return v2

    .line 408
    .line 409
    :cond_26
    iget-object v1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->fundingFee:Ljava/lang/String;

    .line 410
    .line 411
    iget-object v3, p1, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->fundingFee:Ljava/lang/String;

    .line 412
    .line 413
    .line 414
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 415
    move-result v1

    .line 416
    .line 417
    if-nez v1, :cond_27

    .line 418
    return v2

    .line 419
    .line 420
    :cond_27
    iget-object v1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->fundingFeeValue:Ljava/math/BigDecimal;

    .line 421
    .line 422
    iget-object v3, p1, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->fundingFeeValue:Ljava/math/BigDecimal;

    .line 423
    .line 424
    .line 425
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 426
    move-result v1

    .line 427
    .line 428
    if-nez v1, :cond_28

    .line 429
    return v2

    .line 430
    .line 431
    :cond_28
    iget-object v1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->entryPrice:Ljava/lang/String;

    .line 432
    .line 433
    iget-object v3, p1, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->entryPrice:Ljava/lang/String;

    .line 434
    .line 435
    .line 436
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 437
    move-result v1

    .line 438
    .line 439
    if-nez v1, :cond_29

    .line 440
    return v2

    .line 441
    .line 442
    :cond_29
    iget-object v1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->entryPriceValue:Ljava/math/BigDecimal;

    .line 443
    .line 444
    iget-object v3, p1, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->entryPriceValue:Ljava/math/BigDecimal;

    .line 445
    .line 446
    .line 447
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 448
    move-result v1

    .line 449
    .line 450
    if-nez v1, :cond_2a

    .line 451
    return v2

    .line 452
    .line 453
    :cond_2a
    iget-object v1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->priceRange:Ljava/lang/String;

    .line 454
    .line 455
    iget-object v3, p1, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->priceRange:Ljava/lang/String;

    .line 456
    .line 457
    .line 458
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 459
    move-result v1

    .line 460
    .line 461
    if-nez v1, :cond_2b

    .line 462
    return v2

    .line 463
    .line 464
    :cond_2b
    iget-object v1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->priceRangeColor:Ljava/lang/Integer;

    .line 465
    .line 466
    iget-object v3, p1, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->priceRangeColor:Ljava/lang/Integer;

    .line 467
    .line 468
    .line 469
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 470
    move-result v1

    .line 471
    .line 472
    if-nez v1, :cond_2c

    .line 473
    return v2

    .line 474
    .line 475
    :cond_2c
    iget v1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->outPriceRange:I

    .line 476
    .line 477
    iget v3, p1, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->outPriceRange:I

    .line 478
    .line 479
    if-eq v1, v3, :cond_2d

    .line 480
    return v2

    .line 481
    .line 482
    :cond_2d
    iget-object v1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->priceStart:Ljava/math/BigDecimal;

    .line 483
    .line 484
    iget-object v3, p1, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->priceStart:Ljava/math/BigDecimal;

    .line 485
    .line 486
    .line 487
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 488
    move-result v1

    .line 489
    .line 490
    if-nez v1, :cond_2e

    .line 491
    return v2

    .line 492
    .line 493
    :cond_2e
    iget-object v1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->priceEnd:Ljava/math/BigDecimal;

    .line 494
    .line 495
    iget-object v3, p1, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->priceEnd:Ljava/math/BigDecimal;

    .line 496
    .line 497
    .line 498
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 499
    move-result v1

    .line 500
    .line 501
    if-nez v1, :cond_2f

    .line 502
    return v2

    .line 503
    .line 504
    :cond_2f
    iget-object v1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->pendingOrder:Ljava/lang/String;

    .line 505
    .line 506
    iget-object v3, p1, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->pendingOrder:Ljava/lang/String;

    .line 507
    .line 508
    .line 509
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 510
    move-result v1

    .line 511
    .line 512
    if-nez v1, :cond_30

    .line 513
    return v2

    .line 514
    .line 515
    :cond_30
    iget-object v1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->buyNumber:Ljava/lang/String;

    .line 516
    .line 517
    iget-object v3, p1, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->buyNumber:Ljava/lang/String;

    .line 518
    .line 519
    .line 520
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 521
    move-result v1

    .line 522
    .line 523
    if-nez v1, :cond_31

    .line 524
    return v2

    .line 525
    .line 526
    :cond_31
    iget-object v1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->sellNumber:Ljava/lang/String;

    .line 527
    .line 528
    iget-object v3, p1, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->sellNumber:Ljava/lang/String;

    .line 529
    .line 530
    .line 531
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 532
    move-result v1

    .line 533
    .line 534
    if-nez v1, :cond_32

    .line 535
    return v2

    .line 536
    .line 537
    :cond_32
    iget-object v1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->buyNumberWidget:Ljava/lang/Float;

    .line 538
    .line 539
    iget-object v3, p1, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->buyNumberWidget:Ljava/lang/Float;

    .line 540
    .line 541
    .line 542
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 543
    move-result v1

    .line 544
    .line 545
    if-nez v1, :cond_33

    .line 546
    return v2

    .line 547
    .line 548
    :cond_33
    iget-object v1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->sellNumberWidget:Ljava/lang/Float;

    .line 549
    .line 550
    iget-object v3, p1, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->sellNumberWidget:Ljava/lang/Float;

    .line 551
    .line 552
    .line 553
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 554
    move-result v1

    .line 555
    .line 556
    if-nez v1, :cond_34

    .line 557
    return v2

    .line 558
    .line 559
    :cond_34
    iget-object v1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->splitWidget:Ljava/lang/Float;

    .line 560
    .line 561
    iget-object v3, p1, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->splitWidget:Ljava/lang/Float;

    .line 562
    .line 563
    .line 564
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 565
    move-result v1

    .line 566
    .line 567
    if-nez v1, :cond_35

    .line 568
    return v2

    .line 569
    .line 570
    :cond_35
    iget-object v1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->weightSum:Ljava/lang/Float;

    .line 571
    .line 572
    iget-object v3, p1, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->weightSum:Ljava/lang/Float;

    .line 573
    .line 574
    .line 575
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 576
    move-result v1

    .line 577
    .line 578
    if-nez v1, :cond_36

    .line 579
    return v2

    .line 580
    .line 581
    :cond_36
    iget v1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->pendingOrderNumberSellColor:I

    .line 582
    .line 583
    iget v3, p1, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->pendingOrderNumberSellColor:I

    .line 584
    .line 585
    if-eq v1, v3, :cond_37

    .line 586
    return v2

    .line 587
    .line 588
    :cond_37
    iget v1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->pendingOrderNumberBuyColor:I

    .line 589
    .line 590
    iget v3, p1, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->pendingOrderNumberBuyColor:I

    .line 591
    .line 592
    if-eq v1, v3, :cond_38

    .line 593
    return v2

    .line 594
    .line 595
    :cond_38
    iget-object v1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->buyNumberBg:Ljava/lang/Integer;

    .line 596
    .line 597
    iget-object v3, p1, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->buyNumberBg:Ljava/lang/Integer;

    .line 598
    .line 599
    .line 600
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 601
    move-result v1

    .line 602
    .line 603
    if-nez v1, :cond_39

    .line 604
    return v2

    .line 605
    .line 606
    :cond_39
    iget-object v1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->sellNumberBg:Ljava/lang/Integer;

    .line 607
    .line 608
    iget-object v3, p1, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->sellNumberBg:Ljava/lang/Integer;

    .line 609
    .line 610
    .line 611
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 612
    move-result v1

    .line 613
    .line 614
    if-nez v1, :cond_3a

    .line 615
    return v2

    .line 616
    .line 617
    :cond_3a
    iget-object v1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->taskId:Ljava/lang/Long;

    .line 618
    .line 619
    iget-object v3, p1, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->taskId:Ljava/lang/Long;

    .line 620
    .line 621
    .line 622
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 623
    move-result v1

    .line 624
    .line 625
    if-nez v1, :cond_3b

    .line 626
    return v2

    .line 627
    .line 628
    :cond_3b
    iget-object v1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->runningStatus:Ljava/lang/String;

    .line 629
    .line 630
    iget-object v3, p1, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->runningStatus:Ljava/lang/String;

    .line 631
    .line 632
    .line 633
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 634
    move-result v1

    .line 635
    .line 636
    if-nez v1, :cond_3c

    .line 637
    return v2

    .line 638
    .line 639
    :cond_3c
    iget-object v1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->viewType:Ljava/lang/Integer;

    .line 640
    .line 641
    iget-object v3, p1, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->viewType:Ljava/lang/Integer;

    .line 642
    .line 643
    .line 644
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 645
    move-result v1

    .line 646
    .line 647
    if-nez v1, :cond_3d

    .line 648
    return v2

    .line 649
    .line 650
    :cond_3d
    iget-object v1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->pricePrecision:Ljava/lang/Integer;

    .line 651
    .line 652
    iget-object v3, p1, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->pricePrecision:Ljava/lang/Integer;

    .line 653
    .line 654
    .line 655
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 656
    move-result v1

    .line 657
    .line 658
    if-nez v1, :cond_3e

    .line 659
    return v2

    .line 660
    .line 661
    :cond_3e
    iget-object v1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->profitPrecision:Ljava/lang/Integer;

    .line 662
    .line 663
    iget-object v3, p1, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->profitPrecision:Ljava/lang/Integer;

    .line 664
    .line 665
    .line 666
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 667
    move-result v1

    .line 668
    .line 669
    if-nez v1, :cond_3f

    .line 670
    return v2

    .line 671
    .line 672
    :cond_3f
    iget-object v1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->openUnitPriceValue:Ljava/math/BigDecimal;

    .line 673
    .line 674
    iget-object v3, p1, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->openUnitPriceValue:Ljava/math/BigDecimal;

    .line 675
    .line 676
    .line 677
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 678
    move-result v1

    .line 679
    .line 680
    if-nez v1, :cond_40

    .line 681
    return v2

    .line 682
    .line 683
    :cond_40
    iget-object v1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->openUnitPrice:Ljava/lang/String;

    .line 684
    .line 685
    iget-object v3, p1, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->openUnitPrice:Ljava/lang/String;

    .line 686
    .line 687
    .line 688
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 689
    move-result v1

    .line 690
    .line 691
    if-nez v1, :cond_41

    .line 692
    return v2

    .line 693
    .line 694
    :cond_41
    iget-object v1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->endTime:Ljava/lang/Long;

    .line 695
    .line 696
    iget-object v3, p1, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->endTime:Ljava/lang/Long;

    .line 697
    .line 698
    .line 699
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 700
    move-result v1

    .line 701
    .line 702
    if-nez v1, :cond_42

    .line 703
    return v2

    .line 704
    .line 705
    :cond_42
    iget-object v1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->loadingString:Ljava/lang/String;

    .line 706
    .line 707
    iget-object v3, p1, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->loadingString:Ljava/lang/String;

    .line 708
    .line 709
    .line 710
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 711
    move-result v1

    .line 712
    .line 713
    if-nez v1, :cond_43

    .line 714
    return v2

    .line 715
    .line 716
    :cond_43
    iget-object v1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->notTradingOrderPrice:Ljava/lang/String;

    .line 717
    .line 718
    iget-object v3, p1, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->notTradingOrderPrice:Ljava/lang/String;

    .line 719
    .line 720
    .line 721
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 722
    move-result v1

    .line 723
    .line 724
    if-nez v1, :cond_44

    .line 725
    return v2

    .line 726
    .line 727
    :cond_44
    iget-object v1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->isOpenUnit:Ljava/lang/Boolean;

    .line 728
    .line 729
    iget-object v3, p1, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->isOpenUnit:Ljava/lang/Boolean;

    .line 730
    .line 731
    .line 732
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 733
    move-result v1

    .line 734
    .line 735
    if-nez v1, :cond_45

    .line 736
    return v2

    .line 737
    .line 738
    :cond_45
    iget-object v1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->isRisk:Ljava/lang/Boolean;

    .line 739
    .line 740
    iget-object v3, p1, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->isRisk:Ljava/lang/Boolean;

    .line 741
    .line 742
    .line 743
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 744
    move-result v1

    .line 745
    .line 746
    if-nez v1, :cond_46

    .line 747
    return v2

    .line 748
    .line 749
    :cond_46
    iget-object v1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->futuresGridProtectionTip:Ljava/lang/String;

    .line 750
    .line 751
    iget-object v3, p1, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->futuresGridProtectionTip:Ljava/lang/String;

    .line 752
    .line 753
    .line 754
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 755
    move-result v1

    .line 756
    .line 757
    if-nez v1, :cond_47

    .line 758
    return v2

    .line 759
    .line 760
    :cond_47
    iget-object v1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->riskLimitTimeValue:Ljava/lang/Long;

    .line 761
    .line 762
    iget-object v3, p1, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->riskLimitTimeValue:Ljava/lang/Long;

    .line 763
    .line 764
    .line 765
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 766
    move-result v1

    .line 767
    .line 768
    if-nez v1, :cond_48

    .line 769
    return v2

    .line 770
    .line 771
    :cond_48
    iget-object v1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->riskLimitTime:Ljava/lang/String;

    .line 772
    .line 773
    iget-object v3, p1, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->riskLimitTime:Ljava/lang/String;

    .line 774
    .line 775
    .line 776
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 777
    move-result v1

    .line 778
    .line 779
    if-nez v1, :cond_49

    .line 780
    return v2

    .line 781
    .line 782
    :cond_49
    iget-object v1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->stopLossPriceValue:Ljava/math/BigDecimal;

    .line 783
    .line 784
    iget-object v3, p1, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->stopLossPriceValue:Ljava/math/BigDecimal;

    .line 785
    .line 786
    .line 787
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 788
    move-result v1

    .line 789
    .line 790
    if-nez v1, :cond_4a

    .line 791
    return v2

    .line 792
    .line 793
    :cond_4a
    iget-object v1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->stopLossPrice:Ljava/lang/String;

    .line 794
    .line 795
    iget-object v3, p1, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->stopLossPrice:Ljava/lang/String;

    .line 796
    .line 797
    .line 798
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 799
    move-result v1

    .line 800
    .line 801
    if-nez v1, :cond_4b

    .line 802
    return v2

    .line 803
    .line 804
    :cond_4b
    iget-object v1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->stopProfitPriceValue:Ljava/math/BigDecimal;

    .line 805
    .line 806
    iget-object v3, p1, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->stopProfitPriceValue:Ljava/math/BigDecimal;

    .line 807
    .line 808
    .line 809
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 810
    move-result v1

    .line 811
    .line 812
    if-nez v1, :cond_4c

    .line 813
    return v2

    .line 814
    .line 815
    :cond_4c
    iget-object v1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->stopProfitPrice:Ljava/lang/String;

    .line 816
    .line 817
    iget-object v3, p1, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->stopProfitPrice:Ljava/lang/String;

    .line 818
    .line 819
    .line 820
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 821
    move-result v1

    .line 822
    .line 823
    if-nez v1, :cond_4d

    .line 824
    return v2

    .line 825
    .line 826
    :cond_4d
    iget-object v1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->stopReason:Ljava/lang/String;

    .line 827
    .line 828
    iget-object v3, p1, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->stopReason:Ljava/lang/String;

    .line 829
    .line 830
    .line 831
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 832
    move-result v1

    .line 833
    .line 834
    if-nez v1, :cond_4e

    .line 835
    return v2

    .line 836
    .line 837
    :cond_4e
    iget-object v1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->stopPriceText:Ljava/lang/String;

    .line 838
    .line 839
    iget-object v3, p1, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->stopPriceText:Ljava/lang/String;

    .line 840
    .line 841
    .line 842
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 843
    move-result v1

    .line 844
    .line 845
    if-nez v1, :cond_4f

    .line 846
    return v2

    .line 847
    .line 848
    :cond_4f
    iget-object v1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->stopPriceNumber:Ljava/lang/String;

    .line 849
    .line 850
    iget-object v3, p1, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->stopPriceNumber:Ljava/lang/String;

    .line 851
    .line 852
    .line 853
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 854
    move-result v1

    .line 855
    .line 856
    if-nez v1, :cond_50

    .line 857
    return v2

    .line 858
    .line 859
    :cond_50
    iget-object v1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->stopReasonDetail:Ljava/lang/String;

    .line 860
    .line 861
    iget-object v3, p1, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->stopReasonDetail:Ljava/lang/String;

    .line 862
    .line 863
    .line 864
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 865
    move-result v1

    .line 866
    .line 867
    if-nez v1, :cond_51

    .line 868
    return v2

    .line 869
    .line 870
    :cond_51
    iget-object v1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->transfers:Ljava/util/List;

    .line 871
    .line 872
    iget-object v3, p1, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->transfers:Ljava/util/List;

    .line 873
    .line 874
    .line 875
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 876
    move-result v1

    .line 877
    .line 878
    if-nez v1, :cond_52

    .line 879
    return v2

    .line 880
    .line 881
    :cond_52
    iget v1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->totalInvestVisible:I

    .line 882
    .line 883
    iget v3, p1, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->totalInvestVisible:I

    .line 884
    .line 885
    if-eq v1, v3, :cond_53

    .line 886
    return v2

    .line 887
    .line 888
    :cond_53
    iget-object v1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->couponReward:Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel$CouponReward;

    .line 889
    .line 890
    iget-object p1, p1, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->couponReward:Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel$CouponReward;

    .line 891
    .line 892
    .line 893
    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 894
    move-result p1

    .line 895
    .line 896
    if-nez p1, :cond_54

    .line 897
    return v2

    .line 898
    :cond_54
    return v0
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
.end method

.method public final getArbitrage()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->arbitrage:Ljava/lang/String;

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
    .line 58
    .line 59
.end method

.method public final getBuyNumber()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->buyNumber:Ljava/lang/String;

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
    .line 58
    .line 59
.end method

.method public final getBuyNumberBg()Ljava/lang/Integer;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->buyNumberBg:Ljava/lang/Integer;

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
    .line 58
    .line 59
.end method

.method public final getBuyNumberWidget()Ljava/lang/Float;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->buyNumberWidget:Ljava/lang/Float;

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
    .line 58
    .line 59
.end method

.method public final getCenterContentBgColor()Ljava/lang/Integer;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->centerContentBgColor:Ljava/lang/Integer;

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
    .line 58
    .line 59
.end method

.method public final getCouponReward()Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel$CouponReward;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->couponReward:Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel$CouponReward;

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
    .line 58
    .line 59
.end method

.method public final getDayArbitrageNum()Ljava/lang/Integer;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->dayArbitrageNum:Ljava/lang/Integer;

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
    .line 58
    .line 59
.end method

.method public final getDirection()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->direction:Ljava/lang/String;

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
    .line 58
    .line 59
.end method

.method public final getDirectionBgColor()Ljava/lang/Integer;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->directionBgColor:Ljava/lang/Integer;

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
    .line 58
    .line 59
.end method

.method public final getDirectionCode()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->directionCode:Ljava/lang/String;

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
    .line 58
    .line 59
.end method

.method public final getDirectionVisible()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->directionVisible:I

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
    .line 58
    .line 59
.end method

.method public final getEndTime()Ljava/lang/Long;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->endTime:Ljava/lang/Long;

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
    .line 58
    .line 59
.end method

.method public final getEntryPrice()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->entryPrice:Ljava/lang/String;

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
    .line 58
    .line 59
.end method

.method public final getEntryPriceValue()Ljava/math/BigDecimal;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->entryPriceValue:Ljava/math/BigDecimal;

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
    .line 58
    .line 59
.end method

.method public final getFloatAmount()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->floatAmount:Ljava/lang/String;

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
    .line 58
    .line 59
.end method

.method public final getFloatAmountValue()Ljava/math/BigDecimal;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->floatAmountValue:Ljava/math/BigDecimal;

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
    .line 58
    .line 59
.end method

.method public final getFundingFee()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->fundingFee:Ljava/lang/String;

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
    .line 58
    .line 59
.end method

.method public final getFundingFeeValue()Ljava/math/BigDecimal;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->fundingFeeValue:Ljava/math/BigDecimal;

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
    .line 58
    .line 59
.end method

.method public final getFuturesGridProtectionTip()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->futuresGridProtectionTip:Ljava/lang/String;

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
    .line 58
    .line 59
.end method

.method public final getGridProfit()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->gridProfit:Ljava/lang/String;

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
    .line 58
    .line 59
.end method

.method public final getGridProfitValue()Ljava/math/BigDecimal;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->gridProfitValue:Ljava/math/BigDecimal;

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
    .line 58
    .line 59
.end method

.method public final getLastPrice()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->lastPrice:Ljava/lang/String;

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
    .line 58
    .line 59
.end method

.method public final getLastPriceValue()Ljava/math/BigDecimal;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->lastPriceValue:Ljava/math/BigDecimal;

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
    .line 58
    .line 59
.end method

.method public final getLastPriceVisible()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->lastPriceVisible:I

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
    .line 58
    .line 59
.end method

.method public final getLeverage()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->leverage:Ljava/lang/String;

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
    .line 58
    .line 59
.end method

.method public final getLeverageBgColor()Ljava/lang/Integer;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->leverageBgColor:Ljava/lang/Integer;

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
    .line 58
    .line 59
.end method

.method public final getLeverageTextColor()Ljava/lang/Integer;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->leverageTextColor:Ljava/lang/Integer;

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
    .line 58
    .line 59
.end method

.method public final getLeverageValue()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->leverageValue:Ljava/lang/String;

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
    .line 58
    .line 59
.end method

.method public final getLeverageVisible()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->leverageVisible:I

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
    .line 58
    .line 59
.end method

.method public final getLiquidationPrice()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->liquidationPrice:Ljava/lang/String;

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
    .line 58
    .line 59
.end method

.method public final getLiquidationPriceValue()Ljava/math/BigDecimal;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->liquidationPriceValue:Ljava/math/BigDecimal;

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
    .line 58
    .line 59
.end method

.method public final getLoadingString()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->loadingString:Ljava/lang/String;

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
    .line 58
    .line 59
.end method

.method public final getNotTradingOrderPrice()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->notTradingOrderPrice:Ljava/lang/String;

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
    .line 58
    .line 59
.end method

.method public final getOpenUnitPrice()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->openUnitPrice:Ljava/lang/String;

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
    .line 58
    .line 59
.end method

.method public final getOpenUnitPriceValue()Ljava/math/BigDecimal;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->openUnitPriceValue:Ljava/math/BigDecimal;

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
    .line 58
    .line 59
.end method

.method public final getOutPriceRange()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->outPriceRange:I

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
    .line 58
    .line 59
.end method

.method public final getPendingOrder()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->pendingOrder:Ljava/lang/String;

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
    .line 58
    .line 59
.end method

.method public final getPendingOrderNumberBuyColor()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->pendingOrderNumberBuyColor:I

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
    .line 58
    .line 59
.end method

.method public final getPendingOrderNumberSellColor()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->pendingOrderNumberSellColor:I

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
    .line 58
    .line 59
.end method

.method public final getPriceEnd()Ljava/math/BigDecimal;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->priceEnd:Ljava/math/BigDecimal;

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
    .line 58
    .line 59
.end method

.method public final getPricePrecision()Ljava/lang/Integer;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->pricePrecision:Ljava/lang/Integer;

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
    .line 58
    .line 59
.end method

.method public final getPriceRange()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->priceRange:Ljava/lang/String;

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
    .line 58
    .line 59
.end method

.method public final getPriceRangeColor()Ljava/lang/Integer;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->priceRangeColor:Ljava/lang/Integer;

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
    .line 58
    .line 59
.end method

.method public final getPriceStart()Ljava/math/BigDecimal;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->priceStart:Ljava/math/BigDecimal;

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
    .line 58
    .line 59
.end method

.method public final getProfitPrecision()Ljava/lang/Integer;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->profitPrecision:Ljava/lang/Integer;

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
    .line 58
    .line 59
.end method

.method public final getQuoteCode()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->quoteCode:Ljava/lang/String;

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
    .line 58
    .line 59
.end method

.method public final getQuoteName()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->quoteName:Ljava/lang/String;

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
    .line 58
    .line 59
.end method

.method public final getRiskLimitTime()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->riskLimitTime:Ljava/lang/String;

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
    .line 58
    .line 59
.end method

.method public final getRiskLimitTimeValue()Ljava/lang/Long;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->riskLimitTimeValue:Ljava/lang/Long;

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
    .line 58
    .line 59
.end method

.method public final getRunningStatus()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->runningStatus:Ljava/lang/String;

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
    .line 58
    .line 59
.end method

.method public final getRunningTime()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->runningTime:Ljava/lang/String;

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
    .line 58
    .line 59
.end method

.method public final getRunningTimeValue()Ljava/lang/Long;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->runningTimeValue:Ljava/lang/Long;

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
    .line 58
    .line 59
.end method

.method public final getSellNumber()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->sellNumber:Ljava/lang/String;

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
    .line 58
    .line 59
.end method

.method public final getSellNumberBg()Ljava/lang/Integer;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->sellNumberBg:Ljava/lang/Integer;

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
    .line 58
    .line 59
.end method

.method public final getSellNumberWidget()Ljava/lang/Float;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->sellNumberWidget:Ljava/lang/Float;

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
    .line 58
    .line 59
.end method

.method public final getSplitWidget()Ljava/lang/Float;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->splitWidget:Ljava/lang/Float;

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
    .line 58
    .line 59
.end method

.method public final getStopLossPrice()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->stopLossPrice:Ljava/lang/String;

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
    .line 58
    .line 59
.end method

.method public final getStopLossPriceValue()Ljava/math/BigDecimal;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->stopLossPriceValue:Ljava/math/BigDecimal;

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
    .line 58
    .line 59
.end method

.method public final getStopPriceNumber()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->stopPriceNumber:Ljava/lang/String;

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
    .line 58
    .line 59
.end method

.method public final getStopPriceText()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->stopPriceText:Ljava/lang/String;

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
    .line 58
    .line 59
.end method

.method public final getStopProfitPrice()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->stopProfitPrice:Ljava/lang/String;

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
    .line 58
    .line 59
.end method

.method public final getStopProfitPriceValue()Ljava/math/BigDecimal;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->stopProfitPriceValue:Ljava/math/BigDecimal;

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
    .line 58
    .line 59
.end method

.method public final getStopReason()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->stopReason:Ljava/lang/String;

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
    .line 58
    .line 59
.end method

.method public final getStopReasonDetail()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->stopReasonDetail:Ljava/lang/String;

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
    .line 58
    .line 59
.end method

.method public final getSymbolCode()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->symbolCode:Ljava/lang/String;

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
    .line 58
    .line 59
.end method

.method public final getSymbolName()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->symbolName:Ljava/lang/String;

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
    .line 58
    .line 59
.end method

.method public final getTaskId()Ljava/lang/Long;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->taskId:Ljava/lang/Long;

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
    .line 58
    .line 59
.end method

.method public final getTotalArbitrageNum()Ljava/lang/Integer;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->totalArbitrageNum:Ljava/lang/Integer;

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
    .line 58
    .line 59
.end method

.method public final getTotalInvest()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->totalInvest:Ljava/lang/String;

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
    .line 58
    .line 59
.end method

.method public final getTotalInvestText()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->totalInvestText:Ljava/lang/String;

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
    .line 58
    .line 59
.end method

.method public final getTotalInvestValue()Ljava/math/BigDecimal;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->totalInvestValue:Ljava/math/BigDecimal;

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
    .line 58
    .line 59
.end method

.method public final getTotalInvestVisible()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->totalInvestVisible:I

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
    .line 58
    .line 59
.end method

.method public final getTotalProfit()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->totalProfit:Ljava/lang/String;

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
    .line 58
    .line 59
.end method

.method public final getTotalProfitColor()Ljava/lang/Integer;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->totalProfitColor:Ljava/lang/Integer;

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
    .line 58
    .line 59
.end method

.method public final getTotalProfitRate()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->totalProfitRate:Ljava/lang/String;

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
    .line 58
    .line 59
.end method

.method public final getTotalProfitRateValue()Ljava/math/BigDecimal;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->totalProfitRateValue:Ljava/math/BigDecimal;

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
    .line 58
    .line 59
.end method

.method public final getTotalProfitText()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->totalProfitText:Ljava/lang/String;

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
    .line 58
    .line 59
.end method

.method public final getTotalProfitValue()Ljava/math/BigDecimal;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->totalProfitValue:Ljava/math/BigDecimal;

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
    .line 58
    .line 59
.end method

.method public final getTransfers()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel$Transfer;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->transfers:Ljava/util/List;

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
    .line 58
    .line 59
.end method

.method public final getViewType()Ljava/lang/Integer;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->viewType:Ljava/lang/Integer;

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
    .line 58
    .line 59
.end method

.method public final getWeightSum()Ljava/lang/Float;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->weightSum:Ljava/lang/Float;

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
    .line 58
    .line 59
.end method

.method public hashCode()I
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->symbolName:Ljava/lang/String;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    move v0, v1

    .line 7
    goto :goto_0

    .line 8
    .line 9
    .line 10
    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 11
    move-result v0

    .line 12
    .line 13
    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    .line 14
    .line 15
    iget-object v2, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->symbolCode:Ljava/lang/String;

    .line 16
    .line 17
    if-nez v2, :cond_1

    .line 18
    move v2, v1

    .line 19
    goto :goto_1

    .line 20
    .line 21
    .line 22
    :cond_1
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 23
    move-result v2

    .line 24
    :goto_1
    add-int/2addr v0, v2

    .line 25
    .line 26
    mul-int/lit8 v0, v0, 0x1f

    .line 27
    .line 28
    iget-object v2, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->direction:Ljava/lang/String;

    .line 29
    .line 30
    if-nez v2, :cond_2

    .line 31
    move v2, v1

    .line 32
    goto :goto_2

    .line 33
    .line 34
    .line 35
    :cond_2
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 36
    move-result v2

    .line 37
    :goto_2
    add-int/2addr v0, v2

    .line 38
    .line 39
    mul-int/lit8 v0, v0, 0x1f

    .line 40
    .line 41
    iget-object v2, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->directionCode:Ljava/lang/String;

    .line 42
    .line 43
    if-nez v2, :cond_3

    .line 44
    move v2, v1

    .line 45
    goto :goto_3

    .line 46
    .line 47
    .line 48
    :cond_3
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 49
    move-result v2

    .line 50
    :goto_3
    add-int/2addr v0, v2

    .line 51
    .line 52
    mul-int/lit8 v0, v0, 0x1f

    .line 53
    .line 54
    iget v2, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->directionVisible:I

    .line 55
    .line 56
    .line 57
    invoke-static {v2}, Ljava/lang/Integer;->hashCode(I)I

    .line 58
    move-result v2

    .line 59
    add-int/2addr v0, v2

    .line 60
    .line 61
    mul-int/lit8 v0, v0, 0x1f

    .line 62
    .line 63
    iget-object v2, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->leverageValue:Ljava/lang/String;

    .line 64
    .line 65
    if-nez v2, :cond_4

    .line 66
    move v2, v1

    .line 67
    goto :goto_4

    .line 68
    .line 69
    .line 70
    :cond_4
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 71
    move-result v2

    .line 72
    :goto_4
    add-int/2addr v0, v2

    .line 73
    .line 74
    mul-int/lit8 v0, v0, 0x1f

    .line 75
    .line 76
    iget-object v2, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->leverage:Ljava/lang/String;

    .line 77
    .line 78
    if-nez v2, :cond_5

    .line 79
    move v2, v1

    .line 80
    goto :goto_5

    .line 81
    .line 82
    .line 83
    :cond_5
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 84
    move-result v2

    .line 85
    :goto_5
    add-int/2addr v0, v2

    .line 86
    .line 87
    mul-int/lit8 v0, v0, 0x1f

    .line 88
    .line 89
    iget-object v2, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->leverageBgColor:Ljava/lang/Integer;

    .line 90
    .line 91
    if-nez v2, :cond_6

    .line 92
    move v2, v1

    .line 93
    goto :goto_6

    .line 94
    .line 95
    .line 96
    :cond_6
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 97
    move-result v2

    .line 98
    :goto_6
    add-int/2addr v0, v2

    .line 99
    .line 100
    mul-int/lit8 v0, v0, 0x1f

    .line 101
    .line 102
    iget v2, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->leverageVisible:I

    .line 103
    .line 104
    .line 105
    invoke-static {v2}, Ljava/lang/Integer;->hashCode(I)I

    .line 106
    move-result v2

    .line 107
    add-int/2addr v0, v2

    .line 108
    .line 109
    mul-int/lit8 v0, v0, 0x1f

    .line 110
    .line 111
    iget-object v2, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->centerContentBgColor:Ljava/lang/Integer;

    .line 112
    .line 113
    if-nez v2, :cond_7

    .line 114
    move v2, v1

    .line 115
    goto :goto_7

    .line 116
    .line 117
    .line 118
    :cond_7
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 119
    move-result v2

    .line 120
    :goto_7
    add-int/2addr v0, v2

    .line 121
    .line 122
    mul-int/lit8 v0, v0, 0x1f

    .line 123
    .line 124
    iget-object v2, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->leverageTextColor:Ljava/lang/Integer;

    .line 125
    .line 126
    if-nez v2, :cond_8

    .line 127
    move v2, v1

    .line 128
    goto :goto_8

    .line 129
    .line 130
    .line 131
    :cond_8
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 132
    move-result v2

    .line 133
    :goto_8
    add-int/2addr v0, v2

    .line 134
    .line 135
    mul-int/lit8 v0, v0, 0x1f

    .line 136
    .line 137
    iget-object v2, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->directionBgColor:Ljava/lang/Integer;

    .line 138
    .line 139
    if-nez v2, :cond_9

    .line 140
    move v2, v1

    .line 141
    goto :goto_9

    .line 142
    .line 143
    .line 144
    :cond_9
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 145
    move-result v2

    .line 146
    :goto_9
    add-int/2addr v0, v2

    .line 147
    .line 148
    mul-int/lit8 v0, v0, 0x1f

    .line 149
    .line 150
    iget-object v2, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->lastPrice:Ljava/lang/String;

    .line 151
    .line 152
    if-nez v2, :cond_a

    .line 153
    move v2, v1

    .line 154
    goto :goto_a

    .line 155
    .line 156
    .line 157
    :cond_a
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 158
    move-result v2

    .line 159
    :goto_a
    add-int/2addr v0, v2

    .line 160
    .line 161
    mul-int/lit8 v0, v0, 0x1f

    .line 162
    .line 163
    iget-object v2, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->lastPriceValue:Ljava/math/BigDecimal;

    .line 164
    .line 165
    if-nez v2, :cond_b

    .line 166
    move v2, v1

    .line 167
    goto :goto_b

    .line 168
    .line 169
    .line 170
    :cond_b
    invoke-virtual {v2}, Ljava/math/BigDecimal;->hashCode()I

    .line 171
    move-result v2

    .line 172
    :goto_b
    add-int/2addr v0, v2

    .line 173
    .line 174
    mul-int/lit8 v0, v0, 0x1f

    .line 175
    .line 176
    iget v2, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->lastPriceVisible:I

    .line 177
    .line 178
    .line 179
    invoke-static {v2}, Ljava/lang/Integer;->hashCode(I)I

    .line 180
    move-result v2

    .line 181
    add-int/2addr v0, v2

    .line 182
    .line 183
    mul-int/lit8 v0, v0, 0x1f

    .line 184
    .line 185
    iget-object v2, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->liquidationPriceValue:Ljava/math/BigDecimal;

    .line 186
    .line 187
    if-nez v2, :cond_c

    .line 188
    move v2, v1

    .line 189
    goto :goto_c

    .line 190
    .line 191
    .line 192
    :cond_c
    invoke-virtual {v2}, Ljava/math/BigDecimal;->hashCode()I

    .line 193
    move-result v2

    .line 194
    :goto_c
    add-int/2addr v0, v2

    .line 195
    .line 196
    mul-int/lit8 v0, v0, 0x1f

    .line 197
    .line 198
    iget-object v2, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->liquidationPrice:Ljava/lang/String;

    .line 199
    .line 200
    if-nez v2, :cond_d

    .line 201
    move v2, v1

    .line 202
    goto :goto_d

    .line 203
    .line 204
    .line 205
    :cond_d
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 206
    move-result v2

    .line 207
    :goto_d
    add-int/2addr v0, v2

    .line 208
    .line 209
    mul-int/lit8 v0, v0, 0x1f

    .line 210
    .line 211
    iget-object v2, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->runningTimeValue:Ljava/lang/Long;

    .line 212
    .line 213
    if-nez v2, :cond_e

    .line 214
    move v2, v1

    .line 215
    goto :goto_e

    .line 216
    .line 217
    .line 218
    :cond_e
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 219
    move-result v2

    .line 220
    :goto_e
    add-int/2addr v0, v2

    .line 221
    .line 222
    mul-int/lit8 v0, v0, 0x1f

    .line 223
    .line 224
    iget-object v2, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->runningTime:Ljava/lang/String;

    .line 225
    .line 226
    if-nez v2, :cond_f

    .line 227
    move v2, v1

    .line 228
    goto :goto_f

    .line 229
    .line 230
    .line 231
    :cond_f
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 232
    move-result v2

    .line 233
    :goto_f
    add-int/2addr v0, v2

    .line 234
    .line 235
    mul-int/lit8 v0, v0, 0x1f

    .line 236
    .line 237
    iget-object v2, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->quoteCode:Ljava/lang/String;

    .line 238
    .line 239
    if-nez v2, :cond_10

    .line 240
    move v2, v1

    .line 241
    goto :goto_10

    .line 242
    .line 243
    .line 244
    :cond_10
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 245
    move-result v2

    .line 246
    :goto_10
    add-int/2addr v0, v2

    .line 247
    .line 248
    mul-int/lit8 v0, v0, 0x1f

    .line 249
    .line 250
    iget-object v2, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->quoteName:Ljava/lang/String;

    .line 251
    .line 252
    if-nez v2, :cond_11

    .line 253
    move v2, v1

    .line 254
    goto :goto_11

    .line 255
    .line 256
    .line 257
    :cond_11
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 258
    move-result v2

    .line 259
    :goto_11
    add-int/2addr v0, v2

    .line 260
    .line 261
    mul-int/lit8 v0, v0, 0x1f

    .line 262
    .line 263
    iget-object v2, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->totalInvestText:Ljava/lang/String;

    .line 264
    .line 265
    if-nez v2, :cond_12

    .line 266
    move v2, v1

    .line 267
    goto :goto_12

    .line 268
    .line 269
    .line 270
    :cond_12
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 271
    move-result v2

    .line 272
    :goto_12
    add-int/2addr v0, v2

    .line 273
    .line 274
    mul-int/lit8 v0, v0, 0x1f

    .line 275
    .line 276
    iget-object v2, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->totalInvest:Ljava/lang/String;

    .line 277
    .line 278
    if-nez v2, :cond_13

    .line 279
    move v2, v1

    .line 280
    goto :goto_13

    .line 281
    .line 282
    .line 283
    :cond_13
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 284
    move-result v2

    .line 285
    :goto_13
    add-int/2addr v0, v2

    .line 286
    .line 287
    mul-int/lit8 v0, v0, 0x1f

    .line 288
    .line 289
    iget-object v2, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->totalInvestValue:Ljava/math/BigDecimal;

    .line 290
    .line 291
    if-nez v2, :cond_14

    .line 292
    move v2, v1

    .line 293
    goto :goto_14

    .line 294
    .line 295
    .line 296
    :cond_14
    invoke-virtual {v2}, Ljava/math/BigDecimal;->hashCode()I

    .line 297
    move-result v2

    .line 298
    :goto_14
    add-int/2addr v0, v2

    .line 299
    .line 300
    mul-int/lit8 v0, v0, 0x1f

    .line 301
    .line 302
    iget-object v2, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->totalProfitText:Ljava/lang/String;

    .line 303
    .line 304
    if-nez v2, :cond_15

    .line 305
    move v2, v1

    .line 306
    goto :goto_15

    .line 307
    .line 308
    .line 309
    :cond_15
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 310
    move-result v2

    .line 311
    :goto_15
    add-int/2addr v0, v2

    .line 312
    .line 313
    mul-int/lit8 v0, v0, 0x1f

    .line 314
    .line 315
    iget-object v2, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->totalProfit:Ljava/lang/String;

    .line 316
    .line 317
    if-nez v2, :cond_16

    .line 318
    move v2, v1

    .line 319
    goto :goto_16

    .line 320
    .line 321
    .line 322
    :cond_16
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 323
    move-result v2

    .line 324
    :goto_16
    add-int/2addr v0, v2

    .line 325
    .line 326
    mul-int/lit8 v0, v0, 0x1f

    .line 327
    .line 328
    iget-object v2, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->totalProfitValue:Ljava/math/BigDecimal;

    .line 329
    .line 330
    if-nez v2, :cond_17

    .line 331
    move v2, v1

    .line 332
    goto :goto_17

    .line 333
    .line 334
    .line 335
    :cond_17
    invoke-virtual {v2}, Ljava/math/BigDecimal;->hashCode()I

    .line 336
    move-result v2

    .line 337
    :goto_17
    add-int/2addr v0, v2

    .line 338
    .line 339
    mul-int/lit8 v0, v0, 0x1f

    .line 340
    .line 341
    iget-object v2, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->totalProfitColor:Ljava/lang/Integer;

    .line 342
    .line 343
    if-nez v2, :cond_18

    .line 344
    move v2, v1

    .line 345
    goto :goto_18

    .line 346
    .line 347
    .line 348
    :cond_18
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 349
    move-result v2

    .line 350
    :goto_18
    add-int/2addr v0, v2

    .line 351
    .line 352
    mul-int/lit8 v0, v0, 0x1f

    .line 353
    .line 354
    iget-object v2, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->totalProfitRate:Ljava/lang/String;

    .line 355
    .line 356
    if-nez v2, :cond_19

    .line 357
    move v2, v1

    .line 358
    goto :goto_19

    .line 359
    .line 360
    .line 361
    :cond_19
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 362
    move-result v2

    .line 363
    :goto_19
    add-int/2addr v0, v2

    .line 364
    .line 365
    mul-int/lit8 v0, v0, 0x1f

    .line 366
    .line 367
    iget-object v2, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->totalProfitRateValue:Ljava/math/BigDecimal;

    .line 368
    .line 369
    if-nez v2, :cond_1a

    .line 370
    move v2, v1

    .line 371
    goto :goto_1a

    .line 372
    .line 373
    .line 374
    :cond_1a
    invoke-virtual {v2}, Ljava/math/BigDecimal;->hashCode()I

    .line 375
    move-result v2

    .line 376
    :goto_1a
    add-int/2addr v0, v2

    .line 377
    .line 378
    mul-int/lit8 v0, v0, 0x1f

    .line 379
    .line 380
    iget-object v2, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->dayArbitrageNum:Ljava/lang/Integer;

    .line 381
    .line 382
    if-nez v2, :cond_1b

    .line 383
    move v2, v1

    .line 384
    goto :goto_1b

    .line 385
    .line 386
    .line 387
    :cond_1b
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 388
    move-result v2

    .line 389
    :goto_1b
    add-int/2addr v0, v2

    .line 390
    .line 391
    mul-int/lit8 v0, v0, 0x1f

    .line 392
    .line 393
    iget-object v2, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->totalArbitrageNum:Ljava/lang/Integer;

    .line 394
    .line 395
    if-nez v2, :cond_1c

    .line 396
    move v2, v1

    .line 397
    goto :goto_1c

    .line 398
    .line 399
    .line 400
    :cond_1c
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 401
    move-result v2

    .line 402
    :goto_1c
    add-int/2addr v0, v2

    .line 403
    .line 404
    mul-int/lit8 v0, v0, 0x1f

    .line 405
    .line 406
    iget-object v2, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->arbitrage:Ljava/lang/String;

    .line 407
    .line 408
    if-nez v2, :cond_1d

    .line 409
    move v2, v1

    .line 410
    goto :goto_1d

    .line 411
    .line 412
    .line 413
    :cond_1d
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 414
    move-result v2

    .line 415
    :goto_1d
    add-int/2addr v0, v2

    .line 416
    .line 417
    mul-int/lit8 v0, v0, 0x1f

    .line 418
    .line 419
    iget-object v2, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->gridProfit:Ljava/lang/String;

    .line 420
    .line 421
    if-nez v2, :cond_1e

    .line 422
    move v2, v1

    .line 423
    goto :goto_1e

    .line 424
    .line 425
    .line 426
    :cond_1e
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 427
    move-result v2

    .line 428
    :goto_1e
    add-int/2addr v0, v2

    .line 429
    .line 430
    mul-int/lit8 v0, v0, 0x1f

    .line 431
    .line 432
    iget-object v2, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->gridProfitValue:Ljava/math/BigDecimal;

    .line 433
    .line 434
    if-nez v2, :cond_1f

    .line 435
    move v2, v1

    .line 436
    goto :goto_1f

    .line 437
    .line 438
    .line 439
    :cond_1f
    invoke-virtual {v2}, Ljava/math/BigDecimal;->hashCode()I

    .line 440
    move-result v2

    .line 441
    :goto_1f
    add-int/2addr v0, v2

    .line 442
    .line 443
    mul-int/lit8 v0, v0, 0x1f

    .line 444
    .line 445
    iget-object v2, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->floatAmount:Ljava/lang/String;

    .line 446
    .line 447
    if-nez v2, :cond_20

    .line 448
    move v2, v1

    .line 449
    goto :goto_20

    .line 450
    .line 451
    .line 452
    :cond_20
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 453
    move-result v2

    .line 454
    :goto_20
    add-int/2addr v0, v2

    .line 455
    .line 456
    mul-int/lit8 v0, v0, 0x1f

    .line 457
    .line 458
    iget-object v2, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->floatAmountValue:Ljava/math/BigDecimal;

    .line 459
    .line 460
    if-nez v2, :cond_21

    .line 461
    move v2, v1

    .line 462
    goto :goto_21

    .line 463
    .line 464
    .line 465
    :cond_21
    invoke-virtual {v2}, Ljava/math/BigDecimal;->hashCode()I

    .line 466
    move-result v2

    .line 467
    :goto_21
    add-int/2addr v0, v2

    .line 468
    .line 469
    mul-int/lit8 v0, v0, 0x1f

    .line 470
    .line 471
    iget-object v2, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->fundingFee:Ljava/lang/String;

    .line 472
    .line 473
    if-nez v2, :cond_22

    .line 474
    move v2, v1

    .line 475
    goto :goto_22

    .line 476
    .line 477
    .line 478
    :cond_22
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 479
    move-result v2

    .line 480
    :goto_22
    add-int/2addr v0, v2

    .line 481
    .line 482
    mul-int/lit8 v0, v0, 0x1f

    .line 483
    .line 484
    iget-object v2, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->fundingFeeValue:Ljava/math/BigDecimal;

    .line 485
    .line 486
    if-nez v2, :cond_23

    .line 487
    move v2, v1

    .line 488
    goto :goto_23

    .line 489
    .line 490
    .line 491
    :cond_23
    invoke-virtual {v2}, Ljava/math/BigDecimal;->hashCode()I

    .line 492
    move-result v2

    .line 493
    :goto_23
    add-int/2addr v0, v2

    .line 494
    .line 495
    mul-int/lit8 v0, v0, 0x1f

    .line 496
    .line 497
    iget-object v2, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->entryPrice:Ljava/lang/String;

    .line 498
    .line 499
    if-nez v2, :cond_24

    .line 500
    move v2, v1

    .line 501
    goto :goto_24

    .line 502
    .line 503
    .line 504
    :cond_24
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 505
    move-result v2

    .line 506
    :goto_24
    add-int/2addr v0, v2

    .line 507
    .line 508
    mul-int/lit8 v0, v0, 0x1f

    .line 509
    .line 510
    iget-object v2, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->entryPriceValue:Ljava/math/BigDecimal;

    .line 511
    .line 512
    if-nez v2, :cond_25

    .line 513
    move v2, v1

    .line 514
    goto :goto_25

    .line 515
    .line 516
    .line 517
    :cond_25
    invoke-virtual {v2}, Ljava/math/BigDecimal;->hashCode()I

    .line 518
    move-result v2

    .line 519
    :goto_25
    add-int/2addr v0, v2

    .line 520
    .line 521
    mul-int/lit8 v0, v0, 0x1f

    .line 522
    .line 523
    iget-object v2, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->priceRange:Ljava/lang/String;

    .line 524
    .line 525
    if-nez v2, :cond_26

    .line 526
    move v2, v1

    .line 527
    goto :goto_26

    .line 528
    .line 529
    .line 530
    :cond_26
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 531
    move-result v2

    .line 532
    :goto_26
    add-int/2addr v0, v2

    .line 533
    .line 534
    mul-int/lit8 v0, v0, 0x1f

    .line 535
    .line 536
    iget-object v2, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->priceRangeColor:Ljava/lang/Integer;

    .line 537
    .line 538
    if-nez v2, :cond_27

    .line 539
    move v2, v1

    .line 540
    goto :goto_27

    .line 541
    .line 542
    .line 543
    :cond_27
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 544
    move-result v2

    .line 545
    :goto_27
    add-int/2addr v0, v2

    .line 546
    .line 547
    mul-int/lit8 v0, v0, 0x1f

    .line 548
    .line 549
    iget v2, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->outPriceRange:I

    .line 550
    .line 551
    .line 552
    invoke-static {v2}, Ljava/lang/Integer;->hashCode(I)I

    .line 553
    move-result v2

    .line 554
    add-int/2addr v0, v2

    .line 555
    .line 556
    mul-int/lit8 v0, v0, 0x1f

    .line 557
    .line 558
    iget-object v2, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->priceStart:Ljava/math/BigDecimal;

    .line 559
    .line 560
    if-nez v2, :cond_28

    .line 561
    move v2, v1

    .line 562
    goto :goto_28

    .line 563
    .line 564
    .line 565
    :cond_28
    invoke-virtual {v2}, Ljava/math/BigDecimal;->hashCode()I

    .line 566
    move-result v2

    .line 567
    :goto_28
    add-int/2addr v0, v2

    .line 568
    .line 569
    mul-int/lit8 v0, v0, 0x1f

    .line 570
    .line 571
    iget-object v2, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->priceEnd:Ljava/math/BigDecimal;

    .line 572
    .line 573
    if-nez v2, :cond_29

    .line 574
    move v2, v1

    .line 575
    goto :goto_29

    .line 576
    .line 577
    .line 578
    :cond_29
    invoke-virtual {v2}, Ljava/math/BigDecimal;->hashCode()I

    .line 579
    move-result v2

    .line 580
    :goto_29
    add-int/2addr v0, v2

    .line 581
    .line 582
    mul-int/lit8 v0, v0, 0x1f

    .line 583
    .line 584
    iget-object v2, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->pendingOrder:Ljava/lang/String;

    .line 585
    .line 586
    if-nez v2, :cond_2a

    .line 587
    move v2, v1

    .line 588
    goto :goto_2a

    .line 589
    .line 590
    .line 591
    :cond_2a
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 592
    move-result v2

    .line 593
    :goto_2a
    add-int/2addr v0, v2

    .line 594
    .line 595
    mul-int/lit8 v0, v0, 0x1f

    .line 596
    .line 597
    iget-object v2, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->buyNumber:Ljava/lang/String;

    .line 598
    .line 599
    if-nez v2, :cond_2b

    .line 600
    move v2, v1

    .line 601
    goto :goto_2b

    .line 602
    .line 603
    .line 604
    :cond_2b
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 605
    move-result v2

    .line 606
    :goto_2b
    add-int/2addr v0, v2

    .line 607
    .line 608
    mul-int/lit8 v0, v0, 0x1f

    .line 609
    .line 610
    iget-object v2, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->sellNumber:Ljava/lang/String;

    .line 611
    .line 612
    if-nez v2, :cond_2c

    .line 613
    move v2, v1

    .line 614
    goto :goto_2c

    .line 615
    .line 616
    .line 617
    :cond_2c
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 618
    move-result v2

    .line 619
    :goto_2c
    add-int/2addr v0, v2

    .line 620
    .line 621
    mul-int/lit8 v0, v0, 0x1f

    .line 622
    .line 623
    iget-object v2, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->buyNumberWidget:Ljava/lang/Float;

    .line 624
    .line 625
    if-nez v2, :cond_2d

    .line 626
    move v2, v1

    .line 627
    goto :goto_2d

    .line 628
    .line 629
    .line 630
    :cond_2d
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 631
    move-result v2

    .line 632
    :goto_2d
    add-int/2addr v0, v2

    .line 633
    .line 634
    mul-int/lit8 v0, v0, 0x1f

    .line 635
    .line 636
    iget-object v2, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->sellNumberWidget:Ljava/lang/Float;

    .line 637
    .line 638
    if-nez v2, :cond_2e

    .line 639
    move v2, v1

    .line 640
    goto :goto_2e

    .line 641
    .line 642
    .line 643
    :cond_2e
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 644
    move-result v2

    .line 645
    :goto_2e
    add-int/2addr v0, v2

    .line 646
    .line 647
    mul-int/lit8 v0, v0, 0x1f

    .line 648
    .line 649
    iget-object v2, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->splitWidget:Ljava/lang/Float;

    .line 650
    .line 651
    if-nez v2, :cond_2f

    .line 652
    move v2, v1

    .line 653
    goto :goto_2f

    .line 654
    .line 655
    .line 656
    :cond_2f
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 657
    move-result v2

    .line 658
    :goto_2f
    add-int/2addr v0, v2

    .line 659
    .line 660
    mul-int/lit8 v0, v0, 0x1f

    .line 661
    .line 662
    iget-object v2, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->weightSum:Ljava/lang/Float;

    .line 663
    .line 664
    if-nez v2, :cond_30

    .line 665
    move v2, v1

    .line 666
    goto :goto_30

    .line 667
    .line 668
    .line 669
    :cond_30
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 670
    move-result v2

    .line 671
    :goto_30
    add-int/2addr v0, v2

    .line 672
    .line 673
    mul-int/lit8 v0, v0, 0x1f

    .line 674
    .line 675
    iget v2, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->pendingOrderNumberSellColor:I

    .line 676
    .line 677
    .line 678
    invoke-static {v2}, Ljava/lang/Integer;->hashCode(I)I

    .line 679
    move-result v2

    .line 680
    add-int/2addr v0, v2

    .line 681
    .line 682
    mul-int/lit8 v0, v0, 0x1f

    .line 683
    .line 684
    iget v2, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->pendingOrderNumberBuyColor:I

    .line 685
    .line 686
    .line 687
    invoke-static {v2}, Ljava/lang/Integer;->hashCode(I)I

    .line 688
    move-result v2

    .line 689
    add-int/2addr v0, v2

    .line 690
    .line 691
    mul-int/lit8 v0, v0, 0x1f

    .line 692
    .line 693
    iget-object v2, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->buyNumberBg:Ljava/lang/Integer;

    .line 694
    .line 695
    if-nez v2, :cond_31

    .line 696
    move v2, v1

    .line 697
    goto :goto_31

    .line 698
    .line 699
    .line 700
    :cond_31
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 701
    move-result v2

    .line 702
    :goto_31
    add-int/2addr v0, v2

    .line 703
    .line 704
    mul-int/lit8 v0, v0, 0x1f

    .line 705
    .line 706
    iget-object v2, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->sellNumberBg:Ljava/lang/Integer;

    .line 707
    .line 708
    if-nez v2, :cond_32

    .line 709
    move v2, v1

    .line 710
    goto :goto_32

    .line 711
    .line 712
    .line 713
    :cond_32
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 714
    move-result v2

    .line 715
    :goto_32
    add-int/2addr v0, v2

    .line 716
    .line 717
    mul-int/lit8 v0, v0, 0x1f

    .line 718
    .line 719
    iget-object v2, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->taskId:Ljava/lang/Long;

    .line 720
    .line 721
    if-nez v2, :cond_33

    .line 722
    move v2, v1

    .line 723
    goto :goto_33

    .line 724
    .line 725
    .line 726
    :cond_33
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 727
    move-result v2

    .line 728
    :goto_33
    add-int/2addr v0, v2

    .line 729
    .line 730
    mul-int/lit8 v0, v0, 0x1f

    .line 731
    .line 732
    iget-object v2, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->runningStatus:Ljava/lang/String;

    .line 733
    .line 734
    if-nez v2, :cond_34

    .line 735
    move v2, v1

    .line 736
    goto :goto_34

    .line 737
    .line 738
    .line 739
    :cond_34
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 740
    move-result v2

    .line 741
    :goto_34
    add-int/2addr v0, v2

    .line 742
    .line 743
    mul-int/lit8 v0, v0, 0x1f

    .line 744
    .line 745
    iget-object v2, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->viewType:Ljava/lang/Integer;

    .line 746
    .line 747
    if-nez v2, :cond_35

    .line 748
    move v2, v1

    .line 749
    goto :goto_35

    .line 750
    .line 751
    .line 752
    :cond_35
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 753
    move-result v2

    .line 754
    :goto_35
    add-int/2addr v0, v2

    .line 755
    .line 756
    mul-int/lit8 v0, v0, 0x1f

    .line 757
    .line 758
    iget-object v2, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->pricePrecision:Ljava/lang/Integer;

    .line 759
    .line 760
    if-nez v2, :cond_36

    .line 761
    move v2, v1

    .line 762
    goto :goto_36

    .line 763
    .line 764
    .line 765
    :cond_36
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 766
    move-result v2

    .line 767
    :goto_36
    add-int/2addr v0, v2

    .line 768
    .line 769
    mul-int/lit8 v0, v0, 0x1f

    .line 770
    .line 771
    iget-object v2, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->profitPrecision:Ljava/lang/Integer;

    .line 772
    .line 773
    if-nez v2, :cond_37

    .line 774
    move v2, v1

    .line 775
    goto :goto_37

    .line 776
    .line 777
    .line 778
    :cond_37
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 779
    move-result v2

    .line 780
    :goto_37
    add-int/2addr v0, v2

    .line 781
    .line 782
    mul-int/lit8 v0, v0, 0x1f

    .line 783
    .line 784
    iget-object v2, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->openUnitPriceValue:Ljava/math/BigDecimal;

    .line 785
    .line 786
    if-nez v2, :cond_38

    .line 787
    move v2, v1

    .line 788
    goto :goto_38

    .line 789
    .line 790
    .line 791
    :cond_38
    invoke-virtual {v2}, Ljava/math/BigDecimal;->hashCode()I

    .line 792
    move-result v2

    .line 793
    :goto_38
    add-int/2addr v0, v2

    .line 794
    .line 795
    mul-int/lit8 v0, v0, 0x1f

    .line 796
    .line 797
    iget-object v2, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->openUnitPrice:Ljava/lang/String;

    .line 798
    .line 799
    if-nez v2, :cond_39

    .line 800
    move v2, v1

    .line 801
    goto :goto_39

    .line 802
    .line 803
    .line 804
    :cond_39
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 805
    move-result v2

    .line 806
    :goto_39
    add-int/2addr v0, v2

    .line 807
    .line 808
    mul-int/lit8 v0, v0, 0x1f

    .line 809
    .line 810
    iget-object v2, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->endTime:Ljava/lang/Long;

    .line 811
    .line 812
    if-nez v2, :cond_3a

    .line 813
    move v2, v1

    .line 814
    goto :goto_3a

    .line 815
    .line 816
    .line 817
    :cond_3a
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 818
    move-result v2

    .line 819
    :goto_3a
    add-int/2addr v0, v2

    .line 820
    .line 821
    mul-int/lit8 v0, v0, 0x1f

    .line 822
    .line 823
    iget-object v2, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->loadingString:Ljava/lang/String;

    .line 824
    .line 825
    if-nez v2, :cond_3b

    .line 826
    move v2, v1

    .line 827
    goto :goto_3b

    .line 828
    .line 829
    .line 830
    :cond_3b
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 831
    move-result v2

    .line 832
    :goto_3b
    add-int/2addr v0, v2

    .line 833
    .line 834
    mul-int/lit8 v0, v0, 0x1f

    .line 835
    .line 836
    iget-object v2, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->notTradingOrderPrice:Ljava/lang/String;

    .line 837
    .line 838
    if-nez v2, :cond_3c

    .line 839
    move v2, v1

    .line 840
    goto :goto_3c

    .line 841
    .line 842
    .line 843
    :cond_3c
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 844
    move-result v2

    .line 845
    :goto_3c
    add-int/2addr v0, v2

    .line 846
    .line 847
    mul-int/lit8 v0, v0, 0x1f

    .line 848
    .line 849
    iget-object v2, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->isOpenUnit:Ljava/lang/Boolean;

    .line 850
    .line 851
    if-nez v2, :cond_3d

    .line 852
    move v2, v1

    .line 853
    goto :goto_3d

    .line 854
    .line 855
    .line 856
    :cond_3d
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 857
    move-result v2

    .line 858
    :goto_3d
    add-int/2addr v0, v2

    .line 859
    .line 860
    mul-int/lit8 v0, v0, 0x1f

    .line 861
    .line 862
    iget-object v2, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->isRisk:Ljava/lang/Boolean;

    .line 863
    .line 864
    if-nez v2, :cond_3e

    .line 865
    move v2, v1

    .line 866
    goto :goto_3e

    .line 867
    .line 868
    .line 869
    :cond_3e
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 870
    move-result v2

    .line 871
    :goto_3e
    add-int/2addr v0, v2

    .line 872
    .line 873
    mul-int/lit8 v0, v0, 0x1f

    .line 874
    .line 875
    iget-object v2, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->futuresGridProtectionTip:Ljava/lang/String;

    .line 876
    .line 877
    if-nez v2, :cond_3f

    .line 878
    move v2, v1

    .line 879
    goto :goto_3f

    .line 880
    .line 881
    .line 882
    :cond_3f
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 883
    move-result v2

    .line 884
    :goto_3f
    add-int/2addr v0, v2

    .line 885
    .line 886
    mul-int/lit8 v0, v0, 0x1f

    .line 887
    .line 888
    iget-object v2, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->riskLimitTimeValue:Ljava/lang/Long;

    .line 889
    .line 890
    if-nez v2, :cond_40

    .line 891
    move v2, v1

    .line 892
    goto :goto_40

    .line 893
    .line 894
    .line 895
    :cond_40
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 896
    move-result v2

    .line 897
    :goto_40
    add-int/2addr v0, v2

    .line 898
    .line 899
    mul-int/lit8 v0, v0, 0x1f

    .line 900
    .line 901
    iget-object v2, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->riskLimitTime:Ljava/lang/String;

    .line 902
    .line 903
    if-nez v2, :cond_41

    .line 904
    move v2, v1

    .line 905
    goto :goto_41

    .line 906
    .line 907
    .line 908
    :cond_41
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 909
    move-result v2

    .line 910
    :goto_41
    add-int/2addr v0, v2

    .line 911
    .line 912
    mul-int/lit8 v0, v0, 0x1f

    .line 913
    .line 914
    iget-object v2, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->stopLossPriceValue:Ljava/math/BigDecimal;

    .line 915
    .line 916
    if-nez v2, :cond_42

    .line 917
    move v2, v1

    .line 918
    goto :goto_42

    .line 919
    .line 920
    .line 921
    :cond_42
    invoke-virtual {v2}, Ljava/math/BigDecimal;->hashCode()I

    .line 922
    move-result v2

    .line 923
    :goto_42
    add-int/2addr v0, v2

    .line 924
    .line 925
    mul-int/lit8 v0, v0, 0x1f

    .line 926
    .line 927
    iget-object v2, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->stopLossPrice:Ljava/lang/String;

    .line 928
    .line 929
    if-nez v2, :cond_43

    .line 930
    move v2, v1

    .line 931
    goto :goto_43

    .line 932
    .line 933
    .line 934
    :cond_43
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 935
    move-result v2

    .line 936
    :goto_43
    add-int/2addr v0, v2

    .line 937
    .line 938
    mul-int/lit8 v0, v0, 0x1f

    .line 939
    .line 940
    iget-object v2, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->stopProfitPriceValue:Ljava/math/BigDecimal;

    .line 941
    .line 942
    if-nez v2, :cond_44

    .line 943
    move v2, v1

    .line 944
    goto :goto_44

    .line 945
    .line 946
    .line 947
    :cond_44
    invoke-virtual {v2}, Ljava/math/BigDecimal;->hashCode()I

    .line 948
    move-result v2

    .line 949
    :goto_44
    add-int/2addr v0, v2

    .line 950
    .line 951
    mul-int/lit8 v0, v0, 0x1f

    .line 952
    .line 953
    iget-object v2, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->stopProfitPrice:Ljava/lang/String;

    .line 954
    .line 955
    if-nez v2, :cond_45

    .line 956
    move v2, v1

    .line 957
    goto :goto_45

    .line 958
    .line 959
    .line 960
    :cond_45
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 961
    move-result v2

    .line 962
    :goto_45
    add-int/2addr v0, v2

    .line 963
    .line 964
    mul-int/lit8 v0, v0, 0x1f

    .line 965
    .line 966
    iget-object v2, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->stopReason:Ljava/lang/String;

    .line 967
    .line 968
    if-nez v2, :cond_46

    .line 969
    move v2, v1

    .line 970
    goto :goto_46

    .line 971
    .line 972
    .line 973
    :cond_46
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 974
    move-result v2

    .line 975
    :goto_46
    add-int/2addr v0, v2

    .line 976
    .line 977
    mul-int/lit8 v0, v0, 0x1f

    .line 978
    .line 979
    iget-object v2, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->stopPriceText:Ljava/lang/String;

    .line 980
    .line 981
    if-nez v2, :cond_47

    .line 982
    move v2, v1

    .line 983
    goto :goto_47

    .line 984
    .line 985
    .line 986
    :cond_47
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 987
    move-result v2

    .line 988
    :goto_47
    add-int/2addr v0, v2

    .line 989
    .line 990
    mul-int/lit8 v0, v0, 0x1f

    .line 991
    .line 992
    iget-object v2, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->stopPriceNumber:Ljava/lang/String;

    .line 993
    .line 994
    if-nez v2, :cond_48

    .line 995
    move v2, v1

    .line 996
    goto :goto_48

    .line 997
    .line 998
    .line 999
    :cond_48
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 1000
    move-result v2

    .line 1001
    :goto_48
    add-int/2addr v0, v2

    .line 1002
    .line 1003
    mul-int/lit8 v0, v0, 0x1f

    .line 1004
    .line 1005
    iget-object v2, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->stopReasonDetail:Ljava/lang/String;

    .line 1006
    .line 1007
    if-nez v2, :cond_49

    .line 1008
    move v2, v1

    .line 1009
    goto :goto_49

    .line 1010
    .line 1011
    .line 1012
    :cond_49
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 1013
    move-result v2

    .line 1014
    :goto_49
    add-int/2addr v0, v2

    .line 1015
    .line 1016
    mul-int/lit8 v0, v0, 0x1f

    .line 1017
    .line 1018
    iget-object v2, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->transfers:Ljava/util/List;

    .line 1019
    .line 1020
    if-nez v2, :cond_4a

    .line 1021
    move v2, v1

    .line 1022
    goto :goto_4a

    .line 1023
    .line 1024
    .line 1025
    :cond_4a
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 1026
    move-result v2

    .line 1027
    :goto_4a
    add-int/2addr v0, v2

    .line 1028
    .line 1029
    mul-int/lit8 v0, v0, 0x1f

    .line 1030
    .line 1031
    iget v2, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->totalInvestVisible:I

    .line 1032
    .line 1033
    .line 1034
    invoke-static {v2}, Ljava/lang/Integer;->hashCode(I)I

    .line 1035
    move-result v2

    .line 1036
    add-int/2addr v0, v2

    .line 1037
    .line 1038
    mul-int/lit8 v0, v0, 0x1f

    .line 1039
    .line 1040
    iget-object v2, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->couponReward:Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel$CouponReward;

    .line 1041
    .line 1042
    if-nez v2, :cond_4b

    .line 1043
    goto :goto_4b

    .line 1044
    .line 1045
    .line 1046
    :cond_4b
    invoke-virtual {v2}, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel$CouponReward;->hashCode()I

    .line 1047
    move-result v1

    .line 1048
    :goto_4b
    add-int/2addr v0, v1

    .line 1049
    return v0
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
.end method

.method public final isOpenUnit()Ljava/lang/Boolean;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->isOpenUnit:Ljava/lang/Boolean;

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
    .line 58
    .line 59
.end method

.method public final isRisk()Ljava/lang/Boolean;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->isRisk:Ljava/lang/Boolean;

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
    .line 58
    .line 59
.end method

.method public final setArbitrage(Ljava/lang/String;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->arbitrage:Ljava/lang/String;

    .line 3
    return-void
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
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
.end method

.method public final setBuyNumber(Ljava/lang/String;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->buyNumber:Ljava/lang/String;

    .line 3
    return-void
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
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
.end method

.method public final setBuyNumberBg(Ljava/lang/Integer;)V
    .locals 0
    .param p1    # Ljava/lang/Integer;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->buyNumberBg:Ljava/lang/Integer;

    .line 3
    return-void
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
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
.end method

.method public final setBuyNumberWidget(Ljava/lang/Float;)V
    .locals 0
    .param p1    # Ljava/lang/Float;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->buyNumberWidget:Ljava/lang/Float;

    .line 3
    return-void
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
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
.end method

.method public final setCenterContentBgColor(Ljava/lang/Integer;)V
    .locals 0
    .param p1    # Ljava/lang/Integer;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->centerContentBgColor:Ljava/lang/Integer;

    .line 3
    return-void
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
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
.end method

.method public final setCouponReward(Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel$CouponReward;)V
    .locals 0
    .param p1    # Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel$CouponReward;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->couponReward:Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel$CouponReward;

    .line 3
    return-void
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
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
.end method

.method public final setDayArbitrageNum(Ljava/lang/Integer;)V
    .locals 0
    .param p1    # Ljava/lang/Integer;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->dayArbitrageNum:Ljava/lang/Integer;

    .line 3
    return-void
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
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
.end method

.method public final setDirection(Ljava/lang/String;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->direction:Ljava/lang/String;

    .line 3
    return-void
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
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
.end method

.method public final setDirectionBgColor(Ljava/lang/Integer;)V
    .locals 0
    .param p1    # Ljava/lang/Integer;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->directionBgColor:Ljava/lang/Integer;

    .line 3
    return-void
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
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
.end method

.method public final setDirectionCode(Ljava/lang/String;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->directionCode:Ljava/lang/String;

    .line 3
    return-void
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
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
.end method

.method public final setDirectionVisible(I)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->directionVisible:I

    .line 3
    return-void
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
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
.end method

.method public final setEndTime(Ljava/lang/Long;)V
    .locals 0
    .param p1    # Ljava/lang/Long;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->endTime:Ljava/lang/Long;

    .line 3
    return-void
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
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
.end method

.method public final setEntryPrice(Ljava/lang/String;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->entryPrice:Ljava/lang/String;

    .line 3
    return-void
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
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
.end method

.method public final setEntryPriceValue(Ljava/math/BigDecimal;)V
    .locals 0
    .param p1    # Ljava/math/BigDecimal;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->entryPriceValue:Ljava/math/BigDecimal;

    .line 3
    return-void
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
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
.end method

.method public final setFloatAmount(Ljava/lang/String;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->floatAmount:Ljava/lang/String;

    .line 3
    return-void
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
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
.end method

.method public final setFloatAmountValue(Ljava/math/BigDecimal;)V
    .locals 0
    .param p1    # Ljava/math/BigDecimal;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->floatAmountValue:Ljava/math/BigDecimal;

    .line 3
    return-void
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
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
.end method

.method public final setFundingFee(Ljava/lang/String;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->fundingFee:Ljava/lang/String;

    .line 3
    return-void
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
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
.end method

.method public final setFundingFeeValue(Ljava/math/BigDecimal;)V
    .locals 0
    .param p1    # Ljava/math/BigDecimal;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->fundingFeeValue:Ljava/math/BigDecimal;

    .line 3
    return-void
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
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
.end method

.method public final setFuturesGridProtectionTip(Ljava/lang/String;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->futuresGridProtectionTip:Ljava/lang/String;

    .line 3
    return-void
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
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
.end method

.method public final setGridProfit(Ljava/lang/String;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->gridProfit:Ljava/lang/String;

    .line 3
    return-void
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
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
.end method

.method public final setGridProfitValue(Ljava/math/BigDecimal;)V
    .locals 0
    .param p1    # Ljava/math/BigDecimal;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->gridProfitValue:Ljava/math/BigDecimal;

    .line 3
    return-void
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
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
.end method

.method public final setLastPrice(Ljava/lang/String;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->lastPrice:Ljava/lang/String;

    .line 3
    return-void
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
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
.end method

.method public final setLastPriceValue(Ljava/math/BigDecimal;)V
    .locals 0
    .param p1    # Ljava/math/BigDecimal;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->lastPriceValue:Ljava/math/BigDecimal;

    .line 3
    return-void
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
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
.end method

.method public final setLastPriceVisible(I)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->lastPriceVisible:I

    .line 3
    return-void
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
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
.end method

.method public final setLeverage(Ljava/lang/String;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->leverage:Ljava/lang/String;

    .line 3
    return-void
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
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
.end method

.method public final setLeverageBgColor(Ljava/lang/Integer;)V
    .locals 0
    .param p1    # Ljava/lang/Integer;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->leverageBgColor:Ljava/lang/Integer;

    .line 3
    return-void
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
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
.end method

.method public final setLeverageTextColor(Ljava/lang/Integer;)V
    .locals 0
    .param p1    # Ljava/lang/Integer;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->leverageTextColor:Ljava/lang/Integer;

    .line 3
    return-void
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
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
.end method

.method public final setLeverageValue(Ljava/lang/String;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->leverageValue:Ljava/lang/String;

    .line 3
    return-void
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
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
.end method

.method public final setLeverageVisible(I)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->leverageVisible:I

    .line 3
    return-void
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
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
.end method

.method public final setLiquidationPrice(Ljava/lang/String;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->liquidationPrice:Ljava/lang/String;

    .line 3
    return-void
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
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
.end method

.method public final setLiquidationPriceValue(Ljava/math/BigDecimal;)V
    .locals 0
    .param p1    # Ljava/math/BigDecimal;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->liquidationPriceValue:Ljava/math/BigDecimal;

    .line 3
    return-void
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
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
.end method

.method public final setLoadingString(Ljava/lang/String;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->loadingString:Ljava/lang/String;

    .line 3
    return-void
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
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
.end method

.method public final setNotTradingOrderPrice(Ljava/lang/String;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->notTradingOrderPrice:Ljava/lang/String;

    .line 3
    return-void
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
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
.end method

.method public final setOpenUnit(Ljava/lang/Boolean;)V
    .locals 0
    .param p1    # Ljava/lang/Boolean;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->isOpenUnit:Ljava/lang/Boolean;

    .line 3
    return-void
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
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
.end method

.method public final setOpenUnitPrice(Ljava/lang/String;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->openUnitPrice:Ljava/lang/String;

    .line 3
    return-void
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
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
.end method

.method public final setOpenUnitPriceValue(Ljava/math/BigDecimal;)V
    .locals 0
    .param p1    # Ljava/math/BigDecimal;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->openUnitPriceValue:Ljava/math/BigDecimal;

    .line 3
    return-void
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
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
.end method

.method public final setOutPriceRange(I)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->outPriceRange:I

    .line 3
    return-void
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
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
.end method

.method public final setPendingOrder(Ljava/lang/String;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->pendingOrder:Ljava/lang/String;

    .line 3
    return-void
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
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
.end method

.method public final setPendingOrderNumberBuyColor(I)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->pendingOrderNumberBuyColor:I

    .line 3
    return-void
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
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
.end method

.method public final setPendingOrderNumberSellColor(I)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->pendingOrderNumberSellColor:I

    .line 3
    return-void
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
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
.end method

.method public final setPriceEnd(Ljava/math/BigDecimal;)V
    .locals 0
    .param p1    # Ljava/math/BigDecimal;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->priceEnd:Ljava/math/BigDecimal;

    .line 3
    return-void
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
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
.end method

.method public final setPricePrecision(Ljava/lang/Integer;)V
    .locals 0
    .param p1    # Ljava/lang/Integer;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->pricePrecision:Ljava/lang/Integer;

    .line 3
    return-void
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
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
.end method

.method public final setPriceRange(Ljava/lang/String;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->priceRange:Ljava/lang/String;

    .line 3
    return-void
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
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
.end method

.method public final setPriceRangeColor(Ljava/lang/Integer;)V
    .locals 0
    .param p1    # Ljava/lang/Integer;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->priceRangeColor:Ljava/lang/Integer;

    .line 3
    return-void
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
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
.end method

.method public final setPriceStart(Ljava/math/BigDecimal;)V
    .locals 0
    .param p1    # Ljava/math/BigDecimal;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->priceStart:Ljava/math/BigDecimal;

    .line 3
    return-void
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
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
.end method

.method public final setProfitPrecision(Ljava/lang/Integer;)V
    .locals 0
    .param p1    # Ljava/lang/Integer;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->profitPrecision:Ljava/lang/Integer;

    .line 3
    return-void
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
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
.end method

.method public final setQuoteCode(Ljava/lang/String;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->quoteCode:Ljava/lang/String;

    .line 3
    return-void
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
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
.end method

.method public final setQuoteName(Ljava/lang/String;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->quoteName:Ljava/lang/String;

    .line 3
    return-void
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
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
.end method

.method public final setRisk(Ljava/lang/Boolean;)V
    .locals 0
    .param p1    # Ljava/lang/Boolean;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->isRisk:Ljava/lang/Boolean;

    .line 3
    return-void
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
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
.end method

.method public final setRiskLimitTime(Ljava/lang/String;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->riskLimitTime:Ljava/lang/String;

    .line 3
    return-void
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
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
.end method

.method public final setRiskLimitTimeValue(Ljava/lang/Long;)V
    .locals 0
    .param p1    # Ljava/lang/Long;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->riskLimitTimeValue:Ljava/lang/Long;

    .line 3
    return-void
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
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
.end method

.method public final setRunningStatus(Ljava/lang/String;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->runningStatus:Ljava/lang/String;

    .line 3
    return-void
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
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
.end method

.method public final setRunningTime(Ljava/lang/String;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->runningTime:Ljava/lang/String;

    .line 3
    return-void
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
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
.end method

.method public final setRunningTimeValue(Ljava/lang/Long;)V
    .locals 0
    .param p1    # Ljava/lang/Long;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->runningTimeValue:Ljava/lang/Long;

    .line 3
    return-void
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
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
.end method

.method public final setSellNumber(Ljava/lang/String;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->sellNumber:Ljava/lang/String;

    .line 3
    return-void
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
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
.end method

.method public final setSellNumberBg(Ljava/lang/Integer;)V
    .locals 0
    .param p1    # Ljava/lang/Integer;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->sellNumberBg:Ljava/lang/Integer;

    .line 3
    return-void
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
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
.end method

.method public final setSellNumberWidget(Ljava/lang/Float;)V
    .locals 0
    .param p1    # Ljava/lang/Float;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->sellNumberWidget:Ljava/lang/Float;

    .line 3
    return-void
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
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
.end method

.method public final setSplitWidget(Ljava/lang/Float;)V
    .locals 0
    .param p1    # Ljava/lang/Float;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->splitWidget:Ljava/lang/Float;

    .line 3
    return-void
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
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
.end method

.method public final setStopLossPrice(Ljava/lang/String;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->stopLossPrice:Ljava/lang/String;

    .line 3
    return-void
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
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
.end method

.method public final setStopLossPriceValue(Ljava/math/BigDecimal;)V
    .locals 0
    .param p1    # Ljava/math/BigDecimal;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->stopLossPriceValue:Ljava/math/BigDecimal;

    .line 3
    return-void
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
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
.end method

.method public final setStopPriceNumber(Ljava/lang/String;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->stopPriceNumber:Ljava/lang/String;

    .line 3
    return-void
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
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
.end method

.method public final setStopPriceText(Ljava/lang/String;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->stopPriceText:Ljava/lang/String;

    .line 3
    return-void
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
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
.end method

.method public final setStopProfitPrice(Ljava/lang/String;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->stopProfitPrice:Ljava/lang/String;

    .line 3
    return-void
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
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
.end method

.method public final setStopProfitPriceValue(Ljava/math/BigDecimal;)V
    .locals 0
    .param p1    # Ljava/math/BigDecimal;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->stopProfitPriceValue:Ljava/math/BigDecimal;

    .line 3
    return-void
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
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
.end method

.method public final setStopReason(Ljava/lang/String;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->stopReason:Ljava/lang/String;

    .line 3
    return-void
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
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
.end method

.method public final setStopReasonDetail(Ljava/lang/String;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->stopReasonDetail:Ljava/lang/String;

    .line 3
    return-void
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
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
.end method

.method public final setSymbolCode(Ljava/lang/String;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->symbolCode:Ljava/lang/String;

    .line 3
    return-void
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
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
.end method

.method public final setSymbolName(Ljava/lang/String;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->symbolName:Ljava/lang/String;

    .line 3
    return-void
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
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
.end method

.method public final setTaskId(Ljava/lang/Long;)V
    .locals 0
    .param p1    # Ljava/lang/Long;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->taskId:Ljava/lang/Long;

    .line 3
    return-void
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
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
.end method

.method public final setTotalArbitrageNum(Ljava/lang/Integer;)V
    .locals 0
    .param p1    # Ljava/lang/Integer;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->totalArbitrageNum:Ljava/lang/Integer;

    .line 3
    return-void
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
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
.end method

.method public final setTotalInvest(Ljava/lang/String;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->totalInvest:Ljava/lang/String;

    .line 3
    return-void
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
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
.end method

.method public final setTotalInvestText(Ljava/lang/String;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->totalInvestText:Ljava/lang/String;

    .line 3
    return-void
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
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
.end method

.method public final setTotalInvestValue(Ljava/math/BigDecimal;)V
    .locals 0
    .param p1    # Ljava/math/BigDecimal;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->totalInvestValue:Ljava/math/BigDecimal;

    .line 3
    return-void
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
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
.end method

.method public final setTotalInvestVisible(I)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->totalInvestVisible:I

    .line 3
    return-void
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
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
.end method

.method public final setTotalProfit(Ljava/lang/String;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->totalProfit:Ljava/lang/String;

    .line 3
    return-void
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
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
.end method

.method public final setTotalProfitColor(Ljava/lang/Integer;)V
    .locals 0
    .param p1    # Ljava/lang/Integer;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->totalProfitColor:Ljava/lang/Integer;

    .line 3
    return-void
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
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
.end method

.method public final setTotalProfitRate(Ljava/lang/String;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->totalProfitRate:Ljava/lang/String;

    .line 3
    return-void
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
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
.end method

.method public final setTotalProfitRateValue(Ljava/math/BigDecimal;)V
    .locals 0
    .param p1    # Ljava/math/BigDecimal;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->totalProfitRateValue:Ljava/math/BigDecimal;

    .line 3
    return-void
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
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
.end method

.method public final setTotalProfitText(Ljava/lang/String;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->totalProfitText:Ljava/lang/String;

    .line 3
    return-void
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
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
.end method

.method public final setTotalProfitValue(Ljava/math/BigDecimal;)V
    .locals 0
    .param p1    # Ljava/math/BigDecimal;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->totalProfitValue:Ljava/math/BigDecimal;

    .line 3
    return-void
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
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
.end method

.method public final setTransfers(Ljava/util/List;)V
    .locals 0
    .param p1    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel$Transfer;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->transfers:Ljava/util/List;

    .line 3
    return-void
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
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
.end method

.method public final setViewType(Ljava/lang/Integer;)V
    .locals 0
    .param p1    # Ljava/lang/Integer;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->viewType:Ljava/lang/Integer;

    .line 3
    return-void
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
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
.end method

.method public final setWeightSum(Ljava/lang/Float;)V
    .locals 0
    .param p1    # Ljava/lang/Float;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->weightSum:Ljava/lang/Float;

    .line 3
    return-void
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
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
.end method

.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 6
    .line 7
    const-string v1, "FuturesGridRunningItemModel(symbolName="

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    iget-object v1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->symbolName:Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    const-string v1, ", symbolCode="

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    iget-object v1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->symbolCode:Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    const-string v1, ", direction="

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    iget-object v1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->direction:Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    const-string v1, ", directionCode="

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    iget-object v1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->directionCode:Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    const-string v1, ", directionVisible="

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    iget v1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->directionVisible:I

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    const-string v1, ", leverageValue="

    .line 58
    .line 59
    .line 60
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    iget-object v1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->leverageValue:Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    const-string v1, ", leverage="

    .line 68
    .line 69
    .line 70
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    iget-object v1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->leverage:Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    const-string v1, ", leverageBgColor="

    .line 78
    .line 79
    .line 80
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    iget-object v1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->leverageBgColor:Ljava/lang/Integer;

    .line 83
    .line 84
    .line 85
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    const-string v1, ", leverageVisible="

    .line 88
    .line 89
    .line 90
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    iget v1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->leverageVisible:I

    .line 93
    .line 94
    .line 95
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    const-string v1, ", centerContentBgColor="

    .line 98
    .line 99
    .line 100
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    iget-object v1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->centerContentBgColor:Ljava/lang/Integer;

    .line 103
    .line 104
    .line 105
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    const-string v1, ", leverageTextColor="

    .line 108
    .line 109
    .line 110
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    iget-object v1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->leverageTextColor:Ljava/lang/Integer;

    .line 113
    .line 114
    .line 115
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 116
    .line 117
    const-string v1, ", directionBgColor="

    .line 118
    .line 119
    .line 120
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 121
    .line 122
    iget-object v1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->directionBgColor:Ljava/lang/Integer;

    .line 123
    .line 124
    .line 125
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 126
    .line 127
    const-string v1, ", lastPrice="

    .line 128
    .line 129
    .line 130
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 131
    .line 132
    iget-object v1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->lastPrice:Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 136
    .line 137
    const-string v1, ", lastPriceValue="

    .line 138
    .line 139
    .line 140
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 141
    .line 142
    iget-object v1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->lastPriceValue:Ljava/math/BigDecimal;

    .line 143
    .line 144
    .line 145
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 146
    .line 147
    const-string v1, ", lastPriceVisible="

    .line 148
    .line 149
    .line 150
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 151
    .line 152
    iget v1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->lastPriceVisible:I

    .line 153
    .line 154
    .line 155
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 156
    .line 157
    const-string v1, ", liquidationPriceValue="

    .line 158
    .line 159
    .line 160
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 161
    .line 162
    iget-object v1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->liquidationPriceValue:Ljava/math/BigDecimal;

    .line 163
    .line 164
    .line 165
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 166
    .line 167
    const-string v1, ", liquidationPrice="

    .line 168
    .line 169
    .line 170
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 171
    .line 172
    iget-object v1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->liquidationPrice:Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 176
    .line 177
    const-string v1, ", runningTimeValue="

    .line 178
    .line 179
    .line 180
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 181
    .line 182
    iget-object v1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->runningTimeValue:Ljava/lang/Long;

    .line 183
    .line 184
    .line 185
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 186
    .line 187
    const-string v1, ", runningTime="

    .line 188
    .line 189
    .line 190
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 191
    .line 192
    iget-object v1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->runningTime:Ljava/lang/String;

    .line 193
    .line 194
    .line 195
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 196
    .line 197
    const-string v1, ", quoteCode="

    .line 198
    .line 199
    .line 200
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 201
    .line 202
    iget-object v1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->quoteCode:Ljava/lang/String;

    .line 203
    .line 204
    .line 205
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 206
    .line 207
    const-string v1, ", quoteName="

    .line 208
    .line 209
    .line 210
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 211
    .line 212
    iget-object v1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->quoteName:Ljava/lang/String;

    .line 213
    .line 214
    .line 215
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 216
    .line 217
    const-string v1, ", totalInvestText="

    .line 218
    .line 219
    .line 220
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 221
    .line 222
    iget-object v1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->totalInvestText:Ljava/lang/String;

    .line 223
    .line 224
    .line 225
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 226
    .line 227
    const-string v1, ", totalInvest="

    .line 228
    .line 229
    .line 230
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 231
    .line 232
    iget-object v1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->totalInvest:Ljava/lang/String;

    .line 233
    .line 234
    .line 235
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 236
    .line 237
    const-string v1, ", totalInvestValue="

    .line 238
    .line 239
    .line 240
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 241
    .line 242
    iget-object v1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->totalInvestValue:Ljava/math/BigDecimal;

    .line 243
    .line 244
    .line 245
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 246
    .line 247
    const-string v1, ", totalProfitText="

    .line 248
    .line 249
    .line 250
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 251
    .line 252
    iget-object v1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->totalProfitText:Ljava/lang/String;

    .line 253
    .line 254
    .line 255
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 256
    .line 257
    const-string v1, ", totalProfit="

    .line 258
    .line 259
    .line 260
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 261
    .line 262
    iget-object v1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->totalProfit:Ljava/lang/String;

    .line 263
    .line 264
    .line 265
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 266
    .line 267
    const-string v1, ", totalProfitValue="

    .line 268
    .line 269
    .line 270
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 271
    .line 272
    iget-object v1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->totalProfitValue:Ljava/math/BigDecimal;

    .line 273
    .line 274
    .line 275
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 276
    .line 277
    const-string v1, ", totalProfitColor="

    .line 278
    .line 279
    .line 280
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 281
    .line 282
    iget-object v1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->totalProfitColor:Ljava/lang/Integer;

    .line 283
    .line 284
    .line 285
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 286
    .line 287
    const-string v1, ", totalProfitRate="

    .line 288
    .line 289
    .line 290
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 291
    .line 292
    iget-object v1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->totalProfitRate:Ljava/lang/String;

    .line 293
    .line 294
    .line 295
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 296
    .line 297
    const-string v1, ", totalProfitRateValue="

    .line 298
    .line 299
    .line 300
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 301
    .line 302
    iget-object v1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->totalProfitRateValue:Ljava/math/BigDecimal;

    .line 303
    .line 304
    .line 305
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 306
    .line 307
    const-string v1, ", dayArbitrageNum="

    .line 308
    .line 309
    .line 310
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 311
    .line 312
    iget-object v1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->dayArbitrageNum:Ljava/lang/Integer;

    .line 313
    .line 314
    .line 315
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 316
    .line 317
    const-string v1, ", totalArbitrageNum="

    .line 318
    .line 319
    .line 320
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 321
    .line 322
    iget-object v1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->totalArbitrageNum:Ljava/lang/Integer;

    .line 323
    .line 324
    .line 325
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 326
    .line 327
    const-string v1, ", arbitrage="

    .line 328
    .line 329
    .line 330
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 331
    .line 332
    iget-object v1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->arbitrage:Ljava/lang/String;

    .line 333
    .line 334
    .line 335
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 336
    .line 337
    const-string v1, ", gridProfit="

    .line 338
    .line 339
    .line 340
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 341
    .line 342
    iget-object v1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->gridProfit:Ljava/lang/String;

    .line 343
    .line 344
    .line 345
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 346
    .line 347
    const-string v1, ", gridProfitValue="

    .line 348
    .line 349
    .line 350
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 351
    .line 352
    iget-object v1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->gridProfitValue:Ljava/math/BigDecimal;

    .line 353
    .line 354
    .line 355
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 356
    .line 357
    const-string v1, ", floatAmount="

    .line 358
    .line 359
    .line 360
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 361
    .line 362
    iget-object v1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->floatAmount:Ljava/lang/String;

    .line 363
    .line 364
    .line 365
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 366
    .line 367
    const-string v1, ", floatAmountValue="

    .line 368
    .line 369
    .line 370
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 371
    .line 372
    iget-object v1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->floatAmountValue:Ljava/math/BigDecimal;

    .line 373
    .line 374
    .line 375
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 376
    .line 377
    const-string v1, ", fundingFee="

    .line 378
    .line 379
    .line 380
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 381
    .line 382
    iget-object v1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->fundingFee:Ljava/lang/String;

    .line 383
    .line 384
    .line 385
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 386
    .line 387
    const-string v1, ", fundingFeeValue="

    .line 388
    .line 389
    .line 390
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 391
    .line 392
    iget-object v1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->fundingFeeValue:Ljava/math/BigDecimal;

    .line 393
    .line 394
    .line 395
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 396
    .line 397
    const-string v1, ", entryPrice="

    .line 398
    .line 399
    .line 400
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 401
    .line 402
    iget-object v1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->entryPrice:Ljava/lang/String;

    .line 403
    .line 404
    .line 405
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 406
    .line 407
    const-string v1, ", entryPriceValue="

    .line 408
    .line 409
    .line 410
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 411
    .line 412
    iget-object v1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->entryPriceValue:Ljava/math/BigDecimal;

    .line 413
    .line 414
    .line 415
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 416
    .line 417
    const-string v1, ", priceRange="

    .line 418
    .line 419
    .line 420
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 421
    .line 422
    iget-object v1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->priceRange:Ljava/lang/String;

    .line 423
    .line 424
    .line 425
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 426
    .line 427
    const-string v1, ", priceRangeColor="

    .line 428
    .line 429
    .line 430
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 431
    .line 432
    iget-object v1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->priceRangeColor:Ljava/lang/Integer;

    .line 433
    .line 434
    .line 435
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 436
    .line 437
    const-string v1, ", outPriceRange="

    .line 438
    .line 439
    .line 440
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 441
    .line 442
    iget v1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->outPriceRange:I

    .line 443
    .line 444
    .line 445
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 446
    .line 447
    const-string v1, ", priceStart="

    .line 448
    .line 449
    .line 450
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 451
    .line 452
    iget-object v1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->priceStart:Ljava/math/BigDecimal;

    .line 453
    .line 454
    .line 455
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 456
    .line 457
    const-string v1, ", priceEnd="

    .line 458
    .line 459
    .line 460
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 461
    .line 462
    iget-object v1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->priceEnd:Ljava/math/BigDecimal;

    .line 463
    .line 464
    .line 465
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 466
    .line 467
    const-string v1, ", pendingOrder="

    .line 468
    .line 469
    .line 470
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 471
    .line 472
    iget-object v1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->pendingOrder:Ljava/lang/String;

    .line 473
    .line 474
    .line 475
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 476
    .line 477
    const-string v1, ", buyNumber="

    .line 478
    .line 479
    .line 480
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 481
    .line 482
    iget-object v1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->buyNumber:Ljava/lang/String;

    .line 483
    .line 484
    .line 485
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 486
    .line 487
    const-string v1, ", sellNumber="

    .line 488
    .line 489
    .line 490
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 491
    .line 492
    iget-object v1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->sellNumber:Ljava/lang/String;

    .line 493
    .line 494
    .line 495
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 496
    .line 497
    const-string v1, ", buyNumberWidget="

    .line 498
    .line 499
    .line 500
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 501
    .line 502
    iget-object v1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->buyNumberWidget:Ljava/lang/Float;

    .line 503
    .line 504
    .line 505
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 506
    .line 507
    const-string v1, ", sellNumberWidget="

    .line 508
    .line 509
    .line 510
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 511
    .line 512
    iget-object v1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->sellNumberWidget:Ljava/lang/Float;

    .line 513
    .line 514
    .line 515
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 516
    .line 517
    const-string v1, ", splitWidget="

    .line 518
    .line 519
    .line 520
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 521
    .line 522
    iget-object v1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->splitWidget:Ljava/lang/Float;

    .line 523
    .line 524
    .line 525
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 526
    .line 527
    const-string v1, ", weightSum="

    .line 528
    .line 529
    .line 530
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 531
    .line 532
    iget-object v1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->weightSum:Ljava/lang/Float;

    .line 533
    .line 534
    .line 535
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 536
    .line 537
    const-string v1, ", pendingOrderNumberSellColor="

    .line 538
    .line 539
    .line 540
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 541
    .line 542
    iget v1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->pendingOrderNumberSellColor:I

    .line 543
    .line 544
    .line 545
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 546
    .line 547
    const-string v1, ", pendingOrderNumberBuyColor="

    .line 548
    .line 549
    .line 550
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 551
    .line 552
    iget v1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->pendingOrderNumberBuyColor:I

    .line 553
    .line 554
    .line 555
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 556
    .line 557
    const-string v1, ", buyNumberBg="

    .line 558
    .line 559
    .line 560
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 561
    .line 562
    iget-object v1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->buyNumberBg:Ljava/lang/Integer;

    .line 563
    .line 564
    .line 565
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 566
    .line 567
    const-string v1, ", sellNumberBg="

    .line 568
    .line 569
    .line 570
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 571
    .line 572
    iget-object v1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->sellNumberBg:Ljava/lang/Integer;

    .line 573
    .line 574
    .line 575
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 576
    .line 577
    const-string v1, ", taskId="

    .line 578
    .line 579
    .line 580
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 581
    .line 582
    iget-object v1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->taskId:Ljava/lang/Long;

    .line 583
    .line 584
    .line 585
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 586
    .line 587
    const-string v1, ", runningStatus="

    .line 588
    .line 589
    .line 590
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 591
    .line 592
    iget-object v1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->runningStatus:Ljava/lang/String;

    .line 593
    .line 594
    .line 595
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 596
    .line 597
    const-string v1, ", viewType="

    .line 598
    .line 599
    .line 600
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 601
    .line 602
    iget-object v1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->viewType:Ljava/lang/Integer;

    .line 603
    .line 604
    .line 605
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 606
    .line 607
    const-string v1, ", pricePrecision="

    .line 608
    .line 609
    .line 610
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 611
    .line 612
    iget-object v1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->pricePrecision:Ljava/lang/Integer;

    .line 613
    .line 614
    .line 615
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 616
    .line 617
    const-string v1, ", profitPrecision="

    .line 618
    .line 619
    .line 620
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 621
    .line 622
    iget-object v1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->profitPrecision:Ljava/lang/Integer;

    .line 623
    .line 624
    .line 625
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 626
    .line 627
    const-string v1, ", openUnitPriceValue="

    .line 628
    .line 629
    .line 630
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 631
    .line 632
    iget-object v1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->openUnitPriceValue:Ljava/math/BigDecimal;

    .line 633
    .line 634
    .line 635
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 636
    .line 637
    const-string v1, ", openUnitPrice="

    .line 638
    .line 639
    .line 640
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 641
    .line 642
    iget-object v1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->openUnitPrice:Ljava/lang/String;

    .line 643
    .line 644
    .line 645
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 646
    .line 647
    const-string v1, ", endTime="

    .line 648
    .line 649
    .line 650
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 651
    .line 652
    iget-object v1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->endTime:Ljava/lang/Long;

    .line 653
    .line 654
    .line 655
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 656
    .line 657
    const-string v1, ", loadingString="

    .line 658
    .line 659
    .line 660
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 661
    .line 662
    iget-object v1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->loadingString:Ljava/lang/String;

    .line 663
    .line 664
    .line 665
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 666
    .line 667
    const-string v1, ", notTradingOrderPrice="

    .line 668
    .line 669
    .line 670
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 671
    .line 672
    iget-object v1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->notTradingOrderPrice:Ljava/lang/String;

    .line 673
    .line 674
    .line 675
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 676
    .line 677
    const-string v1, ", isOpenUnit="

    .line 678
    .line 679
    .line 680
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 681
    .line 682
    iget-object v1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->isOpenUnit:Ljava/lang/Boolean;

    .line 683
    .line 684
    .line 685
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 686
    .line 687
    const-string v1, ", isRisk="

    .line 688
    .line 689
    .line 690
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 691
    .line 692
    iget-object v1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->isRisk:Ljava/lang/Boolean;

    .line 693
    .line 694
    .line 695
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 696
    .line 697
    const-string v1, ", futuresGridProtectionTip="

    .line 698
    .line 699
    .line 700
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 701
    .line 702
    iget-object v1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->futuresGridProtectionTip:Ljava/lang/String;

    .line 703
    .line 704
    .line 705
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 706
    .line 707
    const-string v1, ", riskLimitTimeValue="

    .line 708
    .line 709
    .line 710
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 711
    .line 712
    iget-object v1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->riskLimitTimeValue:Ljava/lang/Long;

    .line 713
    .line 714
    .line 715
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 716
    .line 717
    const-string v1, ", riskLimitTime="

    .line 718
    .line 719
    .line 720
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 721
    .line 722
    iget-object v1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->riskLimitTime:Ljava/lang/String;

    .line 723
    .line 724
    .line 725
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 726
    .line 727
    const-string v1, ", stopLossPriceValue="

    .line 728
    .line 729
    .line 730
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 731
    .line 732
    iget-object v1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->stopLossPriceValue:Ljava/math/BigDecimal;

    .line 733
    .line 734
    .line 735
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 736
    .line 737
    const-string v1, ", stopLossPrice="

    .line 738
    .line 739
    .line 740
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 741
    .line 742
    iget-object v1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->stopLossPrice:Ljava/lang/String;

    .line 743
    .line 744
    .line 745
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 746
    .line 747
    const-string v1, ", stopProfitPriceValue="

    .line 748
    .line 749
    .line 750
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 751
    .line 752
    iget-object v1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->stopProfitPriceValue:Ljava/math/BigDecimal;

    .line 753
    .line 754
    .line 755
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 756
    .line 757
    const-string v1, ", stopProfitPrice="

    .line 758
    .line 759
    .line 760
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 761
    .line 762
    iget-object v1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->stopProfitPrice:Ljava/lang/String;

    .line 763
    .line 764
    .line 765
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 766
    .line 767
    const-string v1, ", stopReason="

    .line 768
    .line 769
    .line 770
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 771
    .line 772
    iget-object v1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->stopReason:Ljava/lang/String;

    .line 773
    .line 774
    .line 775
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 776
    .line 777
    const-string v1, ", stopPriceText="

    .line 778
    .line 779
    .line 780
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 781
    .line 782
    iget-object v1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->stopPriceText:Ljava/lang/String;

    .line 783
    .line 784
    .line 785
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 786
    .line 787
    const-string v1, ", stopPriceNumber="

    .line 788
    .line 789
    .line 790
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 791
    .line 792
    iget-object v1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->stopPriceNumber:Ljava/lang/String;

    .line 793
    .line 794
    .line 795
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 796
    .line 797
    const-string v1, ", stopReasonDetail="

    .line 798
    .line 799
    .line 800
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 801
    .line 802
    iget-object v1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->stopReasonDetail:Ljava/lang/String;

    .line 803
    .line 804
    .line 805
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 806
    .line 807
    const-string v1, ", transfers="

    .line 808
    .line 809
    .line 810
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 811
    .line 812
    iget-object v1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->transfers:Ljava/util/List;

    .line 813
    .line 814
    .line 815
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 816
    .line 817
    const-string v1, ", totalInvestVisible="

    .line 818
    .line 819
    .line 820
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 821
    .line 822
    iget v1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->totalInvestVisible:I

    .line 823
    .line 824
    .line 825
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 826
    .line 827
    const-string v1, ", couponReward="

    .line 828
    .line 829
    .line 830
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 831
    .line 832
    iget-object v1, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->couponReward:Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel$CouponReward;

    .line 833
    .line 834
    .line 835
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 836
    .line 837
    const/16 v1, 0x29

    .line 838
    .line 839
    .line 840
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 841
    .line 842
    .line 843
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 844
    move-result-object v0

    .line 845
    return-object v0
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 5
    .param p1    # Landroid/os/Parcel;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "dest"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->symbolName:Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 11
    .line 12
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->symbolCode:Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 16
    .line 17
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->direction:Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 21
    .line 22
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->directionCode:Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 26
    .line 27
    iget v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->directionVisible:I

    .line 28
    .line 29
    .line 30
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 31
    .line 32
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->leverageValue:Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 36
    .line 37
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->leverage:Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 41
    .line 42
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->leverageBgColor:Ljava/lang/Integer;

    .line 43
    const/4 v1, 0x1

    .line 44
    const/4 v2, 0x0

    .line 45
    .line 46
    if-nez v0, :cond_0

    .line 47
    .line 48
    .line 49
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    .line 50
    goto :goto_0

    .line 51
    .line 52
    .line 53
    :cond_0
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 57
    move-result v0

    .line 58
    .line 59
    .line 60
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 61
    .line 62
    :goto_0
    iget v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->leverageVisible:I

    .line 63
    .line 64
    .line 65
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 66
    .line 67
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->centerContentBgColor:Ljava/lang/Integer;

    .line 68
    .line 69
    if-nez v0, :cond_1

    .line 70
    .line 71
    .line 72
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    .line 73
    goto :goto_1

    .line 74
    .line 75
    .line 76
    :cond_1
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 80
    move-result v0

    .line 81
    .line 82
    .line 83
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 84
    .line 85
    :goto_1
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->leverageTextColor:Ljava/lang/Integer;

    .line 86
    .line 87
    if-nez v0, :cond_2

    .line 88
    .line 89
    .line 90
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    .line 91
    goto :goto_2

    .line 92
    .line 93
    .line 94
    :cond_2
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 98
    move-result v0

    .line 99
    .line 100
    .line 101
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 102
    .line 103
    :goto_2
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->directionBgColor:Ljava/lang/Integer;

    .line 104
    .line 105
    if-nez v0, :cond_3

    .line 106
    .line 107
    .line 108
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    .line 109
    goto :goto_3

    .line 110
    .line 111
    .line 112
    :cond_3
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 116
    move-result v0

    .line 117
    .line 118
    .line 119
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 120
    .line 121
    :goto_3
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->lastPrice:Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 125
    .line 126
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->lastPriceValue:Ljava/math/BigDecimal;

    .line 127
    .line 128
    .line 129
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeSerializable(Ljava/io/Serializable;)V

    .line 130
    .line 131
    iget v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->lastPriceVisible:I

    .line 132
    .line 133
    .line 134
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 135
    .line 136
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->liquidationPriceValue:Ljava/math/BigDecimal;

    .line 137
    .line 138
    .line 139
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeSerializable(Ljava/io/Serializable;)V

    .line 140
    .line 141
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->liquidationPrice:Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 145
    .line 146
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->runningTimeValue:Ljava/lang/Long;

    .line 147
    .line 148
    if-nez v0, :cond_4

    .line 149
    .line 150
    .line 151
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    .line 152
    goto :goto_4

    .line 153
    .line 154
    .line 155
    :cond_4
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 156
    .line 157
    .line 158
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 159
    move-result-wide v3

    .line 160
    .line 161
    .line 162
    invoke-virtual {p1, v3, v4}, Landroid/os/Parcel;->writeLong(J)V

    .line 163
    .line 164
    :goto_4
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->runningTime:Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 168
    .line 169
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->quoteCode:Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 173
    .line 174
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->quoteName:Ljava/lang/String;

    .line 175
    .line 176
    .line 177
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 178
    .line 179
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->totalInvestText:Ljava/lang/String;

    .line 180
    .line 181
    .line 182
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 183
    .line 184
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->totalInvest:Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 188
    .line 189
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->totalInvestValue:Ljava/math/BigDecimal;

    .line 190
    .line 191
    .line 192
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeSerializable(Ljava/io/Serializable;)V

    .line 193
    .line 194
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->totalProfitText:Ljava/lang/String;

    .line 195
    .line 196
    .line 197
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 198
    .line 199
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->totalProfit:Ljava/lang/String;

    .line 200
    .line 201
    .line 202
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 203
    .line 204
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->totalProfitValue:Ljava/math/BigDecimal;

    .line 205
    .line 206
    .line 207
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeSerializable(Ljava/io/Serializable;)V

    .line 208
    .line 209
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->totalProfitColor:Ljava/lang/Integer;

    .line 210
    .line 211
    if-nez v0, :cond_5

    .line 212
    .line 213
    .line 214
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    .line 215
    goto :goto_5

    .line 216
    .line 217
    .line 218
    :cond_5
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 219
    .line 220
    .line 221
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 222
    move-result v0

    .line 223
    .line 224
    .line 225
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 226
    .line 227
    :goto_5
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->totalProfitRate:Ljava/lang/String;

    .line 228
    .line 229
    .line 230
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 231
    .line 232
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->totalProfitRateValue:Ljava/math/BigDecimal;

    .line 233
    .line 234
    .line 235
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeSerializable(Ljava/io/Serializable;)V

    .line 236
    .line 237
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->dayArbitrageNum:Ljava/lang/Integer;

    .line 238
    .line 239
    if-nez v0, :cond_6

    .line 240
    .line 241
    .line 242
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    .line 243
    goto :goto_6

    .line 244
    .line 245
    .line 246
    :cond_6
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 247
    .line 248
    .line 249
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 250
    move-result v0

    .line 251
    .line 252
    .line 253
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 254
    .line 255
    :goto_6
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->totalArbitrageNum:Ljava/lang/Integer;

    .line 256
    .line 257
    if-nez v0, :cond_7

    .line 258
    .line 259
    .line 260
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    .line 261
    goto :goto_7

    .line 262
    .line 263
    .line 264
    :cond_7
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 265
    .line 266
    .line 267
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 268
    move-result v0

    .line 269
    .line 270
    .line 271
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 272
    .line 273
    :goto_7
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->arbitrage:Ljava/lang/String;

    .line 274
    .line 275
    .line 276
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 277
    .line 278
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->gridProfit:Ljava/lang/String;

    .line 279
    .line 280
    .line 281
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 282
    .line 283
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->gridProfitValue:Ljava/math/BigDecimal;

    .line 284
    .line 285
    .line 286
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeSerializable(Ljava/io/Serializable;)V

    .line 287
    .line 288
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->floatAmount:Ljava/lang/String;

    .line 289
    .line 290
    .line 291
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 292
    .line 293
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->floatAmountValue:Ljava/math/BigDecimal;

    .line 294
    .line 295
    .line 296
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeSerializable(Ljava/io/Serializable;)V

    .line 297
    .line 298
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->fundingFee:Ljava/lang/String;

    .line 299
    .line 300
    .line 301
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 302
    .line 303
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->fundingFeeValue:Ljava/math/BigDecimal;

    .line 304
    .line 305
    .line 306
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeSerializable(Ljava/io/Serializable;)V

    .line 307
    .line 308
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->entryPrice:Ljava/lang/String;

    .line 309
    .line 310
    .line 311
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 312
    .line 313
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->entryPriceValue:Ljava/math/BigDecimal;

    .line 314
    .line 315
    .line 316
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeSerializable(Ljava/io/Serializable;)V

    .line 317
    .line 318
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->priceRange:Ljava/lang/String;

    .line 319
    .line 320
    .line 321
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 322
    .line 323
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->priceRangeColor:Ljava/lang/Integer;

    .line 324
    .line 325
    if-nez v0, :cond_8

    .line 326
    .line 327
    .line 328
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    .line 329
    goto :goto_8

    .line 330
    .line 331
    .line 332
    :cond_8
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 333
    .line 334
    .line 335
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 336
    move-result v0

    .line 337
    .line 338
    .line 339
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 340
    .line 341
    :goto_8
    iget v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->outPriceRange:I

    .line 342
    .line 343
    .line 344
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 345
    .line 346
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->priceStart:Ljava/math/BigDecimal;

    .line 347
    .line 348
    .line 349
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeSerializable(Ljava/io/Serializable;)V

    .line 350
    .line 351
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->priceEnd:Ljava/math/BigDecimal;

    .line 352
    .line 353
    .line 354
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeSerializable(Ljava/io/Serializable;)V

    .line 355
    .line 356
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->pendingOrder:Ljava/lang/String;

    .line 357
    .line 358
    .line 359
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 360
    .line 361
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->buyNumber:Ljava/lang/String;

    .line 362
    .line 363
    .line 364
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 365
    .line 366
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->sellNumber:Ljava/lang/String;

    .line 367
    .line 368
    .line 369
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 370
    .line 371
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->buyNumberWidget:Ljava/lang/Float;

    .line 372
    .line 373
    if-nez v0, :cond_9

    .line 374
    .line 375
    .line 376
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    .line 377
    goto :goto_9

    .line 378
    .line 379
    .line 380
    :cond_9
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 381
    .line 382
    .line 383
    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    .line 384
    move-result v0

    .line 385
    .line 386
    .line 387
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeFloat(F)V

    .line 388
    .line 389
    :goto_9
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->sellNumberWidget:Ljava/lang/Float;

    .line 390
    .line 391
    if-nez v0, :cond_a

    .line 392
    .line 393
    .line 394
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    .line 395
    goto :goto_a

    .line 396
    .line 397
    .line 398
    :cond_a
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 399
    .line 400
    .line 401
    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    .line 402
    move-result v0

    .line 403
    .line 404
    .line 405
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeFloat(F)V

    .line 406
    .line 407
    :goto_a
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->splitWidget:Ljava/lang/Float;

    .line 408
    .line 409
    if-nez v0, :cond_b

    .line 410
    .line 411
    .line 412
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    .line 413
    goto :goto_b

    .line 414
    .line 415
    .line 416
    :cond_b
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 417
    .line 418
    .line 419
    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    .line 420
    move-result v0

    .line 421
    .line 422
    .line 423
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeFloat(F)V

    .line 424
    .line 425
    :goto_b
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->weightSum:Ljava/lang/Float;

    .line 426
    .line 427
    if-nez v0, :cond_c

    .line 428
    .line 429
    .line 430
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    .line 431
    goto :goto_c

    .line 432
    .line 433
    .line 434
    :cond_c
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 435
    .line 436
    .line 437
    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    .line 438
    move-result v0

    .line 439
    .line 440
    .line 441
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeFloat(F)V

    .line 442
    .line 443
    :goto_c
    iget v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->pendingOrderNumberSellColor:I

    .line 444
    .line 445
    .line 446
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 447
    .line 448
    iget v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->pendingOrderNumberBuyColor:I

    .line 449
    .line 450
    .line 451
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 452
    .line 453
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->buyNumberBg:Ljava/lang/Integer;

    .line 454
    .line 455
    if-nez v0, :cond_d

    .line 456
    .line 457
    .line 458
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    .line 459
    goto :goto_d

    .line 460
    .line 461
    .line 462
    :cond_d
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 463
    .line 464
    .line 465
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 466
    move-result v0

    .line 467
    .line 468
    .line 469
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 470
    .line 471
    :goto_d
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->sellNumberBg:Ljava/lang/Integer;

    .line 472
    .line 473
    if-nez v0, :cond_e

    .line 474
    .line 475
    .line 476
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    .line 477
    goto :goto_e

    .line 478
    .line 479
    .line 480
    :cond_e
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 481
    .line 482
    .line 483
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 484
    move-result v0

    .line 485
    .line 486
    .line 487
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 488
    .line 489
    :goto_e
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->taskId:Ljava/lang/Long;

    .line 490
    .line 491
    if-nez v0, :cond_f

    .line 492
    .line 493
    .line 494
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    .line 495
    goto :goto_f

    .line 496
    .line 497
    .line 498
    :cond_f
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 499
    .line 500
    .line 501
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 502
    move-result-wide v3

    .line 503
    .line 504
    .line 505
    invoke-virtual {p1, v3, v4}, Landroid/os/Parcel;->writeLong(J)V

    .line 506
    .line 507
    :goto_f
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->runningStatus:Ljava/lang/String;

    .line 508
    .line 509
    .line 510
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 511
    .line 512
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->viewType:Ljava/lang/Integer;

    .line 513
    .line 514
    if-nez v0, :cond_10

    .line 515
    .line 516
    .line 517
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    .line 518
    goto :goto_10

    .line 519
    .line 520
    .line 521
    :cond_10
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 522
    .line 523
    .line 524
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 525
    move-result v0

    .line 526
    .line 527
    .line 528
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 529
    .line 530
    :goto_10
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->pricePrecision:Ljava/lang/Integer;

    .line 531
    .line 532
    if-nez v0, :cond_11

    .line 533
    .line 534
    .line 535
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    .line 536
    goto :goto_11

    .line 537
    .line 538
    .line 539
    :cond_11
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 540
    .line 541
    .line 542
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 543
    move-result v0

    .line 544
    .line 545
    .line 546
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 547
    .line 548
    :goto_11
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->profitPrecision:Ljava/lang/Integer;

    .line 549
    .line 550
    if-nez v0, :cond_12

    .line 551
    .line 552
    .line 553
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    .line 554
    goto :goto_12

    .line 555
    .line 556
    .line 557
    :cond_12
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 558
    .line 559
    .line 560
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 561
    move-result v0

    .line 562
    .line 563
    .line 564
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 565
    .line 566
    :goto_12
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->openUnitPriceValue:Ljava/math/BigDecimal;

    .line 567
    .line 568
    .line 569
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeSerializable(Ljava/io/Serializable;)V

    .line 570
    .line 571
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->openUnitPrice:Ljava/lang/String;

    .line 572
    .line 573
    .line 574
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 575
    .line 576
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->endTime:Ljava/lang/Long;

    .line 577
    .line 578
    if-nez v0, :cond_13

    .line 579
    .line 580
    .line 581
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    .line 582
    goto :goto_13

    .line 583
    .line 584
    .line 585
    :cond_13
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 586
    .line 587
    .line 588
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 589
    move-result-wide v3

    .line 590
    .line 591
    .line 592
    invoke-virtual {p1, v3, v4}, Landroid/os/Parcel;->writeLong(J)V

    .line 593
    .line 594
    :goto_13
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->loadingString:Ljava/lang/String;

    .line 595
    .line 596
    .line 597
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 598
    .line 599
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->notTradingOrderPrice:Ljava/lang/String;

    .line 600
    .line 601
    .line 602
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 603
    .line 604
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->isOpenUnit:Ljava/lang/Boolean;

    .line 605
    .line 606
    if-nez v0, :cond_14

    .line 607
    .line 608
    .line 609
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    .line 610
    goto :goto_14

    .line 611
    .line 612
    .line 613
    :cond_14
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 614
    .line 615
    .line 616
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 617
    move-result v0

    .line 618
    .line 619
    .line 620
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 621
    .line 622
    :goto_14
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->isRisk:Ljava/lang/Boolean;

    .line 623
    .line 624
    if-nez v0, :cond_15

    .line 625
    .line 626
    .line 627
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    .line 628
    goto :goto_15

    .line 629
    .line 630
    .line 631
    :cond_15
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 632
    .line 633
    .line 634
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 635
    move-result v0

    .line 636
    .line 637
    .line 638
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 639
    .line 640
    :goto_15
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->futuresGridProtectionTip:Ljava/lang/String;

    .line 641
    .line 642
    .line 643
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 644
    .line 645
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->riskLimitTimeValue:Ljava/lang/Long;

    .line 646
    .line 647
    if-nez v0, :cond_16

    .line 648
    .line 649
    .line 650
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    .line 651
    goto :goto_16

    .line 652
    .line 653
    .line 654
    :cond_16
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 655
    .line 656
    .line 657
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 658
    move-result-wide v3

    .line 659
    .line 660
    .line 661
    invoke-virtual {p1, v3, v4}, Landroid/os/Parcel;->writeLong(J)V

    .line 662
    .line 663
    :goto_16
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->riskLimitTime:Ljava/lang/String;

    .line 664
    .line 665
    .line 666
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 667
    .line 668
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->stopLossPriceValue:Ljava/math/BigDecimal;

    .line 669
    .line 670
    .line 671
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeSerializable(Ljava/io/Serializable;)V

    .line 672
    .line 673
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->stopLossPrice:Ljava/lang/String;

    .line 674
    .line 675
    .line 676
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 677
    .line 678
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->stopProfitPriceValue:Ljava/math/BigDecimal;

    .line 679
    .line 680
    .line 681
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeSerializable(Ljava/io/Serializable;)V

    .line 682
    .line 683
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->stopProfitPrice:Ljava/lang/String;

    .line 684
    .line 685
    .line 686
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 687
    .line 688
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->stopReason:Ljava/lang/String;

    .line 689
    .line 690
    .line 691
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 692
    .line 693
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->stopPriceText:Ljava/lang/String;

    .line 694
    .line 695
    .line 696
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 697
    .line 698
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->stopPriceNumber:Ljava/lang/String;

    .line 699
    .line 700
    .line 701
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 702
    .line 703
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->stopReasonDetail:Ljava/lang/String;

    .line 704
    .line 705
    .line 706
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 707
    .line 708
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->transfers:Ljava/util/List;

    .line 709
    .line 710
    if-nez v0, :cond_17

    .line 711
    .line 712
    .line 713
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    .line 714
    goto :goto_18

    .line 715
    .line 716
    .line 717
    :cond_17
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 718
    .line 719
    .line 720
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 721
    move-result v3

    .line 722
    .line 723
    .line 724
    invoke-virtual {p1, v3}, Landroid/os/Parcel;->writeInt(I)V

    .line 725
    .line 726
    .line 727
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 728
    move-result-object v0

    .line 729
    .line 730
    .line 731
    :goto_17
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 732
    move-result v3

    .line 733
    .line 734
    if-eqz v3, :cond_18

    .line 735
    .line 736
    .line 737
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 738
    move-result-object v3

    .line 739
    .line 740
    check-cast v3, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel$Transfer;

    .line 741
    .line 742
    .line 743
    invoke-virtual {v3, p1, p2}, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel$Transfer;->writeToParcel(Landroid/os/Parcel;I)V

    .line 744
    goto :goto_17

    .line 745
    .line 746
    :cond_18
    :goto_18
    iget v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->totalInvestVisible:I

    .line 747
    .line 748
    .line 749
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 750
    .line 751
    iget-object v0, p0, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel;->couponReward:Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel$CouponReward;

    .line 752
    .line 753
    if-nez v0, :cond_19

    .line 754
    .line 755
    .line 756
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    .line 757
    return-void

    .line 758
    .line 759
    .line 760
    :cond_19
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 761
    .line 762
    .line 763
    invoke-virtual {v0, p1, p2}, Lcom/kubi/tradingbotkit/model/FuturesGridRunningItemModel$CouponReward;->writeToParcel(Landroid/os/Parcel;I)V

    .line 764
    return-void
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
.end method
