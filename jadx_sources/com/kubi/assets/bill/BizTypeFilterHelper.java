package com.kubi.assets.bill;

import com.kubi.assets.AssetV2Api;
import com.kubi.assets.R$string;
import com.kubi.assets.filter.FilterAccountType;
import com.kubi.assets.filter.ParcelizePair;
import com.kubi.mvi.common.MviExKt;
import com.kubi.resources.widget.drop.C23034a;
import com.kubi.resources.widget.drop.FilterType;
import com.kubi.sdk.function.language.MultiLanguageManager;
import com.kubi.utils.C27059l;
import io.reactivex.functions.Action;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import mr.C42597a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BizTypeFilterHelper.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\r\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\rJ\u001a\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\r2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015J$\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\b\u0010\u0019\u001a\u0004\u0018\u00010\r2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0017R#\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bRF\u0010\u000b\u001a:\u0012\u0004\u0012\u00020\r\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\r0\u000e0\fj\u001c\u0012\u0004\u0012\u00020\r\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\r0\u000e`\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, m90084d2 = {"Lcom/kubi/assets/bill/BizTypeFilterHelper;", "", "<init>", "()V", "api", "Lcom/kubi/assets/AssetV2Api;", "kotlin.jvm.PlatformType", "getApi", "()Lcom/kubi/assets/AssetV2Api;", "api$delegate", "Lkotlin/Lazy;", "cacheFilterTypeList", "Ljava/util/HashMap;", "", "", "Lkotlin/collections/HashMap;", "getFilterTypeList", "type", "fetchFilterTypeList", "", "callBack", "Lio/reactivex/functions/Action;", "getFilterDataByType", "", "Lcom/kubi/resources/widget/drop/DropMenuHelper$FilterData;", "fromType", "initParams", "Lcom/kubi/assets/filter/ParcelizePair;", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class BizTypeFilterHelper {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final BizTypeFilterHelper f16688a = new BizTypeFilterHelper();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Lazy f16689b = LazyKt.lazy(new Function0() { // from class: com.kubi.assets.bill.n1
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return BizTypeFilterHelper.m15714d();
        }
    });

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final HashMap<String, Map<String, String>> f16690c = new HashMap<>();

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m15715f(BizTypeFilterHelper bizTypeFilterHelper, String str, Action action, int i11, Object obj) throws Exception {
        if ((i11 & 2) != 0) {
            action = null;
        }
        bizTypeFilterHelper.m15716e(str, action);
    }

    /* JADX INFO: renamed from: e */
    public final void m15716e(@NotNull String type, @Nullable Action action) throws Exception {
        Intrinsics.checkNotNullParameter(type, "type");
        String str = MultiLanguageManager.f46811g.getLocalString() + type;
        Map<String, String> map = f16690c.get(str);
        if (map == null || map.isEmpty()) {
            MviExKt.m42518n(new BizTypeFilterHelper$fetchFilterTypeList$1(type, str, action, null));
        } else if (action != null) {
            action.run();
        }
    }

    /* JADX INFO: renamed from: g */
    public final AssetV2Api m15717g() {
        return (AssetV2Api) f16689b.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public final List<C23034a.a> m15718h(@Nullable String str, @NotNull List<ParcelizePair> initParams) {
        Intrinsics.checkNotNullParameter(initParams, "initParams");
        ArrayList arrayList = new ArrayList();
        if (str == null) {
            str = "MAIN";
        }
        Map<String, String> mapM15719i = m15719i(str);
        if (mapM15719i != null) {
            C23034a.a aVar = new C23034a.a(C27059l.f54343a.m66757a().getString(R$string.type), FilterType.Companion.convert2Filter$default(FilterType.f44543a, mapM15719i, false, 2, null));
            aVar.f44552a = "bizType";
            FilterAccountType.Companion companion = FilterAccountType.f17350a;
            FilterType.InterfaceC23033b[] interfaceC23033bArrM55168b = aVar.m55168b();
            Intrinsics.checkNotNullExpressionValue(interfaceC23033bArrM55168b, "getList(...)");
            String filterKey = aVar.f44552a;
            Intrinsics.checkNotNullExpressionValue(filterKey, "filterKey");
            companion.initStatus$AssetsCenterLib_googleRelease(interfaceC23033bArrM55168b, initParams, filterKey);
            arrayList.add(aVar);
        }
        return arrayList;
    }

    @Nullable
    /* JADX INFO: renamed from: i */
    public final Map<String, String> m15719i(@NotNull String type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return f16690c.get(MultiLanguageManager.f46811g.getLocalString() + type);
    }

    /* JADX INFO: renamed from: d */
    public static final AssetV2Api m15714d() {
        return (AssetV2Api) C42597a.m93387c().create(AssetV2Api.class);
    }
}
