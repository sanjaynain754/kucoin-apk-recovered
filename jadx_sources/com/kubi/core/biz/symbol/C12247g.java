package com.kubi.core.biz.symbol;

import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import com.kubi.core.base.quote.DefaultSymbolQuoteRepo;
import id.C38519a;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import y70.StorageId;

/* JADX INFO: renamed from: com.kubi.core.biz.symbol.g */
/* JADX INFO: compiled from: ShareSymbolBizVM.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u001a \u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0000¨\u0006\u0007"}, m90084d2 = {"initializerSymbolBizVM", "Lcom/kubi/core/biz/symbol/ShareSymbolBizVM;", "store", "Landroidx/lifecycle/ViewModelStoreOwner;", "lastSymbolKey", "Lcom/kubi/utils/storage/StorageId;", "", "TradeCoreBizLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C12247g {

    /* JADX INFO: renamed from: com.kubi.core.biz.symbol.g$a */
    /* JADX INFO: compiled from: ShareSymbolBizVM.kt */
    @Metadata(m90083d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J%\u0010\u0002\u001a\u0002H\u0003\"\b\b\u0000\u0010\u0003*\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0006H\u0016¢\u0006\u0002\u0010\u0007¨\u0006\b"}, m90084d2 = {"com/kubi/core/biz/symbol/ShareSymbolBizVMKt$initializerSymbolBizVM$1", "Landroidx/lifecycle/ViewModelProvider$Factory;", "create", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class a implements ViewModelProvider.Factory {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ StorageId<String> f20879a;

        public a(StorageId<String> storageId) {
            this.f20879a = storageId;
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public <T extends ViewModel> T create(Class<T> modelClass) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            return new ShareSymbolBizVM(new DefaultSymbolQuoteRepo(), this.f20879a);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public static final ShareSymbolBizVM m22749a(@NotNull ViewModelStoreOwner store, @NotNull StorageId<String> lastSymbolKey) {
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(lastSymbolKey, "lastSymbolKey");
        return (ShareSymbolBizVM) new ViewModelProvider(store, new a(lastSymbolKey)).get(ShareSymbolBizVM.class);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ ShareSymbolBizVM m22750b(ViewModelStoreOwner viewModelStoreOwner, StorageId storageId, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            storageId = C38519a.f86479a.m87132g();
        }
        return m22749a(viewModelStoreOwner, storageId);
    }
}
