package com.kubi.unify.account;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.kubi.mvi.p102vm.BaseVM;
import com.kubi.unify.UnifyGlobalDataManager;
import com.kubi.unify.api.entity.UnifyAccountType;
import com.kubi.unify.entity.UnifyExam;
import com.kubi.utils.extensions.C27025c;
import com.tencent.qcloud.tuicore.TUIConstants;
import i60.InterfaceC38460c;
import io.reactivex.functions.Action;
import java.util.List;
import kotlinx.coroutines.C41696j;
import mr.C42597a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: UnifyAccountViewModel.kt */
/* JADX INFO: loaded from: classes52.dex */
@Metadata(m90083d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0016J\b\u0010!\u001a\u00020\u001fH\u0002J\u0012\u0010\"\u001a\u00020\u001f2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$R#\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001c\u0010\u000b\u001a\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\r0\r0\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0012\u001a\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\r0\r0\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\r0\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011R\u001a\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a0\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a0\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0011¨\u0006%"}, m90084d2 = {"Lcom/kubi/unify/account/UnifyAccountViewModel;", "Lcom/kubi/mvi/vm/BaseVM;", "<init>", "()V", "api", "Lcom/kubi/unify/api/UnifyApi;", "kotlin.jvm.PlatformType", "getApi", "()Lcom/kubi/unify/api/UnifyApi;", "api$delegate", "Lkotlin/Lazy;", "_loadingFlag", "Landroidx/lifecycle/MutableLiveData;", "", "loadingFlag", "Landroidx/lifecycle/LiveData;", "getLoadingFlag", "()Landroidx/lifecycle/LiveData;", "_reloadFlag", "reloadFlag", "getReloadFlag", "_positionErrorFlag", "", "positionErrorFlag", "getPositionErrorFlag", "_examList", "", "Lcom/kubi/unify/entity/UnifyExam;", "examList", "getExamList", "requestToggle", "", "accountType", "fetchUnifyExam", "requestAnswer", TUIConstants.TIMPush.NOTIFICATION.ACTION, "Lio/reactivex/functions/Action;", "BUnifyAccountLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class UnifyAccountViewModel extends BaseVM {

    /* JADX INFO: renamed from: V */
    @NotNull
    public final Lazy f53107V = LazyKt.lazy(new Function0() { // from class: com.kubi.unify.account.q
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return UnifyAccountViewModel.m64941u();
        }
    });

    /* JADX INFO: renamed from: W */
    @NotNull
    public final MutableLiveData<Boolean> f53108W;

    /* JADX INFO: renamed from: X */
    @NotNull
    public final LiveData<Boolean> f53109X;

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final MutableLiveData<Boolean> f53110Y;

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final LiveData<Boolean> f53111Z;

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public final MutableLiveData<String> f53112a0;

    /* JADX INFO: renamed from: b0 */
    @NotNull
    public final LiveData<String> f53113b0;

    /* JADX INFO: renamed from: c0 */
    @NotNull
    public final MutableLiveData<List<UnifyExam>> f53114c0;

    /* JADX INFO: renamed from: d0 */
    @NotNull
    public final LiveData<List<UnifyExam>> f53115d0;

    @NotNull
    /* JADX INFO: renamed from: A */
    public final LiveData<Boolean> m64942A() {
        return this.f53111Z;
    }

    /* JADX INFO: renamed from: B */
    public final void m64943B(@Nullable Action action) {
        this.f53108W.setValue(Boolean.TRUE);
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new UnifyAccountViewModel$requestAnswer$1(this, action, null), 3, null);
    }

    /* JADX INFO: renamed from: C */
    public final void m64944C(@NotNull String accountType) {
        Intrinsics.checkNotNullParameter(accountType, "accountType");
        if (Intrinsics.areEqual(accountType, UnifyAccountType.UNIFIED.getValue()) && !C27025c.m66566d(UnifyGlobalDataManager.f53084a.m64881s().getValue().isAnswered())) {
            m64945v();
        } else {
            this.f53108W.setValue(Boolean.TRUE);
            C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new UnifyAccountViewModel$requestToggle$1(accountType, this, null), 3, null);
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m64945v() {
        this.f53108W.setValue(Boolean.TRUE);
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new UnifyAccountViewModel$fetchUnifyExam$1(this, null), 3, null);
    }

    /* JADX INFO: renamed from: w */
    public final InterfaceC38460c m64946w() {
        return (InterfaceC38460c) this.f53107V.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: x */
    public final LiveData<List<UnifyExam>> m64947x() {
        return this.f53115d0;
    }

    @NotNull
    /* JADX INFO: renamed from: y */
    public final LiveData<Boolean> m64948y() {
        return this.f53109X;
    }

    @NotNull
    /* JADX INFO: renamed from: z */
    public final LiveData<String> m64949z() {
        return this.f53113b0;
    }

    public UnifyAccountViewModel() {
        Boolean bool = Boolean.FALSE;
        MutableLiveData<Boolean> mutableLiveData = new MutableLiveData<>(bool);
        this.f53108W = mutableLiveData;
        this.f53109X = mutableLiveData;
        MutableLiveData<Boolean> mutableLiveData2 = new MutableLiveData<>(bool);
        this.f53110Y = mutableLiveData2;
        this.f53111Z = mutableLiveData2;
        MutableLiveData<String> mutableLiveData3 = new MutableLiveData<>();
        this.f53112a0 = mutableLiveData3;
        this.f53113b0 = mutableLiveData3;
        MutableLiveData<List<UnifyExam>> mutableLiveData4 = new MutableLiveData<>();
        this.f53114c0 = mutableLiveData4;
        this.f53115d0 = mutableLiveData4;
    }

    /* JADX INFO: renamed from: u */
    public static final InterfaceC38460c m64941u() {
        return (InterfaceC38460c) C42597a.m93388d().create(InterfaceC38460c.class);
    }
}
