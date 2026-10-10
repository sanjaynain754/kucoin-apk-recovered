package p694vk;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.kubi.app.country.R$drawable;
import com.kubi.kucoin.exception.AppCountryException;
import kotlinx.coroutines.C41713n0;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.InterfaceC41709m0;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43846g;
import p778xy.C46338a;
import p778xy.C46340c;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.AbstractCoroutineContextElement;
import p852kotlin.coroutines.CoroutineContext;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.random.RandomKt;
import p852kotlin.text.StringsKt;
import ro.C44128b;

/* JADX INFO: renamed from: vk.m0 */
/* JADX INFO: compiled from: CountryEx.kt */
/* JADX INFO: loaded from: classes18.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a$\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H\u0000\u001a$\u0010\u0007\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H\u0000\u001a\u001a\u0010\b\u001a\u00020\t2\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H\u0000\u001a\u0018\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u001a\u0016\u0010\u000e\u001a\u00020\u0006*\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0003¨\u0006\u000f"}, m90084d2 = {"coroutineScopeUI", "Lkotlinx/coroutines/CoroutineScope;", "name", "", "onError", "Lkotlin/Function0;", "", "coroutineScopeIO", "coroutineExceptionHandler", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "loadCountryFlagIcon", "imageView", "Landroid/widget/ImageView;", "iconUrl", "loadFlagIcon", "LAppCountry_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nCountryEx.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CountryEx.kt\ncom/kubi/kucoin/CountryExKt\n+ 2 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,74:1\n47#2,4:75\n1#3:79\n*S KotlinDebug\n*F\n+ 1 CountryEx.kt\ncom/kubi/kucoin/CountryExKt\n*L\n31#1:75,4\n*E\n"})
public final class C45583m0 {

    /* JADX INFO: renamed from: vk.m0$a */
    /* JADX INFO: compiled from: CoroutineExceptionHandler.kt */
    @Metadata(m90083d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t¸\u0006\u0000"}, m90084d2 = {"kotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "handleException", "", "context", "Lkotlin/coroutines/CoroutineContext;", "exception", "", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nCoroutineExceptionHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1\n+ 2 CountryEx.kt\ncom/kubi/kucoin/CountryExKt\n+ 3 AppCountryIssue.kt\ncom/kubi/kucoin/exception/AppCountryIssueKt\n*L\n1#1,49:1\n32#2,2:50\n34#2,2:54\n44#3,2:52\n*S KotlinDebug\n*F\n+ 1 CountryEx.kt\ncom/kubi/kucoin/CountryExKt\n*L\n33#1:52,2\n*E\n"})
    public static final class a extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function0 f102675b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(CoroutineExceptionHandler.Companion companion, Function0 function0) {
            super(companion);
            this.f102675b = function0;
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext context, Throwable exception) {
            Function0 function0 = this.f102675b;
            if (function0 != null) {
                function0.invoke();
            }
            C43846g.m96568c(new AppCountryException(exception, "ShareExt", false, null, 8, null), null, 2, null);
            C44128b.m97263g("Share", exception);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public static final CoroutineExceptionHandler m100618a(@Nullable Function0<Unit> function0) {
        return new a(CoroutineExceptionHandler.INSTANCE, function0);
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final InterfaceC41709m0 m100619b(@NotNull String name, @Nullable Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(name, "name");
        return C41713n0.m91125a(new CoroutineName(name).plus(C42911a.m94120b()).plus(m100618a(function0)));
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ InterfaceC41709m0 m100620c(String str, Function0 function0, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = "scope-" + RandomKt.Random(1000).nextInt();
        }
        if ((i11 & 2) != 0) {
            function0 = null;
        }
        return m100619b(str, function0);
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public static final InterfaceC41709m0 m100621d(@NotNull String name, @Nullable Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(name, "name");
        return C41713n0.m91125a(new CoroutineName(name).plus(C42911a.m94121c()).plus(m100618a(function0)));
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ InterfaceC41709m0 m100622e(String str, Function0 function0, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = "scope-" + RandomKt.Random(1000).nextInt();
        }
        if ((i11 & 2) != 0) {
            function0 = null;
        }
        return m100621d(str, function0);
    }

    /* JADX INFO: renamed from: f */
    public static final void m100623f(@Nullable ImageView imageView, @Nullable String str) {
        Object objM103844constructorimpl;
        if (imageView == null) {
            return;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            if (str != null && str.length() != 0 && !StringsKt.endsWith(str, "cn.png", true)) {
                C46340c<Drawable> c46340cMo6634v = C46338a.m102151a(imageView.getContext()).mo6634v(str);
                int i11 = R$drawable.ic_language_16;
                objM103844constructorimpl = Result.m103844constructorimpl(c46340cMo6634v.mo92188b0(i11).mo92208m(i11).m6594E0(imageView));
                if (Result.m103847exceptionOrNullimpl(objM103844constructorimpl) != null) {
                    imageView.setImageResource(R$drawable.ic_language_16);
                    return;
                }
                return;
            }
            imageView.setImageResource(R$drawable.ic_language_16);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
    }
}
