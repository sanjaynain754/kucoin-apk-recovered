package p400kc;

import com.google.gson.reflect.TypeToken;
import com.kubi.kumex.data.trade.model.SymbolsCrossLeverage;
import com.kubi.network.api.subscribe.model.SubscribeMessage;
import com.kubi.utils.C27099x;
import com.kubi.utils.extensions.C27041f;
import kr.InterfaceC41975c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: kc.i */
/* JADX INFO: compiled from: ICrossSocketApi.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m90084d2 = {"Lcom/kubi/copytrading/copytd/cross/SelfCrossLeverageConvert;", "Lcom/kubi/network/restful/core/IConverter;", "Lcom/kubi/network/api/subscribe/model/SubscribeMessage;", "Lcom/kubi/kumex/data/trade/model/SymbolsCrossLeverage;", "<init>", "()V", "convert", "value", "CopyTradingLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nICrossSocketApi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ICrossSocketApi.kt\ncom/kubi/copytrading/copytd/cross/SelfCrossLeverageConvert\n+ 2 GsonUtils.kt\ncom/kubi/utils/GsonUtils\n*L\n1#1,141:1\n149#2:142\n*S KotlinDebug\n*F\n+ 1 ICrossSocketApi.kt\ncom/kubi/copytrading/copytd/cross/SelfCrossLeverageConvert\n*L\n125#1:142\n*E\n"})
public final class C40981i implements InterfaceC41975c<SubscribeMessage, SymbolsCrossLeverage> {

    /* JADX INFO: renamed from: kc.i$a */
    /* JADX INFO: compiled from: GsonUtils.kt */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/utils/GsonUtils$fromJson$1", "Lcom/google/gson/reflect/TypeToken;", "Utils_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJson$1\n*L\n1#1,300:1\n*E\n"})
    public static final class a extends TypeToken<SymbolsCrossLeverage> {
    }

    @Override // kr.InterfaceC41975c
    @Nullable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public SymbolsCrossLeverage convert(@NotNull SubscribeMessage value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (!Intrinsics.areEqual(value.getTopic(), "/contract/crossLeverage")) {
            return null;
        }
        String strM66668h = C27041f.m66668h(value.getData());
        C27099x c27099x = C27099x.f54458a;
        return (SymbolsCrossLeverage) C27099x.m66914d(strM66668h, new a().getType());
    }
}
