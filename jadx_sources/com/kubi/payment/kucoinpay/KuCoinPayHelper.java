package com.kubi.payment.kucoinpay;

import android.content.Intent;
import androidx.lifecycle.LifecycleOwnerKt;
import com.kubi.home.common.card.HomeCardViewHolderProxy;
import com.kubi.otc.api.IOtcService;
import com.kubi.payment.channel.data.entities.WhiteListEntity;
import com.kubi.payment.channel.data.source.IChannelRepository;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.site.C24129b;
import com.kubi.sdk.site.SiteVisibleConfigKey;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27041f;
import cy.InterfaceC36555b;
import f00.C37304a;
import g00.InterfaceC37758j;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.regex.Pattern;
import kotlinx.coroutines.C41696j;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p477nt.AbstractC42878k;
import p513ot.C43328a;
import p569qq.C43852m;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: compiled from: KuCoinPayHelper.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0006H\u0002J\u000e\u0010\u000f\u001a\u00020\u0010H\u0086@¢\u0006\u0002\u0010\u0011J*\u0010\u0012\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00062\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00100\u0014R\u001e\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m90084d2 = {"Lcom/kubi/payment/kucoinpay/KuCoinPayHelper;", "", "<init>", "()V", "defaultWhiteList", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "serverWhiteList", "Ljava/util/concurrent/CopyOnWriteArrayList;", "filterByWhiteList", "", "fragment", "Lcom/kubi/sdk/BaseFragment;", "scanCode", "fetchWhiteList", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "checkWhitelistBeforeHandleNonAppInfo", "fallbackHandler", "Lkotlin/Function1;", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nKuCoinPayHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KuCoinPayHelper.kt\ncom/kubi/payment/kucoinpay/KuCoinPayHelper\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,95:1\n1761#2,3:96\n1761#2,3:99\n1563#2:102\n1634#2,3:103\n*S KotlinDebug\n*F\n+ 1 KuCoinPayHelper.kt\ncom/kubi/payment/kucoinpay/KuCoinPayHelper\n*L\n47#1:96,3\n49#1:99,3\n62#1:102\n62#1:103,3\n*E\n"})
public final class KuCoinPayHelper {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final KuCoinPayHelper f39579a = new KuCoinPayHelper();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final ArrayList<String> f39580b = CollectionsKt.arrayListOf("^.*704.*VN.*$", "^.*608.*PH.*$", "https://app\\.dfx\\.swiss/pl/?\\?lightning=.*", "^(000201|pix\\.br\\.com).*");

    /* JADX INFO: renamed from: c */
    @NotNull
    public static CopyOnWriteArrayList<String> f39581c = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: c */
    public static final void m48302c(Function1 function1, int i11, Intent intent) {
        if (i11 == -1) {
            if (C27025c.m66566d(intent != null ? Boolean.valueOf(RouteExKt.m56248g(intent, "data", false)) : null)) {
                return;
            }
        }
        function1.invoke(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: e */
    public final boolean m48305e(BaseFragment baseFragment, String str) {
        try {
            if (!f39581c.isEmpty()) {
                CopyOnWriteArrayList<String> copyOnWriteArrayList = f39581c;
                if (copyOnWriteArrayList != null && copyOnWriteArrayList.isEmpty()) {
                    return false;
                }
                Iterator<T> it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    if (Pattern.compile((String) it.next()).matcher(str).find()) {
                        return true;
                    }
                }
                return false;
            }
            C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(baseFragment), C42911a.m94120b(), null, new KuCoinPayHelper$filterByWhiteList$1(null), 2, null);
            ArrayList<String> arrayList = f39580b;
            if (arrayList != null && arrayList.isEmpty()) {
                return false;
            }
            Iterator<T> it2 = arrayList.iterator();
            while (it2.hasNext()) {
                if (Pattern.compile((String) it2.next()).matcher(str).find()) {
                    return true;
                }
            }
            return false;
        } catch (Exception e11) {
            e11.printStackTrace();
            return false;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m48303b(@NotNull BaseFragment fragment, @NotNull String scanCode, @NotNull final Function1<? super Boolean, Unit> fallbackHandler) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(scanCode, "scanCode");
        Intrinsics.checkNotNullParameter(fallbackHandler, "fallbackHandler");
        if (C24129b.m58030b(SiteVisibleConfigKey.KucoinPay)) {
            boolean zM48305e = m48305e(fragment, scanCode);
            C44128b.m97259c("checkWhitelistBeforeHandleNonAppInfo", "in white list:" + zM48305e + ",code:" + scanCode);
            if (zM48305e) {
                InterfaceC37758j.a.m85161j(C37304a.f82764a, scanCode, IOtcService.Companion.SOURCE_FROM_HOME_PAGE, C43852m.m96602n(HomeCardViewHolderProxy.PAGE_ID, "scan", null, 4, null), null, new InterfaceC36555b() { // from class: com.kubi.payment.kucoinpay.a
                    @Override // cy.InterfaceC36555b
                    /* JADX INFO: renamed from: a */
                    public final void mo4404a(int i11, Intent intent) {
                        KuCoinPayHelper.m48302c(fallbackHandler, i11, intent);
                    }
                }, 8, null);
                return;
            }
        }
        fallbackHandler.invoke(Boolean.FALSE);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    /* JADX INFO: renamed from: d */
    public final Object m48304d(@NotNull Continuation<? super Unit> continuation) {
        KuCoinPayHelper$fetchWhiteList$1 kuCoinPayHelper$fetchWhiteList$1;
        if (continuation instanceof KuCoinPayHelper$fetchWhiteList$1) {
            kuCoinPayHelper$fetchWhiteList$1 = (KuCoinPayHelper$fetchWhiteList$1) continuation;
            int i11 = kuCoinPayHelper$fetchWhiteList$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                kuCoinPayHelper$fetchWhiteList$1.label = i11 - Integer.MIN_VALUE;
            } else {
                kuCoinPayHelper$fetchWhiteList$1 = new KuCoinPayHelper$fetchWhiteList$1(this, continuation);
            }
        } else {
            kuCoinPayHelper$fetchWhiteList$1 = new KuCoinPayHelper$fetchWhiteList$1(this, continuation);
        }
        Object objMo45739A = kuCoinPayHelper$fetchWhiteList$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = kuCoinPayHelper$fetchWhiteList$1.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objMo45739A);
            IChannelRepository iChannelRepositoryM95366d = C43328a.f95644a.m95366d();
            kuCoinPayHelper$fetchWhiteList$1.label = 1;
            objMo45739A = iChannelRepositoryM95366d.mo45739A(kuCoinPayHelper$fetchWhiteList$1);
            if (objMo45739A == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objMo45739A);
        }
        AbstractC42878k abstractC42878k = (AbstractC42878k) objMo45739A;
        if (abstractC42878k instanceof AbstractC42878k.Success) {
            AbstractC42878k.Success success = (AbstractC42878k.Success) abstractC42878k;
            Collection collection = (Collection) success.m94040a();
            if (collection != null && !collection.isEmpty()) {
                CopyOnWriteArrayList<String> copyOnWriteArrayList = f39581c;
                Iterable iterable = (Iterable) success.m94040a();
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(C27041f.m66668h(((WhiteListEntity) it.next()).getRuleContent()));
                }
                copyOnWriteArrayList.addAll(arrayList);
            }
        }
        return Unit.INSTANCE;
    }
}
