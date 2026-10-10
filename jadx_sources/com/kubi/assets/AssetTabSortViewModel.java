package com.kubi.assets;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import androidx.webkit.Profile;
import com.kubi.assets.entity.SaveAccountOrderConfigBody;
import com.kubi.assets.view.tab.AssetTabSortHelper;
import com.kubi.sdk.BaseViewModel;
import com.kubi.sdk.base.entity.BaseEntity;
import com.kubi.utils.ToastCompat;
import com.kubi.utils.extensions.C27041f;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.C41782z0;
import lb.C42153h;
import mr.C42597a;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;
import p569qq.C43852m;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function3;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import y70.C46392a;

/* JADX INFO: compiled from: AssetTabSortViewModel.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(m90083d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JY\u0010\u0017\u001a\u00020\u00182Q\u0010\u0019\u001aM\u0012\u0013\u0012\u00110\u001b¢\u0006\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\b(\u001e\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\b(\u001f\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00140\u0013¢\u0006\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\b( \u0012\u0004\u0012\u00020\u00180\u001aJ\u0018\u0010!\u001a\u00020\u00182\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\"\u001a\u00020\u001bJ\u0016\u0010#\u001a\u00020\u00182\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\r0\u0013H\u0002J\b\u0010%\u001a\u00020\u0018H\u0002J$\u0010&\u001a\u00020\u00182\u0006\u0010\u000e\u001a\u00020\r2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\r0\u0013H\u0082@¢\u0006\u0002\u0010'J\"\u0010(\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010)\u001a\u00020\rH\u0002R#\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011¨\u0006*"}, m90084d2 = {"Lcom/kubi/assets/AssetTabSortViewModel;", "Lcom/kubi/sdk/BaseViewModel;", "<init>", "()V", "assetV2Api", "Lcom/kubi/assets/AssetV2Api;", "kotlin.jvm.PlatformType", "getAssetV2Api", "()Lcom/kubi/assets/AssetV2Api;", "assetV2Api$delegate", "Lkotlin/Lazy;", "_sortType", "Landroidx/lifecycle/MutableLiveData;", "", "sortType", "Landroidx/lifecycle/LiveData;", "getSortType", "()Landroidx/lifecycle/LiveData;", "_accountSortList", "", "Lcom/kubi/assets/AccountSortIndexItem;", "accountTypeList", "getAccountTypeList", "loadAccountOrders", "", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function3;", "", "Lkotlin/ParameterName;", "name", "succ", "orderType", "orders", "updateSortType", "needUpload", "sortByKeys", "sortKeys", "sortByAssetValue", "uploadSortConfig", "(Ljava/lang/String;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "trackUploadResult", "failMsg", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAssetTabSortViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AssetTabSortViewModel.kt\ncom/kubi/assets/AssetTabSortViewModel\n+ 2 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,177:1\n23#2,2:178\n1563#3:180\n1634#3,3:181\n1#4:184\n*S KotlinDebug\n*F\n+ 1 AssetTabSortViewModel.kt\ncom/kubi/assets/AssetTabSortViewModel\n*L\n86#1:178,2\n98#1:180\n98#1:181,3\n*E\n"})
public final class AssetTabSortViewModel extends BaseViewModel {

    /* JADX INFO: renamed from: X */
    @NotNull
    public final Lazy f16330X = LazyKt.lazy(new Function0() { // from class: com.kubi.assets.c0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AssetTabSortViewModel.m15171v();
        }
    });

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final MutableLiveData<String> f16331Y;

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final LiveData<String> f16332Z;

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public final MutableLiveData<List<AccountSortIndexItem>> f16333a0;

    /* JADX INFO: renamed from: b0 */
    @NotNull
    public final LiveData<List<AccountSortIndexItem>> f16334b0;

    /* JADX INFO: renamed from: B */
    public static final CharSequence m15162B(AccountSortIndexItem it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getF16605a();
    }

    /* JADX INFO: renamed from: E */
    public static /* synthetic */ void m15163E(AssetTabSortViewModel assetTabSortViewModel, boolean z11, String str, String str2, int i11, Object obj) throws JSONException {
        if ((i11 & 4) != 0) {
            str2 = "";
        }
        assetTabSortViewModel.m15174D(z11, str, str2);
    }

    /* JADX INFO: renamed from: G */
    public static /* synthetic */ void m15164G(AssetTabSortViewModel assetTabSortViewModel, String str, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = true;
        }
        assetTabSortViewModel.m15175F(str, z11);
    }

    /* JADX INFO: renamed from: A */
    public final void m15172A() {
        List<AccountSortIndexItem> value = this.f16333a0.getValue();
        if (value == null) {
            return;
        }
        this.f16333a0.setValue(AssetTabSortHelper.f19161a.m20076s(value));
        AssetsLog assetsLog = AssetsLog.Common;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("排序后的账户排序: ");
        List<AccountSortIndexItem> value2 = this.f16333a0.getValue();
        sb2.append(value2 != null ? CollectionsKt.joinToString$default(value2, ",", null, null, 0, null, new Function1() { // from class: com.kubi.assets.d0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AssetTabSortViewModel.m15162B((AccountSortIndexItem) obj);
            }
        }, 30, null) : null);
        assetsLog.m15236i(sb2.toString());
    }

    /* JADX INFO: renamed from: C */
    public final void m15173C(List<String> list) {
        Object next;
        ArrayList arrayList = new ArrayList();
        List<AccountSortIndexItem> value = this.f16333a0.getValue();
        if (value == null) {
            return;
        }
        for (String str : list) {
            Iterator<T> it = value.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!Intrinsics.areEqual(((AccountSortIndexItem) next).getF16605a(), str));
            AccountSortIndexItem accountSortIndexItem = (AccountSortIndexItem) next;
            if (accountSortIndexItem != null) {
                arrayList.add(accountSortIndexItem);
            }
        }
        for (AccountSortIndexItem accountSortIndexItem2 : value) {
            if (!list.contains(accountSortIndexItem2.getF16605a())) {
                arrayList.add(accountSortIndexItem2);
            }
        }
        this.f16333a0.setValue(arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0043  */
    /* JADX INFO: renamed from: D */
    public final void m15174D(boolean z11, String str, String str2) throws JSONException {
        String str3;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("is_success", z11);
        jSONObject.put("fail_reason", str2);
        int iHashCode = str.hashCode();
        if (iHashCode != -2032180703) {
            if (iHashCode != -2028086330) {
                if (iHashCode == -1737473857 && str.equals("VALUE_DESC")) {
                    str3 = "valueDescending";
                } else {
                    str3 = "";
                }
            } else if (str.equals("MANUAL")) {
                str3 = TypedValues.Custom.NAME;
            } else {
                str3 = "";
            }
        } else if (str.equals("DEFAULT")) {
            str3 = Profile.DEFAULT_PROFILE_NAME;
        } else {
            str3 = "";
        }
        jSONObject.put("category", str3);
        C43852m.m96605q("AssetsAccountSort_Result", jSONObject);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0062  */
    /* JADX INFO: renamed from: F */
    public final void m15175F(@NotNull String sortType, boolean z11) {
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(sortType, "sortType");
        AssetsLog assetsLog = AssetsLog.Common;
        assetsLog.m15236i("updateSortType: " + sortType);
        this.f16331Y.setValue(sortType);
        C46392a.m102333p(C42153h.f93593a.m92517g(), sortType);
        List<String> listM20066i = AssetTabSortHelper.f19161a.m20066i();
        int iHashCode = sortType.hashCode();
        if (iHashCode != -2032180703) {
            if (iHashCode != -2028086330) {
                if (iHashCode == -1737473857 && sortType.equals("VALUE_DESC")) {
                    m15172A();
                }
            } else if (sortType.equals("MANUAL")) {
                m15173C(listM20066i);
            }
        } else if (sortType.equals("DEFAULT")) {
            m15173C(listM20066i);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("保存账户排序顺序: ");
        List<AccountSortIndexItem> value = this.f16333a0.getValue();
        if (value != null) {
            arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(value, 10));
            Iterator<T> it = value.iterator();
            while (it.hasNext()) {
                arrayList.add(((AccountSortIndexItem) it.next()).getF16605a());
            }
        } else {
            arrayList = null;
        }
        sb2.append(arrayList);
        assetsLog.m15236i(sb2.toString());
        if (z11) {
            C41696j.m91104d(ViewModelKt.getViewModelScope(this), C41782z0.m91392b(), null, new AssetTabSortViewModel$updateSortType$2(this, sortType, null), 2, null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0074 A[Catch: all -> 0x0083, TryCatch #0 {all -> 0x0083, blocks: (B:23:0x006c, B:25:0x0074, B:29:0x00b3, B:28:0x0086), top: B:39:0x006c }] */
    /* JADX WARN: Code duplicated, block: B:28:0x0086 A[Catch: all -> 0x0083, TryCatch #0 {all -> 0x0083, blocks: (B:23:0x006c, B:25:0x0074, B:29:0x00b3, B:28:0x0086), top: B:39:0x006c }] */
    /* JADX WARN: Code duplicated, block: B:36:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Instruction removed from duplicated block: B:28:0x0086, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:36:0x00ce, please report this as an issue */
    /* JADX INFO: renamed from: H */
    public final Object m15176H(String str, List<String> list, Continuation<? super Unit> continuation) throws JSONException {
        AssetTabSortViewModel$uploadSortConfig$1 assetTabSortViewModel$uploadSortConfig$1;
        String str2;
        Throwable th2;
        AssetTabSortViewModel assetTabSortViewModel;
        Object objM103844constructorimpl;
        Throwable thM103847exceptionOrNullimpl;
        BaseEntity baseEntity;
        if (continuation instanceof AssetTabSortViewModel$uploadSortConfig$1) {
            assetTabSortViewModel$uploadSortConfig$1 = (AssetTabSortViewModel$uploadSortConfig$1) continuation;
            int i11 = assetTabSortViewModel$uploadSortConfig$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                assetTabSortViewModel$uploadSortConfig$1.label = i11 - Integer.MIN_VALUE;
            } else {
                assetTabSortViewModel$uploadSortConfig$1 = new AssetTabSortViewModel$uploadSortConfig$1(this, continuation);
            }
        } else {
            assetTabSortViewModel$uploadSortConfig$1 = new AssetTabSortViewModel$uploadSortConfig$1(this, continuation);
        }
        Object objM17105U = assetTabSortViewModel$uploadSortConfig$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = assetTabSortViewModel$uploadSortConfig$1.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM17105U);
            try {
                Result.Companion companion = Result.INSTANCE;
                AssetV2Api assetV2ApiM15178x = m15178x();
                SaveAccountOrderConfigBody saveAccountOrderConfigBody = new SaveAccountOrderConfigBody(str, list);
                assetTabSortViewModel$uploadSortConfig$1.L$0 = str;
                assetTabSortViewModel$uploadSortConfig$1.L$1 = SpillingKt.nullOutSpilledVariable(list);
                assetTabSortViewModel$uploadSortConfig$1.L$2 = this;
                assetTabSortViewModel$uploadSortConfig$1.I$0 = 0;
                assetTabSortViewModel$uploadSortConfig$1.label = 1;
                objM17105U = assetV2ApiM15178x.m17105U(saveAccountOrderConfigBody, assetTabSortViewModel$uploadSortConfig$1);
                if (objM17105U == coroutine_suspended) {
                    return coroutine_suspended;
                }
                assetTabSortViewModel = this;
                str2 = str;
                baseEntity = (BaseEntity) objM17105U;
                if (baseEntity.getSuccess()) {
                    AssetsLog.Common.m15236i("上传自定义顺序成功");
                    m15163E(assetTabSortViewModel, true, str2, null, 4, null);
                } else {
                    AssetsLog.Common.m15234e("上传自定义顺序失败: " + baseEntity.getMsg());
                    String msg = baseEntity.getMsg();
                    Intrinsics.checkNotNullExpressionValue(msg, "getMsg(...)");
                    assetTabSortViewModel.m15174D(true, str2, msg);
                    ToastCompat.m66441G(baseEntity.getMsg(), new Object[0]);
                }
                objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
            } catch (Throwable th3) {
                str2 = str;
                th2 = th3;
                Result.Companion companion2 = Result.INSTANCE;
                objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
                thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
                if (thM103847exceptionOrNullimpl != null) {
                    AssetsLog.Common.m15234e("上传自定义顺序失败: " + thM103847exceptionOrNullimpl.getMessage());
                    m15174D(true, str2, C27041f.m66668h(thM103847exceptionOrNullimpl.getMessage()));
                }
                return Unit.INSTANCE;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AssetTabSortViewModel assetTabSortViewModel2 = (AssetTabSortViewModel) assetTabSortViewModel$uploadSortConfig$1.L$2;
            String str3 = (String) assetTabSortViewModel$uploadSortConfig$1.L$0;
            try {
                ResultKt.throwOnFailure(objM17105U);
                assetTabSortViewModel = assetTabSortViewModel2;
                str2 = str3;
                try {
                    baseEntity = (BaseEntity) objM17105U;
                    if (baseEntity.getSuccess()) {
                        AssetsLog.Common.m15236i("上传自定义顺序成功");
                        m15163E(assetTabSortViewModel, true, str2, null, 4, null);
                    } else {
                        AssetsLog.Common.m15234e("上传自定义顺序失败: " + baseEntity.getMsg());
                        String msg2 = baseEntity.getMsg();
                        Intrinsics.checkNotNullExpressionValue(msg2, "getMsg(...)");
                        assetTabSortViewModel.m15174D(true, str2, msg2);
                        ToastCompat.m66441G(baseEntity.getMsg(), new Object[0]);
                    }
                    objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
                } catch (Throwable th4) {
                    th2 = th4;
                    Result.Companion companion3 = Result.INSTANCE;
                    objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
                }
            } catch (Throwable th5) {
                th2 = th5;
                str2 = str3;
                Result.Companion companion4 = Result.INSTANCE;
                objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
                thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
                if (thM103847exceptionOrNullimpl != null) {
                    AssetsLog.Common.m15234e("上传自定义顺序失败: " + thM103847exceptionOrNullimpl.getMessage());
                    m15174D(true, str2, C27041f.m66668h(thM103847exceptionOrNullimpl.getMessage()));
                }
                return Unit.INSTANCE;
            }
        }
        thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            AssetsLog.Common.m15234e("上传自定义顺序失败: " + thM103847exceptionOrNullimpl.getMessage());
            m15174D(true, str2, C27041f.m66668h(thM103847exceptionOrNullimpl.getMessage()));
        }
        return Unit.INSTANCE;
    }

    @NotNull
    /* JADX INFO: renamed from: w */
    public final LiveData<List<AccountSortIndexItem>> m15177w() {
        return this.f16334b0;
    }

    /* JADX INFO: renamed from: x */
    public final AssetV2Api m15178x() {
        return (AssetV2Api) this.f16330X.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: y */
    public final LiveData<String> m15179y() {
        return this.f16332Z;
    }

    /* JADX INFO: renamed from: z */
    public final void m15180z(@NotNull Function3<? super Boolean, ? super String, ? super List<AccountSortIndexItem>, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), C41782z0.m91392b(), null, new AssetTabSortViewModel$loadAccountOrders$1(callback, this, null), 2, null);
    }

    public AssetTabSortViewModel() {
        MutableLiveData<String> mutableLiveData = new MutableLiveData<>();
        this.f16331Y = mutableLiveData;
        this.f16332Z = mutableLiveData;
        MutableLiveData<List<AccountSortIndexItem>> mutableLiveData2 = new MutableLiveData<>(CollectionsKt.emptyList());
        this.f16333a0 = mutableLiveData2;
        this.f16334b0 = mutableLiveData2;
    }

    /* JADX INFO: renamed from: v */
    public static final AssetV2Api m15171v() {
        return (AssetV2Api) C42597a.m93386b().create(AssetV2Api.class);
    }
}
