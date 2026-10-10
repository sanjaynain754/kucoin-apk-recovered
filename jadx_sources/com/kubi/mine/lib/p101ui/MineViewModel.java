package com.kubi.mine.lib.p101ui;

import android.annotation.SuppressLint;
import android.app.Application;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import androidx.media3.common.MimeTypes;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.advert.api.entity.PromotionConfig;
import com.kubi.clean.api.entity.IPLimitConfig;
import com.kubi.mine.api.entity.KycStatusEntity;
import com.kubi.mine.lib.entity.NPSQuestionEntity;
import com.kubi.mine.lib.entity.NewcomerConfigEntity;
import com.kubi.mine.lib.service.MineDepend;
import com.kubi.mine.lib.util.MineStorageIds;
import com.kubi.p110rn.modules.BridgeParamKeyKt;
import com.kubi.router.core.Router;
import com.kubi.sdk.site.info.SiteInfoManager;
import com.kubi.sdk.util.C24217a1;
import com.kubi.user.model.LoginUserEntity;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.core.C27029c;
import com.kubi.welfare.api.entity.InvitationEntity;
import com.kubi.welfare.api.entity.RemainAwardNumEntity;
import io.reactivex.Observable;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.subjects.PublishSubject;
import iq.InterfaceC40161c;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.InterfaceC41775x1;
import l80.InterfaceC42137a;
import mr.C42597a;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p319hq.InterfaceC38285b;
import p402kf.C41016c;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;
import y70.C46392a;
import y70.StorageId;

