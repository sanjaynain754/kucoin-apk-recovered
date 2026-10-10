package com.kubi.home.navigation;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.kubi.wallet.api.IWalletService;
import fj.C37527k;
import kotlinx.coroutines.AbstractC41697j0;
import kotlinx.coroutines.C41686h;
import kotlinx.coroutines.InterfaceC41709m0;
import o00.C42911a;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: Web3TabView.kt */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.home.navigation.Web3TabView$adjustTabWidth$1$2", m90122f = "Web3TabView.kt", m90123i = {0}, m90124l = {61}, m90125m = "invokeSuspend", m90126n = {"tabWidth"}, m90127s = {"I$0"})
public final class Web3TabView$adjustTabWidth$1$2 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ C37527k $binding;
    int I$0;
    int label;

    /* JADX INFO: renamed from: com.kubi.home.navigation.Web3TabView$adjustTabWidth$1$2$1 */
    /* JADX INFO: compiled from: Web3TabView.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.home.navigation.Web3TabView$adjustTabWidth$1$2$1", m90122f = "Web3TabView.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C146971 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        final /* synthetic */ C37527k $binding;
        final /* synthetic */ int $tabWidth;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C146971(C37527k c37527k, int i11, Continuation<? super C146971> continuation) {
            super(2, continuation);
            this.$binding = c37527k;
            this.$tabWidth = i11;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C146971(this.$binding, this.$tabWidth, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C146971) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                ViewGroup.LayoutParams layoutParams = this.$binding.f83353c.getLayoutParams();
                if (layoutParams == null) {
                    layoutParams = new LinearLayoutCompat.LayoutParams(this.$tabWidth, -1);
                }
                layoutParams.width = this.$tabWidth;
                this.$binding.f83353c.setLayoutParams(layoutParams);
                ViewGroup.LayoutParams layoutParams2 = this.$binding.f83354d.getLayoutParams();
                if (layoutParams2 == null) {
                    layoutParams2 = new LinearLayoutCompat.LayoutParams(this.$tabWidth, -1);
                }
                layoutParams2.width = this.$tabWidth;
                this.$binding.f83354d.setLayoutParams(layoutParams2);
                ViewGroup.LayoutParams layoutParams3 = this.$binding.f83355e.getLayoutParams();
                if (layoutParams3 == null) {
                    layoutParams3 = new FrameLayout.LayoutParams(this.$tabWidth, -1);
                }
                layoutParams3.width = this.$tabWidth;
                this.$binding.f83355e.setLayoutParams(layoutParams3);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Web3TabView$adjustTabWidth$1$2(C37527k c37527k, Continuation<? super Web3TabView$adjustTabWidth$1$2> continuation) {
        super(2, continuation);
        this.$binding = c37527k;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new Web3TabView$adjustTabWidth$1$2(this.$binding, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((Web3TabView$adjustTabWidth$1$2) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            int iMo66945e = IWalletService.f54542a.get().mo66945e();
            AbstractC41697j0 abstractC41697j0M94121c = C42911a.m94121c();
            C146971 c146971 = new C146971(this.$binding, iMo66945e, null);
            this.I$0 = iMo66945e;
            this.label = 1;
            if (C41686h.m91049g(abstractC41697j0M94121c, c146971, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
