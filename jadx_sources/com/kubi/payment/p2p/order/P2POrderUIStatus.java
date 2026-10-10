package com.kubi.payment.p2p.order;

import com.kubi.payment.p2p.data.entities.OrderDetailInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.payment.p2p.order.o1, reason: from Kotlin metadata */
/* JADX INFO: compiled from: OrderStatus.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0014\u001a\u00020\u00052\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016J\u0012\u0010\u0017\u001a\u00020\u00052\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0002J\u0010\u0010$\u001a\u00020\u00052\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006%"}, m90084d2 = {"Lcom/kubi/payment/p2p/order/P2POrderUIStatus;", "", "<init>", "()V", "BUY_STATUS_ORDER_CREATED", "", "BUY_STATUS_ORDER_WAIT_COIN", "BUY_STATUS_ORDER_APPEALING_OWN", "BUY_STATUS_ORDER_APPEALING_OTHER", "BUY_STATUS_ORDER_APPEALING_OWN_CONSULT", "BUY_STATUS_ORDER_APPEALING_OTHER_CONSULT", "BUY_STATUS_ORDER_APPEALING_OWN_SERVICE", "BUY_STATUS_ORDER_APPEALING_OTHER_SERVICE", "BUY_STATUS_ORDER_CHARGED", "BUY_STATUS_ORDER_CANCELED", "BUY_STATUS_EXPRESS_ORDER_UNCONFIRMED", "BUY_STATUS_EXPRESS_ORDER_PROCESSING", "BUY_STATUS_EXPRESS_ORDER_SUCCEEDED", "BUY_STATUS_EXPRESS_ORDER_FAILED", "BUY_STATUS_EXPRESS_ORDER_CANCELED", "buyerUIStatus", "info", "Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo;", "expressUIStatus", "expressInfo", "Lcom/kubi/payment/p2p/data/entities/OrderDetailInfo$ExpressInfo;", "SELL_STATUS_ORDER_CREATED", "SELL_STATUS_ORDER_PAY_COIN", "SELL_STATUS_ORDER_APPEALING_OWN", "SELL_STATUS_ORDER_APPEALING_OTHER", "SELL_STATUS_ORDER_APPEALING_OWN_CONSULT", "SELL_STATUS_ORDER_APPEALING_OTHER_CONSULT", "SELL_STATUS_ORDER_APPEALING_OWN_SERVICE", "SELL_STATUS_ORDER_APPEALING_OTHER_SERVICE", "SELL_STATUS_ORDER_CHARGED", "SELL_STATUS_ORDER_CANCELED", "sellerUIStatus", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class P2POrderUIStatus {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final P2POrderUIStatus f39868a = new P2POrderUIStatus();

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:30:0x005d  */
    /* JADX WARN: Code duplicated, block: B:32:0x0067  */
    /* JADX WARN: Code duplicated, block: B:33:0x006a  */
    /* JADX WARN: Code duplicated, block: B:34:0x006d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x006f  */
    /* JADX WARN: Code duplicated, block: B:36:0x0074  */
    /* JADX WARN: Code duplicated, block: B:38:0x0077  */
    /* JADX WARN: Code duplicated, block: B:41:0x007f  */
    /* JADX WARN: Code duplicated, block: B:44:0x0088  */
    /* JADX WARN: Code duplicated, block: B:45:0x008b  */
    /* JADX WARN: Code duplicated, block: B:48:0x0094  */
    /* JADX WARN: Code duplicated, block: B:51:0x009d  */
    /* JADX WARN: Code duplicated, block: B:52:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:55:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:56:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b8  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @NotNull
    /* JADX INFO: renamed from: a */
    public final String m48914a(@Nullable OrderDetailInfo orderDetailInfo) {
        String status;
        String str;
        String appealStatus = orderDetailInfo != null ? orderDetailInfo.getAppealStatus() : null;
        if (appealStatus != null) {
            switch (appealStatus.hashCode()) {
                case -1405115690:
                    if (appealStatus.equals(OrderDetailInfo.APPEAL_STATUS_CS_PROCESSING)) {
                        if (Intrinsics.areEqual(orderDetailInfo.getAppealBy(), "BUYER")) {
                            str = "BUY_STATUS_ORDER_APPEALING_OTHER_SERVICE";
                        } else {
                            str = "BUY_STATUS_ORDER_APPEALING_OWN_SERVICE";
                        }
                        break;
                    } else {
                        if (orderDetailInfo != null) {
                            status = orderDetailInfo.getStatus();
                        } else {
                            status = null;
                        }
                        if (status != null) {
                            switch (status) {
                                case "PAYED_MONEY":
                                    str = "BUY_STATUS_ORDER_WAIT_COIN";
                                    break;
                                case "PAYED_COIN":
                                    str = "BUY_STATUS_ORDER_CHARGED";
                                    break;
                                case "CANCELED":
                                    str = "BUY_STATUS_ORDER_CANCELED";
                                    break;
                                case "CHARGED":
                                    str = "BUY_STATUS_ORDER_CHARGED";
                                    break;
                                case "CREATED":
                                    str = "BUY_STATUS_ORDER_CREATED";
                                    break;
                                default:
                                    str = "";
                                    break;
                            }
                        } else {
                            str = "";
                            break;
                        }
                    }
                    break;
                case -1196086386:
                    if (appealStatus.equals(OrderDetailInfo.APPEAL_STATUS_CONSENT)) {
                        if (!Intrinsics.areEqual(orderDetailInfo.getAppealBy(), "BUYER")) {
                            str = "BUY_STATUS_ORDER_APPEALING_OTHER_CONSULT";
                        } else {
                            str = "BUY_STATUS_ORDER_APPEALING_OWN_CONSULT";
                        }
                        break;
                    } else {
                        if (orderDetailInfo != null) {
                            status = orderDetailInfo.getStatus();
                        } else {
                            status = null;
                        }
                        if (status != null) {
                            switch (status) {
                                case -851473016:
                                    if (status.equals(OrderDetailInfo.ORDER_STATUS_PAYED_MONEY)) {
                                        str = "BUY_STATUS_ORDER_WAIT_COIN";
                                    } else {
                                        str = "";
                                    }
                                    break;
                                case -720501591:
                                    if (status.equals(OrderDetailInfo.ORDER_STATUS_PAYED_COIN)) {
                                        str = "BUY_STATUS_ORDER_CHARGED";
                                    } else {
                                        str = "";
                                    }
                                    break;
                                case 659453081:
                                    if (status.equals(OrderDetailInfo.ORDER_STATUS_CANCELED)) {
                                        str = "BUY_STATUS_ORDER_CANCELED";
                                    } else {
                                        str = "";
                                    }
                                    break;
                                case 1457045520:
                                    if (status.equals(OrderDetailInfo.ORDER_STATUS_CHARGED)) {
                                        str = "BUY_STATUS_ORDER_CHARGED";
                                    } else {
                                        str = "";
                                    }
                                    break;
                                case 1746537160:
                                    if (status.equals("CREATED")) {
                                        str = "BUY_STATUS_ORDER_CREATED";
                                    } else {
                                        str = "";
                                    }
                                    break;
                                default:
                                    str = "";
                                    break;
                            }
                        } else {
                            str = "";
                            break;
                        }
                    }
                    break;
                case 489077715:
                    if (appealStatus.equals(OrderDetailInfo.APPEAL_STATUS_APPEALING)) {
                        if (!Intrinsics.areEqual(orderDetailInfo.getAppealBy(), "BUYER")) {
                            str = "BUY_STATUS_ORDER_APPEALING_OTHER";
                        } else {
                            str = "BUY_STATUS_ORDER_APPEALING_OWN";
                        }
                        break;
                    } else {
                        if (orderDetailInfo != null) {
                            status = orderDetailInfo.getStatus();
                        } else {
                            status = null;
                        }
                        if (status != null) {
                            switch (status) {
                                case -851473016:
                                    if (status.equals(OrderDetailInfo.ORDER_STATUS_PAYED_MONEY)) {
                                        str = "BUY_STATUS_ORDER_WAIT_COIN";
                                    } else {
                                        str = "";
                                    }
                                    break;
                                case -720501591:
                                    if (status.equals(OrderDetailInfo.ORDER_STATUS_PAYED_COIN)) {
                                        str = "BUY_STATUS_ORDER_CHARGED";
                                    } else {
                                        str = "";
                                    }
                                    break;
                                case 659453081:
                                    if (status.equals(OrderDetailInfo.ORDER_STATUS_CANCELED)) {
                                        str = "BUY_STATUS_ORDER_CANCELED";
                                    } else {
                                        str = "";
                                    }
                                    break;
                                case 1457045520:
                                    if (status.equals(OrderDetailInfo.ORDER_STATUS_CHARGED)) {
                                        str = "BUY_STATUS_ORDER_CHARGED";
                                    } else {
                                        str = "";
                                    }
                                    break;
                                case 1746537160:
                                    if (status.equals("CREATED")) {
                                        str = "BUY_STATUS_ORDER_CREATED";
                                    } else {
                                        str = "";
                                    }
                                    break;
                                default:
                                    str = "";
                                    break;
                            }
                        } else {
                            str = "";
                            break;
                        }
                    }
                    break;
                case 994335892:
                    if (appealStatus.equals(OrderDetailInfo.APPEAL_STATUS_CS_PENDING)) {
                        if (Intrinsics.areEqual(orderDetailInfo.getAppealBy(), "BUYER")) {
                            str = "BUY_STATUS_ORDER_APPEALING_OTHER_SERVICE";
                        } else {
                            str = "BUY_STATUS_ORDER_APPEALING_OWN_SERVICE";
                        }
                        break;
                    } else {
                        if (orderDetailInfo != null) {
                            status = orderDetailInfo.getStatus();
                        } else {
                            status = null;
                        }
                        if (status != null) {
                            switch (status) {
                                case -851473016:
                                    if (status.equals(OrderDetailInfo.ORDER_STATUS_PAYED_MONEY)) {
                                        str = "BUY_STATUS_ORDER_WAIT_COIN";
                                    } else {
                                        str = "";
                                    }
                                    break;
                                case -720501591:
                                    if (status.equals(OrderDetailInfo.ORDER_STATUS_PAYED_COIN)) {
                                        str = "BUY_STATUS_ORDER_CHARGED";
                                    } else {
                                        str = "";
                                    }
                                    break;
                                case 659453081:
                                    if (status.equals(OrderDetailInfo.ORDER_STATUS_CANCELED)) {
                                        str = "BUY_STATUS_ORDER_CANCELED";
                                    } else {
                                        str = "";
                                    }
                                    break;
                                case 1457045520:
                                    if (status.equals(OrderDetailInfo.ORDER_STATUS_CHARGED)) {
                                        str = "BUY_STATUS_ORDER_CHARGED";
                                    } else {
                                        str = "";
                                    }
                                    break;
                                case 1746537160:
                                    if (status.equals("CREATED")) {
                                        str = "BUY_STATUS_ORDER_CREATED";
                                    } else {
                                        str = "";
                                    }
                                    break;
                                default:
                                    str = "";
                                    break;
                            }
                        } else {
                            str = "";
                            break;
                        }
                    }
                    break;
                default:
                    if (orderDetailInfo != null) {
                        status = orderDetailInfo.getStatus();
                    } else {
                        status = null;
                    }
                    if (status != null) {
                        switch (status) {
                            case -851473016:
                                if (status.equals(OrderDetailInfo.ORDER_STATUS_PAYED_MONEY)) {
                                    str = "BUY_STATUS_ORDER_WAIT_COIN";
                                } else {
                                    str = "";
                                }
                                break;
                            case -720501591:
                                if (status.equals(OrderDetailInfo.ORDER_STATUS_PAYED_COIN)) {
                                    str = "BUY_STATUS_ORDER_CHARGED";
                                } else {
                                    str = "";
                                }
                                break;
                            case 659453081:
                                if (status.equals(OrderDetailInfo.ORDER_STATUS_CANCELED)) {
                                    str = "BUY_STATUS_ORDER_CANCELED";
                                } else {
                                    str = "";
                                }
                                break;
                            case 1457045520:
                                if (status.equals(OrderDetailInfo.ORDER_STATUS_CHARGED)) {
                                    str = "BUY_STATUS_ORDER_CHARGED";
                                } else {
                                    str = "";
                                }
                                break;
                            case 1746537160:
                                if (status.equals("CREATED")) {
                                    str = "BUY_STATUS_ORDER_CREATED";
                                } else {
                                    str = "";
                                }
                                break;
                            default:
                                str = "";
                                break;
                        }
                    } else {
                        str = "";
                        break;
                    }
                    break;
            }
        } else {
            if (orderDetailInfo != null) {
                status = orderDetailInfo.getStatus();
            } else {
                status = null;
            }
            if (status != null) {
                switch (status) {
                    case -851473016:
                        if (status.equals(OrderDetailInfo.ORDER_STATUS_PAYED_MONEY)) {
                            str = "BUY_STATUS_ORDER_WAIT_COIN";
                        } else {
                            str = "";
                        }
                        break;
                    case -720501591:
                        if (status.equals(OrderDetailInfo.ORDER_STATUS_PAYED_COIN)) {
                            str = "BUY_STATUS_ORDER_CHARGED";
                        } else {
                            str = "";
                        }
                        break;
                    case 659453081:
                        if (status.equals(OrderDetailInfo.ORDER_STATUS_CANCELED)) {
                            str = "BUY_STATUS_ORDER_CANCELED";
                        } else {
                            str = "";
                        }
                        break;
                    case 1457045520:
                        if (status.equals(OrderDetailInfo.ORDER_STATUS_CHARGED)) {
                            str = "BUY_STATUS_ORDER_CHARGED";
                        } else {
                            str = "";
                        }
                        break;
                    case 1746537160:
                        if (status.equals("CREATED")) {
                            str = "BUY_STATUS_ORDER_CREATED";
                        } else {
                            str = "";
                        }
                        break;
                    default:
                        str = "";
                        break;
                }
            } else {
                str = "";
            }
        }
        String strM48915b = m48915b(orderDetailInfo != null ? orderDetailInfo.getExpressInfo() : null);
        return strM48915b.length() > 0 ? strM48915b : str;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001b, code lost:
    
        if (r1.equals(com.kubi.payment.p2p.data.entities.OrderDetailInfo.APPEAL_STATUS_CS_PENDING) == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0056, code lost:
    
        if (r1.equals(com.kubi.payment.p2p.data.entities.OrderDetailInfo.APPEAL_STATUS_CS_PROCESSING) == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0061, code lost:
    
        if (p852kotlin.jvm.internal.Intrinsics.areEqual(r5.getAppealBy(), "SELLER") == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0063, code lost:
    
        return "SELL_STATUS_ORDER_APPEALING_OWN_SERVICE";
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0066, code lost:
    
        return "SELL_STATUS_ORDER_APPEALING_OTHER_SERVICE";
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @NotNull
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String m48916c(@Nullable OrderDetailInfo orderDetailInfo) {
        String appealStatus = orderDetailInfo != null ? orderDetailInfo.getAppealStatus() : null;
        if (appealStatus != null) {
            switch (appealStatus.hashCode()) {
                case -1405115690:
                    break;
                case -1196086386:
                    if (appealStatus.equals(OrderDetailInfo.APPEAL_STATUS_CONSENT)) {
                        return Intrinsics.areEqual(orderDetailInfo.getAppealBy(), "SELLER") ? "SELL_STATUS_ORDER_APPEALING_OWN_CONSULT" : "SELL_STATUS_ORDER_APPEALING_OTHER_CONSULT";
                    }
                    break;
                case 489077715:
                    if (appealStatus.equals(OrderDetailInfo.APPEAL_STATUS_APPEALING)) {
                        return Intrinsics.areEqual(orderDetailInfo.getAppealBy(), "SELLER") ? "SELL_STATUS_ORDER_APPEALING_OWN" : "SELL_STATUS_ORDER_APPEALING_OTHER";
                    }
                    break;
                case 994335892:
                    break;
            }
        }
        String status = orderDetailInfo != null ? orderDetailInfo.getStatus() : null;
        if (status == null) {
            return "";
        }
        switch (status.hashCode()) {
            case -851473016:
                return !status.equals(OrderDetailInfo.ORDER_STATUS_PAYED_MONEY) ? "" : "SELL_STATUS_ORDER_PAY_COIN";
            case -720501591:
                return !status.equals(OrderDetailInfo.ORDER_STATUS_PAYED_COIN) ? "" : "SELL_STATUS_ORDER_CHARGED";
            case 659453081:
                return !status.equals(OrderDetailInfo.ORDER_STATUS_CANCELED) ? "" : "SELL_STATUS_ORDER_CANCELED";
            case 1457045520:
                return !status.equals(OrderDetailInfo.ORDER_STATUS_CHARGED) ? "" : "SELL_STATUS_ORDER_CHARGED";
            case 1746537160:
                return !status.equals("CREATED") ? "" : "SELL_STATUS_ORDER_CREATED";
            default:
                return "";
        }
    }

    /* JADX INFO: renamed from: b */
    public final String m48915b(OrderDetailInfo.ExpressInfo expressInfo) {
        String status = expressInfo != null ? expressInfo.getStatus() : null;
        if (status == null) {
            return "";
        }
        switch (status.hashCode()) {
            case -562638271:
                return !status.equals("SUCCEEDED") ? "" : "BUY_STATUS_EXPRESS_ORDER_SUCCEEDED";
            case 659453081:
                return !status.equals(OrderDetailInfo.ORDER_STATUS_CANCELED) ? "" : "BUY_STATUS_EXPRESS_ORDER_CANCELED";
            case 907287315:
                return !status.equals("PROCESSING") ? "" : "BUY_STATUS_EXPRESS_ORDER_PROCESSING";
            case 1417290950:
                return status.equals("UNCONFIRMED") ? "BUY_STATUS_EXPRESS_ORDER_UNCONFIRMED" : "";
            case 2066319421:
                return !status.equals("FAILED") ? "" : "BUY_STATUS_EXPRESS_ORDER_FAILED";
            default:
                return "";
        }
    }
}
