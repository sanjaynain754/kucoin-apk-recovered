package p347iu;

import android.net.Uri;
import androidx.webkit.ProxyConfig;
import com.kubi.host.HostManager;
import java.util.List;
import org.jetbrains.annotations.Nullable;
import p694vk.C45590s;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: iu.b */
/* JADX INFO: compiled from: KuCoinPayLinkHockSPI.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u000e\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u0002H\u0000\u001a\u000e\u0010\u0003\u001a\u00020\u0001*\u0004\u0018\u00010\u0002H\u0000\u001a\u000e\u0010\u0004\u001a\u00020\u0001*\u0004\u0018\u00010\u0002H\u0000¨\u0006\u0005"}, m90084d2 = {"isKuCoinPayLink", "", "", "isKuCoinPayHomeLink", "isKuCardHomeLink", "PaymentLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nKuCoinPayLinkHockSPI.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KuCoinPayLinkHockSPI.kt\ncom/kubi/payment/spi/KuCoinPayLinkHockSPIKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,103:1\n1#2:104\n*E\n"})
public final class C40172b {
    /* JADX INFO: renamed from: a */
    public static final boolean m88530a(@Nullable String str) {
        Object objM103844constructorimpl;
        if (str == null || str.length() == 0) {
            return false;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(Uri.parse(str));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m103850isFailureimpl(objM103844constructorimpl)) {
            objM103844constructorimpl = null;
        }
        Uri uri = (Uri) objM103844constructorimpl;
        if (uri == null || !Intrinsics.areEqual(uri.getScheme(), ProxyConfig.MATCH_HTTPS)) {
            return false;
        }
        if (!C45590s.f102687a.m100666Q()) {
            if (!Intrinsics.areEqual("www." + HostManager.a.b(), uri.getHost())) {
                return false;
            }
        }
        List<String> pathSegments = uri.getPathSegments();
        Intrinsics.checkNotNull(pathSegments);
        if (pathSegments.isEmpty()) {
            return false;
        }
        return (pathSegments.size() == 1 && Intrinsics.areEqual(CollectionsKt.first((List) pathSegments), "kucard")) || (pathSegments.size() == 2 && Intrinsics.areEqual(pathSegments.get(1), "kucard"));
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m88531b(@Nullable String str) {
        Object objM103844constructorimpl;
        if (str == null || str.length() == 0) {
            return false;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(Uri.parse(str));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m103850isFailureimpl(objM103844constructorimpl)) {
            objM103844constructorimpl = null;
        }
        Uri uri = (Uri) objM103844constructorimpl;
        if (uri == null || !Intrinsics.areEqual(uri.getScheme(), ProxyConfig.MATCH_HTTPS)) {
            return false;
        }
        if (!C45590s.f102687a.m100666Q()) {
            if (!Intrinsics.areEqual("www." + HostManager.a.b(), uri.getHost())) {
                return false;
            }
        }
        List<String> pathSegments = uri.getPathSegments();
        Intrinsics.checkNotNull(pathSegments);
        if (pathSegments.isEmpty()) {
            return false;
        }
        return (pathSegments.size() == 2 && Intrinsics.areEqual(CollectionsKt.first((List) pathSegments), "pay") && Intrinsics.areEqual(pathSegments.get(1), "user")) || (pathSegments.size() == 3 && Intrinsics.areEqual(pathSegments.get(1), "pay") && Intrinsics.areEqual(pathSegments.get(2), "user"));
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m88532c(@Nullable String str) {
        Object objM103844constructorimpl;
        if (str == null || str.length() == 0) {
            return false;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(Uri.parse(str));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m103850isFailureimpl(objM103844constructorimpl)) {
            objM103844constructorimpl = null;
        }
        Uri uri = (Uri) objM103844constructorimpl;
        if (uri == null || !Intrinsics.areEqual(uri.getScheme(), ProxyConfig.MATCH_HTTPS)) {
            return false;
        }
        if (!C45590s.f102687a.m100666Q()) {
            if (!Intrinsics.areEqual("www." + HostManager.a.b(), uri.getHost())) {
                return false;
            }
        }
        List<String> pathSegments = uri.getPathSegments();
        Intrinsics.checkNotNull(pathSegments);
        if (pathSegments.isEmpty()) {
            return false;
        }
        return Intrinsics.areEqual(CollectionsKt.first((List) pathSegments), "pay") || (pathSegments.size() > 1 && Intrinsics.areEqual(pathSegments.get(1), "pay"));
    }
}
