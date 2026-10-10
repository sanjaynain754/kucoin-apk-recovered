package repayment.ext;

import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.InterfaceC41635f;
import kotlinx.coroutines.flow.InterfaceC41678w;
import l60.C42110e;
import p852kotlin.KotlinNothingValueException;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.SourceDebugExtension;
import repayment.C44044f;
import repayment.InterfaceC44005a;
import repayment.UnifiedRepayFragment;
import repayment.UnifyAssetData;

/* JADX INFO: compiled from: RepayFragmentExt.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "repayment.ext.RepayFragmentExtKt$collectSelectedAssetListData$1", m90122f = "RepayFragmentExt.kt", m90123i = {}, m90124l = {77}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class RepayFragmentExtKt$collectSelectedAssetListData$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ UnifiedRepayFragment $this_collectSelectedAssetListData;
    int label;

    /* JADX INFO: renamed from: repayment.ext.RepayFragmentExtKt$collectSelectedAssetListData$1$a */
    /* JADX INFO: compiled from: RepayFragmentExt.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nRepayFragmentExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepayFragmentExt.kt\nrepayment/ext/RepayFragmentExtKt$collectSelectedAssetListData$1$1\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,139:1\n254#2:140\n*S KotlinDebug\n*F\n+ 1 RepayFragmentExt.kt\nrepayment/ext/RepayFragmentExtKt$collectSelectedAssetListData$1$1\n*L\n83#1:140\n*E\n"})
    public static final class C44033a<T> implements InterfaceC41635f {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ UnifiedRepayFragment f97302b;

        public C44033a(UnifiedRepayFragment unifiedRepayFragment) {
            this.f97302b = unifiedRepayFragment;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC41635f
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object emit(List<UnifyAssetData> list, Continuation<? super Unit> continuation) {
            RecyclerView recyclerView;
            RepayFragmentExtKt.m97097j(this.f97302b);
            C44039e.m97107f(this.f97302b, C44044f.m97123a(list), list);
            UnifiedRepayFragment unifiedRepayFragment = this.f97302b;
            C42110e c42110eM97005r3 = unifiedRepayFragment.m97005r3();
            boolean z11 = false;
            if (c42110eM97005r3 != null && (recyclerView = c42110eM97005r3.f93496n) != null && recyclerView.getVisibility() == 0) {
                z11 = true;
            }
            C44039e.m97115n(unifiedRepayFragment, list, z11);
            this.f97302b.m97008u3().m96976D(InterfaceC44005a.a.f97260a);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RepayFragmentExtKt$collectSelectedAssetListData$1(UnifiedRepayFragment unifiedRepayFragment, Continuation<? super RepayFragmentExtKt$collectSelectedAssetListData$1> continuation) {
        super(2, continuation);
        this.$this_collectSelectedAssetListData = unifiedRepayFragment;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RepayFragmentExtKt$collectSelectedAssetListData$1(this.$this_collectSelectedAssetListData, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((RepayFragmentExtKt$collectSelectedAssetListData$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        } else {
            ResultKt.throwOnFailure(obj);
            InterfaceC41678w<List<UnifyAssetData>> interfaceC41678wM96986v = this.$this_collectSelectedAssetListData.m97008u3().m96986v();
            C44033a c44033a = new C44033a(this.$this_collectSelectedAssetListData);
            this.label = 1;
            if (interfaceC41678wM96986v.collect(c44033a, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        throw new KotlinNothingValueException();
    }
}
