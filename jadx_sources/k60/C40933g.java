package k60;

import com.google.gson.reflect.TypeToken;
import com.kubi.kumex.data.platform.model.MarginModeInfoEntity;
import com.kubi.network.api.subscribe.model.SubscribeMessage;
import com.kubi.utils.C27099x;
import com.kubi.utils.extensions.C27041f;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kr.InterfaceC41975c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: renamed from: k60.g */
/* JADX INFO: compiled from: WebSocketConvert.kt */
/* JADX INFO: loaded from: classes52.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u000022\u0012\u0004\u0012\u00020\u0002\u0012(\u0012&\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0003j\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u0001`\u00060\u0001B\u0007¢\u0006\u0004\b\u0007\u0010\bJ4\u0010\t\u001a&\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0003j\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u0001`\u00062\u0006\u0010\n\u001a\u00020\u0002H\u0016¨\u0006\u000b"}, m90084d2 = {"Lcom/kubi/unify/convert/UnifyMarginModeConvert;", "Lcom/kubi/network/restful/core/IConverter;", "Lcom/kubi/network/api/subscribe/model/SubscribeMessage;", "Ljava/util/HashMap;", "", "Lcom/kubi/kumex/data/platform/model/MarginModeInfoEntity;", "Lkotlin/collections/HashMap;", "<init>", "()V", "convert", "value", "BUnifyAccountLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nWebSocketConvert.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebSocketConvert.kt\ncom/kubi/unify/convert/UnifyMarginModeConvert\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 GsonUtils.kt\ncom/kubi/utils/GsonUtils\n+ 4 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,147:1\n1#2:148\n149#3:149\n463#4:150\n413#4:151\n1252#5,4:152\n*S KotlinDebug\n*F\n+ 1 WebSocketConvert.kt\ncom/kubi/unify/convert/UnifyMarginModeConvert\n*L\n134#1:149\n135#1:150\n135#1:151\n135#1:152,4\n*E\n"})
public final class C40933g implements InterfaceC41975c<SubscribeMessage, HashMap<String, MarginModeInfoEntity>> {

    /* JADX INFO: renamed from: k60.g$a */
    /* JADX INFO: compiled from: GsonUtils.kt */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/utils/GsonUtils$fromJson$1", "Lcom/google/gson/reflect/TypeToken;", "Utils_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJson$1\n*L\n1#1,300:1\n*E\n"})
    public static final class a extends TypeToken<HashMap<String, String>> {
    }

    @Override // kr.InterfaceC41975c
    @Nullable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public HashMap<String, MarginModeInfoEntity> convert(@NotNull SubscribeMessage value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if ((Intrinsics.areEqual(value.getTopic(), "/unifiedAccount/innerMarginMode") ? this : null) == null) {
            return null;
        }
        try {
            String data = value.getData();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("raw data type=");
            sb2.append(data != null ? data.getClass() : null);
            sb2.append(", raw=");
            sb2.append(data);
            C44128b.m97259c("UnifyMarginModeConvert", sb2.toString());
            String strM66668h = C27041f.m66668h(value.getData());
            C27099x c27099x = C27099x.f54458a;
            HashMap map = (HashMap) C27099x.m66914d(strM66668h, new a().getType());
            LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(map.size()));
            for (Object obj : map.entrySet()) {
                linkedHashMap.put(((Map.Entry) obj).getKey(), new MarginModeInfoEntity((String) ((Map.Entry) obj).getValue(), null, 2, null));
            }
            HashMap<String, MarginModeInfoEntity> map2 = new HashMap<>(linkedHashMap);
            C44128b.m97259c("UnifyMarginModeConvert", "WS marginMode push: rawMap=" + map + ", result=" + map2 + ", data=" + value.getData());
            return map2;
        } catch (Exception e11) {
            C44128b.m97262f("UnifyMarginModeConvert", "parse error: " + e11.getMessage() + ", data=" + value.getData(), e11);
            return null;
        }
    }
}
