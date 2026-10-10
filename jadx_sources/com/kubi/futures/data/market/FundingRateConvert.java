package com.kubi.futures.data.market;

import com.google.gson.reflect.TypeToken;
import com.kubi.kumex.data.market.model.FundingRateEntity;
import com.kubi.network.api.subscribe.model.SubscribeMessage;
import com.kubi.utils.C27099x;
import com.kubi.utils.extensions.C27041f;
import kr.InterfaceC41975c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.kubi.futures.data.market.p, reason: from Kotlin metadata */
/* JADX INFO: compiled from: MarketConverts.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u00032\u0006\u0010\t\u001a\u00020\u0002H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m90084d2 = {"Lcom/kubi/futures/data/market/FundingRateConvert;", "Lcom/kubi/network/restful/core/IConverter;", "Lcom/kubi/network/api/subscribe/model/SubscribeMessage;", "Lcom/kubi/kumex/data/market/model/FundingRateEntity;", "topic", "", "<init>", "(Ljava/lang/String;)V", "convert", "value", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nMarketConverts.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MarketConverts.kt\ncom/kubi/futures/data/market/FundingRateConvert\n+ 2 GsonUtils.kt\ncom/kubi/utils/GsonUtils\n*L\n1#1,41:1\n149#2:42\n*S KotlinDebug\n*F\n+ 1 MarketConverts.kt\ncom/kubi/futures/data/market/FundingRateConvert\n*L\n21#1:42\n*E\n"})
public final class FundingRateConvert implements InterfaceC41975c<SubscribeMessage, FundingRateEntity> {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final String f22732a;

    /* JADX INFO: renamed from: com.kubi.futures.data.market.p$a */
    /* JADX INFO: compiled from: GsonUtils.kt */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/utils/GsonUtils$fromJson$1", "Lcom/google/gson/reflect/TypeToken;", "Utils_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJson$1\n*L\n1#1,300:1\n*E\n"})
    public static final class a extends TypeToken<FundingRateEntity> {
    }

    public FundingRateConvert(@NotNull String topic) {
        Intrinsics.checkNotNullParameter(topic, "topic");
        this.f22732a = topic;
    }

    @Override // kr.InterfaceC41975c
    @Nullable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public FundingRateEntity convert(@NotNull SubscribeMessage value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (!Intrinsics.areEqual(value.getTopic(), this.f22732a) || !Intrinsics.areEqual(value.getSubject(), "funding.rate")) {
            return null;
        }
        String strM66668h = C27041f.m66668h(value.getData());
        C27099x c27099x = C27099x.f54458a;
        return (FundingRateEntity) C27099x.m66914d(strM66668h, new a().getType());
    }
}
