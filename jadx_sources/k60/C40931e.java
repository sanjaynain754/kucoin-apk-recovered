package k60;

import com.google.gson.reflect.TypeToken;
import com.kubi.network.api.subscribe.model.SubscribeMessage;
import com.kubi.unify.entity.UnifyPriceEntity;
import com.kubi.unify.entity.UnifyPriceWrapperEntity;
import com.kubi.utils.C27099x;
import com.kubi.utils.extensions.C27041f;
import java.util.List;
import kr.InterfaceC41975c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: k60.e */
/* JADX INFO: compiled from: WebSocketConvert.kt */
/* JADX INFO: loaded from: classes52.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u0016\u0012\u0004\u0012\u00020\u0002\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, m90084d2 = {"Lcom/kubi/unify/convert/UnifyIndexPriceConvert;", "Lcom/kubi/network/restful/core/IConverter;", "Lcom/kubi/network/api/subscribe/model/SubscribeMessage;", "", "Lcom/kubi/unify/entity/UnifyPriceEntity;", "<init>", "()V", "convert", "value", "BUnifyAccountLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nWebSocketConvert.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebSocketConvert.kt\ncom/kubi/unify/convert/UnifyIndexPriceConvert\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 GsonUtils.kt\ncom/kubi/utils/GsonUtils\n*L\n1#1,147:1\n1#2:148\n149#3:149\n*S KotlinDebug\n*F\n+ 1 WebSocketConvert.kt\ncom/kubi/unify/convert/UnifyIndexPriceConvert\n*L\n55#1:149\n*E\n"})
public final class C40931e implements InterfaceC41975c<SubscribeMessage, List<? extends UnifyPriceEntity>> {

    /* JADX INFO: renamed from: k60.e$a */
    /* JADX INFO: compiled from: GsonUtils.kt */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/utils/GsonUtils$fromJson$1", "Lcom/google/gson/reflect/TypeToken;", "Utils_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJson$1\n*L\n1#1,300:1\n*E\n"})
    public static final class a extends TypeToken<UnifyPriceWrapperEntity> {
    }

    @Override // kr.InterfaceC41975c
    @Nullable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public List<UnifyPriceEntity> convert(@NotNull SubscribeMessage value) {
        Object objM103844constructorimpl;
        Intrinsics.checkNotNullParameter(value, "value");
        if ((StringsKt.startsWith$default(value.getTopic(), "/unifiedAccount/innerIndexPrice", false, 2, (Object) null) ? this : null) == null) {
            return null;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            String strM66668h = C27041f.m66668h(value.getData());
            C27099x c27099x = C27099x.f54458a;
            objM103844constructorimpl = Result.m103844constructorimpl(((UnifyPriceWrapperEntity) C27099x.m66914d(strM66668h, new a().getType())).getData());
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        return (List) (Result.m103850isFailureimpl(objM103844constructorimpl) ? null : objM103844constructorimpl);
    }
}
