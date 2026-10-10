package g70;

import android.net.Uri;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.LinearLayout;
import c70.C4886n0;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.user.R$color;
import com.kubi.user.R$string;
import com.kubi.user.utils.n;
import com.kubi.user.utils.s;
import com.kubi.user.utils.u;
import com.kubi.utils.C27017c;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import e70.InterfaceC37089d;
import f00.C37304a;
import g00.InterfaceC37766r;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: g70.e */
/* JADX INFO: compiled from: EuDeleteAccountFlavorImpl.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\b"}, m90084d2 = {"Lcom/kubi/user/flavor/impl/eu/EuDeleteAccountFlavorImpl;", "Lcom/kubi/user/flavor/IDeleteAccountFlavor;", "<init>", "()V", "flavorDeleteAccountTips", "", "binding", "Lcom/kubi/user/databinding/BusercenterViewDeleteAccountBinding;", "UserCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C37835e implements InterfaceC37089d {
    /* JADX INFO: renamed from: e */
    public static final Unit m85401e(u buildSpannableString) {
        Intrinsics.checkNotNullParameter(buildSpannableString, "$this$buildSpannableString");
        buildSpannableString.a(C27017c.f54310a.m66516f(R$string.privacy_policy, new Object[0]), new Function1() { // from class: g70.c
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C37835e.m85402f((s) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: f */
    public static final Unit m85402f(s highLightText) {
        Intrinsics.checkNotNullParameter(highLightText, "$this$highLightText");
        highLightText.a(R$color.primary, new View.OnClickListener() { // from class: g70.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C37835e.m85403g(view);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: g */
    public static final void m85403g(View view) {
        C37304a c37304a = C37304a.f82764a;
        String strDecode = Uri.decode(com.kubi.user.api.site.protocol.b.a.a());
        Intrinsics.checkNotNullExpressionValue(strDecode, "decode(...)");
        InterfaceC37766r.a.m85190a(c37304a, strDecode, null, null, null, null, null, null, 126, null);
    }

    @Override // e70.InterfaceC37089d
    /* JADX INFO: renamed from: a */
    public void mo83018a(@Nullable C4886n0 c4886n0) {
        BaseTextView baseTextView;
        LinearLayout linearLayout;
        LinearLayout linearLayout2;
        LinearLayout linearLayout3;
        LinearLayout linearLayout4;
        LinearLayout linearLayout5;
        if (c4886n0 != null && (linearLayout5 = c4886n0.f5224d) != null) {
            ViewExtKt.m66577h(linearLayout5);
        }
        if (c4886n0 != null && (linearLayout4 = c4886n0.f5225e) != null) {
            ViewExtKt.m66577h(linearLayout4);
        }
        if (c4886n0 != null && (linearLayout3 = c4886n0.f5226f) != null) {
            C27046k.m66685H(linearLayout3);
        }
        if (c4886n0 != null && (linearLayout2 = c4886n0.f5227g) != null) {
            ViewExtKt.m66577h(linearLayout2);
        }
        if (c4886n0 != null && (linearLayout = c4886n0.f5228h) != null) {
            C27046k.m66685H(linearLayout);
        }
        if (c4886n0 == null || (baseTextView = c4886n0.f5230j) == null) {
            return;
        }
        baseTextView.setMovementMethod(LinkMovementMethod.getInstance());
        C27017c c27017c = C27017c.f54310a;
        n.b(baseTextView, c27017c.m66516f(R$string.eu_delete_account1_policytip, c27017c.m66516f(R$string.privacy_policy, new Object[0])), new Function1() { // from class: g70.b
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C37835e.m85401e((u) obj);
            }
        });
    }
}
