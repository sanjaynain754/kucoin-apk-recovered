package com.kubi.assets.interceptor;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.credentials.provider.CredentialEntry;
import androidx.fragment.app.FragmentActivity;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.assets.exception.AssetsMessage;
import com.kubi.assets.service.AssetsDepend;
import com.kubi.sdk.flutter.KCFlutterRouteManager;
import com.kubi.utils.extensions.C27041f;
import cy.InterfaceC36555b;
import il.C38661c;
import java.util.Map;
import o00.C42917g;
import org.jetbrains.annotations.NotNull;
import p481ny.C42899b;
import p569qq.C43846g;
import p846zx.InterfaceC46935a;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: compiled from: MultiAddFundsInterceptor.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016JH\u0010\b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000bH\u0002¨\u0006\u0013"}, m90084d2 = {"Lcom/kubi/assets/interceptor/MultiAddFundsInterceptor;", "Lcom/kubi/kucoin/interceptor/BaseLoginCheckInterceptor;", "<init>", "()V", "intercept", "", "chain", "Lcom/kubi/router/interceptor/IChain;", "openFlutterDialog", "", FirebaseAnalytics.Param.CURRENCY, "", "sceneCode", "defaultAccount", "defaultAccountAmount", "fiatMoney", "toAccountTag", "spm", "Companion", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nMultiAddFundsInterceptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultiAddFundsInterceptor.kt\ncom/kubi/assets/interceptor/MultiAddFundsInterceptor\n+ 2 AssetsIssue.kt\ncom/kubi/assets/exception/AssetsIssueKt\n+ 3 KThreadPoolEx.kt\ncom/kubi/sdk/thread/KThreadPoolExKt\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,107:1\n48#2,2:108\n19#3,2:110\n216#4,2:112\n*S KotlinDebug\n*F\n+ 1 MultiAddFundsInterceptor.kt\ncom/kubi/assets/interceptor/MultiAddFundsInterceptor\n*L\n44#1:108,2\n55#1:110,2\n91#1:112,2\n*E\n"})
public final class MultiAddFundsInterceptor extends C38661c {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final Companion f17771a = new Companion(null);

    /* JADX INFO: compiled from: MultiAddFundsInterceptor.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/assets/interceptor/MultiAddFundsInterceptor$Companion;", "", "<init>", "()V", "TAG", "", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: f */
    public static final Unit m17406f(final InterfaceC46935a interfaceC46935a, final MultiAddFundsInterceptor multiAddFundsInterceptor, FragmentActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Bundle bundle = interfaceC46935a.getPostcard().getBundle();
        final String strM66668h = C27041f.m66668h(bundle.getString(FirebaseAnalytics.Param.CURRENCY));
        final String strM66668h2 = C27041f.m66668h(bundle.getString("sceneCode"));
        final String strM66668h3 = C27041f.m66668h(bundle.getString("defaultAccount"));
        final String strM66668h4 = C27041f.m66668h(bundle.getString("defaultAccountAmount"));
        final String strM66668h5 = C27041f.m66668h(bundle.getString("fiatMoney"));
        final String strM66668h6 = C27041f.m66668h(bundle.getString("toAccountTag"));
        final String strM66668h7 = C27041f.m66668h(bundle.getString("spm"));
        if (strM66668h.length() != 0 && strM66668h2.length() != 0 && strM66668h3.length() != 0 && strM66668h5.length() != 0) {
            C42917g.m94139e().execute(new Runnable() { // from class: com.kubi.assets.interceptor.p
                @Override // java.lang.Runnable
                public final void run() {
                    MultiAddFundsInterceptor.m17407g(this.f17816b, interfaceC46935a, strM66668h, strM66668h2, strM66668h3, strM66668h4, strM66668h5, strM66668h6, strM66668h7);
                }
            });
            return Unit.INSTANCE;
        }
        String str = "parameter error: " + strM66668h + ", " + strM66668h2 + ", " + strM66668h3 + ", " + strM66668h5 + ", " + strM66668h6 + ", " + strM66668h4 + " .";
        C43846g.m96568c(new AssetsMessage(str, "MultiAddFundsInterceptor", false, 4, null), null, 2, null);
        C44128b.m97261e("MultiAddFundsInterceptor", str);
        InterfaceC36555b interfaceC36555bM4046i = interfaceC46935a.getPostcard().m4046i();
        if (interfaceC36555bM4046i != null) {
            Intent intent = new Intent();
            intent.putExtra("success", false);
            Unit unit = Unit.INSTANCE;
            interfaceC36555bM4046i.mo4404a(-1, intent);
        }
        return Unit.INSTANCE;
    }

    @Override // il.C38661c, p846zx.InterfaceC46936b
    /* JADX INFO: renamed from: b */
    public boolean mo4304b(@NotNull final InterfaceC46935a chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        if (!AssetsDepend.f18689a.m19189j().c()) {
            return super.mo4304b(chain);
        }
        C42899b.m94073c(new Function1() { // from class: com.kubi.assets.interceptor.o
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MultiAddFundsInterceptor.m17406f(chain, this, (FragmentActivity) obj);
            }
        });
        return true;
    }

    /* JADX INFO: renamed from: h */
    public final void m17409h(final InterfaceC46935a interfaceC46935a, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        Uri.Builder builderAppendQueryParameter = new Uri.Builder().path("multi_add_funds").appendQueryParameter("isTransparent", CredentialEntry.TRUE_STRING).appendQueryParameter(FirebaseAnalytics.Param.CURRENCY, str).appendQueryParameter("sceneCode", str2).appendQueryParameter("defaultAccount", str3).appendQueryParameter("defaultAccountAmount", str4).appendQueryParameter("fiatMoney", str5).appendQueryParameter("spm", str7);
        if (str6.length() > 0) {
            builderAppendQueryParameter.appendQueryParameter("toAccountTag", str6);
        }
        String string = builderAppendQueryParameter.build().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        KCFlutterRouteManager.f46704a.m56851l(string, new Function1() { // from class: com.kubi.assets.interceptor.q
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MultiAddFundsInterceptor.m17408i(interfaceC46935a, (Map) obj);
            }
        });
    }

    /* JADX INFO: renamed from: g */
    public static final void m17407g(MultiAddFundsInterceptor multiAddFundsInterceptor, InterfaceC46935a interfaceC46935a, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        multiAddFundsInterceptor.m17409h(interfaceC46935a, str, str2, str3, str4, str5, str6, str7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final Unit m17408i(InterfaceC46935a interfaceC46935a, Map map) {
        InterfaceC36555b interfaceC36555bM4046i = interfaceC46935a.getPostcard().m4046i();
        if (interfaceC36555bM4046i != null) {
            Intent intent = new Intent();
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    Object value = entry.getValue();
                    if (value instanceof String) {
                        intent.putExtra(str, (String) value);
                    } else if (value instanceof Integer) {
                        intent.putExtra(str, ((Number) value).intValue());
                    } else if (value instanceof Long) {
                        intent.putExtra(str, ((Number) value).longValue());
                    } else if (value instanceof Double) {
                        intent.putExtra(str, ((Number) value).doubleValue());
                    } else if (value instanceof Boolean) {
                        intent.putExtra(str, ((Boolean) value).booleanValue());
                    } else if (value instanceof Float) {
                        intent.putExtra(str, ((Number) value).floatValue());
                    } else {
                        intent.putExtra(str, value.toString());
                    }
                }
            }
            Unit unit = Unit.INSTANCE;
            interfaceC36555bM4046i.mo4404a(0, intent);
        }
        return Unit.INSTANCE;
    }
}