/* JADX INFO: compiled from: MineViewModel.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020$0#J\f\u0010%\u001a\b\u0012\u0004\u0012\u00020&0#J\f\u0010'\u001a\b\u0012\u0004\u0012\u00020$0(J\u0010\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010,J\u001a\u0010-\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010,2\u0006\u0010.\u001a\u00020,H\u0007J\u0014\u0010/\u001a\b\u0012\u0004\u0012\u0002000#2\u0006\u00101\u001a\u00020$J\u0006\u00102\u001a\u00020*J\u0006\u00103\u001a\u00020*J\u0006\u00104\u001a\u000205J\u0006\u00106\u001a\u000205J\b\u00107\u001a\u00020*H\u0014R\u0016\u0010\u0006\u001a\n \b*\u0004\u0018\u00010\u00070\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n \b*\u0004\u0018\u00010\n0\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n \b*\u0004\u0018\u00010\u00070\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0019\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u0019\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0012R\u0019\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0012R\u0019\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u000f¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0012¨\u00068"}, m90084d2 = {"Lcom/kubi/mine/lib/ui/MineViewModel;", "Landroidx/lifecycle/AndroidViewModel;", MimeTypes.BASE_TYPE_APPLICATION, "Landroid/app/Application;", "<init>", "(Landroid/app/Application;)V", "mCommonApi", "Lcom/kubi/mine/lib/api/MineApi;", "kotlin.jvm.PlatformType", "mWelfareApi", "Lcom/kubi/welfare/api/remote/WelfareApi;", "mSafeApi", "disposable", "Lio/reactivex/disposables/CompositeDisposable;", "inviteState", "Landroidx/lifecycle/MutableLiveData;", "Lcom/kubi/welfare/api/entity/InvitationEntity;", "getInviteState", "()Landroidx/lifecycle/MutableLiveData;", "noviceStateLiveData", "Lcom/kubi/mine/lib/entity/NewcomerConfigEntity;", "getNoviceStateLiveData", "referralConfigLiveData", "Lcom/kubi/advert/api/entity/PromotionConfig;", "getReferralConfigLiveData", "kycStateLiveData", "Lcom/kubi/mine/api/entity/KycStatusEntity;", "getKycStateLiveData", "kycGuideLiveData", "Lcom/kubi/clean/api/entity/IPLimitConfig;", "getKycGuideLiveData", "npsSwitchLiveData", "Lcom/kubi/mine/lib/entity/NPSQuestionEntity;", "getNpsSwitchLiveData", "getAwardNum", "Lio/reactivex/Observable;", "", "getUserInfoObs", "Lcom/kubi/user/model/LoginUserEntity;", "getCurrencyChangedObs", "Lio/reactivex/subjects/PublishSubject;", "setUserCurrency", "", FirebaseAnalytics.Param.CURRENCY, "", "setUserConfig", "language", "setDeduction", "", BridgeParamKeyKt.RN_CONTAINER_UI_ENABLE, "fetchInviteData", "fetchNewcomerAndKycGuide", "fetchInferralConfig", "Lkotlinx/coroutines/Job;", "fetchNPSLiteEntranceState", "onCleared", "MineLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nMineViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MineViewModel.kt\ncom/kubi/mine/lib/ui/MineViewModel\n+ 2 FlavorEx.kt\ncom/kubi/kucoin/helper/FlavorExKt\n+ 3 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n*L\n1#1,205:1\n25#2,3:206\n23#3,2:209\n*S KotlinDebug\n*F\n+ 1 MineViewModel.kt\ncom/kubi/mine/lib/ui/MineViewModel\n*L\n115#1:206,3\n106#1:209,2\n*E\n"})
public final class MineViewModel extends AndroidViewModel {

    /* JADX INFO: renamed from: V */
    public InterfaceC38285b f35215V;

    /* JADX INFO: renamed from: W */
    public InterfaceC42137a f35216W;

    /* JADX INFO: renamed from: X */
    public InterfaceC38285b f35217X;

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final CompositeDisposable f35218Y;

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final MutableLiveData<InvitationEntity> f35219Z;

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public final MutableLiveData<NewcomerConfigEntity> f35220a0;

    /* JADX INFO: renamed from: b0 */
    @NotNull
    public final MutableLiveData<PromotionConfig> f35221b0;

    /* JADX INFO: renamed from: c0 */
    @NotNull
    public final MutableLiveData<KycStatusEntity> f35222c0;

    /* JADX INFO: renamed from: d0 */
    @NotNull
    public final MutableLiveData<IPLimitConfig> f35223d0;

    /* JADX INFO: renamed from: e0 */
    @NotNull
    public final MutableLiveData<NPSQuestionEntity> f35224e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MineViewModel(@NotNull Application application) {
        super(application);
        Intrinsics.checkNotNullParameter(application, "application");
        this.f35215V = (InterfaceC38285b) C42597a.m93386b().create(InterfaceC38285b.class);
        this.f35216W = (InterfaceC42137a) C42597a.m93386b().create(InterfaceC42137a.class);
        this.f35217X = (InterfaceC38285b) C42597a.m93386b().create(InterfaceC38285b.class);
        this.f35218Y = new CompositeDisposable();
        this.f35219Z = new MutableLiveData<>();
        this.f35220a0 = new MutableLiveData<>();
        this.f35221b0 = new MutableLiveData<>();
        this.f35222c0 = new MutableLiveData<>();
        this.f35223d0 = new MutableLiveData<>();
        this.f35224e0 = new MutableLiveData<>();
    }

    /* JADX INFO: renamed from: I */
    public static final void m42126I(Object obj) {
        MineDepend.f35159a.m41832k();
    }

    /* JADX INFO: renamed from: p */
    public static final Unit m42138p(MineViewModel mineViewModel, InvitationEntity invitationEntity) {
        mineViewModel.f35219Z.setValue(invitationEntity);
        StorageId<String> inviteDataSid = MineStorageIds.f35421a.getInviteDataSid();
        Intrinsics.checkNotNull(invitationEntity);
        String strM66606i = C27029c.m66606i(invitationEntity);
        Intrinsics.checkNotNullExpressionValue(strM66606i, "toJson(...)");
        C46392a.m102333p(inviteDataSid, strM66606i);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: r */
    public static final Unit m42140r(Throwable th2) {
        C44128b.m97258b("fetchInviteData:" + th2.getMessage());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: w */
    public static final Boolean m42142w(RemainAwardNumEntity it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Boolean.valueOf(C27039d.m66650j(it.getEncouragementCount()) > 0 || C27039d.m66650j(it.getInvitationAwardCount()) > 0);
    }

    /* JADX INFO: renamed from: x */
    public static final Boolean m42143x(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return (Boolean) function1.invoke(p11);
    }

    @NotNull
    /* JADX INFO: renamed from: A */
    public final MutableLiveData<IPLimitConfig> m42144A() {
        return this.f35223d0;
    }

    @NotNull
    /* JADX INFO: renamed from: B */
    public final MutableLiveData<KycStatusEntity> m42145B() {
        return this.f35222c0;
    }

    @NotNull
    /* JADX INFO: renamed from: C */
    public final MutableLiveData<NewcomerConfigEntity> m42146C() {
        return this.f35220a0;
    }

    @NotNull
    /* JADX INFO: renamed from: D */
    public final MutableLiveData<NPSQuestionEntity> m42147D() {
        return this.f35224e0;
    }

    @NotNull
    /* JADX INFO: renamed from: E */
    public final MutableLiveData<PromotionConfig> m42148E() {
        return this.f35221b0;
    }

    @NotNull
    /* JADX INFO: renamed from: F */
    public final Observable<LoginUserEntity> m42149F() {
        return MineDepend.f35159a.m41828g();
    }

    @NotNull
    /* JADX INFO: renamed from: G */
    public final Observable<Object> m42150G(boolean z11) {
        Observable<R> observableCompose = this.f35217X.m86414h(z11).compose(C24217a1.m58389m());
        Intrinsics.checkNotNullExpressionValue(observableCompose, "compose(...)");
        return observableCompose;
    }

    @SuppressLint({"CheckResult"})
    /* JADX INFO: renamed from: H */
    public final void m42151H(@Nullable String str, @NotNull String language) {
        Intrinsics.checkNotNullParameter(language, "language");
        if (MineDepend.f35159a.m41829h()) {
            Observable observableCompose = InterfaceC38285b.m86406e(this.f35215V, str, language, null, 4, null).compose(C24217a1.m58389m());
            Consumer consumer = new Consumer() { // from class: com.kubi.mine.lib.ui.f3
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    MineViewModel.m42126I(obj);
                }
            };
            final Function1 function1 = new Function1() { // from class: com.kubi.mine.lib.ui.g3
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return MineViewModel.m42127J((Throwable) obj);
                }
            };
            observableCompose.subscribe(consumer, new Consumer() { // from class: com.kubi.mine.lib.ui.h3
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    MineViewModel.m42128K(function1, obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: L */
    public final void m42152L(@Nullable String str) {
        m42151H(str, "");
    }

    /* JADX INFO: renamed from: o */
    public final void m42154o() {
        CompositeDisposable compositeDisposable = this.f35218Y;
        Observable<R> observableCompose = this.f35216W.m92473f().compose(C24217a1.m58389m());
        final Function1 function1 = new Function1() { // from class: com.kubi.mine.lib.ui.z2
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MineViewModel.m42138p(this.f35420b, (InvitationEntity) obj);
            }
        };
        Consumer consumer = new Consumer() { // from class: com.kubi.mine.lib.ui.a3
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                MineViewModel.m42139q(function1, obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: com.kubi.mine.lib.ui.b3
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MineViewModel.m42140r((Throwable) obj);
            }
        };
        compositeDisposable.add(observableCompose.subscribe(consumer, new Consumer() { // from class: com.kubi.mine.lib.ui.c3
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                MineViewModel.m42141s(function2, obj);
            }
        }));
    }

    @Override // androidx.lifecycle.ViewModel
    public void onCleared() {
        this.f35218Y.clear();
        super.onCleared();
    }

    /* JADX INFO: renamed from: u */
    public final void m42156u() {
        Object objM56186h = Router.f46192a.m56186h(InterfaceC40161c.class, SiteInfoManager.f47913a.m58109c());
        if (objM56186h != null) {
            ((InterfaceC40161c) objM56186h).m88518g(ViewModelKt.getViewModelScope(this), this.f35222c0);
        } else {
            C41696j.m91104d(ViewModelKt.getViewModelScope(this), C42911a.m94120b(), null, new MineViewModel$fetchNewcomerAndKycGuide$2$1(this, null), 2, null);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: v */
    public final Observable<Boolean> m42157v() {
        Observable<R> observableCompose = this.f35216W.m92468a().compose(C24217a1.m58389m());
        final Function1 function1 = new Function1() { // from class: com.kubi.mine.lib.ui.d3
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MineViewModel.m42142w((RemainAwardNumEntity) obj);
            }
        };
        Observable<Boolean> map = observableCompose.map(new Function() { // from class: com.kubi.mine.lib.ui.e3
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return MineViewModel.m42143x(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    @NotNull
    /* JADX INFO: renamed from: z */
    public final MutableLiveData<InvitationEntity> m42159z() {
        return this.f35219Z;
    }

    /* JADX INFO: renamed from: J */
    public static final Unit m42127J(Throwable th2) {
        th2.printStackTrace();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: K */
    public static final void m42128K(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: q */
    public static final void m42139q(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: s */
    public static final void m42141s(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    @NotNull
    /* JADX INFO: renamed from: n */
    public final InterfaceC41775x1 m42153n() {
        return C41696j.m91104d(ViewModelKt.getViewModelScope(this), C42911a.m94120b(), null, new MineViewModel$fetchInferralConfig$1(this, null), 2, null);
    }

    @NotNull
    /* JADX INFO: renamed from: t */
    public final InterfaceC41775x1 m42155t() {
        return C41696j.m91104d(ViewModelKt.getViewModelScope(this), C42911a.m94120b(), null, new MineViewModel$fetchNPSLiteEntranceState$1(this, null), 2, null);
    }

    @NotNull
    /* JADX INFO: renamed from: y */
    public final PublishSubject<Boolean> m42158y() {
        PublishSubject<Boolean> publishSubjectM89963a = C41016c.m89963a();
        Intrinsics.checkNotNullExpressionValue(publishSubjectM89963a, "getCurrencyChangedObs(...)");
        return publishSubjectM89963a;
    }
}
