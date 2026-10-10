package p288gc;

import com.google.gson.reflect.TypeToken;
import com.kubi.kumex.data.trade.model.OrderEntity;
import com.kubi.kumex.data.trade.model.StopOrderEntityActiveResult;
import com.kubi.network.api.subscribe.model.SubscribeMessage;
import com.kubi.utils.C27099x;
import com.kubi.utils.extensions.C27041f;
import kr.InterfaceC41975c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.collections.ArraysKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: gc.b */
/* JADX INFO: compiled from: IOrderSocketApi.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0002\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u000b\u001a\u00020\u0002H\u0016R\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\t¨\u0006\f"}, m90084d2 = {"Lcom/kubi/copytrading/copytd/common/order/api/AdvanceOrderConverts;", "Lcom/kubi/network/restful/core/IConverter;", "Lcom/kubi/network/api/subscribe/model/SubscribeMessage;", "", "<init>", "()V", "selfOrderSubject", "", "", "[Ljava/lang/String;", "convert", "value", "CopyTradingLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nIOrderSocketApi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IOrderSocketApi.kt\ncom/kubi/copytrading/copytd/common/order/api/AdvanceOrderConverts\n+ 2 GsonUtils.kt\ncom/kubi/utils/GsonUtils\n*L\n1#1,188:1\n149#2:189\n149#2:190\n*S KotlinDebug\n*F\n+ 1 IOrderSocketApi.kt\ncom/kubi/copytrading/copytd/common/order/api/AdvanceOrderConverts\n*L\n162#1:189\n164#1:190\n*E\n"})
public final class C37861b implements InterfaceC41975c<SubscribeMessage, Object> {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final String[] f85237a = {"trade.stopOrderCreated", "trade.stopOrderUpdate", "trade.stopOrderCancelled", "trade.stopOrderSizeUpdate"};

    /* JADX INFO: renamed from: gc.b$a */
    /* JADX INFO: compiled from: GsonUtils.kt */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/utils/GsonUtils$fromJson$1", "Lcom/google/gson/reflect/TypeToken;", "Utils_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJson$1\n*L\n1#1,300:1\n*E\n"})
    public static final class a extends TypeToken<OrderEntity> {
    }

    /* JADX INFO: renamed from: gc.b$b */
    /* JADX INFO: compiled from: GsonUtils.kt */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/utils/GsonUtils$fromJson$1", "Lcom/google/gson/reflect/TypeToken;", "Utils_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJson$1\n*L\n1#1,300:1\n*E\n"})
    public static final class b extends TypeToken<StopOrderEntityActiveResult> {
    }

    @Override // kr.InterfaceC41975c
    @Nullable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Object convert(@NotNull SubscribeMessage value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (Intrinsics.areEqual(value.getTopic(), "/contractMarket/stopOrder") && ArraysKt.contains(this.f85237a, value.getSubject())) {
            String strM66668h = C27041f.m66668h(value.getData());
            C27099x c27099x = C27099x.f54458a;
            return C27099x.m66914d(strM66668h, new a().getType());
        }
        if (!Intrinsics.areEqual(value.getTopic(), "/contractMarket/stopOrder") || !Intrinsics.areEqual(value.getSubject(), "trade.stopOrderActive")) {
            return null;
        }
        String strM66668h2 = C27041f.m66668h(value.getData());
        C27099x c27099x2 = C27099x.f54458a;
        return C27099x.m66914d(strM66668h2, new b().getType());
    }
}
