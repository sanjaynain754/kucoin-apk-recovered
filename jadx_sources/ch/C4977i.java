package ch;

import com.kubi.kumex.data.trade.model.OrderEntity;
import com.kubi.kumex.data.trade.model.StopOrderEntityActiveResult;
import fm.C37568c;
import java.math.BigDecimal;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p402kf.C41014a;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: ch.i */
/* JADX INFO: compiled from: OrderServiceImpl.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u001aB\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u001a2\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0002\u001a2\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00022\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0002\u001a0\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¨\u0006\r"}, m90084d2 = {"bindOrderSnapshot", "", "Lcom/kubi/kumex/data/trade/model/OrderEntity;", "", "snapshot", "", "orderAdded", "Lkotlin/Function0;", "", "orderRemoved", "tryUpdateOrder", "tryRemoveOrder", "removeStopActiveOrderFailed", "KumexLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C4977i {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final List<OrderEntity> m5281a(@NotNull List<OrderEntity> list, @NotNull Object snapshot, @Nullable Function0<Unit> function0, @Nullable Function0<Unit> function1) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(snapshot, "snapshot");
        if (snapshot instanceof OrderEntity) {
            OrderEntity orderEntity = (OrderEntity) snapshot;
            if (C37568c.m84647r(orderEntity)) {
                if (C37568c.m84632c(orderEntity)) {
                    m5284d(list, orderEntity, function0);
                    return list;
                }
                m5283c(list, orderEntity, function1);
                return list;
            }
            BigDecimal bigDecimalM89922G = C41014a.m89922G(orderEntity.getSize(), null, 1, null);
            BigDecimal bigDecimalAdd = C41014a.m89922G(orderEntity.getDealSize(), null, 1, null).add(C41014a.m89922G(orderEntity.getCancelSize(), null, 1, null));
            Intrinsics.checkNotNullExpressionValue(bigDecimalAdd, "add(...)");
            if (C41014a.m89920E(bigDecimalM89922G, bigDecimalAdd)) {
                m5284d(list, orderEntity, function0);
                return list;
            }
            m5283c(list, orderEntity, function1);
        }
        return list;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final List<OrderEntity> m5282b(@NotNull List<OrderEntity> list, @NotNull Object snapshot, @Nullable Function0<Unit> function0) {
        Object next;
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(snapshot, "snapshot");
        if (snapshot instanceof StopOrderEntityActiveResult) {
            Iterator<T> it = list.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!Intrinsics.areEqual(((OrderEntity) next).getId(), ((StopOrderEntityActiveResult) snapshot).getOrderId()));
            OrderEntity orderEntity = (OrderEntity) next;
            if (orderEntity != null && list.remove(orderEntity) && function0 != null) {
                function0.invoke();
            }
        }
        return list;
    }

    /* JADX INFO: renamed from: c */
    public static final List<OrderEntity> m5283c(List<OrderEntity> list, OrderEntity orderEntity, Function0<Unit> function0) {
        Object next;
        Iterator<T> it = list.iterator();
        do {
            if (it.hasNext()) {
                next = it.next();
            } else {
                next = null;
                break;
            }
        } while (!Intrinsics.areEqual(((OrderEntity) next).getId(), orderEntity.getId()));
        OrderEntity orderEntity2 = (OrderEntity) next;
        if (orderEntity2 != null && list.remove(orderEntity2) && function0 != null) {
            function0.invoke();
        }
        return list;
    }

    /* JADX INFO: renamed from: d */
    public static final List<OrderEntity> m5284d(List<OrderEntity> list, OrderEntity orderEntity, Function0<Unit> function0) {
        Object next;
        Iterator<T> it = list.iterator();
        do {
            if (it.hasNext()) {
                next = it.next();
            } else {
                next = null;
                break;
            }
        } while (!Intrinsics.areEqual(((OrderEntity) next).getId(), orderEntity.getId()));
        OrderEntity orderEntity2 = (OrderEntity) next;
        if (orderEntity2 == null || list.set(list.indexOf(orderEntity2), orderEntity) == null) {
            list.add(0, orderEntity);
            if (function0 != null) {
                function0.invoke();
            }
        }
        return list;
    }
}
