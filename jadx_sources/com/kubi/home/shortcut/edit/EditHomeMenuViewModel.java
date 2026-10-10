package com.kubi.home.shortcut.edit;

import android.text.TextUtils;
import androidx.lifecycle.ViewModel;
import com.google.gson.reflect.TypeToken;
import com.kubi.event.api.C12572a;
import com.kubi.home.shortcut.EmptyItem;
import com.kubi.home.shortcut.FunctionEntity;
import com.kubi.home.shortcut.IMenuItem;
import com.kubi.sdk.util.C24217a1;
import com.kubi.user.config.UserInfo;
import com.kubi.utils.C27099x;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.core.C27029c;
import com.kubi.welfare.api.entity.RemainAwardNumEntity;
import dj.C36719d;
import io.reactivex.Observable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l80.InterfaceC42137a;
import mr.C42597a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;
import y70.C46392a;
import y70.StorageId;

/* JADX INFO: renamed from: com.kubi.home.shortcut.edit.p, reason: from Kotlin metadata */
/* JADX INFO: compiled from: EditHomeMenuViewModel.kt */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(m90083d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0002J\u000e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00100\u0005H\u0002J\u000e\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bJ\u0010\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u000e\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bJ\u0016\u0010\u001e\u001a\u00020\u00192\u000e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0005J\u0016\u0010 \u001a\u00020\u001b2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00100\u0005H\u0002J\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020$0#R\u0016\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R!\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR!\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u000e\u001a\u0004\b\u0011\u0010\fR\u0016\u0010\u0013\u001a\n \u0015*\u0004\u0018\u00010\u00140\u0014X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006%"}, m90084d2 = {"Lcom/kubi/home/shortcut/edit/EditHomeMenuViewModel;", "Landroidx/lifecycle/ViewModel;", "<init>", "()V", "oldUserMenu", "", "", "functionStr", "userMenu", "", "Lcom/kubi/home/shortcut/IMenuItem;", "getUserMenu", "()Ljava/util/List;", "userMenu$delegate", "Lkotlin/Lazy;", "data", "Lcom/kubi/home/shortcut/FunctionEntity;", "getData", "data$delegate", "assetApi", "Lcom/kubi/welfare/api/remote/WelfareApi;", "kotlin.jvm.PlatformType", "initUserMenu", "initData", "setEditing", "", "editing", "", "removeOrRecoveryEmptyMenu", "setOtherEditing", "saveHomeMenu", "headerMenuList", "isUpdate", "list", "getRemainNum", "Lio/reactivex/Observable;", "Lcom/kubi/welfare/api/entity/RemainAwardNumEntity;", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nEditHomeMenuViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EditHomeMenuViewModel.kt\ncom/kubi/home/shortcut/edit/EditHomeMenuViewModel\n+ 2 HomeStoreId.kt\ncom/kubi/home/common/ex/HomeStoreIdKt\n+ 3 StorageId.kt\ncom/kubi/utils/storage/StorageId\n+ 4 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n+ 5 GsonUtils.kt\ncom/kubi/utils/GsonUtils\n+ 6 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 7 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,171:1\n109#2:172\n46#3:173\n32#4:174\n32#4:175\n23#4,2:230\n160#5,4:176\n1878#6,3:180\n1563#6:183\n1634#6,3:184\n808#6,11:187\n1878#6,3:198\n774#6:201\n865#6,2:202\n1374#6:204\n1460#6,5:205\n774#6:210\n865#6,2:211\n1869#6,2:213\n808#6,11:215\n1563#6:226\n1634#6,3:227\n808#6,11:232\n1617#6,9:243\n1869#6:252\n1870#6:254\n1626#6:255\n2767#6:256\n1878#6,3:257\n1#7:253\n*S KotlinDebug\n*F\n+ 1 EditHomeMenuViewModel.kt\ncom/kubi/home/shortcut/edit/EditHomeMenuViewModel\n*L\n49#1:172\n49#1:173\n49#1:174\n60#1:175\n148#1:230,2\n63#1:176,4\n66#1:180,3\n73#1:183\n73#1:184,3\n99#1:187,11\n100#1:198,3\n135#1:201\n135#1:202,2\n135#1:204\n135#1:205,5\n136#1:210\n136#1:211,2\n136#1:213,2\n146#1:215,11\n147#1:226\n147#1:227,3\n152#1:232,11\n161#1:243,9\n161#1:252\n161#1:254\n161#1:255\n161#1:256\n161#1:257,3\n161#1:253\n*E\n"})
public final class EditHomeMenuViewModel extends ViewModel {

    /* JADX INFO: renamed from: V */
    @Nullable
    public List<String> f26299V;

    /* JADX INFO: renamed from: W */
    @NotNull
    public String f26300W;

    /* JADX INFO: renamed from: X */
    @NotNull
    public final Lazy f26301X;

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final Lazy f26302Y;

    /* JADX INFO: renamed from: Z */
    public InterfaceC42137a f26303Z;

    /* JADX INFO: renamed from: com.kubi.home.shortcut.edit.p$a */
    /* JADX INFO: compiled from: EditHomeMenuViewModel.kt */
    @Metadata(m90083d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001¨\u0006\u0004"}, m90084d2 = {"com/kubi/home/shortcut/edit/EditHomeMenuViewModel$initData$1", "Lcom/google/gson/reflect/TypeToken;", "", "Lcom/kubi/home/shortcut/FunctionEntity;", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class a extends TypeToken<List<? extends FunctionEntity>> {
    }

    /* JADX INFO: renamed from: com.kubi.home.shortcut.edit.p$b */
    /* JADX INFO: compiled from: GsonUtils.kt */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/utils/GsonUtils$fromJSONOrNull$1", "Lcom/google/gson/reflect/TypeToken;", "Utils_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJSONOrNull$1\n*L\n1#1,300:1\n*E\n"})
    public static final class b extends TypeToken<List<? extends FunctionEntity>> {
    }

    @NotNull
    /* JADX INFO: renamed from: n */
    public final List<FunctionEntity> m30382n() {
        return (List) this.f26302Y.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: o */
    public final Observable<RemainAwardNumEntity> m30383o() {
        Observable observableCompose = this.f26303Z.m92468a().compose(C24217a1.m58389m());
        Intrinsics.checkNotNullExpressionValue(observableCompose, "compose(...)");
        return observableCompose;
    }

    @NotNull
    /* JADX INFO: renamed from: p */
    public final List<IMenuItem> m30384p() {
        return (List) this.f26301X.getValue();
    }

    /* JADX INFO: renamed from: q */
    public final List<FunctionEntity> m30385q() {
        if (TextUtils.isEmpty(this.f26300W)) {
            return new ArrayList();
        }
        Object objM66914d = C27099x.m66914d(this.f26300W, new a().getType());
        ArrayList arrayList = (ArrayList) objM66914d;
        if (arrayList != null && !arrayList.isEmpty()) {
            arrayList.remove(0);
        }
        return (List) objM66914d;
    }

    /* JADX INFO: renamed from: r */
    public final List<IMenuItem> m30386r() {
        Object objM66914d;
        ArrayList arrayList = new ArrayList();
        if (TextUtils.isEmpty(this.f26300W)) {
            this.f26300W = C46392a.m102326h(C36719d.f79632a.m82265j(), "");
        }
        if (!TextUtils.isEmpty(this.f26300W)) {
            String str = this.f26300W;
            try {
                C27099x c27099x = C27099x.f54458a;
                objM66914d = C27099x.m66914d(str, new b().getType());
            } catch (Throwable unused) {
                objM66914d = null;
            }
            List list = (List) objM66914d;
            if (list != null && !list.isEmpty()) {
                int i11 = 0;
                int i12 = 0;
                for (Object obj : list) {
                    int i13 = i12 + 1;
                    if (i12 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    if (Intrinsics.areEqual(((FunctionEntity) obj).getId(), "1111")) {
                        i11 = i12;
                    }
                    i12 = i13;
                }
                ArrayList<FunctionEntity> children = ((FunctionEntity) list.get(i11)).getChildren();
                if (children != null) {
                    arrayList.addAll(children);
                    ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(children, 10));
                    Iterator<T> it = children.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(C27041f.m66668h(((FunctionEntity) it.next()).getId()));
                    }
                    this.f26299V = arrayList2;
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: s */
    public final boolean m30387s(List<FunctionEntity> list) {
        if (this.f26299V != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                String id2 = ((FunctionEntity) it.next()).getId();
                if (id2 != null) {
                    arrayList.add(id2);
                }
            }
            int i11 = 0;
            for (Object obj : arrayList) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                String str = (String) obj;
                if (!StringsKt.contains$default((CharSequence) str, (CharSequence) str, false, 2, (Object) null) || i11 != StringsKt.indexOf$default((CharSequence) str, str, 0, false, 6, (Object) null)) {
                    return true;
                }
                i11 = i12;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: t */
    public final void m30388t(boolean z11) {
        if (!z11) {
            Iterator<IMenuItem> it = m30384p().iterator();
            while (it.hasNext()) {
                IMenuItem next = it.next();
                if (next.getF42794b() == 2 || next.getF42794b() == 3) {
                    it.remove();
                }
            }
            return;
        }
        List<IMenuItem> listM30384p = m30384p();
        if (listM30384p.size() < 19) {
            int size = 19 - listM30384p.size();
            for (int i11 = 0; i11 < size; i11++) {
                listM30384p.add(new EmptyItem());
            }
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m30389u(@Nullable List<? extends IMenuItem> list) {
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (obj instanceof FunctionEntity) {
                    arrayList.add(obj);
                }
            }
            List listDrop = CollectionsKt.drop(arrayList, 4);
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listDrop, 10));
            Iterator it = listDrop.iterator();
            while (it.hasNext()) {
                arrayList2.add(((FunctionEntity) it.next()).getId());
            }
            List listDistinct = CollectionsKt.distinct(arrayList2);
            StorageId<String> storageIdM82277v = C36719d.f79632a.m82277v();
            String strM66606i = C27029c.m66606i(listDistinct);
            Intrinsics.checkNotNullExpressionValue(strM66606i, "toJson(...)");
            C46392a.m102333p(storageIdM82277v, strM66606i);
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : list) {
                if (obj2 instanceof FunctionEntity) {
                    arrayList3.add(obj2);
                }
            }
            C12572a.m23695d("com.kubi.home.event.HomeEvent:updateShortcut", Boolean.valueOf(m30387s(arrayList3)), 0L, 4, null);
        }
    }

    public EditHomeMenuViewModel() {
        StorageId<String> storageIdM82265j = C36719d.f79632a.m82265j();
        String strI = UserInfo.a.i();
        this.f26300W = C46392a.m102326h(new StorageId(storageIdM82265j.getCategory(), storageIdM82265j.getKey() + strI, storageIdM82265j.getStorageType(), storageIdM82265j.getSupportLegacy()), "");
        this.f26301X = LazyKt.lazy(new Function0() { // from class: com.kubi.home.shortcut.edit.n
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EditHomeMenuViewModel.m30381x(this.f26297b);
            }
        });
        this.f26302Y = LazyKt.lazy(new Function0() { // from class: com.kubi.home.shortcut.edit.o
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EditHomeMenuViewModel.m30380e(this.f26298b);
            }
        });
        this.f26303Z = (InterfaceC42137a) C42597a.m93386b().create(InterfaceC42137a.class);
    }

    /* JADX INFO: renamed from: e */
    public static final List m30380e(EditHomeMenuViewModel editHomeMenuViewModel) {
        return editHomeMenuViewModel.m30385q();
    }

    /* JADX INFO: renamed from: x */
    public static final List m30381x(EditHomeMenuViewModel editHomeMenuViewModel) {
        return editHomeMenuViewModel.m30386r();
    }

    /* JADX INFO: renamed from: v */
    public final void m30390v(boolean z11) {
        List<IMenuItem> listM30384p = m30384p();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM30384p) {
            if (obj instanceof FunctionEntity) {
                arrayList.add(obj);
            }
        }
        int i11 = 0;
        for (Object obj2 : arrayList) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            FunctionEntity functionEntity = (FunctionEntity) obj2;
            if (i11 >= 4) {
                functionEntity.setEditing(z11);
            }
            i11 = i12;
        }
        if (arrayList.size() < 19) {
            m30391w(z11);
        }
        m30388t(z11);
    }

    /* JADX INFO: renamed from: w */
    public final void m30391w(boolean z11) {
        List<FunctionEntity> listM30382n = m30382n();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM30382n) {
            if (((FunctionEntity) obj).getChildren() != null) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ArrayList<FunctionEntity> children = ((FunctionEntity) it.next()).getChildren();
            Intrinsics.checkNotNull(children);
            CollectionsKt.addAll(arrayList2, children);
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : arrayList2) {
            if (((FunctionEntity) obj2).getEditable()) {
                arrayList3.add(obj2);
            }
        }
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            ((FunctionEntity) it2.next()).setEditing(z11);
        }
    }
}
