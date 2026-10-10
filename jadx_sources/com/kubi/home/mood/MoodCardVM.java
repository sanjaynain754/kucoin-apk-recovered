package com.kubi.home.mood;

import androidx.lifecycle.ViewModelKt;
import com.kubi.home.api.HomeBizApi;
import com.kubi.home.entity.MoodInfoEntity;
import com.kubi.mvi.state.AbstractC19291m;
import com.kubi.mvi.state.InterfaceC19284f;
import com.kubi.network.retrofit.utils.C19334f;
import com.kubi.network.retrofit.utils.RetrofitFlowExKt;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.utils.C27100x0;
import dj.C36719d;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.InterfaceC41775x1;
import kotlinx.coroutines.flow.InterfaceC41634e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.SourceDebugExtension;
import y70.C46392a;

/* JADX INFO: compiled from: MoodCardVM.kt */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016J\b\u0010\u0011\u001a\u00020\u000fH\u0002J\b\u0010\u0012\u001a\u00020\u000fH\u0002J\u000e\u0010\u0013\u001a\u00020\u000fH\u0082@¢\u0006\u0002\u0010\u0014R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00020\u00028TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u0015"}, m90084d2 = {"Lcom/kubi/home/mood/MoodCardVM;", "Lcom/kubi/mvi/state/SingleSimpleStateVM;", "Lcom/kubi/home/mood/MoodCardContract$UIState;", "<init>", "()V", "api", "Lcom/kubi/home/api/HomeBizApi;", "repeatJob", "Lkotlinx/coroutines/Job;", "usedCache", "Ljava/util/concurrent/atomic/AtomicBoolean;", "initState", "getInitState", "()Lcom/kubi/home/mood/MoodCardContract$UIState;", RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, "", RNH5InterActionHelperKt.EVENT_NAME_ON_HIDE, "startLoadData", "resetRepeatJob", "loadData", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nMoodCardVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MoodCardVM.kt\ncom/kubi/home/mood/MoodCardVM\n+ 2 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n+ 3 KVStore.kt\ncom/kubi/utils/storage/KVStore\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,71:1\n153#2,2:72\n144#2,2:76\n178#3:74\n1#4:75\n*S KotlinDebug\n*F\n+ 1 MoodCardVM.kt\ncom/kubi/home/mood/MoodCardVM\n*L\n62#1:72,2\n67#1:76,2\n62#1:74\n*E\n"})
public final class MoodCardVM extends AbstractC19291m<MoodCardContract$UIState> {

    /* JADX INFO: renamed from: Y */
    @Nullable
    public InterfaceC41775x1 f25854Y;

    /* JADX INFO: renamed from: X */
    @NotNull
    public final HomeBizApi f25853X = (HomeBizApi) RetrofitFlowExKt.m42820a(HomeBizApi.class);

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final AtomicBoolean f25855Z = new AtomicBoolean(false);

    /* JADX INFO: renamed from: com.kubi.home.mood.MoodCardVM$onShow$1 */
    /* JADX INFO: compiled from: MoodCardVM.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.home.mood.MoodCardVM$onShow$1", m90122f = "MoodCardVM.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C146761 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        int label;

        public C146761(Continuation<? super C146761> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return MoodCardVM.this.new C146761(continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C146761) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                MoodCardVM.this.m29605r();
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: p */
    private final void m29600p() {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.home.mood.o
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MoodCardVM.m29601q(this.f25875b);
            }
        });
    }

    /* JADX INFO: renamed from: q */
    public static final Unit m29601q(MoodCardVM moodCardVM) {
        InterfaceC41775x1 interfaceC41775x1 = moodCardVM.f25854Y;
        if (interfaceC41775x1 != null) {
            InterfaceC41775x1.a.m91377a(interfaceC41775x1, null, 1, null);
        }
        moodCardVM.f25854Y = null;
        return Unit.INSTANCE;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.kubi.home.mood.MoodCardContract$UIState] */
    @Override // com.kubi.mvi.state.BaseStateVM
    @NotNull
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public MoodCardContract$UIState getInitState() {
        return new InterfaceC19284f() { // from class: com.kubi.home.mood.MoodCardContract$UIState
        };
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: o */
    public final Object m29604o(Continuation<? super Unit> continuation) {
        MoodCardVM$loadData$1 moodCardVM$loadData$1;
        if (continuation instanceof MoodCardVM$loadData$1) {
            moodCardVM$loadData$1 = (MoodCardVM$loadData$1) continuation;
            int i11 = moodCardVM$loadData$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                moodCardVM$loadData$1.label = i11 - Integer.MIN_VALUE;
            } else {
                moodCardVM$loadData$1 = new MoodCardVM$loadData$1(this, continuation);
            }
        } else {
            moodCardVM$loadData$1 = new MoodCardVM$loadData$1(this, continuation);
        }
        MoodCardVM$loadData$1 moodCardVM$loadData$2 = moodCardVM$loadData$1;
        Object objM42826g = moodCardVM$loadData$2.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = moodCardVM$loadData$2.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM42826g);
            if (!this.f25855Z.getAndSet(true)) {
                send(new C14690m((MoodInfoEntity) C46392a.f104043a.m102336j(C36719d.f79632a.m82269n(), MoodInfoEntity.class, null)));
            }
            InterfaceC41634e<MoodInfoEntity> interfaceC41634eM28959d = this.f25853X.m28959d();
            moodCardVM$loadData$2.label = 1;
            objM42826g = RetrofitFlowExKt.m42826g(interfaceC41634eM28959d, false, null, moodCardVM$loadData$2, 2, null);
            if (objM42826g == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM42826g);
        }
        MoodInfoEntity moodInfoEntity = (MoodInfoEntity) ((C19334f) objM42826g).m42846a();
        if (moodInfoEntity != null) {
            C46392a.m102331n(C36719d.f79632a.m82269n(), moodInfoEntity);
        }
        send(new C14690m(moodInfoEntity));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: r */
    public final void m29605r() {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.home.mood.n
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MoodCardVM.m29602s(this.f25874b);
            }
        });
    }

    /* JADX INFO: renamed from: s */
    public static final Unit m29602s(MoodCardVM moodCardVM) {
        moodCardVM.m29600p();
        C41696j.m91104d(ViewModelKt.getViewModelScope(moodCardVM), null, null, new MoodCardVM$startLoadData$1$1(moodCardVM, null), 3, null);
        return Unit.INSTANCE;
    }

    @Override // com.kubi.mvi.p102vm.BaseVM
    public void onHide() {
        super.onHide();
        m29600p();
    }

    @Override // com.kubi.mvi.p102vm.BaseVM
    public void onShow() throws Throwable {
        super.onShow();
        launchOnIO(new C146761(null));
    }
}
