package com.kubi.quotefacade.favorites;

import android.net.Uri;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.kubi.quotefacade.helper.QuoteBusinessConfigHelp;
import com.kubi.router.core.Router;
import java.util.ArrayList;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: QuoteFavoriteFragment.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.quotefacade.favorites.QuoteFavoriteFragment$initViewPager$2$1$1$1", m90122f = "QuoteFavoriteFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nQuoteFavoriteFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QuoteFavoriteFragment.kt\ncom/kubi/quotefacade/favorites/QuoteFavoriteFragment$initViewPager$2$1$1$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,469:1\n1#2:470\n*E\n"})
public final class QuoteFavoriteFragment$initViewPager$2$1$1$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ QuoteFavoriteFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QuoteFavoriteFragment$initViewPager$2$1$1$1(QuoteFavoriteFragment quoteFavoriteFragment, Continuation<? super QuoteFavoriteFragment$initViewPager$2$1$1$1> continuation) {
        super(2, continuation);
        this.this$0 = quoteFavoriteFragment;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new QuoteFavoriteFragment$initViewPager$2$1$1$1(this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((QuoteFavoriteFragment$initViewPager$2$1$1$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        String strM51380e4;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            String strM51845i = QuoteBusinessConfigHelp.f41933a.m51845i();
            ArrayList arrayList = this.this$0.f41695e0;
            int i11 = this.this$0.f41692b0;
            if (i11 >= 0 && i11 < arrayList.size()) {
                obj2 = arrayList.get(i11);
            } else {
                obj2 = TtmlNode.COMBINE_ALL;
            }
            String str = (String) obj2;
            if (Intrinsics.areEqual(str, "alpha")) {
                strM51380e4 = this.this$0.m51377b4();
                if (strM51380e4 == null) {
                    strM51380e4 = "highlights";
                }
            } else {
                strM51380e4 = this.this$0.m51380e4(str);
            }
            String str2 = "EditFavoritesPage?initialTab=" + strM51380e4 + "&excludes=" + Uri.encode(strM51845i);
            Router.f46192a.m56184f("/krn/router?biz=opportunity&entry=main&component=kucoin_opportunity_rn&disableAddHome=1&route=" + str2).m4048k();
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
