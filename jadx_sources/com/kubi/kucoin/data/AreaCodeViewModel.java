package com.kubi.kucoin.data;

import androidx.annotation.WorkerThread;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.app.country.R$string;
import com.kubi.kucoin.SceneCode;
import com.kubi.kucoin.data.platform.IPlatformService;
import com.kubi.kucoin.data.platform.model.CountryEntity;
import com.kubi.utils.C27017c;
import com.kubi.utils.extensions.C27041f;
import com.tencent.bugly.proguard.C33820nf;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlinx.coroutines.C41696j;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p694vk.C45583m0;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: AreaCodeViewModel.kt */
/* JADX INFO: loaded from: classes18.dex */
@Metadata(m90083d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010!\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001cJ(\u0010\u000f\u001a\u00020\u001e2\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00070 H\u0002J\u000e\u0010!\u001a\u00020\u001a2\u0006\u0010\"\u001a\u00020\u001cJ(\u0010#\u001a\b\u0012\u0004\u0012\u00020\t0\u00062\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00072\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00070 H\u0003J\u0010\u0010&\u001a\u00020\u001e2\u0006\u0010\u001b\u001a\u00020\u001cH\u0002R\u001a\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001d\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0013\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016¨\u0006'"}, m90084d2 = {"Lcom/kubi/kucoin/data/AreaCodeViewModel;", "Landroidx/lifecycle/ViewModel;", "<init>", "()V", "listCountryLiveData", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/kubi/kucoin/data/platform/model/CountryEntity;", "listAllLiveData", "Lcom/kubi/kucoin/data/AreaCodeModel;", "getListAllLiveData", "()Landroidx/lifecycle/MutableLiveData;", "listSearchLiveData", "getListSearchLiveData", "ipCountryEntity", "getIpCountryEntity", "()Lcom/kubi/kucoin/data/platform/model/CountryEntity;", "setIpCountryEntity", "(Lcom/kubi/kucoin/data/platform/model/CountryEntity;)V", "iPlatformService", "Lcom/kubi/kucoin/data/platform/IPlatformService;", "getIPlatformService", "()Lcom/kubi/kucoin/data/platform/IPlatformService;", "iPlatformService$delegate", "Lkotlin/Lazy;", "fetchCountryList", "", "fromWhereType", "", "codeAndMobileCodeStr", "", "countryList", "", FirebaseAnalytics.Event.SEARCH, "keyword", "handleListInThread", "locationCountry", "list", "canAddHeadIpCountryEntity", "LAppCountry_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAreaCodeViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AreaCodeViewModel.kt\ncom/kubi/kucoin/data/AreaCodeViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,152:1\n774#2:153\n865#2,2:154\n1563#2:156\n1634#2,3:157\n1869#2,2:160\n*S KotlinDebug\n*F\n+ 1 AreaCodeViewModel.kt\ncom/kubi/kucoin/data/AreaCodeViewModel\n*L\n108#1:153\n108#1:154,2\n112#1:156\n112#1:157,3\n127#1:160,2\n*E\n"})
public final class AreaCodeViewModel extends ViewModel {

    /* JADX INFO: renamed from: Y */
    @Nullable
    public CountryEntity f27719Y;

    /* JADX INFO: renamed from: V */
    @NotNull
    public final MutableLiveData<List<CountryEntity>> f27716V = new MutableLiveData<>(CollectionsKt.emptyList());

    /* JADX INFO: renamed from: W */
    @NotNull
    public final MutableLiveData<List<AreaCodeModel>> f27717W = new MutableLiveData<>(CollectionsKt.emptyList());

    /* JADX INFO: renamed from: X */
    @NotNull
    public final MutableLiveData<List<AreaCodeModel>> f27718X = new MutableLiveData<>(CollectionsKt.emptyList());

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final Lazy f27720Z = LazyKt.lazy(new Function0() { // from class: com.kubi.kucoin.data.a
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AreaCodeViewModel.m31931E();
        }
    });

    /* JADX INFO: renamed from: A */
    public final boolean m31942A(String str, String str2, List<CountryEntity> list) {
        Object next;
        CountryEntity countryEntity = null;
        this.f27719Y = null;
        if (m31947t(str) && str2 != null && str2.length() != 0) {
            List listSplit$default = StringsKt.split$default((CharSequence) str2, new String[]{C33820nf.f71144W}, false, 0, 6, (Object) null);
            if (listSplit$default.size() < 2) {
                return false;
            }
            String str3 = (String) listSplit$default.get(0);
            String str4 = (String) listSplit$default.get(1);
            if (str3 != null && str3.length() != 0 && str4 != null && str4.length() != 0) {
                Iterator<T> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    CountryEntity countryEntity2 = (CountryEntity) next;
                    if (countryEntity2.getCode().length() > 0 && countryEntity2.getMobileCode().length() > 0 && Intrinsics.areEqual(countryEntity2.getCode(), str3) && Intrinsics.areEqual(countryEntity2.getMobileCode(), str4)) {
                        break;
                    }
                }
                CountryEntity countryEntity3 = (CountryEntity) next;
                if (countryEntity3 == null) {
                    return true;
                }
                if (!countryEntity3.isDismissed() && !countryEntity3.isOther()) {
                    countryEntity = countryEntity3;
                }
                this.f27719Y = countryEntity;
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: E */
    public static final IPlatformService m31931E() {
        return (IPlatformService) BUserCenterKit.f27728a.m31968c(IPlatformService.class);
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ void m31939v(AreaCodeViewModel areaCodeViewModel, String str, String str2, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str2 = "";
        }
        areaCodeViewModel.m31948u(str, str2);
    }

    /* JADX INFO: renamed from: w */
    public static final Unit m31940w(final AreaCodeViewModel areaCodeViewModel, String str, String str2, List countryList) {
        Intrinsics.checkNotNullParameter(countryList, "countryList");
        C41696j.m91104d(ViewModelKt.getViewModelScope(areaCodeViewModel), C42911a.m94120b().plus(C45583m0.m100618a(new Function0() { // from class: com.kubi.kucoin.data.c
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AreaCodeViewModel.m31941x(this.f27726b);
            }
        })), null, new AreaCodeViewModel$fetchCountryList$1$2(countryList, areaCodeViewModel, str, str2, null), 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: x */
    public static final Unit m31941x(AreaCodeViewModel areaCodeViewModel) {
        areaCodeViewModel.f27717W.postValue(CollectionsKt.emptyList());
        return Unit.INSTANCE;
    }

    @NotNull
    /* JADX INFO: renamed from: B */
    public final MutableLiveData<List<AreaCodeModel>> m31943B() {
        return this.f27717W;
    }

    @NotNull
    /* JADX INFO: renamed from: C */
    public final MutableLiveData<List<AreaCodeModel>> m31944C() {
        return this.f27718X;
    }

    @WorkerThread
    /* JADX INFO: renamed from: D */
    public final List<AreaCodeModel> m31945D(CountryEntity countryEntity, List<CountryEntity> list) {
        ArrayList arrayList = new ArrayList();
        if (countryEntity != null) {
            arrayList.add(new AreaCodeModel(true, C27017c.f54310a.m66516f(R$string.signup_country_title_location, new Object[0])));
            arrayList.add(new AreaCodeModel(countryEntity));
        }
        String str = "";
        for (CountryEntity countryEntity2 : list) {
            Character chFirstOrNull = StringsKt.firstOrNull(countryEntity2.getEn());
            String strM66668h = C27041f.m66668h(chFirstOrNull != null ? chFirstOrNull.toString() : null);
            if (!Intrinsics.areEqual(strM66668h, str)) {
                arrayList.add(new AreaCodeModel(true, strM66668h));
                str = strM66668h;
            }
            arrayList.add(new AreaCodeModel(countryEntity2));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: F */
    public final void m31946F(@NotNull String keyword) {
        List<AreaCodeModel> listEmptyList;
        Intrinsics.checkNotNullParameter(keyword, "keyword");
        if (keyword.length() == 0) {
            MutableLiveData<List<AreaCodeModel>> mutableLiveData = this.f27717W;
            mutableLiveData.setValue(mutableLiveData.getValue());
            return;
        }
        MutableLiveData<List<AreaCodeModel>> mutableLiveData2 = this.f27718X;
        List<CountryEntity> value = this.f27716V.getValue();
        if (value != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : value) {
                CountryEntity countryEntity = (CountryEntity) obj;
                String en2 = countryEntity.getEn();
                Locale ENGLISH = Locale.ENGLISH;
                Intrinsics.checkNotNullExpressionValue(ENGLISH, "ENGLISH");
                String lowerCase = en2.toLowerCase(ENGLISH);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                Intrinsics.checkNotNullExpressionValue(ENGLISH, "ENGLISH");
                String lowerCase2 = keyword.toLowerCase(ENGLISH);
                Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
                if (StringsKt.contains$default((CharSequence) lowerCase, (CharSequence) lowerCase2, false, 2, (Object) null) || StringsKt.contains$default((CharSequence) countryEntity.getMobileCode(), (CharSequence) keyword, false, 2, (Object) null)) {
                    arrayList.add(obj);
                }
            }
            listEmptyList = new ArrayList<>(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                listEmptyList.add(new AreaCodeModel((CountryEntity) it.next()));
            }
        } else {
            listEmptyList = CollectionsKt.emptyList();
        }
        mutableLiveData2.setValue(listEmptyList);
    }

    /* JADX INFO: renamed from: t */
    public final boolean m31947t(String str) {
        return Intrinsics.areEqual(str, SceneCode.PHONE_REGISTER_COUNTRY_CODE.toString()) || Intrinsics.areEqual(str, SceneCode.PHONE_LOGIN_COUNTRY_CODE.toString()) || Intrinsics.areEqual(str, SceneCode.BIND_PHONE_COUNTRY_CODE.toString()) || Intrinsics.areEqual(str, SceneCode.CHANGE_BIND_PHONE_COUNTRY_CODE.toString());
    }

    /* JADX INFO: renamed from: u */
    public final void m31948u(@NotNull final String fromWhereType, @Nullable final String str) {
        Intrinsics.checkNotNullParameter(fromWhereType, "fromWhereType");
        m31949y().mo32037j(fromWhereType, new Function1() { // from class: com.kubi.kucoin.data.b
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AreaCodeViewModel.m31940w(this.f27723b, fromWhereType, str, (List) obj);
            }
        });
    }

    /* JADX INFO: renamed from: y */
    public final IPlatformService m31949y() {
        return (IPlatformService) this.f27720Z.getValue();
    }

    @Nullable
    /* JADX INFO: renamed from: z, reason: from getter */
    public final CountryEntity getF27719Y() {
        return this.f27719Y;
    }
}
