package com.kubi.quotefacade.favorites.edit;

import android.content.DialogInterface;
import com.kubi.quotefacade.R$string;
import com.kubi.resources.dialog.AlertDialogFragmentHelper;
import kotlinx.coroutines.AbstractC41697j0;
import kotlinx.coroutines.C41686h;
import o00.C42911a;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: FavEditContainerFragment.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m90084d2 = {"<anonymous>", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.quotefacade.favorites.edit.FavEditContainerFragment$onViewCreated$2$1", m90122f = "FavEditContainerFragment.kt", m90123i = {}, m90124l = {73}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class FavEditContainerFragment$onViewCreated$2$1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ FavEditContainerFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FavEditContainerFragment$onViewCreated$2$1(FavEditContainerFragment favEditContainerFragment, Continuation<? super FavEditContainerFragment$onViewCreated$2$1> continuation) {
        super(1, continuation);
        this.this$0 = favEditContainerFragment;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new FavEditContainerFragment$onViewCreated$2$1(this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super Unit> continuation) {
        return ((FavEditContainerFragment$onViewCreated$2$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: g */
    public static final void m51631g(FavEditContainerFragment favEditContainerFragment, DialogInterface dialogInterface, int i11) {
        favEditContainerFragment.m51620s3();
    }

    /* JADX INFO: renamed from: h */
    public static final void m51632h(FavEditContainerFragment favEditContainerFragment, DialogInterface dialogInterface, int i11) {
        favEditContainerFragment.preformBackPressed();
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
            AbstractC41697j0 abstractC41697j0M94119a = C42911a.m94119a();
            FavEditContainerFragment$onViewCreated$2$1$isChanged$1 favEditContainerFragment$onViewCreated$2$1$isChanged$1 = new FavEditContainerFragment$onViewCreated$2$1$isChanged$1(this.this$0, null);
            this.label = 1;
            obj = C41686h.m91049g(abstractC41697j0M94119a, favEditContainerFragment$onViewCreated$2$1$isChanged$1, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        if (((Boolean) obj).booleanValue()) {
            AlertDialogFragmentHelper alertDialogFragmentHelperM54161R4 = AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54167X4(R$string.dialog_title_text_tip).m54153J4(R$string.market_favorites_edit_not_save_tip).m54161R4(0);
            int i12 = R$string.save_edit;
            final FavEditContainerFragment favEditContainerFragment = this.this$0;
            AlertDialogFragmentHelper alertDialogFragmentHelperM54162S4 = alertDialogFragmentHelperM54161R4.m54162S4(i12, new DialogInterface.OnClickListener() { // from class: com.kubi.quotefacade.favorites.edit.v
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i13) {
                    FavEditContainerFragment$onViewCreated$2$1.m51631g(favEditContainerFragment, dialogInterface, i13);
                }
            });
            int i13 = R$string.cancel;
            final FavEditContainerFragment favEditContainerFragment2 = this.this$0;
            alertDialogFragmentHelperM54162S4.m54159P4(i13, new DialogInterface.OnClickListener() { // from class: com.kubi.quotefacade.favorites.edit.w
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i14) {
                    FavEditContainerFragment$onViewCreated$2$1.m51632h(favEditContainerFragment2, dialogInterface, i14);
                }
            }).m54172c5(this.this$0.getChildFragmentManager());
        } else {
            this.this$0.preformBackPressed();
        }
        return Unit.INSTANCE;
    }
}
