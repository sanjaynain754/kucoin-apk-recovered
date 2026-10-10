package com.kubi.assets.dialog.evm;

import androidx.lifecycle.ViewModelKt;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.assets.entity.EvmRepeatAddressItemEntity;
import com.kubi.assets.entity.EvmRepeatAddressResponseEntity;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlinx.coroutines.C41696j;
import org.jetbrains.annotations.NotNull;
import p228eb.AbstractC37127a;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: EvmRepeatChainVM.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016J\u0018\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J\u0016\u0010\u0010\u001a\u00020\n2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0002J\u0010\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u0010\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\b\u0010\u0018\u001a\u00020\nH\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, m90084d2 = {"Lcom/kubi/assets/dialog/evm/EvmRepeatChainVM;", "Lcom/kubi/assets/mvi/BaseMviViewModel;", "Lcom/kubi/assets/dialog/evm/EvmRepeatChainIntent;", "Lcom/kubi/assets/dialog/evm/EvmRepeatChainState;", "Lcom/kubi/assets/dialog/evm/EvmRepeatChainEffect;", "<init>", "()V", "repo", "Lcom/kubi/assets/dialog/evm/EvmRepo;", "dispatch", "", "intent", "loadRepeatAddressList", "address", "", "memo", "setInitialData", "list", "", "Lcom/kubi/assets/entity/EvmRepeatAddressResponseEntity;", "toggleGroupExpand", ViewProps.POSITION, "", "deleteItem", "deleteRepeatAddress", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nEvmRepeatChainVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EvmRepeatChainVM.kt\ncom/kubi/assets/dialog/evm/EvmRepeatChainVM\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,189:1\n1573#2:190\n1604#2,4:191\n1573#2:195\n1604#2,4:196\n1#3:200\n*S KotlinDebug\n*F\n+ 1 EvmRepeatChainVM.kt\ncom/kubi/assets/dialog/evm/EvmRepeatChainVM\n*L\n66#1:190\n66#1:191,4\n95#1:195\n95#1:196,4\n*E\n"})
public final class EvmRepeatChainVM extends AbstractC37127a<EvmRepeatChainIntent, EvmRepeatChainState, EvmRepeatChainEffect> {

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final EvmRepo f17054Z;

    public EvmRepeatChainVM() {
        super(new EvmRepeatChainState(false, null, null, 7, null));
        this.f17054Z = EvmRepo.f17055a;
    }

    /* JADX INFO: renamed from: E */
    public static final EvmRepeatChainState m16263E(List list, EvmRepeatChainState reduce) {
        Intrinsics.checkNotNullParameter(reduce, "$this$reduce");
        return EvmRepeatChainState.m16307b(reduce, false, null, list, 3, null);
    }

    /* JADX INFO: renamed from: y */
    public static final EvmRepeatChainState m16270y(List list, EvmRepeatChainState reduce) {
        Intrinsics.checkNotNullParameter(reduce, "$this$reduce");
        return EvmRepeatChainState.m16307b(reduce, false, null, list, 3, null);
    }

    /* JADX INFO: renamed from: A */
    public void m16271A(@NotNull EvmRepeatChainIntent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        if (intent instanceof EvmRepeatChainIntent.LoadRepeatAddressList) {
            EvmRepeatChainIntent.LoadRepeatAddressList loadRepeatAddressList = (EvmRepeatChainIntent.LoadRepeatAddressList) intent;
            m16272B(loadRepeatAddressList.getAddress(), loadRepeatAddressList.getMemo());
            return;
        }
        if (intent instanceof EvmRepeatChainIntent.SetInitialData) {
            m16273C(((EvmRepeatChainIntent.SetInitialData) intent).m16299a());
            return;
        }
        if (intent instanceof EvmRepeatChainIntent.ToggleGroupExpand) {
            m16274D(((EvmRepeatChainIntent.ToggleGroupExpand) intent).getPosition());
        } else if (intent instanceof EvmRepeatChainIntent.b) {
            m16276z();
        } else {
            if (!(intent instanceof EvmRepeatChainIntent.DeleteItem)) {
                throw new NoWhenBranchMatchedException();
            }
            m16275x(((EvmRepeatChainIntent.DeleteItem) intent).getPosition());
        }
    }

    /* JADX INFO: renamed from: C */
    public final void m16273C(List<EvmRepeatAddressResponseEntity> list) {
        String str;
        boolean z11;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        int i11 = 0;
        for (Object obj : list) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            EvmRepeatAddressResponseEntity evmRepeatAddressResponseEntity = (EvmRepeatAddressResponseEntity) obj;
            List<EvmRepeatAddressItemEntity> addressList = evmRepeatAddressResponseEntity.getAddressList();
            if (addressList == null) {
                addressList = CollectionsKt.emptyList();
            }
            String address = evmRepeatAddressResponseEntity.getAddress();
            if (address == null) {
                address = "";
            }
            String memo = evmRepeatAddressResponseEntity.getMemo();
            String str2 = memo != null ? memo : "";
            int size = addressList.size();
            List<EvmRepeatAddressItemEntity> addressList2 = evmRepeatAddressResponseEntity.getAddressList();
            if (addressList2 == null) {
                addressList2 = CollectionsKt.emptyList();
            }
            List<EvmRepeatAddressItemEntity> list2 = addressList2;
            if (i11 == 0) {
                str = str2;
                z11 = true;
            } else {
                str = str2;
                z11 = false;
            }
            new EvmRepeatChainItem(i12, address, str, size, list2, z11);
            arrayList.add(r6);
            i11 = i12;
        }
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new EvmRepeatChainVM$setInitialData$1(arrayList, this, null), 3, null);
    }

    /* JADX INFO: renamed from: B */
    public final void m16272B(String str, String str2) {
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new EvmRepeatChainVM$loadRepeatAddressList$1(this, str, str2, null), 3, null);
    }

    /* JADX INFO: renamed from: D */
    public final void m16274D(int i11) {
        List<EvmRepeatChainItem> listM16309c = m83043o().getValue().m16309c();
        if (listM16309c != null && i11 >= 0 && i11 < listM16309c.size()) {
            final ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listM16309c, 10));
            int i12 = 0;
            for (Object obj : listM16309c) {
                int i13 = i12 + 1;
                if (i12 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                EvmRepeatChainItem evmRepeatChainItemM16301b = (EvmRepeatChainItem) obj;
                if (i12 == i11) {
                    evmRepeatChainItemM16301b = EvmRepeatChainItem.m16301b(evmRepeatChainItemM16301b, 0, null, null, 0, null, !evmRepeatChainItemM16301b.getExpanded(), 31, null);
                }
                arrayList.add(evmRepeatChainItemM16301b);
                i12 = i13;
            }
            m83044p(new Function1() { // from class: com.kubi.assets.dialog.evm.v
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return EvmRepeatChainVM.m16263E(arrayList, (EvmRepeatChainState) obj2);
                }
            });
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m16275x(int i11) {
        List<EvmRepeatChainItem> listM16309c = m83043o().getValue().m16309c();
        if (listM16309c != null && i11 >= 0 && i11 < listM16309c.size()) {
            final List mutableList = CollectionsKt.toMutableList((Collection) listM16309c);
            mutableList.remove(i11);
            if (mutableList.isEmpty()) {
                C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new EvmRepeatChainVM$deleteItem$1(this, null), 3, null);
            } else {
                m83044p(new Function1() { // from class: com.kubi.assets.dialog.evm.w
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return EvmRepeatChainVM.m16270y(mutableList, (EvmRepeatChainState) obj);
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m16276z() {
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new EvmRepeatChainVM$deleteRepeatAddress$1(this, null), 3, null);
    }
}
