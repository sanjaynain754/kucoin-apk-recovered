package com.kubi.payment.interceptor.route;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.blankj.utilcode.util.C5258a;
import com.kubi.otc.exception.OtcException;
import com.kubi.sdk.site.C24129b;
import com.kubi.sdk.site.SiteVisibleConfigKey;
import com.kubi.user.api.IUserService;
import ht.C38346y;
import il.C38661c;
import java.util.List;
import java.util.ListIterator;
import org.jetbrains.annotations.NotNull;
import p569qq.C43846g;
import p846zx.InterfaceC46935a;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: compiled from: PaymentMethodInterceptor.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\t"}, m90084d2 = {"Lcom/kubi/payment/interceptor/route/PaymentMethodInterceptor;", "Lcom/kubi/kucoin/interceptor/BaseLoginCheckInterceptor;", "<init>", "()V", "intercept", "", "chain", "Lcom/kubi/router/interceptor/IChain;", "Companion", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nPaymentMethodInterceptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentMethodInterceptor.kt\ncom/kubi/payment/interceptor/route/PaymentMethodInterceptor\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 OtcIssue.kt\ncom/kubi/otc/exception/OtcIssueKt\n*L\n1#1,50:1\n543#2,6:51\n44#3,2:57\n*S KotlinDebug\n*F\n+ 1 PaymentMethodInterceptor.kt\ncom/kubi/payment/interceptor/route/PaymentMethodInterceptor\n*L\n35#1:51,6\n40#1:57,2\n*E\n"})
public final class PaymentMethodInterceptor extends C38661c {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final Companion f39569a = new Companion(null);

    /* JADX INFO: compiled from: PaymentMethodInterceptor.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/payment/interceptor/route/PaymentMethodInterceptor$Companion;", "", "<init>", "()V", "TAG", "", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    @Override // il.C38661c, p846zx.InterfaceC46936b
    /* JADX INFO: renamed from: b */
    public boolean mo4304b(@NotNull InterfaceC46935a chain) {
        Fragment fragmentPrevious;
        Intrinsics.checkNotNullParameter(chain, "chain");
        if (!IUserService.a.get().c()) {
            return super.mo4304b(chain);
        }
        Activity activityM6125h = C5258a.m6125h();
        if (activityM6125h instanceof FragmentActivity) {
            List<Fragment> fragments = ((FragmentActivity) activityM6125h).getSupportFragmentManager().getFragments();
            Intrinsics.checkNotNullExpressionValue(fragments, "getFragments(...)");
            ListIterator<Fragment> listIterator = fragments.listIterator(fragments.size());
            do {
                if (!listIterator.hasPrevious()) {
                    fragmentPrevious = null;
                    break;
                }
                fragmentPrevious = listIterator.previous();
            } while (!fragmentPrevious.isVisible());
            Fragment fragment = fragmentPrevious;
            if (fragment != null) {
                if (C24129b.m58030b(SiteVisibleConfigKey.P2P)) {
                    C38346y.m86509T(fragment);
                } else {
                    C43846g.m96568c(new OtcException(new Exception("P2P payment method list is not available"), "PaymentMethodInterceptor", false, null, 8, null), null, 2, null);
                }
                C44128b.m97259c("PaymentMethodInterceptor", "jump to payment method page via toPayMethodPage");
                return true;
            }
        }
        C44128b.m97259c("PaymentMethodInterceptor", "no visible fragment found, cannot open payment method page");
        return true;
    }
}
