package p436lo;

import com.google.gson.reflect.TypeToken;
import com.kubi.loan.api.entity.LeverCoinConfig;
import com.kubi.utils.C27099x;
import com.kubi.utils.storage.StorageType;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p406ko.C41077a;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import y70.C46392a;
import y70.StorageId;

/* JADX INFO: renamed from: lo.d */
/* JADX INFO: compiled from: LoadPlatformStore.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u000b\u001a\u00020\u0006J\u0014\u0010\u000f\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012J\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012R!\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR!\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\r\u0010\b¨\u0006\u0015"}, m90084d2 = {"Lcom/kubi/loan/repo/platform/LoadPlatformStore;", "", "<init>", "()V", "leverCurrencyStoreId", "Lcom/kubi/utils/storage/StorageId;", "", "getLeverCurrencyStoreId", "()Lcom/kubi/utils/storage/StorageId;", "leverCurrencyStoreId$delegate", "Lkotlin/Lazy;", "getLeverCurrency", "leverCoinConfigKeyStoreId", "getLeverCoinConfigKeyStoreId", "leverCoinConfigKeyStoreId$delegate", "saveLeverCoinConfigList", "", "configList", "", "Lcom/kubi/loan/api/entity/LeverCoinConfig;", "getLeverCoinConfigList", "LoanLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nLoadPlatformStore.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LoadPlatformStore.kt\ncom/kubi/loan/repo/platform/LoadPlatformStore\n+ 2 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n+ 3 GsonUtils.kt\ncom/kubi/utils/GsonUtils\n*L\n1#1,58:1\n32#2:59\n23#2,2:60\n32#2:62\n160#3,4:63\n*S KotlinDebug\n*F\n+ 1 LoadPlatformStore.kt\ncom/kubi/loan/repo/platform/LoadPlatformStore\n*L\n30#1:59\n50#1:60,2\n54#1:62\n54#1:63,4\n*E\n"})
public final class C42281d {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final Lazy f93768a = LazyKt.lazy(new Function0() { // from class: lo.b
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C42281d.m92802h();
        }
    });

    /* JADX INFO: renamed from: b */
    @NotNull
    public final Lazy f93769b = LazyKt.lazy(new Function0() { // from class: lo.c
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C42281d.m92801g();
        }
    });

    /* JADX INFO: renamed from: lo.d$a */
    /* JADX INFO: compiled from: GsonUtils.kt */
    /* JADX INFO: loaded from: classes26.dex */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/utils/GsonUtils$fromJSONOrNull$1", "Lcom/google/gson/reflect/TypeToken;", "Utils_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJSONOrNull$1\n*L\n1#1,300:1\n*E\n"})
    public static final class a extends TypeToken<List<? extends LeverCoinConfig>> {
    }

    /* JADX INFO: renamed from: g */
    public static final StorageId m92801g() {
        return new StorageId("BLoan", "lever_coin_config", StorageType.LocalSite, false);
    }

    /* JADX INFO: renamed from: h */
    public static final StorageId m92802h() {
        return new StorageId("BLoan", "default_lever_currency", StorageType.LocalSite, true);
    }

    /* JADX INFO: renamed from: c */
    public final StorageId<String> m92803c() {
        return (StorageId) this.f93769b.getValue();
    }

    /* JADX INFO: renamed from: f */
    public final StorageId<String> m92806f() {
        return (StorageId) this.f93768a.getValue();
    }

    /* JADX INFO: renamed from: i */
    public final void m92807i(@NotNull List<LeverCoinConfig> configList) {
        Intrinsics.checkNotNullParameter(configList, "configList");
        C46392a.m102333p(m92803c(), C27099x.m66919i(configList, false, 2, null));
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final List<LeverCoinConfig> m92804d() {
        Object objM66914d;
        String strM102326h = C46392a.m102326h(m92803c(), "");
        try {
            C27099x c27099x = C27099x.f54458a;
            objM66914d = C27099x.m66914d(strM102326h, new a().getType());
        } catch (Throwable unused) {
            objM66914d = null;
        }
        List<LeverCoinConfig> list = (List) objM66914d;
        if (list == null) {
            return CollectionsKt.emptyList();
        }
        return list;
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final String m92805e() {
        return C46392a.m102326h(m92806f(), C41077a.f91294a.m90060a());
    }
}
