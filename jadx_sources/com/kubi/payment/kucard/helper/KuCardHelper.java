package com.kubi.payment.kucard.helper;

import android.content.DialogInterface;
import androidx.fragment.app.FragmentManager;
import com.kubi.otc.R$mipmap;
import com.kubi.otc.R$string;
import com.kubi.p110rn.modules.BridgeParamKeyKt;
import com.kubi.payment.kucard.data.entities.KuCardEntranceConfig;
import com.kubi.payment.kucard.data.source.IKuCardRepository;
import com.kubi.payment.util.PaymentStorageId;
import com.kubi.resources.dialog.AlertDialogFragmentHelper;
import com.kubi.router.core.Router;
import com.kubi.utils.extensions.C27041f;
import f00.C37304a;
import g00.InterfaceC37766r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p211du.C36960a;
import p477nt.AbstractC42878k;
import p569qq.C43852m;
import p658ub.C45148b;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.TuplesKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.jvm.internal.Intrinsics;
import ro.C44128b;
import y70.C46392a;

/* JADX INFO: compiled from: KuCardHelper.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u000b\u001a\u00020\f2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0007J\u001a\u0010\r\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0086@¢\u0006\u0002\u0010\u0010J\u0006\u0010\u0011\u001a\u00020\u000fJ$\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0005J\u0006\u0010\u0017\u001a\u00020\u000fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n \b*\u0004\u0018\u00010\u00050\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m90084d2 = {"Lcom/kubi/payment/kucard/helper/KuCardHelper;", "", "<init>", "()V", "SOURCE_P2P", "", "SOURCE_WITHDRAW", "TAG", "kotlin.jvm.PlatformType", "kuCardEntranceConfig", "Lcom/kubi/payment/kucard/data/entities/KuCardEntranceConfig;", "setKuCardEntranceConfig", "", "loadKuCardEntranceConfig", "forceRefresh", "", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "launchKuCard", "showGuideDialog", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", BridgeParamKeyKt.SHARE_KEY_LINKURL, "source", "needShowGuide", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class KuCardHelper {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final KuCardHelper f39574a;

    /* JADX INFO: renamed from: b */
    public static final String f39575b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public static KuCardEntranceConfig f39576c;

    static {
        KuCardHelper kuCardHelper = new KuCardHelper();
        f39574a = kuCardHelper;
        f39575b = kuCardHelper.getClass().getSimpleName();
    }

    /* JADX INFO: renamed from: g */
    public static final void m48295g(String str, String str2, DialogInterface dialogInterface, int i11) {
        Router.f46192a.m56184f(str).m4048k();
        C43852m.m96590b("kucardPromotion", "acceptOffer", "1", TuplesKt.m90091to("block_source", C27041f.m66668h(str2)));
    }

    /* JADX INFO: renamed from: h */
    public static final void m48296h(DialogInterface dialogInterface, int i11) {
        C46392a.m102328k(PaymentStorageId.f40364a.m49835m(), false);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m48297c() {
        KuCardEntranceConfig kuCardEntranceConfig = f39576c;
        if (kuCardEntranceConfig == null) {
            return false;
        }
        if (!C45148b.m99792b(kuCardEntranceConfig.getHasEntrance())) {
            C44128b.m97266j(f39575b, "launchKuCard hasEntrance:false.");
            return false;
        }
        String entrancePath = kuCardEntranceConfig.getEntrancePath();
        if (entrancePath == null || entrancePath.length() == 0) {
            C44128b.m97266j(f39575b, "launchKuCard entrancePath is null or empty.");
            return false;
        }
        InterfaceC37766r.a.m85190a(C37304a.f82764a, kuCardEntranceConfig.getEntrancePath(), null, null, null, null, null, null, 126, null);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    /* JADX INFO: renamed from: d */
    public final Object m48298d(boolean z11, @NotNull Continuation<? super KuCardEntranceConfig> continuation) {
        KuCardHelper$loadKuCardEntranceConfig$1 kuCardHelper$loadKuCardEntranceConfig$1;
        if (continuation instanceof KuCardHelper$loadKuCardEntranceConfig$1) {
            kuCardHelper$loadKuCardEntranceConfig$1 = (KuCardHelper$loadKuCardEntranceConfig$1) continuation;
            int i11 = kuCardHelper$loadKuCardEntranceConfig$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                kuCardHelper$loadKuCardEntranceConfig$1.label = i11 - Integer.MIN_VALUE;
            } else {
                kuCardHelper$loadKuCardEntranceConfig$1 = new KuCardHelper$loadKuCardEntranceConfig$1(this, continuation);
            }
        } else {
            kuCardHelper$loadKuCardEntranceConfig$1 = new KuCardHelper$loadKuCardEntranceConfig$1(this, continuation);
        }
        Object objMo48289a = kuCardHelper$loadKuCardEntranceConfig$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = kuCardHelper$loadKuCardEntranceConfig$1.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objMo48289a);
            if (z11 || f39576c == null) {
                IKuCardRepository iKuCardRepositoryM82777c = C36960a.f82075a.m82777c();
                kuCardHelper$loadKuCardEntranceConfig$1.Z$0 = z11;
                kuCardHelper$loadKuCardEntranceConfig$1.label = 1;
                objMo48289a = iKuCardRepositoryM82777c.mo48289a(kuCardHelper$loadKuCardEntranceConfig$1);
                if (objMo48289a == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return f39576c;
        }
        if (i12 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(objMo48289a);
        AbstractC42878k abstractC42878k = (AbstractC42878k) objMo48289a;
        if (abstractC42878k instanceof AbstractC42878k.Success) {
            f39576c = (KuCardEntranceConfig) ((AbstractC42878k.Success) abstractC42878k).m94040a();
        } else {
            C44128b.m97261e(f39575b, "loadKuCardEntranceConfig failed.");
        }
        return f39576c;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m48299e() {
        return C46392a.m102322d(PaymentStorageId.f40364a.m49835m(), true);
    }

    /* JADX INFO: renamed from: f */
    public final void m48300f(@NotNull FragmentManager fragmentManager, @Nullable final String str, @Nullable final String str2) {
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        if (str == null) {
            str = "";
        }
        if (str.length() != 0 && m48299e()) {
            AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54171b5(R$mipmap.payment_guide_kucard).m54167X4(R$string.payment_kucard_guide_title).m54153J4(R$string.payment_kucard_guide_content).m54162S4(R$string.payment_accept_offer, new DialogInterface.OnClickListener() { // from class: com.kubi.payment.kucard.helper.a
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i11) {
                    KuCardHelper.m48295g(str, str2, dialogInterface, i11);
                }
            }).m54159P4(R$string.maybe_later, new DialogInterface.OnClickListener() { // from class: com.kubi.payment.kucard.helper.b
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i11) {
                    KuCardHelper.m48296h(dialogInterface, i11);
                }
            }).m54172c5(fragmentManager);
        }
    }
}
