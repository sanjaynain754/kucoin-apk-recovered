package com.kubi.core.biz.notice;

import com.kubi.core.spot.entity.SpotBannerItemEntity;
import java.util.List;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: ImportNoticeVM.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.core.biz.notice.ImportNoticeVM$getRiskWarning$2", m90122f = "ImportNoticeVM.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class ImportNoticeVM$getRiskWarning$2 extends SuspendLambda implements Function2<String, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $symbol;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ImportNoticeVM this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImportNoticeVM$getRiskWarning$2(ImportNoticeVM importNoticeVM, String str, Continuation<? super ImportNoticeVM$getRiskWarning$2> continuation) {
        super(2, continuation);
        this.this$0 = importNoticeVM;
        this.$symbol = str;
    }

    /* JADX INFO: renamed from: f */
    public static final UiState m22051f(String str, String str2, UiState uiState) {
        List<SpotBannerItemEntity> importantNoticeList;
        return UiState.copy$default(uiState, null, null, str, false, SymbolRiskStore.f20559a.m22055a(str2) && ((importantNoticeList = uiState.getImportantNoticeList()) == null || importantNoticeList.isEmpty()), false, 43, null);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ImportNoticeVM$getRiskWarning$2 importNoticeVM$getRiskWarning$2 = new ImportNoticeVM$getRiskWarning$2(this.this$0, this.$symbol, continuation);
        importNoticeVM$getRiskWarning$2.L$0 = obj;
        return importNoticeVM$getRiskWarning$2;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(String str, Continuation<? super Unit> continuation) {
        return ((ImportNoticeVM$getRiskWarning$2) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        final String str = (String) this.L$0;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        ImportNoticeVM importNoticeVM = this.this$0;
        final String str2 = this.$symbol;
        importNoticeVM.updateState(new Function1() { // from class: com.kubi.core.biz.notice.n
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return ImportNoticeVM$getRiskWarning$2.m22051f(str, str2, (UiState) obj2);
            }
        });
        return Unit.INSTANCE;
    }
}
