package r60;

import android.text.TextUtils;
import com.google.gson.reflect.TypeToken;
import com.kubi.network.api.subscribe.model.SubscribeMessage;
import com.kubi.unify.api.entity.UnifySupportService;
import com.kubi.unify.entity.UnifyOrderEntity;
import com.kubi.utils.C27099x;
import com.kubi.utils.extensions.C27041f;
import kr.InterfaceC41975c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: r60.c */
/* JADX INFO: compiled from: IOrderSocketApi.kt */
/* JADX INFO: loaded from: classes52.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0002\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B\u0011\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u000b\u001a\u00020\u0002H\u0016R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0004\u0010\b¨\u0006\f"}, m90084d2 = {"Lcom/kubi/unify/unify/common/order/api/UnifyOrderConverts;", "Lcom/kubi/network/restful/core/IConverter;", "Lcom/kubi/network/api/subscribe/model/SubscribeMessage;", "Lcom/kubi/unify/entity/UnifyOrderEntity;", "isActive", "", "<init>", "(Ljava/lang/Boolean;)V", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "convert", "value", "BUnifyAccountLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nIOrderSocketApi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IOrderSocketApi.kt\ncom/kubi/unify/unify/common/order/api/UnifyOrderConverts\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 GsonUtils.kt\ncom/kubi/utils/GsonUtils\n*L\n1#1,118:1\n1#2:119\n149#3:120\n*S KotlinDebug\n*F\n+ 1 IOrderSocketApi.kt\ncom/kubi/unify/unify/common/order/api/UnifyOrderConverts\n*L\n93#1:120\n*E\n"})
public final class C43934c implements InterfaceC41975c<SubscribeMessage, UnifyOrderEntity> {

    /* JADX INFO: renamed from: a */
    @Nullable
    public final Boolean f97145a;

    /* JADX INFO: renamed from: r60.c$a */
    /* JADX INFO: compiled from: GsonUtils.kt */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/utils/GsonUtils$fromJson$1", "Lcom/google/gson/reflect/TypeToken;", "Utils_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJson$1\n*L\n1#1,300:1\n*E\n"})
    public static final class a extends TypeToken<UnifyOrderEntity> {
    }

    @Override // kr.InterfaceC41975c
    @Nullable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public UnifyOrderEntity convert(@NotNull SubscribeMessage value) {
        Object objM103844constructorimpl;
        Intrinsics.checkNotNullParameter(value, "value");
        if ((Intrinsics.areEqual(value.getTopic(), "/unifiedAccount/innerOrderAll") ? this : null) != null) {
            try {
                Result.Companion companion = Result.INSTANCE;
                String strM66668h = C27041f.m66668h(value.getData());
                C27099x c27099x = C27099x.f54458a;
                objM103844constructorimpl = Result.m103844constructorimpl((UnifyOrderEntity) C27099x.m66914d(strM66668h, new a().getType()));
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
            }
            if (Result.m103850isFailureimpl(objM103844constructorimpl)) {
                objM103844constructorimpl = null;
            }
            UnifyOrderEntity unifyOrderEntity = (UnifyOrderEntity) objM103844constructorimpl;
            if ((unifyOrderEntity != null ? unifyOrderEntity.getEventType() : null) == null || Intrinsics.areEqual(unifyOrderEntity.getEventType(), "MATCH") || !Intrinsics.areEqual(unifyOrderEntity.getTradeType(), UnifySupportService.FUTURES.getValue())) {
                return null;
            }
            Boolean bool = this.f97145a;
            if (bool != null) {
                if (bool.booleanValue()) {
                    if (!TextUtils.isEmpty(unifyOrderEntity.getTriggerDirection())) {
                        return null;
                    }
                } else if (!TextUtils.isEmpty(unifyOrderEntity.getTriggerDirection())) {
                }
            }
            return unifyOrderEntity;
        }
        return null;
    }

    public C43934c(@Nullable Boolean bool) {
        this.f97145a = bool;
    }
}
