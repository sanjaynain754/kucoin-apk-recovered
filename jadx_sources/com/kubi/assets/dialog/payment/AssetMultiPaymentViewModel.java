package com.kubi.assets.dialog.payment;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.kubi.assets.AssetStorageIds;
import com.kubi.assets.AssetV2Api;
import com.kubi.sdk.function.language.MultiLanguageManager;
import com.kubi.sdk.mode.AppMode;
import com.tencent.rmonitor.base.p144db.table.DropFrameTable;
import java.util.List;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.flow.C41679x;
import kotlinx.coroutines.flow.InterfaceC41669n;
import kotlinx.coroutines.flow.InterfaceC41678w;
import mr.C42597a;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;
import ro.C44128b;
import y70.C46392a;
import y70.StorageId;

/* JADX INFO: compiled from: AssetMultiPaymentViewModel.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u0000 #2\u00020\u0001:\u0002#$B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019J\u000e\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u0019J\f\u0010\u001d\u001a\u00020\u001e*\u0004\u0018\u00010\u0013J\u001a\u0010\u001f\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0019H\u0002J \u0010 \u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010!\u001a\u00020\u0013H\u0002J\u0018\u0010\"\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0019H\u0002R#\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011¨\u0006%"}, m90084d2 = {"Lcom/kubi/assets/dialog/payment/AssetMultiPaymentViewModel;", "Landroidx/lifecycle/ViewModel;", "<init>", "()V", "api", "Lcom/kubi/assets/AssetV2Api;", "kotlin.jvm.PlatformType", "getApi", "()Lcom/kubi/assets/AssetV2Api;", "api$delegate", "Lkotlin/Lazy;", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/kubi/assets/dialog/payment/AssetMultiPaymentViewModel$UIState;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "_assetMergeConfigFlow", "Lcom/kubi/assets/dialog/payment/AssetPaymentListConfig;", "assetMergeConfigFlow", "getAssetMergeConfigFlow", "loadContent", "", "type", "", DropFrameTable.COLUMN_SCENE, "toBackupRoute", "tradeType", "isOK", "", "getCachedConfig", "saveConfigToCache", "config", "getCacheKey", "Companion", "UIState", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAssetMultiPaymentViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AssetMultiPaymentViewModel.kt\ncom/kubi/assets/dialog/payment/AssetMultiPaymentViewModel\n+ 2 StorageId.kt\ncom/kubi/utils/storage/StorageId\n+ 3 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n+ 4 KVStore.kt\ncom/kubi/utils/storage/KVStore\n*L\n1#1,157:1\n46#2:158\n46#2:162\n153#3,2:159\n144#3,2:163\n178#4:161\n*S KotlinDebug\n*F\n+ 1 AssetMultiPaymentViewModel.kt\ncom/kubi/assets/dialog/payment/AssetMultiPaymentViewModel\n*L\n131#1:158\n138#1:162\n131#1:159,2\n138#1:163,2\n131#1:161\n*E\n"})
public final class AssetMultiPaymentViewModel extends ViewModel {

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public static final Companion f17164a0 = new Companion(null);

    /* JADX INFO: renamed from: V */
    @NotNull
    public final Lazy f17165V = LazyKt.lazy(new Function0() { // from class: com.kubi.assets.dialog.payment.k
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AssetMultiPaymentViewModel.m16355t();
        }
    });

    /* JADX INFO: renamed from: W */
    @NotNull
    public final InterfaceC41669n<AbstractC9822a> f17166W;

    /* JADX INFO: renamed from: X */
    @NotNull
    public final InterfaceC41678w<AbstractC9822a> f17167X;

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final InterfaceC41669n<AssetPaymentListConfig> f17168Y;

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final InterfaceC41678w<AssetPaymentListConfig> f17169Z;

    /* JADX INFO: compiled from: AssetMultiPaymentViewModel.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/assets/dialog/payment/AssetMultiPaymentViewModel$Companion;", "", "<init>", "()V", "TAG", "", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.kubi.assets.dialog.payment.AssetMultiPaymentViewModel$a */
    /* JADX INFO: compiled from: AssetMultiPaymentViewModel.kt */
    @Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m90084d2 = {"Lcom/kubi/assets/dialog/payment/AssetMultiPaymentViewModel$UIState;", "", "<init>", "()V", "Loading", "Success", "Fail", "Lcom/kubi/assets/dialog/payment/AssetMultiPaymentViewModel$UIState$Fail;", "Lcom/kubi/assets/dialog/payment/AssetMultiPaymentViewModel$UIState$Loading;", "Lcom/kubi/assets/dialog/payment/AssetMultiPaymentViewModel$UIState$Success;", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static abstract class AbstractC9822a {

        /* JADX INFO: renamed from: com.kubi.assets.dialog.payment.AssetMultiPaymentViewModel$a$a */
        /* JADX INFO: compiled from: AssetMultiPaymentViewModel.kt */
        @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m90084d2 = {"Lcom/kubi/assets/dialog/payment/AssetMultiPaymentViewModel$UIState$Fail;", "Lcom/kubi/assets/dialog/payment/AssetMultiPaymentViewModel$UIState;", "<init>", "()V", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final class a extends AbstractC9822a {

            /* JADX INFO: renamed from: a */
            @NotNull
            public static final a f17170a = new a();

            public a() {
                super(null);
            }
        }

        /* JADX INFO: renamed from: com.kubi.assets.dialog.payment.AssetMultiPaymentViewModel$a$b */
        /* JADX INFO: compiled from: AssetMultiPaymentViewModel.kt */
        @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m90084d2 = {"Lcom/kubi/assets/dialog/payment/AssetMultiPaymentViewModel$UIState$Loading;", "Lcom/kubi/assets/dialog/payment/AssetMultiPaymentViewModel$UIState;", "<init>", "()V", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final class b extends AbstractC9822a {

            /* JADX INFO: renamed from: a */
            @NotNull
            public static final b f17171a = new b();

            public b() {
                super(null);
            }
        }

        /* JADX INFO: renamed from: com.kubi.assets.dialog.payment.AssetMultiPaymentViewModel$a$c */
        /* JADX INFO: compiled from: AssetMultiPaymentViewModel.kt */
        @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m90084d2 = {"Lcom/kubi/assets/dialog/payment/AssetMultiPaymentViewModel$UIState$Success;", "Lcom/kubi/assets/dialog/payment/AssetMultiPaymentViewModel$UIState;", "<init>", "()V", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final class c extends AbstractC9822a {

            /* JADX INFO: renamed from: a */
            @NotNull
            public static final c f17172a = new c();

            public c() {
                super(null);
            }
        }

        public /* synthetic */ AbstractC9822a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public AbstractC9822a() {
        }
    }

    /* JADX INFO: renamed from: A */
    public final void m16356A(@Nullable String str, @Nullable String str2) {
        if (str == null || StringsKt.isBlank(str) || str2 == null || StringsKt.isBlank(str2)) {
            this.f17166W.setValue(AbstractC9822a.a.f17170a);
            return;
        }
        AssetPaymentListConfig assetPaymentListConfigM16362x = m16362x(str, str2);
        if (m16364z(assetPaymentListConfigM16362x)) {
            C44128b.m97259c("AssetMultiPaymentViewMo", "Using cached data for " + str);
            this.f17168Y.setValue(assetPaymentListConfigM16362x);
            this.f17166W.setValue(AbstractC9822a.c.f17172a);
        } else {
            C44128b.m97259c("AssetMultiPaymentViewMo", "No cache found for " + str + ", showing loading state");
            this.f17166W.setValue(AbstractC9822a.b.f17171a);
        }
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), C42911a.m94120b(), null, new AssetMultiPaymentViewModel$loadContent$1(this, str, str2, assetPaymentListConfigM16362x, null), 2, null);
    }

    /* JADX INFO: renamed from: B */
    public final void m16357B(String str, String str2, AssetPaymentListConfig assetPaymentListConfig) {
        StorageId<AssetPaymentListConfig> storageIdM15239a = AssetStorageIds.f16425a.m15239a();
        C46392a.m102331n(new StorageId(storageIdM15239a.getCategory(), storageIdM15239a.getKey() + '-' + m16361w(str, str2), storageIdM15239a.getStorageType(), storageIdM15239a.getSupportLegacy()), assetPaymentListConfig);
    }

    /* JADX INFO: renamed from: C */
    public final void m16358C(@NotNull String tradeType) {
        Intrinsics.checkNotNullParameter(tradeType, "tradeType");
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new AssetMultiPaymentViewModel$toBackupRoute$1(tradeType, this, null), 3, null);
    }

    /* JADX INFO: renamed from: u */
    public final AssetV2Api m16359u() {
        return (AssetV2Api) this.f17165V.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: v */
    public final InterfaceC41678w<AssetPaymentListConfig> m16360v() {
        return this.f17169Z;
    }

    /* JADX INFO: renamed from: w */
    public final String m16361w(String str, String str2) {
        return str + '-' + str2 + '-' + MultiLanguageManager.f46811g.getLocalString() + '-' + AppMode.Companion.getCurrentMode$default(AppMode.INSTANCE, null, 1, null);
    }

    /* JADX INFO: renamed from: x */
    public final AssetPaymentListConfig m16362x(String str, String str2) {
        StorageId<AssetPaymentListConfig> storageIdM15239a = AssetStorageIds.f16425a.m15239a();
        return (AssetPaymentListConfig) C46392a.f104043a.m102336j(new StorageId(storageIdM15239a.getCategory(), storageIdM15239a.getKey() + '-' + m16361w(str, str2), storageIdM15239a.getStorageType(), storageIdM15239a.getSupportLegacy()), AssetPaymentListConfig.class, null);
    }

    @NotNull
    /* JADX INFO: renamed from: y */
    public final InterfaceC41678w<AbstractC9822a> m16363y() {
        return this.f17167X;
    }

    /* JADX INFO: renamed from: z */
    public final boolean m16364z(@Nullable AssetPaymentListConfig assetPaymentListConfig) {
        String scene;
        String tradeType;
        List<AssetPaymentListGroup> paymentMethod;
        return (assetPaymentListConfig == null || (scene = assetPaymentListConfig.getScene()) == null || StringsKt.isBlank(scene) || (tradeType = assetPaymentListConfig.getTradeType()) == null || StringsKt.isBlank(tradeType) || (paymentMethod = assetPaymentListConfig.getPaymentMethod()) == null || paymentMethod.isEmpty()) ? false : true;
    }

    public AssetMultiPaymentViewModel() {
        InterfaceC41669n<AbstractC9822a> interfaceC41669nM91009a = C41679x.m91009a(null);
        this.f17166W = interfaceC41669nM91009a;
        this.f17167X = interfaceC41669nM91009a;
        InterfaceC41669n<AssetPaymentListConfig> interfaceC41669nM91009a2 = C41679x.m91009a(null);
        this.f17168Y = interfaceC41669nM91009a2;
        this.f17169Z = interfaceC41669nM91009a2;
    }

    /* JADX INFO: renamed from: t */
    public static final AssetV2Api m16355t() {
        return (AssetV2Api) C42597a.m93388d().create(AssetV2Api.class);
    }
}
